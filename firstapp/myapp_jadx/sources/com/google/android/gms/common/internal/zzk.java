package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qel0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new qel0();
    public Bundle a;
    public Feature[] b;
    public int c;
    public ConnectionTelemetryConfiguration d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.a(parcel, 1, this.a);
        uif.k(parcel, 2, this.b, i);
        int i2 = this.c;
        uif.o(parcel, 3, 4);
        parcel.writeInt(i2);
        uif.h(parcel, 4, this.d, i, false);
        uif.n(parcel, iM);
    }
}
