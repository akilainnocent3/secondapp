package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class vwk0 extends qlk0 implements g1l0 {
    @Override // defpackage.g1l0
    public final String zzc() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelA = a(parcelObtain, 1);
        String string = parcelA.readString();
        parcelA.recycle();
        return string;
    }

    @Override // defpackage.g1l0
    public final boolean zze() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i = iuk0.a;
        parcelObtain.writeInt(1);
        Parcel parcelA = a(parcelObtain, 2);
        boolean z = parcelA.readInt() != 0;
        parcelA.recycle();
        return z;
    }
}
