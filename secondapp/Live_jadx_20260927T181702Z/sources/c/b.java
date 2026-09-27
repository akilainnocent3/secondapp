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
import java.util.List;
import k.y0;
import kj.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public interface b extends IInterface {
    public static final String T9 = "android$support$customtabs$ICustomTabsService".replace(z0.f77338c, e.f102543c);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements b {
        @Override // c.b
        public boolean A0(long j10) throws RemoteException {
            return false;
        }

        @Override // c.b
        public boolean F1(c.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // c.b
        public boolean I2(c.a aVar, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // c.b
        public boolean T0(c.a aVar, IBinder iBinder, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // c.b
        public boolean Y(c.a aVar, Uri uri, int i10, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // c.b
        public boolean a1(c.a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // c.b
        public int d0(c.a aVar, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // c.b
        public boolean f1(c.a aVar) throws RemoteException {
            return false;
        }

        @Override // c.b
        public Bundle h1(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // c.b
        public boolean m2(c.a aVar, Uri uri) throws RemoteException {
            return false;
        }

        @Override // c.b
        public boolean n1(c.a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // c.b
        public boolean r0(c.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // c.b
        public boolean x(c.a aVar, Bundle bundle) throws RemoteException {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                f(parcel, list.get(i11), i10);
            }
        }

        public static <T extends Parcelable> void f(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    boolean A0(long j10) throws RemoteException;

    boolean F1(c.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    boolean I2(c.a aVar, Uri uri, Bundle bundle) throws RemoteException;

    boolean T0(c.a aVar, IBinder iBinder, Bundle bundle) throws RemoteException;

    boolean Y(c.a aVar, Uri uri, int i10, Bundle bundle) throws RemoteException;

    boolean a1(c.a aVar, Bundle bundle) throws RemoteException;

    int d0(c.a aVar, String str, Bundle bundle) throws RemoteException;

    boolean f1(c.a aVar) throws RemoteException;

    Bundle h1(String str, Bundle bundle) throws RemoteException;

    boolean m2(c.a aVar, Uri uri) throws RemoteException;

    boolean n1(c.a aVar, Bundle bundle) throws RemoteException;

    boolean r0(c.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException;

    boolean x(c.a aVar, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: c.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class AbstractBinderC0205b extends Binder implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f22147b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f22148c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f22149d = 10;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f22150e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f22151f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f22152g = 6;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f22153h = 7;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f22154i = 11;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f22155j = 8;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f22156k = 9;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f22157l = 12;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f22158m = 13;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f22159n = 14;

        /* JADX INFO: renamed from: c.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f22160b;

            public a(IBinder iBinder) {
                this.f22160b = iBinder;
            }

            @Override // c.b
            public boolean A0(long j10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.T9);
                    parcelObtain.writeLong(j10);
                    this.f22160b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean F1(c.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.T9);
                    parcelObtain.writeStrongInterface(aVar);
                    c.f(parcelObtain, uri, 0);
                    c.f(parcelObtain, bundle, 0);
                    c.e(parcelObtain, list, 0);
                    this.f22160b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean I2(c.a aVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.T9);
                    parcelObtain.writeStrongInterface(aVar);
                    c.f(parcelObtain, uri, 0);
                    c.f(parcelObtain, bundle, 0);
                    this.f22160b.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String N2() {
                return b.T9;
            }

            @Override // c.b
            public boolean T0(c.a aVar, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.T9);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeStrongBinder(iBinder);
                    c.f(parcelObtain, bundle, 0);
                    this.f22160b.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean Y(c.a aVar, Uri uri, int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.T9);
                    parcelObtain.writeStrongInterface(aVar);
                    c.f(parcelObtain, uri, 0);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bundle, 0);
                    this.f22160b.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean a1(c.a aVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.T9);
                    parcelObtain.writeStrongInterface(aVar);
                    c.f(parcelObtain, bundle, 0);
                    this.f22160b.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22160b;
            }

            @Override // c.b
            public int d0(c.a aVar, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.T9);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, bundle, 0);
                    this.f22160b.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean f1(c.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.T9);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f22160b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public Bundle h1(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.T9);
                    parcelObtain.writeString(str);
                    c.f(parcelObtain, bundle, 0);
                    this.f22160b.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.d(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean m2(c.a aVar, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.T9);
                    parcelObtain.writeStrongInterface(aVar);
                    c.f(parcelObtain, uri, 0);
                    this.f22160b.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean n1(c.a aVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.T9);
                    parcelObtain.writeStrongInterface(aVar);
                    c.f(parcelObtain, bundle, 0);
                    this.f22160b.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean r0(c.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.T9);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, uri, 0);
                    c.f(parcelObtain, bundle, 0);
                    this.f22160b.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean x(c.a aVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.T9);
                    parcelObtain.writeStrongInterface(aVar);
                    c.f(parcelObtain, bundle, 0);
                    this.f22160b.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0205b() {
            attachInterface(this, b.T9);
        }

        public static b N2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.T9);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = b.T9;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    boolean zA0 = A0(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zA0 ? 1 : 0);
                    return true;
                case 3:
                    boolean zF1 = f1(c.a.b.N2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zF1 ? 1 : 0);
                    return true;
                case 4:
                    c.a aVarN2 = c.a.b.N2(parcel.readStrongBinder());
                    Uri uri = (Uri) c.d(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean zF2 = F1(aVarN2, uri, (Bundle) c.d(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(zF2 ? 1 : 0);
                    return true;
                case 5:
                    Bundle bundleH1 = h1(parcel.readString(), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.f(parcel2, bundleH1, 1);
                    return true;
                case 6:
                    boolean zX = x(c.a.b.N2(parcel.readStrongBinder()), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zX ? 1 : 0);
                    return true;
                case 7:
                    boolean zM2 = m2(c.a.b.N2(parcel.readStrongBinder()), (Uri) c.d(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zM2 ? 1 : 0);
                    return true;
                case 8:
                    int iD0 = d0(c.a.b.N2(parcel.readStrongBinder()), parcel.readString(), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iD0);
                    return true;
                case 9:
                    boolean zR0 = r0(c.a.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Uri) c.d(parcel, Uri.CREATOR), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zR0 ? 1 : 0);
                    return true;
                case 10:
                    boolean zA1 = a1(c.a.b.N2(parcel.readStrongBinder()), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zA1 ? 1 : 0);
                    return true;
                case 11:
                    boolean zI2 = I2(c.a.b.N2(parcel.readStrongBinder()), (Uri) c.d(parcel, Uri.CREATOR), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zI2 ? 1 : 0);
                    return true;
                case 12:
                    boolean zY = Y(c.a.b.N2(parcel.readStrongBinder()), (Uri) c.d(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zY ? 1 : 0);
                    return true;
                case 13:
                    boolean zN1 = n1(c.a.b.N2(parcel.readStrongBinder()), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zN1 ? 1 : 0);
                    return true;
                case 14:
                    boolean zT0 = T0(c.a.b.N2(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zT0 ? 1 : 0);
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
