package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.y0({k.y0.a.LIBRARY})
public interface d0 extends IInterface {
    public static final String O9 = "androidx.media3.session.IMediaSession";

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

    void A(c0 c0Var, int i10) throws RemoteException;

    void A1(c0 c0Var, int i10, Bundle bundle) throws RemoteException;

    void A2(c0 c0Var, int i10) throws RemoteException;

    void C(c0 c0Var, int i10, Surface surface, int i11, int i12) throws RemoteException;

    void C0(c0 c0Var, int i10, String str, int i11, int i12, Bundle bundle) throws RemoteException;

    void C2(c0 c0Var, int i10) throws RemoteException;

    void D0(c0 c0Var) throws RemoteException;

    void E0(c0 c0Var, int i10, int i11, int i12) throws RemoteException;

    void E1(c0 c0Var, int i10) throws RemoteException;

    void G1(c0 c0Var, int i10) throws RemoteException;

    void H0(c0 c0Var, int i10, Bundle bundle, boolean z10) throws RemoteException;

    void I(c0 c0Var, int i10, Bundle bundle) throws RemoteException;

    void I0(c0 c0Var, int i10) throws RemoteException;

    void I1(c0 c0Var, int i10, String str, Bundle bundle) throws RemoteException;

    void J0(c0 c0Var, int i10, String str, Bundle bundle) throws RemoteException;

    void K0(c0 c0Var, int i10, Bundle bundle, Bundle bundle2, boolean z10) throws RemoteException;

    void L0(c0 c0Var, int i10) throws RemoteException;

    void L1(c0 c0Var, int i10, Bundle bundle) throws RemoteException;

    void M2(c0 c0Var, int i10, Bundle bundle) throws RemoteException;

    void N0(c0 c0Var, int i10, int i11, int i12, IBinder iBinder) throws RemoteException;

    void N1(c0 c0Var, int i10, Bundle bundle) throws RemoteException;

    void P0(c0 c0Var, int i10) throws RemoteException;

    void P1(c0 c0Var, int i10, IBinder iBinder) throws RemoteException;

    void Q(c0 c0Var, int i10, String str, int i11, int i12, Bundle bundle) throws RemoteException;

    void Q0(c0 c0Var, int i10, boolean z10) throws RemoteException;

    void R(c0 c0Var, int i10, IBinder iBinder) throws RemoteException;

    void R1(c0 c0Var, int i10, int i11, Bundle bundle) throws RemoteException;

    void S1(c0 c0Var, int i10, int i11, int i12) throws RemoteException;

    void T1(c0 c0Var, int i10, boolean z10) throws RemoteException;

    void U1(c0 c0Var, int i10, String str) throws RemoteException;

    void X0(c0 c0Var, int i10, boolean z10, int i11) throws RemoteException;

    void X1(c0 c0Var, int i10, int i11) throws RemoteException;

    void Y0(c0 c0Var, int i10, Bundle bundle, Bundle bundle2) throws RemoteException;

    void Y1(c0 c0Var, int i10, int i11, long j10) throws RemoteException;

    void Z(c0 c0Var, int i10) throws RemoteException;

    void Z0(c0 c0Var, int i10, IBinder iBinder, int i11, long j10) throws RemoteException;

    void a0(c0 c0Var, int i10, Bundle bundle) throws RemoteException;

    void b0(c0 c0Var, int i10, String str, Bundle bundle) throws RemoteException;

    void c0(c0 c0Var, int i10, int i11) throws RemoteException;

    void c1(c0 c0Var, int i10, String str) throws RemoteException;

    void d1(c0 c0Var, int i10, int i11, int i12) throws RemoteException;

    void e1(c0 c0Var, int i10) throws RemoteException;

    void f0(c0 c0Var, int i10, Bundle bundle, long j10) throws RemoteException;

    void f2(c0 c0Var, int i10, Surface surface) throws RemoteException;

    void g0(c0 c0Var, int i10, int i11) throws RemoteException;

    void g1(c0 c0Var, int i10, Bundle bundle) throws RemoteException;

