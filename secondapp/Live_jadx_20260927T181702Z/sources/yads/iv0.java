package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class iv0 implements ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj1 f150822a = new hj1();

    @Override // yads.ij1
    public final hj1 a(int i10, int i11) {
        int iL0 = is.d.L0(View.MeasureSpec.getSize(i11) * 0.1f);
        hj1 hj1Var = this.f150822a;
        hj1Var.f150155a = i10;
        hj1Var.f150156b = View.MeasureSpec.makeMeasureSpec(iL0, 1073741824);
        return this.f150822a;
    }
}
