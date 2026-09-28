package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.fae;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzle extends WebViewClient {
    final /* synthetic */ zzly zza;

    public zzle(zzly zzlyVar) {
        this.zza = zzlyVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        long jZza = this.zza.zzg.zza(TimeUnit.MICROSECONDS);
        int i = zzco.zza;
        zzco.zza(zzcp.zzb.zza(), jZza);
    }

    @Override // android.webkit.WebViewClient
    @fae
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        zzly zzlyVar = this.zza;
        zzce zzceVar = zzce.zzc;
        zzcd zzcdVar = (zzcd) zzlyVar.zzc.get(Integer.valueOf(i));
        if (zzcdVar == null) {
            zzcdVar = zzcd.zzM;
        }
        zzcg zzcgVar = new zzcg(zzceVar, zzcdVar, null, null, 12, null);
        zzlyVar.zzz().hashCode();
        zzcgVar.getMessage();
        zzlyVar.zzz().F(zzcgVar);
    }

    @Override // android.webkit.WebViewClient
    @fae
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        zzly zzlyVar = this.zza;
        Uri uri = Uri.parse(str);
        zzly.zzq(zzlyVar);
        uri.getClass();
        if (!zzig.zzc(uri) || zzly.zzq(zzlyVar).zza(uri)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzQ, null, null, 12, null);
        zzlyVar.zzz().hashCode();
        uri.toString();
        zzlyVar.zzz().F(zzcgVar);
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
