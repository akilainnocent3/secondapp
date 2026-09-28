package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J4\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lmjz;", "", "", "offset", "limit", "Lcom/sportygames/common/framework/network/HTTPResponse;", "", "Lcom/sportygames/piggybash/data/model/http/PBBetHistoryItemDTO;", "c", "(Ljava/lang/Integer;Ljava/lang/Integer;Lv1b;)Ljava/lang/Object;", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface mjz {
    @sbj("sporty-piggy-bash/v1/bet/history")
    Object c(@db30("offset") Integer num, @db30("limit") Integer num2, v1b<? super HTTPResponse<List<PBBetHistoryItemDTO>>> v1bVar);
}
