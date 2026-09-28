package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm20;
import defpackage.ouk0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new ouk0();
    public final long a;
    public final boolean b;
    public final WorkSource c;
    public final String d;
    public final int[] e;
    public final boolean f;
    public final String i;
    public final long v;
    public final String w;

    public zzb(long j, boolean z, WorkSource workSource, String str, int[] iArr, boolean z2, String str2, long j2, String str3) {
        this.a = j;
        this.b = z;
        this.c = workSource;
        this.d = str;
        this.e = iArr;
        this.f = z2;
        this.i = str2;
        this.v = j2;
        this.w = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        hm20.h(parcel);
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 8);
        parcel.writeLong(this.a);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        uif.h(parcel, 3, this.c, i, false);
        uif.i(parcel, 4, this.d, false);
        uif.e(parcel, 5, this.e);
        uif.o(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        uif.i(parcel, 7, this.i, false);
        uif.o(parcel, 8, 8);
        parcel.writeLong(this.v);
        uif.i(parcel, 9, this.w, false);
        uif.n(parcel, iM);
    }
}
