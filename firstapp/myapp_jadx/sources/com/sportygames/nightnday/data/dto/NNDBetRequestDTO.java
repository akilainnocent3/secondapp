package com.sportygames.nightnday.data.dto;

import defpackage.gmf0;
import defpackage.itu;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014JN\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/sportygames/nightnday/data/dto/NNDBetRequestDTO;", "", "userPick", "", "stakeAmount", "", "betAmount", "currency", "giftId", "giftAmount", "<init>", "(Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getUserPick", "()Ljava/lang/String;", "getStakeAmount", "()D", "getBetAmount", "getCurrency", "getGiftId", "getGiftAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/sportygames/nightnday/data/dto/NNDBetRequestDTO;", "equals", "", "other", "hashCode", "", "toString", "game-nightnday_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NNDBetRequestDTO {
    public static final int $stable = 0;
    private final double betAmount;
    private final String currency;
    private final Double giftAmount;
    private final String giftId;
    private final double stakeAmount;
    private final String userPick;

    public NNDBetRequestDTO(String str, double d, double d2, String str2, String str3, Double d3) {
        str.getClass();
        str2.getClass();
        this.userPick = str;
        this.stakeAmount = d;
        this.betAmount = d2;
        this.currency = str2;
        this.giftId = str3;
        this.giftAmount = d3;
    }

    public static /* synthetic */ NNDBetRequestDTO copy$default(NNDBetRequestDTO nNDBetRequestDTO, String str, double d, double d2, String str2, String str3, Double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nNDBetRequestDTO.userPick;
        }
        if ((i & 2) != 0) {
            d = nNDBetRequestDTO.stakeAmount;
        }
        if ((i & 4) != 0) {
            d2 = nNDBetRequestDTO.betAmount;
        }
        if ((i & 8) != 0) {
            str2 = nNDBetRequestDTO.currency;
        }
        if ((i & 16) != 0) {
            str3 = nNDBetRequestDTO.giftId;
        }
        if ((i & 32) != 0) {
            d3 = nNDBetRequestDTO.giftAmount;
        }
        Double d4 = d3;
        String str4 = str2;
        double d5 = d2;
        return nNDBetRequestDTO.copy(str, d, d5, str4, str3, d4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserPick() {
        return this.userPick;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getBetAmount() {
        return this.betAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final NNDBetRequestDTO copy(String userPick, double stakeAmount, double betAmount, String currency, String giftId, Double giftAmount) {
        userPick.getClass();
        currency.getClass();
        return new NNDBetRequestDTO(userPick, stakeAmount, betAmount, currency, giftId, giftAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NNDBetRequestDTO)) {
            return false;
        }
        NNDBetRequestDTO nNDBetRequestDTO = (NNDBetRequestDTO) other;
        return Intrinsics.g(this.userPick, nNDBetRequestDTO.userPick) && Double.compare(this.stakeAmount, nNDBetRequestDTO.stakeAmount) == 0 && Double.compare(this.betAmount, nNDBetRequestDTO.betAmount) == 0 && Intrinsics.g(this.currency, nNDBetRequestDTO.currency) && Intrinsics.g(this.giftId, nNDBetRequestDTO.giftId) && Intrinsics.g(this.giftAmount, nNDBetRequestDTO.giftAmount);
    }

    public final double getBetAmount() {
        return this.betAmount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getUserPick() {
        return this.userPick;
    }

    public int hashCode() {
        int iA = gmf0.a(nrg0.a(nrg0.a(this.userPick.hashCode() * 31, 31, this.stakeAmount), 31, this.betAmount), 31, this.currency);
        String str = this.giftId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.giftAmount;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NNDBetRequestDTO(userPick=");
        sb.append(this.userPick);
        sb.append(", stakeAmount=");
        sb.append(this.stakeAmount);
        sb.append(", betAmount=");
        sb.append(this.betAmount);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", giftId=");
        sb.append(this.giftId);
        sb.append(", giftAmount=");
        return itu.a(sb, this.giftAmount, ')');
    }

    public /* synthetic */ NNDBetRequestDTO(String str, double d, double d2, String str2, String str3, Double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d, d2, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : d3);
    }
}
