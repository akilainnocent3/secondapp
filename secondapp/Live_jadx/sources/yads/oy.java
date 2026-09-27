package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oy implements ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj1 f153644a = new hj1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij1[] f153645b;

    public oy(ij1... ij1VarArr) {
        this.f153645b = ij1VarArr;
    }

    @Override // yads.ij1
    public final hj1 a(int i10, int i11) {
        ij1[] ij1VarArr = this.f153645b;
        int length = ij1VarArr.length;
        int i12 = 0;
        while (i12 < length) {
            hj1 hj1VarA = ij1VarArr[i12].a(i10, i11);
            int i13 = hj1VarA.f150155a;
            i12++;
            i11 = hj1VarA.f150156b;
            i10 = i13;
        }
        hj1 hj1Var = this.f153644a;
        hj1Var.f150155a = i10;
        hj1Var.f150156b = i11;
        return hj1Var;
    }
}
