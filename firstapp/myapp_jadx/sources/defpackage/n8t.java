package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.compose.lobbyv2.models.LobbyV2SearchResultsModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.remote.LobbyV2Repository$getSearchResult$5$1", f = "LobbyV2Repository.kt", l = {168}, m = "invokeSuspend", v = 1)
public final class n8t extends tje0 implements Function1<v1b<? super HTTPResponse<LobbyV2SearchResultsModel>>, Object> {
    public int a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8t(String str, Integer num, v1b v1bVar) {
        super(1, v1bVar);
        this.b = num;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new n8t(this.c, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<LobbyV2SearchResultsModel>> v1bVar) {
        return ((n8t) create(v1bVar)).invokeSuspend(Unit.a);
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
        int iIntValue = this.b.intValue();
        this.a = 1;
        Object objH = g2tVarI.h(iIntValue, this.c, this);
        return objH == y5bVar ? y5bVar : objH;
    }
}
