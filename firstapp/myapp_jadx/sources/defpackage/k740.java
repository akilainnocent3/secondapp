package defpackage;

import com.sportybet.android.bethistory.data.db.entity.RealBetHistoryOrderEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$handleRemixBetClick$1", f = "RealBetHistoryViewModel.kt", l = {581}, m = "invokeSuspend", v = 2)
public final class k740 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d740 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ q440 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k740(d740 d740Var, String str, q440 q440Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = d740Var;
        this.c = str;
        this.d = q440Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k740(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k740) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        d740 d740Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            at2 at2Var = d740Var.b;
            this.a = 1;
            obj = at2Var.n(this.c, this);
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
        RealBetHistoryOrderEntity realBetHistoryOrderEntity = (RealBetHistoryOrderEntity) obj;
        if (realBetHistoryOrderEntity == null) {
            return Unit.a;
        }
        Integer winningStatus = realBetHistoryOrderEntity.getWinningStatus();
        if (winningStatus != null) {
            d740Var.y.a(winningStatus.intValue());
        }
        this.d.invoke(egi.a(realBetHistoryOrderEntity.getShareCode(), realBetHistoryOrderEntity.getOrderId(), realBetHistoryOrderEntity.getCurrency(), realBetHistoryOrderEntity.getOrderType(), realBetHistoryOrderEntity.getTotalStake(), realBetHistoryOrderEntity.getSelections()));
        return Unit.a;
    }
}
