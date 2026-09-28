package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class l120 implements a0b {
    public final String a;
    public final int b;
    public final be0 c;
    public final se0<PointF, PointF> d;
    public final be0 e;
    public final be0 f;
    public final be0 g;
    public final be0 h;
    public final be0 i;
    public final boolean j;
    public final boolean k;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Object;Lbe0;Lse0<Landroid/graphics/PointF;Landroid/graphics/PointF;>;Lbe0;Lbe0;Lbe0;Lbe0;Lbe0;ZZ)V */
    public l120(String str, int i, be0 be0Var, se0 se0Var, be0 be0Var2, be0 be0Var3, be0 be0Var4, be0 be0Var5, be0 be0Var6, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = be0Var;
        this.d = se0Var;
        this.e = be0Var2;
        this.f = be0Var3;
        this.g = be0Var4;
        this.h = be0Var5;
        this.i = be0Var6;
        this.j = z;
        this.k = z2;
    }

    @Override // defpackage.a0b
    public final cza a(iot iotVar, xmt xmtVar, w12 w12Var) {
        return new j120(iotVar, w12Var, this);
    }
}
