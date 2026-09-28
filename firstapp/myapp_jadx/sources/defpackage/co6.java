package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.cashout.EventInfoTrackingWidgetEnabledConfigs;
import com.sportybet.android.cashoutphase3.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$fetchLiveEventConfig$1", f = "CashOutViewModel.kt", l = {1101}, m = "invokeSuspend", v = 2)
public final class co6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co6(h hVar, v1b<? super co6> v1bVar) {
        super(2, v1bVar);
        this.c = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        co6 co6Var = new co6(this.c, v1bVar);
        co6Var.b = obj;
        return co6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((co6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                h hVar = this.c;
                zi50.a aVar = zi50.b;
                yo6 yo6Var = hVar.A;
                this.b = null;
                this.a = 1;
                obj = yo6Var.b(this);
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
            bVar = (EventInfoTrackingWidgetEnabledConfigs) obj;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_CASHOUT);
            aVar4.a("[getLiveEventConfig] get config fail.", new Object[0]);
        }
        return Unit.a;
    }
}
