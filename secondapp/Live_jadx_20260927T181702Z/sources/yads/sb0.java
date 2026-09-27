package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl[] f155342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ty2 f155343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d23 f155344c;

    public sb0(bl[] blVarArr, ty2 ty2Var, d23 d23Var) {
        bl[] blVarArr2 = new bl[blVarArr.length + 2];
        this.f155342a = blVarArr2;
        System.arraycopy(blVarArr, 0, blVarArr2, 0, blVarArr.length);
        this.f155343b = ty2Var;
        this.f155344c = d23Var;
        blVarArr2[blVarArr.length] = ty2Var;
        blVarArr2[blVarArr.length + 1] = d23Var;
    }

    public final bl[] a() {
        return this.f155342a;
    }
}
