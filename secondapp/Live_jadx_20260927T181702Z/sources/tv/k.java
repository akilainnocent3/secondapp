package tv;

import dr.w2;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class k<P, Q> implements j<P, Q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Object f137393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ds.q<Object, n<?>, Object, w2> f137394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final ds.q<Object, Object, Object, Object> f137395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public final ds.q<n<?>, Object, Object, ds.q<Throwable, Object, or.j, w2>> f137396d;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@oy.l Object obj, @oy.l ds.q<Object, ? super n<?>, Object, w2> qVar, @oy.l ds.q<Object, Object, Object, ? extends Object> qVar2, @oy.m ds.q<? super n<?>, Object, Object, ? extends ds.q<? super Throwable, Object, ? super or.j, w2>> qVar3) {
        this.f137393a = obj;
        this.f137394b = qVar;
        this.f137395c = qVar2;
        this.f137396d = qVar3;
    }

    @Override // tv.l
    @oy.m
    public ds.q<n<?>, Object, Object, ds.q<Throwable, Object, or.j, w2>> a() {
        return this.f137396d;
    }

    @Override // tv.l
    @oy.l
    public ds.q<Object, Object, Object, Object> b() {
        return this.f137395c;
    }

    @Override // tv.l
    @oy.l
    public ds.q<Object, n<?>, Object, w2> c() {
        return this.f137394b;
    }

    @Override // tv.l
    @oy.l
    public Object d() {
        return this.f137393a;
    }

    public /* synthetic */ k(Object obj, ds.q qVar, ds.q qVar2, ds.q qVar3, int i10, x xVar) {
        this(obj, qVar, qVar2, (i10 & 8) != 0 ? null : qVar3);
    }
}
