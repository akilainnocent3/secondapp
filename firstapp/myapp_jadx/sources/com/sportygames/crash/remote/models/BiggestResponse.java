package com.sportygames.crash.remote.models;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.dy5;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.qn4;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u0097\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017¨\u00065"}, d2 = {"Lcom/sportygames/crash/remote/models/BiggestResponse;", "", AnalyticsParam.EVENT_PARAM_ID, "", "userId", "nickName", "", "avatar", "roundId", "stakeAmount", "payoutAmount", "houseCoefficient", "countryCode", "currency", "payoutOrCoefficient", "timeRange", "updateTime", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getUserId", "getNickName", "()Ljava/lang/String;", "getAvatar", "getRoundId", "getStakeAmount", "getPayoutAmount", "getHouseCoefficient", "getCountryCode", "getCurrency", "getPayoutOrCoefficient", "getTimeRange", "getUpdateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiggestResponse {
    public static final int $stable = 0;
    private final String avatar;
    private final String countryCode;
    private final String currency;
    private final String houseCoefficient;
    private final int id;
    private final String nickName;
    private final String payoutAmount;
    private final String payoutOrCoefficient;
    private final String roundId;
    private final String stakeAmount;
    private final String timeRange;
    private final String updateTime;
    private final int userId;

    public BiggestResponse(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        qn4.b(str3, str6, str7, str10, str11);
        this.id = i;
        this.userId = i2;
        this.nickName = str;
        this.avatar = str2;
        this.roundId = str3;
        this.stakeAmount = str4;
        this.payoutAmount = str5;
        this.houseCoefficient = str6;
        this.countryCode = str7;
        this.currency = str8;
        this.payoutOrCoefficient = str9;
        this.timeRange = str10;
        this.updateTime = str11;
    }

    public static /* synthetic */ BiggestResponse copy$default(BiggestResponse biggestResponse, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = biggestResponse.id;
        }
        return biggestResponse.copy(i, (i3 & 2) != 0 ? biggestResponse.userId : i2, (i3 & 4) != 0 ? biggestResponse.nickName : str, (i3 & 8) != 0 ? biggestResponse.avatar : str2, (i3 & 16) != 0 ? biggestResponse.roundId : str3, (i3 & 32) != 0 ? biggestResponse.stakeAmount : str4, (i3 & 64) != 0 ? biggestResponse.payoutAmount : str5, (i3 & 128) != 0 ? biggestResponse.houseCoefficient : str6, (i3 & 256) != 0 ? biggestResponse.countryCode : str7, (i3 & 512) != 0 ? biggestResponse.currency : str8, (i3 & 1024) != 0 ? biggestResponse.payoutOrCoefficient : str9, (i3 & 2048) != 0 ? biggestResponse.timeRange : str10, (i3 & 4096) != 0 ? biggestResponse.updateTime : str11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPayoutOrCoefficient() {
        return this.payoutOrCoefficient;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTimeRange() {
        return this.timeRange;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getHouseCoefficient() {
        return this.houseCoefficient;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final BiggestResponse copy(int id, int userId, String nickName, String avatar, String roundId, String stakeAmount, String payoutAmount, String houseCoefficient, String countryCode, String currency, String payoutOrCoefficient, String timeRange, String updateTime) {
        roundId.getClass();
        houseCoefficient.getClass();
        countryCode.getClass();
        timeRange.getClass();
        updateTime.getClass();
        return new BiggestResponse(id, userId, nickName, avatar, roundId, stakeAmount, payoutAmount, houseCoefficient, countryCode, currency, payoutOrCoefficient, timeRange, updateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiggestResponse)) {
            return false;
        }
        BiggestResponse biggestResponse = (BiggestResponse) other;
        return this.id == biggestResponse.id && this.userId == biggestResponse.userId && Intrinsics.g(this.nickName, biggestResponse.nickName) && Intrinsics.g(this.avatar, biggestResponse.avatar) && Intrinsics.g(this.roundId, biggestResponse.roundId) && Intrinsics.g(this.stakeAmount, biggestResponse.stakeAmount) && Intrinsics.g(this.payoutAmount, biggestResponse.payoutAmount) && Intrinsics.g(this.houseCoefficient, biggestResponse.houseCoefficient) && Intrinsics.g(this.countryCode, biggestResponse.countryCode) && Intrinsics.g(this.currency, biggestResponse.currency) && Intrinsics.g(this.payoutOrCoefficient, biggestResponse.payoutOrCoefficient) && Intrinsics.g(this.timeRange, biggestResponse.timeRange) && Intrinsics.g(this.updateTime, biggestResponse.updateTime);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getHouseCoefficient() {
        return this.houseCoefficient;
    }

    public final int getId() {
        return this.id;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getPayoutAmount() {
        return this.payoutAmount;
    }

    public final String getPayoutOrCoefficient() {
        return this.payoutOrCoefficient;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public final String getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getTimeRange() {
        return this.timeRange;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = gpp.a(this.userId, Integer.hashCode(this.id) * 31, 31);
        String str = this.nickName;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatar;
        int iA2 = gmf0.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.roundId);
        String str3 = this.stakeAmount;
        int iHashCode2 = (iA2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.payoutAmount;
        int iA3 = gmf0.a(gmf0.a((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.houseCoefficient), 31, this.countryCode);
        String str5 = this.currency;
        int iHashCode3 = (iA3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.payoutOrCoefficient;
        return this.updateTime.hashCode() + gmf0.a((iHashCode3 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.timeRange);
    }

    public String toString() {
        int i = this.id;
        int i2 = this.userId;
        String str = this.nickName;
        String str2 = this.avatar;
        String str3 = this.roundId;
        String str4 = this.stakeAmount;
        String str5 = this.payoutAmount;
        String str6 = this.houseCoefficient;
        String str7 = this.countryCode;
        String str8 = this.currency;
        String str9 = this.payoutOrCoefficient;
        String str10 = this.timeRange;
        String str11 = this.updateTime;
        StringBuilder sbA = dy5.a("BiggestResponse(id=", i, i2, ", userId=", ", nickName=");
        hxa.c(sbA, str, ", avatar=", str2, ", roundId=");
        hxa.c(sbA, str3, ", stakeAmount=", str4, ", payoutAmount=");
        hxa.c(sbA, str5, ", houseCoefficient=", str6, ", countryCode=");
        hxa.c(sbA, str7, ", currency=", str8, ", payoutOrCoefficient=");
        hxa.c(sbA, str9, ", timeRange=", str10, ", updateTime=");
        return uf80.a(sbA, str11, ")");
    }
}
