package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.eal0;
import defpackage.eym;
import defpackage.gsl0;
import defpackage.jcl0;
import defpackage.nmk0;
import defpackage.rcy;
import defpackage.uif;
import defpackage.ytl0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new gsl0();
    public final String a;
    public final jcl0 b;
    public final boolean c;
    public final boolean d;

    public zzs(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        jcl0 jcl0Var = null;
        if (iBinder != null) {
            try {
                int i = eal0.b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                eym eymVarZzd = (iInterfaceQueryLocalInterface instanceof nmk0 ? (nmk0) iInterfaceQueryLocalInterface : new ytl0(iBinder, "com.google.android.gms.common.internal.ICertData")).zzd();
                byte[] bArr = eymVarZzd == null ? null : (byte[]) rcy.d(eymVarZzd);
                if (bArr != null) {
                    jcl0Var = new jcl0(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.b = jcl0Var;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.i(parcel, 1, this.a, false);
        jcl0 jcl0Var = this.b;
        if (jcl0Var == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            jcl0Var = null;
        }
        uif.d(parcel, 2, jcl0Var);
        uif.o(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uif.o(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uif.n(parcel, iM);
    }

    public zzs(String str, jcl0 jcl0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = jcl0Var;
        this.c = z;
        this.d = z2;
    }
}
