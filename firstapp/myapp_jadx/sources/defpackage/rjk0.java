package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public class rjk0 implements IInterface {
    public final IBinder a;
    public final String b;

    public rjk0(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    public final void a(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
