package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import defpackage.bpk0;
import defpackage.g41;
import defpackage.uif;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new bpk0();
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public zzal(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzal) {
            zzal zzalVar = (zzal) obj;
            if (this.a == zzalVar.a && this.b == zzalVar.b && this.c == zzalVar.c && this.d == zzalVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
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
        uif.o(parcel, 4, 8);
        parcel.writeLong(this.d);
        uif.n(parcel, iM);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        long j = this.d;
        int length3 = String.valueOf(j).length();
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j2).length());
        sb.append("NetworkLocationStatus: Wifi status: ");
        sb.append(i);
        sb.append(" Cell status: ");
        sb.append(i2);
        g41.a(j, " elapsed time NS: ", DZsoPoBl.rieswMtTjjm, sb);
        sb.append(j2);
        return sb.toString();
    }
}
