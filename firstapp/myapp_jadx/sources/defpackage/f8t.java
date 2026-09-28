package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.remote.LobbyV2Repository$getLobbySegmentCampaign$2", f = "LobbyV2Repository.kt", l = {124}, m = "invokeSuspend", v = 1)
public final class f8t extends tje0 implements Function1<v1b<? super HTTPResponse<String>>, Object> {
    public int a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new f8t(1, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<String>> v1bVar) {
        return ((f8t) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object objP = g2tVarI.p(this);
        return objP == y5bVar ? y5bVar : objP;
    }
}
