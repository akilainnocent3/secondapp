package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a0l0;
import defpackage.cul0;
import defpackage.etl0;
import defpackage.hul0;
import defpackage.ktl0;
import defpackage.qnl0;
import defpackage.tsl0;
import defpackage.ttl0;
import defpackage.uif;
import defpackage.xql0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zzei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzei> CREATOR = new a0l0();
    public final int a;
    public final zzeg b;
    public final hul0 c;
    public final ktl0 d;
    public final PendingIntent e;
    public final xql0 f;
    public final String i;

    public zzei(int i, zzeg zzegVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        hul0 ttl0Var;
        ktl0 tsl0Var;
        this.a = i;
        this.b = zzegVar;
        xql0 qnl0Var = null;
        if (iBinder != null) {
            int i2 = cul0.a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            ttl0Var = iInterfaceQueryLocalInterface instanceof hul0 ? (hul0) iInterfaceQueryLocalInterface : new ttl0(iBinder, "com.google.android.gms.location.ILocationListener");
        } else {
            ttl0Var = null;
        }
        this.c = ttl0Var;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            int i3 = etl0.a;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            tsl0Var = iInterfaceQueryLocalInterface2 instanceof ktl0 ? (ktl0) iInterfaceQueryLocalInterface2 : new tsl0(iBinder2, "com.google.android.gms.location.ILocationCallback");
        } else {
            tsl0Var = null;
        }
        this.d = tsl0Var;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            qnl0Var = iInterfaceQueryLocalInterface3 instanceof xql0 ? (xql0) iInterfaceQueryLocalInterface3 : new qnl0(iBinder3);
        }
        this.f = qnl0Var;
        this.i = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.h(parcel, 2, this.b, i, false);
        hul0 hul0Var = this.c;
        uif.d(parcel, 3, hul0Var == null ? null : hul0Var.asBinder());
        uif.h(parcel, 4, this.e, i, false);
        ktl0 ktl0Var = this.d;
        uif.d(parcel, 5, ktl0Var == null ? null : ktl0Var.asBinder());
        xql0 xql0Var = this.f;
        uif.d(parcel, 6, xql0Var != null ? xql0Var.asBinder() : null);
        uif.i(parcel, 8, this.i, false);
        uif.n(parcel, iM);
    }
}
