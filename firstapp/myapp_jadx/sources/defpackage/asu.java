package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.marketingactivities.EligibleActivityResponse;
import com.sporty.android.core.model.oddsboost.OddsBoostRtpRatioResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0002H§@¢\u0006\u0004\b\b\u0010\u0005¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lasu;", "", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sporty/android/core/model/oddsboost/OddsBoostRtpRatioResponse;", "a", "(Lv1b;)Ljava/lang/Object;", "", "Lcom/sporty/android/core/model/marketingactivities/EligibleActivityResponse;", "b", "common-network"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface asu {
    @sbj("marketing/v1/activities/oddsBoost/getOddsBoostLobRtpRatio")
    Object a(v1b<? super BaseResponse<OddsBoostRtpRatioResponse>> v1bVar);

    @sbj("marketing/v1/activities/eligible")
    Object b(v1b<? super BaseResponse<List<EligibleActivityResponse>>> v1bVar);
}
