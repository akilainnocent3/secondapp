package c;

import android.net.Uri;
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
public interface a extends IInterface {
    public static final String S9 = "android$support$customtabs$ICustomTabsCallback".replace(z0.f77338c, e.f102543c);

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

    void D1(Bundle bundle) throws RemoteException;

    void E(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException;

    void E2(Bundle bundle) throws RemoteException;

    void F0(int i10, int i11, Bundle bundle) throws RemoteException;

    void G2(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException;

    Bundle K(String str, Bundle bundle) throws RemoteException;

    void M0(int i10, Bundle bundle) throws RemoteException;

    void n2(Bundle bundle) throws RemoteException;

    void p2(Bundle bundle) throws RemoteException;

    void u(String str, Bundle bundle) throws RemoteException;

    void z1(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: c.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0203a implements a {
        @Override // c.a
        public Bundle K(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // c.a
        public void D1(Bundle bundle) throws RemoteException {
        }

        @Override // c.a
        public void E2(Bundle bundle) throws RemoteException {
        }

        @Override // c.a
        public void n2(Bundle bundle) throws RemoteException {
        }

        @Override // c.a
        public void p2(Bundle bundle) throws RemoteException {
        }

        @Override // c.a
        public void M0(int i10, Bundle bundle) throws RemoteException {
        }

        @Override // c.a
        public void u(String str, Bundle bundle) throws RemoteException {
        }

        @Override // c.a
        public void z1(String str, Bundle bundle) throws RemoteException {
        }

        @Override // c.a
        public void F0(int i10, int i11, Bundle bundle) throws RemoteException {
        }

        @Override // c.a
        public void G2(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
        }

        @Override // c.a
        public void E(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f22135b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f22136c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f22137d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f22138e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f22139f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f22140g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f22141h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f22142i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f22143j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f22144k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f22145l = 12;

        /* JADX INFO: renamed from: c.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C0204a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f22146b;

            public C0204a(IBinder iBinder) {
                this.f22146b = iBinder;
            }

            @Override // c.a
            public void D1(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.S9);
                    c.d(parcelObtain, bundle, 0);
                    this.f22146b.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.a
            public void E(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.S9);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeInt(i14);
                    c.d(parcelObtain, bundle, 0);
                    this.f22146b.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.a
            public void E2(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.S9);
                    c.d(parcelObtain, bundle, 0);
                    this.f22146b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.a
            public void F0(int i10, int i11, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.S9);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    c.d(parcelObtain, bundle, 0);
                    this.f22146b.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.a
            public void G2(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.S9);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, uri, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    c.d(parcelObtain, bundle, 0);
                    this.f22146b.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.a
            public Bundle K(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.S9);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f22146b.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.a
            public void M0(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.S9);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f22146b.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String N2() {
                return a.S9;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22146b;
            }

            @Override // c.a
            public void n2(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.S9);
                    c.d(parcelObtain, bundle, 0);
                    this.f22146b.transact(11, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.a
            public void p2(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.S9);
                    c.d(parcelObtain, bundle, 0);
                    this.f22146b.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.a
            public void u(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.S9);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f22146b.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.a
            public void z1(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.S9);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f22146b.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, a.S9);
        }

        public static a N2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.S9);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0204a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = a.S9;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    M0(parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    z1(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    E2((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    u(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    G2(parcel.readInt(), (Uri) c.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleK = K(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.d(parcel2, bundleK, 1);
                    return true;
                case 8:
                    F0(parcel.readInt(), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    D1((Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    E(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    n2((Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    p2((Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
