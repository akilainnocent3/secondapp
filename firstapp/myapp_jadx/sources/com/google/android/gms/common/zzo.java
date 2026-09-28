package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.eym;
import defpackage.nnl0;
import defpackage.rcy;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new nnl0();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Context d;
    public final boolean e;
    public final boolean f;

    public zzo(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = (Context) rcy.d(eym.a.b(iBinder));
        this.e = z3;
        this.f = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.i(parcel, 1, this.a, false);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        uif.o(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uif.d(parcel, 4, new rcy(this.d));
        uif.o(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        uif.o(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        uif.n(parcel, iM);
    }
}
