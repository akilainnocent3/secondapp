package ta;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface c extends IInterface {
    void R0(byte[] response) throws RemoteException;

    void onFailure(String error) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b extends Binder implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f136408b = "androidx.work.multiprocess.IWorkManagerImplCallback";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f136409c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f136410d = 2;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements c {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static c f136411c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f136412b;

            public a(IBinder remote) {
                this.f136412b = remote;
            }

            public String N2() {
                return b.f136408b;
            }

            @Override // ta.c
            public void R0(byte[] response) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f136408b);
                    parcelObtain.writeByteArray(response);
                    if (this.f136412b.transact(1, parcelObtain, null, 1) || b.O2() == null) {
                        return;
                    }
                    b.O2().R0(response);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f136412b;
            }

            @Override // ta.c
            public void onFailure(String error) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f136408b);
                    parcelObtain.writeString(error);
                    if (this.f136412b.transact(2, parcelObtain, null, 1) || b.O2() == null) {
                        return;
                    }
                    b.O2().onFailure(error);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, f136408b);
        }

        public static c N2(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(f136408b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new a(obj) : (c) iInterfaceQueryLocalInterface;
        }

        public static c O2() {
            return a.f136411c;
        }

        public static boolean P2(c impl) {
            if (a.f136411c != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            a.f136411c = impl;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == 1) {
                data.enforceInterface(f136408b);
                R0(data.createByteArray());
                return true;
            }
            if (code == 2) {
                data.enforceInterface(f136408b);
                onFailure(data.readString());
                return true;
            }
            if (code != 1598968902) {
                return super.onTransact(code, data, reply, flags);
            }
            reply.writeString(f136408b);
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

        @Override // ta.c
        public void R0(byte[] response) throws RemoteException {
        }

        @Override // ta.c
        public void onFailure(String error) throws RemoteException {
        }
    }
}
