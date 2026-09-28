package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.nightnday.data.dto.NNDAvailableDTO;
import com.sportygames.nightnday.data.dto.NNDBetHistoryDTO;
import com.sportygames.nightnday.data.dto.NNDBetRequestDTO;
import com.sportygames.nightnday.data.dto.NNDBetResponseDTO;
import com.sportygames.nightnday.data.dto.NNDDetailDTO;
import com.sportygames.nightnday.data.dto.NNDGiftDTO;
import com.sportygames.nightnday.data.dto.NNDUserInfoDTO;
import com.sportygames.nightnday.data.dto.NNDWalletInfoDTO;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0005J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0005J0\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0002H§@¢\u0006\u0004\b\u0019\u0010\u0005¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Losx;", "", "Lcom/sportygames/common/framework/network/HTTPResponse;", "Lcom/sportygames/nightnday/data/dto/NNDAvailableDTO;", "isGameAvailable", "(Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/nightnday/data/dto/NNDDetailDTO;", "gameDetails", "Lcom/sportygames/nightnday/data/dto/NNDBetRequestDTO;", "betRequest", "Lcom/sportygames/nightnday/data/dto/NNDBetResponseDTO;", "b", "(Lcom/sportygames/nightnday/data/dto/NNDBetRequestDTO;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/nightnday/data/dto/NNDWalletInfoDTO;", "walletInfo", "Lcom/sportygames/nightnday/data/dto/NNDGiftDTO;", "getPromotionalGifts", "", "offset", "limit", "", "Lcom/sportygames/nightnday/data/dto/NNDBetHistoryDTO;", "getBetHistory", "(IILv1b;)Ljava/lang/Object;", "Lcom/sportygames/nightnday/data/dto/NNDUserInfoDTO;", "a", "game-nightnday_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface osx {
    @flz("night-n-day/v1/user/validate")
    Object a(v1b<? super HTTPResponse<NNDUserInfoDTO>> v1bVar);

    @flz("night-n-day/v1/bet/placeBet")
    Object b(@jh4 NNDBetRequestDTO nNDBetRequestDTO, v1b<? super HTTPResponse<NNDBetResponseDTO>> v1bVar);

    @sbj("night-n-day/v1/game/details")
    Object gameDetails(v1b<? super HTTPResponse<NNDDetailDTO>> v1bVar);

    @sbj("night-n-day/v1/bet/userHistory")
    Object getBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<NNDBetHistoryDTO>>> v1bVar);

    @sbj("night-n-day/v1/promotion/gifts")
    Object getPromotionalGifts(v1b<? super HTTPResponse<NNDGiftDTO>> v1bVar);

    @sbj("night-n-day/v1/game/isAvailable")
    Object isGameAvailable(v1b<? super HTTPResponse<NNDAvailableDTO>> v1bVar);

    @sbj("night-n-day/v1/user/walletInfo")
    Object walletInfo(v1b<? super HTTPResponse<NNDWalletInfoDTO>> v1bVar);
}
