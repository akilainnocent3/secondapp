package com.sportybet.plugin.realsports.betslip.domain.model;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.betslip.domain.model.SelectionId;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\bg\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\u0002\b\u0012¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/sportybet/plugin/realsports/betslip/domain/model/SelectionId;", "T", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "getEventId", "()Ljava/lang/String;", "marketId", "getMarketId", "outcomeId", "getOutcomeId", "specifier", "getSpecifier", "childSelections", "", "getChildSelections", "()Ljava/util/List;", "africa-bet-android", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface SelectionId<T extends SelectionId<T>> {
    List<T> getChildSelections();

    String getEventId();

    String getMarketId();

    String getOutcomeId();

    String getSpecifier();
}
