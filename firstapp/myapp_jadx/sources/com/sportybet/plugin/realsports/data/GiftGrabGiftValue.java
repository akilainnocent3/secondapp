package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.b0;
import com.appsflyer.internal.w;
import com.google.gson.annotations.SerializedName;
import defpackage.gmf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\u0002\b#Ê\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0000¨\u0006\""}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabGiftValue;", "Landroid/os/Parcelable;", "amount", "", "currency", "", "blockedCashOut", "", "<init>", "(JLjava/lang/String;Z)V", "getAmount", "()J", "Lcom/google/gson/annotations/SerializedName;", "value", "getCurrency", "()Ljava/lang/String;", "getBlockedCashOut", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GiftGrabGiftValue implements Parcelable {

    @SerializedName("amount")
    private final long amount;

    @SerializedName("blockedCashOut")
    private final boolean blockedCashOut;

    @SerializedName("currency")
    private final String currency;
    public static final Parcelable.Creator<GiftGrabGiftValue> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GiftGrabGiftValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GiftGrabGiftValue createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new GiftGrabGiftValue(parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GiftGrabGiftValue[] newArray(int i) {
            return new GiftGrabGiftValue[i];
        }
    }

    public GiftGrabGiftValue(long j, String str, boolean z) {
        str.getClass();
        this.amount = j;
        this.currency = str;
        this.blockedCashOut = z;
    }

    public static /* synthetic */ GiftGrabGiftValue copy$default(GiftGrabGiftValue giftGrabGiftValue, long j, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = giftGrabGiftValue.amount;
        }
        if ((i & 2) != 0) {
            str = giftGrabGiftValue.currency;
        }
        if ((i & 4) != 0) {
            z = giftGrabGiftValue.blockedCashOut;
        }
        return giftGrabGiftValue.copy(j, str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getBlockedCashOut() {
        return this.blockedCashOut;
    }

    public final GiftGrabGiftValue copy(long amount, String currency, boolean blockedCashOut) {
        currency.getClass();
        return new GiftGrabGiftValue(amount, currency, blockedCashOut);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftGrabGiftValue)) {
            return false;
        }
        GiftGrabGiftValue giftGrabGiftValue = (GiftGrabGiftValue) other;
        return this.amount == giftGrabGiftValue.amount && Intrinsics.g(this.currency, giftGrabGiftValue.currency) && this.blockedCashOut == giftGrabGiftValue.blockedCashOut;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final boolean getBlockedCashOut() {
        return this.blockedCashOut;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return Boolean.hashCode(this.blockedCashOut) + gmf0.a(Long.hashCode(this.amount) * 31, 31, this.currency);
    }

    public String toString() {
        long j = this.amount;
        String str = this.currency;
        return w.a(b0.a(j, "GiftGrabGiftValue(amount=", ", currency=", str), ", blockedCashOut=", this.blockedCashOut, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeLong(this.amount);
        dest.writeString(this.currency);
        dest.writeInt(this.blockedCashOut ? 1 : 0);
    }
}
