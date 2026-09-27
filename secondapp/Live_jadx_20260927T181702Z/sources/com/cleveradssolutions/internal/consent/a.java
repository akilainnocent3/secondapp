package com.cleveradssolutions.internal.consent;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f2.z1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Dialog {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zm f43254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FrameLayout f43255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CoordinatorLayout f43256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f43257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f43260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f43262j;

    public a(Activity activity) {
        super(activity, a());
        this.f43259g = true;
        this.f43260h = true;
        this.f43262j = new y(this);
    }

    public static int a() {
        return com.cleveradssolutions.sdk.android.a.g.f43971e;
    }

    public final FrameLayout b(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f43255c.findViewById(com.cleveradssolutions.sdk.android.a.c.N);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        this.f43257e.removeAllViews();
        if (layoutParams == null) {
            this.f43257e.addView(view);
        } else {
            this.f43257e.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(com.cleveradssolutions.sdk.android.a.c.O).setOnClickListener(new v(this));
        z1.G1(this.f43257e, new w(this));
        this.f43257e.setOnTouchListener(new x());
        return this.f43255c;
    }

    public final void c() {
        if (this.f43255c == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), com.cleveradssolutions.sdk.android.a.d.f43948b, null);
            this.f43255c = frameLayout;
            this.f43256d = (CoordinatorLayout) frameLayout.findViewById(com.cleveradssolutions.sdk.android.a.c.N);
            this.f43257e = new FrameLayout(this.f43255c.getContext());
            this.f43254b = new zm(this.f43255c.getContext());
            CoordinatorLayout.g gVar = new CoordinatorLayout.g(-1, -2);
            gVar.f8967c = 49;
            gVar.q(this.f43254b);
            this.f43256d.addView(this.f43257e, gVar);
            zm zmVar = this.f43254b;
            y yVar = this.f43262j;
            if (!zmVar.J.contains(yVar)) {
                zmVar.J.add(yVar);
            }
            this.f43254b.x(this.f43259g);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f43254b == null) {
            c();
        }
        zm zmVar = this.f43254b;
        if (!this.f43258f || zmVar.f43347z == 5) {
            super.cancel();
        } else {
            zmVar.h(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWindow() != null) {
            FrameLayout frameLayout = this.f43255c;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(true);
            }
            CoordinatorLayout coordinatorLayout = this.f43256d;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(true);
            }
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 35) {
                window.setStatusBarColor(0);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        zm zmVar = this.f43254b;
        if (zmVar == null || zmVar.f43347z != 5) {
            return;
        }
        zmVar.h(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f43259g != z10) {
            this.f43259g = z10;
            zm zmVar = this.f43254b;
            if (zmVar != null) {
                zmVar.x(z10);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f43259g) {
            this.f43259g = true;
        }
        this.f43260h = z10;
        this.f43261i = true;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i10) {
        super.setContentView(b(null, i10, null));
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(b(view, 0, null));
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(b(view, 0, layoutParams));
    }
}
