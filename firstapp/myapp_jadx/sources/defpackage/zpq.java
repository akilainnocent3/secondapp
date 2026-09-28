package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$launchAndEmit$1", f = "LNLobbyViewModel.kt", l = {510}, m = "invokeSuspend", v = 2)
public final class zpq extends tje0 implements Function2<lk50<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ztw<lk50<Object>> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpq(ztw<lk50<Object>> ztwVar, v1b<? super zpq> v1bVar) {
        super(2, v1bVar);
        this.c = ztwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zpq zpqVar = new zpq(this.c, v1bVar);
        zpqVar.b = obj;
        return zpqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<Object> lk50Var, v1b<? super Unit> v1bVar) {
        return ((zpq) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50<Object> lk50Var = (lk50) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b = null;
            this.a = 1;
            if (this.c.emit(lk50Var, this) == y5bVar) {
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
