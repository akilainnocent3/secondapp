package re;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class y7 implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y7 f127198b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f127199c = eh.o1.R0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f127200d = eh.o1.R0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f127201e = eh.o1.R0(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j.a<y7> f127202f = new j.a() { // from class: re.x7
        @Override // re.j.a
        public final j fromBundle(Bundle bundle) {
            return y7.b(bundle);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends y7 {
        @Override // re.y7
        public int f(Object obj) {
            return -1;
        }

        @Override // re.y7
        public b k(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // re.y7
        public int m() {
            return 0;
        }

        @Override // re.y7
        public Object s(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // re.y7
        public d u(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // re.y7
        public int v() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f127203i = eh.o1.R0(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f127204j = eh.o1.R0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f127205k = eh.o1.R0(2);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f127206l = eh.o1.R0(3);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f127207m = eh.o1.R0(4);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j.a<b> f127208n = new j.a() { // from class: re.z7
            @Override // re.j.a
            public final j fromBundle(Bundle bundle) {
                return y7.b.c(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Object f127209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Object f127210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f127211d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f127212e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f127213f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f127214g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public AdPlaybackState f127215h = AdPlaybackState.f48672m;

        public static b c(Bundle bundle) {
            int i10 = bundle.getInt(f127203i, 0);
            long j10 = bundle.getLong(f127204j, -9223372036854775807L);
            long j11 = bundle.getLong(f127205k, 0L);
            boolean z10 = bundle.getBoolean(f127206l, false);
            Bundle bundle2 = bundle.getBundle(f127207m);
            AdPlaybackState adPlaybackState = bundle2 != null ? (AdPlaybackState) AdPlaybackState.f48678s.fromBundle(bundle2) : AdPlaybackState.f48672m;
            b bVar = new b();
            bVar.y(null, null, i10, j10, j11, adPlaybackState, z10);
            return bVar;
        }

        public int d(int i10) {
            return this.f127215h.f(i10).f48695c;
        }

        public long e(int i10, int i11) {
            AdPlaybackState.b bVarF = this.f127215h.f(i10);
            if (bVarF.f48695c != -1) {
                return bVarF.f48699g[i11];
            }
            return -9223372036854775807L;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (eh.o1.g(this.f127209b, bVar.f127209b) && eh.o1.g(this.f127210c, bVar.f127210c) && this.f127211d == bVar.f127211d && this.f127212e == bVar.f127212e && this.f127213f == bVar.f127213f && this.f127214g == bVar.f127214g && eh.o1.g(this.f127215h, bVar.f127215h)) {
                    return true;
                }
            }
            return false;
        }

        public int f() {
            return this.f127215h.f48680c;
        }

        public int g(long j10) {
            return this.f127215h.g(j10, this.f127212e);
        }

        public int h(long j10) {
            return this.f127215h.h(j10, this.f127212e);
        }

        public int hashCode() {
            Object obj = this.f127209b;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f127210c;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f127211d) * 31;
            long j10 = this.f127212e;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f127213f;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f127214g ? 1 : 0)) * 31) + this.f127215h.hashCode();
        }

        public long i(int i10) {
            return this.f127215h.f(i10).f48694b;
        }

        public long j() {
            return this.f127215h.f48681d;
        }

        public int k(int i10, int i11) {
            AdPlaybackState.b bVarF = this.f127215h.f(i10);
            if (bVarF.f48695c != -1) {
                return bVarF.f48698f[i11];
            }
            return 0;
        }

        @Nullable
        public Object l() {
            return this.f127215h.f48679b;
        }

        public long m(int i10) {
            return this.f127215h.f(i10).f48700h;
        }

        public long n() {
            return eh.o1.b2(this.f127212e);
        }

        public long o() {
            return this.f127212e;
        }

        public int p(int i10) {
            return this.f127215h.f(i10).f();
        }

        public int q(int i10, int i11) {
            return this.f127215h.f(i10).g(i11);
        }

        public long r() {
            return eh.o1.b2(this.f127213f);
        }

        public long s() {
            return this.f127213f;
        }

        public int t() {
            return this.f127215h.f48683f;
        }

        @Override // re.j
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            int i10 = this.f127211d;
            if (i10 != 0) {
                bundle.putInt(f127203i, i10);
            }
            long j10 = this.f127212e;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f127204j, j10);
            }
            long j11 = this.f127213f;
            if (j11 != 0) {
                bundle.putLong(f127205k, j11);
            }
            boolean z10 = this.f127214g;
            if (z10) {
                bundle.putBoolean(f127206l, z10);
            }
            if (!this.f127215h.equals(AdPlaybackState.f48672m)) {
                bundle.putBundle(f127207m, this.f127215h.toBundle());
            }
            return bundle;
        }

        public boolean u(int i10) {
            return !this.f127215h.f(i10).h();
        }

        public boolean v(int i10) {
            return i10 == f() - 1 && this.f127215h.j(i10);
        }

        public boolean w(int i10) {
            return this.f127215h.f(i10).f48701i;
        }

        @qj.a
        public b x(@Nullable Object obj, @Nullable Object obj2, int i10, long j10, long j11) {
            return y(obj, obj2, i10, j10, j11, AdPlaybackState.f48672m, false);
        }

        @qj.a
        public b y(@Nullable Object obj, @Nullable Object obj2, int i10, long j10, long j11, AdPlaybackState adPlaybackState, boolean z10) {
            this.f127209b = obj;
            this.f127210c = obj2;
            this.f127211d = i10;
            this.f127212e = j10;
            this.f127213f = j11;
            this.f127215h = adPlaybackState;
            this.f127214g = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends y7 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final cj.v6<d> f127216g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final cj.v6<b> f127217h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int[] f127218i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int[] f127219j;

        public c(cj.v6<d> v6Var, cj.v6<b> v6Var2, int[] iArr) {
            eh.a.a(v6Var.size() == iArr.length);
            this.f127216g = v6Var;
            this.f127217h = v6Var2;
            this.f127218i = iArr;
            this.f127219j = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f127219j[iArr[i10]] = i10;
            }
        }

        @Override // re.y7
        public int e(boolean z10) {
            if (w()) {
                return -1;
            }
            if (z10) {
                return this.f127218i[0];
            }
            return 0;
        }

        @Override // re.y7
        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // re.y7
        public int g(boolean z10) {
            if (w()) {
                return -1;
            }
            return z10 ? this.f127218i[v() - 1] : v() - 1;
        }

        @Override // re.y7
        public int i(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != g(z10)) {
                return z10 ? this.f127218i[this.f127219j[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return e(z10);
            }
            return -1;
        }

        @Override // re.y7
        public b k(int i10, b bVar, boolean z10) {
            b bVar2 = this.f127217h.get(i10);
            bVar.y(bVar2.f127209b, bVar2.f127210c, bVar2.f127211d, bVar2.f127212e, bVar2.f127213f, bVar2.f127215h, bVar2.f127214g);
            return bVar;
        }

        @Override // re.y7
        public int m() {
            return this.f127217h.size();
        }

        @Override // re.y7
        public int r(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != e(z10)) {
                return z10 ? this.f127218i[this.f127219j[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return g(z10);
            }
            return -1;
        }

        @Override // re.y7
        public Object s(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // re.y7
        public d u(int i10, d dVar, long j10) {
            d dVar2 = this.f127216g.get(i10);
            dVar.k(dVar2.f127228b, dVar2.f127230d, dVar2.f127231e, dVar2.f127232f, dVar2.f127233g, dVar2.f127234h, dVar2.f127235i, dVar2.f127236j, dVar2.f127238l, dVar2.f127240n, dVar2.f127241o, dVar2.f127242p, dVar2.f127243q, dVar2.f127244r);
            dVar.f127239m = dVar2.f127239m;
            return dVar;
        }

        @Override // re.y7
        public int v() {
            return this.f127216g.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d implements j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        @Deprecated
        public Object f127229c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Object f127231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f127232f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f127233g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f127234h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f127235i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f127236j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        public boolean f127237k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public x2.g f127238l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f127239m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f127240n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f127241o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f127242p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f127243q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f127244r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final Object f127220s = new Object();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Object f127221t = new Object();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final x2 f127222u = new x2.c().D("com.google.android.exoplayer2.Timeline").L(Uri.EMPTY).a();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f127223v = eh.o1.R0(1);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String f127224w = eh.o1.R0(2);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f127225x = eh.o1.R0(3);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f127226y = eh.o1.R0(4);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f127227z = eh.o1.R0(5);
        public static final String A = eh.o1.R0(6);
        public static final String B = eh.o1.R0(7);
        public static final String C = eh.o1.R0(8);
        public static final String D = eh.o1.R0(9);
        public static final String E = eh.o1.R0(10);
        public static final String F = eh.o1.R0(11);
        public static final String G = eh.o1.R0(12);
        public static final String H = eh.o1.R0(13);
        public static final j.a<d> I = new j.a() { // from class: re.a8
            @Override // re.j.a
            public final j fromBundle(Bundle bundle) {
                return y7.d.b(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f127228b = f127220s;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public x2 f127230d = f127222u;

        public static d b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f127223v);
            x2 x2Var = bundle2 != null ? (x2) x2.f127026r.fromBundle(bundle2) : x2.f127019k;
            long j10 = bundle.getLong(f127224w, -9223372036854775807L);
            long j11 = bundle.getLong(f127225x, -9223372036854775807L);
            long j12 = bundle.getLong(f127226y, -9223372036854775807L);
            boolean z10 = bundle.getBoolean(f127227z, false);
            boolean z11 = bundle.getBoolean(A, false);
            Bundle bundle3 = bundle.getBundle(B);
            x2.g gVar = bundle3 != null ? (x2.g) x2.g.f127106m.fromBundle(bundle3) : null;
            boolean z12 = bundle.getBoolean(C, false);
            long j13 = bundle.getLong(D, 0L);
            long j14 = bundle.getLong(E, -9223372036854775807L);
            int i10 = bundle.getInt(F, 0);
            int i11 = bundle.getInt(G, 0);
            long j15 = bundle.getLong(H, 0L);
            d dVar = new d();
            dVar.k(f127221t, x2Var, null, j10, j11, j12, z10, z11, gVar, j13, j14, i10, i11, j15);
            dVar.f127239m = z12;
            return dVar;
        }

        public long c() {
            return eh.o1.t0(this.f127234h);
        }

        public long d() {
            return eh.o1.b2(this.f127240n);
        }

        public long e() {
            return this.f127240n;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class.equals(obj.getClass())) {
                d dVar = (d) obj;
                if (eh.o1.g(this.f127228b, dVar.f127228b) && eh.o1.g(this.f127230d, dVar.f127230d) && eh.o1.g(this.f127231e, dVar.f127231e) && eh.o1.g(this.f127238l, dVar.f127238l) && this.f127232f == dVar.f127232f && this.f127233g == dVar.f127233g && this.f127234h == dVar.f127234h && this.f127235i == dVar.f127235i && this.f127236j == dVar.f127236j && this.f127239m == dVar.f127239m && this.f127240n == dVar.f127240n && this.f127241o == dVar.f127241o && this.f127242p == dVar.f127242p && this.f127243q == dVar.f127243q && this.f127244r == dVar.f127244r) {
                    return true;
                }
            }
            return false;
        }

        public long f() {
            return eh.o1.b2(this.f127241o);
        }

        public long g() {
            return this.f127241o;
        }

        public long h() {
            return eh.o1.b2(this.f127244r);
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f127228b.hashCode()) * 31) + this.f127230d.hashCode()) * 31;
            Object obj = this.f127231e;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            x2.g gVar = this.f127238l;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f127232f;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f127233g;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f127234h;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f127235i ? 1 : 0)) * 31) + (this.f127236j ? 1 : 0)) * 31) + (this.f127239m ? 1 : 0)) * 31;
            long j13 = this.f127240n;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f127241o;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f127242p) * 31) + this.f127243q) * 31;
            long j15 = this.f127244r;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }

        public long i() {
            return this.f127244r;
        }

        public boolean j() {
            eh.a.i(this.f127237k == (this.f127238l != null));
            return this.f127238l != null;
        }

        @qj.a
        public d k(Object obj, @Nullable x2 x2Var, @Nullable Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, @Nullable x2.g gVar, long j13, long j14, int i10, int i11, long j15) {
            x2.h hVar;
            this.f127228b = obj;
            this.f127230d = x2Var != null ? x2Var : f127222u;
            this.f127229c = (x2Var == null || (hVar = x2Var.f127028c) == null) ? null : hVar.f127133j;
            this.f127231e = obj2;
            this.f127232f = j10;
            this.f127233g = j11;
            this.f127234h = j12;
            this.f127235i = z10;
            this.f127236j = z11;
            this.f127237k = gVar != null;
            this.f127238l = gVar;
            this.f127240n = j13;
            this.f127241o = j14;
            this.f127242p = i10;
            this.f127243q = i11;
            this.f127244r = j15;
            this.f127239m = false;
            return this;
        }

        @Override // re.j
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (!x2.f127019k.equals(this.f127230d)) {
                bundle.putBundle(f127223v, this.f127230d.toBundle());
            }
            long j10 = this.f127232f;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f127224w, j10);
            }
            long j11 = this.f127233g;
            if (j11 != -9223372036854775807L) {
                bundle.putLong(f127225x, j11);
            }
            long j12 = this.f127234h;
            if (j12 != -9223372036854775807L) {
                bundle.putLong(f127226y, j12);
            }
            boolean z10 = this.f127235i;
            if (z10) {
                bundle.putBoolean(f127227z, z10);
            }
            boolean z11 = this.f127236j;
            if (z11) {
                bundle.putBoolean(A, z11);
            }
            x2.g gVar = this.f127238l;
            if (gVar != null) {
                bundle.putBundle(B, gVar.toBundle());
            }
            boolean z12 = this.f127239m;
            if (z12) {
                bundle.putBoolean(C, z12);
            }
            long j13 = this.f127240n;
            if (j13 != 0) {
                bundle.putLong(D, j13);
            }
            long j14 = this.f127241o;
            if (j14 != -9223372036854775807L) {
                bundle.putLong(E, j14);
            }
            int i10 = this.f127242p;
            if (i10 != 0) {
                bundle.putInt(F, i10);
            }
            int i11 = this.f127243q;
            if (i11 != 0) {
                bundle.putInt(G, i11);
            }
            long j15 = this.f127244r;
            if (j15 != 0) {
                bundle.putLong(H, j15);
            }
            return bundle;
        }
    }

    public static y7 b(Bundle bundle) {
        cj.v6 v6VarC = c(d.I, eh.e.a(bundle, f127199c));
        cj.v6 v6VarC2 = c(b.f127208n, eh.e.a(bundle, f127200d));
        int[] intArray = bundle.getIntArray(f127201e);
        if (intArray == null) {
            intArray = d(v6VarC.size());
        }
        return new c(v6VarC, v6VarC2, intArray);
    }

    public static <T extends j> cj.v6<T> c(j.a<T> aVar, @Nullable IBinder iBinder) {
        if (iBinder == null) {
            return cj.v6.z();
        }
        cj.v6.a aVar2 = new cj.v6.a();
        cj.v6<Bundle> v6VarA = i.a(iBinder);
        for (int i10 = 0; i10 < v6VarA.size(); i10++) {
            aVar2.g(aVar.fromBundle(v6VarA.get(i10)));
        }
        return aVar2.e();
    }

    public static int[] d(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    public int e(boolean z10) {
        return w() ? -1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int iG;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        if (y7Var.v() != v() || y7Var.m() != m()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < v(); i10++) {
            if (!t(i10, dVar).equals(y7Var.t(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < m(); i11++) {
            if (!k(i11, bVar, true).equals(y7Var.k(i11, bVar2, true))) {
                return false;
            }
        }
        int iE = e(true);
        if (iE != y7Var.e(true) || (iG = g(true)) != y7Var.g(true)) {
            return false;
        }
        while (iE != iG) {
            int i12 = i(iE, 0, true);
            if (i12 != y7Var.i(iE, 0, true)) {
                return false;
            }
            iE = i12;
        }
        return true;
    }

    public abstract int f(Object obj);

    public int g(boolean z10) {
        if (w()) {
            return -1;
        }
        return v() - 1;
    }

    public final int h(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = j(i10, bVar).f127211d;
        if (t(i12, dVar).f127243q != i10) {
            return i10 + 1;
        }
        int i13 = i(i12, i11, z10);
        if (i13 == -1) {
            return -1;
        }
        return t(i13, dVar).f127242p;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iV = 217 + v();
        for (int i10 = 0; i10 < v(); i10++) {
            iV = (iV * 31) + t(i10, dVar).hashCode();
        }
        int iM = (iV * 31) + m();
        for (int i11 = 0; i11 < m(); i11++) {
            iM = (iM * 31) + k(i11, bVar, true).hashCode();
        }
        int iE = e(true);
        while (iE != -1) {
            iM = (iM * 31) + iE;
            iE = i(iE, 0, true);
        }
        return iM;
    }

    public int i(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == g(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == g(z10) ? e(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final b j(int i10, b bVar) {
        return k(i10, bVar, false);
    }

    public abstract b k(int i10, b bVar, boolean z10);

    public b l(Object obj, b bVar) {
        return k(f(obj), bVar, true);
    }

    public abstract int m();

    @qj.m(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    @Deprecated
    public final Pair<Object, Long> n(d dVar, b bVar, int i10, long j10) {
        return p(dVar, bVar, i10, j10);
    }

    @Nullable
    @qj.m(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    @Deprecated
    public final Pair<Object, Long> o(d dVar, b bVar, int i10, long j10, long j11) {
        return q(dVar, bVar, i10, j10, j11);
    }

    public final Pair<Object, Long> p(d dVar, b bVar, int i10, long j10) {
        return (Pair) eh.a.g(q(dVar, bVar, i10, j10, 0L));
    }

    @Nullable
    public final Pair<Object, Long> q(d dVar, b bVar, int i10, long j10, long j11) {
        eh.a.c(i10, 0, v());
        u(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.e();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f127242p;
        j(i11, bVar);
        while (i11 < dVar.f127243q && bVar.f127213f != j10) {
            int i12 = i11 + 1;
            if (j(i12, bVar).f127213f > j10) {
                break;
            }
            i11 = i12;
        }
        k(i11, bVar, true);
        long jMin = j10 - bVar.f127213f;
        long j12 = bVar.f127212e;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(eh.a.g(bVar.f127210c), Long.valueOf(Math.max(0L, jMin)));
    }

    public int r(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == e(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == e(z10) ? g(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object s(int i10);

    public final d t(int i10, d dVar) {
        return u(i10, dVar, 0L);
    }

    @Override // re.j
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int iV = v();
        d dVar = new d();
        for (int i10 = 0; i10 < iV; i10++) {
            arrayList.add(u(i10, dVar, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int iM = m();
        b bVar = new b();
        for (int i11 = 0; i11 < iM; i11++) {
            arrayList2.add(k(i11, bVar, false).toBundle());
        }
        int[] iArr = new int[iV];
        if (iV > 0) {
            iArr[0] = e(true);
        }
        for (int i12 = 1; i12 < iV; i12++) {
            iArr[i12] = i(iArr[i12 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        eh.e.c(bundle, f127199c, new i(arrayList));
        eh.e.c(bundle, f127200d, new i(arrayList2));
        bundle.putIntArray(f127201e, iArr);
        return bundle;
    }

    public abstract d u(int i10, d dVar, long j10);

    public abstract int v();

    public final boolean w() {
        return v() == 0;
    }

    public final boolean x(int i10, b bVar, d dVar, int i11, boolean z10) {
        return h(i10, bVar, dVar, i11, z10) == -1;
    }

    public final Bundle y(int i10) {
        d dVarU = u(i10, new d(), 0L);
        ArrayList arrayList = new ArrayList();
        b bVar = new b();
        int i11 = dVarU.f127242p;
        while (true) {
            int i12 = dVarU.f127243q;
            if (i11 > i12) {
                dVarU.f127243q = i12 - dVarU.f127242p;
                dVarU.f127242p = 0;
                Bundle bundle = dVarU.toBundle();
                Bundle bundle2 = new Bundle();
                eh.e.c(bundle2, f127199c, new i(cj.v6.A(bundle)));
                eh.e.c(bundle2, f127200d, new i(arrayList));
                bundle2.putIntArray(f127201e, new int[]{0});
                return bundle2;
            }
            k(i11, bVar, false);
            bVar.f127211d = 0;
            arrayList.add(bVar.toBundle());
            i11++;
        }
    }
}
