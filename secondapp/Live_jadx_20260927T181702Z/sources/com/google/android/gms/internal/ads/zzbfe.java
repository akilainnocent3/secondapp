package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@zq.j
public final class zzbfe extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzbev zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzbfe() {
        zzbev zzbevVar = new zzbev();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzbevVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbjv.zzd.zze()).intValue();
        this.zzg = ((Long) zzbjv.zza.zze()).intValue();
        this.zzh = ((Long) zzbjv.zze.zze()).intValue();
        this.zzi = ((Long) zzbjv.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaH)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaI)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaJ)).intValue();
        this.zze = ((Long) zzbjv.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaL);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaM)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaN)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaO)).getClass();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00f7 */
    /* JADX WARN: Code duplicated, block: B:64:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:64:0x00e8->B:73:0x00e8, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfe.run():void");
    }

    public final void zza() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @k.h1
    public final void zzb(View view) {
        try {
            zzbeu zzbeuVar = new zzbeu(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZze = com.google.android.gms.ads.internal.zzt.zzg().zze();
            if (contextZze != null) {
                String str = this.zzm;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(contextZze.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaK), "id", contextZze.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzbfd zzbfdVarZzc = zzc(view, zzbeuVar);
            zzbeuVar.zzi();
            if (zzbfdVarZzc.zza == 0 && zzbfdVarZzc.zzb == 0) {
                return;
            }
            int i10 = zzbfdVarZzc.zzb;
            if (i10 == 0 && zzbeuVar.zzl() == 0) {
                return;
            }
            if (i10 == 0 && this.zzd.zza(zzbeuVar)) {
                return;
            }
            this.zzd.zzc(zzbeuVar);
        } catch (Exception e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception in fetchContentOnUIThread", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "ContentFetchTask.fetchContent");
        }
    }

    @k.h1
    public final zzbfd zzc(@Nullable View view, zzbeu zzbeuVar) {
        if (view == null) {
            return new zzbfd(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbfd(this, 0, 0);
            }
            zzbeuVar.zzg(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzbfd(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzcki)) {
            WebView webView = (WebView) view;
            zzbeuVar.zze();
            webView.post(new zzbfc(this, zzbeuVar, webView, globalVisibleRect));
            return new zzbfd(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzbfd(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            zzbfd zzbfdVarZzc = zzc(viewGroup.getChildAt(i12), zzbeuVar);
            i10 += zzbfdVarZzc.zza;
            i11 += zzbfdVarZzc.zzb;
        }
        return new zzbfd(this, i10, i11);
    }

    @k.h1
    public final void zzd(zzbeu zzbeuVar, WebView webView, String str, boolean z10) {
        zzbeu zzbeuVar2;
        zzbeuVar.zzd();
        try {
            if (TextUtils.isEmpty(str)) {
                zzbeuVar2 = zzbeuVar;
            } else {
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzbeuVar2 = zzbeuVar;
                    zzbeuVar2.zzf(strOptString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb2.append(title);
                    sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                    sb2.append(strOptString);
                    zzbeuVar.zzf(sb2.toString(), z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    zzbeuVar2 = zzbeuVar;
                }
            }
            if (zzbeuVar2.zza()) {
                this.zzd.zzb(zzbeuVar2);
            }
        } catch (JSONException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Json string may be malformed.");
        } catch (Throwable th2) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get webview content.", th2);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("ContentFetchThread: paused, pause = ");
            sb2.append(true);
            String string = sb2.toString();
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }
}
