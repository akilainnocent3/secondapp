package com.sportybet.plugin.event.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import defpackage.b3;
import defpackage.bls;
import defpackage.bmy;
import defpackage.bqe;
import defpackage.els;
import defpackage.h5e;
import defpackage.i0j0;
import defpackage.itf0;
import defpackage.mfb0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u000eR\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/sportybet/plugin/event/view/LiveEventMatchWebView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "measured", "", "setLiveTrackerHeightMeasured", "(Z)V", "Lkotlin/Function0;", "listener", "setOnPageFinishedListener", "(Lkotlin/jvm/functions/Function0;)V", "", "alpha", "setMaskAlpha", "(F)V", "active", "setActive", "Li0j0;", "c", "Li0j0;", "getWebViewWrapperService", "()Li0j0;", "setWebViewWrapperService", "(Li0j0;)V", "webViewWrapperService", "b", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LiveEventMatchWebView extends Hilt_LiveEventMatchWebView {
    public static final /* synthetic */ int y = 0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public i0j0 webViewWrapperService;
    public final bls d;
    public boolean e;
    public String f;
    public Function0<Unit> i;
    public float v;
    public volatile boolean w;

    public static final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (webView != null) {
                int i = LiveEventMatchWebView.y;
                webView.evaluateJavascript("(function() {\n    if (window.__scrollDetectorInstalled) return;\n    window.__scrollDetectorInstalled = true;\n\n    var scrollableEl = null;\n    var startY = 0;\n\n    function findScrollableElement(el) {\n        while (el && el !== document.documentElement) {\n            var style = window.getComputedStyle(el);\n            var overflowY = style.overflowY;\n            if ((overflowY === 'auto' || overflowY === 'scroll') && el.scrollHeight > el.clientHeight) {\n                return el;\n            }\n            el = el.parentElement;\n        }\n        return null;\n    }\n\n    document.addEventListener('touchstart', function(e) {\n        scrollableEl = findScrollableElement(e.target);\n        startY = e.touches[0].clientY;\n        AndroidScrollBridge.onScrollableElementDetected(scrollableEl !== null);\n    }, { passive: true });\n\n    document.addEventListener('touchmove', function(e) {\n        if (!scrollableEl) return;\n        var currentY = e.touches[0].clientY;\n        var scrollingDown = currentY < startY;\n        var atBottom = scrollableEl.scrollTop + scrollableEl.clientHeight >= scrollableEl.scrollHeight - 1;\n        var atTop = scrollableEl.scrollTop <= 0;\n        var canStillScroll = scrollingDown ? !atBottom : !atTop;\n        AndroidScrollBridge.onScrollableElementDetected(canStillScroll);\n    }, { passive: true });\n\n    document.addEventListener('touchend', function(e) {\n        scrollableEl = null;\n        AndroidScrollBridge.onScrollableElementDetected(false);\n    }, { passive: true });\n\n    document.addEventListener('touchcancel', function(e) {\n        scrollableEl = null;\n        AndroidScrollBridge.onScrollableElementDetected(false);\n    }, { passive: true });\n})();", null);
            }
            Function0<Unit> function0 = LiveEventMatchWebView.this.i;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final class b {
        public b() {
        }

        @JavascriptInterface
        public final void onScrollableElementDetected(boolean z) {
            LiveEventMatchWebView.this.w = z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveEventMatchWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((els) generatedComponent()).j(this);
        }
        LayoutInflater.from(context).inflate(R.layout.live_event_match_tracker_view, this);
        int i2 = R.id.mask;
        View viewA = h5e.a(R.id.mask, this);
        if (viewA != null) {
            i2 = R.id.web_view;
            WebView webView = (WebView) h5e.a(R.id.web_view, this);
            if (webView != null) {
                this.d = new bls(this, viewA, webView);
                if (isInEditMode()) {
                    webView.setVisibility(4);
                    return;
                }
                setMaskAlpha(0.0f);
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                settings.setJavaScriptCanOpenWindowsAutomatically(true);
                settings.setCacheMode(2);
                webView.addJavascriptInterface(new b(), "AndroidScrollBridge");
                webView.setOnTouchListener(new View.OnTouchListener() { // from class: cls
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
                    
                        if (r4 != 3) goto L18;
                     */
                    @Override // android.view.View.OnTouchListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
                        /*
                            r3 = this;
                            com.sportybet.plugin.event.view.LiveEventMatchWebView r3 = r3.a
                            int r4 = com.sportybet.plugin.event.view.LiveEventMatchWebView.y
                            int r4 = r5.getAction()
                            r0 = 0
                            r1 = 1
                            if (r4 == 0) goto L4d
                            if (r4 == r1) goto L41
                            r2 = 2
                            if (r4 == r2) goto L15
                            r5 = 3
                            if (r4 == r5) goto L41
                            goto L40
                        L15:
                            float r4 = r5.getY()
                            float r5 = r3.v
                            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                            bls r5 = r3.d
                            if (r4 >= 0) goto L28
                            android.webkit.WebView r4 = r5.c
                            boolean r4 = r4.canScrollVertically(r1)
                            goto L2f
                        L28:
                            android.webkit.WebView r4 = r5.c
                            r5 = -1
                            boolean r4 = r4.canScrollVertically(r5)
                        L2f:
                            if (r4 != 0) goto L40
                            boolean r4 = r3.w
                            if (r4 != 0) goto L40
                            bls r3 = r3.d
                            com.sportybet.plugin.event.view.LiveEventMatchWebView r3 = r3.a
                            android.view.ViewParent r3 = r3.getParent()
                            r3.requestDisallowInterceptTouchEvent(r0)
                        L40:
                            return r0
                        L41:
                            bls r3 = r3.d
                            com.sportybet.plugin.event.view.LiveEventMatchWebView r3 = r3.a
                            android.view.ViewParent r3 = r3.getParent()
                            r3.requestDisallowInterceptTouchEvent(r0)
                            return r0
                        L4d:
                            float r4 = r5.getY()
                            r3.v = r4
                            bls r3 = r3.d
                            com.sportybet.plugin.event.view.LiveEventMatchWebView r3 = r3.a
                            android.view.ViewParent r3 = r3.getParent()
                            r3.requestDisallowInterceptTouchEvent(r1)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cls.onTouch(android.view.View, android.view.MotionEvent):boolean");
                    }
                });
                getWebViewWrapperService().installJsBridge(getRootView().getContext(), webView, new a(), new WebChromeClient());
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static void a(final LiveEventMatchWebView liveEventMatchWebView, String str, mfb0 mfb0Var, final String str2, boolean z, int i) {
        int iD;
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z2 = (i & 16) == 0;
        bls blsVar = liveEventMatchWebView.d;
        str.getClass();
        str2.getClass();
        if (!liveEventMatchWebView.e) {
            float fL = mfb0Var != null ? mfb0Var.l() : 0.0f;
            if (b3.S(str)) {
                float fC = bqe.c();
                iD = (int) (((bqe.d() - (16.0f * fC)) * fL) + (154.0f * fC));
            } else {
                iD = (int) (bqe.d() * fL);
            }
            bls blsVar2 = liveEventMatchWebView.d;
            ViewGroup.LayoutParams layoutParams = blsVar2.a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iD;
                blsVar2.a.setLayoutParams(layoutParams);
            }
        }
        if (z && Intrinsics.g(liveEventMatchWebView.f, str2)) {
            return;
        }
        liveEventMatchWebView.f = str2;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_LMT);
        aVar.a("[LiveEventMatchWebView] loadUrl url=%s cache=%s", str2, Boolean.valueOf(z));
        if (z && z2) {
            blsVar.a.post(new Runnable() { // from class: dls
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d.c.loadUrl(str2);
                }
            });
        } else {
            blsVar.c.loadUrl(str2);
        }
    }

    public final i0j0 getWebViewWrapperService() {
        i0j0 i0j0Var = this.webViewWrapperService;
        if (i0j0Var != null) {
            return i0j0Var;
        }
        Intrinsics.n("webViewWrapperService");
        throw null;
    }

    public final void setActive(boolean active) {
        bls blsVar = this.d;
        if (active) {
            blsVar.c.onResume();
        } else {
            blsVar.c.onPause();
        }
    }

    public final void setLiveTrackerHeightMeasured(boolean measured) {
        this.e = measured;
    }

    public final void setMaskAlpha(float alpha) {
        this.d.b.setAlpha(alpha);
    }

    public final void setOnPageFinishedListener(Function0<Unit> listener) {
        this.i = listener;
    }

    public final void setWebViewWrapperService(i0j0 i0j0Var) {
        i0j0Var.getClass();
        this.webViewWrapperService = i0j0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveEventMatchWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    public /* synthetic */ LiveEventMatchWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveEventMatchWebView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }
}
