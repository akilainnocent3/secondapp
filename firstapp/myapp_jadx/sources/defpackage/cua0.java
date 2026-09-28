package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.speedybingo.data.dto.SBAvailableDTO;
import com.sportygames.speedybingo.data.dto.SBBetConfigDTO;
import com.sportygames.speedybingo.data.dto.SBBetHistoryDTO;
import com.sportygames.speedybingo.data.dto.SBBetRequest;
import com.sportygames.speedybingo.data.dto.SBBetResponseDTO;
import com.sportygames.speedybingo.data.dto.SBExtraBallDTO;
import com.sportygames.speedybingo.data.dto.SBExtraBallRequest;
import com.sportygames.speedybingo.data.dto.SBGiftDTO;
import com.sportygames.speedybingo.data.dto.SBPayTableDTO;
import com.sportygames.speedybingo.data.dto.SBUserDTO;
import com.sportygames.speedybingo.data.dto.SBUserInfoDTO;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0005J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0005J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0005J.\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00022\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0019H§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcua0;", "", "Lcom/sportygames/common/framework/network/HTTPResponse;", "Lcom/sportygames/speedybingo/data/dto/SBAvailableDTO;", "isGameAvailable", "(Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/speedybingo/data/dto/SBBetConfigDTO;", "g", "Lcom/sportygames/speedybingo/data/dto/SBPayTableDTO;", "e", "Lcom/sportygames/speedybingo/data/dto/SBBetRequest;", "request", "Lcom/sportygames/speedybingo/data/dto/SBBetResponseDTO;", "i", "(Lcom/sportygames/speedybingo/data/dto/SBBetRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/speedybingo/data/dto/SBExtraBallRequest;", "Lcom/sportygames/speedybingo/data/dto/SBExtraBallDTO;", "h", "(Lcom/sportygames/speedybingo/data/dto/SBExtraBallRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/speedybingo/data/dto/SBUserDTO;", "d", "Lcom/sportygames/speedybingo/data/dto/SBGiftDTO;", "f", "Lcom/sportygames/speedybingo/data/dto/SBUserInfoDTO;", "a", "", "lastId", "size", "Lcom/sportygames/speedybingo/data/dto/SBBetHistoryDTO;", "c", "(Ljava/lang/Integer;Ljava/lang/Integer;Lv1b;)Ljava/lang/Object;", "game-speedybingo_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface cua0 {
    @sbj("patron/account/info")
    Object a(v1b<? super HTTPResponse<SBUserInfoDTO>> v1bVar);

    @sbj("quickgame/speedybingo/bet/history")
    Object c(@db30("last_id") Integer num, @db30("size") Integer num2, v1b<? super HTTPResponse<SBBetHistoryDTO>> v1bVar);

    @sbj("quickgame/speedybingo/user")
    Object d(v1b<? super HTTPResponse<SBUserDTO>> v1bVar);

    @sbj("quickgame/speedybingo/pay-table")
    Object e(v1b<? super HTTPResponse<SBPayTableDTO>> v1bVar);

    @sbj("quickgame/speedybingo/gifts")
    Object f(v1b<? super HTTPResponse<SBGiftDTO>> v1bVar);

    @sbj("quickgame/speedybingo/bet-config")
    Object g(v1b<? super HTTPResponse<SBBetConfigDTO>> v1bVar);

    @flz("quickgame/speedybingo/bet/extra")
    Object h(@jh4 SBExtraBallRequest sBExtraBallRequest, v1b<? super HTTPResponse<SBExtraBallDTO>> v1bVar);

    @flz("quickgame/speedybingo/bet")
    Object i(@jh4 SBBetRequest sBBetRequest, v1b<? super HTTPResponse<SBBetResponseDTO>> v1bVar);

    @sbj("quickgame/speedybingo/available")
    Object isGameAvailable(v1b<? super HTTPResponse<SBAvailableDTO>> v1bVar);
}
