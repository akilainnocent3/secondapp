package defpackage;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPlugSeon;

/* JADX INFO: loaded from: classes4.dex */
public final class ad1 implements uby<ktb> {
    public static final ad1 a = new ad1();
    public static final hjh b = hjh.a("sdkVersion");
    public static final hjh c = hjh.a("gmpAppId");
    public static final hjh d = hjh.a("platform");
    public static final hjh e = hjh.a("installationUuid");
    public static final hjh f = hjh.a("firebaseInstallationId");
    public static final hjh g = hjh.a("firebaseAuthenticationToken");
    public static final hjh h = hjh.a("appQualitySessionId");
    public static final hjh i = hjh.a("buildVersion");
    public static final hjh j = hjh.a("displayVersion");
    public static final hjh k = hjh.a(JsPlugSeon.KEY_SESSION);
    public static final hjh l = hjh.a("ndkPayload");
    public static final hjh m = hjh.a("appExitInfo");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb ktbVar = (ktb) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, ktbVar.k());
        vbyVar2.a(c, ktbVar.g());
        vbyVar2.e(d, ktbVar.j());
        vbyVar2.a(e, ktbVar.h());
        vbyVar2.a(f, ktbVar.f());
        vbyVar2.a(g, ktbVar.e());
        vbyVar2.a(h, ktbVar.b());
        vbyVar2.a(i, ktbVar.c());
        vbyVar2.a(j, ktbVar.d());
        vbyVar2.a(k, ktbVar.l());
        vbyVar2.a(l, ktbVar.i());
        vbyVar2.a(m, ktbVar.a());
    }
}
