package re;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class x2 implements re.j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f127018j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x2 f127019k = new c().a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f127020l = eh.o1.R0(0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f127021m = eh.o1.R0(1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f127022n = eh.o1.R0(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f127023o = eh.o1.R0(3);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f127024p = eh.o1.R0(4);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f127025q = eh.o1.R0(5);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final re.j.a<x2> f127026r = new re.j.a() { // from class: re.w2
        @Override // re.j.a
        public final j fromBundle(Bundle bundle) {
            return x2.c(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final h f127028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    @Deprecated
    public final h f127029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f127030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h3 f127031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f127032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public final e f127033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f127034i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements re.j {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f127035d = eh.o1.R0(0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final re.j.a<b> f127036e = new re.j.a() { // from class: re.y2
            @Override // re.j.a
            public final j fromBundle(Bundle bundle) {
                return x2.b.c(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f127037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Object f127038c;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Uri f127039a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public Object f127040b;

            public a(Uri uri) {
                this.f127039a = uri;
            }

            public b c() {
                return new b(this);
            }

            @qj.a
            public a d(Uri uri) {
                this.f127039a = uri;
                return this;
            }

            @qj.a
            public a e(@Nullable Object obj) {
                this.f127040b = obj;
                return this;
            }
        }

        public static b c(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(f127035d);
            eh.a.g(uri);
            return new a(uri).c();
        }

        public a b() {
            return new a(this.f127037b).e(this.f127038c);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f127037b.equals(bVar.f127037b) && eh.o1.g(this.f127038c, bVar.f127038c);
        }

        public int hashCode() {
            int iHashCode = this.f127037b.hashCode() * 31;
            Object obj = this.f127038c;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        @Override // re.j
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f127035d, this.f127037b);
            return bundle;
        }

        public b(a aVar) {
            this.f127037b = aVar.f127039a;
            this.f127038c = aVar.f127040b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f127041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Uri f127042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f127043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d.a f127044d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f.a f127045e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<StreamKey> f127046f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public String f127047g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public cj.v6<k> f127048h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public b f127049i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public Object f127050j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public h3 f127051k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public g.a f127052l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public i f127053m;

        @qj.a
        @Deprecated
        public c A(long j10) {
            this.f127052l.i(j10);
            return this;
        }

        @qj.a
        @Deprecated
        public c B(float f10) {
            this.f127052l.j(f10);
            return this;
        }

        @qj.a
        @Deprecated
        public c C(long j10) {
            this.f127052l.k(j10);
            return this;
        }

        @qj.a
        public c D(String str) {
            this.f127041a = (String) eh.a.g(str);
            return this;
        }

        @qj.a
        public c E(h3 h3Var) {
            this.f127051k = h3Var;
            return this;
        }

        @qj.a
        public c F(@Nullable String str) {
            this.f127043c = str;
            return this;
        }

        @qj.a
        public c G(i iVar) {
            this.f127053m = iVar;
            return this;
        }

        @qj.a
        public c H(@Nullable List<StreamKey> list) {
            this.f127046f = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        @qj.a
        public c I(List<k> list) {
            this.f127048h = cj.v6.u(list);
            return this;
        }

        @qj.a
        @Deprecated
        public c J(@Nullable List<j> list) {
            this.f127048h = list != null ? cj.v6.u(list) : cj.v6.z();
            return this;
        }

        @qj.a
        public c K(@Nullable Object obj) {
            this.f127050j = obj;
            return this;
        }

        @qj.a
        public c L(@Nullable Uri uri) {
            this.f127042b = uri;
            return this;
        }

        @qj.a
        public c M(@Nullable String str) {
            return L(str == null ? null : Uri.parse(str));
        }

        public x2 a() {
            h hVar;
            eh.a.i(this.f127045e.f127093b == null || this.f127045e.f127092a != null);
            Uri uri = this.f127042b;
            if (uri != null) {
                hVar = new h(uri, this.f127043c, this.f127045e.f127092a != null ? this.f127045e.j() : null, this.f127049i, this.f127046f, this.f127047g, this.f127048h, this.f127050j);
            } else {
                hVar = null;
            }
            String str = this.f127041a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarG = this.f127044d.g();
            g gVarF = this.f127052l.f();
            h3 h3Var = this.f127051k;
            if (h3Var == null) {
                h3Var = h3.W0;
            }
            return new x2(str2, eVarG, hVar, gVarF, h3Var, this.f127053m);
        }

        @qj.a
        @Deprecated
        public c b(@Nullable Uri uri) {
            return c(uri, null);
        }

        @qj.a
        @Deprecated
        public c c(@Nullable Uri uri, @Nullable Object obj) {
            this.f127049i = uri != null ? new b.a(uri).e(obj).c() : null;
            return this;
        }

        @qj.a
        @Deprecated
        public c d(@Nullable String str) {
            return b(str != null ? Uri.parse(str) : null);
        }

        @qj.a
        public c e(@Nullable b bVar) {
            this.f127049i = bVar;
            return this;
        }

        @qj.a
        @Deprecated
        public c f(long j10) {
            this.f127044d.h(j10);
            return this;
        }

        @qj.a
        @Deprecated
        public c g(boolean z10) {
            this.f127044d.i(z10);
            return this;
        }

        @qj.a
        @Deprecated
        public c h(boolean z10) {
            this.f127044d.j(z10);
            return this;
        }

        @qj.a
        @Deprecated
        public c i(@k.e0(from = 0) long j10) {
            this.f127044d.k(j10);
            return this;
        }

        @qj.a
        @Deprecated
        public c j(boolean z10) {
            this.f127044d.l(z10);
            return this;
        }

        @qj.a
        public c k(d dVar) {
            this.f127044d = dVar.b();
            return this;
        }

        @qj.a
        public c l(@Nullable String str) {
            this.f127047g = str;
            return this;
        }

        @qj.a
        public c m(@Nullable f fVar) {
            this.f127045e = fVar != null ? fVar.c() : new f.a();
            return this;
        }

        @qj.a
        @Deprecated
        public c n(boolean z10) {
            this.f127045e.l(z10);
            return this;
        }

        @qj.a
        @Deprecated
        public c o(@Nullable byte[] bArr) {
            this.f127045e.o(bArr);
            return this;
        }

        @qj.a
        @Deprecated
        public c p(@Nullable Map<String, String> map) {
            f.a aVar = this.f127045e;
            if (map == null) {
                map = cj.x6.y();
            }
            aVar.p(map);
            return this;
        }

        @qj.a
        @Deprecated
        public c q(@Nullable Uri uri) {
            this.f127045e.q(uri);
            return this;
        }

        @qj.a
        @Deprecated
        public c r(@Nullable String str) {
            this.f127045e.r(str);
            return this;
        }

        @qj.a
        @Deprecated
        public c s(boolean z10) {
            this.f127045e.s(z10);
            return this;
        }

        @qj.a
        @Deprecated
        public c t(boolean z10) {
            this.f127045e.u(z10);
            return this;
        }

        @qj.a
        @Deprecated
        public c u(boolean z10) {
            this.f127045e.m(z10);
            return this;
        }

        @qj.a
        @Deprecated
        public c v(@Nullable List<Integer> list) {
            f.a aVar = this.f127045e;
            if (list == null) {
                list = cj.v6.z();
            }
            aVar.n(list);
            return this;
        }

        @qj.a
        @Deprecated
        public c w(@Nullable UUID uuid) {
            this.f127045e.t(uuid);
            return this;
        }

        @qj.a
        public c x(g gVar) {
            this.f127052l = gVar.b();
            return this;
        }

        @qj.a
        @Deprecated
        public c y(long j10) {
            this.f127052l.g(j10);
            return this;
        }

        @qj.a
        @Deprecated
        public c z(float f10) {
            this.f127052l.h(f10);
            return this;
        }

        public c() {
            this.f127044d = new d.a();
            this.f127045e = new f.a();
            this.f127046f = Collections.EMPTY_LIST;
            this.f127048h = cj.v6.z();
            this.f127052l = new g.a();
            this.f127053m = i.f127134e;
        }

        public c(x2 x2Var) {
            f.a aVar;
            this();
            this.f127044d = x2Var.f127032g.b();
            this.f127041a = x2Var.f127027b;
            this.f127051k = x2Var.f127031f;
            this.f127052l = x2Var.f127030e.b();
            this.f127053m = x2Var.f127034i;
            h hVar = x2Var.f127028c;
            if (hVar != null) {
                this.f127047g = hVar.f127130g;
                this.f127043c = hVar.f127126c;
                this.f127042b = hVar.f127125b;
                this.f127046f = hVar.f127129f;
                this.f127048h = hVar.f127131h;
                this.f127050j = hVar.f127133j;
                f fVar = hVar.f127127d;
                if (fVar != null) {
                    aVar = fVar.c();
                } else {
                    aVar = new f.a();
                }
                this.f127045e = aVar;
                this.f127049i = hVar.f127128e;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d implements re.j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f127054g = new a().f();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f127055h = eh.o1.R0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f127056i = eh.o1.R0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f127057j = eh.o1.R0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f127058k = eh.o1.R0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f127059l = eh.o1.R0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final re.j.a<e> f127060m = new re.j.a() { // from class: re.z2
            @Override // re.j.a
            public final j fromBundle(Bundle bundle) {
                return x2.d.a(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @k.e0(from = 0)
        public final long f127061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f127062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f127063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f127064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f127065f;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f127066a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f127067b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f127068c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f127069d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f127070e;

            public d f() {
                return g();
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            @qj.a
            public a h(long j10) {
                eh.a.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f127067b = j10;
                return this;
            }

            @qj.a
            public a i(boolean z10) {
                this.f127069d = z10;
                return this;
            }

            @qj.a
            public a j(boolean z10) {
                this.f127068c = z10;
                return this;
            }

            @qj.a
            public a k(@k.e0(from = 0) long j10) {
                eh.a.a(j10 >= 0);
                this.f127066a = j10;
                return this;
            }

            @qj.a
            public a l(boolean z10) {
                this.f127070e = z10;
                return this;
            }

            public a() {
                this.f127067b = Long.MIN_VALUE;
            }

            public a(d dVar) {
                this.f127066a = dVar.f127061b;
                this.f127067b = dVar.f127062c;
                this.f127068c = dVar.f127063d;
                this.f127069d = dVar.f127064e;
                this.f127070e = dVar.f127065f;
            }
        }

        public static /* synthetic */ e a(Bundle bundle) {
            a aVar = new a();
            String str = f127055h;
            d dVar = f127054g;
            return aVar.k(bundle.getLong(str, dVar.f127061b)).h(bundle.getLong(f127056i, dVar.f127062c)).j(bundle.getBoolean(f127057j, dVar.f127063d)).i(bundle.getBoolean(f127058k, dVar.f127064e)).l(bundle.getBoolean(f127059l, dVar.f127065f)).g();
        }

        public a b() {
            return new a();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f127061b == dVar.f127061b && this.f127062c == dVar.f127062c && this.f127063d == dVar.f127063d && this.f127064e == dVar.f127064e && this.f127065f == dVar.f127065f;
        }

        public int hashCode() {
            long j10 = this.f127061b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f127062c;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f127063d ? 1 : 0)) * 31) + (this.f127064e ? 1 : 0)) * 31) + (this.f127065f ? 1 : 0);
        }

        @Override // re.j
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j10 = this.f127061b;
            d dVar = f127054g;
            if (j10 != dVar.f127061b) {
                bundle.putLong(f127055h, j10);
            }
            long j11 = this.f127062c;
            if (j11 != dVar.f127062c) {
                bundle.putLong(f127056i, j11);
            }
            boolean z10 = this.f127063d;
            if (z10 != dVar.f127063d) {
                bundle.putBoolean(f127057j, z10);
            }
            boolean z11 = this.f127064e;
            if (z11 != dVar.f127064e) {
                bundle.putBoolean(f127058k, z11);
            }
            boolean z12 = this.f127065f;
            if (z12 != dVar.f127065f) {
                bundle.putBoolean(f127059l, z12);
            }
            return bundle;
        }

        public d(a aVar) {
            this.f127061b = aVar.f127066a;
            this.f127062c = aVar.f127067b;
            this.f127063d = aVar.f127068c;
            this.f127064e = aVar.f127069d;
            this.f127065f = aVar.f127070e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    public static final class e extends d {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final e f127071n = new d.a().g();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f implements re.j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f127072m = eh.o1.R0(0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f127073n = eh.o1.R0(1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f127074o = eh.o1.R0(2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f127075p = eh.o1.R0(3);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f127076q = eh.o1.R0(4);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f127077r = eh.o1.R0(5);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f127078s = eh.o1.R0(6);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f127079t = eh.o1.R0(7);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final re.j.a<f> f127080u = new re.j.a() { // from class: re.a3
            @Override // re.j.a
            public final j fromBundle(Bundle bundle) {
                return x2.f.d(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f127081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public final UUID f127082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Uri f127083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public final cj.x6<String, String> f127084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final cj.x6<String, String> f127085f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f127086g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f127087h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f127088i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Deprecated
        public final cj.v6<Integer> f127089j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final cj.v6<Integer> f127090k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public final byte[] f127091l;

        public static f d(Bundle bundle) {
            UUID uuidFromString = UUID.fromString((String) eh.a.g(bundle.getString(f127072m)));
            Uri uri = (Uri) bundle.getParcelable(f127073n);
            cj.x6<String, String> x6VarB = eh.g.b(eh.g.f(bundle, f127074o, Bundle.EMPTY));
            boolean z10 = bundle.getBoolean(f127075p, false);
            boolean z11 = bundle.getBoolean(f127076q, false);
            boolean z12 = bundle.getBoolean(f127077r, false);
            cj.v6 v6VarU = cj.v6.u(eh.g.g(bundle, f127078s, new ArrayList()));
            return new a(uuidFromString).q(uri).p(x6VarB).s(z10).l(z12).u(z11).n(v6VarU).o(bundle.getByteArray(f127079t)).j();
        }

        public a c() {
            return new a();
        }

        @Nullable
        public byte[] e() {
            byte[] bArr = this.f127091l;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f127081b.equals(fVar.f127081b) && eh.o1.g(this.f127083d, fVar.f127083d) && eh.o1.g(this.f127085f, fVar.f127085f) && this.f127086g == fVar.f127086g && this.f127088i == fVar.f127088i && this.f127087h == fVar.f127087h && this.f127090k.equals(fVar.f127090k) && Arrays.equals(this.f127091l, fVar.f127091l);
        }

        public int hashCode() {
            int iHashCode = this.f127081b.hashCode() * 31;
            Uri uri = this.f127083d;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f127085f.hashCode()) * 31) + (this.f127086g ? 1 : 0)) * 31) + (this.f127088i ? 1 : 0)) * 31) + (this.f127087h ? 1 : 0)) * 31) + this.f127090k.hashCode()) * 31) + Arrays.hashCode(this.f127091l);
        }

        @Override // re.j
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(f127072m, this.f127081b.toString());
            Uri uri = this.f127083d;
            if (uri != null) {
                bundle.putParcelable(f127073n, uri);
            }
            if (!this.f127085f.isEmpty()) {
                bundle.putBundle(f127074o, eh.g.h(this.f127085f));
            }
            boolean z10 = this.f127086g;
            if (z10) {
                bundle.putBoolean(f127075p, z10);
            }
            boolean z11 = this.f127087h;
            if (z11) {
                bundle.putBoolean(f127076q, z11);
            }
            boolean z12 = this.f127088i;
            if (z12) {
                bundle.putBoolean(f127077r, z12);
            }
            if (!this.f127090k.isEmpty()) {
                bundle.putIntegerArrayList(f127078s, new ArrayList<>(this.f127090k));
            }
            byte[] bArr = this.f127091l;
            if (bArr != null) {
                bundle.putByteArray(f127079t, bArr);
            }
            return bundle;
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public UUID f127092a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public Uri f127093b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public cj.x6<String, String> f127094c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f127095d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f127096e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f127097f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public cj.v6<Integer> f127098g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            @Nullable
            public byte[] f127099h;

            public f j() {
                return new f(this);
            }

            @qj.a
            @qj.m(replacement = "this.setForceSessionsForAudioAndVideoTracks(forceSessionsForAudioAndVideoTracks)")
            @Deprecated
            public a k(boolean z10) {
                return m(z10);
            }

            @qj.a
            public a l(boolean z10) {
                this.f127097f = z10;
                return this;
            }

            @qj.a
            public a m(boolean z10) {
                n(z10 ? cj.v6.B(2, 1) : cj.v6.z());
                return this;
            }

            @qj.a
            public a n(List<Integer> list) {
                this.f127098g = cj.v6.u(list);
                return this;
            }

            @qj.a
            public a o(@Nullable byte[] bArr) {
                this.f127099h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            @qj.a
            public a p(Map<String, String> map) {
                this.f127094c = cj.x6.m(map);
                return this;
            }

            @qj.a
            public a q(@Nullable Uri uri) {
                this.f127093b = uri;
                return this;
            }

            @qj.a
            public a r(@Nullable String str) {
                this.f127093b = str == null ? null : Uri.parse(str);
                return this;
            }

            @qj.a
            public a s(boolean z10) {
                this.f127095d = z10;
                return this;
            }

            @qj.a
            @Deprecated
            public final a t(@Nullable UUID uuid) {
                this.f127092a = uuid;
                return this;
            }

            @qj.a
            public a u(boolean z10) {
                this.f127096e = z10;
                return this;
            }

            @qj.a
            public a v(UUID uuid) {
                this.f127092a = uuid;
                return this;
            }

            public a(UUID uuid) {
                this.f127092a = uuid;
                this.f127094c = cj.x6.y();
                this.f127098g = cj.v6.z();
            }

            @Deprecated
            public a() {
                this.f127094c = cj.x6.y();
                this.f127098g = cj.v6.z();
            }

            public a(f fVar) {
                this.f127092a = fVar.f127081b;
                this.f127093b = fVar.f127083d;
                this.f127094c = fVar.f127085f;
                this.f127095d = fVar.f127086g;
                this.f127096e = fVar.f127087h;
                this.f127097f = fVar.f127088i;
                this.f127098g = fVar.f127090k;
                this.f127099h = fVar.f127091l;
            }
        }

        public f(a aVar) {
            eh.a.i((aVar.f127097f && aVar.f127093b == null) ? false : true);
            UUID uuid = (UUID) eh.a.g(aVar.f127092a);
            this.f127081b = uuid;
            this.f127082c = uuid;
            this.f127083d = aVar.f127093b;
            this.f127084e = aVar.f127094c;
            this.f127085f = aVar.f127094c;
            this.f127086g = aVar.f127095d;
            this.f127088i = aVar.f127097f;
            this.f127087h = aVar.f127096e;
            this.f127089j = aVar.f127098g;
            this.f127090k = aVar.f127098g;
            this.f127091l = aVar.f127099h != null ? Arrays.copyOf(aVar.f127099h, aVar.f127099h.length) : null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g implements re.j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final g f127100g = new a().f();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f127101h = eh.o1.R0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f127102i = eh.o1.R0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f127103j = eh.o1.R0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f127104k = eh.o1.R0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f127105l = eh.o1.R0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final re.j.a<g> f127106m = new re.j.a() { // from class: re.b3
            @Override // re.j.a
            public final j fromBundle(Bundle bundle) {
                return x2.g.a(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f127107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f127108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f127109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f127110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f127111f;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f127112a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f127113b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f127114c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public float f127115d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float f127116e;

            public g f() {
                return new g(this);
            }

            @qj.a
            public a g(long j10) {
                this.f127114c = j10;
                return this;
            }

            @qj.a
            public a h(float f10) {
                this.f127116e = f10;
                return this;
            }

            @qj.a
            public a i(long j10) {
                this.f127113b = j10;
                return this;
            }

            @qj.a
            public a j(float f10) {
                this.f127115d = f10;
                return this;
            }

            @qj.a
            public a k(long j10) {
                this.f127112a = j10;
                return this;
            }

            public a() {
                this.f127112a = -9223372036854775807L;
                this.f127113b = -9223372036854775807L;
                this.f127114c = -9223372036854775807L;
                this.f127115d = -3.4028235E38f;
                this.f127116e = -3.4028235E38f;
            }

            public a(g gVar) {
                this.f127112a = gVar.f127107b;
                this.f127113b = gVar.f127108c;
                this.f127114c = gVar.f127109d;
                this.f127115d = gVar.f127110e;
                this.f127116e = gVar.f127111f;
            }
        }

        public static /* synthetic */ g a(Bundle bundle) {
            String str = f127101h;
            g gVar = f127100g;
            return new g(bundle.getLong(str, gVar.f127107b), bundle.getLong(f127102i, gVar.f127108c), bundle.getLong(f127103j, gVar.f127109d), bundle.getFloat(f127104k, gVar.f127110e), bundle.getFloat(f127105l, gVar.f127111f));
        }

        public a b() {
            return new a();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f127107b == gVar.f127107b && this.f127108c == gVar.f127108c && this.f127109d == gVar.f127109d && this.f127110e == gVar.f127110e && this.f127111f == gVar.f127111f;
        }

        public int hashCode() {
            long j10 = this.f127107b;
            long j11 = this.f127108c;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f127109d;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f127110e;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f127111f;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        @Override // re.j
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j10 = this.f127107b;
            g gVar = f127100g;
            if (j10 != gVar.f127107b) {
                bundle.putLong(f127101h, j10);
            }
            long j11 = this.f127108c;
            if (j11 != gVar.f127108c) {
                bundle.putLong(f127102i, j11);
            }
            long j12 = this.f127109d;
            if (j12 != gVar.f127109d) {
                bundle.putLong(f127103j, j12);
            }
            float f10 = this.f127110e;
            if (f10 != gVar.f127110e) {
                bundle.putFloat(f127104k, f10);
            }
            float f11 = this.f127111f;
            if (f11 != gVar.f127111f) {
                bundle.putFloat(f127105l, f11);
            }
            return bundle;
        }

        public g(a aVar) {
            this(aVar.f127112a, aVar.f127113b, aVar.f127114c, aVar.f127115d, aVar.f127116e);
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f127107b = j10;
            this.f127108c = j11;
            this.f127109d = j12;
            this.f127110e = f10;
            this.f127111f = f11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h implements re.j {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f127117k = eh.o1.R0(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f127118l = eh.o1.R0(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f127119m = eh.o1.R0(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f127120n = eh.o1.R0(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f127121o = eh.o1.R0(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f127122p = eh.o1.R0(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f127123q = eh.o1.R0(6);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final re.j.a<h> f127124r = new re.j.a() { // from class: re.c3
            @Override // re.j.a
            public final j fromBundle(Bundle bundle) {
                return x2.h.b(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f127125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f127126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final f f127127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final b f127128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<StreamKey> f127129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f127130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final cj.v6<k> f127131h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public final List<j> f127132i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final Object f127133j;

        public static h b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f127119m);
            f fVar = bundle2 == null ? null : (f) f.f127080u.fromBundle(bundle2);
            Bundle bundle3 = bundle.getBundle(f127120n);
            b bVar = bundle3 != null ? (b) b.f127036e.fromBundle(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f127121o);
            cj.v6 v6VarZ = parcelableArrayList == null ? cj.v6.z() : eh.g.d(new re.j.a() { // from class: re.d3
                @Override // re.j.a
                public final j fromBundle(Bundle bundle4) {
                    return StreamKey.b(bundle4);
                }
            }, parcelableArrayList);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f127123q);
            return new h((Uri) eh.a.g((Uri) bundle.getParcelable(f127117k)), bundle.getString(f127118l), fVar, bVar, v6VarZ, bundle.getString(f127122p), parcelableArrayList2 == null ? cj.v6.z() : eh.g.d(k.f127152p, parcelableArrayList2), null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f127125b.equals(hVar.f127125b) && eh.o1.g(this.f127126c, hVar.f127126c) && eh.o1.g(this.f127127d, hVar.f127127d) && eh.o1.g(this.f127128e, hVar.f127128e) && this.f127129f.equals(hVar.f127129f) && eh.o1.g(this.f127130g, hVar.f127130g) && this.f127131h.equals(hVar.f127131h) && eh.o1.g(this.f127133j, hVar.f127133j);
        }

        public int hashCode() {
            int iHashCode = this.f127125b.hashCode() * 31;
            String str = this.f127126c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f127127d;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f127128e;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f127129f.hashCode()) * 31;
            String str2 = this.f127130g;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f127131h.hashCode()) * 31;
            Object obj = this.f127133j;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        @Override // re.j
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f127117k, this.f127125b);
            String str = this.f127126c;
            if (str != null) {
                bundle.putString(f127118l, str);
            }
            f fVar = this.f127127d;
            if (fVar != null) {
                bundle.putBundle(f127119m, fVar.toBundle());
            }
            b bVar = this.f127128e;
            if (bVar != null) {
                bundle.putBundle(f127120n, bVar.toBundle());
            }
            if (!this.f127129f.isEmpty()) {
                bundle.putParcelableArrayList(f127121o, eh.g.i(this.f127129f));
            }
            String str2 = this.f127130g;
            if (str2 != null) {
                bundle.putString(f127122p, str2);
            }
            if (!this.f127131h.isEmpty()) {
                bundle.putParcelableArrayList(f127123q, eh.g.i(this.f127131h));
            }
            return bundle;
        }

        public h(Uri uri, @Nullable String str, @Nullable f fVar, @Nullable b bVar, List<StreamKey> list, @Nullable String str2, cj.v6<k> v6Var, @Nullable Object obj) {
            this.f127125b = uri;
            this.f127126c = str;
            this.f127127d = fVar;
            this.f127128e = bVar;
            this.f127129f = list;
            this.f127130g = str2;
            this.f127131h = v6Var;
            cj.v6.a aVarQ = cj.v6.q();
            for (int i10 = 0; i10 < v6Var.size(); i10++) {
                aVarQ.g(v6Var.get(i10).b().j());
            }
            this.f127132i = aVarQ.e();
            this.f127133j = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class i implements re.j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final i f127134e = new a().d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f127135f = eh.o1.R0(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f127136g = eh.o1.R0(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f127137h = eh.o1.R0(2);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final re.j.a<i> f127138i = new re.j.a() { // from class: re.e3
            @Override // re.j.a
            public final j fromBundle(Bundle bundle) {
                return new x2.i.a().f((Uri) bundle.getParcelable(x2.i.f127135f)).g(bundle.getString(x2.i.f127136g)).e(bundle.getBundle(x2.i.f127137h)).d();
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Uri f127139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f127140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Bundle f127141d;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public Uri f127142a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public String f127143b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public Bundle f127144c;

            public i d() {
                return new i(this);
            }

            @qj.a
            public a e(@Nullable Bundle bundle) {
                this.f127144c = bundle;
                return this;
            }

            @qj.a
            public a f(@Nullable Uri uri) {
                this.f127142a = uri;
                return this;
            }

            @qj.a
            public a g(@Nullable String str) {
                this.f127143b = str;
                return this;
            }

            public a() {
            }

            public a(i iVar) {
                this.f127142a = iVar.f127139b;
                this.f127143b = iVar.f127140c;
                this.f127144c = iVar.f127141d;
            }
        }

        public a b() {
            return new a();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return eh.o1.g(this.f127139b, iVar.f127139b) && eh.o1.g(this.f127140c, iVar.f127140c);
        }

        public int hashCode() {
            Uri uri = this.f127139b;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f127140c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // re.j
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.f127139b;
            if (uri != null) {
                bundle.putParcelable(f127135f, uri);
            }
            String str = this.f127140c;
            if (str != null) {
                bundle.putString(f127136g, str);
            }
            Bundle bundle2 = this.f127141d;
            if (bundle2 != null) {
                bundle.putBundle(f127137h, bundle2);
            }
            return bundle;
        }

        public i(a aVar) {
            this.f127139b = aVar.f127142a;
            this.f127140c = aVar.f127143b;
            this.f127141d = aVar.f127144c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    public static final class j extends k {
        @Deprecated
        public j(Uri uri, String str, @Nullable String str2) {
            this(uri, str, str2, 0);
        }

        @Deprecated
        public j(Uri uri, String str, @Nullable String str2, int i10) {
            this(uri, str, str2, i10, 0, null);
        }

        @Deprecated
        public j(Uri uri, String str, @Nullable String str2, int i10, int i11, @Nullable String str3) {
            super(uri, str, str2, i10, i11, str3, null);
        }

        public j(k.a aVar) {
            super(aVar);
        }
    }

    public static x2 c(Bundle bundle) {
        String str = (String) eh.a.g(bundle.getString(f127020l, ""));
        Bundle bundle2 = bundle.getBundle(f127021m);
        g gVar = bundle2 == null ? g.f127100g : (g) g.f127106m.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(f127022n);
        h3 h3Var = bundle3 == null ? h3.W0 : (h3) h3.E1.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(f127023o);
        e eVar = bundle4 == null ? e.f127071n : (e) d.f127060m.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(f127024p);
        i iVar = bundle5 == null ? i.f127134e : (i) i.f127138i.fromBundle(bundle5);
        Bundle bundle6 = bundle.getBundle(f127025q);
        return new x2(str, eVar, bundle6 == null ? null : (h) h.f127124r.fromBundle(bundle6), gVar, h3Var, iVar);
    }

    public static x2 d(Uri uri) {
        return new c().L(uri).a();
    }

    public static x2 e(String str) {
        return new c().M(str).a();
    }

    private Bundle f(boolean z10) {
        h hVar;
        Bundle bundle = new Bundle();
        if (!this.f127027b.equals("")) {
            bundle.putString(f127020l, this.f127027b);
        }
        if (!this.f127030e.equals(g.f127100g)) {
            bundle.putBundle(f127021m, this.f127030e.toBundle());
        }
        if (!this.f127031f.equals(h3.W0)) {
            bundle.putBundle(f127022n, this.f127031f.toBundle());
        }
        if (!this.f127032g.equals(d.f127054g)) {
            bundle.putBundle(f127023o, this.f127032g.toBundle());
        }
        if (!this.f127034i.equals(i.f127134e)) {
            bundle.putBundle(f127024p, this.f127034i.toBundle());
        }
        if (z10 && (hVar = this.f127028c) != null) {
            bundle.putBundle(f127025q, hVar.toBundle());
        }
        return bundle;
    }

    public c b() {
        return new c();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return eh.o1.g(this.f127027b, x2Var.f127027b) && this.f127032g.equals(x2Var.f127032g) && eh.o1.g(this.f127028c, x2Var.f127028c) && eh.o1.g(this.f127030e, x2Var.f127030e) && eh.o1.g(this.f127031f, x2Var.f127031f) && eh.o1.g(this.f127034i, x2Var.f127034i);
    }

    public Bundle g() {
        return f(true);
    }

    public int hashCode() {
        int iHashCode = this.f127027b.hashCode() * 31;
        h hVar = this.f127028c;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f127030e.hashCode()) * 31) + this.f127032g.hashCode()) * 31) + this.f127031f.hashCode()) * 31) + this.f127034i.hashCode();
    }

    @Override // re.j
    public Bundle toBundle() {
        return f(false);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class k implements re.j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f127145i = eh.o1.R0(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f127146j = eh.o1.R0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f127147k = eh.o1.R0(2);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f127148l = eh.o1.R0(3);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f127149m = eh.o1.R0(4);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f127150n = eh.o1.R0(5);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f127151o = eh.o1.R0(6);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final re.j.a<k> f127152p = new re.j.a() { // from class: re.f3
            @Override // re.j.a
            public final j fromBundle(Bundle bundle) {
                return x2.k.c(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f127153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f127154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f127155d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f127156e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f127157f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f127158g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final String f127159h;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Uri f127160a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public String f127161b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public String f127162c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f127163d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f127164e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @Nullable
            public String f127165f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @Nullable
            public String f127166g;

            public k i() {
                return new k(this);
            }

            public final j j() {
                return new j(this);
            }

            @qj.a
            public a k(@Nullable String str) {
                this.f127166g = str;
                return this;
            }

            @qj.a
            public a l(@Nullable String str) {
                this.f127165f = str;
                return this;
            }

            @qj.a
            public a m(@Nullable String str) {
                this.f127162c = str;
                return this;
            }

            @qj.a
            public a n(@Nullable String str) {
                this.f127161b = str;
                return this;
            }

            @qj.a
            public a o(int i10) {
                this.f127164e = i10;
                return this;
            }

            @qj.a
            public a p(int i10) {
                this.f127163d = i10;
                return this;
            }

            @qj.a
            public a q(Uri uri) {
                this.f127160a = uri;
                return this;
            }

            public a(Uri uri) {
                this.f127160a = uri;
            }

            public a(k kVar) {
                this.f127160a = kVar.f127153b;
                this.f127161b = kVar.f127154c;
                this.f127162c = kVar.f127155d;
                this.f127163d = kVar.f127156e;
                this.f127164e = kVar.f127157f;
                this.f127165f = kVar.f127158g;
                this.f127166g = kVar.f127159h;
            }
        }

        public static k c(Bundle bundle) {
            Uri uri = (Uri) eh.a.g((Uri) bundle.getParcelable(f127145i));
            String string = bundle.getString(f127146j);
            String string2 = bundle.getString(f127147k);
            int i10 = bundle.getInt(f127148l, 0);
            int i11 = bundle.getInt(f127149m, 0);
            String string3 = bundle.getString(f127150n);
            return new a(uri).n(string).m(string2).p(i10).o(i11).l(string3).k(bundle.getString(f127151o)).i();
        }

        public a b() {
            return new a();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f127153b.equals(kVar.f127153b) && eh.o1.g(this.f127154c, kVar.f127154c) && eh.o1.g(this.f127155d, kVar.f127155d) && this.f127156e == kVar.f127156e && this.f127157f == kVar.f127157f && eh.o1.g(this.f127158g, kVar.f127158g) && eh.o1.g(this.f127159h, kVar.f127159h);
        }

        public int hashCode() {
            int iHashCode = this.f127153b.hashCode() * 31;
            String str = this.f127154c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f127155d;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f127156e) * 31) + this.f127157f) * 31;
            String str3 = this.f127158g;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f127159h;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // re.j
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f127145i, this.f127153b);
            String str = this.f127154c;
            if (str != null) {
                bundle.putString(f127146j, str);
            }
            String str2 = this.f127155d;
            if (str2 != null) {
                bundle.putString(f127147k, str2);
            }
            int i10 = this.f127156e;
            if (i10 != 0) {
                bundle.putInt(f127148l, i10);
            }
            int i11 = this.f127157f;
            if (i11 != 0) {
                bundle.putInt(f127149m, i11);
            }
            String str3 = this.f127158g;
            if (str3 != null) {
                bundle.putString(f127150n, str3);
            }
            String str4 = this.f127159h;
            if (str4 != null) {
                bundle.putString(f127151o, str4);
            }
            return bundle;
        }

        public k(Uri uri, String str, @Nullable String str2, int i10, int i11, @Nullable String str3, @Nullable String str4) {
            this.f127153b = uri;
            this.f127154c = str;
            this.f127155d = str2;
            this.f127156e = i10;
            this.f127157f = i11;
            this.f127158g = str3;
            this.f127159h = str4;
        }

        public k(a aVar) {
            this.f127153b = aVar.f127160a;
            this.f127154c = aVar.f127161b;
            this.f127155d = aVar.f127162c;
            this.f127156e = aVar.f127163d;
            this.f127157f = aVar.f127164e;
            this.f127158g = aVar.f127165f;
            this.f127159h = aVar.f127166g;
        }
    }

    public x2(String str, e eVar, @Nullable h hVar, g gVar, h3 h3Var, i iVar) {
        this.f127027b = str;
        this.f127028c = hVar;
        this.f127029d = hVar;
        this.f127030e = gVar;
        this.f127031f = h3Var;
        this.f127032g = eVar;
        this.f127033h = eVar;
        this.f127034i = iVar;
    }
}
