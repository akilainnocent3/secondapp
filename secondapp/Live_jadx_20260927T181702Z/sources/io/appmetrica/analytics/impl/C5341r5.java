package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5341r5 implements Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98222a;

    public C5341r5(@oy.l String str) {
        this.f98222a = str;
    }

    @oy.l
    public final C5341r5 a(@oy.l String str) {
        return new C5341r5(str);
    }

    @oy.l
    public final String b() {
        return this.f98222a;
    }

    public final boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5341r5) && kotlin.jvm.internal.m0.g(this.f98222a, ((C5341r5) obj).f98222a);
    }

    public final int hashCode() {
        return this.f98222a.hashCode();
    }

    @oy.l
    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f98222a + ')';
    }

    public static C5341r5 a(C5341r5 c5341r5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c5341r5.f98222a;
        }
        c5341r5.getClass();
        return new C5341r5(str);
    }

    @Override // io.appmetrica.analytics.impl.Sc
    @oy.l
    public final String a() {
        return this.f98222a;
    }
}
