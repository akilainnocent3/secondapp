package com.sportybet.android.globalpay.pixBtg.antest;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/globalpay/pixBtg/antest/BrDepositHotButtonConversionData;", "Landroid/os/Parcelable;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BrDepositHotButtonConversionData implements Parcelable {
    public static final Parcelable.Creator<BrDepositHotButtonConversionData> CREATOR = new a();
    public final boolean a;
    public final boolean b;

    public static final class a implements Parcelable.Creator<BrDepositHotButtonConversionData> {
        @Override // android.os.Parcelable.Creator
        public final BrDepositHotButtonConversionData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BrDepositHotButtonConversionData(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BrDepositHotButtonConversionData[] newArray(int i) {
            return new BrDepositHotButtonConversionData[i];
        }
    }

    public BrDepositHotButtonConversionData(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrDepositHotButtonConversionData)) {
            return false;
        }
        BrDepositHotButtonConversionData brDepositHotButtonConversionData = (BrDepositHotButtonConversionData) obj;
        return this.a == brDepositHotButtonConversionData.a && this.b == brDepositHotButtonConversionData.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BrDepositHotButtonConversionData(isFtdEligible=" + this.a + ", isPresetAmount=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
