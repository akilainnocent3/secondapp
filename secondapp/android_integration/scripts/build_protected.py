#!/usr/bin/env python3
"""Build the native account integration on a copy; preserve original resources/media DEX."""
import argparse, hashlib, json, os, re, shutil, subprocess, zipfile
from pathlib import Path
import xml.etree.ElementTree as ET
from build_split_baseline import ROOT, NAMES, digest, normalize, run, signer, payload

ANDROID = '{http://schemas.android.com/apk/res/android}'
ET.register_namespace('android', ANDROID[1:-1])
GATE = 'Lorg/soccerarena/auth/Gate;'

def replace_method(path, name, body):
    text = path.read_text()
    pattern = r'(^\.method [^\n]* ' + re.escape(name) + r'\([^\n]*\n).*?^\.end method'
    text, count = re.subn(pattern, lambda m: m[1] + '    .locals 2\n' + body + '\n.end method', text, flags=re.M|re.S)
    if count != 1: raise ValueError(f'Expected one {name} in {path}: {count}')
    path.write_text(text)

def instrument(path):
    text = path.read_text()
    cls = re.search(r'^\.class .* (L[^;]+;)', text, re.M)[1]
    base = re.search(r'^\.super (L[^;]+;)', text, re.M)[1]
    text = text.replace('# direct methods', '.field private arenaInitialized:Z\n\n# direct methods', 1)
    if '.field private arenaInitialized:Z' not in text:
        text = text.replace('.super '+base, '.super '+base+'\n.field private arenaInitialized:Z',1)
    for name, args in [('onCreate','Landroid/os/Bundle;'),('onStart',''),('onResume',''),('onPause',''),('onStop',''),('onDestroy',''),('onNewIntent','Landroid/content/Intent;'),('onSaveInstanceState','Landroid/os/Bundle;')]:
        pattern = r'(^\.method )(?:public|protected)([^\n]* )' + name + r'\(' + re.escape(args) + r'\)V$'
        text, count = re.subn(pattern, lambda m: m[1]+'public'+m[2]+'arenaOriginal_'+name+'('+args+')V', text, flags=re.M)
        if count > 1: raise ValueError(name)
        regs = 'p0, p1' if args else 'p0'
        original = f'invoke-virtual {{{regs}}}, {cls}->arenaOriginal_{name}({args})V' if count else f'invoke-super {{{regs}}}, {base}->{name}({args})V'
        head=f'\n.method public {name}({args})V\n    .locals 1\n'
        if name == 'onCreate':
            body=f'''    invoke-static {{p0}}, {GATE}->enter(Landroid/app/Activity;)Z
    move-result v0
    if-eqz v0, :arena_denied
    const/4 v0, 0x1
    iput-boolean v0, p0, {cls}->arenaInitialized:Z
    {original}
    return-void
    :arena_denied
    invoke-super {{p0, p1}}, {base}->onCreate(Landroid/os/Bundle;)V
    invoke-virtual {{p0}}, Landroid/app/Activity;->finish()V
    return-void
'''
        else:
            guard = f'''    invoke-static {{p0}}, {GATE}->enter(Landroid/app/Activity;)Z
    move-result v0
    if-eqz v0, :arena_denied
''' if name in ('onStart','onResume','onNewIntent') else ''
            # On denied resume/start, call superclass to satisfy Android lifecycle, then finish.
            finish = '    invoke-virtual {p0}, Landroid/app/Activity;->finish()V\n' if name in ('onStart','onResume','onNewIntent') else ''
            body=f'''    iget-boolean v0, p0, {cls}->arenaInitialized:Z
    if-eqz v0, :arena_denied
{guard}    {original}
    return-void
    :arena_denied
    invoke-super {{{regs}}}, {base}->{name}({args})V
{finish}    return-void
'''
        text += head+body+'.end method\n'
    path.write_text(text)

