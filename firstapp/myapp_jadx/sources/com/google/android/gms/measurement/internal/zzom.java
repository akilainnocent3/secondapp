package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.oml0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new oml0();
    public final long a;
    public byte[] b;
    public final String c;
    public final Bundle d;
    public final int e;
    public final long f;
    public String i;

    public zzom(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.a = j;
        this.b = bArr;
        this.c = str;
        this.d = bundle;
        this.e = i;
        this.f = j2;
        this.i = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 8);
        parcel.writeLong(this.a);
        uif.b(parcel, 2, this.b, false);
        uif.i(parcel, 3, this.c, false);
        uif.a(parcel, 4, this.d);
        uif.o(parcel, 5, 4);
        parcel.writeInt(this.e);
        uif.o(parcel, 6, 8);
        parcel.writeLong(this.f);
        uif.i(parcel, 7, this.i, false);
        uif.n(parcel, iM);
    }
}
