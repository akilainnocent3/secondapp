package com.sporty.android.core.model.loyalty;

import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/loyalty/RewardShareImageData;", "", "winnings", "", "currency", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getWinnings", "()Ljava/lang/String;", "getCurrency", "getCountry", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RewardShareImageData {
    private final String country;
    private final String currency;
    private final String winnings;

    public RewardShareImageData(String str, String str2, String str3) {
        str.getClass();
        this.winnings = str;
        this.currency = str2;
        this.country = str3;
    }

    public static /* synthetic */ RewardShareImageData copy$default(RewardShareImageData rewardShareImageData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardShareImageData.winnings;
        }
        if ((i & 2) != 0) {
            str2 = rewardShareImageData.currency;
        }
        if ((i & 4) != 0) {
            str3 = rewardShareImageData.country;
        }
        return rewardShareImageData.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWinnings() {
        return this.winnings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final RewardShareImageData copy(String winnings, String currency, String country) {
        winnings.getClass();
        return new RewardShareImageData(winnings, currency, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardShareImageData)) {
            return false;
        }
        RewardShareImageData rewardShareImageData = (RewardShareImageData) other;
        return Intrinsics.g(this.winnings, rewardShareImageData.winnings) && Intrinsics.g(this.currency, rewardShareImageData.currency) && Intrinsics.g(this.country, rewardShareImageData.country);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getWinnings() {
        return this.winnings;
    }

    public int hashCode() {
        int iHashCode = this.winnings.hashCode() * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.country;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.winnings;
        String str2 = this.currency;
        return uf80.a(ux5.a("RewardShareImageData(winnings=", str, ", currency=", str2, ", country="), this.country, ")");
    }
}
