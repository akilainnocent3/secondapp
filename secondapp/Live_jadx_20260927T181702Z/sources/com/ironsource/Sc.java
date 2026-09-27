package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f60060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f60061b;

    /* JADX WARN: Multi-variable type inference failed */
    public Sc() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public final boolean a() {
        return this.f60060a;
    }

    public final int b() {
        return this.f60061b;
    }

    public final int c() {
        return this.f60061b;
    }

    public final boolean d() {
        return this.f60060a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sc)) {
            return false;
        }
        Sc sc2 = (Sc) obj;
        return this.f60060a == sc2.f60060a && this.f60061b == sc2.f60061b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.f60060a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return (r10 * 31) + this.f60061b;
    }

    @oy.l
    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.f60060a + ", flags=" + this.f60061b + gi.j.f86771d;
    }

    public Sc(boolean z10, int i10) {
        this.f60060a = z10;
        this.f60061b = i10;
    }

    @oy.l
    public final Sc a(boolean z10, int i10) {
        return new Sc(z10, i10);
    }

    public static /* synthetic */ Sc a(Sc sc2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = sc2.f60060a;
        }
        if ((i11 & 2) != 0) {
            i10 = sc2.f60061b;
        }
        return sc2.a(z10, i10);
    }

    public /* synthetic */ Sc(boolean z10, int i10, int i11, kotlin.jvm.internal.x xVar) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? re.k.D : i10);
    }
}
