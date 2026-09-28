package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.factscenter.BetslipStaleOddsResumePolicyDto;
import com.sporty.android.core.model.factscenter.MarketGroupResponse;
import com.sporty.android.core.model.matchalert.SubscribedEventsResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0005H§@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00052\b\b\u0001\u0010\u0010\u001a\u00020\tH§@¢\u0006\u0004\b\u0013\u0010\f¨\u0006\u0014À\u0006\u0003"}, d2 = {"Ly7h;", "", "", "pageNo", "pageSize", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sporty/android/core/model/matchalert/SubscribedEventsResponse;", "b", "(IILv1b;)Ljava/lang/Object;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "c", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/factscenter/BetslipStaleOddsResumePolicyDto;", "a", "(Lv1b;)Ljava/lang/Object;", "sportId", "", "Lcom/sporty/android/core/model/factscenter/MarketGroupResponse;", "d", "common-network"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface y7h {
    @sbj("factsCenter/stale-odds/resume-policy")
    Object a(v1b<? super BaseResponse<BetslipStaleOddsResumePolicyDto>> v1bVar);

    @sbj("factsCenter/eventSubscription/v1/subscribedEvents")
    Object b(@db30("pageNo") int i, @db30("pageSize") int i2, v1b<? super BaseResponse<SubscribedEventsResponse>> v1bVar);

    @flz("factsCenter/eventSubscription/v1/subscribe")
    Object c(@db30(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String str, v1b<? super BaseResponse<Object>> v1bVar);

    @sbj("factsCenter/marketGroups")
    Object d(@db30("sportId") String str, v1b<? super BaseResponse<List<MarketGroupResponse>>> v1bVar);
}
