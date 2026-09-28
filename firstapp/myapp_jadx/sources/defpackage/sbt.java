package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.compose.lobbyv2.models.LobbyV2SearchResultsModel;
import com.sportygames.compose.lobbyv2.models.UIState;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$clearSearch$1", f = "LobbyV2ViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class sbt extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ LobbyV2ViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbt(LobbyV2ViewModel lobbyV2ViewModel, v1b<? super sbt> v1bVar) {
        super(2, v1bVar);
        this.a = lobbyV2ViewModel;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sbt(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sbt) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ssw<UIState<HTTPResponse<LobbyV2SearchResultsModel>>> sswVar = this.a.C;
        UIState.INSTANCE.getClass();
        sswVar.j(UIState.Companion.b());
        return Unit.a;
    }
}