def main():
    p=argparse.ArgumentParser(); p.add_argument('--out', type=Path, required=True); args=p.parse_args()
    out=args.out.resolve(); out.mkdir(parents=True, exist_ok=False)
    work=out/'work'; work.mkdir(); logs=out/'logs'; logs.mkdir(); dest=out/'apks'; dest.mkdir()
    sdk=Path('/tmp/soccerarena-android-sdk'); bt=sdk/'build-tools/36.0.0'; jar=Path('/tmp/soccerarena-apktool.jar')
    baseline=ROOT/'android_integration/work/baseline'
    decoded=work/'decoded'; decoded.mkdir()
    print('Preparing isolated manifest and application DEX...',flush=True)
    # Build just classes7 and manifest; retain all original binary resource entries in final assembly.
    for name in ('res','smali_classes7'):
        shutil.copytree(baseline/name, decoded/name)
    shutil.copy2(baseline/'apktool.yml', decoded/'apktool.yml')
    shutil.copy2(baseline/'AndroidManifest.xml',decoded/'AndroidManifest.xml')
    smali=decoded/'smali_classes7'; report={'changes': [], 'runtime': 'Not run for integrated build; user confirmed baseline launch/channels/video/audio.'}
    inventory=json.loads((ROOT/'docs/split-baseline-inventory.json').read_text())
    archive=ROOT/inventory['archive']
    if digest(archive)!=inventory['sha256']: raise ValueError('Input hash mismatch')
    original=work/'original'; original.mkdir()
    with zipfile.ZipFile(archive) as z:
        for name in NAMES: (original/name).write_bytes(z.read(name))
    with zipfile.ZipFile(original/'base.apk') as z:
        # Apktool needs original other DEX files for a complete intermediate APK.
        for name in z.namelist():
            if re.fullmatch(r'classes\d*\.dex',name) and name!='classes7.dex': (decoded/name).write_bytes(z.read(name))
    app=smali/'com/sports/live/football/tv/MyApp.smali'
    replace_method(app,'onCreate',f'''    invoke-super {{p0}}, Landroid/app/Application;->onCreate()V
    invoke-static {{p0}}, {GATE}->init(Landroid/app/Application;)V
    sget-object v0, Lcp/a;->a:Lcp/a$a;
    invoke-virtual {{v0, p0}}, Lcp/a$a;->b(Landroid/content/Context;)V
    return-void''')
    # Suppress ad configuration and ad-only dispatch. Preserve continuation exactly once.
    replace_method(smali/'com/sports/live/football/tv/models/DataModel.smali','getApp_ads','    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;\n    move-result-object v0\n    return-object v0')
    config=smali/'to/c.smali'
    replace_method(config,'isPrivateDnsSetup','    const/4 v0, 0x0\n    return v0')
    replace_method(config,'getRemoveAds','    const/4 v0, 0x1\n    return v0')
    for name in ('getLocation1Provider','getLocation2BottomProvider','getLocation2TopPermanentProvider','getLocation2TopProvider','getLocationBeforeProvider','getMiddleAdProvider','getMoreAdProvider','getNativeAdProvider','getTapPositionProvider'):
        replace_method(config,name,'    const-string v0, ""\n    return-object v0')
    manager=smali/'bp/j.smali'
    for name in ('A','C','G','J','L','N','O','P','S','T','U','V','W','X','Y','Z','n0','o0','y'):
        replace_method(manager,name,'    return-void')
    continuation='''    sget-object v0, Lbp/j;->d:Lso/a;
    if-eqz v0, :done
    invoke-interface {v0}, Lso/a;->N()V
    :done
    return-void'''
    for name in ('e0','f0','g0','h0','i0','j0','k0','l0','m0'): replace_method(manager,name,continuation)
    op=smali/'com/sports/live/football/tv/adsData/AppOpenManager$a.smali'
    replace_method(op,'f','    return-void')
    replace_method(op,'i','    invoke-interface {p2}, Lcom/sports/live/football/tv/adsData/AppOpenManager$b;->a()V\n    return-void')
    # Keep the original billing cache irrelevant to ad display without granting SoccerArena entitlement.
    c=smali/'wn/c.smali'; c.write_text(c.read_text().replace('.field public static a:Z = false','.field public static a:Z = true'))
    h=smali/'wn/h.smali'; h.write_text(re.sub(r'^\s*sput-boolean [^\n]*Lwn/c;->a:Z','',h.read_text(),flags=re.M))
    manifest=ET.parse(decoded/'AndroidManifest.xml'); application=manifest.getroot().find('application')
    application.set(ANDROID+'label','SoccerArena'); application.set(ANDROID+'allowBackup','false')
    protected=[]
    for element in application.findall('activity'):
        name=element.get(ANDROID+'name','')
        if name.startswith('com.sports.live.football.tv.ui.'):
            if name.endswith('.SubscriptionScreen'):
                # Keep existing navigation references, replace the destination implementation.
                path=smali/(name.replace('.','/')+'.smali')
                path.write_text(f'''.class public L{name.replace('.','/')};
.super Landroid/app/Activity;
.method public constructor <init>()V
    .locals 0
    invoke-direct {{p0}}, Landroid/app/Activity;-><init>()V
    return-void
.end method
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    invoke-super {{p0, p1}}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
    const/4 v0, 0x0
    invoke-static {{p0, v0}}, {GATE}->openAccount(Landroid/app/Activity;Z)V
    invoke-virtual {{p0}}, Landroid/app/Activity;->finish()V
    return-void
.end method
''')
            else:
                instrument(smali/(name.replace('.','/')+'.smali')); protected.append(name)
            if name.endswith('.ExpendedActivity'): element.set(ANDROID+'exported','false')
            # Launcher stays on original activities; their first instruction gates initialization.
    ET.SubElement(application,'activity',{ANDROID+'name':'org.soccerarena.auth.AccountActivity',ANDROID+'exported':'false',ANDROID+'theme':'@android:style/Theme.Material.NoActionBar',ANDROID+'windowSoftInputMode':'adjustResize'})
    ad_prefixes=('com.google.android.gms.ads.','com.startapp.','com.yandex.mobile.ads.','com.chartboost.','com.unity3d.ads.','com.unity3d.services.ads.','com.inmobi.','com.applovin.','com.facebook.ads.','com.vungle.','com.ironsource.','com.cleveradssolutions.','sg.bigo.ads.')
    disabled=[]
    for element in application:
        name=element.get(ANDROID+'name','')
        if element.tag in ('provider','service','receiver','activity') and name.startswith(ad_prefixes):
            element.set(ANDROID+'enabled','false'); disabled.append(name)
        if element.tag=='provider':
            for meta in list(element):
                if meta.get(ANDROID+'name','').startswith('com.unity3d.services.core.configuration.AdsSdkInitializer'): element.remove(meta)
    manifest.write(decoded/'AndroidManifest.xml',encoding='utf-8',xml_declaration=True)
    report.update(protected_activities=protected, disabled_ad_components=disabled)
    print('Compiling native authentication...',flush=True)
    classes=work/'classes'; classes.mkdir(); dex=work/'native-dex'; dex.mkdir()
    sources=list((ROOT/'android_integration/native').rglob('*.java'))
    run(['javac','--release','8','-cp',sdk/'platforms/android-36/android.jar','-d',classes,*sources],logs/'javac.txt')
    run([bt/'d8','--release','--min-api','23','--lib',sdk/'platforms/android-36/android.jar','--output',dex,*classes.rglob('*.class')],logs/'d8.txt')
    print('Assembling patched application DEX and manifest...',flush=True)
    compiled=work/'compiled.apk'
    run(['java','-Xmx3g','-jar',jar,'b','-p','/tmp/soccerarena-apktool-framework',decoded,'-o',compiled],logs/'apktool.txt')
    raw=work/'base.raw.apk'
    with zipfile.ZipFile(original/'base.apk') as src, zipfile.ZipFile(compiled) as patches, zipfile.ZipFile(raw,'w') as dst:
        for info in src.infolist():
            data=patches.read(info.filename) if info.filename in ('AndroidManifest.xml','classes7.dex') else src.read(info)
            dst.writestr(info,data)
        dst.writestr('classes10.dex',(dex/'classes.dex').read_bytes(),compress_type=zipfile.ZIP_STORED)
    # A private release identity, separate from the publicly-passworded baseline test key.
    private=ROOT/'android_integration/private'; private.mkdir(mode=0o700,exist_ok=True)
    key=private/'soccerarena-release.jks'; secret=private/'signing-password'
    if not key.exists():
        import secrets
        secret.write_text(secrets.token_urlsafe(36)); secret.chmod(0o600)
        os.environ['ARENA_RELEASE_PASSWORD']=secret.read_text()
        run(['keytool','-genkeypair','-keystore',key,'-storepass:env','ARENA_RELEASE_PASSWORD','-keypass:env','ARENA_RELEASE_PASSWORD','-alias','soccerarena','-keyalg','RSA','-keysize','3072','-validity','10000','-dname','CN=SoccerArena','-noprompt'],logs/'key-generation.txt')
        key.chmod(0o600)
    os.environ['ARENA_RELEASE_PASSWORD']=secret.read_text()
    report['apks']=[]
    print('Aligning and signing all four APKs...',flush=True)
    for name in NAMES:
        canonical=work/(name+'.canonical'); aligned=work/(name+'.aligned')
        normalize(raw if name=='base.apk' else original/name,canonical)
        run([bt/'zipalign','-P','16','4',canonical,aligned])
        run([bt/'apksigner','sign','--ks',key,'--ks-key-alias','soccerarena','--ks-pass','env:ARENA_RELEASE_PASSWORD','--key-pass','env:ARENA_RELEASE_PASSWORD','--v4-signing-enabled','false','--out',dest/name,aligned],logs/(name+'.sign.txt'))
        cert=signer(bt/'apksigner',dest/name,logs/(name+'.verify.txt'))
        run([bt/'zipalign','-c','-P','16','4',dest/name])
        before=payload(original/name); after=payload(dest/name)
        changed=sorted(k for k in before.keys()|after.keys() if before.get(k)!=after.get(k))
        expected=['AndroidManifest.xml','classes10.dex','classes7.dex'] if name=='base.apk' else []
        if changed!=expected: raise RuntimeError(f'Unexpected payload changes {name}: {changed}')
        report['apks'].append({'name':name,'sha256':digest(dest/name),'certificate':cert,'changed_entries':changed})
    if len({a['certificate'] for a in report['apks']})!=1: raise RuntimeError('Split signing mismatch')
    (dest/'SHA256SUMS').write_text(''.join(a['sha256']+'  '+a['name']+'\n' for a in report['apks']))
    (dest/'INSTALL.txt').write_text('SoccerArena Android ARM64\n\nThis package has a new private release signature. Uninstall the earlier rebuilt baseline first; this removes its local favorites/settings.\nExtract this ZIP. In SAI select all four APK files together and install. Open SoccerArena, create an account or sign in.\nSeven-day trial begins at first successful login. Account button opens renewal/support, payment history, logout and account deletion.\nRequires internet access for server verification. Contact support for manual renewal.\nDo not mix these APKs with the baseline or original APKs.\n\nBuild and signatures verified. Integrated phone runtime has not been verified. Ad SDK paths are disabled; ads embedded in upstream video are outside this patch.\n')
    (out/'build-report.json').write_text(json.dumps(report,indent=2)+'\n')
    bundle=out/'SoccerArena-arm64.zip'
    with zipfile.ZipFile(bundle,'w',zipfile.ZIP_DEFLATED) as z:
        for f in sorted(dest.iterdir()): z.write(f,f.name)
    print(f'Created {bundle}\nSHA256 {digest(bundle)}',flush=True)

if __name__=='__main__': main()
