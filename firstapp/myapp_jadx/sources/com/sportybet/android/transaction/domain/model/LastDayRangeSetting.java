package com.sportybet.android.transaction.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gpp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/transaction/domain/model/LastDayRangeSetting;", "Landroid/os/Parcelable;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LastDayRangeSetting implements Parcelable {
    public static final Parcelable.Creator<LastDayRangeSetting> CREATOR = new a();
    public final LastDayRangeOption a;
    public final LastDayRangeOption b;
    public final LastDayRangeOption c;
    public final int d;

    public static final class a implements Parcelable.Creator<LastDayRangeSetting> {
        @Override // android.os.Parcelable.Creator
        public final LastDayRangeSetting createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<LastDayRangeOption> creator = LastDayRangeOption.CREATOR;
            return new LastDayRangeSetting(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LastDayRangeSetting[] newArray(int i) {
            return new LastDayRangeSetting[i];
        }
    }

    public LastDayRangeSetting(LastDayRangeOption lastDayRangeOption, LastDayRangeOption lastDayRangeOption2, LastDayRangeOption lastDayRangeOption3, int i) {
        lastDayRangeOption.getClass();
        lastDayRangeOption2.getClass();
        lastDayRangeOption3.getClass();
        this.a = lastDayRangeOption;
        this.b = lastDayRangeOption2;
        this.c = lastDayRangeOption3;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastDayRangeSetting)) {
            return false;
        }
        LastDayRangeSetting lastDayRangeSetting = (LastDayRangeSetting) obj;
        return Intrinsics.g(this.a, lastDayRangeSetting.a) && Intrinsics.g(this.b, lastDayRangeSetting.b) && Intrinsics.g(this.c, lastDayRangeSetting.c) && this.d == lastDayRangeSetting.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gpp.a(this.c.a, gpp.a(this.b.a, Integer.hashCode(this.a.a) * 31, 31), 31);
    }

    public final String toString() {
        return "LastDayRangeSetting(first=" + this.a + ", second=" + this.b + ", third=" + this.c + ", maxDayRange=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        LastDayRangeOption lastDayRangeOption = this.b;
        lastDayRangeOption.getClass();
        parcel.writeInt(lastDayRangeOption.a);
        LastDayRangeOption lastDayRangeOption2 = this.c;
        lastDayRangeOption2.getClass();
        parcel.writeInt(lastDayRangeOption2.a);
        parcel.writeInt(this.d);
    }
}
