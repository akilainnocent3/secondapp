package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$handleAction$2", f = "LNLobbyViewModel.kt", l = {409}, m = "invokeSuspend", v = 2)
public final class wpq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ spq b;
    public final /* synthetic */ jmq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpq(spq spqVar, jmq jmqVar, v1b<? super wpq> v1bVar) {
        super(2, v1bVar);
        this.b = spqVar;
        this.c = jmqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wpq(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wpq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            spq spqVar = this.b;
            spqVar.y1();
            wwd0 wwd0Var = spqVar.I;
            ipq ipqVar = ((jmq.o) this.c).a;
            this.a = 1;
            wwd0Var.setValue(ipqVar);
            if (Unit.a == y5bVar) {
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
