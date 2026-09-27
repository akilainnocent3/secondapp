package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends RelativeLayout implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f47352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s0 f47354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UnitDisplayType f47355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f47358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f47359h;

    public e(Context context) {
        super(context, null, 0);
        this.f47352a = new g1();
        this.f47353b = 0;
        this.f47356e = false;
        this.f47357f = false;
        this.f47359h = false;
        this.f47353b = Math.min(com.fyber.inneractive.sdk.util.o.e(), com.fyber.inneractive.sdk.util.o.d());
    }

    public abstract void a(h1 h1Var, int i10, int i11);

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean a() {
        return false;
    }

    public void c() {
        this.f47359h = true;
    }

    public void d() {
        this.f47359h = false;
    }

    public final void e() {
        boolean globalVisibleRect = isShown() && hasWindowFocus() && this.f47357f && !this.f47359h;
        if (globalVisibleRect) {
            globalVisibleRect = getGlobalVisibleRect(new Rect());
        }
        if (globalVisibleRect == this.f47356e || this.f47358g == null) {
            return;
        }
        IAlog.a("%supdateVisibility changing to %s", IAlog.a(this), Boolean.valueOf(globalVisibleRect));
        this.f47356e = globalVisibleRect;
        this.f47358g.a(globalVisibleRect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.a("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f47357f));
        this.f47357f = true;
        n nVar = this.f47358g;
        if (nVar != null) {
            nVar.a();
        }
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.a("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f47357f));
        this.f47357f = false;
        n nVar = this.f47358g;
        if (nVar != null) {
            nVar.c();
        }
        e();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (equals(view)) {
            IAlog.a("%sgot onVisibilityChanged with %d", IAlog.a(this), Integer.valueOf(i10));
            e();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        IAlog.a("%sgot onWindowFocusChanged with: %s", IAlog.a(this), Boolean.valueOf(z10));
        com.fyber.inneractive.sdk.util.r.f47892b.postDelayed(new d(this, z10), 500L);
    }

    public void setListener(n nVar) {
        this.f47358g = nVar;
    }

    public void setUnitConfig(s0 s0Var) {
        this.f47354c = s0Var;
        r0 r0Var = (r0) s0Var;
        this.f47355d = r0Var.f44433e == null ? r0Var.f44434f.f44494j : UnitDisplayType.DEFAULT;
    }
}
