package defpackage;

import com.sportybet.plugin.realsports.data.sim.SimShareData;

/* JADX INFO: loaded from: classes7.dex */
public final class o8k {
    public final hrd0 a;
    public final jrm b;

    public o8k(hrd0 hrd0Var, jrm jrmVar) {
        hrd0Var.getClass();
        jrmVar.getClass();
        this.a = hrd0Var;
        this.b = jrmVar;
    }

    public final int a() {
        return this.b.m0() ? SimShareData.INSTANCE.getMaxSelection() : this.a.y().getMaxSelectionLimit();
    }
}
