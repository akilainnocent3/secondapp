package com.fyber.inneractive.sdk.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.o0;
import com.fyber.inneractive.sdk.util.v;
import com.ironsource.G5;
import java.net.URLDecoder;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class InneractiveInternalBrowserActivity extends InneractiveBaseActivity {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    public static final String URL_EXTRA = "extra_url";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f44120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static InternalBrowserListener f44121k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f44122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f44124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f44125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageButton f44126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageButton f44127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageButton f44128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageButton f44129i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InternalBrowserListener {
        void onApplicationInBackground();

        void onInternalBrowserDismissed();
    }

    public static void a(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity, com.fyber.inneractive.sdk.click.b bVar) {
        r rVar;
        x xVar = inneractiveInternalBrowserActivity.f44122b;
        InneractiveAdRequest inneractiveAdRequest = xVar != null ? xVar.f45031a : null;
        com.fyber.inneractive.sdk.response.e eVarB = xVar != null ? xVar.b() : null;
        x xVar2 = inneractiveInternalBrowserActivity.f44122b;
        JSONArray jSONArrayB = (xVar2 == null || (rVar = xVar2.f45033c) == null) ? null : rVar.b();
        u uVar = u.FYBER_SUCCESS_CLICK;
        w wVar = new w(eVarB);
        wVar.f45414c = uVar;
        wVar.f45412a = inneractiveAdRequest;
        wVar.f45415d = jSONArrayB;
        JSONObject jSONObject = new JSONObject();
        long j10 = bVar.f44249e;
        if (j10 != 0) {
            Object objValueOf = Long.valueOf(j10);
            try {
                jSONObject.put("time_passed", objValueOf);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "time_passed", objValueOf);
            }
        }
        JSONArray jSONArray = new JSONArray();
        for (com.fyber.inneractive.sdk.click.j jVar : bVar.f44250f) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("url", jVar.f44267a);
                jSONObject2.put("success", jVar.f44268b);
                jSONObject2.put("opened_by", jVar.f44269c);
                jSONObject2.put("reason", jVar.f44270d);
            } catch (Exception unused2) {
            }
            jSONArray.put(jSONObject2);
        }
        try {
            jSONObject.put("urls", jSONArray);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "urls", jSONArray);
        }
        Object obj = com.fyber.inneractive.sdk.util.g.VIDEO_CTA;
        try {
            jSONObject.put("origin", obj);
        } catch (Exception unused4) {
            IAlog.f("Got exception adding param to json object: %s, %s", "origin", obj);
        }
        wVar.f45417f.put(jSONObject);
        wVar.a((String) null);
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        new o0(webView).run();
    }

    public static void setHtmlExtra(String str) {
        f44120j = str;
    }

    public static void setInternalBrowserListener(InternalBrowserListener internalBrowserListener) {
        f44121k = internalBrowserListener;
    }

    @Override // android.app.Activity
    public void finish() {
        InternalBrowserListener internalBrowserListener = f44121k;
        super.finish();
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserDismissed();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InneractiveAdSpot spot;
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        getWindow().addFlags(1024);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        try {
            setContentView(a());
            String stringExtra = getIntent().getStringExtra("spotId");
            this.f44123c = stringExtra;
            if (!TextUtils.isEmpty(stringExtra) && (spot = InneractiveAdSpotManager.get().getSpot(this.f44123c)) != null) {
                this.f44122b = spot.getAdContent();
            }
            Intent intent = getIntent();
            WebSettings settings = this.f44125e.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(this.f44125e);
            this.f44125e.setWebChromeClient(new e(this));
            String stringExtra2 = intent.getStringExtra("extra_url");
            if (!TextUtils.isEmpty(f44120j)) {
                String str = f44120j + "<title>DigitalTurbine Internal Browser</title>";
                f44120j = str;
                this.f44125e.loadDataWithBaseURL(stringExtra2, str, "text/html", "UTF-8", null);
            } else if (TextUtils.isEmpty(stringExtra2)) {
                IAlog.f("Empty url", new Object[0]);
                finish();
            } else if (!h0.d(stringExtra2)) {
                this.f44125e.loadUrl(stringExtra2);
            } else if (h0.c(stringExtra2)) {
                try {
                    stringExtra2 = URLDecoder.decode(stringExtra2, G5.N);
                    this.f44125e.loadUrl(stringExtra2);
                } catch (Exception unused) {
                    IAlog.f("Failed to open Url: %s", stringExtra2);
                    finish();
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra2));
                intent2.addFlags(268435456);
                try {
                    startActivity(intent2);
                    InternalBrowserListener internalBrowserListener = f44121k;
                    if (internalBrowserListener != null) {
                        internalBrowserListener.onApplicationInBackground();
                    }
                } catch (ActivityNotFoundException unused2) {
                    IAlog.f("Failed to start activity for %s. Please ensure that your phone can handle this intent.", stringExtra2);
                }
                finish();
            }
            this.f44126f.setBackgroundColor(0);
            this.f44126f.setOnClickListener(new i(this));
            this.f44126f.setContentDescription("IABackButton");
            this.f44127g.setBackgroundColor(0);
            this.f44127g.setOnClickListener(new j(this));
            this.f44127g.setContentDescription("IAForwardButton");
            this.f44128h.setBackgroundColor(0);
            this.f44128h.setOnClickListener(new k(this));
            this.f44128h.setContentDescription("IARefreshButton");
            this.f44129i.setBackgroundColor(0);
            this.f44129i.setOnClickListener(new l(this));
            this.f44129i.setContentDescription("IACloseButton");
            com.fyber.inneractive.sdk.util.o.a();
            com.fyber.inneractive.sdk.util.o.f();
        } catch (Exception unused3) {
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        LinearLayout linearLayout = this.f44124d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        WebView webView = this.f44125e;
        if (webView != null) {
            webView.removeAllViews();
            v.a(this.f44125e);
            this.f44125e.destroy();
            this.f44125e = null;
        }
        super.onDestroy();
        setHtmlExtra(null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        com.fyber.inneractive.sdk.util.o.g();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        com.fyber.inneractive.sdk.util.o.f();
    }

    public final LinearLayout a() {
        this.f44124d = new LinearLayout(this);
        this.f44124d.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f44124d.setOrientation(1);
        this.f44124d.setContentDescription("IAInternalBrowserView");
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f44124d.addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.fyber.inneractive.sdk.util.o.b(getResources().getInteger(R.integer.ia_ib_toolbar_height_dp)));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        com.fyber.inneractive.sdk.util.o.a(linearLayout, com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_background));
        relativeLayout.addView(linearLayout);
        this.f44126f = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_left_arrow));
        this.f44127g = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_right_arrow));
        this.f44128h = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_refresh));
        this.f44129i = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_close));
        linearLayout.addView(this.f44126f);
        linearLayout.addView(this.f44127g);
        linearLayout.addView(this.f44128h);
        linearLayout.addView(this.f44129i);
        WebView webView = new WebView(IAConfigManager.O.f44312v.a());
        this.f44125e = webView;
        webView.setWebViewClient(new f(this));
        this.f44125e.setId(R.id.ia_inneractive_webview_internal_browser);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, 1);
        this.f44125e.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f44125e);
        return this.f44124d;
    }

    public final ImageButton a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(com.fyber.inneractive.sdk.util.o.b(getResources().getInteger(R.integer.ia_ib_button_size_dp)), com.fyber.inneractive.sdk.util.o.b(getResources().getInteger(R.integer.ia_ib_button_size_dp)), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}
