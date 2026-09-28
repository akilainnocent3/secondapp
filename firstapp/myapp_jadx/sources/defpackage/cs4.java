package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcs4;", "", "", "campaignId", "Lhr4;", "bonusGameSelectionBody", "Lcom/sportygames/common/framework/network/HTTPResponse;", "", "a", "(ILhr4;Lv1b;)Ljava/lang/Object;", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface cs4 {
    @flz("games-campaign/v1/user/campaign/{campaignId}/journey")
    Object a(@dxz("campaignId") int i, @jh4 hr4 hr4Var, v1b<? super HTTPResponse<Unit>> v1bVar);
}
