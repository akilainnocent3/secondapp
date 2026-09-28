package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltyOddsFilterHandlerImpl$init$7", f = "SportyPenaltyOddsFilterHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fzc0 extends tje0 implements Function2<it7<BigDecimal>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ gzc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzc0(gzc0 gzc0Var, v1b<? super fzc0> v1bVar) {
        super(2, v1bVar);
        this.b = gzc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fzc0 fzc0Var = new fzc0(this.b, v1bVar);
        fzc0Var.a = obj;
        return fzc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(it7<BigDecimal> it7Var, v1b<? super Unit> v1bVar) {
        return ((fzc0) create(it7Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        it7 it7Var = (it7) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.e;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, it7Var));
        return Unit.a;
    }
}
