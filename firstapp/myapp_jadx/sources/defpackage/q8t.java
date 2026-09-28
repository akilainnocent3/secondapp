package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.remote.LobbyV2Repository$removeFavourite$2", f = "LobbyV2Repository.kt", l = {116}, m = "invokeSuspend", v = 1)
public final class q8t extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends LobbyV2GameDetailsModel>>>, Object> {
    public int a;
    public final /* synthetic */ LobbyV2ViewModel.FavouriteRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8t(LobbyV2ViewModel.FavouriteRequest favouriteRequest, v1b<? super q8t> v1bVar) {
        super(1, v1bVar);
        this.b = favouriteRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new q8t(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends LobbyV2GameDetailsModel>>> v1bVar) {
        return ((q8t) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object objF = g2tVarI.f(this.b, this);
        return objF == y5bVar ? y5bVar : objF;
    }
}
