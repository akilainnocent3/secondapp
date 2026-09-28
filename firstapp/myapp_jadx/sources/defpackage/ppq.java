package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$6", f = "LNLobbyViewModel.kt", l = {333}, m = "invokeSuspend", v = 2)
public final class ppq extends tje0 implements Function2<hpq, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ spq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppq(v1b v1bVar, spq spqVar) {
        super(2, v1bVar);
        this.c = spqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ppq ppqVar = new ppq(v1bVar, this.c);
        ppqVar.b = obj;
        return ppqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(hpq hpqVar, v1b<? super Unit> v1bVar) {
        return ((ppq) create(hpqVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        hpq hpqVar = (hpq) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (Intrinsics.g(hpqVar, gsq.a.a) || Intrinsics.g(hpqVar, b7r.a.a)) {
                ku90<lmq> ku90Var = this.c.z;
                lmq.a aVar = lmq.a.a;
                this.b = null;
                this.a = 1;
                if (ku90Var.a.emit(aVar, this) == y5bVar) {
                    return y5bVar;
                }
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
