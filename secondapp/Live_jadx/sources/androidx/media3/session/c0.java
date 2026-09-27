package androidx.media3.session;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.y0({k.y0.a.LIBRARY})
public interface c0 extends IInterface {
    public static final String N9 = "androidx.media3.session.IMediaController";

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

    void B0(int i10, Bundle bundle, Bundle bundle2) throws RemoteException;

    void B2(int i10, Bundle bundle) throws RemoteException;

    void F2(int i10, Bundle bundle, boolean z10) throws RemoteException;

    void G0(int i10, Bundle bundle, Bundle bundle2) throws RemoteException;

    void H2(int i10, String str, int i11, Bundle bundle) throws RemoteException;

    void J(int i10, Bundle bundle) throws RemoteException;

    void O(int i10, List<Bundle> list) throws RemoteException;

    void P(int i10, String str, int i11, Bundle bundle) throws RemoteException;

    void U0(int i10, Bundle bundle, Bundle bundle2, Bundle bundle3) throws RemoteException;

    void b(int i10, int i11, int i12) throws RemoteException;

    void b1(int i10, List<Bundle> list) throws RemoteException;

    void d(int i10) throws RemoteException;

    void k2(int i10, Bundle bundle) throws RemoteException;

    void n0(int i10, Bundle bundle) throws RemoteException;

    void o(int i10, PendingIntent pendingIntent) throws RemoteException;

    void o2(int i10, Bundle bundle, Bundle bundle2) throws RemoteException;

    void q(int i10) throws RemoteException;

    void v0(int i10, Bundle bundle) throws RemoteException;

    void v1(int i10, Bundle bundle) throws RemoteException;

    void z0(int i10, Bundle bundle) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b extends Binder implements c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f14732b = 3001;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f14733c = 3002;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f14734d = 3003;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f14735e = 3004;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f14736f = 3005;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f14737g = 3017;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f14738h = 3006;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f14739i = 3007;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f14740j = 3013;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f14741k = 3008;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f14742l = 3009;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f14743m = 3010;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f14744n = 3018;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f14745o = 3011;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f14746p = 3012;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f14747q = 3014;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f14748r = 3015;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f14749s = 3016;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f14750t = 4001;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f14751u = 4002;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements c0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f14752b;

            public a(IBinder iBinder) {
                this.f14752b = iBinder;
            }

