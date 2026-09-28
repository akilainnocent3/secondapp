package com.sportygames.pocketrocket.model.request;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0007\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/sportygames/pocketrocket/model/request/CashoutRequest;", "", "betId", "", "roundId", "coefficient", "", "isAutoCashout", "", "showInternetIssueMsg", "rocketType", "isCampaignUser", "<init>", "(JJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Z)V", "getBetId", "()J", "getRoundId", "getCoefficient", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowInternetIssueMsg", "getRocketType", "()Z", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashoutRequest {
    public static final int $stable = 0;
    private final long betId;
    private final String coefficient;
    private final Boolean isAutoCashout;
    private final boolean isCampaignUser;
    private final String rocketType;
    private final long roundId;
    private final Boolean showInternetIssueMsg;

    public CashoutRequest(long j, long j2, String str, Boolean bool, Boolean bool2, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.betId = j;
        this.roundId = j2;
        this.coefficient = str;
        this.isAutoCashout = bool;
        this.showInternetIssueMsg = bool2;
        this.rocketType = str2;
        this.isCampaignUser = z;
    }

    public final long getBetId() {
        return this.betId;
    }

    public final String getCoefficient() {
        return this.coefficient;
    }

    public final String getRocketType() {
        return this.rocketType;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final Boolean getShowInternetIssueMsg() {
        return this.showInternetIssueMsg;
    }

    /* JADX INFO: renamed from: isAutoCashout, reason: from getter */
    public final Boolean getIsAutoCashout() {
        return this.isAutoCashout;
    }

    /* JADX INFO: renamed from: isCampaignUser, reason: from getter */
    public final boolean getIsCampaignUser() {
        return this.isCampaignUser;
    }
}
