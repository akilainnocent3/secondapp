package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xl0 implements ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj1 f157901a = new hj1();

    @Override // yads.ij1
    public final hj1 a(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        hj1 hj1Var = this.f157901a;
        hj1Var.f150155a = iMakeMeasureSpec;
        hj1Var.f150156b = iMakeMeasureSpec;
        return hj1Var;
    }
}
