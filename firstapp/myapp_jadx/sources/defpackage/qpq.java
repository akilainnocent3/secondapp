package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$7", f = "LNLobbyViewModel.kt", l = {339}, m = "invokeSuspend", v = 2)
public final class qpq extends tje0 implements Function2<fpq, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ spq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpq(v1b v1bVar, spq spqVar) {
        super(2, v1bVar);
        this.b = spqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qpq(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(fpq fpqVar, v1b<? super Unit> v1bVar) {
        return ((qpq) create(fpqVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ku90<lmq> ku90Var = this.b.z;
            lmq.a aVar = lmq.a.a;
            this.a = 1;
            if (ku90Var.a.emit(aVar, this) == y5bVar) {
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
