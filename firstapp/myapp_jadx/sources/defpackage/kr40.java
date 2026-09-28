package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.refscall.data.dto.RCAvailableDTO;
import com.sportygames.refscall.data.dto.RCBetHistoryDTO;
import com.sportygames.refscall.data.dto.RCBetRequestDTO;
import com.sportygames.refscall.data.dto.RCBetResponseDTO;
import com.sportygames.refscall.data.dto.RCDetailDTO;
import com.sportygames.refscall.data.dto.RCGiftDTO;
import com.sportygames.refscall.data.dto.RCUserInfoDTO;
import com.sportygames.refscall.data.dto.RCWalletInfoDTO;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0005J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H§@¢\u0006\u0004\b\r\u0010\u0005J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lkr40;", "", "Lcom/sportygames/common/framework/network/HTTPResponse;", "Lcom/sportygames/refscall/data/dto/RCAvailableDTO;", "isGameAvailable", "(Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/refscall/data/dto/RCDetailDTO;", "gameDetails", "Lcom/sportygames/refscall/data/dto/RCUserInfoDTO;", "a", "Lcom/sportygames/refscall/data/dto/RCWalletInfoDTO;", "walletInfo", "Lcom/sportygames/refscall/data/dto/RCGiftDTO;", "getPromotionalGifts", "Lcom/sportygames/refscall/data/dto/RCBetRequestDTO;", "betRequest", "Lcom/sportygames/refscall/data/dto/RCBetResponseDTO;", "b", "(Lcom/sportygames/refscall/data/dto/RCBetRequestDTO;Lv1b;)Ljava/lang/Object;", "", "offset", "limit", "", "Lcom/sportygames/refscall/data/dto/RCBetHistoryDTO;", "getBetHistory", "(IILv1b;)Ljava/lang/Object;", "game-refscall_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface kr40 {
    @flz("refs-call/v1/user/validate")
    Object a(v1b<? super HTTPResponse<RCUserInfoDTO>> v1bVar);

    @flz("refs-call/v1/bet/placeBet")
    Object b(@jh4 RCBetRequestDTO rCBetRequestDTO, v1b<? super HTTPResponse<RCBetResponseDTO>> v1bVar);

    @sbj("refs-call/v1/game/details")
    Object gameDetails(v1b<? super HTTPResponse<RCDetailDTO>> v1bVar);

    @sbj("refs-call/v1/bet/userHistory")
    Object getBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<RCBetHistoryDTO>>> v1bVar);

    @sbj("refs-call/v1/promotion/gifts")
    Object getPromotionalGifts(v1b<? super HTTPResponse<RCGiftDTO>> v1bVar);

    @sbj("refs-call/v1/game/isAvailable")
    Object isGameAvailable(v1b<? super HTTPResponse<RCAvailableDTO>> v1bVar);

    @sbj("refs-call/v1/user/walletInfo")
    Object walletInfo(v1b<? super HTTPResponse<RCWalletInfoDTO>> v1bVar);
}
