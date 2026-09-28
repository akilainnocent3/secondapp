package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.w;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uif;
import defpackage.xmk0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR;
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final zzal[] e;

    static {
        new LocationAvailability(0, 1, 1, 0L, null);
        new LocationAvailability(1000, 1, 1, 0L, null);
        CREATOR = new xmk0();
    }

    public LocationAvailability(int i, int i2, int i3, long j, zzal[] zzalVarArr) {
        this.d = i < 1000 ? 0 : 1000;
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.e = zzalVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d)});
    }

    public final String toString() {
        boolean z = this.d < 1000;
        return w.a(new StringBuilder(String.valueOf(z).length() + 22), "LocationAvailability[", z, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        uif.o(parcel, 3, 8);
        parcel.writeLong(this.c);
        uif.o(parcel, 4, 4);
        int i2 = this.d;
        parcel.writeInt(i2);
        uif.k(parcel, 5, this.e, i);
        int i3 = i2 >= 1000 ? 0 : 1;
        uif.o(parcel, 6, 4);
        parcel.writeInt(i3);
        uif.n(parcel, iM);
    }
}
