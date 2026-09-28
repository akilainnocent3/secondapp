package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uif;
import defpackage.vik0;

/* JADX INFO: loaded from: classes4.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new vik0();
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String i;
    public final int v;
    public final int w;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.i = str2;
        this.v = i4;
        this.w = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        uif.o(parcel, 3, 4);
        parcel.writeInt(this.c);
        uif.o(parcel, 4, 8);
        parcel.writeLong(this.d);
        uif.o(parcel, 5, 8);
        parcel.writeLong(this.e);
        uif.i(parcel, 6, this.f, false);
        uif.i(parcel, 7, this.i, false);
        uif.o(parcel, 8, 4);
        parcel.writeInt(this.v);
        uif.o(parcel, 9, 4);
        parcel.writeInt(this.w);
        uif.n(parcel, iM);
    }
}
