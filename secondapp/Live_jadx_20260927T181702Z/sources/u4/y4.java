package u4;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Nullable;
import cj.v6;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y4 f139100a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f139101b = x4.b2.k1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f139102c = x4.b2.k1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f139103d = x4.b2.k1(2);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends y4 {
        @Override // u4.y4
        public int i(Object obj) {
            return -1;
        }

        @Override // u4.y4
        public b n(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // u4.y4
        public int p() {
            return 0;
        }

        @Override // u4.y4
        public Object v(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // u4.y4
        public d x(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // u4.y4
        public int y() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f139104h = x4.b2.k1(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f139105i = x4.b2.k1(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f139106j = x4.b2.k1(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f139107k = x4.b2.k1(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f139108l = x4.b2.k1(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Object f139109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Object f139110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @x4.m1
        public long f139112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @x4.m1
        public long f139113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f139114f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @x4.m1
        public u4.b f139115g = u4.b.f138057l;

        @x4.m1
        @Deprecated
        public static b a(Bundle bundle) {
            return b(bundle, 9);
        }

        @x4.m1
        public static b b(Bundle bundle, int i10) {
            int i11 = bundle.getInt(f139104h, 0);
            long j10 = bundle.getLong(f139105i, -9223372036854775807L);
            long j11 = bundle.getLong(f139106j, 0L);
            boolean z10 = bundle.getBoolean(f139107k, false);
            Bundle bundle2 = bundle.getBundle(f139108l);
            u4.b bVarG = bundle2 != null ? u4.b.g(bundle2, i10) : u4.b.f138057l;
            b bVar = new b();
            bVar.x(null, null, i11, j10, j11, bVarG, z10);
            return bVar;
        }

        public int c(int i10) {
            return this.f139115g.h(i10).f138082b;
        }

        public long d(int i10, int i11) {
            u4.b.C1433b c1433bH = this.f139115g.h(i10);
            if (c1433bH.f138082b != -1) {
                return c1433bH.f138087g[i11];
            }
            return -9223372036854775807L;
        }

        public int e() {
            return this.f139115g.f138064b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (Objects.equals(this.f139109a, bVar.f139109a) && Objects.equals(this.f139110b, bVar.f139110b) && this.f139111c == bVar.f139111c && this.f139112d == bVar.f139112d && this.f139113e == bVar.f139113e && this.f139114f == bVar.f139114f && Objects.equals(this.f139115g, bVar.f139115g)) {
                    return true;
                }
            }
            return false;
        }

        public int f(long j10) {
            return this.f139115g.i(j10, this.f139112d);
        }

        public int g(long j10) {
            return this.f139115g.j(j10, this.f139112d);
        }

        public long h(int i10) {
            return this.f139115g.h(i10).f138081a;
        }

        public int hashCode() {
            Object obj = this.f139109a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f139110b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f139111c) * 31;
            long j10 = this.f139112d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f139113e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f139114f ? 1 : 0)) * 31) + this.f139115g.hashCode();
        }

        public long i() {
            return this.f139115g.f138065c;
        }

        @x4.m1
        public int j(int i10, int i11) {
            u4.b.C1433b c1433bH = this.f139115g.h(i10);
            if (c1433bH.f138082b != -1) {
                return c1433bH.f138086f[i11];
            }
            return 0;
        }

        @Nullable
        public Object k() {
            return this.f139115g.f138063a;
        }

        @x4.m1
        public long l(int i10) {
            return this.f139115g.h(i10).f138090j;
        }

        public long m() {
            return x4.b2.Q2(this.f139112d);
        }

        public long n() {
            return this.f139112d;
        }

        public int o(int i10) {
            return this.f139115g.h(i10).h();
        }

        public int p(int i10, int i11) {
            return this.f139115g.h(i10).l(i11);
        }

        public long q() {
            return x4.b2.Q2(this.f139113e);
        }

        public long r() {
            return this.f139113e;
        }

        public int s() {
            return this.f139115g.f138067e;
        }

        public boolean t(int i10) {
            return !this.f139115g.h(i10).o();
        }

        @x4.m1
        public boolean u(int i10) {
            return i10 == e() - 1 && this.f139115g.m(i10);
        }

        @x4.m1
        public boolean v(int i10) {
            return this.f139115g.h(i10).f138091k;
        }

        @qj.a
        @x4.m1
        public b w(@Nullable Object obj, @Nullable Object obj2, int i10, long j10, long j11) {
            return x(obj, obj2, i10, j10, j11, u4.b.f138057l, false);
        }

        @qj.a
        @x4.m1
        public b x(@Nullable Object obj, @Nullable Object obj2, int i10, long j10, long j11, u4.b bVar, boolean z10) {
            this.f139109a = obj;
            this.f139110b = obj2;
            this.f139111c = i10;
            this.f139112d = j10;
            this.f139113e = j11;
            this.f139115g = bVar;
            this.f139114f = z10;
            return this;
        }

        @x4.m1
        @Deprecated
        public Bundle y() {
            return z(9);
        }

        @x4.m1
        public Bundle z(int i10) {
            Bundle bundle = new Bundle();
            int i11 = this.f139111c;
            if (i11 != 0) {
                bundle.putInt(f139104h, i11);
            }
            long j10 = this.f139112d;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f139105i, j10);
            }
            long j11 = this.f139113e;
            if (j11 != 0) {
                bundle.putLong(f139106j, j11);
            }
            boolean z10 = this.f139114f;
            if (z10) {
                bundle.putBoolean(f139107k, z10);
            }
            if (!this.f139115g.equals(u4.b.f138057l)) {
                bundle.putBundle(f139108l, this.f139115g.q(i10));
            }
            return bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @x4.m1
    public static final class c extends y4 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final v6<d> f139116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final v6<b> f139117f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int[] f139118g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f139119h;

        public c(v6<d> v6Var, v6<b> v6Var2, int[] iArr) {
            zi.l0.d(v6Var.size() == iArr.length);
            this.f139116e = v6Var;
            this.f139117f = v6Var2;
            this.f139118g = iArr;
            this.f139119h = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f139119h[iArr[i10]] = i10;
            }
        }

        @Override // u4.y4
        public int h(boolean z10) {
            if (z()) {
                return -1;
            }
            if (z10) {
                return this.f139118g[0];
            }
            return 0;
        }

        @Override // u4.y4
        public int i(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // u4.y4
        public int j(boolean z10) {
            if (z()) {
                return -1;
            }
            return z10 ? this.f139118g[y() - 1] : y() - 1;
        }

        @Override // u4.y4
        public int l(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != j(z10)) {
                return z10 ? this.f139118g[this.f139119h[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return h(z10);
            }
            return -1;
        }

        @Override // u4.y4
        public b n(int i10, b bVar, boolean z10) {
            b bVar2 = this.f139117f.get(i10);
            bVar.x(bVar2.f139109a, bVar2.f139110b, bVar2.f139111c, bVar2.f139112d, bVar2.f139113e, bVar2.f139115g, bVar2.f139114f);
            return bVar;
        }

        @Override // u4.y4
        public int p() {
            return this.f139117f.size();
        }

        @Override // u4.y4
        public int u(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != h(z10)) {
                return z10 ? this.f139118g[this.f139119h[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return j(z10);
            }
            return -1;
        }

        @Override // u4.y4
        public Object v(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // u4.y4
        public d x(int i10, d dVar, long j10) {
            d dVar2 = this.f139116e.get(i10);
            dVar.k(dVar2.f139130a, dVar2.f139132c, dVar2.f139133d, dVar2.f139134e, dVar2.f139135f, dVar2.f139136g, dVar2.f139137h, dVar2.f139138i, dVar2.f139139j, dVar2.f139141l, dVar2.f139142m, dVar2.f139143n, dVar2.f139144o, dVar2.f139145p);
            dVar.f139140k = dVar2.f139140k;
            return dVar;
        }

        @Override // u4.y4
        public int y() {
            return this.f139116e.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        @x4.m1
        @Deprecated
        public Object f139131b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Object f139133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f139134e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f139135f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f139136g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f139137h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f139138i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public c1.g f139139j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f139140k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @x4.m1
        public long f139141l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @x4.m1
        public long f139142m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f139143n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f139144o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @x4.m1
        public long f139145p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Object f139120q = new Object();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final Object f139121r = new Object();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final c1 f139122s = new c1.c().E("androidx.media3.common.Timeline").M(Uri.EMPTY).a();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f139123t = x4.b2.k1(1);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String f139124u = x4.b2.k1(2);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f139125v = x4.b2.k1(3);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String f139126w = x4.b2.k1(4);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f139127x = x4.b2.k1(5);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f139128y = x4.b2.k1(6);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f139129z = x4.b2.k1(7);
        public static final String A = x4.b2.k1(8);
        public static final String B = x4.b2.k1(9);
        public static final String C = x4.b2.k1(10);
        public static final String D = x4.b2.k1(11);
        public static final String E = x4.b2.k1(12);
        public static final String F = x4.b2.k1(13);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f139130a = f139120q;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c1 f139132c = f139122s;

        @x4.m1
        @Deprecated
        public static d a(Bundle bundle) {
            return b(bundle, 9);
        }

        @x4.m1
        public static d b(Bundle bundle, int i10) {
            Bundle bundle2 = bundle.getBundle(f139123t);
            c1 c1VarC = bundle2 != null ? c1.c(bundle2, i10) : c1.f138136j;
            long j10 = bundle.getLong(f139124u, -9223372036854775807L);
            long j11 = bundle.getLong(f139125v, -9223372036854775807L);
            long j12 = bundle.getLong(f139126w, -9223372036854775807L);
            boolean z10 = bundle.getBoolean(f139127x, false);
            boolean z11 = bundle.getBoolean(f139128y, false);
            Bundle bundle3 = bundle.getBundle(f139129z);
            c1.g gVarB = bundle3 != null ? c1.g.b(bundle3) : null;
            boolean z12 = bundle.getBoolean(A, false);
            long j13 = bundle.getLong(B, 0L);
            long j14 = bundle.getLong(C, -9223372036854775807L);
            int i11 = bundle.getInt(D, 0);
            int i12 = bundle.getInt(E, 0);
            long j15 = bundle.getLong(F, 0L);
            d dVar = new d();
            dVar.k(f139121r, c1VarC, null, j10, j11, j12, z10, z11, gVarB, j13, j14, i11, i12, j15);
            dVar.f139140k = z12;
            return dVar;
        }

        public long c() {
            return x4.b2.G0(this.f139136g);
        }

        public long d() {
            return x4.b2.Q2(this.f139141l);
        }

        public long e() {
            return this.f139141l;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class.equals(obj.getClass())) {
                d dVar = (d) obj;
                if (Objects.equals(this.f139130a, dVar.f139130a) && Objects.equals(this.f139132c, dVar.f139132c) && Objects.equals(this.f139133d, dVar.f139133d) && Objects.equals(this.f139139j, dVar.f139139j) && this.f139134e == dVar.f139134e && this.f139135f == dVar.f139135f && this.f139136g == dVar.f139136g && this.f139137h == dVar.f139137h && this.f139138i == dVar.f139138i && this.f139140k == dVar.f139140k && this.f139141l == dVar.f139141l && this.f139142m == dVar.f139142m && this.f139143n == dVar.f139143n && this.f139144o == dVar.f139144o && this.f139145p == dVar.f139145p) {
                    return true;
                }
            }
            return false;
        }

        public long f() {
            return x4.b2.Q2(this.f139142m);
        }

        public long g() {
            return this.f139142m;
        }

        public long h() {
            return x4.b2.Q2(this.f139145p);
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f139130a.hashCode()) * 31) + this.f139132c.hashCode()) * 31;
            Object obj = this.f139133d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            c1.g gVar = this.f139139j;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f139134e;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f139135f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f139136g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f139137h ? 1 : 0)) * 31) + (this.f139138i ? 1 : 0)) * 31) + (this.f139140k ? 1 : 0)) * 31;
            long j13 = this.f139141l;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f139142m;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f139143n) * 31) + this.f139144o) * 31;
            long j15 = this.f139145p;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }

        public long i() {
            return this.f139145p;
        }

        public boolean j() {
            return this.f139139j != null;
        }

        @qj.a
        @x4.m1
        public d k(Object obj, @Nullable c1 c1Var, @Nullable Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, @Nullable c1.g gVar, long j13, long j14, int i10, int i11, long j15) {
            c1.h hVar;
            this.f139130a = obj;
            this.f139132c = c1Var != null ? c1Var : f139122s;
            this.f139131b = (c1Var == null || (hVar = c1Var.f138144b) == null) ? null : hVar.f138253i;
            this.f139133d = obj2;
            this.f139134e = j10;
            this.f139135f = j11;
            this.f139136g = j12;
            this.f139137h = z10;
            this.f139138i = z11;
            this.f139139j = gVar;
            this.f139141l = j13;
            this.f139142m = j14;
            this.f139143n = i10;
            this.f139144o = i11;
            this.f139145p = j15;
            this.f139140k = false;
            return this;
        }

        @x4.m1
        @Deprecated
        public Bundle l() {
            return m(9);
        }

        @x4.m1
        public Bundle m(int i10) {
            Bundle bundle = new Bundle();
            if (!c1.f138136j.equals(this.f139132c)) {
                bundle.putBundle(f139123t, this.f139132c.g(i10));
            }
            long j10 = this.f139134e;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f139124u, j10);
            }
            long j11 = this.f139135f;
            if (j11 != -9223372036854775807L) {
                bundle.putLong(f139125v, j11);
            }
            long j12 = this.f139136g;
            if (j12 != -9223372036854775807L) {
                bundle.putLong(f139126w, j12);
            }
            boolean z10 = this.f139137h;
            if (z10) {
                bundle.putBoolean(f139127x, z10);
            }
            boolean z11 = this.f139138i;
            if (z11) {
                bundle.putBoolean(f139128y, z11);
            }
            c1.g gVar = this.f139139j;
            if (gVar != null) {
                bundle.putBundle(f139129z, gVar.c());
            }
            boolean z12 = this.f139140k;
            if (z12) {
                bundle.putBoolean(A, z12);
            }
            long j13 = this.f139141l;
            if (j13 != 0) {
                bundle.putLong(B, j13);
            }
            long j14 = this.f139142m;
            if (j14 != -9223372036854775807L) {
                bundle.putLong(C, j14);
            }
            int i11 = this.f139143n;
            if (i11 != 0) {
                bundle.putInt(D, i11);
            }
            int i12 = this.f139144o;
            if (i12 != 0) {
                bundle.putInt(E, i12);
            }
            long j15 = this.f139145p;
            if (j15 != 0) {
                bundle.putLong(F, j15);
            }
            return bundle;
        }
    }

    @x4.m1
    public y4() {
    }

    @x4.m1
    @Deprecated
    public static y4 d(Bundle bundle) {
        return e(bundle, 9);
    }

    @x4.m1
    public static y4 e(Bundle bundle, final int i10) {
        v6 v6VarF = f(new zi.t() { // from class: u4.w4
            @Override // zi.t
            public final Object apply(Object obj) {
                return y4.d.b((Bundle) obj, i10);
            }
        }, bundle.getBinder(f139101b));
        v6 v6VarF2 = f(new zi.t() { // from class: u4.x4
            @Override // zi.t
            public final Object apply(Object obj) {
                return y4.b.b((Bundle) obj, i10);
            }
        }, bundle.getBinder(f139102c));
        int[] intArray = bundle.getIntArray(f139103d);
        if (intArray == null) {
            intArray = g(v6VarF.size());
        }
        return new c(v6VarF, v6VarF2, intArray);
    }

    public static <T> v6<T> f(zi.t<Bundle, T> tVar, @Nullable IBinder iBinder) {
        return iBinder == null ? v6.z() : x4.j.d(tVar, p.a(iBinder));
    }

    public static int[] g(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    public final boolean A(int i10, b bVar, d dVar, int i11, boolean z10) {
        return k(i10, bVar, dVar, i11, z10) == -1;
    }

    @x4.m1
    @Deprecated
    public final Bundle B() {
        return C(9);
    }

    @x4.m1
    public final Bundle C(int i10) {
        ArrayList arrayList = new ArrayList();
        int iY = y();
        d dVar = new d();
        for (int i11 = 0; i11 < iY; i11++) {
            arrayList.add(x(i11, dVar, 0L).m(i10));
        }
        ArrayList arrayList2 = new ArrayList();
        int iP = p();
        b bVar = new b();
        for (int i12 = 0; i12 < iP; i12++) {
            arrayList2.add(n(i12, bVar, false).z(i10));
        }
        int[] iArr = new int[iY];
        if (iY > 0) {
            iArr[0] = h(true);
        }
        for (int i13 = 1; i13 < iY; i13++) {
            iArr[i13] = l(iArr[i13 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        bundle.putBinder(f139101b, new p(arrayList));
        bundle.putBinder(f139102c, new p(arrayList2));
        bundle.putIntArray(f139103d, iArr);
        return bundle;
    }

    @x4.m1
    public final y4 c(int i10) {
        if (y() == 1) {
            return this;
        }
        d dVarX = x(i10, new d(), 0L);
        v6.a aVarQ = v6.q();
        int i11 = dVarX.f139143n;
        while (true) {
            int i12 = dVarX.f139144o;
            if (i11 > i12) {
                dVarX.f139144o = i12 - dVarX.f139143n;
                dVarX.f139143n = 0;
                return new c(v6.A(dVarX), aVarQ.e(), new int[]{0});
            }
            b bVarN = n(i11, new b(), true);
            bVarN.f139111c = 0;
            aVarQ.g(bVarN);
            i11++;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int iJ;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        if (y4Var.y() != y() || y4Var.p() != p()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < y(); i10++) {
            if (!w(i10, dVar).equals(y4Var.w(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < p(); i11++) {
            if (!n(i11, bVar, true).equals(y4Var.n(i11, bVar2, true))) {
                return false;
            }
        }
        int iH = h(true);
        if (iH != y4Var.h(true) || (iJ = j(true)) != y4Var.j(true)) {
            return false;
        }
        while (iH != iJ) {
            int iL = l(iH, 0, true);
            if (iL != y4Var.l(iH, 0, true)) {
                return false;
            }
            iH = iL;
        }
        return true;
    }

    public int h(boolean z10) {
        return z() ? -1 : 0;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iY = 217 + y();
        for (int i10 = 0; i10 < y(); i10++) {
            iY = (iY * 31) + w(i10, dVar).hashCode();
        }
        int iP = (iY * 31) + p();
        for (int i11 = 0; i11 < p(); i11++) {
            iP = (iP * 31) + n(i11, bVar, true).hashCode();
        }
        int iH = h(true);
        while (iH != -1) {
            iP = (iP * 31) + iH;
            iH = l(iH, 0, true);
        }
        return iP;
    }

    public abstract int i(Object obj);

    public int j(boolean z10) {
        if (z()) {
            return -1;
        }
        return y() - 1;
    }

    public final int k(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = m(i10, bVar).f139111c;
        if (w(i12, dVar).f139144o != i10) {
            return i10 + 1;
        }
        int iL = l(i12, i11, z10);
        if (iL == -1) {
            return -1;
        }
        return w(iL, dVar).f139143n;
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == j(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == j(z10) ? h(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final b m(int i10, b bVar) {
        return n(i10, bVar, false);
    }

    public abstract b n(int i10, b bVar, boolean z10);

    public b o(Object obj, b bVar) {
        return n(i(obj), bVar, true);
    }

    public abstract int p();

    @qj.m(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    @x4.m1
    @Deprecated
    public final Pair<Object, Long> q(d dVar, b bVar, int i10, long j10) {
        return s(dVar, bVar, i10, j10);
    }

    @qj.m(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    @x4.m1
    @Deprecated
    @Nullable
    public final Pair<Object, Long> r(d dVar, b bVar, int i10, long j10, long j11) {
        return t(dVar, bVar, i10, j10, j11);
    }

    public final Pair<Object, Long> s(d dVar, b bVar, int i10, long j10) {
        return (Pair) zi.l0.E(t(dVar, bVar, i10, j10, 0L));
    }

    @Nullable
    public final Pair<Object, Long> t(d dVar, b bVar, int i10, long j10, long j11) {
        zi.l0.C(i10, y());
        x(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.e();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f139143n;
        m(i11, bVar);
        while (i11 < dVar.f139144o && bVar.f139113e != j10) {
            int i12 = i11 + 1;
            if (m(i12, bVar).f139113e > j10) {
                break;
            }
            i11 = i12;
        }
        n(i11, bVar, true);
        long jMin = j10 - bVar.f139113e;
        long j12 = bVar.f139112d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(zi.l0.E(bVar.f139110b), Long.valueOf(Math.max(0L, jMin)));
    }

    public int u(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == h(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == h(z10) ? j(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object v(int i10);

    public final d w(int i10, d dVar) {
        return x(i10, dVar, 0L);
    }

    public abstract d x(int i10, d dVar, long j10);

    public abstract int y();

    public final boolean z() {
        return y() == 0;
    }
}
