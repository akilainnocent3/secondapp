package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.k0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class jt {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2890 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2891 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2892 = -8951586584454626386L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2893;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private WeakReference<WebView> f2894;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private WeakReference<bb.e> f2895;

    public jt(WebView webView) {
        this.f2894 = new WeakReference<>(webView);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2684(bb.e eVar) {
        new WeakReference(eVar);
        int i10 = f2891 + 79;
        f2890 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final bb.e m2686() {
        int i10 = (f2890 + 123) % 128;
        f2891 = i10;
        WeakReference<bb.e> weakReference = this.f2895;
        if (weakReference != null) {
            return weakReference.get();
        }
        f2890 = (i10 + 9) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final WebView m2687() {
        f2890 = (f2891 + 123) % 128;
        WebView webView = this.f2894.get();
        int i10 = f2891 + 29;
        f2890 = i10 % 128;
        if (i10 % 2 != 0) {
            return webView;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2690(WebViewClient webViewClient) {
        int i10 = f2891 + 3;
        f2890 = i10 % 128;
        if (i10 % 2 == 0) {
            m2687();
            throw null;
        }
        WebView webViewM2687 = m2687();
        if (webViewM2687 != null) {
            try {
                hk hkVar = new hk(ki.m2862(webViewM2687), webViewClient);
                m2683(hkVar);
                webViewM2687.setWebViewClient(hkVar);
                this.f2893 = true;
                int i11 = f2890 + 51;
                f2891 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                return;
            } catch (Exception e10) {
                kd.m2827(m2685("Ϲ﹢\uf89eﬃ\uf563\uf786\uf22f\uec74\uee9e\ue92b\ueb51\ue583\ue031\ue252\udcff\udf27", 64937 - View.MeasureSpec.getSize(0)).intern(), m2685("ϫ쇟蟚䗈ௐ즁进䷞Ꮒ퇁韙嗡ᯭ\ud9a9鿓左⏼\ue1cb\ua7f1旲⯥\ue9d2꾀涂㎃\uf18b랔", 49666 - TextUtils.lastIndexOf("", '0', 0)).intern(), e10, false);
            }
        }
        this.f2893 = false;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2683(bb.e eVar) {
        this.f2895 = new WeakReference<>(eVar);
        f2890 = (f2891 + 123) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2688(WebChromeClient webChromeClient) {
        WebView webViewM2687;
        int i10 = f2890 + 83;
        f2891 = i10 % 128;
        if (i10 % 2 != 0) {
            webViewM2687 = m2687();
            int i11 = 38 / 0;
            if (webViewM2687 == null) {
                return;
            }
        } else {
            webViewM2687 = m2687();
            if (webViewM2687 == null) {
                return;
            }
        }
        f2891 = (f2890 + 71) % 128;
        try {
            WebChromeClient webChromeClientM2853 = ki.m2853(webViewM2687);
            if (webChromeClientM2853 != null) {
                f2890 = (f2891 + 109) % 128;
                if (k0.a(webChromeClientM2853)) {
                    return;
                }
                hi hiVar = new hi(webChromeClientM2853, webChromeClient);
                m2684((bb.e) hiVar);
                webViewM2687.setWebChromeClient(hiVar);
            }
        } catch (Exception e10) {
            kd.m2827(m2685("Ϲ﹢\uf89eﬃ\uf563\uf786\uf22f\uec74\uee9e\ue92b\ueb51\ue583\ue031\ue252\udcff\udf27", 64937 - Color.blue(0)).intern(), m2685("ϫ頙㑖킎泈ॗꕗ䆨\uddf2稷ᙵ늷仵\uea8f蜿⍀뾜寸\uf01c豃⢥쓪愥ﵞ馺㗺퇉渇\u0a56", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 39877).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2685(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2019) {
            try {
                f.f2017 = i10;
                char[] cArr2 = new char[cArr.length];
                f.f2018 = 0;
                while (true) {
                    int i11 = f.f2018;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f2892);
                        f.f2018++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m2689() {
        int i10 = f2891 + 71;
        int i11 = i10 % 128;
        f2890 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        boolean z10 = this.f2893;
        int i12 = i11 + 45;
        f2891 = i12 % 128;
        if (i12 % 2 == 0) {
            return z10;
        }
        throw null;
    }
}
