package com.sportygames.pingpong.remote.models;

import com.appsflyer.internal.w;
import com.twilio.voice.EventKeys;
import defpackage.em5;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.q6a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003JL\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0007\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015¨\u0006#"}, d2 = {"Lcom/sportygames/pingpong/remote/models/CashoutRequest;", "", "betId", "", "roundId", "coefficient", "", "isAutoCashout", "", EventKeys.TIMESTAMP, "isCampaignUser", "<init>", "(JJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)V", "getBetId", "()J", "getRoundId", "getCoefficient", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTimestamp", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)Lcom/sportygames/pingpong/remote/models/CashoutRequest;", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashoutRequest {
    public static final int $stable = 0;
    private final long betId;
    private final String coefficient;
    private final Boolean isAutoCashout;
    private final boolean isCampaignUser;
    private final long roundId;
    private final String timestamp;

    public CashoutRequest(long j, long j2, String str, Boolean bool, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.betId = j;
        this.roundId = j2;
        this.coefficient = str;
        this.isAutoCashout = bool;
        this.timestamp = str2;
        this.isCampaignUser = z;
    }

    public static /* synthetic */ CashoutRequest copy$default(CashoutRequest cashoutRequest, long j, long j2, String str, Boolean bool, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cashoutRequest.betId;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = cashoutRequest.roundId;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = cashoutRequest.coefficient;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            bool = cashoutRequest.isAutoCashout;
        }
        return cashoutRequest.copy(j3, j4, str3, bool, (i & 16) != 0 ? cashoutRequest.timestamp : str2, (i & 32) != 0 ? cashoutRequest.isCampaignUser : z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCoefficient() {
        return this.coefficient;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsAutoCashout() {
        return this.isAutoCashout;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsCampaignUser() {
        return this.isCampaignUser;
    }

    public final CashoutRequest copy(long betId, long roundId, String coefficient, Boolean isAutoCashout, String timestamp, boolean isCampaignUser) {
        coefficient.getClass();
        timestamp.getClass();
        return new CashoutRequest(betId, roundId, coefficient, isAutoCashout, timestamp, isCampaignUser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashoutRequest)) {
            return false;
        }
        CashoutRequest cashoutRequest = (CashoutRequest) other;
        return this.betId == cashoutRequest.betId && this.roundId == cashoutRequest.roundId && Intrinsics.g(this.coefficient, cashoutRequest.coefficient) && Intrinsics.g(this.isAutoCashout, cashoutRequest.isAutoCashout) && Intrinsics.g(this.timestamp, cashoutRequest.timestamp) && this.isCampaignUser == cashoutRequest.isCampaignUser;
    }

    public final long getBetId() {
        return this.betId;
    }

    public final String getCoefficient() {
        return this.coefficient;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iA = gmf0.a(f87.a(Long.hashCode(this.betId) * 31, this.roundId, 31), 31, this.coefficient);
        Boolean bool = this.isAutoCashout;
        return Boolean.hashCode(this.isCampaignUser) + gmf0.a((iA + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.timestamp);
    }

    public final Boolean isAutoCashout() {
        return this.isAutoCashout;
    }

    public final boolean isCampaignUser() {
        return this.isCampaignUser;
    }

    public String toString() {
        long j = this.betId;
        long j2 = this.roundId;
        String str = this.coefficient;
        Boolean bool = this.isAutoCashout;
        String str2 = this.timestamp;
        boolean z = this.isCampaignUser;
        StringBuilder sbA = q6a0.a(j, "CashoutRequest(betId=", ", roundId=");
        em5.a(j2, ", coefficient=", str, sbA);
        sbA.append(", isAutoCashout=");
        sbA.append(bool);
        sbA.append(", timestamp=");
        sbA.append(str2);
        return w.a(sbA, ", isCampaignUser=", z, ")");
    }
}
