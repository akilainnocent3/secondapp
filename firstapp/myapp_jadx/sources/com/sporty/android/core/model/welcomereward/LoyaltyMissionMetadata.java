package com.sporty.android.core.model.welcomereward;

import com.google.gson.annotations.SerializedName;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bÊ\u0001\u0002\b\u0016¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/welcomereward/LoyaltyMissionMetadata;", "", "currency", "", "maxPrizeAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getMaxPrizeAmount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LoyaltyMissionMetadata {

    @SerializedName("currency")
    private final String currency;

    @SerializedName("maxPrizeAmount")
    private final String maxPrizeAmount;

    public /* synthetic */ LoyaltyMissionMetadata(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ LoyaltyMissionMetadata copy$default(LoyaltyMissionMetadata loyaltyMissionMetadata, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loyaltyMissionMetadata.currency;
        }
        if ((i & 2) != 0) {
            str2 = loyaltyMissionMetadata.maxPrizeAmount;
        }
        return loyaltyMissionMetadata.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMaxPrizeAmount() {
        return this.maxPrizeAmount;
    }

    public final LoyaltyMissionMetadata copy(String currency, String maxPrizeAmount) {
        return new LoyaltyMissionMetadata(currency, maxPrizeAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoyaltyMissionMetadata)) {
            return false;
        }
        LoyaltyMissionMetadata loyaltyMissionMetadata = (LoyaltyMissionMetadata) other;
        return Intrinsics.g(this.currency, loyaltyMissionMetadata.currency) && Intrinsics.g(this.maxPrizeAmount, loyaltyMissionMetadata.maxPrizeAmount);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getMaxPrizeAmount() {
        return this.maxPrizeAmount;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.maxPrizeAmount;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return tx5.a("LoyaltyMissionMetadata(currency=", this.currency, ", maxPrizeAmount=", this.maxPrizeAmount, ")");
    }

    public LoyaltyMissionMetadata(String str, String str2) {
        this.currency = str;
        this.maxPrizeAmount = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoyaltyMissionMetadata() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
