package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ke2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw0 f151518a = new cw0();

    public final ke2 a(int i10) {
        this.f151518a.a(i10);
        return this;
    }

    public final ke2 a(le2 le2Var) {
        cw0 cw0Var = this.f151518a;
        dw0 dw0Var = le2Var.f151954b;
        cw0Var.getClass();
        for (int i10 = 0; i10 < dw0Var.f148382a.size(); i10++) {
            cw0Var.a(dw0Var.a(i10));
        }
        return this;
    }

    public final ke2 a(int... iArr) {
        cw0 cw0Var = this.f151518a;
        cw0Var.getClass();
        for (int i10 : iArr) {
            cw0Var.a(i10);
        }
        return this;
    }

    public final ke2 a(boolean z10, int i10) {
        cw0 cw0Var = this.f151518a;
        if (z10) {
            cw0Var.a(i10);
            return this;
        }
        cw0Var.getClass();
        return this;
    }

    public final le2 a() {
        return new le2(this.f151518a.a());
    }
}
