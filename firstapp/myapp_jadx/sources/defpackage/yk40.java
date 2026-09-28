package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class yk40 implements a0b {
    public final String a;
    public final se0<PointF, PointF> b;
    public final se0<PointF, PointF> c;
    public final be0 d;
    public final boolean e;

    public yk40(String str, se0 se0Var, he0 he0Var, be0 be0Var, boolean z) {
        this.a = str;
        this.b = se0Var;
        this.c = he0Var;
        this.d = be0Var;
        this.e = z;
    }

    @Override // defpackage.a0b
    public final cza a(iot iotVar, xmt xmtVar, w12 w12Var) {
        return new xk40(iotVar, w12Var, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
