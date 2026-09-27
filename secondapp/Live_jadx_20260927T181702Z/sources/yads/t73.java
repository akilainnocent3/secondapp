package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class t73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mn2[] f155743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final op0[] f155744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o83 f155745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f155746e;

    public t73(mn2[] mn2VarArr, op0[] op0VarArr, o83 o83Var, li1 li1Var) {
        this.f155743b = mn2VarArr;
        this.f155744c = (op0[]) op0VarArr.clone();
        this.f155745d = o83Var;
        this.f155746e = li1Var;
        this.f155742a = mn2VarArr.length;
    }

    public final boolean a(int i10) {
        return this.f155743b[i10] != null;
    }
}
