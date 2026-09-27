package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private C4465q0.a f59212a;

    public I(@oy.l C4465q0.a performance) {
        kotlin.jvm.internal.m0.p(performance, "performance");
        this.f59212a = performance;
    }

    @oy.l
    public final C4465q0.a a() {
        return this.f59212a;
    }

    @oy.l
    public final C4465q0.a b() {
        return this.f59212a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I) && this.f59212a == ((I) obj).f59212a;
    }

    public int hashCode() {
        return this.f59212a.hashCode();
    }

    @oy.l
    public String toString() {
        return "AdInstancePerformance(performance=" + this.f59212a + gi.j.f86771d;
    }

    @oy.l
    public final I a(@oy.l C4465q0.a performance) {
        kotlin.jvm.internal.m0.p(performance, "performance");
        return new I(performance);
    }

    public final void b(@oy.l C4465q0.a aVar) {
        kotlin.jvm.internal.m0.p(aVar, "<set-?>");
        this.f59212a = aVar;
    }

    public static /* synthetic */ I a(I i10, C4465q0.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = i10.f59212a;
        }
        return i10.a(aVar);
    }
}
