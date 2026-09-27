package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.y0({k.y0.a.LIBRARY})
public interface e0 extends IInterface {
    public static final String P9 = "androidx.media3.session.IMediaSessionService";

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

    void b2(c0 c0Var, Bundle bundle) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b extends Binder implements e0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f14937b = 3001;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements e0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f14938b;

            public a(IBinder iBinder) {
                this.f14938b = iBinder;
            }

            public String N2() {
                return e0.P9;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14938b;
            }

            @Override // androidx.media3.session.e0
            public void b2(c0 c0Var, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e0.P9);
                    parcelObtain.writeStrongInterface(c0Var);
                    c.d(parcelObtain, bundle, 0);
                    this.f14938b.transact(3001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, e0.P9);
        }

        public static e0 N2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(e0.P9);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e0)) ? new a(iBinder) : (e0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(e0.P9);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(e0.P9);
                return true;
            }
            if (i10 != 3001) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            b2(c0.b.N2(parcel.readStrongBinder()), (Bundle) c.c(parcel, Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements e0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.media3.session.e0
        public void b2(c0 c0Var, Bundle bundle) throws RemoteException {
        }
    }
}
