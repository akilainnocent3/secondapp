package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.nok0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new nok0();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        uif.o(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uif.o(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uif.o(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        uif.o(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        uif.n(parcel, iM);
    }
}
