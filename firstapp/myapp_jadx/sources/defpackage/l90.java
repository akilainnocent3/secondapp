package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes.dex */
public final class l90 implements pxz {
    public final PathMeasure a;

    public l90(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    @Override // defpackage.pxz
    public final void a(j90 j90Var) {
        this.a.setPath(j90Var != null ? j90Var.a : null, false);
    }

    @Override // defpackage.pxz
    public final boolean b(float f, float f2, j90 j90Var) {
        if (j90Var != null) {
            return this.a.getSegment(f, f2, j90Var.a, true);
        }
        zkh.a("Unable to obtain android.graphics.Path");
        return false;
    }

    @Override // defpackage.pxz
    public final float getLength() {
        return this.a.getLength();
    }
}
