package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betsucc.presentation.viewmodel.BetSuccessViewModel$checkShouldShowLoyaltyUnlocked$1", f = "BetSuccessViewModel.kt", l = {151}, m = "invokeSuspend", v = 2)
public final class n93 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ u93 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n93(u93 u93Var, v1b<? super n93> v1bVar) {
        super(2, v1bVar);
        this.b = u93Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new n93(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n93) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        u93 u93Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            ba90 ba90Var = u93Var.b;
            this.a = 1;
            obj = ba90Var.a(this);
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
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        u93Var.y.a(bool);
        return Unit.a;
    }
}
