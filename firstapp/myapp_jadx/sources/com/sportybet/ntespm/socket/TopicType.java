package com.sportybet.ntespm.socket;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/sportybet/ntespm/socket/TopicType;", "", "postfix", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPostfix", "()Ljava/lang/String;", "EVENT_STATUS", "MARKET_STATUS", "MARKET_STATUS_V2", "MARKET_ODDS", "ODDS_STATUS", "SELECTION", "BET_STATUS", "LIVE_SPORTS", "GIFT_GRAB_PROGRESS", "GIFT_GRAB_USER", "BO_CONFIG_UPDATE", "CASH_OUT_STATUS", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum TopicType {
    EVENT_STATUS(AnalyticsParam.EVENT_STATUS),
    MARKET_STATUS(AnalyticsParam.EVENT_STATUS),
    MARKET_STATUS_V2("marketStatus"),
    MARKET_ODDS("odds"),
    ODDS_STATUS("oddsStatus"),
    SELECTION(""),
    BET_STATUS("betStatus"),
    LIVE_SPORTS("live^sports"),
    GIFT_GRAB_PROGRESS("progress"),
    GIFT_GRAB_USER("user_qualifications"),
    BO_CONFIG_UPDATE("bo_config_update"),
    CASH_OUT_STATUS("cashOutStatus");

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final String postfix;

    TopicType(String str) {
        this.postfix = str;
    }

    public static tag<TopicType> getEntries() {
        return $ENTRIES;
    }

    public final String getPostfix() {
        return this.postfix;
    }
}
