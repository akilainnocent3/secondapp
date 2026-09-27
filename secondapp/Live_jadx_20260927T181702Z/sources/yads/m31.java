package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class m31 extends p31 {
    public m31(float f10) {
        super(f10);
    }

    @Override // yads.p31
    public final o31 a(Context context, int i10, int i11, int i12) {
        int iL0 = is.d.L0(i10 * this.f153697a);
        return new o31(iL0, is.d.L0(i12 * (iL0 / i11)));
    }

    @Override // yads.p31
    public final float a(float f10) {
        return ms.u.H(f10, 0.01f, 1.0f);
    }
}
