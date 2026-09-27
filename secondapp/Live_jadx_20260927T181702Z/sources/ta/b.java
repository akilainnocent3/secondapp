package ta;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface b extends IInterface {
    void C1(byte[] request, c callback) throws RemoteException;

    void K1(byte[] request, c callback) throws RemoteException;

    void Q1(byte[] request, c callback) throws RemoteException;

    void W0(String tag, c callback) throws RemoteException;

    void h2(byte[] request, c callback) throws RemoteException;

    void l2(String id2, c callback) throws RemoteException;

    void w2(c callback) throws RemoteException;

    void y0(String name, c callback) throws RemoteException;

    /* JADX INFO: renamed from: ta.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class AbstractBinderC1403b extends Binder implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f136397b = "androidx.work.multiprocess.IWorkManagerImpl";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f136398c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f136399d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f136400e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f136401f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f136402g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f136403h = 6;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f136404i = 7;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f136405j = 8;

        /* JADX INFO: renamed from: ta.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static b f136406c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f136407b;

            public a(IBinder remote) {
                this.f136407b = remote;
            }

            @Override // ta.b
            public void C1(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC1403b.f136397b);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f136407b.transact(8, parcelObtain, null, 1) || AbstractBinderC1403b.O2() == null) {
                        return;
                    }
                    AbstractBinderC1403b.O2().C1(request, callback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // ta.b
            public void K1(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC1403b.f136397b);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f136407b.transact(1, parcelObtain, null, 1) || AbstractBinderC1403b.O2() == null) {
                        return;
                    }
                    AbstractBinderC1403b.O2().K1(request, callback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String N2() {
                return AbstractBinderC1403b.f136397b;
            }

            @Override // ta.b
            public void Q1(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC1403b.f136397b);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f136407b.transact(2, parcelObtain, null, 1) || AbstractBinderC1403b.O2() == null) {
                        return;
                    }
                    AbstractBinderC1403b.O2().Q1(request, callback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // ta.b
            public void W0(String tag, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC1403b.f136397b);
                    parcelObtain.writeString(tag);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f136407b.transact(4, parcelObtain, null, 1) || AbstractBinderC1403b.O2() == null) {
                        return;
                    }
                    AbstractBinderC1403b.O2().W0(tag, callback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f136407b;
            }

            @Override // ta.b
            public void h2(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC1403b.f136397b);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f136407b.transact(7, parcelObtain, null, 1) || AbstractBinderC1403b.O2() == null) {
                        return;
                    }
                    AbstractBinderC1403b.O2().h2(request, callback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // ta.b
            public void l2(String id2, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC1403b.f136397b);
                    parcelObtain.writeString(id2);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f136407b.transact(3, parcelObtain, null, 1) || AbstractBinderC1403b.O2() == null) {
                        return;
                    }
                    AbstractBinderC1403b.O2().l2(id2, callback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // ta.b
            public void w2(c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC1403b.f136397b);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f136407b.transact(6, parcelObtain, null, 1) || AbstractBinderC1403b.O2() == null) {
                        return;
                    }
                    AbstractBinderC1403b.O2().w2(callback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // ta.b
            public void y0(String name, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC1403b.f136397b);
                    parcelObtain.writeString(name);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f136407b.transact(5, parcelObtain, null, 1) || AbstractBinderC1403b.O2() == null) {
                        return;
                    }
                    AbstractBinderC1403b.O2().y0(name, callback);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC1403b() {
            attachInterface(this, f136397b);
        }

        public static b N2(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(f136397b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(obj) : (b) iInterfaceQueryLocalInterface;
        }

        public static b O2() {
            return a.f136406c;
        }

        public static boolean P2(b impl) {
            if (a.f136406c != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            a.f136406c = impl;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == 1598968902) {
                reply.writeString(f136397b);
                return true;
            }
            switch (code) {
                case 1:
                    data.enforceInterface(f136397b);
                    K1(data.createByteArray(), c.b.N2(data.readStrongBinder()));
                    return true;
                case 2:
                    data.enforceInterface(f136397b);
                    Q1(data.createByteArray(), c.b.N2(data.readStrongBinder()));
                    return true;
                case 3:
                    data.enforceInterface(f136397b);
                    l2(data.readString(), c.b.N2(data.readStrongBinder()));
                    return true;
                case 4:
                    data.enforceInterface(f136397b);
                    W0(data.readString(), c.b.N2(data.readStrongBinder()));
                    return true;
                case 5:
                    data.enforceInterface(f136397b);
                    y0(data.readString(), c.b.N2(data.readStrongBinder()));
                    return true;
                case 6:
                    data.enforceInterface(f136397b);
                    w2(c.b.N2(data.readStrongBinder()));
                    return true;
                case 7:
                    data.enforceInterface(f136397b);
                    h2(data.createByteArray(), c.b.N2(data.readStrongBinder()));
                    return true;
                case 8:
                    data.enforceInterface(f136397b);
                    C1(data.createByteArray(), c.b.N2(data.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
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

        @Override // ta.b
        public void w2(c callback) throws RemoteException {
        }

        @Override // ta.b
        public void C1(byte[] request, c callback) throws RemoteException {
        }

        @Override // ta.b
        public void K1(byte[] request, c callback) throws RemoteException {
        }

        @Override // ta.b
        public void Q1(byte[] request, c callback) throws RemoteException {
        }

        @Override // ta.b
        public void W0(String tag, c callback) throws RemoteException {
        }

        @Override // ta.b
        public void h2(byte[] request, c callback) throws RemoteException {
        }

        @Override // ta.b
        public void l2(String id2, c callback) throws RemoteException {
        }

        @Override // ta.b
        public void y0(String name, c callback) throws RemoteException {
        }
    }
}
