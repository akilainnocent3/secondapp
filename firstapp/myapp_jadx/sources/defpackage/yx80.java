package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class yx80 implements a0b {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final ae0 d;
    public final de0 e;
    public final boolean f;

    public yx80(String str, boolean z, Path.FillType fillType, ae0 ae0Var, de0 de0Var, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = ae0Var;
        this.e = de0Var;
        this.f = z2;
    }

    @Override // defpackage.a0b
    public final cza a(iot iotVar, xmt xmtVar, w12 w12Var) {
        return new slh(iotVar, w12Var, this);
    }

    public final String toString() {
        return ruw.a(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
