package defpackage;

import com.sportygames.chat.remote.models.NextRainResponse;
import com.sportygames.chat.remote.models.RainClaimInfoResponse;
import com.sportygames.chat.remote.models.RainDetailInfoResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u0007J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\u0007¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lpv30;", "", "", "gameBizId", "Lcom/sportygames/commons/remote/model/HTTPResponse;", "Lcom/sportygames/chat/remote/models/NextRainResponse;", "b", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "rainId", "Lcom/sportygames/chat/remote/models/RainClaimInfoResponse;", "a", "Lcom/sportygames/chat/remote/models/RainDetailInfoResponse;", "c", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface pv30 {
    @sbj("games-campaign/v1/rain/{rainId}/claim-info")
    Object a(@dxz("rainId") String str, v1b<? super HTTPResponse<RainClaimInfoResponse>> v1bVar);

    @sbj("games-campaign/v1/rain/{gameBizId}/next")
    Object b(@dxz("gameBizId") String str, v1b<? super HTTPResponse<NextRainResponse>> v1bVar);

    @sbj("games-campaign/v1/rain/{rainId}")
    Object c(@dxz("rainId") String str, v1b<? super HTTPResponse<RainDetailInfoResponse>> v1bVar);
}
