package com.sportybet.android.openbet.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.n36;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/openbet/domain/model/OpenBetEntranceData;", "Landroid/os/Parcelable;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OpenBetEntranceData implements Parcelable {
    public static final Parcelable.Creator<OpenBetEntranceData> CREATOR = new a();
    public final int a;
    public final int b;

    public static final class a implements Parcelable.Creator<OpenBetEntranceData> {
        @Override // android.os.Parcelable.Creator
        public final OpenBetEntranceData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new OpenBetEntranceData(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final OpenBetEntranceData[] newArray(int i) {
            return new OpenBetEntranceData[i];
        }
    }

    public OpenBetEntranceData(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenBetEntranceData)) {
            return false;
        }
        OpenBetEntranceData openBetEntranceData = (OpenBetEntranceData) obj;
        return this.a == openBetEntranceData.a && this.b == openBetEntranceData.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return n36.a("OpenBetEntranceData(cashableCount=", this.a, this.b, ", totalCount=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
