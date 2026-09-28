package defpackage;

import androidx.compose.runtime.a;
import com.sportygames.compose.lobbyv2.models.GameLogData;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rwj implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rwj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zIsBannerTypeCategory;
        int i = this.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ywj ywjVar = (ywj) obj5;
                LobbyV2ViewModel lobbyV2ViewModel = (LobbyV2ViewModel) obj4;
                LobbyV2GameDetailsModel lobbyV2GameDetailsModel = (LobbyV2GameDetailsModel) obj;
                gnj gnjVar = (gnj) obj2;
                lobbyV2GameDetailsModel.getClass();
                gnjVar.getClass();
                ywjVar.I = (GameLogData) obj3;
                try {
                    zIsBannerTypeCategory = lobbyV2GameDetailsModel.isBannerTypeCategory();
                } catch (Exception e) {
                    e.printStackTrace();
                    zIsBannerTypeCategory = false;
                }
                if (zIsBannerTypeCategory) {
                    try {
                        if (lobbyV2GameDetailsModel.getCategoryId() != 0) {
                            lobbyV2ViewModel.z.j(Integer.valueOf(lobbyV2GameDetailsModel.getCategoryId()));
                            lobbyV2ViewModel.O1(lobbyV2GameDetailsModel.getCategoryId());
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    lobbyV2ViewModel.K1();
                    GameDetails legacyGameDetails = lobbyV2GameDetailsModel.toLegacyGameDetails();
                    Integer position = lobbyV2GameDetailsModel.getPosition();
                    ywjVar.v0(legacyGameDetails, position != null ? position.intValue() : 0, gnjVar.name());
                }
                break;
            default:
                l6f l6fVar = (l6f) obj5;
                Function0 function0 = (Function0) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((j78) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    att.a(l6fVar, function0, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }
}
