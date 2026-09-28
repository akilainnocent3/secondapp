package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.RecommendCodeResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lt88;", "", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/RecommendCodeResponse;", "a", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface t88 {
    @sbj("orders/bookingCode/recommend")
    @gil({"Content-Type: application/json"})
    Object a(@db30(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String str, v1b<? super BaseResponse<RecommendCodeResponse>> v1bVar);
}
