package defpackage;

import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$updateFlexiBetConfig$1", f = "BetSlipViewModel.kt", l = {1044}, m = "invokeSuspend", v = 2)
public final class f83 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ q73 b;
    public final /* synthetic */ BetTypeFlexiBetConfig c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f83(q73 q73Var, BetTypeFlexiBetConfig betTypeFlexiBetConfig, v1b<? super f83> v1bVar) {
        super(2, v1bVar);
        this.b = q73Var;
        this.c = betTypeFlexiBetConfig;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f83(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f83) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        BetTypeFlexiBetConfig betTypeFlexiBetConfig = this.c;
        q73 q73Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            w43 w43Var = q73Var.d0;
            this.a = 1;
            if (w43Var.b(betTypeFlexiBetConfig, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        q73Var.D0.m(betTypeFlexiBetConfig);
        return Unit.a;
    }
}
