package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.identity.zzee;
import com.google.android.gms.internal.identity.zzei;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class rsl0 extends tlk0 implements ctl0 {
    @Override // defpackage.ctl0
    public final dsm B(CurrentLocationRequest currentLocationRequest, uxk0 uxk0Var) {
        dsm qtl0Var;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = luk0.a;
        parcelObtain.writeInt(1);
        currentLocationRequest.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(uxk0Var);
        Parcel parcelA = a(parcelObtain, 87);
        IBinder strongBinder = parcelA.readStrongBinder();
        int i2 = dsm.a.a;
        if (strongBinder == null) {
            qtl0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            qtl0Var = iInterfaceQueryLocalInterface instanceof dsm ? (dsm) iInterfaceQueryLocalInterface : new qtl0(strongBinder, "com.google.android.gms.common.internal.ICancelToken");
        }
        parcelA.recycle();
        return qtl0Var;
    }

    @Override // defpackage.ctl0
    public final void I(zzei zzeiVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = luk0.a;
        parcelObtain.writeInt(1);
        zzeiVar.writeToParcel(parcelObtain, 0);
        b(parcelObtain, 59);
    }

    @Override // defpackage.ctl0
    public final void X(zzee zzeeVar, rxk0 rxk0Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = luk0.a;
        parcelObtain.writeInt(1);
        zzeeVar.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(rxk0Var);
        b(parcelObtain, 89);
    }

    @Override // defpackage.ctl0
    public final void j(zzee zzeeVar, LocationRequest locationRequest, rxk0 rxk0Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = luk0.a;
        parcelObtain.writeInt(1);
        zzeeVar.writeToParcel(parcelObtain, 0);
        parcelObtain.writeInt(1);
        locationRequest.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(rxk0Var);
        b(parcelObtain, 88);
    }

    @Override // defpackage.ctl0
    public final dsm y(CurrentLocationRequest currentLocationRequest, zzee zzeeVar) {
        dsm qtl0Var;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = luk0.a;
        parcelObtain.writeInt(1);
        currentLocationRequest.writeToParcel(parcelObtain, 0);
        parcelObtain.writeInt(1);
        zzeeVar.writeToParcel(parcelObtain, 0);
        Parcel parcelA = a(parcelObtain, 92);
        IBinder strongBinder = parcelA.readStrongBinder();
        int i2 = dsm.a.a;
        if (strongBinder == null) {
            qtl0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            qtl0Var = iInterfaceQueryLocalInterface instanceof dsm ? (dsm) iInterfaceQueryLocalInterface : new qtl0(strongBinder, "com.google.android.gms.common.internal.ICancelToken");
        }
        parcelA.recycle();
        return qtl0Var;
    }
}
