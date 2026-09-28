package com.sporty.android.core.model.welcomereward;

import com.google.gson.annotations.SerializedName;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR)\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\u0002\b\u001f¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/welcomereward/LuckyWheelMetadata;", "", "depositAmount", "", "maxPrizeAmount", "expiresAt", "luckyWheelType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDepositAmount", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getMaxPrizeAmount", "getExpiresAt", "getLuckyWheelType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sporty/android/core/model/welcomereward/LuckyWheelMetadata;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LuckyWheelMetadata {

    @SerializedName("depositAmount")
    private final String depositAmount;

    @SerializedName("expiresAt")
    private final String expiresAt;

    @SerializedName("luckyWheelType")
    private final Integer luckyWheelType;

    @SerializedName("maxPrizeAmount")
    private final String maxPrizeAmount;

    public /* synthetic */ LuckyWheelMetadata(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
    }

    public static /* synthetic */ LuckyWheelMetadata copy$default(LuckyWheelMetadata luckyWheelMetadata, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = luckyWheelMetadata.depositAmount;
        }
        if ((i & 2) != 0) {
            str2 = luckyWheelMetadata.maxPrizeAmount;
        }
        if ((i & 4) != 0) {
            str3 = luckyWheelMetadata.expiresAt;
        }
        if ((i & 8) != 0) {
            num = luckyWheelMetadata.luckyWheelType;
        }
        return luckyWheelMetadata.copy(str, str2, str3, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDepositAmount() {
        return this.depositAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMaxPrizeAmount() {
        return this.maxPrizeAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getLuckyWheelType() {
        return this.luckyWheelType;
    }

    public final LuckyWheelMetadata copy(String depositAmount, String maxPrizeAmount, String expiresAt, Integer luckyWheelType) {
        return new LuckyWheelMetadata(depositAmount, maxPrizeAmount, expiresAt, luckyWheelType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LuckyWheelMetadata)) {
            return false;
        }
        LuckyWheelMetadata luckyWheelMetadata = (LuckyWheelMetadata) other;
        return Intrinsics.g(this.depositAmount, luckyWheelMetadata.depositAmount) && Intrinsics.g(this.maxPrizeAmount, luckyWheelMetadata.maxPrizeAmount) && Intrinsics.g(this.expiresAt, luckyWheelMetadata.expiresAt) && Intrinsics.g(this.luckyWheelType, luckyWheelMetadata.luckyWheelType);
    }

    public final String getDepositAmount() {
        return this.depositAmount;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final Integer getLuckyWheelType() {
        return this.luckyWheelType;
    }

    public final String getMaxPrizeAmount() {
        return this.maxPrizeAmount;
    }

    public int hashCode() {
        String str = this.depositAmount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.maxPrizeAmount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expiresAt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.luckyWheelType;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.depositAmount;
        String str2 = this.maxPrizeAmount;
        String str3 = this.expiresAt;
        Integer num = this.luckyWheelType;
        StringBuilder sbA = ux5.a("LuckyWheelMetadata(depositAmount=", str, ", maxPrizeAmount=", str2, ", expiresAt=");
        sbA.append(str3);
        sbA.append(", luckyWheelType=");
        sbA.append(num);
        sbA.append(")");
        return sbA.toString();
    }

    public LuckyWheelMetadata(String str, String str2, String str3, Integer num) {
        this.depositAmount = str;
        this.maxPrizeAmount = str2;
        this.expiresAt = str3;
        this.luckyWheelType = num;
    }

    public LuckyWheelMetadata() {
        this(null, null, null, null, 15, null);
    }
}
