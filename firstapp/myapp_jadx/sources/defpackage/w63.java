package defpackage;

import com.sporty.android.book.domain.entity.BetTypeAnyWinConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$fetchAnyWinConfig$1", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w63 extends tje0 implements Function2<BetTypeAnyWinConfig, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ q73 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w63(q73 q73Var, v1b<? super w63> v1bVar) {
        super(2, v1bVar);
        this.b = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        w63 w63Var = new w63(this.b, v1bVar);
        w63Var.a = obj;
        return w63Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BetTypeAnyWinConfig betTypeAnyWinConfig, v1b<? super Unit> v1bVar) {
        return ((w63) create(betTypeAnyWinConfig, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BetTypeAnyWinConfig betTypeAnyWinConfig = (BetTypeAnyWinConfig) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        q73 q73Var = this.b;
        q73Var.F0.m(betTypeAnyWinConfig);
        if (!q73Var.A0) {
            q73Var.A0 = true;
            q73Var.U1();
        }
        return Unit.a;
    }
}
