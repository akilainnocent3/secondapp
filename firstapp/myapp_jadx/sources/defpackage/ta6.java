package defpackage;

import com.sporty.android.core.antest.room.CampaignVariantDB_Impl;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ta6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ta6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new ab6((CampaignVariantDB_Impl) obj);
            case 1:
                ((Function0) obj).invoke();
                return Unit.a;
            case 2:
                LobbyV2ViewModel lobbyV2ViewModel = (LobbyV2ViewModel) obj;
                List<Integer> list = lobbyV2ViewModel.a0;
                list.getClass();
                return new LobbyV2ViewModel.b(new LobbyV2ViewModel.c(LobbyV2ViewModel.d.f, null, list, 2), lobbyV2ViewModel.a);
            default:
                ((Function1) obj).invoke(nui0.a);
                return Unit.a;
        }
    }
}
