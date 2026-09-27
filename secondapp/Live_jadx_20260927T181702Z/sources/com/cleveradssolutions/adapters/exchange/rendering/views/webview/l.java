package com.cleveradssolutions.adapters.exchange.rendering.views.webview;

import android.content.Context;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends WebView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f42930g = "zz";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f42931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f42932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42935f;

    public l(Context context) {
        super(context);
        d();
    }

    public double b() {
        if (getContext() != null) {
            return getContext().getResources().getDisplayMetrics().density;
        }
        return 0.0d;
    }

    public abstract void d();

    public void e() {
        int iU;
        int iC;
        WebSettings settings = getSettings();
        if (getContext() != null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            iC = com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.j.c(windowManager);
            iU = com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.j.u(windowManager);
        } else {
            iU = 0;
            iC = 0;
        }
        if (this instanceof a) {
            g(iC, iU, this.f42933d, this.f42934e);
        } else {
            settings.setLoadWithOverviewMode(true);
        }
        h(settings);
        if (!com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.j.f()) {
            settings.setSupportZoom(true);
            return;
        }
        getSettings().setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
    }

    public void f() {
        setScrollBarStyle(0);
        setFocusable(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }

    public final void g(int i10, int i11, int i12, int i13) {
        double d10;
        double d11;
        double dB = b();
        double d12 = i10;
        double d13 = d12 / dB;
        double d14 = i11;
        double d15 = d14 / dB;
        double d16 = i12;
        if (d13 >= d16 && d15 >= i13) {
            setInitialScale(100);
            return;
        }
        double d17 = d12 / d14;
        double d18 = i13;
        if (d16 / d18 <= d17) {
            d10 = d13 / d16;
            d11 = (d18 * d10) / d15;
        } else {
            double d19 = d15 / d18;
            double d20 = (d16 * d19) / d13;
            d10 = d19;
            d11 = d20;
        }
        int i14 = (int) ((d10 / d11) * 100.0d);
        setInitialScale(i14);
        Log.d(f42930g, "Using custom WebView scale: " + i14);
    }

    public String getInitialScaleValue() {
        Integer num = this.f42931b;
        if (num != null) {
            return String.valueOf(num.intValue() / 100.0f);
        }
        return null;
    }

    public final void h(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
        webSettings.setPluginState(WebSettings.PluginState.OFF);
        webSettings.setCacheMode(2);
        webSettings.setUseWideViewPort(true);
    }

    public void i(b.a aVar, String str) {
        if (this.f42932c == null) {
            this.f42932c = new com.cleveradssolutions.adapters.exchange.rendering.views.webview.mraid.k(aVar, str);
        }
        setWebViewClient(this.f42932c);
    }

    public void setDomain(String str) {
        this.f42935f = str;
    }

    @Override // android.webkit.WebView
    public void setInitialScale(int i10) {
        this.f42931b = Integer.valueOf(i10);
    }
}
