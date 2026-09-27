package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c32 implements ac2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e32 f147541a;

    public c32(e32 e32Var) {
        this.f147541a = e32Var;
    }

    @Override // yads.ac2
    public final void a() {
        e32 e32Var = this.f147541a;
        tj2 tj2Var = e32Var.f148483d;
        if (tj2Var != null) {
            tj2Var.a();
        }
        z3 z3Var = e32Var.f148482c;
        if (z3Var != null) {
            z3Var.b();
        }
    }
}
