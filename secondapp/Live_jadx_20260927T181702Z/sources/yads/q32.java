package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class q32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f154245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cq2 f154246b;

    public q32(y00 y00Var, cq2 cq2Var) {
        this.f154245a = y00Var;
        this.f154246b = cq2Var;
    }

    public final boolean a() {
        a10 a10Var;
        y00 y00Var = this.f154245a;
        return (b() || this.f154245a.f158072b == null || !(y00Var.f158071a != null || (a10Var = y00Var.f158074d) == null || a(a10Var))) ? false : true;
    }

    public final boolean b() {
        if (this.f154245a.f158073c != null) {
            return cq2.f147872d == this.f154246b || !c();
        }
        return false;
    }

    public final boolean c() {
        a10 a10Var;
        y00 y00Var = this.f154245a;
        return (y00Var.f158071a != null || (a10Var = y00Var.f158074d) == null || a(a10Var) || cq2.f147872d == this.f154246b) ? false : true;
    }

    public static boolean a(a10 a10Var) {
        return kotlin.jvm.internal.m0.g("large", a10Var.f146609b) || kotlin.jvm.internal.m0.g("wide", a10Var.f146609b);
    }
}
