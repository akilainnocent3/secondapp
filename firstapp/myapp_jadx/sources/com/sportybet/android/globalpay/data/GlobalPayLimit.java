package com.sportybet.android.globalpay.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f78;
import defpackage.f87;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J<\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\bJ\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\u0002\b&Ê\u0001\f\b'\u0012\b\b(\u0012\u0004\b\u0003\u0010\u0000¨\u0006%"}, d2 = {"Lcom/sportybet/android/globalpay/data/GlobalPayLimit;", "Landroid/os/Parcelable;", "country", "", "currency", "amount", "", "payCh", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;)V", "getCountry", "()Ljava/lang/String;", "getCurrency", "getAmount", "()J", "getPayCh", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;)Lcom/sportybet/android/globalpay/data/GlobalPayLimit;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GlobalPayLimit implements Parcelable {
    private final long amount;
    private final String country;
    private final String currency;
    private final Integer payCh;
    public static final Parcelable.Creator<GlobalPayLimit> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GlobalPayLimit> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GlobalPayLimit createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new GlobalPayLimit(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GlobalPayLimit[] newArray(int i) {
            return new GlobalPayLimit[i];
        }
    }

    public GlobalPayLimit(String str, String str2, long j, Integer num) {
        this.country = str;
        this.currency = str2;
        this.amount = j;
        this.payCh = num;
    }

    public static /* synthetic */ GlobalPayLimit copy$default(GlobalPayLimit globalPayLimit, String str, String str2, long j, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = globalPayLimit.country;
        }
        if ((i & 2) != 0) {
            str2 = globalPayLimit.currency;
        }
        if ((i & 4) != 0) {
            j = globalPayLimit.amount;
        }
        if ((i & 8) != 0) {
            num = globalPayLimit.payCh;
        }
        Integer num2 = num;
        return globalPayLimit.copy(str, str2, j, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getPayCh() {
        return this.payCh;
    }

    public final GlobalPayLimit copy(String country, String currency, long amount, Integer payCh) {
        return new GlobalPayLimit(country, currency, amount, payCh);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalPayLimit)) {
            return false;
        }
        GlobalPayLimit globalPayLimit = (GlobalPayLimit) other;
        return Intrinsics.g(this.country, globalPayLimit.country) && Intrinsics.g(this.currency, globalPayLimit.currency) && this.amount == globalPayLimit.amount && Intrinsics.g(this.payCh, globalPayLimit.payCh);
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Integer getPayCh() {
        return this.payCh;
    }

    public int hashCode() {
        String str = this.country;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iA = f87.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.amount, 31);
        Integer num = this.payCh;
        return iA + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.country;
        String str2 = this.currency;
        long j = this.amount;
        Integer num = this.payCh;
        StringBuilder sbA = ux5.a("GlobalPayLimit(country=", str, ", currency=", str2, ", amount=");
        sbA.append(j);
        sbA.append(", payCh=");
        sbA.append(num);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.country);
        dest.writeString(this.currency);
        dest.writeLong(this.amount);
        Integer num = this.payCh;
        if (num == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num);
        }
    }
}
