package yads;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dw0 f158784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f158785b;

    public ze(dw0 dw0Var, SparseArray sparseArray) {
        this.f158784a = dw0Var;
        SparseArray sparseArray2 = new SparseArray(dw0Var.a());
        for (int i10 = 0; i10 < dw0Var.a(); i10++) {
            int iA = dw0Var.a(i10);
            sparseArray2.append(iA, (ye) ni.a((ye) sparseArray.get(iA)));
        }
        this.f158785b = sparseArray2;
    }

    public final boolean a(int i10) {
        return this.f158784a.f148382a.get(i10);
    }
}
