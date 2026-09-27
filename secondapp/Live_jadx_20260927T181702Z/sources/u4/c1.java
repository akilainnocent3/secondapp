package u4;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import cj.v6;
import cj.x6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f138135i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c1 f138136j = new c().a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f138137k = x4.b2.k1(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f138138l = x4.b2.k1(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f138139m = x4.b2.k1(2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f138140n = x4.b2.k1(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f138141o = x4.b2.k1(4);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f138142p = x4.b2.k1(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final h f138144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    @x4.m1
    @Deprecated
    public final h f138145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f138146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f138147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f138148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @x4.m1
    @Deprecated
    public final e f138149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f138150h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f138151c = x4.b2.k1(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f138152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Object f138153b;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Uri f138154a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public Object f138155b;

            public a(Uri uri) {
                this.f138154a = uri;
            }

            public b c() {
                return new b(this);
            }

            @qj.a
            public a d(Uri uri) {
                this.f138154a = uri;
                return this;
            }

            @qj.a
            public a e(@Nullable Object obj) {
                this.f138155b = obj;
                return this;
            }
        }

        @x4.m1
        public static b b(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(f138151c);
            zi.l0.E(uri);
            return new a(uri).c();
        }

        public a a() {
            return new a(this.f138152a).e(this.f138153b);
        }

        @x4.m1
        public Bundle c() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f138151c, this.f138152a);
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f138152a.equals(bVar.f138152a) && Objects.equals(this.f138153b, bVar.f138153b);
        }

        public int hashCode() {
            int iHashCode = this.f138152a.hashCode() * 31;
            Object obj = this.f138153b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        public b(a aVar) {
            this.f138152a = aVar.f138154a;
            this.f138153b = aVar.f138155b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f138156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Uri f138157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f138158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d.a f138159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f.a f138160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<StreamKey> f138161f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public String f138162g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public v6<k> f138163h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public b f138164i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public Object f138165j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f138166k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public i1 f138167l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public g.a f138168m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public i f138169n;

        @qj.a
        @x4.m1
        @Deprecated
        public c A(float f10) {
            this.f138168m.h(f10);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c B(long j10) {
            this.f138168m.i(j10);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c C(float f10) {
            this.f138168m.j(f10);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c D(long j10) {
            this.f138168m.k(j10);
            return this;
        }

        @qj.a
        public c E(String str) {
            this.f138156a = (String) zi.l0.E(str);
            return this;
        }

        @qj.a
        public c F(i1 i1Var) {
            this.f138167l = i1Var;
            return this;
        }

        @qj.a
        public c G(@Nullable String str) {
            this.f138158c = str;
            return this;
        }

        @qj.a
        public c H(i iVar) {
            this.f138169n = iVar;
            return this;
        }

        @qj.a
        @x4.m1
        public c I(@Nullable List<StreamKey> list) {
            this.f138161f = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        @qj.a
        public c J(List<k> list) {
            this.f138163h = v6.u(list);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c K(@Nullable List<j> list) {
            this.f138163h = list != null ? v6.u(list) : v6.z();
            return this;
        }

        @qj.a
        public c L(@Nullable Object obj) {
            this.f138165j = obj;
            return this;
        }

        @qj.a
        public c M(@Nullable Uri uri) {
            this.f138157b = uri;
            return this;
        }

        @qj.a
        public c N(@Nullable String str) {
            return M(str == null ? null : Uri.parse(str));
        }

        public c1 a() {
            h hVar;
            zi.l0.g0(this.f138160e.f138214b == null || this.f138160e.f138213a != null);
            Uri uri = this.f138157b;
            if (uri != null) {
                hVar = new h(uri, this.f138158c, this.f138160e.f138213a != null ? this.f138160e.j() : null, this.f138164i, this.f138161f, this.f138162g, this.f138163h, this.f138165j, this.f138166k);
            } else {
                hVar = null;
            }
            String str = this.f138156a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarH = this.f138159d.h();
            g gVarF = this.f138168m.f();
            i1 i1Var = this.f138167l;
            if (i1Var == null) {
                i1Var = i1.Z0;
            }
            return new c1(str2, eVarH, hVar, gVarF, i1Var, this.f138169n);
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c b(@Nullable Uri uri) {
            return c(uri, null);
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c c(@Nullable Uri uri, @Nullable Object obj) {
            this.f138164i = uri != null ? new b.a(uri).e(obj).c() : null;
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c d(@Nullable String str) {
            return b(str != null ? Uri.parse(str) : null);
        }

        @qj.a
        public c e(@Nullable b bVar) {
            this.f138164i = bVar;
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c f(long j10) {
            this.f138159d.j(j10);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c g(boolean z10) {
            this.f138159d.l(z10);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c h(boolean z10) {
            this.f138159d.m(z10);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c i(@k.e0(from = 0) long j10) {
            this.f138159d.n(j10);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c j(boolean z10) {
            this.f138159d.p(z10);
            return this;
        }

        @qj.a
        public c k(d dVar) {
            this.f138159d = dVar.a();
            return this;
        }

        @qj.a
        @x4.m1
        public c l(@Nullable String str) {
            this.f138162g = str;
            return this;
        }

        @qj.a
        public c m(@Nullable f fVar) {
            this.f138160e = fVar != null ? fVar.b() : new f.a();
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c n(boolean z10) {
            this.f138160e.l(z10);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c o(@Nullable byte[] bArr) {
            this.f138160e.o(bArr);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c p(@Nullable Map<String, String> map) {
            f.a aVar = this.f138160e;
            if (map == null) {
                map = x6.y();
            }
            aVar.p(map);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c q(@Nullable Uri uri) {
            this.f138160e.q(uri);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c r(@Nullable String str) {
            this.f138160e.r(str);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c s(boolean z10) {
            this.f138160e.s(z10);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c t(boolean z10) {
            this.f138160e.u(z10);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c u(boolean z10) {
            this.f138160e.m(z10);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c v(@Nullable List<Integer> list) {
            f.a aVar = this.f138160e;
            if (list == null) {
                list = v6.z();
            }
            aVar.n(list);
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c w(@Nullable UUID uuid) {
            this.f138160e.t(uuid);
            return this;
        }

        @qj.a
        @x4.m1
        public c x(long j10) {
            zi.l0.d(j10 > 0 || j10 == -9223372036854775807L);
            this.f138166k = j10;
            return this;
        }

        @qj.a
        public c y(g gVar) {
            this.f138168m = gVar.a();
            return this;
        }

        @qj.a
        @x4.m1
        @Deprecated
        public c z(long j10) {
            this.f138168m.g(j10);
            return this;
        }

        public c() {
            this.f138159d = new d.a();
            this.f138160e = new f.a();
            this.f138161f = Collections.EMPTY_LIST;
            this.f138163h = v6.z();
            this.f138168m = new g.a();
            this.f138169n = i.f138255d;
            this.f138166k = -9223372036854775807L;
        }

        public c(c1 c1Var) {
            f.a aVar;
            this();
            this.f138159d = c1Var.f138148f.a();
            this.f138156a = c1Var.f138143a;
            this.f138167l = c1Var.f138147e;
            this.f138168m = c1Var.f138146d.a();
            this.f138169n = c1Var.f138150h;
            h hVar = c1Var.f138144b;
            if (hVar != null) {
                this.f138162g = hVar.f138250f;
                this.f138158c = hVar.f138246b;
                this.f138157b = hVar.f138245a;
                this.f138161f = hVar.f138249e;
                this.f138163h = hVar.f138251g;
                this.f138165j = hVar.f138253i;
                f fVar = hVar.f138247c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f138160e = aVar;
                this.f138164i = hVar.f138248d;
                this.f138166k = hVar.f138254j;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f138170i = new a().g();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f138171j = x4.b2.k1(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f138172k = x4.b2.k1(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f138173l = x4.b2.k1(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f138174m = x4.b2.k1(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f138175n = x4.b2.k1(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @k.h1
        public static final String f138176o = x4.b2.k1(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @k.h1
        public static final String f138177p = x4.b2.k1(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f138178q = x4.b2.k1(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @k.e0(from = 0)
        public final long f138179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x4.m1
        @k.e0(from = 0)
        public final long f138180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f138181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @x4.m1
        public final long f138182d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f138183e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f138184f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f138185g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @x4.m1
        public final boolean f138186h;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f138187a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f138188b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f138189c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f138190d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f138191e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f138192f;

            public d g() {
                return new d(this);
            }

            @x4.m1
            @Deprecated
            public e h() {
                return new e(this);
            }

            @qj.a
            @x4.m1
            public a i(boolean z10) {
                this.f138192f = z10;
                return this;
            }

            @qj.a
            public a j(long j10) {
                return k(x4.b2.N1(j10));
            }

            @qj.a
            @x4.m1
            public a k(long j10) {
                zi.l0.d(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f138188b = j10;
                return this;
            }

            @qj.a
            public a l(boolean z10) {
                this.f138190d = z10;
                return this;
            }

            @qj.a
            public a m(boolean z10) {
                this.f138189c = z10;
                return this;
            }

            @qj.a
            public a n(@k.e0(from = 0) long j10) {
                return o(x4.b2.N1(j10));
            }

            @qj.a
            @x4.m1
            public a o(@k.e0(from = 0) long j10) {
                zi.l0.d(j10 >= 0);
                this.f138187a = j10;
                return this;
            }

            @qj.a
            public a p(boolean z10) {
                this.f138191e = z10;
                return this;
            }

            public a() {
                this.f138188b = Long.MIN_VALUE;
            }

            public a(d dVar) {
                this.f138187a = dVar.f138180b;
                this.f138188b = dVar.f138182d;
                this.f138189c = dVar.f138183e;
                this.f138190d = dVar.f138184f;
                this.f138191e = dVar.f138185g;
                this.f138192f = dVar.f138186h;
            }
        }

        @x4.m1
        public static e b(Bundle bundle) {
            a aVar = new a();
            String str = f138171j;
            d dVar = f138170i;
            a aVarI = aVar.n(bundle.getLong(str, dVar.f138179a)).j(bundle.getLong(f138172k, dVar.f138181c)).m(bundle.getBoolean(f138173l, dVar.f138183e)).l(bundle.getBoolean(f138174m, dVar.f138184f)).p(bundle.getBoolean(f138175n, dVar.f138185g)).i(bundle.getBoolean(f138178q, dVar.f138186h));
            long j10 = bundle.getLong(f138176o, dVar.f138180b);
            if (j10 != dVar.f138180b) {
                aVarI.o(j10);
            }
            long j11 = bundle.getLong(f138177p, dVar.f138182d);
            if (j11 != dVar.f138182d) {
                aVarI.k(j11);
            }
            return aVarI.h();
        }

        public a a() {
            return new a();
        }

        @x4.m1
        public Bundle c() {
            Bundle bundle = new Bundle();
            long j10 = this.f138179a;
            d dVar = f138170i;
            if (j10 != dVar.f138179a) {
                bundle.putLong(f138171j, j10);
            }
            long j11 = this.f138181c;
            if (j11 != dVar.f138181c) {
                bundle.putLong(f138172k, j11);
            }
            long j12 = this.f138180b;
            if (j12 != dVar.f138180b) {
                bundle.putLong(f138176o, j12);
            }
            long j13 = this.f138182d;
            if (j13 != dVar.f138182d) {
                bundle.putLong(f138177p, j13);
            }
            boolean z10 = this.f138183e;
            if (z10 != dVar.f138183e) {
                bundle.putBoolean(f138173l, z10);
            }
            boolean z11 = this.f138184f;
            if (z11 != dVar.f138184f) {
                bundle.putBoolean(f138174m, z11);
            }
            boolean z12 = this.f138185g;
            if (z12 != dVar.f138185g) {
                bundle.putBoolean(f138175n, z12);
            }
            boolean z13 = this.f138186h;
            if (z13 != dVar.f138186h) {
                bundle.putBoolean(f138178q, z13);
            }
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f138180b == dVar.f138180b && this.f138182d == dVar.f138182d && this.f138183e == dVar.f138183e && this.f138184f == dVar.f138184f && this.f138185g == dVar.f138185g && this.f138186h == dVar.f138186h;
        }

        public int hashCode() {
            long j10 = this.f138180b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f138182d;
            return ((((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f138183e ? 1 : 0)) * 31) + (this.f138184f ? 1 : 0)) * 31) + (this.f138185g ? 1 : 0)) * 31) + (this.f138186h ? 1 : 0);
        }

        public d(a aVar) {
            this.f138179a = x4.b2.Q2(aVar.f138187a);
            this.f138181c = x4.b2.Q2(aVar.f138188b);
            this.f138180b = aVar.f138187a;
            this.f138182d = aVar.f138188b;
            this.f138183e = aVar.f138189c;
            this.f138184f = aVar.f138190d;
            this.f138185g = aVar.f138191e;
            this.f138186h = aVar.f138192f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @x4.m1
    @Deprecated
    public static final class e extends d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final e f138193r = new d.a().h();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f138194l = x4.b2.k1(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f138195m = x4.b2.k1(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f138196n = x4.b2.k1(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f138197o = x4.b2.k1(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @k.h1
        public static final String f138198p = x4.b2.k1(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f138199q = x4.b2.k1(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f138200r = x4.b2.k1(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f138201s = x4.b2.k1(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f138202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x4.m1
        @Deprecated
        public final UUID f138203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Uri f138204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @x4.m1
        @Deprecated
        public final x6<String, String> f138205d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final x6<String, String> f138206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f138207f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f138208g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f138209h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @x4.m1
        @Deprecated
        public final v6<Integer> f138210i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final v6<Integer> f138211j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final byte[] f138212k;

        @x4.m1
        public static f c(Bundle bundle) {
            UUID uuidFromString = UUID.fromString((String) zi.l0.E(bundle.getString(f138194l)));
            Uri uri = (Uri) bundle.getParcelable(f138195m);
            x6<String, String> x6VarB = x4.j.b(x4.j.f(bundle, f138196n, Bundle.EMPTY));
            boolean z10 = bundle.getBoolean(f138197o, false);
            boolean z11 = bundle.getBoolean(f138198p, false);
            boolean z12 = bundle.getBoolean(f138199q, false);
            v6 v6VarU = v6.u(x4.j.g(bundle, f138200r, new ArrayList()));
            return new a(uuidFromString).q(uri).p(x6VarB).s(z10).l(z12).u(z11).n(v6VarU).o(bundle.getByteArray(f138201s)).j();
        }

        public a b() {
            return new a();
        }

        @Nullable
        public byte[] d() {
            byte[] bArr = this.f138212k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        @x4.m1
        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putString(f138194l, this.f138202a.toString());
            Uri uri = this.f138204c;
            if (uri != null) {
                bundle.putParcelable(f138195m, uri);
            }
            if (!this.f138206e.isEmpty()) {
                bundle.putBundle(f138196n, x4.j.h(this.f138206e));
            }
            boolean z10 = this.f138207f;
            if (z10) {
                bundle.putBoolean(f138197o, z10);
            }
            boolean z11 = this.f138208g;
            if (z11) {
                bundle.putBoolean(f138198p, z11);
            }
            boolean z12 = this.f138209h;
            if (z12) {
                bundle.putBoolean(f138199q, z12);
            }
            if (!this.f138211j.isEmpty()) {
                bundle.putIntegerArrayList(f138200r, new ArrayList<>(this.f138211j));
            }
            byte[] bArr = this.f138212k;
            if (bArr != null) {
                bundle.putByteArray(f138201s, bArr);
            }
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f138202a.equals(fVar.f138202a) && Objects.equals(this.f138204c, fVar.f138204c) && Objects.equals(this.f138206e, fVar.f138206e) && this.f138207f == fVar.f138207f && this.f138209h == fVar.f138209h && this.f138208g == fVar.f138208g && this.f138211j.equals(fVar.f138211j) && Arrays.equals(this.f138212k, fVar.f138212k);
        }

        public int hashCode() {
            int iHashCode = this.f138202a.hashCode() * 31;
            Uri uri = this.f138204c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f138206e.hashCode()) * 31) + (this.f138207f ? 1 : 0)) * 31) + (this.f138209h ? 1 : 0)) * 31) + (this.f138208g ? 1 : 0)) * 31) + this.f138211j.hashCode()) * 31) + Arrays.hashCode(this.f138212k);
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public UUID f138213a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public Uri f138214b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public x6<String, String> f138215c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f138216d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f138217e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f138218f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public v6<Integer> f138219g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            @Nullable
            public byte[] f138220h;

            public f j() {
                return new f(this);
            }

            @qj.m(replacement = "this.setForceSessionsForAudioAndVideoTracks(forceSessionsForAudioAndVideoTracks)")
            @x4.m1
            @Deprecated
            @qj.a
            public a k(boolean z10) {
                return m(z10);
            }

            @qj.a
            public a l(boolean z10) {
                this.f138218f = z10;
                return this;
            }

            @qj.a
            public a m(boolean z10) {
                n(z10 ? v6.B(2, 1) : v6.z());
                return this;
            }

            @qj.a
            public a n(List<Integer> list) {
                this.f138219g = v6.u(list);
                return this;
            }

            @qj.a
            public a o(@Nullable byte[] bArr) {
                this.f138220h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            @qj.a
            public a p(Map<String, String> map) {
                this.f138215c = x6.m(map);
                return this;
            }

            @qj.a
            public a q(@Nullable Uri uri) {
                this.f138214b = uri;
                return this;
            }

            @qj.a
            public a r(@Nullable String str) {
                this.f138214b = str == null ? null : Uri.parse(str);
                return this;
            }

            @qj.a
            public a s(boolean z10) {
                this.f138216d = z10;
                return this;
            }

            @qj.a
            @Deprecated
            public final a t(@Nullable UUID uuid) {
                this.f138213a = uuid;
                return this;
            }

            @qj.a
            public a u(boolean z10) {
                this.f138217e = z10;
                return this;
            }

            @qj.a
            public a v(UUID uuid) {
                this.f138213a = uuid;
                return this;
            }

            public a(UUID uuid) {
                this();
                this.f138213a = uuid;
            }

            @Deprecated
            public a() {
                this.f138215c = x6.y();
                this.f138217e = true;
                this.f138219g = v6.z();
            }

            public a(f fVar) {
                this.f138213a = fVar.f138202a;
                this.f138214b = fVar.f138204c;
                this.f138215c = fVar.f138206e;
                this.f138216d = fVar.f138207f;
                this.f138217e = fVar.f138208g;
                this.f138218f = fVar.f138209h;
                this.f138219g = fVar.f138211j;
                this.f138220h = fVar.f138212k;
            }
        }

        public f(a aVar) {
            zi.l0.g0((aVar.f138218f && aVar.f138214b == null) ? false : true);
            UUID uuid = (UUID) zi.l0.E(aVar.f138213a);
            this.f138202a = uuid;
            this.f138203b = uuid;
            this.f138204c = aVar.f138214b;
            this.f138205d = aVar.f138215c;
            this.f138206e = aVar.f138215c;
            this.f138207f = aVar.f138216d;
            this.f138209h = aVar.f138218f;
            this.f138208g = aVar.f138217e;
            this.f138210i = aVar.f138219g;
            this.f138211j = aVar.f138219g;
            this.f138212k = aVar.f138220h != null ? Arrays.copyOf(aVar.f138220h, aVar.f138220h.length) : null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f138221f = new a().f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f138222g = x4.b2.k1(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f138223h = x4.b2.k1(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f138224i = x4.b2.k1(2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f138225j = x4.b2.k1(3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f138226k = x4.b2.k1(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f138227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f138228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f138229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f138230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f138231e;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f138232a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f138233b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f138234c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public float f138235d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float f138236e;

            public g f() {
                return new g(this);
            }

            @qj.a
            public a g(long j10) {
                this.f138234c = j10;
                return this;
            }

            @qj.a
            public a h(float f10) {
                this.f138236e = f10;
                return this;
            }

            @qj.a
            public a i(long j10) {
                this.f138233b = j10;
                return this;
            }

            @qj.a
            public a j(float f10) {
                this.f138235d = f10;
                return this;
            }

            @qj.a
            public a k(long j10) {
                this.f138232a = j10;
                return this;
            }

            public a() {
                this.f138232a = -9223372036854775807L;
                this.f138233b = -9223372036854775807L;
                this.f138234c = -9223372036854775807L;
                this.f138235d = -3.4028235E38f;
                this.f138236e = -3.4028235E38f;
            }

            public a(g gVar) {
                this.f138232a = gVar.f138227a;
                this.f138233b = gVar.f138228b;
                this.f138234c = gVar.f138229c;
                this.f138235d = gVar.f138230d;
                this.f138236e = gVar.f138231e;
            }
        }

        @x4.m1
        public static g b(Bundle bundle) {
            a aVar = new a();
            String str = f138222g;
            g gVar = f138221f;
            return aVar.k(bundle.getLong(str, gVar.f138227a)).i(bundle.getLong(f138223h, gVar.f138228b)).g(bundle.getLong(f138224i, gVar.f138229c)).j(bundle.getFloat(f138225j, gVar.f138230d)).h(bundle.getFloat(f138226k, gVar.f138231e)).f();
        }

        public a a() {
            return new a();
        }

        @x4.m1
        public Bundle c() {
            Bundle bundle = new Bundle();
            long j10 = this.f138227a;
            g gVar = f138221f;
            if (j10 != gVar.f138227a) {
                bundle.putLong(f138222g, j10);
            }
            long j11 = this.f138228b;
            if (j11 != gVar.f138228b) {
                bundle.putLong(f138223h, j11);
            }
            long j12 = this.f138229c;
            if (j12 != gVar.f138229c) {
                bundle.putLong(f138224i, j12);
            }
            float f10 = this.f138230d;
            if (f10 != gVar.f138230d) {
                bundle.putFloat(f138225j, f10);
            }
            float f11 = this.f138231e;
            if (f11 != gVar.f138231e) {
                bundle.putFloat(f138226k, f11);
            }
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f138227a == gVar.f138227a && this.f138228b == gVar.f138228b && this.f138229c == gVar.f138229c && this.f138230d == gVar.f138230d && this.f138231e == gVar.f138231e;
        }

        public int hashCode() {
            long j10 = this.f138227a;
            long j11 = this.f138228b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f138229c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f138230d;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f138231e;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        public g(a aVar) {
            this(aVar.f138232a, aVar.f138233b, aVar.f138234c, aVar.f138235d, aVar.f138236e);
        }

        @x4.m1
        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f138227a = j10;
            this.f138228b = j11;
            this.f138229c = j12;
            this.f138230d = f10;
            this.f138231e = f11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f138237k = x4.b2.k1(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f138238l = x4.b2.k1(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f138239m = x4.b2.k1(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f138240n = x4.b2.k1(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f138241o = x4.b2.k1(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f138242p = x4.b2.k1(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f138243q = x4.b2.k1(6);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f138244r = x4.b2.k1(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f138245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f138246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final f f138247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final b f138248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @x4.m1
        public final List<StreamKey> f138249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        @x4.m1
        public final String f138250f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final v6<k> f138251g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @x4.m1
        @Deprecated
        public final List<j> f138252h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final Object f138253i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @x4.m1
        public final long f138254j;

        @x4.m1
        public static h a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f138239m);
            f fVarC = bundle2 == null ? null : f.c(bundle2);
            Bundle bundle3 = bundle.getBundle(f138240n);
            b bVarB = bundle3 != null ? b.b(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f138241o);
            v6 v6VarZ = parcelableArrayList == null ? v6.z() : x4.j.d(new zi.t() { // from class: u4.f1
                @Override // zi.t
                public final Object apply(Object obj) {
                    return StreamKey.b((Bundle) obj);
                }
            }, parcelableArrayList);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f138243q);
            return new h((Uri) zi.l0.E((Uri) bundle.getParcelable(f138237k)), bundle.getString(f138238l), fVarC, bVarB, v6VarZ, bundle.getString(f138242p), parcelableArrayList2 == null ? v6.z() : x4.j.d(new zi.t() { // from class: u4.g1
                @Override // zi.t
                public final Object apply(Object obj) {
                    return c1.k.b((Bundle) obj);
                }
            }, parcelableArrayList2), null, bundle.getLong(f138244r, -9223372036854775807L));
        }

        @x4.m1
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f138237k, this.f138245a);
            String str = this.f138246b;
            if (str != null) {
                bundle.putString(f138238l, str);
            }
            f fVar = this.f138247c;
            if (fVar != null) {
                bundle.putBundle(f138239m, fVar.e());
            }
            b bVar = this.f138248d;
            if (bVar != null) {
                bundle.putBundle(f138240n, bVar.c());
            }
            if (!this.f138249e.isEmpty()) {
                bundle.putParcelableArrayList(f138241o, x4.j.i(this.f138249e, new zi.t() { // from class: u4.d1
                    @Override // zi.t
                    public final Object apply(Object obj) {
                        return ((StreamKey) obj).c();
                    }
                }));
            }
            String str2 = this.f138250f;
            if (str2 != null) {
                bundle.putString(f138242p, str2);
            }
            if (!this.f138251g.isEmpty()) {
                bundle.putParcelableArrayList(f138243q, x4.j.i(this.f138251g, new zi.t() { // from class: u4.e1
                    @Override // zi.t
                    public final Object apply(Object obj) {
                        return ((c1.k) obj).c();
                    }
                }));
            }
            long j10 = this.f138254j;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f138244r, j10);
            }
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f138245a.equals(hVar.f138245a) && Objects.equals(this.f138246b, hVar.f138246b) && Objects.equals(this.f138247c, hVar.f138247c) && Objects.equals(this.f138248d, hVar.f138248d) && this.f138249e.equals(hVar.f138249e) && Objects.equals(this.f138250f, hVar.f138250f) && this.f138251g.equals(hVar.f138251g) && Objects.equals(this.f138253i, hVar.f138253i) && this.f138254j == hVar.f138254j;
        }

        public int hashCode() {
            int iHashCode = this.f138245a.hashCode() * 31;
            String str = this.f138246b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f138247c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f138248d;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f138249e.hashCode()) * 31;
            String str2 = this.f138250f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f138251g.hashCode()) * 31;
            Object obj = this.f138253i;
            return (int) ((((long) (iHashCode5 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f138254j);
        }

        public h(Uri uri, @Nullable String str, @Nullable f fVar, @Nullable b bVar, List<StreamKey> list, @Nullable String str2, v6<k> v6Var, @Nullable Object obj, long j10) {
            this.f138245a = uri;
            this.f138246b = l1.x(str);
            this.f138247c = fVar;
            this.f138248d = bVar;
            this.f138249e = list;
            this.f138250f = str2;
            this.f138251g = v6Var;
            v6.a aVarQ = v6.q();
            for (int i10 = 0; i10 < v6Var.size(); i10++) {
                aVarQ.g(v6Var.get(i10).a().j());
            }
            this.f138252h = aVarQ.e();
            this.f138253i = obj;
            this.f138254j = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f138255d = new a().d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f138256e = x4.b2.k1(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f138257f = x4.b2.k1(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f138258g = x4.b2.k1(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Uri f138259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f138260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Bundle f138261c;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public Uri f138262a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public String f138263b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public Bundle f138264c;

            public i d() {
                return new i(this);
            }

            @qj.a
            public a e(@Nullable Bundle bundle) {
                this.f138264c = bundle;
                return this;
            }

            @qj.a
            public a f(@Nullable Uri uri) {
                this.f138262a = uri;
                return this;
            }

            @qj.a
            public a g(@Nullable String str) {
                this.f138263b = str;
                return this;
            }

            public a() {
            }

            public a(i iVar) {
                this.f138262a = iVar.f138259a;
                this.f138263b = iVar.f138260b;
                this.f138264c = iVar.f138261c;
            }
        }

        @x4.m1
        public static i b(Bundle bundle) {
            return new a().f((Uri) bundle.getParcelable(f138256e)).g(bundle.getString(f138257f)).e(x4.b2.D(bundle.getBundle(f138258g))).d();
        }

        public a a() {
            return new a();
        }

        @x4.m1
        public Bundle c() {
            Bundle bundle = new Bundle();
            Uri uri = this.f138259a;
            if (uri != null) {
                bundle.putParcelable(f138256e, uri);
            }
            String str = this.f138260b;
            if (str != null) {
                bundle.putString(f138257f, str);
            }
            Bundle bundle2 = this.f138261c;
            if (bundle2 != null) {
                bundle.putBundle(f138258g, bundle2);
            }
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f138259a, iVar.f138259a) && Objects.equals(this.f138260b, iVar.f138260b)) {
                if ((this.f138261c == null) == (iVar.f138261c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f138259a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f138260b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f138261c != null ? 1 : 0);
        }

        public i(a aVar) {
            this.f138259a = aVar.f138262a;
            this.f138260b = aVar.f138263b;
            this.f138261c = aVar.f138264c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @x4.m1
    @Deprecated
    public static final class j extends k {
        @x4.m1
        @Deprecated
        public j(Uri uri, String str, @Nullable String str2) {
            this(uri, str, str2, 0);
        }

        @x4.m1
        @Deprecated
        public j(Uri uri, String str, @Nullable String str2, int i10) {
            this(uri, str, str2, i10, 0, null);
        }

        @x4.m1
        @Deprecated
        public j(Uri uri, String str, @Nullable String str2, int i10, int i11, @Nullable String str3) {
            super(uri, str, str2, i10, i11, str3, null);
        }

        public j(k.a aVar) {
            super(aVar);
        }
    }

    @x4.m1
    @Deprecated
    public static c1 b(Bundle bundle) {
        return c(bundle, 9);
    }

    @x4.m1
    public static c1 c(Bundle bundle, int i10) {
        String str = (String) zi.l0.E(bundle.getString(f138137k, ""));
        Bundle bundle2 = bundle.getBundle(f138138l);
        g gVarB = bundle2 == null ? g.f138221f : g.b(bundle2);
        Bundle bundle3 = bundle.getBundle(f138139m);
        i1 i1VarD = bundle3 == null ? i1.Z0 : i1.d(bundle3, i10);
        Bundle bundle4 = bundle.getBundle(f138140n);
        e eVarB = bundle4 == null ? e.f138193r : d.b(bundle4);
        Bundle bundle5 = bundle.getBundle(f138141o);
        i iVarB = bundle5 == null ? i.f138255d : i.b(bundle5);
        Bundle bundle6 = bundle.getBundle(f138142p);
        return new c1(str, eVarB, bundle6 == null ? null : h.a(bundle6), gVarB, i1VarD, iVarB);
    }

    public static c1 d(Uri uri) {
        return new c().M(uri).a();
    }

    public static c1 e(String str) {
        return new c().N(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Objects.equals(this.f138143a, c1Var.f138143a) && this.f138148f.equals(c1Var.f138148f) && Objects.equals(this.f138144b, c1Var.f138144b) && Objects.equals(this.f138146d, c1Var.f138146d) && Objects.equals(this.f138147e, c1Var.f138147e) && Objects.equals(this.f138150h, c1Var.f138150h);
    }

    @x4.m1
    @Deprecated
    public Bundle f() {
        return g(9);
    }

    @x4.m1
    public Bundle g(int i10) {
        return h(false, i10);
    }

    @x4.m1
    public final Bundle h(boolean z10, int i10) {
        h hVar;
        Bundle bundle = new Bundle();
        if (!this.f138143a.equals("")) {
            bundle.putString(f138137k, this.f138143a);
        }
        if (!this.f138146d.equals(g.f138221f)) {
            bundle.putBundle(f138138l, this.f138146d.c());
        }
        if (!this.f138147e.equals(i1.Z0)) {
            bundle.putBundle(f138139m, this.f138147e.h(i10));
        }
        if (!this.f138148f.equals(d.f138170i)) {
            bundle.putBundle(f138140n, this.f138148f.c());
        }
        if (!this.f138150h.equals(i.f138255d)) {
            bundle.putBundle(f138141o, this.f138150h.c());
        }
        if (z10 && (hVar = this.f138144b) != null) {
            bundle.putBundle(f138142p, hVar.b());
        }
        return bundle;
    }

    public int hashCode() {
        int iHashCode = this.f138143a.hashCode() * 31;
        h hVar = this.f138144b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f138146d.hashCode()) * 31) + this.f138148f.hashCode()) * 31) + this.f138147e.hashCode()) * 31) + this.f138150h.hashCode();
    }

    @x4.m1
    @Deprecated
    public Bundle i() {
        return j(9);
    }

    @x4.m1
    public Bundle j(int i10) {
        return h(true, i10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class k {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f138265h = x4.b2.k1(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f138266i = x4.b2.k1(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f138267j = x4.b2.k1(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f138268k = x4.b2.k1(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f138269l = x4.b2.k1(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f138270m = x4.b2.k1(5);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f138271n = x4.b2.k1(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f138272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f138273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f138274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f138275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f138276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f138277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f138278g;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Uri f138279a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public String f138280b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public String f138281c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f138282d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f138283e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @Nullable
            public String f138284f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @Nullable
            public String f138285g;

            public k i() {
                return new k(this);
            }

            public final j j() {
                return new j(this);
            }

            @qj.a
            public a k(@Nullable String str) {
                this.f138285g = str;
                return this;
            }

            @qj.a
            public a l(@Nullable String str) {
                this.f138284f = str;
                return this;
            }

            @qj.a
            public a m(@Nullable String str) {
                this.f138281c = str;
                return this;
            }

            @qj.a
            public a n(@Nullable String str) {
                this.f138280b = l1.x(str);
                return this;
            }

            @qj.a
            public a o(int i10) {
                this.f138283e = i10;
                return this;
            }

            @qj.a
            public a p(int i10) {
                this.f138282d = i10;
                return this;
            }

            @qj.a
            public a q(Uri uri) {
                this.f138279a = uri;
                return this;
            }

            public a(Uri uri) {
                this.f138279a = uri;
            }

            public a(k kVar) {
                this.f138279a = kVar.f138272a;
                this.f138280b = kVar.f138273b;
                this.f138281c = kVar.f138274c;
                this.f138282d = kVar.f138275d;
                this.f138283e = kVar.f138276e;
                this.f138284f = kVar.f138277f;
                this.f138285g = kVar.f138278g;
            }
        }

        @x4.m1
        public static k b(Bundle bundle) {
            Uri uri = (Uri) zi.l0.E((Uri) bundle.getParcelable(f138265h));
            String string = bundle.getString(f138266i);
            String string2 = bundle.getString(f138267j);
            int i10 = bundle.getInt(f138268k, 0);
            int i11 = bundle.getInt(f138269l, 0);
            String string3 = bundle.getString(f138270m);
            return new a(uri).n(string).m(string2).p(i10).o(i11).l(string3).k(bundle.getString(f138271n)).i();
        }

        public a a() {
            return new a();
        }

        @x4.m1
        public Bundle c() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f138265h, this.f138272a);
            String str = this.f138273b;
            if (str != null) {
                bundle.putString(f138266i, str);
            }
            String str2 = this.f138274c;
            if (str2 != null) {
                bundle.putString(f138267j, str2);
            }
            int i10 = this.f138275d;
            if (i10 != 0) {
                bundle.putInt(f138268k, i10);
            }
            int i11 = this.f138276e;
            if (i11 != 0) {
                bundle.putInt(f138269l, i11);
            }
            String str3 = this.f138277f;
            if (str3 != null) {
                bundle.putString(f138270m, str3);
            }
            String str4 = this.f138278g;
            if (str4 != null) {
                bundle.putString(f138271n, str4);
            }
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f138272a.equals(kVar.f138272a) && Objects.equals(this.f138273b, kVar.f138273b) && Objects.equals(this.f138274c, kVar.f138274c) && this.f138275d == kVar.f138275d && this.f138276e == kVar.f138276e && Objects.equals(this.f138277f, kVar.f138277f) && Objects.equals(this.f138278g, kVar.f138278g);
        }

        public int hashCode() {
            int iHashCode = this.f138272a.hashCode() * 31;
            String str = this.f138273b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f138274c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f138275d) * 31) + this.f138276e) * 31;
            String str3 = this.f138277f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f138278g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public k(Uri uri, String str, @Nullable String str2, int i10, int i11, @Nullable String str3, @Nullable String str4) {
            this.f138272a = uri;
            this.f138273b = l1.x(str);
            this.f138274c = str2;
            this.f138275d = i10;
            this.f138276e = i11;
            this.f138277f = str3;
            this.f138278g = str4;
        }

        public k(a aVar) {
            this.f138272a = aVar.f138279a;
            this.f138273b = aVar.f138280b;
            this.f138274c = aVar.f138281c;
            this.f138275d = aVar.f138282d;
            this.f138276e = aVar.f138283e;
            this.f138277f = aVar.f138284f;
            this.f138278g = aVar.f138285g;
        }
    }

    public c1(String str, e eVar, @Nullable h hVar, g gVar, i1 i1Var, i iVar) {
        this.f138143a = str;
        this.f138144b = hVar;
        this.f138145c = hVar;
        this.f138146d = gVar;
        this.f138147e = i1Var;
        this.f138148f = eVar;
        this.f138149g = eVar;
        this.f138150h = iVar;
    }
}
