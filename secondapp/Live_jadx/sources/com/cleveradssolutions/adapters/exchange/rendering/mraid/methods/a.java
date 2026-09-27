package com.cleveradssolutions.adapters.exchange.rendering.mraid.methods;

import android.content.Context;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f42293b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f42294c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f42295d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f42296e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f42297f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f42298g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f42299h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f42300i = new Rect();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f42301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f42302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f42303l;

    public a(Context context, float f10) {
        this.f42292a = context.getApplicationContext();
        this.f42303l = f10;
    }

    public Rect a() {
        return this.f42298g;
    }

    public void b(int i10, int i11, int i12, int i13) {
        this.f42299h.set(i10, i11, i12 + i10, i13 + i11);
        p(this.f42299h, this.f42300i);
    }

    public void c(Rect rect) {
        this.f42302k = rect;
    }

    public Rect d() {
        return this.f42301j;
    }

    public void e(int i10, int i11, int i12, int i13) {
        this.f42295d.set(i10, i11, i12 + i10, i13 + i11);
        p(this.f42295d, this.f42296e);
    }

    public Rect f() {
        return this.f42299h;
    }

    public Rect g() {
        return this.f42300i;
    }

    public Rect h() {
        return this.f42302k;
    }

    public Rect i() {
        return this.f42295d;
    }

    public Rect j() {
        return this.f42296e;
    }

    public Rect k() {
        return this.f42294c;
    }

    public Rect l() {
        return this.f42297f;
    }

    public void m(int i10, int i11) {
        this.f42293b.set(0, 0, i10, i11);
        p(this.f42293b, this.f42294c);
    }

    public void n(int i10, int i11, int i12, int i13) {
        this.f42297f.set(i10, i11, i12 + i10, i13 + i11);
        p(this.f42297f, this.f42298g);
    }

    public void o(Rect rect) {
        this.f42301j = new Rect(0, 0, rect.width(), rect.height());
    }

    public final void p(Rect rect, Rect rect2) {
        rect2.set(com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.b.c(rect.left, this.f42292a), com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.b.c(rect.top, this.f42292a), com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.b.c(rect.right, this.f42292a), com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.b.c(rect.bottom, this.f42292a));
    }
}
