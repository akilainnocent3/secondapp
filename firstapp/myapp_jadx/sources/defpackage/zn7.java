package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class zn7 implements a0b {
    public final String a;
    public final se0<PointF, PointF> b;
    public final he0 c;
    public final boolean d;
    public final boolean e;

    public zn7(String str, se0<PointF, PointF> se0Var, he0 he0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = se0Var;
        this.c = he0Var;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.a0b
    public final cza a(iot iotVar, xmt xmtVar, w12 w12Var) {
        return new kwf(iotVar, w12Var, this);
    }
}
