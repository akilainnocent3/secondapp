package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import cv.z0;
import k.y0;
import kj.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public interface d extends IInterface {
    public static final String V9 = "android$support$customtabs$IPostMessageService".replace(z0.f77338c, e.f102543c);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    void F(c.a aVar, Bundle bundle) throws RemoteException;

    void x2(c.a aVar, String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b extends Binder implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f22165b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f22166c = 3;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f22167b;

            public a(IBinder iBinder) {
                this.f22167b = iBinder;
            }

            @Override // c.d
            public void F(c.a aVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.V9);
                    parcelObtain.writeStrongInterface(aVar);
                    c.d(parcelObtain, bundle, 0);
                    this.f22167b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String N2() {
                return d.V9;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22167b;
            }

            @Override // c.d
            public void x2(c.a aVar, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.V9);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f22167b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, d.V9);
        }

        public static d N2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d.V9);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = d.V9;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 2) {
                F(c.a.b.N2(parcel.readStrongBinder()), (Bundle) c.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                x2(c.a.b.N2(parcel.readStrongBinder()), parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements d {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // c.d
        public void F(c.a aVar, Bundle bundle) throws RemoteException {
        }

        @Override // c.d
        public void x2(c.a aVar, String str, Bundle bundle) throws RemoteException {
        }
    }
}
