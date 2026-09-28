package com.sportybet.android.instantwin.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/domain/GiftCurrentBalance;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GiftCurrentBalance implements Parcelable {
    public static final Parcelable.Creator<GiftCurrentBalance> CREATOR = new a();
    public final String a;
    public final long b;

    public static final class a implements Parcelable.Creator<GiftCurrentBalance> {
        @Override // android.os.Parcelable.Creator
        public final GiftCurrentBalance createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new GiftCurrentBalance(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final GiftCurrentBalance[] newArray(int i) {
            return new GiftCurrentBalance[i];
        }
    }

    public GiftCurrentBalance(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCurrentBalance)) {
            return false;
        }
        GiftCurrentBalance giftCurrentBalance = (GiftCurrentBalance) obj;
        return Intrinsics.g(this.a, giftCurrentBalance.a) && this.b == giftCurrentBalance.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = x.a(this.b, "GiftCurrentBalance(giftId=", this.a, ", currentBalance=");
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
    }
}
