package defpackage;

import com.sporty.android.core.model.luckywheel.TicketInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel$refreshLuckyWheelDestination$1", f = "WelcomeRewardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m5j0 extends tje0 implements Function2<lk50<? extends TicketInfo>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ w4j0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5j0(v1b v1bVar, w4j0 w4j0Var) {
        super(2, v1bVar);
        this.b = w4j0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m5j0 m5j0Var = new m5j0(v1bVar, this.b);
        m5j0Var.a = obj;
        return m5j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends TicketInfo> lk50Var, v1b<? super Unit> v1bVar) {
        return ((m5j0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.K = (!(lk50Var instanceof lk50.c) || ((TicketInfo) ((lk50.c) lk50Var).a).getTicketNum() <= 0) ? wae.ME_GIFTS : wae.LUCKY_WHEEL;
        return Unit.a;
    }
}
