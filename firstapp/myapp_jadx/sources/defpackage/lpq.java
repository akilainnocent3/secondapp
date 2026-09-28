package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$2", f = "LNLobbyViewModel.kt", l = {300}, m = "invokeSuspend", v = 2)
public final class lpq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b8k b;
    public final /* synthetic */ spq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpq(b8k b8kVar, spq spqVar, v1b<? super lpq> v1bVar) {
        super(2, v1bVar);
        this.b = b8kVar;
        this.c = spqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lpq(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lpq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            l1i l1iVarA = this.b.a();
            this.a = 1;
            if (s0i.c(l1iVarA, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        this.c.y1();
        return Unit.a;
    }
}
