package e1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import cv.z0;
import k.y0;
import kj.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public interface b extends IInterface {

    /* JADX INFO: renamed from: ba, reason: collision with root package name */
    public static final String f79778ba = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace(z0.f77338c, e.f102543c);

    void t1(e1.a aVar) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // e1.b
        public void t1(e1.a aVar) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: e1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class AbstractBinderC0784b extends Binder implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f79779b = 1;

        /* JADX INFO: renamed from: e1.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f79780b;

            public a(IBinder iBinder) {
                this.f79780b = iBinder;
            }

            public String N2() {
                return b.f79778ba;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f79780b;
            }

            @Override // e1.b
            public void t1(e1.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f79778ba);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f79780b.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0784b() {
            attachInterface(this, b.f79778ba);
        }

        public static b N2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f79778ba);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = b.f79778ba;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            t1(e1.a.b.N2(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
