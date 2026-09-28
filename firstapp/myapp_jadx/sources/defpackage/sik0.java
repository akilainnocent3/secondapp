package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.internal.zax;

/* JADX INFO: loaded from: classes4.dex */
public final class sik0 extends nfk0 {
    public final eym a(rcy rcyVar, zax zaxVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = ugk0.a;
        parcelObtain.writeStrongBinder(rcyVar);
        parcelObtain.writeInt(1);
        zaxVar.writeToParcel(parcelObtain, 0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                this.a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                eym eymVarB = eym.a.b(parcelObtain2.readStrongBinder());
                parcelObtain2.recycle();
                return eymVarB;
            } catch (RuntimeException e) {
                parcelObtain2.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
