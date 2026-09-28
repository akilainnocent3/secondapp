package com.sportybet.feature.luckynumber.placebet.presentation;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fÊ\u0001\u0002\b\u0011¨\u0006\u0010"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/presentation/LNPlaceBetEntrance;", "", "fromScreenName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFromScreenName", "()Ljava/lang/String;", "FAVORITE", "COUNTIES", "NEXT_DRAW", "RESULT", "HISTORY", "TICKET_DETAIL", "SEARCH", "WINNING_POPUP", "luckynumber", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum LNPlaceBetEntrance {
    FAVORITE("favorites"),
    COUNTIES("countries"),
    NEXT_DRAW("nextdraws"),
    RESULT(AnalyticsParam.EVENT_PARAM_RESULT),
    HISTORY("bethistory"),
    TICKET_DETAIL("ticket_detail"),
    SEARCH(AnalyticsParam.SEARCH_KEYWORD),
    WINNING_POPUP("winning_popup");

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final String fromScreenName;

    LNPlaceBetEntrance(String str) {
        this.fromScreenName = str;
    }

    public static tag<LNPlaceBetEntrance> getEntries() {
        return $ENTRIES;
    }

    public final String getFromScreenName() {
        return this.fromScreenName;
    }
}
