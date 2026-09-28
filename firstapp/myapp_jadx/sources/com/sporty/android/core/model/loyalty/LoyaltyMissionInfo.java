package com.sporty.android.core.model.loyalty;

import com.google.gson.annotations.SerializedName;
import defpackage.mtg0;
import defpackage.u8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR)\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R%\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/loyalty/LoyaltyMissionInfo;", "", "missionId", "", "purchasePayTotal", "isWorldCupPass", "", "isBetslipTheme", "<init>", "(JLjava/lang/Long;ZZ)V", "getMissionId", "()J", "Lcom/google/gson/annotations/SerializedName;", "value", "getPurchasePayTotal", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "component1", "component2", "component3", "component4", "copy", "(JLjava/lang/Long;ZZ)Lcom/sporty/android/core/model/loyalty/LoyaltyMissionInfo;", "equals", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LoyaltyMissionInfo {

    @SerializedName("isBetslipTheme")
    private final boolean isBetslipTheme;

    @SerializedName("isWorldCupPass")
    private final boolean isWorldCupPass;

    @SerializedName("missionId")
    private final long missionId;

    @SerializedName("purchasePayTotal")
    private final Long purchasePayTotal;

    public /* synthetic */ LoyaltyMissionInfo(long j, Long l, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : l, z, z2);
    }

    public static /* synthetic */ LoyaltyMissionInfo copy$default(LoyaltyMissionInfo loyaltyMissionInfo, long j, Long l, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = loyaltyMissionInfo.missionId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            l = loyaltyMissionInfo.purchasePayTotal;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            z = loyaltyMissionInfo.isWorldCupPass;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = loyaltyMissionInfo.isBetslipTheme;
        }
        return loyaltyMissionInfo.copy(j2, l2, z3, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMissionId() {
        return this.missionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getPurchasePayTotal() {
        return this.purchasePayTotal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsWorldCupPass() {
        return this.isWorldCupPass;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsBetslipTheme() {
        return this.isBetslipTheme;
    }

    public final LoyaltyMissionInfo copy(long missionId, Long purchasePayTotal, boolean isWorldCupPass, boolean isBetslipTheme) {
        return new LoyaltyMissionInfo(missionId, purchasePayTotal, isWorldCupPass, isBetslipTheme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoyaltyMissionInfo)) {
            return false;
        }
        LoyaltyMissionInfo loyaltyMissionInfo = (LoyaltyMissionInfo) other;
        return this.missionId == loyaltyMissionInfo.missionId && Intrinsics.g(this.purchasePayTotal, loyaltyMissionInfo.purchasePayTotal) && this.isWorldCupPass == loyaltyMissionInfo.isWorldCupPass && this.isBetslipTheme == loyaltyMissionInfo.isBetslipTheme;
    }

    public final long getMissionId() {
        return this.missionId;
    }

    public final Long getPurchasePayTotal() {
        return this.purchasePayTotal;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.missionId) * 31;
        Long l = this.purchasePayTotal;
        return Boolean.hashCode(this.isBetslipTheme) + mtg0.a((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.isWorldCupPass);
    }

    public final boolean isBetslipTheme() {
        return this.isBetslipTheme;
    }

    public final boolean isWorldCupPass() {
        return this.isWorldCupPass;
    }

    public String toString() {
        long j = this.missionId;
        Long l = this.purchasePayTotal;
        boolean z = this.isWorldCupPass;
        boolean z2 = this.isBetslipTheme;
        StringBuilder sb = new StringBuilder("LoyaltyMissionInfo(missionId=");
        sb.append(j);
        sb.append(", purchasePayTotal=");
        sb.append(l);
        u8.a(", isWorldCupPass=", ", isBetslipTheme=", sb, z, z2);
        sb.append(")");
        return sb.toString();
    }

    public LoyaltyMissionInfo(long j, Long l, boolean z, boolean z2) {
        this.missionId = j;
        this.purchasePayTotal = l;
        this.isWorldCupPass = z;
        this.isBetslipTheme = z2;
    }
}
