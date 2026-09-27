package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dd f38416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dd f38417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dd f38418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public dd f38419e;

    public cd(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        this.f38415a = context;
        this.f38416b = new dd(context);
        this.f38417c = new dd(this.f38415a);
        this.f38418d = new dd(this.f38415a);
        this.f38419e = new dd(this.f38415a);
    }

    public final dd a() {
        return this.f38419e;
    }

    public final dd b() {
        return this.f38418d;
    }

    public final dd c() {
        return this.f38417c;
    }

    public final dd d() {
        return this.f38416b;
    }

    public final void a(int i10, int i11, int i12, int i13) {
        this.f38419e.a(i10, i11, i12, i13);
    }

    public final void b(int i10, int i11, int i12, int i13) {
        this.f38418d.a(i10, i11, i12, i13);
    }

    public final void a(int i10, int i11) {
        this.f38417c.a(i10, i11);
    }

    public final void b(int i10, int i11) {
        this.f38416b.a(i10, i11);
    }

    public final void a(View view) {
        kotlin.jvm.internal.m0.p(view, "view");
        DisplayMetrics displayMetrics = this.f38415a.getResources().getDisplayMetrics();
        b(displayMetrics.widthPixels, displayMetrics.heightPixels);
        View rootView = view.getRootView();
        if (rootView == null) {
            rootView = view;
        }
        a(rootView.getWidth(), rootView.getHeight());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        a(iArr[0], iArr[1], view.getWidth(), view.getHeight());
        b(iArr[0], iArr[1], view.getWidth(), view.getHeight());
    }
}
