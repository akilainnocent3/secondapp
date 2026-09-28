package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.compose.lobbyv2.models.LobbyConfig;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$getLobby$1", f = "LobbyV2ViewModel.kt", l = {937}, m = "invokeSuspend", v = 1)
public final class wbt extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ LobbyV2ViewModel b;
    public final /* synthetic */ Function1<LobbyConfig, Unit> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wbt(LobbyV2ViewModel lobbyV2ViewModel, Function1<? super LobbyConfig, Unit> function1, v1b<? super wbt> v1bVar) {
        super(2, v1bVar);
        this.b = lobbyV2ViewModel;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wbt(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wbt) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        LobbyConfig lobbyConfig = null;
        LobbyV2ViewModel lobbyV2ViewModel = this.b;
        if (i == 0) {
            uj50.b(obj);
            r8t r8tVar = lobbyV2ViewModel.a;
            this.a = 1;
            r8tVar.getClass();
            obj = r8t.c(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ResultWrapper resultWrapper = (ResultWrapper) obj;
        boolean z = resultWrapper instanceof ResultWrapper.Success;
        Function1<LobbyConfig, Unit> function1 = this.c;
        if (z) {
            LobbyConfig lobbyConfig2 = (LobbyConfig) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
            if (lobbyConfig2 != null) {
                lobbyV2ViewModel.v = lobbyConfig2;
                lobbyConfig = lobbyConfig2;
            }
            function1.invoke(lobbyConfig);
        } else {
            function1.invoke(null);
        }
        return Unit.a;
    }
}
