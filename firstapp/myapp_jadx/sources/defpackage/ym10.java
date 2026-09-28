package defpackage;

import com.sporty.android.core.model.timecontrol.SelfExclusionResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.main.viewmodel.PlayTimeControlMainViewModel$loadSelfExclusionStatus$1", f = "PlayTimeControlMainViewModel.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class ym10 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ cn10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym10(cn10 cn10Var, v1b<? super ym10> v1bVar) {
        super(2, v1bVar);
        this.b = cn10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ym10(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ym10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        er10 er10Var;
        String str;
        y5b y5bVar = y5b.a;
        int i = this.a;
        cn10 cn10Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            t47 t47Var = cn10Var.e;
            this.a = 1;
            obj = t47Var.a(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        lk50 lk50Var = (lk50) obj;
        wwd0 wwd0Var = cn10Var.a;
        if (lk50Var instanceof lk50.c) {
            cr10 cr10Var = cr10.SELF_EXCLUSION;
            Long endDate = ((SelfExclusionResponse) ((lk50.c) lk50Var).a).getSelfExclusion().getEndDate();
            if (endDate == null || endDate.longValue() <= 0) {
                str = null;
            } else {
                long jLongValue = endDate.longValue() - System.currentTimeMillis();
                if (jLongValue <= 0) {
                    str = null;
                } else {
                    str = (jLongValue / 3600000) + "h " + ((jLongValue / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) % 60) + "min";
                }
            }
            er10Var = new er10(8, str, false);
        } else {
            er10Var = new er10(15, null, false);
        }
        wwd0Var.getClass();
        wwd0Var.k(null, er10Var);
        return Unit.a;
    }
}
