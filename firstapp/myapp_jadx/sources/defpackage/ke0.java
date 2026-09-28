package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ke0 implements se0<PointF, PointF> {
    public final be0 a;
    public final be0 b;

    public ke0(be0 be0Var, be0 be0Var2) {
        this.a = be0Var;
        this.b = be0Var2;
    }

    @Override // defpackage.se0
    public final u12<PointF, PointF> b() {
        return new beb0(this.a.b(), this.b.b());
    }

    @Override // defpackage.se0
    public final List<cpp<PointF>> c() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.se0
    public final boolean d() {
        return this.a.d() && this.b.d();
    }
}
