package com.sportygames.compose.lobbyv2.viewmodels;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2SearchResultsModel;
import com.sportygames.compose.lobbyv2.models.UIState;
import defpackage.c0d;
import defpackage.ib5;
import defpackage.pm5;
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
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$prefetchDefaultSearchSuggestions$1", f = "LobbyV2ViewModel.kt", l = {1772}, m = "invokeSuspend", v = 1)
public final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ LobbyV2ViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LobbyV2ViewModel lobbyV2ViewModel, v1b v1bVar) {
        super(2, v1bVar);
        this.b = lobbyV2ViewModel;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        LobbyV2ViewModel lobbyV2ViewModel = this.b;
        ssw<UIState<List<LobbyV2GameDetailsModel>>> sswVar = lobbyV2ViewModel.D;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            UIState.INSTANCE.getClass();
            sswVar.j(UIState.Companion.d());
            r8t r8tVar = lobbyV2ViewModel.a;
            String str = pm5.SEARCH_TRENDING.a.c;
            this.a = 1;
            obj = r8tVar.e(str, null, false, false, this);
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
            LobbyV2SearchResultsModel lobbyV2SearchResultsModel = (LobbyV2SearchResultsModel) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
            List listD = LobbyV2ViewModel.a.d(lobbyV2SearchResultsModel != null ? lobbyV2SearchResultsModel.getSuggestions() : null);
            UIState.INSTANCE.getClass();
            sswVar.j(UIState.Companion.c(listD));
        } else {
            sswVar.j(UIState.Companion.a(UIState.INSTANCE));
        }
        return Unit.a;
    }
}
