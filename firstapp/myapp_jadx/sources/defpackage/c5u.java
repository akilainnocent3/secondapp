package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.loyalty.MissionData;
import com.sportybet.feature.luckynumber.bethistory.data.data.LNOrderListResponseDTO;
import com.sportybet.feature.luckynumber.featurematch.data.data.LNFeatureMatchCardsDTO;
import com.sportybet.feature.luckynumber.historydetail.data.LNBetOrderDTO;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNCountryResponseDTO;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNCurrentLotteryDTO;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNFavoritesListDTO;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNLobbyConfigDTO;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNLotteryResponseDTO;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNResultResponseDTO;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNStreamScheduleDTO;
import com.sportybet.feature.luckynumber.placebet.data.data.LNAddMyNumberDTO;
import com.sportybet.feature.luckynumber.placebet.data.data.LNBettingOrderDTO;
import com.sportybet.feature.luckynumber.placebet.data.data.LNDrawDetailDTO;
import com.sportybet.feature.luckynumber.placebet.data.data.LNMyNumberDTO;
import com.sportybet.feature.luckynumber.placebet.data.data.LNPlaceBetDTO;
import com.sportybet.feature.luckynumber.placebet.data.data.LNPlaceBetRequest;
import com.sportybet.feature.luckynumber.placebet.data.data.LNStreamDTO;
import com.sportybet.feature.luckynumber.placebet.data.data.LNUpdateMyNumberDTO;
import com.sportybet.feature.luckynumber.rewardcenter.gift.data.data.LNGiftRequestBodyDTO;
import com.sportybet.feature.luckynumber.rewardcenter.gift.data.data.LNGiftResponseDTO;
import com.sportybet.feature.luckynumber.rewardcenter.mission.data.data.LNParticipateMissionRequestDTO;
import com.sportybet.feature.luckynumber.showoff.data.LNUploadImgDTO;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.MultipartBody;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0005J \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u0010\u0010\fJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u0011\u0010\fJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0005J8\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\b\b\u0001\u0010\u001a\u001a\u00020\bH§@¢\u0006\u0004\b\u001c\u0010\fJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b \u0010!J8\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\b$\u0010%J \u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b'\u0010\fJ \u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010(\u001a\u00020\bH§@¢\u0006\u0004\b)\u0010\fJ \u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00022\b\b\u0001\u0010+\u001a\u00020*H§@¢\u0006\u0004\b-\u0010.J4\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00022\b\b\u0001\u0010(\u001a\u00020\b2\b\b\u0001\u00100\u001a\u00020/2\b\b\u0001\u00101\u001a\u00020\bH§@¢\u0006\u0004\b3\u00104J&\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000206050\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b7\u0010\fJ \u00109\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010+\u001a\u000208H§@¢\u0006\u0004\b9\u0010:J*\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010;\u001a\u00020\b2\b\b\u0001\u0010+\u001a\u00020<H§@¢\u0006\u0004\b=\u0010>J \u0010?\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010;\u001a\u00020\bH§@¢\u0006\u0004\b?\u0010\fJ \u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\bA\u0010\fJ*\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010B\u001a\u00020\bH§@¢\u0006\u0004\bD\u0010EJ0\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F050\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u001a\u001a\u00020\bH§@¢\u0006\u0004\bG\u0010EJ\u001c\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H050\u0002H§@¢\u0006\u0004\bI\u0010\u0005J \u0010K\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010\u001e\u001a\u00020JH§@¢\u0006\u0004\bK\u0010LJ\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u0002H§@¢\u0006\u0004\bN\u0010\u0005¨\u0006OÀ\u0006\u0003"}, d2 = {"Lc5u;", "", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLobbyConfigDTO;", "d", "(Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLotteryResponseDTO;", "a", "", "lotteryId", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNCurrentLotteryDTO;", "o", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNFavoritesListDTO;", "w", "", "s", "j", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNCountryResponseDTO;", "t", "", "limit", "cursor", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNResultResponseDTO;", "l", "(ILjava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "drawId", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNDrawDetailDTO;", "g", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNPlaceBetRequest;", "request", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNPlaceBetDTO;", "x", "(Lcom/sportybet/feature/luckynumber/placebet/data/data/LNPlaceBetRequest;Lv1b;)Ljava/lang/Object;", "queryStatus", "Lcom/sportybet/feature/luckynumber/bethistory/data/data/LNOrderListResponseDTO;", "u", "(ILjava/lang/String;Ljava/lang/Integer;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/feature/luckynumber/historydetail/data/LNBetOrderDTO;", "e", "orderId", "r", "Lcom/sportybet/feature/luckynumber/rewardcenter/gift/data/data/LNGiftRequestBodyDTO;", "body", "Lcom/sportybet/feature/luckynumber/rewardcenter/gift/data/data/LNGiftResponseDTO;", "m", "(Lcom/sportybet/feature/luckynumber/rewardcenter/gift/data/data/LNGiftRequestBodyDTO;Lv1b;)Ljava/lang/Object;", "Lokhttp3/MultipartBody$Part;", "file", "type", "Lcom/sportybet/feature/luckynumber/showoff/data/LNUploadImgDTO;", "v", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNMyNumberDTO;", "i", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNAddMyNumberDTO;", "n", "(Lcom/sportybet/feature/luckynumber/placebet/data/data/LNAddMyNumberDTO;Lv1b;)Ljava/lang/Object;", "myNumberId", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNUpdateMyNumberDTO;", "h", "(Ljava/lang/String;Lcom/sportybet/feature/luckynumber/placebet/data/data/LNUpdateMyNumberDTO;Lv1b;)Ljava/lang/Object;", "f", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNStreamScheduleDTO;", "b", "streamId", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNStreamDTO;", "c", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNBettingOrderDTO;", "y", "Lcom/sporty/android/core/model/loyalty/MissionData;", "q", "Lcom/sportybet/feature/luckynumber/rewardcenter/mission/data/data/LNParticipateMissionRequestDTO;", "k", "(Lcom/sportybet/feature/luckynumber/rewardcenter/mission/data/data/LNParticipateMissionRequestDTO;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/feature/luckynumber/featurematch/data/data/LNFeatureMatchCardsDTO;", "p", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface c5u {
    @sbj("sportyNumbers/api/v1/lotteries")
    Object a(v1b<? super BaseResponse<LNLotteryResponseDTO>> v1bVar);

    @sbj("sportyNumbers/api/v1/lotteries/{lotteryId}/streaming/schedule")
    Object b(@dxz("lotteryId") String str, v1b<? super BaseResponse<LNStreamScheduleDTO>> v1bVar);

    @sbj("sportyNumbers/api/v1/lotteries/{lotteryId}/streaming")
    Object c(@dxz("lotteryId") String str, @db30("streamId") String str2, v1b<? super BaseResponse<LNStreamDTO>> v1bVar);

    @sbj("sportyNumbers/api/v1/lottery/config")
    Object d(v1b<? super BaseResponse<LNLobbyConfigDTO>> v1bVar);

    @sbj("sportyNumbers/api/v1/orders/{orderId}/detail")
    Object e(@dxz("orderId") String str, v1b<? super BaseResponse<LNBetOrderDTO>> v1bVar);

    @amc("sportyNumbers/api/v1/lotteries/my-numbers/{myNumberId}")
    @gil({"Content-Type: application/json"})
    Object f(@dxz("myNumberId") String str, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("sportyNumbers/api/v1/lotteries/draws/{drawId}/detail")
    Object g(@dxz("drawId") String str, v1b<? super BaseResponse<LNDrawDetailDTO>> v1bVar);

    @gmz("sportyNumbers/api/v1/lotteries/my-numbers/{myNumberId}")
    @gil({"Content-Type: application/json"})
    Object h(@dxz("myNumberId") String str, @jh4 LNUpdateMyNumberDTO lNUpdateMyNumberDTO, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("sportyNumbers/api/v1/lotteries/my-numbers")
    Object i(@db30("lotteryId") String str, v1b<? super BaseResponse<List<LNMyNumberDTO>>> v1bVar);

    @amc("sportyNumbers/api/v1/lotteries/favorites/{lotteryId}")
    Object j(@dxz("lotteryId") String str, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("promotion/v1/loyalty/mission/participate")
    Object k(@jh4 LNParticipateMissionRequestDTO lNParticipateMissionRequestDTO, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("sportyNumbers/api/v2/lotteries/draws/results")
    Object l(@db30("limit") int i, @db30("cursor") String str, @db30("lotteryId") String str2, v1b<? super BaseResponse<LNResultResponseDTO>> v1bVar);

    @flz("/promotion/v1/gifts/query")
    @gil({"Content-Type: application/json"})
    Object m(@jh4 LNGiftRequestBodyDTO lNGiftRequestBodyDTO, v1b<? super BaseResponse<LNGiftResponseDTO>> v1bVar);

    @flz("sportyNumbers/api/v1/lotteries/my-numbers")
    @gil({"Content-Type: application/json"})
    Object n(@jh4 LNAddMyNumberDTO lNAddMyNumberDTO, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("sportyNumbers/api/v1/lotteries/{lotteryId}/draws/current")
    Object o(@dxz("lotteryId") String str, v1b<? super BaseResponse<LNCurrentLotteryDTO>> v1bVar);

    @sbj("sportyNumbers/api/v1/feature-match/cards")
    Object p(v1b<? super BaseResponse<LNFeatureMatchCardsDTO>> v1bVar);

    @sbj("promotion/v1/loyalty/mission/applicable/number")
    Object q(v1b<? super BaseResponse<List<MissionData>>> v1bVar);

    @flz("sportyNumbers/api/v1/orders/{orderId}/deletion")
    @gil({"Content-Type: application/json"})
    Object r(@dxz("orderId") String str, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("sportyNumbers/api/v1/lotteries/favorites/{lotteryId}")
    Object s(@dxz("lotteryId") String str, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("sportyNumbers/api/v1/lottery/countries")
    Object t(v1b<? super BaseResponse<LNCountryResponseDTO>> v1bVar);

    @sbj("sportyNumbers/api/v1/orders")
    Object u(@db30("limit") int i, @db30("cursor") String str, @db30("queryStatus") Integer num, v1b<? super BaseResponse<LNOrderListResponseDTO>> v1bVar);

    @flz("sportyNumbers/api/v1/orders/{orderId}/uploadSharePic")
    @jmw
    Object v(@dxz("orderId") String str, @usz MultipartBody.Part part, @usz("type") String str2, v1b<? super BaseResponse<LNUploadImgDTO>> v1bVar);

    @sbj("sportyNumbers/api/v1/lotteries/favorites")
    Object w(v1b<? super BaseResponse<LNFavoritesListDTO>> v1bVar);

    @flz("sportyNumbers/api/v1/orders/order")
    @gil({"Content-Type: application/json"})
    Object x(@jh4 LNPlaceBetRequest lNPlaceBetRequest, v1b<? super BaseResponse<LNPlaceBetDTO>> v1bVar);

    @sbj("sportyNumbers/api/v1/lotteries/{lotteryId}/betting/orders")
    Object y(@dxz("lotteryId") String str, @db30("drawId") String str2, v1b<? super BaseResponse<List<LNBettingOrderDTO>>> v1bVar);
}
