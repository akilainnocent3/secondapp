package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.mission.ShowMissionViewModel$resetMissionReportState$1", f = "ShowMissionViewModel.kt", l = {194}, m = "invokeSuspend", v = 2)
public final class ra90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ sa90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra90(v1b v1bVar, sa90 sa90Var) {
        super(2, v1bVar);
        this.b = sa90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ra90(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ra90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        sa90 sa90Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            wm20<Long> betSlipMissionReportCount = sa90Var.e.getBetSlipMissionReportCount();
            Long l = new Long(0L);
            this.a = 1;
            if (betSlipMissionReportCount.g(this, l) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        sa90Var.D.setValue(ltv.b.a);
        return Unit.a;
    }
}
