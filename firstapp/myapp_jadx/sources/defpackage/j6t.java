package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.compose.lobbyv2.models.LobbyV2CategoryItemModel;
import com.sportygames.compose.lobbyv2.models.UIState;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.components.screens.LobbyV2LobbyScreenKt$LobbyV2LobbyScreen$1$1", f = "LobbyV2LobbyScreen.kt", l = {}, m = "invokeSuspend", v = 1)
public final class j6t extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ LobbyV2ViewModel a;
    public final /* synthetic */ ytw b;
    public final /* synthetic */ UIState<HTTPResponse<List<LobbyV2CategoryItemModel>>> c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ ytw<LobbyV2CategoryItemModel> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6t(LobbyV2ViewModel lobbyV2ViewModel, ytw ytwVar, UIState uIState, Context context, ytw ytwVar2, v1b v1bVar) {
        super(2, v1bVar);
        this.a = lobbyV2ViewModel;
        this.b = ytwVar;
        this.c = uIState;
        this.d = context;
        this.e = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j6t(this.a, this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j6t) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List<LobbyV2CategoryItemModel> data;
        Object next;
        String promoUrl;
        LobbyV2CategoryItemModel value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Integer num = (Integer) this.b.getValue();
        if (num == null) {
            return Unit.a;
        }
        int iIntValue = num.intValue();
        UIState<HTTPResponse<List<LobbyV2CategoryItemModel>>> uIState = this.c;
        Context context = this.d;
        ytw<LobbyV2CategoryItemModel> ytwVar = this.e;
        HTTPResponse<List<LobbyV2CategoryItemModel>> data2 = uIState.getData();
        if (data2 != null && (data = data2.getData()) != null) {
            Iterator<T> it = data.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((LobbyV2CategoryItemModel) next).getId() != iIntValue);
            LobbyV2CategoryItemModel lobbyV2CategoryItemModel = (LobbyV2CategoryItemModel) next;
            if (lobbyV2CategoryItemModel != null && lobbyV2CategoryItemModel.getPromoIsActive() && (promoUrl = lobbyV2CategoryItemModel.getPromoUrl()) != null && !StringsKt.U(promoUrl)) {
                int id = lobbyV2CategoryItemModel.getId();
                context.getClass();
                SharedPreferences sharedPreferencesA = un20.a(context);
                sharedPreferencesA.getClass();
                if (!sharedPreferencesA.getBoolean("category_promotion_hide_" + id, false) && ((value = ytwVar.getValue()) == null || value.getId() != lobbyV2CategoryItemModel.getId())) {
                    ytwVar.setValue(lobbyV2CategoryItemModel);
                }
            }
        }
        LobbyV2ViewModel lobbyV2ViewModel = this.a;
        synchronized (lobbyV2ViewModel) {
            Integer num2 = (Integer) lobbyV2ViewModel.O.getValue();
            if (num2 != null && num2.intValue() == iIntValue) {
                lobbyV2ViewModel.O.setValue(null);
            }
        }
        return Unit.a;
    }
}
