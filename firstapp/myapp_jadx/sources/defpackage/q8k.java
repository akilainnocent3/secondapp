package defpackage;

import com.sportybet.plugin.realsports.data.sim.SimShareData;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes7.dex */
public final class q8k {
    public final hrd0 a;
    public final jrm b;

    public q8k(hrd0 hrd0Var, jrm jrmVar) {
        hrd0Var.getClass();
        jrmVar.getClass();
        this.a = hrd0Var;
        this.b = jrmVar;
    }

    public final BigDecimal a() {
        if (!this.b.m0()) {
            return this.a.y().getMaxPayout();
        }
        BigDecimal bigDecimalDivide = SimShareData.INSTANCE.getSimMaxPayout().divide(SimulateBetConsts.MAGIC_NUMBER, 2, RoundingMode.HALF_UP);
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }
}
