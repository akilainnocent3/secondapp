package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f147559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cq2 f147560b;

    public c42(y00 y00Var, cq2 cq2Var) {
        this.f147559a = y00Var;
        this.f147560b = cq2Var;
    }

    public final boolean a() {
        y00 y00Var = this.f147559a;
        return (y00Var.f158084n == null && y00Var.f158077g == null && y00Var.f158079i == null && y00Var.f158073c == null && y00Var.f158072b == null) ? false : true;
    }

    public final boolean b() {
        if (this.f147559a.f158078h != null) {
            return cq2.f147871c == this.f147560b || !d();
        }
        return false;
    }

    public final boolean c() {
        a10 a10Var = this.f147559a.f158074d;
        if (a10Var != null) {
            return kotlin.jvm.internal.m0.g("large", a10Var.f146609b) || kotlin.jvm.internal.m0.g("wide", this.f147559a.f158074d.f146609b);
        }
        return false;
    }

    public final boolean d() {
        y00 y00Var = this.f147559a;
        return (y00Var.f158081k == null && y00Var.f158082l == null) ? false : true;
    }
}
