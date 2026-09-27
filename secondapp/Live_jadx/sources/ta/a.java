package ta;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface a extends IInterface {
    void O0(byte[] request, c callback) throws RemoteException;

    void t0(byte[] request, c callback) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f136392b = "androidx.work.multiprocess.IListenableWorkerImpl";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f136393c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f136394d = 2;

        /* JADX INFO: renamed from: ta.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C1402a implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static a f136395c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f136396b;

            public C1402a(IBinder remote) {
                this.f136396b = remote;
            }

            public String N2() {
                return b.f136392b;
            }

            @Override // ta.a
            public void O0(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f136392b);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f136396b.transact(2, parcelObtain, null, 1) || b.O2() == null) {
                        return;
                    }
                    b.O2().O0(request, callback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f136396b;
            }

            @Override // ta.a
            public void t0(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f136392b);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f136396b.transact(1, parcelObtain, null, 1) || b.O2() == null) {
                        return;
                    }
                    b.O2().t0(request, callback);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, f136392b);
        }

        public static a N2(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(f136392b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C1402a(obj) : (a) iInterfaceQueryLocalInterface;
        }

        public static a O2() {
            return C1402a.f136395c;
        }

        public static boolean P2(a impl) {
            if (C1402a.f136395c != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            C1402a.f136395c = impl;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == 1) {
                data.enforceInterface(f136392b);
                t0(data.createByteArray(), c.b.N2(data.readStrongBinder()));
                return true;
            }
            if (code == 2) {
                data.enforceInterface(f136392b);
                O0(data.createByteArray(), c.b.N2(data.readStrongBinder()));
                return true;
            }
            if (code != 1598968902) {
                return super.onTransact(code, data, reply, flags);
            }
            reply.writeString(f136392b);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: renamed from: ta.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C1401a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // ta.a
        public void O0(byte[] request, c callback) throws RemoteException {
        }

        @Override // ta.a
        public void t0(byte[] request, c callback) throws RemoteException {
        }
    }
}
