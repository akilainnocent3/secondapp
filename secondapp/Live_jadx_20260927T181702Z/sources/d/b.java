package d;

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
public interface b extends IInterface {
    public static final String X9 = "android$support$customtabs$trusted$ITrustedWebActivityService".replace(z0.f77338c, e.f102543c);

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

    Bundle W(Bundle bundle) throws RemoteException;

    Bundle Z1() throws RemoteException;

    Bundle k1(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

    int t2() throws RemoteException;

    Bundle v2(Bundle bundle) throws RemoteException;

    Bundle w1() throws RemoteException;

    void y2(Bundle bundle) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements b {
        @Override // d.b
        public Bundle W(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // d.b
        public Bundle Z1() throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // d.b
        public Bundle k1(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // d.b
        public int t2() throws RemoteException {
            return 0;
        }

        @Override // d.b
        public Bundle v2(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // d.b
        public Bundle w1() throws RemoteException {
            return null;
        }

        @Override // d.b
        public void y2(Bundle bundle) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: d.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class AbstractBinderC0757b extends Binder implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f77393b = 6;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f77394c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f77395d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f77396e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f77397f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f77398g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f77399h = 9;

        /* JADX INFO: renamed from: d.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f77400b;

            public a(IBinder iBinder) {
                this.f77400b = iBinder;
            }

            public String N2() {
                return b.X9;
            }

            @Override // d.b
            public Bundle W(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.X9);
                    c.d(parcelObtain, bundle, 0);
                    this.f77400b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.b
            public Bundle Z1() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.X9);
                    this.f77400b.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f77400b;
            }

            @Override // d.b
            public Bundle k1(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.X9);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f77400b.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.b
            public int t2() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.X9);
                    this.f77400b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.b
            public Bundle v2(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.X9);
                    c.d(parcelObtain, bundle, 0);
                    this.f77400b.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.b
            public Bundle w1() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.X9);
                    this.f77400b.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.b
            public void y2(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.X9);
                    c.d(parcelObtain, bundle, 0);
                    this.f77400b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0757b() {
            attachInterface(this, b.X9);
        }

        public static b N2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.X9);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = b.X9;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    Bundle bundleW = W((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.d(parcel2, bundleW, 1);
                    return true;
                case 3:
                    y2((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int iT2 = t2();
                    parcel2.writeNoException();
                    parcel2.writeInt(iT2);
                    return true;
                case 5:
                    Bundle bundleZ1 = Z1();
                    parcel2.writeNoException();
                    c.d(parcel2, bundleZ1, 1);
                    return true;
                case 6:
                    Bundle bundleV2 = v2((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.d(parcel2, bundleV2, 1);
                    return true;
                case 7:
                    Bundle bundleW1 = w1();
                    parcel2.writeNoException();
                    c.d(parcel2, bundleW1, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
                case 9:
                    Bundle bundleK1 = k1(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    c.d(parcel2, bundleK1, 1);
                    return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
