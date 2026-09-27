package com.startapp.sdk.internal;

import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;
import com.startapp.startappsdk.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class u8 extends u7 implements View.OnClickListener {
    public static final int A = R.id.io_start_navigation_bar;
    public static final int B = R.id.io_start_navigation_bar_close;
    public static final int C = R.id.io_start_navigation_bar_external;
    public static final int D = R.id.io_start_navigation_bar_back;
    public static final int E = R.id.io_start_navigation_bar_forward;
    public static final int F = R.id.io_start_navigation_bar_progress;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static boolean f75623z = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RelativeLayout f75624t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public NavigationBarLayout f75625u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WebView f75626v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AnimatingProgressBar f75627w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FrameLayout f75628x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f75629y;

    public u8(String str) {
        this.f75629y = str;
    }

    @Override // com.startapp.sdk.internal.u7
    public final void a(Bundle bundle) {
        wb.a(this.f75604a).a(this.f75606c, new IntentFilter("com.startapp.android.CloseAdActivity"));
        f75623z = false;
        this.f75624t = new RelativeLayout(this.f75604a);
        String str = this.f75629y;
        if (this.f75625u == null) {
            NavigationBarLayout navigationBarLayout = new NavigationBarLayout(this.f75604a);
            this.f75625u = navigationBarLayout;
            navigationBarLayout.d();
            this.f75625u.c();
            this.f75625u.setButtonsListener(this);
        }
        this.f75624t.addView(this.f75625u);
        this.f75627w = new AnimatingProgressBar(this.f75604a, null, android.R.attr.progressBarStyleHorizontal);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#45d200"));
        this.f75627w.setProgressDrawable(new ClipDrawable(shapeDrawable, 3, 1));
        this.f75627w.setBackgroundColor(-1);
        this.f75627w.setId(F);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ii.a(this.f75604a, 4));
        layoutParams.addRule(3, A);
        this.f75624t.addView(this.f75627w, layoutParams);
        this.f75628x = new FrameLayout(this.f75604a);
        if (this.f75626v == null) {
            try {
                j();
                this.f75626v.loadUrl(str);
            } catch (Throwable th2) {
                d9.a(th2);
                this.f75625u.e();
                g0.b(this.f75604a, str);
                this.f75604a.finish();
            }
        }
        this.f75628x.addView(this.f75626v);
        this.f75628x.setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(3, F);
        this.f75624t.addView(this.f75628x, layoutParams2);
        if (bundle != null) {
            this.f75626v.restoreState(bundle);
        }
        this.f75604a.setContentView(this.f75624t, new RelativeLayout.LayoutParams(-2, -2));
    }

    @Override // com.startapp.sdk.internal.u7
    public final void b(Bundle bundle) {
        this.f75626v.saveState(bundle);
    }

    public final void i() {
        try {
            f75623z = true;
            this.f75626v.stopLoading();
            this.f75626v.removeAllViews();
            this.f75626v.postInvalidate();
            this.f75626v.onPause();
            this.f75626v.destroy();
            this.f75626v = null;
        } catch (Exception unused) {
        }
        this.f75625u.e();
        this.f75604a.finish();
    }

    public final void j() {
        WebView webViewC = ((rk) com.startapp.sdk.components.a.a(this.f75604a).f74457b.a()).c();
        this.f75626v = webViewC;
        webViewC.getSettings().setJavaScriptEnabled(true);
        this.f75626v.getSettings().setUseWideViewPort(true);
        this.f75626v.getSettings().setLoadWithOverviewMode(true);
        this.f75626v.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f75626v.getSettings().setBuiltInZoomControls(true);
        this.f75626v.getSettings().setDisplayZoomControls(false);
        this.f75626v.setWebViewClient(new t8(this.f75604a, this.f75625u, this.f75627w, this));
        this.f75626v.setWebChromeClient(new s8(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        if (id2 == D) {
            WebView webView = this.f75626v;
            if (webView == null || !webView.canGoBack()) {
                return;
            }
            this.f75627w.a();
            this.f75626v.goBack();
            return;
        }
        if (id2 == E) {
            WebView webView2 = this.f75626v;
            if (webView2 == null || !webView2.canGoForward()) {
                return;
            }
            this.f75627w.a();
            this.f75626v.goForward();
            return;
        }
        if (id2 != C) {
            if (id2 == B) {
                i();
            }
        } else {
            WebView webView3 = this.f75626v;
            if (webView3 != null) {
                g0.b(this.f75604a, webView3.getUrl());
                i();
            }
        }
    }

    @Override // com.startapp.sdk.internal.u7
    public final void f() {
    }

    @Override // com.startapp.sdk.internal.u7
    public final void g() {
    }

    @Override // com.startapp.sdk.internal.u7
    public final boolean a(int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return false;
        }
        WebView webView = this.f75626v;
        if (webView != null && webView.canGoBack()) {
            this.f75627w.a();
            this.f75626v.goBack();
            return true;
        }
        i();
        return true;
    }
}
