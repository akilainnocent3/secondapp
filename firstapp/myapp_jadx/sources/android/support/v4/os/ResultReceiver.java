package android.support.v4.os;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();
    public android.support.v4.os.a a;

    public class a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public final ResultReceiver createFromParcel(Parcel parcel) {
            android.support.v4.os.a aVar;
            ResultReceiver resultReceiver = new ResultReceiver();
            IBinder strongBinder = parcel.readStrongBinder();
            int i = android.support.v4.os.a.AbstractBinderC0028a.a;
            if (strongBinder == null) {
                aVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(android.support.v4.os.a.i);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof android.support.v4.os.a)) {
                    android.support.v4.os.a.AbstractBinderC0028a.C0029a c0029a = new android.support.v4.os.a.AbstractBinderC0028a.C0029a();
                    c0029a.a = strongBinder;
                    aVar = c0029a;
                } else {
                    aVar = (android.support.v4.os.a) iInterfaceQueryLocalInterface;
                }
            }
            resultReceiver.a = aVar;
            return resultReceiver;
        }

        @Override // android.os.Parcelable.Creator
        public final ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    public class b extends android.support.v4.os.a.AbstractBinderC0028a {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                android.support.v4.os.a aVar = this.a;
                android.support.v4.os.a aVar2 = aVar;
                if (aVar == null) {
                    b bVar = new b();
                    bVar.attachInterface(bVar, android.support.v4.os.a.i);
                    this.a = bVar;
                    aVar2 = bVar;
                }
                parcel.writeStrongBinder(aVar2.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
