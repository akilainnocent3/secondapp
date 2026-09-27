package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ok2 implements ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f153522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj1 f153523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mi f153524c;

    public ok2(float f10) {
        this(f10, new hj1());
    }

    @Override // yads.ij1
    public final hj1 a(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            int iRound = Math.round(size / this.f153524c.f152459a);
            if (mode2 == Integer.MIN_VALUE) {
                iRound = (int) Math.min(size2, iRound);
            }
            i11 = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
        } else if (mode2 == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0)) {
            int iRound2 = Math.round(size2 * this.f153524c.f152459a);
            if (mode == Integer.MIN_VALUE) {
                iRound2 = (int) Math.min(size, iRound2);
            }
            i10 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
        } else if (mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 != 0 && size != 0) {
            float f10 = size;
            float f11 = size2;
            if (f10 / f11 > this.f153522a) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.round(f11 * this.f153524c.f152459a), 1073741824);
                i11 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int iRound3 = Math.round(f10 / this.f153524c.f152459a);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i11 = View.MeasureSpec.makeMeasureSpec(iRound3, 1073741824);
                i10 = iMakeMeasureSpec;
            }
        }
        hj1 hj1Var = this.f153523b;
        hj1Var.f150155a = i10;
        hj1Var.f150156b = i11;
        return hj1Var;
    }

    public /* synthetic */ ok2(float f10, hj1 hj1Var) {
        this(f10, hj1Var, new mi(f10));
    }

    public ok2(float f10, hj1 hj1Var, mi miVar) {
        this.f153522a = f10;
        this.f153523b = hj1Var;
        this.f153524c = miVar;
    }
}
