package defpackage;

import com.sportybet.plugin.realsports.data.sim.SimShareData;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public final class y8k {
    public final hrd0 a;
    public final jrm b;
    public final nzm c;

    public y8k(hrd0 hrd0Var, jrm jrmVar, nzm nzmVar) {
        hrd0Var.getClass();
        jrmVar.getClass();
        nzmVar.getClass();
        this.a = hrd0Var;
        this.b = jrmVar;
        this.c = nzmVar;
    }

    public final BigDecimal a() {
        jrm jrmVar = this.b;
        if (jrmVar.m0()) {
            return SimShareData.INSTANCE.getSimMinStake();
        }
        if (!jrmVar.D()) {
            return this.a.y().getMinStake();
        }
        BigDecimal bigDecimalF = this.c.f();
        bigDecimalF.getClass();
        return bigDecimalF;
    }
}
