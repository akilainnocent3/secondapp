package defpackage;

import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.evenodd.remote.models.WalletInfo;
import com.sportygames.fruithunt.network.models.FHBetHistoryItem;
import com.sportygames.fruithunt.network.models.FHIsAvailable;
import com.sportygames.fruithunt.network.models.FHPlaceBetRequest;
import com.sportygames.fruithunt.network.models.FHPlaceBetResponse;
import com.sportygames.fruithunt.network.models.FHUserDataResponse;
import com.sportygames.spindabottle.remote.models.DetailResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0005J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H§@¢\u0006\u0004\b\r\u0010\u0005J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u0015H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Li5h;", "", "Lcom/sportygames/commons/remote/model/HTTPResponse;", "Lcom/sportygames/fruithunt/network/models/FHIsAvailable;", "isGameAvailable", "(Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/fruithunt/network/models/FHUserDataResponse;", "userValidate", "Lcom/sportygames/evenodd/remote/models/WalletInfo;", "walletInfo", "Lcom/sportygames/spindabottle/remote/models/DetailResponse;", "gameDetails", "Lcom/sportygames/commons/models/PromotionGiftsResponse;", "getPromotionalGifts", "request", "a", "(Lcom/sportygames/fruithunt/network/models/FHUserDataResponse;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/fruithunt/network/models/FHPlaceBetRequest;", "Lcom/sportygames/fruithunt/network/models/FHPlaceBetResponse;", "b", "(Lcom/sportygames/fruithunt/network/models/FHPlaceBetRequest;Lv1b;)Ljava/lang/Object;", "", "offset", "limit", "", "Lcom/sportygames/fruithunt/network/models/FHBetHistoryItem;", "getBetHistory", "(IILv1b;)Ljava/lang/Object;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i5h {
    @gmz("fruit-hunt/v1/user/update")
    Object a(@jh4 FHUserDataResponse fHUserDataResponse, v1b<? super HTTPResponse<FHUserDataResponse>> v1bVar);

    @flz("fruit-hunt/v1/bet/place")
    Object b(@jh4 FHPlaceBetRequest fHPlaceBetRequest, v1b<? super HTTPResponse<FHPlaceBetResponse>> v1bVar);

    @sbj("fruit-hunt/v1/game/details")
    Object gameDetails(v1b<? super HTTPResponse<DetailResponse>> v1bVar);

    @sbj("fruit-hunt/v1/bet/userHistory")
    Object getBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<FHBetHistoryItem>>> v1bVar);

    @sbj("fruit-hunt/v1/promotion/gifts")
    Object getPromotionalGifts(v1b<? super HTTPResponse<PromotionGiftsResponse>> v1bVar);

    @sbj("fruit-hunt/v1/game/isAvailable")
    Object isGameAvailable(v1b<? super HTTPResponse<FHIsAvailable>> v1bVar);

    @flz("fruit-hunt/v1/user/validate")
    Object userValidate(v1b<? super HTTPResponse<FHUserDataResponse>> v1bVar);

    @sbj("fruit-hunt/v1/user/walletInfo")
    Object walletInfo(v1b<? super HTTPResponse<WalletInfo>> v1bVar);
}
