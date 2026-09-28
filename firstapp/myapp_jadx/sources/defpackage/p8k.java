package defpackage;

import com.sportybet.plugin.realsports.data.sim.SimShareData;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public final class p8k {
    public final hrd0 a;
    public final jrm b;

    public p8k(hrd0 hrd0Var, jrm jrmVar) {
        hrd0Var.getClass();
        jrmVar.getClass();
        this.a = hrd0Var;
        this.b = jrmVar;
    }

    public final BigDecimal a() {
        return this.b.m0() ? SimShareData.INSTANCE.getSimMaxStake() : this.a.y().getMaxStake();
    }
}
