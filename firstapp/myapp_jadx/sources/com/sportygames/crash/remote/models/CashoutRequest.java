package com.sportygames.crash.remote.models;

import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import com.twilio.voice.EventKeys;
import defpackage.em5;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.mtg0;
import defpackage.q6a0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016Jv\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0007\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0019R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001c\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001d\u0010\u0016¨\u0006."}, d2 = {"Lcom/sportygames/crash/remote/models/CashoutRequest;", "", "betId", "", "roundId", "coefficient", "", "isAutoCashout", "", EventKeys.TIMESTAMP, "isCampaignUser", "tournamentIds", "", "turboBonusUsed", "stakeSafeUsed", "<init>", "(JJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getBetId", "()J", "getRoundId", "getCoefficient", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTimestamp", "()Z", "getTournamentIds", "()Ljava/util/List;", "getTurboBonusUsed", "getStakeSafeUsed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sportygames/crash/remote/models/CashoutRequest;", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashoutRequest {
    public static final int $stable = 8;
    private final long betId;
    private final String coefficient;
    private final Boolean isAutoCashout;
    private final boolean isCampaignUser;
    private final long roundId;
    private final Boolean stakeSafeUsed;
    private final String timestamp;
    private final List<String> tournamentIds;
    private final Boolean turboBonusUsed;

    public /* synthetic */ CashoutRequest(long j, long j2, String str, Boolean bool, String str2, boolean z, List list, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, str, bool, str2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : bool3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashoutRequest copy$default(CashoutRequest cashoutRequest, long j, long j2, String str, Boolean bool, String str2, boolean z, List list, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cashoutRequest.betId;
        }
        return cashoutRequest.copy(j, (i & 2) != 0 ? cashoutRequest.roundId : j2, (i & 4) != 0 ? cashoutRequest.coefficient : str, (i & 8) != 0 ? cashoutRequest.isAutoCashout : bool, (i & 16) != 0 ? cashoutRequest.timestamp : str2, (i & 32) != 0 ? cashoutRequest.isCampaignUser : z, (i & 64) != 0 ? cashoutRequest.tournamentIds : list, (i & 128) != 0 ? cashoutRequest.turboBonusUsed : bool2, (i & 256) != 0 ? cashoutRequest.stakeSafeUsed : bool3);
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

    public final List<String> component7() {
        return this.tournamentIds;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getTurboBonusUsed() {
        return this.turboBonusUsed;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getStakeSafeUsed() {
        return this.stakeSafeUsed;
    }

    public final CashoutRequest copy(long betId, long roundId, String coefficient, Boolean isAutoCashout, String timestamp, boolean isCampaignUser, List<String> tournamentIds, Boolean turboBonusUsed, Boolean stakeSafeUsed) {
        coefficient.getClass();
        timestamp.getClass();
        return new CashoutRequest(betId, roundId, coefficient, isAutoCashout, timestamp, isCampaignUser, tournamentIds, turboBonusUsed, stakeSafeUsed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashoutRequest)) {
            return false;
        }
        CashoutRequest cashoutRequest = (CashoutRequest) other;
        return this.betId == cashoutRequest.betId && this.roundId == cashoutRequest.roundId && Intrinsics.g(this.coefficient, cashoutRequest.coefficient) && Intrinsics.g(this.isAutoCashout, cashoutRequest.isAutoCashout) && Intrinsics.g(this.timestamp, cashoutRequest.timestamp) && this.isCampaignUser == cashoutRequest.isCampaignUser && Intrinsics.g(this.tournamentIds, cashoutRequest.tournamentIds) && Intrinsics.g(this.turboBonusUsed, cashoutRequest.turboBonusUsed) && Intrinsics.g(this.stakeSafeUsed, cashoutRequest.stakeSafeUsed);
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

    public final Boolean getStakeSafeUsed() {
        return this.stakeSafeUsed;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final List<String> getTournamentIds() {
        return this.tournamentIds;
    }

    public final Boolean getTurboBonusUsed() {
        return this.turboBonusUsed;
    }

    public int hashCode() {
        int iA = gmf0.a(f87.a(Long.hashCode(this.betId) * 31, this.roundId, 31), 31, this.coefficient);
        Boolean bool = this.isAutoCashout;
        int iA2 = mtg0.a(gmf0.a((iA + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.timestamp), 31, this.isCampaignUser);
        List<String> list = this.tournamentIds;
        int iHashCode = (iA2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.turboBonusUsed;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.stakeSafeUsed;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
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
        List<String> list = this.tournamentIds;
        Boolean bool2 = this.turboBonusUsed;
        Boolean bool3 = this.stakeSafeUsed;
        StringBuilder sbA = q6a0.a(j, "CashoutRequest(betId=", ", roundId=");
        em5.a(j2, ", coefficient=", str, sbA);
        sbA.append(", isAutoCashout=");
        sbA.append(bool);
        sbA.append(", timestamp=");
        sbA.append(str2);
        sbA.append(", isCampaignUser=");
        sbA.append(z);
        sbA.append(tYcQsJyaojE.jnlKTPflUA);
        sbA.append(list);
        sbA.append(", turboBonusUsed=");
        sbA.append(bool2);
        sbA.append(", stakeSafeUsed=");
        sbA.append(bool3);
        sbA.append(")");
        return sbA.toString();
    }

    public CashoutRequest(long j, long j2, String str, Boolean bool, String str2, boolean z, List<String> list, Boolean bool2, Boolean bool3) {
        str.getClass();
        str2.getClass();
        this.betId = j;
        this.roundId = j2;
        this.coefficient = str;
        this.isAutoCashout = bool;
        this.timestamp = str2;
        this.isCampaignUser = z;
        this.tournamentIds = list;
        this.turboBonusUsed = bool2;
        this.stakeSafeUsed = bool3;
    }
}
