package com.cleveradssolutions.adapters.exchange.rendering.utils.helpers;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.cleveradssolutions.adapters.exchange.rendering.models.internal.e f42540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.b f42541c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42539a = k.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f42542d = new Rect();

    public k(com.cleveradssolutions.adapters.exchange.rendering.models.internal.e eVar, com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.b bVar) {
        this.f42540b = eVar;
        this.f42541c = bVar;
    }

    public boolean a() {
        return this.f42540b.e() != Long.MIN_VALUE;
    }

    public boolean b(View view) {
        ViewParent parent;
        return view != null && d(view) && (parent = view.getParent()) != null && parent.getParent() != null && view.getWidth() > 0 && view.getHeight() > 0 && ((long) (b.c((float) this.f42542d.width(), view.getContext()) * b.c((float) this.f42542d.height(), view.getContext()))) >= ((long) this.f42540b.a());
    }

    public boolean c() {
        return a() && SystemClock.uptimeMillis() - this.f42540b.e() >= ((long) this.f42540b.c());
    }

    public boolean d(View view) {
        if (view != null && view.isShown() && view.hasWindowFocus()) {
            return view.getGlobalVisibleRect(this.f42542d);
        }
        return false;
    }

    public void e() {
        this.f42540b.i(SystemClock.uptimeMillis());
    }

    public com.cleveradssolutions.adapters.exchange.rendering.models.internal.e f() {
        return this.f42540b;
    }

    public com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.c g(View view) {
        if (view == null) {
            return null;
        }
        return this.f42541c.b(view);
    }

    public boolean h(View view, com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.c cVar) {
        if (this.f42540b.d(com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a.IMPRESSION) || this.f42540b.d(com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a.OMID)) {
            return b(view);
        }
        return cVar != null && cVar.a() * 100.0f >= ((float) this.f42540b.a());
    }
}
