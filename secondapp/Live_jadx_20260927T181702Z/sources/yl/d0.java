package yl;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@bm.h
@bm.a
@bm.i("javax.inject.Singleton")
public final class d0 implements bm.c<c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr.c<Context> f159600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cr.c<c1> f159601b;

    public d0(cr.c<Context> cVar, cr.c<c1> cVar2) {
        this.f159600a = cVar;
        this.f159601b = cVar2;
    }

    public static d0 a(cr.c<Context> cVar, cr.c<c1> cVar2) {
        return new d0(cVar, cVar2);
    }

    public static c0 c(Context context, c1 c1Var) {
        return new c0(context, c1Var);
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0 get() {
        return c(this.f159600a.get(), this.f159601b.get());
    }
}
