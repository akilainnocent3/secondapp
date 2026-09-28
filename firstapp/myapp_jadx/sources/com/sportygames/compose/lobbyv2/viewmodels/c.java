package com.sportygames.compose.lobbyv2.viewmodels;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2SearchResultsModel;
import com.sportygames.compose.lobbyv2.models.UIState;
import defpackage.c0d;
import defpackage.ib5;
import defpackage.r8t;
import defpackage.ssw;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$getSearchResult$1", f = "LobbyV2ViewModel.kt", l = {1736}, m = "invokeSuspend", v = 1)
public final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ LobbyV2ViewModel b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LobbyV2ViewModel lobbyV2ViewModel, String str, Integer num, boolean z, boolean z2, v1b<? super c> v1bVar) {
        super(2, v1bVar);
        this.b = lobbyV2ViewModel;
        this.c = str;
        this.d = num;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        LobbyV2ViewModel lobbyV2ViewModel = this.b;
        if (i == 0) {
            uj50.b(obj);
            ssw<UIState<HTTPResponse<LobbyV2SearchResultsModel>>> sswVar = lobbyV2ViewModel.C;
            UIState.INSTANCE.getClass();
            sswVar.j(UIState.Companion.d());
            r8t r8tVar = lobbyV2ViewModel.a;
            Integer num = this.d;
            Integer num2 = ((num != null && num.intValue() == 999888999) || (num != null && num.intValue() == 0)) ? null : num;
            this.a = 1;
            obj = r8tVar.e(this.c, num2, this.e, this.f, this);
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
        if (resultWrapper instanceof ResultWrapper.Success) {
            ResultWrapper.Success success = (ResultWrapper.Success) resultWrapper;
            LobbyV2SearchResultsModel lobbyV2SearchResultsModel = (LobbyV2SearchResultsModel) ((HTTPResponse) success.getValue()).getData();
            List<LobbyV2GameDetailsModel> listD = LobbyV2ViewModel.a.d(lobbyV2SearchResultsModel != null ? lobbyV2SearchResultsModel.getData() : null);
            LobbyV2SearchResultsModel lobbyV2SearchResultsModel2 = (LobbyV2SearchResultsModel) ((HTTPResponse) success.getValue()).getData();
            List<LobbyV2GameDetailsModel> listD2 = LobbyV2ViewModel.a.d(lobbyV2SearchResultsModel2 != null ? lobbyV2SearchResultsModel2.getSuggestions() : null);
            LobbyV2SearchResultsModel lobbyV2SearchResultsModel3 = (LobbyV2SearchResultsModel) ((HTTPResponse) success.getValue()).getData();
            if (lobbyV2SearchResultsModel3 != null) {
                lobbyV2SearchResultsModel3.setData(listD);
            }
            LobbyV2SearchResultsModel lobbyV2SearchResultsModel4 = (LobbyV2SearchResultsModel) ((HTTPResponse) success.getValue()).getData();
            if (lobbyV2SearchResultsModel4 != null) {
                lobbyV2SearchResultsModel4.setSuggestions(listD2);
            }
            ssw<UIState<HTTPResponse<LobbyV2SearchResultsModel>>> sswVar2 = lobbyV2ViewModel.C;
            UIState.Companion companion = UIState.INSTANCE;
            Object value = success.getValue();
            companion.getClass();
            sswVar2.j(UIState.Companion.c(value));
        } else {
            lobbyV2ViewModel.C.j(UIState.Companion.a(UIState.INSTANCE));
        }
        return Unit.a;
    }
}
