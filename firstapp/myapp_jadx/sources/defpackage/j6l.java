package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class j6l implements a0b {
    public final p6l a;
    public final Path.FillType b;
    public final ce0 c;
    public final de0 d;
    public final he0 e;
    public final he0 f;
    public final String g;
    public final boolean h;

    public j6l(String str, p6l p6lVar, Path.FillType fillType, ce0 ce0Var, de0 de0Var, he0 he0Var, he0 he0Var2, boolean z) {
        this.a = p6lVar;
        this.b = fillType;
        this.c = ce0Var;
        this.d = de0Var;
        this.e = he0Var;
        this.f = he0Var2;
        this.g = str;
        this.h = z;
    }

    @Override // defpackage.a0b
    public final cza a(iot iotVar, xmt xmtVar, w12 w12Var) {
        return new k6l(iotVar, xmtVar, w12Var, this);
    }
}
