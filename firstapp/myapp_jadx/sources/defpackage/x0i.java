package defpackage;

import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {53}, m = SimulateBetConsts.BetslipType.SINGLE)
public final class x0i<T> extends x1b {
    public dq40 a;
    public /* synthetic */ Object b;
    public int c;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return s0i.f(null, this);
    }
}
