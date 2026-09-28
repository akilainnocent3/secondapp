package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ahl0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new ahl0();
    public final RootTelemetryConfiguration a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = rootTelemetryConfiguration;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.h(parcel, 1, this.a, i, false);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        uif.o(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uif.e(parcel, 4, this.d);
        uif.o(parcel, 5, 4);
        parcel.writeInt(this.e);
        uif.e(parcel, 6, this.f);
        uif.n(parcel, iM);
    }
}
