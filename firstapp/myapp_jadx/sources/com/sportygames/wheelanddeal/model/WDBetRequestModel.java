package com.sportygames.wheelanddeal.model;

import defpackage.f87;
import defpackage.itu;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/sportygames/wheelanddeal/model/WDBetRequestModel;", "", "userSelection", "Lcom/sportygames/wheelanddeal/model/WDUserSelectionModel;", "stakeAmount", "", "configTimeStamp", "", "giftId", "", "giftAmount", "<init>", "(Lcom/sportygames/wheelanddeal/model/WDUserSelectionModel;DJLjava/lang/String;Ljava/lang/Double;)V", "getUserSelection", "()Lcom/sportygames/wheelanddeal/model/WDUserSelectionModel;", "getStakeAmount", "()D", "getConfigTimeStamp", "()J", "getGiftId", "()Ljava/lang/String;", "getGiftAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/sportygames/wheelanddeal/model/WDUserSelectionModel;DJLjava/lang/String;Ljava/lang/Double;)Lcom/sportygames/wheelanddeal/model/WDBetRequestModel;", "equals", "", "other", "hashCode", "", "toString", "game-wheelanddeal_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WDBetRequestModel {
    public static final int $stable = 0;
    private final long configTimeStamp;
    private final Double giftAmount;
    private final String giftId;
    private final double stakeAmount;
    private final WDUserSelectionModel userSelection;

    public WDBetRequestModel(WDUserSelectionModel wDUserSelectionModel, double d, long j, String str, Double d2) {
        wDUserSelectionModel.getClass();
        this.userSelection = wDUserSelectionModel;
        this.stakeAmount = d;
        this.configTimeStamp = j;
        this.giftId = str;
        this.giftAmount = d2;
    }

    public static /* synthetic */ WDBetRequestModel copy$default(WDBetRequestModel wDBetRequestModel, WDUserSelectionModel wDUserSelectionModel, double d, long j, String str, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            wDUserSelectionModel = wDBetRequestModel.userSelection;
        }
        if ((i & 2) != 0) {
            d = wDBetRequestModel.stakeAmount;
        }
        if ((i & 4) != 0) {
            j = wDBetRequestModel.configTimeStamp;
        }
        if ((i & 8) != 0) {
            str = wDBetRequestModel.giftId;
        }
        if ((i & 16) != 0) {
            d2 = wDBetRequestModel.giftAmount;
        }
        long j2 = j;
        return wDBetRequestModel.copy(wDUserSelectionModel, d, j2, str, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WDUserSelectionModel getUserSelection() {
        return this.userSelection;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getConfigTimeStamp() {
        return this.configTimeStamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final WDBetRequestModel copy(WDUserSelectionModel userSelection, double stakeAmount, long configTimeStamp, String giftId, Double giftAmount) {
        userSelection.getClass();
        return new WDBetRequestModel(userSelection, stakeAmount, configTimeStamp, giftId, giftAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WDBetRequestModel)) {
            return false;
        }
        WDBetRequestModel wDBetRequestModel = (WDBetRequestModel) other;
        return Intrinsics.g(this.userSelection, wDBetRequestModel.userSelection) && Double.compare(this.stakeAmount, wDBetRequestModel.stakeAmount) == 0 && this.configTimeStamp == wDBetRequestModel.configTimeStamp && Intrinsics.g(this.giftId, wDBetRequestModel.giftId) && Intrinsics.g(this.giftAmount, wDBetRequestModel.giftAmount);
    }

    public final long getConfigTimeStamp() {
        return this.configTimeStamp;
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

    public final WDUserSelectionModel getUserSelection() {
        return this.userSelection;
    }

    public int hashCode() {
        int iA = f87.a(nrg0.a(this.userSelection.hashCode() * 31, 31, this.stakeAmount), this.configTimeStamp, 31);
        String str = this.giftId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.giftAmount;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WDBetRequestModel(userSelection=");
        sb.append(this.userSelection);
        sb.append(", stakeAmount=");
        sb.append(this.stakeAmount);
        sb.append(", configTimeStamp=");
        sb.append(this.configTimeStamp);
        sb.append(", giftId=");
        sb.append(this.giftId);
        sb.append(", giftAmount=");
        return itu.a(sb, this.giftAmount, ')');
    }

    public /* synthetic */ WDBetRequestModel(WDUserSelectionModel wDUserSelectionModel, double d, long j, String str, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wDUserSelectionModel, d, j, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : d2);
    }
}
