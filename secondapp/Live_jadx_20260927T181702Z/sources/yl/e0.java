package yl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f159612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f159613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f159614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f159615d;

    public e0(@oy.l String processName, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.m0.p(processName, "processName");
        this.f159612a = processName;
        this.f159613b = i10;
        this.f159614c = i11;
        this.f159615d = z10;
    }

    public static /* synthetic */ e0 f(e0 e0Var, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = e0Var.f159612a;
        }
        if ((i12 & 2) != 0) {
            i10 = e0Var.f159613b;
        }
        if ((i12 & 4) != 0) {
            i11 = e0Var.f159614c;
        }
        if ((i12 & 8) != 0) {
            z10 = e0Var.f159615d;
        }
        return e0Var.e(str, i10, i11, z10);
    }

    @oy.l
    public final String a() {
        return this.f159612a;
    }

    public final int b() {
        return this.f159613b;
    }

    public final int c() {
        return this.f159614c;
    }

    public final boolean d() {
        return this.f159615d;
    }

    @oy.l
    public final e0 e(@oy.l String processName, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.m0.p(processName, "processName");
        return new e0(processName, i10, i11, z10);
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.m0.g(this.f159612a, e0Var.f159612a) && this.f159613b == e0Var.f159613b && this.f159614c == e0Var.f159614c && this.f159615d == e0Var.f159615d;
    }

    public final int g() {
        return this.f159614c;
    }

    public final int h() {
        return this.f159613b;
    }

    public int hashCode() {
        return (((((this.f159612a.hashCode() * 31) + this.f159613b) * 31) + this.f159614c) * 31) + g8.a.a(this.f159615d);
    }

    @oy.l
    public final String i() {
        return this.f159612a;
    }

    public final boolean j() {
        return this.f159615d;
    }

    @oy.l
    public String toString() {
        return "ProcessDetails(processName=" + this.f159612a + ", pid=" + this.f159613b + ", importance=" + this.f159614c + ", isDefaultProcess=" + this.f159615d + ')';
    }
}
