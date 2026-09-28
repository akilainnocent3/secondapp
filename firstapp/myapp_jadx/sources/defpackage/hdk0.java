package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public class hdk0 implements IInterface {
    public final IBinder a;
    public final String b;

    public hdk0(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    public final void a(Parcel parcel, int i) {
        try {
            this.a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
