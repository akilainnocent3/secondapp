package com.sportygames.spin2win.model;

import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/sportygames/spin2win/model/IndividualBetRequest;", "", "betTypeId", "", "userPickedNumber", "stakeAmount", "", "<init>", "(ILjava/lang/Integer;D)V", "getBetTypeId", "()I", "getUserPickedNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStakeAmount", "()D", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;D)Lcom/sportygames/spin2win/model/IndividualBetRequest;", "equals", "", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IndividualBetRequest {
    public static final int $stable = 0;
    private final int betTypeId;
    private final double stakeAmount;
    private final Integer userPickedNumber;

    public IndividualBetRequest(int i, Integer num, double d) {
        this.betTypeId = i;
        this.userPickedNumber = num;
        this.stakeAmount = d;
    }

    public static /* synthetic */ IndividualBetRequest copy$default(IndividualBetRequest individualBetRequest, int i, Integer num, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = individualBetRequest.betTypeId;
        }
        if ((i2 & 2) != 0) {
            num = individualBetRequest.userPickedNumber;
        }
        if ((i2 & 4) != 0) {
            d = individualBetRequest.stakeAmount;
        }
        return individualBetRequest.copy(i, num, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBetTypeId() {
        return this.betTypeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getUserPickedNumber() {
        return this.userPickedNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final IndividualBetRequest copy(int betTypeId, Integer userPickedNumber, double stakeAmount) {
        return new IndividualBetRequest(betTypeId, userPickedNumber, stakeAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndividualBetRequest)) {
            return false;
        }
        IndividualBetRequest individualBetRequest = (IndividualBetRequest) other;
        return this.betTypeId == individualBetRequest.betTypeId && Intrinsics.g(this.userPickedNumber, individualBetRequest.userPickedNumber) && Double.compare(this.stakeAmount, individualBetRequest.stakeAmount) == 0;
    }

    public final int getBetTypeId() {
        return this.betTypeId;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final Integer getUserPickedNumber() {
        return this.userPickedNumber;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.betTypeId) * 31;
        Integer num = this.userPickedNumber;
        return Double.hashCode(this.stakeAmount) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public String toString() {
        return "IndividualBetRequest(betTypeId=" + this.betTypeId + jbkEboCkTqmGf.PDbNhZFRoc + this.userPickedNumber + ", stakeAmount=" + this.stakeAmount + ")";
    }

    public /* synthetic */ IndividualBetRequest(int i, Integer num, double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num, d);
    }
}
