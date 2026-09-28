package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.f010;
import defpackage.owk0;
import defpackage.uif;
import defpackage.vql0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new vql0();
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;

    public zzq(int i, int i2, String str, boolean z) {
        this.a = z;
        this.b = str;
        this.c = f010.a(i) - 1;
        this.d = owk0.a(i2) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        uif.i(parcel, 2, this.b, false);
        uif.o(parcel, 3, 4);
        parcel.writeInt(this.c);
        uif.o(parcel, 4, 4);
        parcel.writeInt(this.d);
        uif.n(parcel, iM);
    }
}
