package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.data.repository.lobby.LobbyRepository$joinRoom$2", f = "LobbyRepository.kt", l = {57}, m = "invokeSuspend", v = 1)
public final class s1t extends tje0 implements Function1<v1b<? super HTTPResponse<u9p>>, Object> {
    public int a;
    public final /* synthetic */ v1t b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1t(v1t v1tVar, long j, v1b<? super s1t> v1bVar) {
        super(1, v1bVar);
        this.b = v1tVar;
        this.c = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new s1t(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<u9p>> v1bVar) {
        return ((s1t) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object objC = iu00Var.c(this.c, this);
        return objC == y5bVar ? y5bVar : objC;
    }
}
