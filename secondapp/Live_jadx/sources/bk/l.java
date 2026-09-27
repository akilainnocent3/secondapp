package bk;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final h.a f21772a;

    public l(h.a aVar) {
        this.f21772a = aVar;
    }

    @oy.l
    public final h a() {
        h hVarB = this.f21772a.b();
        m0.o(hVarB, "build(...)");
        return hVarB;
    }

    public final void b(@oy.l String key, double d10) {
        m0.p(key, "key");
        this.f21772a.d(key, d10);
    }

    public final void c(@oy.l String key, float f10) {
        m0.p(key, "key");
        this.f21772a.e(key, f10);
    }

    public final void d(@oy.l String key, int i10) {
        m0.p(key, "key");
        this.f21772a.f(key, i10);
    }

    public final void e(@oy.l String key, long j10) {
        m0.p(key, "key");
        this.f21772a.g(key, j10);
    }

    public final void f(@oy.l String key, @oy.l String value) {
        m0.p(key, "key");
        m0.p(value, "value");
        this.f21772a.h(key, value);
    }

    public final void g(@oy.l String key, boolean z10) {
        m0.p(key, "key");
        this.f21772a.c(key, z10);
    }

    public l() {
        this(new h.a());
    }
}
