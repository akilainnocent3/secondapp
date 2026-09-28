package com.google.android.gms.internal.identity;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ksl0;
import defpackage.mcl0;
import defpackage.qnl0;
import defpackage.uif;
import defpackage.xql0;
import defpackage.yql0;
import defpackage.yrl0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new mcl0();
    public final int a;
    public final zzh b;
    public final ksl0 c;
    public final xql0 d;

    public zzj(int i, zzh zzhVar, IBinder iBinder, IBinder iBinder2) {
        ksl0 yql0Var;
        this.a = i;
        this.b = zzhVar;
        xql0 qnl0Var = null;
        if (iBinder == null) {
            yql0Var = null;
        } else {
            int i2 = yrl0.a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            yql0Var = iInterfaceQueryLocalInterface instanceof ksl0 ? (ksl0) iInterfaceQueryLocalInterface : new yql0(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
        }
        this.c = yql0Var;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            qnl0Var = iInterfaceQueryLocalInterface2 instanceof xql0 ? (xql0) iInterfaceQueryLocalInterface2 : new qnl0(iBinder2);
        }
        this.d = qnl0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.h(parcel, 2, this.b, i, false);
        ksl0 ksl0Var = this.c;
        uif.d(parcel, 3, ksl0Var == null ? null : ksl0Var.asBinder());
        xql0 xql0Var = this.d;
        uif.d(parcel, 4, xql0Var != null ? xql0Var.asBinder() : null);
        uif.n(parcel, iM);
    }
}
