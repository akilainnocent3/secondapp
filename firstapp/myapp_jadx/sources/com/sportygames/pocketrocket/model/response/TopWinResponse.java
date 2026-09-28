package com.sportygames.pocketrocket.model.response;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.lsv;
import defpackage.pr0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003Jr\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u00061"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/TopWinResponse;", "", AnalyticsParam.EVENT_PARAM_ID, "", "userId", "", "nickName", "", "rocketType", "stakeAmount", "", "payoutAmount", "cashoutCoefficient", "createTime", "currency", "<init>", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getUserId", "()I", "getNickName", "()Ljava/lang/String;", "getRocketType", "getStakeAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPayoutAmount", "getCashoutCoefficient", "getCreateTime", "setCreateTime", "(Ljava/lang/String;)V", "getCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/sportygames/pocketrocket/model/response/TopWinResponse;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopWinResponse {
    public static final int $stable = 8;
    private final Double cashoutCoefficient;
    private String createTime;
    private final String currency;
    private final long id;
    private final String nickName;
    private final Double payoutAmount;
    private final String rocketType;
    private final Double stakeAmount;
    private final int userId;

    public TopWinResponse(long j, int i, String str, String str2, Double d, Double d2, Double d3, String str3, String str4) {
        str.getClass();
        str4.getClass();
        this.id = j;
        this.userId = i;
        this.nickName = str;
        this.rocketType = str2;
        this.stakeAmount = d;
        this.payoutAmount = d2;
        this.cashoutCoefficient = d3;
        this.createTime = str3;
        this.currency = str4;
    }

    public static /* synthetic */ TopWinResponse copy$default(TopWinResponse topWinResponse, long j, int i, String str, String str2, Double d, Double d2, Double d3, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = topWinResponse.id;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i = topWinResponse.userId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = topWinResponse.nickName;
        }
        return topWinResponse.copy(j2, i3, str, (i2 & 8) != 0 ? topWinResponse.rocketType : str2, (i2 & 16) != 0 ? topWinResponse.stakeAmount : d, (i2 & 32) != 0 ? topWinResponse.payoutAmount : d2, (i2 & 64) != 0 ? topWinResponse.cashoutCoefficient : d3, (i2 & 128) != 0 ? topWinResponse.createTime : str3, (i2 & 256) != 0 ? topWinResponse.currency : str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
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
    public final String getRocketType() {
        return this.rocketType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final TopWinResponse copy(long id, int userId, String nickName, String rocketType, Double stakeAmount, Double payoutAmount, Double cashoutCoefficient, String createTime, String currency) {
        nickName.getClass();
        currency.getClass();
        return new TopWinResponse(id, userId, nickName, rocketType, stakeAmount, payoutAmount, cashoutCoefficient, createTime, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopWinResponse)) {
            return false;
        }
        TopWinResponse topWinResponse = (TopWinResponse) other;
        return this.id == topWinResponse.id && this.userId == topWinResponse.userId && Intrinsics.g(this.nickName, topWinResponse.nickName) && Intrinsics.g(this.rocketType, topWinResponse.rocketType) && Intrinsics.g(this.stakeAmount, topWinResponse.stakeAmount) && Intrinsics.g(this.payoutAmount, topWinResponse.payoutAmount) && Intrinsics.g(this.cashoutCoefficient, topWinResponse.cashoutCoefficient) && Intrinsics.g(this.createTime, topWinResponse.createTime) && Intrinsics.g(this.currency, topWinResponse.currency);
    }

    public final Double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final long getId() {
        return this.id;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final String getRocketType() {
        return this.rocketType;
    }

    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = gmf0.a(gpp.a(this.userId, Long.hashCode(this.id) * 31, 31), 31, this.nickName);
        String str = this.rocketType;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.stakeAmount;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.payoutAmount;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.cashoutCoefficient;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str2 = this.createTime;
        return this.currency.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final void setCreateTime(String str) {
        this.createTime = str;
    }

    public String toString() {
        long j = this.id;
        int i = this.userId;
        String str = this.nickName;
        String str2 = this.rocketType;
        Double d = this.stakeAmount;
        Double d2 = this.payoutAmount;
        Double d3 = this.cashoutCoefficient;
        String str3 = this.createTime;
        String str4 = this.currency;
        StringBuilder sb = new StringBuilder("TopWinResponse(id=");
        sb.append(j);
        sb.append(", userId=");
        sb.append(i);
        hxa.c(sb, ", nickName=", str, ", rocketType=", str2);
        lsv.a(d, d2, ", stakeAmount=", ", payoutAmount=", sb);
        sb.append(", cashoutCoefficient=");
        sb.append(d3);
        sb.append(", createTime=");
        sb.append(str3);
        return pr0.a(sb, ", currency=", str4, ")");
    }
}
