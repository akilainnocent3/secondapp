package com.sportybet.feature.winning.domain.model;

import com.appsflyer.internal.v;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012JD\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012Ê\u0001\u0002\b!Ê\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0002¨\u0006 "}, d2 = {"Lcom/sportybet/feature/winning/domain/model/WinningShareData;", "", "winningAmount", "", "displayType", "percent", "", "verifyCode", "settleType", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "getWinningAmount", "()Ljava/lang/String;", "getDisplayType", "getPercent", "()I", "getVerifyCode", "getSettleType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)Lcom/sportybet/feature/winning/domain/model/WinningShareData;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WinningShareData {
    public static final int $stable = 0;
    private final String displayType;
    private final int percent;
    private final Integer settleType;
    private final String verifyCode;
    private final String winningAmount;

    public WinningShareData(String str, String str2, int i, String str3, Integer num) {
        str.getClass();
        str2.getClass();
        this.winningAmount = str;
        this.displayType = str2;
        this.percent = i;
        this.verifyCode = str3;
        this.settleType = num;
    }

    public static /* synthetic */ WinningShareData copy$default(WinningShareData winningShareData, String str, String str2, int i, String str3, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = winningShareData.winningAmount;
        }
        if ((i2 & 2) != 0) {
            str2 = winningShareData.displayType;
        }
        if ((i2 & 4) != 0) {
            i = winningShareData.percent;
        }
        if ((i2 & 8) != 0) {
            str3 = winningShareData.verifyCode;
        }
        if ((i2 & 16) != 0) {
            num = winningShareData.settleType;
        }
        Integer num2 = num;
        int i3 = i;
        return winningShareData.copy(str, str2, i3, str3, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWinningAmount() {
        return this.winningAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayType() {
        return this.displayType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPercent() {
        return this.percent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVerifyCode() {
        return this.verifyCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSettleType() {
        return this.settleType;
    }

    public final WinningShareData copy(String winningAmount, String displayType, int percent, String verifyCode, Integer settleType) {
        winningAmount.getClass();
        displayType.getClass();
        return new WinningShareData(winningAmount, displayType, percent, verifyCode, settleType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WinningShareData)) {
            return false;
        }
        WinningShareData winningShareData = (WinningShareData) other;
        return Intrinsics.g(this.winningAmount, winningShareData.winningAmount) && Intrinsics.g(this.displayType, winningShareData.displayType) && this.percent == winningShareData.percent && Intrinsics.g(this.verifyCode, winningShareData.verifyCode) && Intrinsics.g(this.settleType, winningShareData.settleType);
    }

    public final String getDisplayType() {
        return this.displayType;
    }

    public final int getPercent() {
        return this.percent;
    }

    public final Integer getSettleType() {
        return this.settleType;
    }

    public final String getVerifyCode() {
        return this.verifyCode;
    }

    public final String getWinningAmount() {
        return this.winningAmount;
    }

    public int hashCode() {
        int iA = gpp.a(this.percent, gmf0.a(this.winningAmount.hashCode() * 31, 31, this.displayType), 31);
        String str = this.verifyCode;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.settleType;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.winningAmount;
        String str2 = this.displayType;
        int i = this.percent;
        String str3 = this.verifyCode;
        Integer num = this.settleType;
        StringBuilder sbA = ux5.a("WinningShareData(winningAmount=", str, ", displayType=", str2, ", percent=");
        f78.b(i, ", verifyCode=", str3, ", settleType=", sbA);
        return v.a(sbA, num, ")");
    }

    public /* synthetic */ WinningShareData(String str, String str2, int i, String str3, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : num);
    }
}
