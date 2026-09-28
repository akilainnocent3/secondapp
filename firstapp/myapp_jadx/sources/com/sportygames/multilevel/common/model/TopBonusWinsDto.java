package com.sportygames.multilevel.common.model;

import com.google.gson.annotations.SerializedName;
import defpackage.gmf0;
import defpackage.pr0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sportygames/multilevel/common/model/TopBonusWinsDto;", "", "winAmount", "", "currency", "", "nickName", "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "getWinAmount", "()D", "getCurrency", "()Ljava/lang/String;", "getNickName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopBonusWinsDto {
    public static final int $stable = 0;

    @SerializedName("currency")
    private final String currency;

    @SerializedName("nickName")
    private final String nickName;

    @SerializedName("winAmount")
    private final double winAmount;

    public TopBonusWinsDto(double d, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.winAmount = d;
        this.currency = str;
        this.nickName = str2;
    }

    public static /* synthetic */ TopBonusWinsDto copy$default(TopBonusWinsDto topBonusWinsDto, double d, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = topBonusWinsDto.winAmount;
        }
        if ((i & 2) != 0) {
            str = topBonusWinsDto.currency;
        }
        if ((i & 4) != 0) {
            str2 = topBonusWinsDto.nickName;
        }
        return topBonusWinsDto.copy(d, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getWinAmount() {
        return this.winAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    public final TopBonusWinsDto copy(double winAmount, String currency, String nickName) {
        currency.getClass();
        nickName.getClass();
        return new TopBonusWinsDto(winAmount, currency, nickName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopBonusWinsDto)) {
            return false;
        }
        TopBonusWinsDto topBonusWinsDto = (TopBonusWinsDto) other;
        return Double.compare(this.winAmount, topBonusWinsDto.winAmount) == 0 && Intrinsics.g(this.currency, topBonusWinsDto.currency) && Intrinsics.g(this.nickName, topBonusWinsDto.nickName);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final double getWinAmount() {
        return this.winAmount;
    }

    public int hashCode() {
        return this.nickName.hashCode() + gmf0.a(Double.hashCode(this.winAmount) * 31, 31, this.currency);
    }

    public String toString() {
        double d = this.winAmount;
        String str = this.currency;
        String str2 = this.nickName;
        StringBuilder sb = new StringBuilder("TopBonusWinsDto(winAmount=");
        sb.append(d);
        sb.append(", currency=");
        sb.append(str);
        return pr0.a(sb, ", nickName=", str2, ")");
    }
}
