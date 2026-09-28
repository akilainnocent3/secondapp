package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.compose.lobbyv2.models.LobbyV2CategoryItemModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.remote.LobbyV2Repository$getLobbyV2CategoryResponse$2", f = "LobbyV2Repository.kt", l = {22}, m = "invokeSuspend", v = 1)
public final class g8t extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends LobbyV2CategoryItemModel>>>, Object> {
    public int a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new g8t(1, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends LobbyV2CategoryItemModel>>> v1bVar) {
        return ((g8t) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object objB = g2tVarI.b(this);
        return objB == y5bVar ? y5bVar : objB;
    }
}
