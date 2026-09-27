package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import f6.q;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2546ay extends WebView {
    public static byte[] A01;
    public static final String A02;
    public boolean A00;

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A01 = new byte[]{a.C7, -4, 4, 7, 0, -1, -69, c.f161639q, 10, -69, 4, 9, 4, c.f161639q, 4, -4, 7, 4, c.f161647y, 0, -69, -34, 10, 10, 6, 4, 0, q.B, -4, 9, -4, 2, 0, 13, a.f103493v7, -70, -71, -125, a.f103476t7, -43, -60, -42, a.f103511x7, -56, a.f103484u7, 63, 54, 75, 54, 72, 56, 71, 62, 69, 73, c.f161639q, -4, -22, -25, -28, -5, -18, -22, -4};
    }

    public abstract WebChromeClient A0G();

    public abstract WebViewClient A0H();

    static {
        A0C();
        A02 = AbstractC2546ay.class.getSimpleName();
    }

    public AbstractC2546ay(Activity activity, C2900gi c2900gi) {
        super(activity);
        A0E(c2900gi);
    }

    public AbstractC2546ay(C2900gi c2900gi) {
        super(c2900gi);
        A0E(c2900gi);
    }

    public static void A0D(int i10) {
        C2896ge context = T7.A00();
        if (context != null) {
            context.A08().ABC(A0B(56, 8, 37), i10, new C2313Te(A0B(35, 10, 3)));
        }
    }

    private void A0E(T8 t10) {
        setWebChromeClient(A0G());
        setWebViewClient(A0H());
        AbstractC2552b4.A04(this);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        if (t10.A05().AAO()) {
            setWebContentsDebuggingEnabled(true);
        }
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        try {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        } catch (Exception unused) {
            Log.w(A02, A0B(0, 35, 59));
        }
    }

    private void A0F(String str) {
        loadUrl(A0B(45, 11, 117) + str);
    }

    public final void A0I(String str) {
        try {
            evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            A0F(str);
        }
    }

    public final boolean A0J() {
        return this.A00;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.A00 = true;
        super.destroy();
    }
}
