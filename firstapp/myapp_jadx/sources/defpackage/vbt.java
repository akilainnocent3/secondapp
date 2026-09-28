package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeModel;
import com.sportygames.compose.lobbyv2.models.UIState;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$getFavourites$1", f = "LobbyV2ViewModel.kt", l = {1276}, m = "invokeSuspend", v = 1)
public final class vbt extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public HTTPResponse a;
    public LobbyV2ViewModel b;
    public HTTPResponse c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ LobbyV2ViewModel f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbt(LobbyV2ViewModel lobbyV2ViewModel, v1b<? super vbt> v1bVar) {
        super(2, v1bVar);
        this.f = lobbyV2ViewModel;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vbt vbtVar = new vbt(this.f, v1bVar);
        vbtVar.e = obj;
        return vbtVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vbt) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        HTTPResponse hTTPResponseCopy$default;
        Object objP1;
        LobbyV2ViewModel lobbyV2ViewModel;
        HTTPResponse hTTPResponse;
        HTTPResponse<LobbyV2HomeModel> data;
        LobbyV2ViewModel lobbyV2ViewModel2 = this.f;
        v5b v5bVar = (v5b) this.e;
        y5b y5bVar = y5b.a;
        int i = this.d;
        try {
            if (i == 0) {
                uj50.b(obj);
                if (w5b.e(v5bVar)) {
                    UIState<HTTPResponse<LobbyV2HomeModel>> uIStateD = lobbyV2ViewModel2.A.d();
                    hTTPResponseCopy$default = (uIStateD == null || (data = uIStateD.getData()) == null) ? null : HTTPResponse.copy$default(data, null, null, null, null, null, null, null, 127, null);
                    if (hTTPResponseCopy$default != null) {
                        LobbyV2HomeModel lobbyV2HomeModel = (LobbyV2HomeModel) hTTPResponseCopy$default.getData();
                        this.e = null;
                        this.a = hTTPResponseCopy$default;
                        this.b = lobbyV2ViewModel2;
                        this.c = hTTPResponseCopy$default;
                        this.d = 1;
                        objP1 = lobbyV2ViewModel2.P1(lobbyV2HomeModel, this);
                        if (objP1 == y5bVar) {
                            return y5bVar;
                        }
                        lobbyV2ViewModel = lobbyV2ViewModel2;
                        hTTPResponse = hTTPResponseCopy$default;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hTTPResponse = this.c;
            LobbyV2ViewModel lobbyV2ViewModel3 = this.b;
            HTTPResponse hTTPResponse2 = this.a;
            uj50.b(obj);
            lobbyV2ViewModel = lobbyV2ViewModel3;
            hTTPResponseCopy$default = hTTPResponse2;
            objP1 = obj;
            hTTPResponse.setData(objP1);
            ssw<UIState<HTTPResponse<LobbyV2HomeModel>>> sswVar = lobbyV2ViewModel.A;
            UIState.INSTANCE.getClass();
            sswVar.j(UIState.Companion.c(hTTPResponseCopy$default));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.a;
    }
}
