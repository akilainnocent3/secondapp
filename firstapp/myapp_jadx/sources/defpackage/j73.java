package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$getTotalBonusAmount$2", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j73 extends tje0 implements Function2<v5b, v1b<? super BigDecimal>, Object> {
    public final /* synthetic */ q73 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j73(q73 q73Var, v1b<? super j73> v1bVar) {
        super(2, v1bVar);
        this.a = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j73(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super BigDecimal> v1bVar) {
        return ((j73) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return this.a.O.z().setScale(2, RoundingMode.HALF_UP);
    }
}
