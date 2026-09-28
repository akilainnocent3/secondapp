package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f78;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0089\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u00020\bHÖ\u0081\u0004J\n\u00100\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R%\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R'\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R'\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R'\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012Ê\u0001\f\b2\u0012\b\b3\u0012\u0004\b\u0003\u0010\u0002¨\u00061"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballWinninInfo;", "", "ticketId", "", "orderShortId", "userId", "countryCode", "bizType", "", "type", "sportId", AnalyticsParam.EVENT_STATUS, "currency", "totalStake", "winAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTicketId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getOrderShortId", "getUserId", "getCountryCode", "getBizType", "()I", "getType", "getSportId", "getStatus", "getCurrency", "getTotalStake", "getWinAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballWinninInfo {
    public static final int $stable = 0;

    @SerializedName("bizType")
    private final int bizType;

    @SerializedName("countryCode")
    private final String countryCode;

    @SerializedName("currency")
    private final String currency;

    @SerializedName("orderShortId")
    private final String orderShortId;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    @SerializedName("ticketId")
    private final String ticketId;

    @SerializedName("totalStake")
    private final String totalStake;

    @SerializedName("type")
    private final String type;

    @SerializedName("userId")
    private final String userId;

    @SerializedName("winAmount")
    private final String winAmount;

    public NetworkScheduledFootballWinninInfo(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, String str7, String str8, String str9) {
        this.ticketId = str;
        this.orderShortId = str2;
        this.userId = str3;
        this.countryCode = str4;
        this.bizType = i;
        this.type = str5;
        this.sportId = str6;
        this.status = i2;
        this.currency = str7;
        this.totalStake = str8;
        this.winAmount = str9;
    }

    public static /* synthetic */ NetworkScheduledFootballWinninInfo copy$default(NetworkScheduledFootballWinninInfo networkScheduledFootballWinninInfo, String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, String str7, String str8, String str9, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = networkScheduledFootballWinninInfo.ticketId;
        }
        if ((i3 & 2) != 0) {
            str2 = networkScheduledFootballWinninInfo.orderShortId;
        }
        if ((i3 & 4) != 0) {
            str3 = networkScheduledFootballWinninInfo.userId;
        }
        if ((i3 & 8) != 0) {
            str4 = networkScheduledFootballWinninInfo.countryCode;
        }
        if ((i3 & 16) != 0) {
            i = networkScheduledFootballWinninInfo.bizType;
        }
        if ((i3 & 32) != 0) {
            str5 = networkScheduledFootballWinninInfo.type;
        }
        if ((i3 & 64) != 0) {
            str6 = networkScheduledFootballWinninInfo.sportId;
        }
        if ((i3 & 128) != 0) {
            i2 = networkScheduledFootballWinninInfo.status;
        }
        if ((i3 & 256) != 0) {
            str7 = networkScheduledFootballWinninInfo.currency;
        }
        if ((i3 & 512) != 0) {
            str8 = networkScheduledFootballWinninInfo.totalStake;
        }
        if ((i3 & 1024) != 0) {
            str9 = networkScheduledFootballWinninInfo.winAmount;
        }
        String str10 = str8;
        String str11 = str9;
        int i4 = i2;
        String str12 = str7;
        String str13 = str5;
        String str14 = str6;
        int i5 = i;
        String str15 = str3;
        return networkScheduledFootballWinninInfo.copy(str, str2, str15, str4, i5, str13, str14, i4, str12, str10, str11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTotalStake() {
        return this.totalStake;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getWinAmount() {
        return this.winAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderShortId() {
        return this.orderShortId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBizType() {
        return this.bizType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final NetworkScheduledFootballWinninInfo copy(String ticketId, String orderShortId, String userId, String countryCode, int bizType, String type, String sportId, int status, String currency, String totalStake, String winAmount) {
        return new NetworkScheduledFootballWinninInfo(ticketId, orderShortId, userId, countryCode, bizType, type, sportId, status, currency, totalStake, winAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballWinninInfo)) {
            return false;
        }
        NetworkScheduledFootballWinninInfo networkScheduledFootballWinninInfo = (NetworkScheduledFootballWinninInfo) other;
        return Intrinsics.g(this.ticketId, networkScheduledFootballWinninInfo.ticketId) && Intrinsics.g(this.orderShortId, networkScheduledFootballWinninInfo.orderShortId) && Intrinsics.g(this.userId, networkScheduledFootballWinninInfo.userId) && Intrinsics.g(this.countryCode, networkScheduledFootballWinninInfo.countryCode) && this.bizType == networkScheduledFootballWinninInfo.bizType && Intrinsics.g(this.type, networkScheduledFootballWinninInfo.type) && Intrinsics.g(this.sportId, networkScheduledFootballWinninInfo.sportId) && this.status == networkScheduledFootballWinninInfo.status && Intrinsics.g(this.currency, networkScheduledFootballWinninInfo.currency) && Intrinsics.g(this.totalStake, networkScheduledFootballWinninInfo.totalStake) && Intrinsics.g(this.winAmount, networkScheduledFootballWinninInfo.winAmount);
    }

    public final int getBizType() {
        return this.bizType;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getOrderShortId() {
        return this.orderShortId;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public final String getTotalStake() {
        return this.totalStake;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getWinAmount() {
        return this.winAmount;
    }

    public int hashCode() {
        String str = this.ticketId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderShortId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.countryCode;
        int iA = gpp.a(this.bizType, (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.type;
        int iHashCode4 = (iA + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sportId;
        int iA2 = gpp.a(this.status, (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        String str7 = this.currency;
        int iHashCode5 = (iA2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.totalStake;
        int iHashCode6 = (iHashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.winAmount;
        return iHashCode6 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String str = this.ticketId;
        String str2 = this.orderShortId;
        String str3 = this.userId;
        String str4 = this.countryCode;
        int i = this.bizType;
        String str5 = this.type;
        String str6 = this.sportId;
        int i2 = this.status;
        String str7 = this.currency;
        String str8 = this.totalStake;
        String str9 = this.winAmount;
        StringBuilder sbA = ux5.a("NetworkScheduledFootballWinninInfo(ticketId=", str, ", orderShortId=", str2, ", userId=");
        hxa.c(sbA, str3, ", countryCode=", str4, ", bizType=");
        f78.b(i, ", type=", str5, ", sportId=", sbA);
        wxa.b(i2, str6, ", status=", ", currency=", sbA);
        hxa.c(sbA, str7, ", totalStake=", str8, ", winAmount=");
        return uf80.a(sbA, str9, ")");
    }
}
