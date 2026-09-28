package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uif;
import defpackage.vhk0;

/* JADX INFO: loaded from: classes4.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new vhk0();
    public final int a;
    public final String b;
    public final int c;

    public zac(String str, int i) {
        this.a = 1;
        this.b = str;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.i(parcel, 2, this.b, false);
        uif.o(parcel, 3, 4);
        parcel.writeInt(this.c);
        uif.n(parcel, iM);
    }

    public zac(int i, int i2, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }
}
