package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.sportygames.crash.models.header.snc.OdQr;
import defpackage.cqk0;
import defpackage.hm20;
import defpackage.uif;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new cqk0();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public zzas(int i, int i2, int i3, int i4) {
        hm20.j("Start hour must be in range [0, 23].", i >= 0 && i <= 23);
        hm20.j("Start minute must be in range [0, 59].", i2 >= 0 && i2 <= 59);
        hm20.j("End hour must be in range [0, 23].", i3 >= 0 && i3 <= 23);
        hm20.j("End minute must be in range [0, 59].", i4 >= 0 && i4 <= 59);
        hm20.j("Parameters can't be all 0.", ((i + i2) + i3) + i4 > 0);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        zzas zzasVar = (zzas) obj;
        return this.a == zzasVar.a && this.b == zzasVar.b && this.c == zzasVar.c && this.d == zzasVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        hm20.h(parcel);
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        uif.o(parcel, 3, 4);
        parcel.writeInt(this.c);
        uif.o(parcel, 4, 4);
        parcel.writeInt(this.d);
        uif.n(parcel, iM);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        int length3 = String.valueOf(i3).length();
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 10 + length3 + 12 + String.valueOf(i4).length() + 1);
        sb.append(OdQr.tQFE);
        sb.append(i);
        sb.append(", startMinute=");
        sb.append(i2);
        sb.append(", endHour=");
        sb.append(i3);
        sb.append(", endMinute=");
        sb.append(i4);
        sb.append("]");
        return sb.toString();
    }
}
