package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class hvj0 {
    public final vvj0 a;
    public final yy20 b;
    public final pwj0 c;

    static {
        jgt.g("WMFgUpdater");
    }

    public hvj0(WorkDatabase workDatabase, yy20 yy20Var, vvj0 vvj0Var) {
        this.b = yy20Var;
        this.a = vvj0Var;
        this.c = workDatabase.C();
    }
}
