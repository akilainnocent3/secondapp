package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.widget.RelativeLayout;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ok extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o3 f40400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebChromeClient f40401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RelativeLayout f40402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public je f40403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(Context context) {
        super(context);
        kotlin.jvm.internal.m0.p(context, "context");
        setFocusableInTouchMode(true);
        requestFocus();
    }

    public void a() {
        dr.w2 w2Var;
        o3 o3Var = this.f40400a;
        if (o3Var == null) {
            sb.a("Webview is null on destroyWebview", (Throwable) null, 2, (Object) null);
            return;
        }
        RelativeLayout relativeLayout = this.f40402c;
        if (relativeLayout != null) {
            relativeLayout.removeView(o3Var);
            removeView(relativeLayout);
            w2Var = dr.w2.f79517a;
        } else {
            w2Var = null;
        }
        if (w2Var == null) {
            sb.a("webViewContainer is null destroyWebview", (Throwable) null, 2, (Object) null);
        }
        o3 o3Var2 = this.f40400a;
        if (o3Var2 != null) {
            o3Var2.loadUrl(AndroidWebViewClient.BLANK_PAGE);
            o3Var2.onPause();
            o3Var2.removeAllViews();
            o3Var2.destroy();
        }
        removeAllViews();
    }

    @oy.m
    public final je getLastOrientation() {
        return this.f40403d;
    }

    @oy.m
    public final WebChromeClient getWebChromeClient() {
        return this.f40401b;
    }

    @oy.m
    public final o3 getWebView() {
        return this.f40400a;
    }

    @oy.m
    public final RelativeLayout getWebViewContainer() {
        return this.f40402c;
    }

    public final void setLastOrientation(@oy.m je jeVar) {
        this.f40403d = jeVar;
    }

    public final void setWebChromeClient(@oy.m WebChromeClient webChromeClient) {
        this.f40401b = webChromeClient;
    }

    public final void setWebView(@oy.m o3 o3Var) {
        this.f40400a = o3Var;
    }

    public final void setWebViewContainer(@oy.m RelativeLayout relativeLayout) {
        this.f40402c = relativeLayout;
    }
}
