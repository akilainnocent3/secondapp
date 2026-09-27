package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.ironsource.V2;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class pk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib f75389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList f75390b = new LinkedList();

    public pk(Context context, ib ibVar) {
        this.f75389a = ibVar;
    }

    public final void a(WebView webView) {
        webView.stopLoading();
        webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        if (this.f75390b.size() < 3) {
            this.f75390b.add(new WeakReference(webView));
        } else {
            webView.destroy();
        }
    }

    public final void a(String str, qi qiVar) {
        Throwable th2;
        qi qiVar2;
        if ("true".equals(si.a(str, "@doNotRender@", "@doNotRender@"))) {
            qiVar.a();
            return;
        }
        WebView webViewC = null;
        while (webViewC == null) {
            try {
                if (this.f75390b.size() <= 0) {
                    break;
                }
                WeakReference weakReference = (WeakReference) this.f75390b.poll();
                if (weakReference != null) {
                    webViewC = (WebView) weakReference.get();
                }
            } catch (Throwable th3) {
                th2 = th3;
                qiVar2 = qiVar;
                d9.a(th2);
                qiVar2.a("WebView instantiation Error");
            }
        }
        if (webViewC == null) {
            webViewC = ((rk) this.f75389a.a()).c();
        }
        WebView webView = webViewC;
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            Handler handler = new Handler(Looper.getMainLooper());
            AtomicLong atomicLong = new AtomicLong();
            int i10 = 0;
            if (h0.f74931f.booleanValue()) {
                webView.getSettings().setBlockNetworkImage(false);
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                i10 = 25000;
            }
            int i11 = i10;
            webView.setWebChromeClient(new WebChromeClient());
            try {
                qiVar2 = qiVar;
                try {
                    webView.setWebViewClient(new mk(this, handler, atomicBoolean, webView, qiVar, atomicLong, i11));
                    atomicLong.set(si.b());
                    if (!si.a(webView, str)) {
                        handler.removeCallbacksAndMessages(null);
                        handler.post(new nk(this, atomicBoolean, webView, qiVar2));
                    } else {
                        handler.postDelayed(new ok(this, atomicBoolean, webView, qiVar2, atomicLong), V2.f60230h);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    d9.a(th2);
                    qiVar2.a("WebView instantiation Error");
                }
            } catch (Throwable th5) {
                th = th5;
                qiVar2 = qiVar;
            }
        } catch (Throwable th6) {
            th = th6;
            qiVar2 = qiVar;
        }
    }
}
