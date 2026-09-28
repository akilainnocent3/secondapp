package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hxk0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new hxk0();
    public final long a;
    public final long b;
    public final boolean c;
    public final Bundle d;
    public final String e;

    public zzdd(long j, long j2, boolean z, Bundle bundle, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = bundle;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 8);
        parcel.writeLong(this.a);
        uif.o(parcel, 2, 8);
        parcel.writeLong(this.b);
        uif.o(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uif.a(parcel, 7, this.d);
        uif.i(parcel, 8, this.e, false);
        uif.n(parcel, iM);
    }
}
