package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.goldmine.bethistory.TGBetHistoryModel;
import com.sportygames.goldmine.data.dto.TGAvailableDTO;
import com.sportygames.goldmine.data.dto.TGBetAmountConfigDTO;
import com.sportygames.goldmine.data.dto.TGBetDTO;
import com.sportygames.goldmine.data.dto.TGBetRequestDTO;
import com.sportygames.goldmine.data.dto.TGGiftDTO;
import com.sportygames.goldmine.data.dto.TGPayTableDTO;
import com.sportygames.goldmine.data.dto.TGUserDTO;
import com.sportygames.goldmine.data.dto.TGUserInfoDTO;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n0\u0002H§@¢\u0006\u0004\b\f\u0010\u0005J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0005J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0005J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002H§@¢\u0006\u0004\b\u001c\u0010\u0005¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Ld4l;", "", "Lcom/sportygames/common/framework/network/HTTPResponse;", "Lcom/sportygames/goldmine/data/dto/TGAvailableDTO;", "b", "(Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/goldmine/data/dto/TGBetAmountConfigDTO;", "g", "Lcom/sportygames/goldmine/data/dto/TGUserInfoDTO;", "a", "", "", "j", "Lcom/sportygames/goldmine/data/dto/TGPayTableDTO;", "e", "Lcom/sportygames/goldmine/data/dto/TGBetRequestDTO;", "body", "Lcom/sportygames/goldmine/data/dto/TGBetDTO;", "i", "(Lcom/sportygames/goldmine/data/dto/TGBetRequestDTO;Lv1b;)Ljava/lang/Object;", "lastId", "size", "Lcom/sportygames/goldmine/bethistory/TGBetHistoryModel;", "c", "(Ljava/lang/Integer;Ljava/lang/Integer;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/goldmine/data/dto/TGUserDTO;", "d", "Lcom/sportygames/goldmine/data/dto/TGGiftDTO;", "h", "game-goldmine_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d4l {
    @sbj("patron/account/info")
    Object a(v1b<? super HTTPResponse<TGUserInfoDTO>> v1bVar);

    @sbj("quickgame/thegoldmine/available")
    Object b(v1b<? super HTTPResponse<TGAvailableDTO>> v1bVar);

    @sbj("quickgame/thegoldmine/bet/history")
    Object c(@db30("last_id") Integer num, @db30("size") Integer num2, v1b<? super HTTPResponse<TGBetHistoryModel>> v1bVar);

    @sbj("quickgame/thegoldmine/user")
    Object d(v1b<? super HTTPResponse<TGUserDTO>> v1bVar);

    @sbj("quickgame/thegoldmine/pay-table")
    Object e(v1b<? super HTTPResponse<TGPayTableDTO>> v1bVar);

    @sbj("quickgame/thegoldmine/bet-config")
    Object g(v1b<? super HTTPResponse<TGBetAmountConfigDTO>> v1bVar);

    @sbj("quickgame/thegoldmine/gifts")
    Object h(v1b<? super HTTPResponse<TGGiftDTO>> v1bVar);

    @flz("quickgame/thegoldmine/bet")
    Object i(@jh4 TGBetRequestDTO tGBetRequestDTO, v1b<? super HTTPResponse<TGBetDTO>> v1bVar);

    @sbj("quickgame/thegoldmine/user/collection")
    Object j(v1b<? super HTTPResponse<List<List<Integer>>>> v1bVar);
}
