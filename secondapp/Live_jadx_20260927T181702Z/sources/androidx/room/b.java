package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import cv.z0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public interface b extends IInterface {
    public static final String R9 = "androidx$room$IMultiInstanceInvalidationService".replace(z0.f77338c, kj.e.f102543c);

    void J2(androidx.room.a aVar, int i10) throws RemoteException;

    void M1(int i10, String[] strArr) throws RemoteException;

    int e2(androidx.room.a aVar, String str) throws RemoteException;

    /* JADX INFO: renamed from: androidx.room.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class AbstractBinderC0156b extends Binder implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f19118b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f19119c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f19120d = 3;

        /* JADX INFO: renamed from: androidx.room.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f19121b;

            public a(IBinder iBinder) {
                this.f19121b = iBinder;
            }

            @Override // androidx.room.b
            public void J2(androidx.room.a aVar, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.R9);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeInt(i10);
                    this.f19121b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.b
            public void M1(int i10, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.R9);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStringArray(strArr);
                    this.f19121b.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String N2() {
                return b.R9;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f19121b;
            }

            @Override // androidx.room.b
            public int e2(androidx.room.a aVar, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.R9);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    this.f19121b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0156b() {
            attachInterface(this, b.R9);
        }

        public static b N2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.R9);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = b.R9;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                int iE2 = e2(androidx.room.a.b.N2(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iE2);
            } else if (i10 == 2) {
                J2(androidx.room.a.b.N2(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                M1(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.b
        public int e2(androidx.room.a aVar, String str) throws RemoteException {
            return 0;
        }

        @Override // androidx.room.b
        public void J2(androidx.room.a aVar, int i10) throws RemoteException {
        }

        @Override // androidx.room.b
        public void M1(int i10, String[] strArr) throws RemoteException {
        }
    }
}