            @Override // androidx.media3.session.c0
            public void B0(int i10, Bundle bundle, Bundle bundle2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bundle, 0);
                    c.f(parcelObtain, bundle2, 0);
                    this.f14752b.transact(3005, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void B2(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bundle, 0);
                    this.f14752b.transact(3012, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void F2(int i10, Bundle bundle, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f14752b.transact(3007, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void G0(int i10, Bundle bundle, Bundle bundle2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bundle, 0);
                    c.f(parcelObtain, bundle2, 0);
                    this.f14752b.transact(3010, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void H2(int i10, String str, int i11, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    c.f(parcelObtain, bundle, 0);
                    this.f14752b.transact(4001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void J(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bundle, 0);
                    this.f14752b.transact(3001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String N2() {
                return c0.N9;
            }

            @Override // androidx.media3.session.c0
            public void O(int i10, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.e(parcelObtain, list, 0);
                    this.f14752b.transact(3016, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void P(int i10, String str, int i11, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    c.f(parcelObtain, bundle, 0);
                    this.f14752b.transact(4002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void U0(int i10, Bundle bundle, Bundle bundle2, Bundle bundle3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bundle, 0);
                    c.f(parcelObtain, bundle2, 0);
                    c.f(parcelObtain, bundle3, 0);
                    this.f14752b.transact(3017, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14752b;
            }

            @Override // androidx.media3.session.c0
            public void b(int i10, int i11, int i12) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f14752b.transact(3018, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void b1(int i10, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.e(parcelObtain, list, 0);
                    this.f14752b.transact(3004, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void d(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    this.f14752b.transact(3006, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void k2(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bundle, 0);
                    this.f14752b.transact(3008, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void n0(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bundle, 0);
                    this.f14752b.transact(3002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void o(int i10, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, pendingIntent, 0);
                    this.f14752b.transact(3014, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void o2(int i10, Bundle bundle, Bundle bundle2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bundle, 0);
                    c.f(parcelObtain, bundle2, 0);
                    this.f14752b.transact(3013, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void q(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    this.f14752b.transact(3011, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void v0(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bundle, 0);
                    this.f14752b.transact(3015, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void v1(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bundle, 0);
                    this.f14752b.transact(3003, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.c0
            public void z0(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c0.N9);
                    parcelObtain.writeInt(i10);
                    c.f(parcelObtain, bundle, 0);
                    this.f14752b.transact(3009, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, c0.N9);
        }

        public static c0 N2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c0.N9);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c0)) ? new a(iBinder) : (c0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(c0.N9);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(c0.N9);
                return true;
            }
            if (i10 == 4001) {
                H2(parcel.readInt(), parcel.readString(), parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR));
            } else if (i10 != 4002) {
                switch (i10) {
                    case 3001:
                        J(parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR));
                        break;
                    case 3002:
                        n0(parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR));
                        break;
                    case 3003:
                        v1(parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR));
                        break;
                    case 3004:
                        b1(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                        break;
                    case 3005:
                        int i12 = parcel.readInt();
                        Parcelable.Creator creator = Bundle.CREATOR;
                        B0(i12, (Bundle) c.d(parcel, creator), (Bundle) c.d(parcel, creator));
                        break;
                    case 3006:
                        d(parcel.readInt());
                        break;
                    case 3007:
                        F2(parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                        break;
                    case 3008:
                        k2(parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR));
                        break;
                    case 3009:
                        z0(parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR));
                        break;
                    case 3010:
                        int i13 = parcel.readInt();
                        Parcelable.Creator creator2 = Bundle.CREATOR;
                        G0(i13, (Bundle) c.d(parcel, creator2), (Bundle) c.d(parcel, creator2));
                        break;
                    case 3011:
                        q(parcel.readInt());
                        break;
                    case 3012:
                        B2(parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR));
                        break;
                    case 3013:
                        int i14 = parcel.readInt();
                        Parcelable.Creator creator3 = Bundle.CREATOR;
                        o2(i14, (Bundle) c.d(parcel, creator3), (Bundle) c.d(parcel, creator3));
                        break;
                    case 3014:
                        o(parcel.readInt(), (PendingIntent) c.d(parcel, PendingIntent.CREATOR));
                        break;
                    case 3015:
                        v0(parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR));
                        break;
                    case 3016:
                        O(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                        break;
                    case 3017:
                        int i15 = parcel.readInt();
                        Parcelable.Creator creator4 = Bundle.CREATOR;
                        U0(i15, (Bundle) c.d(parcel, creator4), (Bundle) c.d(parcel, creator4), (Bundle) c.d(parcel, creator4));
                        break;
                    case 3018:
                        b(parcel.readInt(), parcel.readInt(), parcel.readInt());
                        break;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            } else {
                P(parcel.readInt(), parcel.readString(), parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements c0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.media3.session.c0
        public void d(int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void q(int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void B2(int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void J(int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void O(int i10, List<Bundle> list) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void b1(int i10, List<Bundle> list) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void k2(int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void n0(int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void o(int i10, PendingIntent pendingIntent) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void v0(int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void v1(int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void z0(int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void B0(int i10, Bundle bundle, Bundle bundle2) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void F2(int i10, Bundle bundle, boolean z10) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void G0(int i10, Bundle bundle, Bundle bundle2) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void b(int i10, int i11, int i12) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void o2(int i10, Bundle bundle, Bundle bundle2) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void H2(int i10, String str, int i11, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void P(int i10, String str, int i11, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.c0
        public void U0(int i10, Bundle bundle, Bundle bundle2, Bundle bundle3) throws RemoteException {
        }
    }
}
