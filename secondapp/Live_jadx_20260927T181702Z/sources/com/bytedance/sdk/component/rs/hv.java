package com.bytedance.sdk.component.rs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv extends WebView {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private sd f34985hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean f34986hv;
    public long hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f34987sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final HashSet<String> f34988tq;
    private boolean vy;

    public hv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34988tq = new HashSet<>();
        this.hww = System.currentTimeMillis();
        tq();
    }

    private void tq() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new hu.hww());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        super.addJavascriptInterface(obj, str);
        this.f34988tq.add(str);
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z10) {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        super.clearCache(z10);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.f34987sd) {
            return;
        }
        this.f34987sd = true;
        hww();
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.f34987sd && !this.f34986hv) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        super.goBack();
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i10) {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        super.goBackOrForward(i10);
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        super.goForward();
    }

    public void hww() {
        if (this.f34987sd) {
            return;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        setOnScrollChangeListener(null);
        Iterator<String> it = this.f34988tq.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
        this.f34988tq.clear();
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        toString();
        if (this.vy) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f34987sd || this.f34986hv) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        super.reload();
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.f34988tq.remove(str);
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        super.resumeTimers();
    }

    public void setDestroyOnDetached(boolean z10) {
        this.vy = z10;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        sd sdVar = this.f34985hu;
        if (sdVar == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            sdVar.hww(onTouchListener);
            super.setOnTouchListener(this.f34985hu);
        }
    }

    public void setRecycler(boolean z10) {
        this.f34986hv = z10;
    }

    public void setTouchListenerProxy(sd sdVar) {
        this.f34985hu = sdVar;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (this.f34987sd || this.f34986hv) {
            return;
        }
        try {
            super.loadUrl(str, map);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    public hv(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f34988tq = new HashSet<>();
        this.hww = System.currentTimeMillis();
        tq();
    }
}
