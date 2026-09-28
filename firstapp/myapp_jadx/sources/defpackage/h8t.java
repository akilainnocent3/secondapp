package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.compose.lobbyv2.models.LobbyV2ProviderGamesResponseModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.remote.LobbyV2Repository$getProviderResponse$2", f = "LobbyV2Repository.kt", l = {60}, m = "invokeSuspend", v = 1)
public final class h8t extends tje0 implements Function1<v1b<? super HTTPResponse<LobbyV2ProviderGamesResponseModel>>, Object> {
    public int a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Integer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8t(Integer num, int i, Integer num2, v1b<? super h8t> v1bVar) {
        super(1, v1bVar);
        this.b = num;
        this.c = i;
        this.d = num2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new h8t(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<LobbyV2ProviderGamesResponseModel>> v1bVar) {
        return ((h8t) create(v1bVar)).invokeSuspend(Unit.a);
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
        mpe0 mpe0Var = on0.a;
        g2t g2tVarI = on0.i();
        this.a = 1;
        Object objL = g2tVarI.l(this.b, this.c, this.d, this);
        return objL == y5bVar ? y5bVar : objL;
    }
}
