package h6;

import x4.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f87803e = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f87807d;

    public c(int i10, int i11, int i12, int i13) {
        this.f87804a = i10;
        this.f87805b = i11;
        this.f87806c = i12;
        this.f87807d = i13;
    }

    public static c b(v0 v0Var) {
        int iF = v0Var.F();
        v0Var.l0(8);
        int iF2 = v0Var.F();
        int iF3 = v0Var.F();
        v0Var.l0(4);
        int iF4 = v0Var.F();
        v0Var.l0(12);
        return new c(iF, iF2, iF3, iF4);
    }

    public boolean a() {
        return (this.f87805b & 16) == 16;
    }

    @Override // h6.a
    public int getType() {
        return 1751742049;
    }
}
