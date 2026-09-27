package cf;

import eh.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c implements a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f23070e = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23074d;

    public c(int i10, int i11, int i12, int i13) {
        this.f23071a = i10;
        this.f23072b = i11;
        this.f23073c = i12;
        this.f23074d = i13;
    }

    public static c b(t0 t0Var) {
        int iW = t0Var.w();
        t0Var.Z(8);
        int iW2 = t0Var.w();
        int iW3 = t0Var.w();
        t0Var.Z(4);
        int iW4 = t0Var.w();
        t0Var.Z(12);
        return new c(iW, iW2, iW3, iW4);
    }

    public boolean a() {
        return (this.f23072b & 16) == 16;
    }

    @Override // cf.a
    public int getType() {
        return 1751742049;
    }
}
