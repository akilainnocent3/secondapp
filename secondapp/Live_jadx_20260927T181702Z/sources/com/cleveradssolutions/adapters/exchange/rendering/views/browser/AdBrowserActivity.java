package com.cleveradssolutions.adapters.exchange.rendering.views.browser;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public final class AdBrowserActivity extends Activity implements i.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebView f42822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VideoView f42823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f42824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f42825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42828h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements h {
        public a() {
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.browser.h
        public String a() {
            if (AdBrowserActivity.this.f42822b != null) {
                return AdBrowserActivity.this.f42822b.getUrl();
            }
            return null;
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.browser.h
        public void b() {
            if (AdBrowserActivity.this.f42822b != null) {
                AdBrowserActivity.this.f42822b.goForward();
            }
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.browser.h
        public boolean c() {
            if (AdBrowserActivity.this.f42822b != null) {
                return AdBrowserActivity.this.f42822b.canGoForward();
            }
            return false;
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.browser.h
        public void d() {
            if (AdBrowserActivity.this.f42822b != null) {
                AdBrowserActivity.this.f42822b.goBack();
            }
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.browser.h
        public boolean e() {
            if (AdBrowserActivity.this.f42822b != null) {
                return AdBrowserActivity.this.f42822b.canGoBack();
            }
            return false;
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.browser.h
        public void f() {
            AdBrowserActivity.this.finish();
            AdBrowserActivity.this.j("com.cleveradssolutions.adapters.dsp.rendering.browser.close");
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.browser.h
        public void zz() {
            if (AdBrowserActivity.this.f42822b != null) {
                AdBrowserActivity.this.f42822b.reload();
            }
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.browser.i.a
    public void a() {
        g gVar = this.f42824d;
        if (gVar != null) {
            gVar.m();
        }
    }

    public final void b() {
        this.f42823c = new VideoView(this);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        relativeLayout.addView(this.f42823c, layoutParams);
        setContentView(relativeLayout);
        this.f42823c.setMediaController(new MediaController(this));
        this.f42823c.setVideoURI(Uri.parse(this.f42828h));
        this.f42823c.start();
    }

    public final void c() {
        RelativeLayout.LayoutParams layoutParams;
        d();
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if (TextUtils.isEmpty(this.f42828h)) {
            layoutParams = null;
        } else {
            this.f42822b = new WebView(this);
            f();
            this.f42822b.setWebViewClient(new i(this));
            this.f42822b.loadUrl(this.f42828h);
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            g gVar = this.f42824d;
            if (gVar != null) {
                gVar.k();
            }
            layoutParams2.addRule(3, 235799);
        }
        WebView webView = this.f42822b;
        if (webView != null) {
            relativeLayout.addView(webView, layoutParams2);
        }
        g gVar2 = this.f42824d;
        if (gVar2 != null) {
            if (layoutParams != null) {
                relativeLayout.addView(gVar2, layoutParams);
            } else {
                relativeLayout.addView(gVar2);
            }
        }
        setContentView(relativeLayout);
    }

    public final void d() {
        g gVar = new g(this, new a());
        gVar.setId(235799);
        this.f42824d = gVar;
    }

    public final void e() {
        Window window = getWindow();
        window.setBackgroundDrawable(new ColorDrawable(-1));
        window.setFlags(16777216, 16777216);
        window.setSoftInputMode(6);
    }

    public final void f() {
        WebView webView = this.f42822b;
        if (webView != null) {
            webView.getSettings().setJavaScriptEnabled(true);
            this.f42822b.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
            this.f42822b.getSettings().setPluginState(WebSettings.PluginState.OFF);
            this.f42822b.setHorizontalScrollBarEnabled(false);
            this.f42822b.setVerticalScrollBarEnabled(false);
            this.f42822b.getSettings().setCacheMode(2);
            this.f42822b.getSettings().setBuiltInZoomControls(true);
            this.f42822b.getSettings().setDisplayZoomControls(false);
            this.f42822b.getSettings().setLoadWithOverviewMode(true);
            this.f42822b.getSettings().setUseWideViewPort(true);
        }
    }

    public final void h(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.f42828h = bundle.getString("EXTRA_URL", null);
        this.f42826f = bundle.getBoolean("EXTRA_SHOULD_FIRE_EVENTS", true);
        this.f42825e = bundle.getBoolean("EXTRA_IS_VIDEO", false);
        this.f42827g = bundle.getInt("EXTRA_BROADCAST_ID", -1);
    }

    public final void j(String str) {
        if (this.f42826f) {
            com.cleveradssolutions.adapters.exchange.rendering.utils.broadcast.local.b.c(getApplicationContext(), this.f42827g, str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f42825e) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e();
        h(getIntent().getExtras());
        if (this.f42825e) {
            b();
        } else {
            c();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f42822b;
        if (webView != null) {
            webView.destroy();
        }
        VideoView videoView = this.f42823c;
        if (videoView != null) {
            videoView.suspend();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            WebView webView = this.f42822b;
            if (webView != null) {
                webView.goBack();
            }
            finish();
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        VideoView videoView = this.f42823c;
        if (videoView != null) {
            videoView.suspend();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        VideoView videoView = this.f42823c;
        if (videoView != null) {
            videoView.resume();
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.browser.i.a
    public void zz() {
        finish();
    }
}