    void g2(c0 c0Var, int i10, int i11, IBinder iBinder) throws RemoteException;

    void h0(c0 c0Var, int i10) throws RemoteException;

    void i0(c0 c0Var, int i10, long j10) throws RemoteException;

    void j0(c0 c0Var, int i10, float f10) throws RemoteException;

    void j1(c0 c0Var, int i10) throws RemoteException;

    void j2(c0 c0Var, int i10) throws RemoteException;

    void k0(c0 c0Var, int i10, int i11, int i12) throws RemoteException;

    void l0(c0 c0Var, int i10, float f10) throws RemoteException;

    void l1(c0 c0Var, int i10, boolean z10) throws RemoteException;

    void m0(c0 c0Var, int i10, int i11, Bundle bundle) throws RemoteException;

    void o1(c0 c0Var, int i10, Bundle bundle, boolean z10) throws RemoteException;

    void p0(c0 c0Var, int i10, int i11) throws RemoteException;

    void p1(c0 c0Var, int i10, int i11) throws RemoteException;

    void q1(c0 c0Var, int i10, IBinder iBinder, boolean z10) throws RemoteException;

    void r1(c0 c0Var, int i10) throws RemoteException;

    void s0(c0 c0Var, int i10, Bundle bundle) throws RemoteException;

    void u0(c0 c0Var, int i10, int i11, int i12, int i13) throws RemoteException;

    void u1(c0 c0Var, int i10) throws RemoteException;

    void w(c0 c0Var, int i10) throws RemoteException;

    void x0(c0 c0Var, int i10, Bundle bundle) throws RemoteException;

    void y(c0 c0Var, int i10) throws RemoteException;

