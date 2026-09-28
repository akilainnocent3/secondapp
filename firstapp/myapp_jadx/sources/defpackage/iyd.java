package defpackage;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liyd;", "Lm02;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class iyd extends m02 {
    public final log0 l0;
    public final a300.d m0;
    public final m2g n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyd(uyx uyxVar, eth0 eth0Var, rdd0 rdd0Var, uy0 uy0Var, d100 d100Var, lyz lyzVar, wl wlVar, psm psmVar, mgb0 mgb0Var, uqm uqmVar, u290 u290Var, cbg cbgVar, vu60 vu60Var) {
        super(uyxVar, eth0Var, rdd0Var, uy0Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var, uqmVar, u290Var, cbgVar, vu60Var);
        rdd0Var.getClass();
        uy0Var.getClass();
        d100Var.getClass();
        lyzVar.getClass();
        wlVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        uqmVar.getClass();
        u290Var.getClass();
        cbgVar.getClass();
        vu60Var.getClass();
        this.l0 = log0.a;
        this.m0 = new a300.d(psmVar.getCountryCode());
        this.n0 = m2g.a;
    }

    @Override // defpackage.k72
    public final List<lyh<lk50<Object>>> A1() {
        return this.n0;
    }

    @Override // defpackage.m02, defpackage.k72
    public final y200 B1() {
        return this.m0;
    }

    @Override // defpackage.m02, defpackage.k72
    /* JADX INFO: renamed from: C1, reason: from getter */
    public final log0 getO0() {
        return this.l0;
    }

    @Override // defpackage.k72
    public final List<c9p> E1() {
        return m2g.a;
    }

    @Override // defpackage.m02
    /* JADX INFO: renamed from: J1 */
    public final a300 B1() {
        return this.m0;
    }
}
