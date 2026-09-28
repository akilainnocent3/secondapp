package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.common.network.campaign.CampaignsData;
import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u0007¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Le46;", "", "", AnalyticsParam.EVENT_PARAM_ID, "Lcom/sportygames/commons/remote/model/HTTPResponse;", "Lcom/sportygames/common/network/campaign/Campaign;", "a", "(ILv1b;)Ljava/lang/Object;", "", "sourceName", "Lcom/sportygames/common/network/campaign/CampaignsData;", "b", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "c", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e46 {
    @sbj("games-campaign/v1/user/campaign/{id}/journey")
    Object a(@dxz(AnalyticsParam.EVENT_PARAM_ID) int i, v1b<? super HTTPResponse<Campaign>> v1bVar);

    @sbj("games-campaign/v2/user/campaign")
    Object b(@db30("source") String str, v1b<? super HTTPResponse<CampaignsData>> v1bVar);

    @flz("games-campaign/v1/user/gifts/{id}/collect")
    Object c(@dxz(AnalyticsParam.EVENT_PARAM_ID) int i, v1b<? super HTTPResponse<String>> v1bVar);
}
