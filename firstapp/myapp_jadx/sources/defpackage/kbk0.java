package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.debugscreen.impl.zadepositlobby.ZaDepositLobbyDebugViewModel$clearCutoffOverride$1", f = "ZaDepositLobbyDebugViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
public final class kbk0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ jbk0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbk0(jbk0 jbk0Var, v1b<? super kbk0> v1bVar) {
        super(2, v1bVar);
        this.b = jbk0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kbk0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kbk0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            z1d z1dVar = this.b.d;
            wm20 wm20VarA = z1dVar.d.a(z1dVar, z1d.f[2]);
            Long l = new Long(0L);
            this.a = 1;
            if (wm20VarA.g(this, l) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