    void z2(c0 c0Var, int i10, int i11) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b extends Binder implements d0 {
        public static final int A = 3019;
        public static final int B = 3020;
        public static final int C = 3021;
        public static final int D = 3022;
        public static final int E = 3023;
        public static final int F = 3055;
        public static final int G = 3056;
        public static final int H = 3024;
        public static final int I = 3025;
        public static final int J = 3026;
        public static final int K = 3027;
        public static final int L = 3028;
        public static final int M = 3029;
        public static final int N = 3030;
        public static final int O = 3031;
        public static final int P = 3032;
        public static final int Q = 3033;
        public static final int R = 3034;
        public static final int S = 3035;
        public static final int T = 3036;
        public static final int U = 3037;
        public static final int V = 3038;
        public static final int W = 3039;
        public static final int X = 3040;
        public static final int Y = 3041;
        public static final int Z = 3042;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public static final int f14848a0 = 3043;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f14849b = 3002;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public static final int f14850b0 = 3044;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f14851c = 3058;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public static final int f14852c0 = 3061;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f14853d = 3059;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public static final int f14854d0 = 3062;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f14855e = 3003;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public static final int f14856e0 = 3045;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f14857f = 3051;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public static final int f14858f0 = 3046;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f14859g = 3004;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public static final int f14860g0 = 3047;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f14861h = 3052;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public static final int f14862h0 = 3048;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f14863i = 3005;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public static final int f14864i0 = 3049;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f14865j = 3053;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public static final int f14866j0 = 3050;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f14867k = 3006;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public static final int f14868k0 = 4001;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f14869l = 3054;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public static final int f14870l0 = 4002;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f14871m = 3057;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public static final int f14872m0 = 4003;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f14873n = 3007;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public static final int f14874n0 = 4004;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f14875o = 3008;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public static final int f14876o0 = 4005;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f14877p = 3009;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int f14878p0 = 4006;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f14879q = 3010;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f14880q0 = 4007;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f14881r = 3011;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f14882s = 3012;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f14883t = 3013;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f14884u = 3014;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f14885v = 3015;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f14886w = 3016;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f14887x = 3060;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f14888y = 3017;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f14889z = 3018;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements d0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f14890b;

            public a(IBinder iBinder) {
                this.f14890b = iBinder;
            }

            @Override // androidx.media3.session.d0
            public void A(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.f14851c, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void A1(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(3015, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void A2(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.X, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void C(c0 c0Var, int i10, Surface surface, int i11, int i12) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, surface, 0);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f14890b.transact(b.f14852c0, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void C0(c0 c0Var, int i10, String str, int i11, int i12, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(4003, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void C2(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(3005, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void D0(c0 c0Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    this.f14890b.transact(b.f14856e0, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void E0(c0 c0Var, int i10, int i11, int i12) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f14890b.transact(b.B, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void E1(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.f14858f0, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void G1(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.T, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void H0(c0 c0Var, int i10, Bundle bundle, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f14890b.transact(3009, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void I(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(4001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void I0(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.R, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void I1(c0 c0Var, int i10, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(4006, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void J0(c0 c0Var, int i10, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(b.f14864i0, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void K0(c0 c0Var, int i10, Bundle bundle, Bundle bundle2, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    c.d(parcelObtain, bundle2, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f14890b.transact(b.f14887x, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void L0(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.Y, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void L1(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(b.f14866j0, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void M2(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(b.f14862h0, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void N0(c0 c0Var, int i10, int i11, int i12, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f14890b.transact(b.G, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void N1(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(3014, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String N2() {
                return d0.O9;
            }

            @Override // androidx.media3.session.d0
            public void P0(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.H, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void P1(c0 c0Var, int i10, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f14890b.transact(b.O, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void Q(c0 c0Var, int i10, String str, int i11, int i12, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(4005, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void Q0(c0 c0Var, int i10, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f14890b.transact(3013, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void R(c0 c0Var, int i10, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f14890b.transact(3010, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void R1(c0 c0Var, int i10, int i11, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(b.N, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void S1(c0 c0Var, int i10, int i11, int i12) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f14890b.transact(b.f14857f, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void T1(c0 c0Var, int i10, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f14890b.transact(3006, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void U1(c0 c0Var, int i10, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    this.f14890b.transact(4002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void X0(c0 c0Var, int i10, boolean z10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(i11);
                    this.f14890b.transact(b.f14869l, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void X1(c0 c0Var, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f14890b.transact(b.U, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void Y0(c0 c0Var, int i10, Bundle bundle, Bundle bundle2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    c.d(parcelObtain, bundle2, 0);
                    this.f14890b.transact(3016, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void Y1(c0 c0Var, int i10, int i11, long j10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeLong(j10);
                    this.f14890b.transact(b.W, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void Z(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.f14853d, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void Z0(c0 c0Var, int i10, IBinder iBinder, int i11, long j10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeLong(j10);
                    this.f14890b.transact(3012, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void a0(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(b.M, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14890b;
            }

            @Override // androidx.media3.session.d0
            public void b0(c0 c0Var, int i10, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(4004, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void c0(c0 c0Var, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f14890b.transact(b.f14865j, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void c1(c0 c0Var, int i10, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    this.f14890b.transact(b.f14880q0, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void d1(c0 c0Var, int i10, int i11, int i12) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f14890b.transact(b.f14854d0, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void e1(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.C, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void f0(c0 c0Var, int i10, Bundle bundle, long j10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeLong(j10);
                    this.f14890b.transact(3008, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void f2(c0 c0Var, int i10, Surface surface) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, surface, 0);
                    this.f14890b.transact(b.f14850b0, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void g0(c0 c0Var, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f14890b.transact(b.A, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void g1(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(3007, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void g2(c0 c0Var, int i10, int i11, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f14890b.transact(b.P, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void h0(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.f14848a0, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void i0(c0 c0Var, int i10, long j10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeLong(j10);
                    this.f14890b.transact(b.V, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void j0(c0 c0Var, int i10, float f10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeFloat(f10);
                    this.f14890b.transact(3002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void j1(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.S, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void j2(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.J, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void k0(c0 c0Var, int i10, int i11, int i12) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f14890b.transact(b.D, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void l0(c0 c0Var, int i10, float f10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeFloat(f10);
                    this.f14890b.transact(b.L, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void l1(c0 c0Var, int i10, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f14890b.transact(3018, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void m0(c0 c0Var, int i10, int i11, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(b.F, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void o1(c0 c0Var, int i10, Bundle bundle, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f14890b.transact(b.f14871m, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void p0(c0 c0Var, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f14890b.transact(3017, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void p1(c0 c0Var, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f14890b.transact(3003, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void q1(c0 c0Var, int i10, IBinder iBinder, boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f14890b.transact(3011, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void r1(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.Z, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void s0(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(b.K, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void u0(c0 c0Var, int i10, int i11, int i12, int i13) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    this.f14890b.transact(b.E, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void u1(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.f14860g0, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void w(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(3004, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void x0(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f14890b.transact(b.Q, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void y(c0 c0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    this.f14890b.transact(b.I, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.d0
            public void z2(c0 c0Var, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d0.O9);
                    parcelObtain.writeStrongInterface(c0Var);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f14890b.transact(b.f14861h, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, d0.O9);
        }

        public static d0 N2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d0.O9);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d0)) ? new a(iBinder) : (d0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(d0.O9);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(d0.O9);
                return true;
            }
            switch (i10) {
                case 3002:
                    j0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    return true;
                case 3003:
                    p1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3004:
                    w(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3005:
                    C2(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3006:
                    T1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3007:
                    g1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 3008:
                    f0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR), parcel.readLong());
                    return true;
                case 3009:
                    H0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case 3010:
                    R(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3011:
                    q1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                    return true;
                case 3012:
                    Z0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                    return true;
                case 3013:
                    Q0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3014:
                    N1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 3015:
                    A1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 3016:
                    c0 c0VarN2 = c0.b.N2(parcel.readStrongBinder());
                    int i12 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Y0(c0VarN2, i12, (Bundle) c.c(parcel, creator), (Bundle) c.c(parcel, creator));
                    return true;
                case 3017:
                    p0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3018:
                    l1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case A /* 3019 */:
                    g0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case B /* 3020 */:
                    E0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case C /* 3021 */:
                    e1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case D /* 3022 */:
                    k0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case E /* 3023 */:
                    u0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case H /* 3024 */:
                    P0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case I /* 3025 */:
                    y(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case J /* 3026 */:
                    j2(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case K /* 3027 */:
                    s0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case L /* 3028 */:
                    l0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    return true;
                case M /* 3029 */:
                    a0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case N /* 3030 */:
                    R1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case O /* 3031 */:
                    P1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case P /* 3032 */:
                    g2(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case Q /* 3033 */:
                    x0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case R /* 3034 */:
                    I0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case S /* 3035 */:
                    j1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case T /* 3036 */:
                    G1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case U /* 3037 */:
                    X1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case V /* 3038 */:
                    i0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                    return true;
                case W /* 3039 */:
                    Y1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    return true;
                case X /* 3040 */:
                    A2(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case Y /* 3041 */:
                    L0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case Z /* 3042 */:
                    r1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case f14848a0 /* 3043 */:
                    h0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case f14850b0 /* 3044 */:
                    f2(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Surface) c.c(parcel, Surface.CREATOR));
                    return true;
                case f14856e0 /* 3045 */:
                    D0(c0.b.N2(parcel.readStrongBinder()));
                    return true;
                case f14858f0 /* 3046 */:
                    E1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case f14860g0 /* 3047 */:
                    u1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case f14862h0 /* 3048 */:
                    M2(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case f14864i0 /* 3049 */:
                    J0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case f14866j0 /* 3050 */:
                    L1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case f14857f /* 3051 */:
                    S1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case f14861h /* 3052 */:
                    z2(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case f14865j /* 3053 */:
                    c0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case f14869l /* 3054 */:
                    X0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                    return true;
                case F /* 3055 */:
                    m0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case G /* 3056 */:
                    N0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case f14871m /* 3057 */:
                    o1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case f14851c /* 3058 */:
                    A(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case f14853d /* 3059 */:
                    Z(c0.b.N2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case f14887x /* 3060 */:
                    c0 c0VarN3 = c0.b.N2(parcel.readStrongBinder());
                    int i13 = parcel.readInt();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    K0(c0VarN3, i13, (Bundle) c.c(parcel, creator2), (Bundle) c.c(parcel, creator2), parcel.readInt() != 0);
                    return true;
                case f14852c0 /* 3061 */:
                    C(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Surface) c.c(parcel, Surface.CREATOR), parcel.readInt(), parcel.readInt());
                    return true;
                case f14854d0 /* 3062 */:
                    d1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                default:
                    switch (i10) {
                        case 4001:
                            I(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                            return true;
                        case 4002:
                            U1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        case 4003:
                            C0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                            return true;
                        case 4004:
                            b0(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                            return true;
                        case 4005:
                            Q(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                            return true;
                        case 4006:
                            I1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                            return true;
                        case f14880q0 /* 4007 */:
                            c1(c0.b.N2(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        default:
                            return super.onTransact(i10, parcel, parcel2, i11);
                    }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements d0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.media3.session.d0
        public void D0(c0 c0Var) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void A(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void A2(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void C2(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void E1(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void G1(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void I0(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void L0(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void P0(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void Z(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void e1(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void h0(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void j1(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void j2(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void r1(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void u1(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void w(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void y(c0 c0Var, int i10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void A1(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void I(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void L1(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void M2(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void N1(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void P1(c0 c0Var, int i10, IBinder iBinder) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void Q0(c0 c0Var, int i10, boolean z10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void R(c0 c0Var, int i10, IBinder iBinder) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void T1(c0 c0Var, int i10, boolean z10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void U1(c0 c0Var, int i10, String str) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void X1(c0 c0Var, int i10, int i11) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void a0(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void c0(c0 c0Var, int i10, int i11) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void c1(c0 c0Var, int i10, String str) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void f2(c0 c0Var, int i10, Surface surface) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void g0(c0 c0Var, int i10, int i11) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void g1(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void i0(c0 c0Var, int i10, long j10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void j0(c0 c0Var, int i10, float f10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void l0(c0 c0Var, int i10, float f10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void l1(c0 c0Var, int i10, boolean z10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void p0(c0 c0Var, int i10, int i11) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void p1(c0 c0Var, int i10, int i11) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void s0(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void x0(c0 c0Var, int i10, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void z2(c0 c0Var, int i10, int i11) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void E0(c0 c0Var, int i10, int i11, int i12) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void H0(c0 c0Var, int i10, Bundle bundle, boolean z10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void I1(c0 c0Var, int i10, String str, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void J0(c0 c0Var, int i10, String str, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void R1(c0 c0Var, int i10, int i11, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void S1(c0 c0Var, int i10, int i11, int i12) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void X0(c0 c0Var, int i10, boolean z10, int i11) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void Y0(c0 c0Var, int i10, Bundle bundle, Bundle bundle2) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void Y1(c0 c0Var, int i10, int i11, long j10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void b0(c0 c0Var, int i10, String str, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void d1(c0 c0Var, int i10, int i11, int i12) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void f0(c0 c0Var, int i10, Bundle bundle, long j10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void g2(c0 c0Var, int i10, int i11, IBinder iBinder) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void k0(c0 c0Var, int i10, int i11, int i12) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void m0(c0 c0Var, int i10, int i11, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void o1(c0 c0Var, int i10, Bundle bundle, boolean z10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void q1(c0 c0Var, int i10, IBinder iBinder, boolean z10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void C(c0 c0Var, int i10, Surface surface, int i11, int i12) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void K0(c0 c0Var, int i10, Bundle bundle, Bundle bundle2, boolean z10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void N0(c0 c0Var, int i10, int i11, int i12, IBinder iBinder) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void Z0(c0 c0Var, int i10, IBinder iBinder, int i11, long j10) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void u0(c0 c0Var, int i10, int i11, int i12, int i13) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void C0(c0 c0Var, int i10, String str, int i11, int i12, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media3.session.d0
        public void Q(c0 c0Var, int i10, String str, int i11, int i12, Bundle bundle) throws RemoteException {
        }
    }
}
