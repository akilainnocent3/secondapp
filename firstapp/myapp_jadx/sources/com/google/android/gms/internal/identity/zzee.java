package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uif;
import defpackage.vzk0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzee> CREATOR = new vzk0();
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent d;
    public final String e;

    public zzee(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = iBinder;
        this.c = iBinder2;
        this.d = pendingIntent;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.d(parcel, 2, this.b);
        uif.d(parcel, 3, this.c);
        uif.h(parcel, 4, this.d, i, false);
        uif.i(parcel, 6, this.e, false);
        uif.n(parcel, iM);
    }
}
