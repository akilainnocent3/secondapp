package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.gml0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new gml0();
    public final String a;
    public final long b;
    public final int c;

    public zzoh(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.i(parcel, 1, this.a, false);
        uif.o(parcel, 2, 8);
        parcel.writeLong(this.b);
        uif.o(parcel, 3, 4);
        parcel.writeInt(this.c);
        uif.n(parcel, iM);
    }
}
