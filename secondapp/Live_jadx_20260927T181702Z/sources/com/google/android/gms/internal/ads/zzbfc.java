package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbfc implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzbeu zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbfe zze;

    public zzbfc(zzbfe zzbfeVar, final zzbeu zzbeuVar, final WebView webView, final boolean z10) {
        this.zzb = zzbeuVar;
        this.zzc = webView;
        this.zzd = z10;
        Objects.requireNonNull(zzbfeVar);
        this.zze = zzbfeVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbfb
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Object obj) {
                this.zza.zze.zzd(zzbeuVar, webView, (String) obj, z10);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
