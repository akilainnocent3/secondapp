package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$requestTotalBonusAmountForPlaceBetRequest$1", f = "BetSlipViewModel.kt", l = {1526}, m = "invokeSuspend", v = 2)
public final class w73 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ku90 a;
    public int b;
    public final /* synthetic */ q73 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w73(q73 q73Var, v1b<? super w73> v1bVar) {
        super(2, v1bVar);
        this.c = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new w73(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((w73) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ku90<x53> ku90Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            q73 q73Var = this.c;
            ku90<x53> ku90Var2 = q73Var.q1;
            this.a = ku90Var2;
            this.b = 1;
            obj = ej5.d(q73Var.S, new j73(q73Var, null), this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            ku90Var = ku90Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ku90Var = this.a;
            uj50.b(obj);
        }
        obj.getClass();
        ku90Var.a(new x53.q((BigDecimal) obj));
        return Unit.a;
    }
}
