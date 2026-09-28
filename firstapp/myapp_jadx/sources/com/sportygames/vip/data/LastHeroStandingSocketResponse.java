package com.sportygames.vip.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.j26;
import defpackage.nrg0;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006)"}, d2 = {"Lcom/sportygames/vip/data/LastHeroStandingSocketResponse;", "", AnalyticsParam.EVENT_PARAM_ID, "", "startTime", "", "endTime", "freeBetValue", "", "currency", "claimLimit", "minimumWagerAmount", "messageType", "<init>", "(JLjava/lang/String;Ljava/lang/String;DLjava/lang/String;DDLjava/lang/String;)V", "getId", "()J", "getStartTime", "()Ljava/lang/String;", "getEndTime", "getFreeBetValue", "()D", "getCurrency", "getClaimLimit", "getMinimumWagerAmount", "getMessageType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "vip_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LastHeroStandingSocketResponse {
    public static final int $stable = 0;
    private final double claimLimit;
    private final String currency;
    private final String endTime;
    private final double freeBetValue;
    private final long id;
    private final String messageType;
    private final double minimumWagerAmount;
    private final String startTime;

    public LastHeroStandingSocketResponse(long j, String str, String str2, double d, String str3, double d2, double d3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.id = j;
        this.startTime = str;
        this.endTime = str2;
        this.freeBetValue = d;
        this.currency = str3;
        this.claimLimit = d2;
        this.minimumWagerAmount = d3;
        this.messageType = str4;
    }

    public static /* synthetic */ LastHeroStandingSocketResponse copy$default(LastHeroStandingSocketResponse lastHeroStandingSocketResponse, long j, String str, String str2, double d, String str3, double d2, double d3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = lastHeroStandingSocketResponse.id;
        }
        return lastHeroStandingSocketResponse.copy(j, (i & 2) != 0 ? lastHeroStandingSocketResponse.startTime : str, (i & 4) != 0 ? lastHeroStandingSocketResponse.endTime : str2, (i & 8) != 0 ? lastHeroStandingSocketResponse.freeBetValue : d, (i & 16) != 0 ? lastHeroStandingSocketResponse.currency : str3, (i & 32) != 0 ? lastHeroStandingSocketResponse.claimLimit : d2, (i & 64) != 0 ? lastHeroStandingSocketResponse.minimumWagerAmount : d3, (i & 128) != 0 ? lastHeroStandingSocketResponse.messageType : str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getFreeBetValue() {
        return this.freeBetValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getClaimLimit() {
        return this.claimLimit;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getMinimumWagerAmount() {
        return this.minimumWagerAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    public final LastHeroStandingSocketResponse copy(long id, String startTime, String endTime, double freeBetValue, String currency, double claimLimit, double minimumWagerAmount, String messageType) {
        startTime.getClass();
        endTime.getClass();
        currency.getClass();
        messageType.getClass();
        return new LastHeroStandingSocketResponse(id, startTime, endTime, freeBetValue, currency, claimLimit, minimumWagerAmount, messageType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastHeroStandingSocketResponse)) {
            return false;
        }
        LastHeroStandingSocketResponse lastHeroStandingSocketResponse = (LastHeroStandingSocketResponse) other;
        return this.id == lastHeroStandingSocketResponse.id && Intrinsics.g(this.startTime, lastHeroStandingSocketResponse.startTime) && Intrinsics.g(this.endTime, lastHeroStandingSocketResponse.endTime) && Double.compare(this.freeBetValue, lastHeroStandingSocketResponse.freeBetValue) == 0 && Intrinsics.g(this.currency, lastHeroStandingSocketResponse.currency) && Double.compare(this.claimLimit, lastHeroStandingSocketResponse.claimLimit) == 0 && Double.compare(this.minimumWagerAmount, lastHeroStandingSocketResponse.minimumWagerAmount) == 0 && Intrinsics.g(this.messageType, lastHeroStandingSocketResponse.messageType);
    }

    public final double getClaimLimit() {
        return this.claimLimit;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final double getFreeBetValue() {
        return this.freeBetValue;
    }

    public final long getId() {
        return this.id;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final double getMinimumWagerAmount() {
        return this.minimumWagerAmount;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return this.messageType.hashCode() + nrg0.a(nrg0.a(gmf0.a(nrg0.a(gmf0.a(gmf0.a(Long.hashCode(this.id) * 31, 31, this.startTime), 31, this.endTime), 31, this.freeBetValue), 31, this.currency), 31, this.claimLimit), 31, this.minimumWagerAmount);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LastHeroStandingSocketResponse(id=");
        sb.append(this.id);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", freeBetValue=");
        sb.append(this.freeBetValue);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", claimLimit=");
        sb.append(this.claimLimit);
        sb.append(", minimumWagerAmount=");
        sb.append(this.minimumWagerAmount);
        sb.append(", messageType=");
        return j26.a(sb, this.messageType, ')');
    }
}
