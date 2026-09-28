package com.sporty.android.permission.location;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hib0;
import defpackage.hxa;
import defpackage.nrg0;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/permission/location/UserAddress;", "Landroid/os/Parcelable;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UserAddress implements Parcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new a();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final double e;
    public final double f;
    public final String i;

    public static final class a implements Parcelable.Creator<UserAddress> {
        @Override // android.os.Parcelable.Creator
        public final UserAddress createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new UserAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserAddress[] newArray(int i) {
            return new UserAddress[i];
        }
    }

    public UserAddress(String str, String str2, String str3, String str4, double d, double d2, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = d;
        this.f = d2;
        this.i = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAddress)) {
            return false;
        }
        UserAddress userAddress = (UserAddress) obj;
        return Intrinsics.g(this.a, userAddress.a) && Intrinsics.g(this.b, userAddress.b) && Intrinsics.g(this.c, userAddress.c) && Intrinsics.g(this.d, userAddress.d) && Double.compare(this.e, userAddress.e) == 0 && Double.compare(this.f, userAddress.f) == 0 && Intrinsics.g(this.i, userAddress.i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iA = nrg0.a(nrg0.a((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.e), 31, this.f);
        String str5 = this.i;
        return iA + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("UserAddress(city=", this.a, ", region=", this.b, ", countryCode=");
        hxa.c(sbA, this.c, ", countryName=", this.d, ", latitude=");
        sbA.append(this.e);
        hib0.b(this.f, ", longitude=", ", postalCode=", sbA);
        return uf80.a(sbA, this.i, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.f);
        parcel.writeString(this.i);
    }
}
