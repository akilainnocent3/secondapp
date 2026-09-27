package com.fyber.inneractive.sdk.web;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class m extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f48014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f48015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f48016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y0 f48017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g1 f48018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48020g;

    public m() {
        super(IAConfigManager.O.f44312v.a());
        this.f48014a = false;
        this.f48018e = new com.fyber.inneractive.sdk.util.g1();
    }

    public final void a(String str) {
        IAlog.a("injecting JS: %s", str);
        if (str != null) {
            try {
                loadUrl("javascript:".concat(str));
            } catch (Throwable th2) {
                IAlog.a("Failed to inject JS", th2, new Object[0]);
            }
        }
    }

    public final void b() {
        boolean z10 = false;
        IAlog.e("updateVisibility called - is = %s hwf = %s atw = %swinToken - %s app token - %s", Boolean.valueOf(isShown()), Boolean.valueOf(hasWindowFocus()), Boolean.valueOf(this.f48014a), getWindowToken(), getApplicationWindowToken());
        if (getWindowToken() != getApplicationWindowToken()) {
            if (getWindowVisibility() != 8 && isShown() && this.f48014a) {
                z10 = true;
            }
            a(z10);
            return;
        }
        boolean z11 = isShown() && this.f48014a;
        if (IAConfigManager.O.f44311u.f44480b.a(false, "ignore_w_f")) {
            z10 = z11;
        } else if (z11 && hasWindowFocus()) {
            z10 = true;
        }
        a(z10);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable unused) {
        }
        this.f48016c = null;
    }

    public int getHeightDp() {
        return this.f48020g;
    }

    public boolean getIsVisible() {
        return this.f48015b;
    }

    public com.fyber.inneractive.sdk.util.g1 getLastClickedLocation() {
        return this.f48018e;
    }

    public int getWidthDp() {
        return this.f48019f;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f48014a) {
            return;
        }
        this.f48014a = true;
        l lVar = this.f48016c;
        if (lVar != null) {
            lVar.b();
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48015b = false;
        if (this.f48014a) {
            this.f48014a = false;
            l lVar = this.f48016c;
            if (lVar != null) {
                lVar.c();
            }
            a();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && motionEvent.getEventTime() - motionEvent.getDownTime() >= ViewConfiguration.getLongPressTimeout()) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, x10, y10, 0));
            dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, x10, y10, 0));
        }
        y0 y0Var = this.f48017d;
        if (y0Var != null) {
            y0Var.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            com.fyber.inneractive.sdk.util.g1 g1Var = this.f48018e;
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            g1Var.f47864a = x11;
            g1Var.f47865b = y11;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        IAlog.e("onWindowFocusChanged with: %s", Boolean.valueOf(z10));
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 8) {
            a(false);
        } else {
            a();
        }
    }

    public void setHeightDp(int i10) {
        this.f48020g = i10;
    }

    public void setListener(l lVar) {
        this.f48016c = lVar;
    }

    public void setTapListener(x0 x0Var) {
        this.f48017d = new y0(x0Var, IAConfigManager.O.f44312v.a());
    }

    public void setWidthDp(int i10) {
        this.f48019f = i10;
    }

    public final void a(boolean z10) {
        if (z10) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                if (!getLocalVisibleRect(rect) && getWindowToken() == getApplicationWindowToken()) {
                    IAlog.e("updateVisibility - Cannot find local visible rect. Scrolled out?", new Object[0]);
                    z10 = false;
                }
            } else {
                IAlog.e("updateVisibility - No parent available", new Object[0]);
            }
        }
        if (this.f48015b != z10) {
            this.f48015b = z10;
            l lVar = this.f48016c;
            if (lVar != null) {
                lVar.a(z10);
            }
        }
    }

    public final void a() {
        if (IAConfigManager.O.f44311u.f44480b.a(false, "update_v_mth")) {
            com.fyber.inneractive.sdk.util.r.f47892b.post(new k(this));
        } else {
            b();
        }
    }
}
