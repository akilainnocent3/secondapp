package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.data.repository.lobby.LobbyRepository$isAvailable$2", f = "LobbyRepository.kt", l = {84}, m = "invokeSuspend", v = 1)
public final class q1t extends tje0 implements Function1<v1b<? super HTTPResponse<phj>>, Object> {
    public int a;
    public final /* synthetic */ v1t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1t(v1t v1tVar, v1b<? super q1t> v1bVar) {
        super(1, v1bVar);
        this.b = v1tVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new q1t(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<phj>> v1bVar) {
        return ((q1t) create(v1bVar)).invokeSuspend(Unit.a);
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
        iu00 iu00Var = (iu00) this.b.o.getValue();
        this.a = 1;
        Object objB = iu00Var.b(this);
        return objB == y5bVar ? y5bVar : objB;
    }
}
