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
public interface c extends IInterface {
    public static final String U9 = "android$support$customtabs$IEngagementSignalsCallback".replace(z0.f77338c, e.f102543c);

    /* JADX INFO: renamed from: c.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0206c {
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

    void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) throws RemoteException;

    void onSessionEnded(boolean z10, Bundle bundle) throws RemoteException;

    void onVerticalScrollEvent(boolean z10, Bundle bundle) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b extends Binder implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f22161b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f22162c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f22163d = 4;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f22164b;

            public a(IBinder iBinder) {
                this.f22164b = iBinder;
            }

            public String N2() {
                return c.U9;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22164b;
            }

            @Override // c.c
            public void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.U9);
                    parcelObtain.writeInt(i10);
                    C0206c.d(parcelObtain, bundle, 0);
                    this.f22164b.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.c
            public void onSessionEnded(boolean z10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.U9);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    C0206c.d(parcelObtain, bundle, 0);
                    this.f22164b.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.c
            public void onVerticalScrollEvent(boolean z10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.U9);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    C0206c.d(parcelObtain, bundle, 0);
                    this.f22164b.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, c.U9);
        }

        public static c N2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.U9);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = c.U9;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 2) {
                onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) C0206c.c(parcel, Bundle.CREATOR));
            } else if (i10 == 3) {
                onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) C0206c.c(parcel, Bundle.CREATOR));
            } else {
                if (i10 != 4) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                onSessionEnded(parcel.readInt() != 0, (Bundle) C0206c.c(parcel, Bundle.CREATOR));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements c {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // c.c
        public void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) throws RemoteException {
        }

        @Override // c.c
        public void onSessionEnded(boolean z10, Bundle bundle) throws RemoteException {
        }

        @Override // c.c
        public void onVerticalScrollEvent(boolean z10, Bundle bundle) throws RemoteException {
        }
    }
}
