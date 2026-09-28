package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.data.repository.lobby.LobbyRepository$fetchWalletInfo$2", f = "LobbyRepository.kt", l = {98}, m = "invokeSuspend", v = 1)
public final class m1t extends tje0 implements Function1<v1b<? super HTTPResponse<ixi0>>, Object> {
    public int a;
    public final /* synthetic */ v1t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1t(v1t v1tVar, v1b<? super m1t> v1bVar) {
        super(1, v1bVar);
        this.b = v1tVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new m1t(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<ixi0>> v1bVar) {
        return ((m1t) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        zu00 zu00Var = (zu00) this.b.n.getValue();
        this.a = 1;
        Object objA = zu00Var.a(this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
