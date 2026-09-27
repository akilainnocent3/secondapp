package jw;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.vungle.ads.internal.ui.AdActivity;
import dr.g1;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class n0 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final l0 f101321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final k0 f101322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final String f101323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f101324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    public final y f101325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public final a0 f101326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public final o0 f101327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.m
    public final n0 f101328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.m
    public final n0 f101329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oy.m
    public final n0 f101330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f101331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f101332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @oy.m
    public final pw.i f101333n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @oy.l
    public s0 f101334o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @oy.m
    public d f101335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f101336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f101337r;

    public n0(@oy.l l0 request, @oy.l k0 protocol, @oy.l String message, int i10, @oy.m y yVar, @oy.l a0 headers, @oy.l o0 body, @oy.m n0 n0Var, @oy.m n0 n0Var2, @oy.m n0 n0Var3, long j10, long j11, @oy.m pw.i iVar, @oy.l s0 trailersSource) {
        kotlin.jvm.internal.m0.p(request, "request");
        kotlin.jvm.internal.m0.p(protocol, "protocol");
        kotlin.jvm.internal.m0.p(message, "message");
        kotlin.jvm.internal.m0.p(headers, "headers");
        kotlin.jvm.internal.m0.p(body, "body");
        kotlin.jvm.internal.m0.p(trailersSource, "trailersSource");
        this.f101321b = request;
        this.f101322c = protocol;
        this.f101323d = message;
        this.f101324e = i10;
        this.f101325f = yVar;
        this.f101326g = headers;
        this.f101327h = body;
        this.f101328i = n0Var;
        this.f101329j = n0Var2;
        this.f101330k = n0Var3;
        this.f101331l = j10;
        this.f101332m = j11;
        this.f101333n = iVar;
        this.f101334o = trailersSource;
        boolean z10 = true;
        this.f101336q = 200 <= i10 && i10 < 300;
        if (i10 != 307 && i10 != 308) {
            switch (i10) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    z10 = false;
                    break;
            }
        }
        this.f101337r = z10;
    }

    public static /* synthetic */ String Y(n0 n0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return n0Var.W(str, str2);
    }

    @oy.l
    public final a0 A0() throws IOException {
        return this.f101334o.get();
    }

    @cs.j(name = "-deprecated_sentRequestAtMillis")
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "sentRequestAtMillis", imports = {}))
    public final long D() {
        return this.f101331l;
    }

    @cs.j(name = "body")
    @oy.l
    public final o0 F() {
        return this.f101327h;
    }

    @cs.j(name = "cacheControl")
    @oy.l
    public final d G() {
        d dVar = this.f101335p;
        if (dVar != null) {
            return dVar;
        }
        d dVarA = d.f101051n.a(this.f101326g);
        this.f101335p = dVarA;
        return dVarA;
    }

    @cs.j(name = "cacheResponse")
    @oy.m
    public final n0 H() {
        return this.f101329j;
    }

    @oy.l
    public final List<i> I() {
        String str;
        a0 a0Var = this.f101326g;
        int i10 = this.f101324e;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return fr.h0.J();
            }
            str = "Proxy-Authenticate";
        }
        return qw.f.b(a0Var, str);
    }

    @cs.j(name = gp.e.f87280s)
    public final int L() {
        return this.f101324e;
    }

    @cs.j(name = "exchange")
    @oy.m
    public final pw.i N() {
        return this.f101333n;
    }

    @oy.m
    public final d O() {
        return this.f101335p;
    }

    @cs.j(name = "handshake")
    @oy.m
    public final y S() {
        return this.f101325f;
    }

    @cs.k
    @oy.m
    public final String U(@oy.l String name) {
        kotlin.jvm.internal.m0.p(name, "name");
        return Y(this, name, null, 2, null);
    }

    @cs.k
    @oy.m
    public final String W(@oy.l String name, @oy.m String str) {
        kotlin.jvm.internal.m0.p(name, "name");
        String strF = this.f101326g.f(name);
        return strF == null ? str : strF;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f101327h.close();
    }

    @cs.j(name = "-deprecated_body")
    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "body", imports = {}))
    public final o0 d() {
        return this.f101327h;
    }

    @oy.l
    public final List<String> d0(@oy.l String name) {
        kotlin.jvm.internal.m0.p(name, "name");
        return this.f101326g.s(name);
    }

    @cs.j(name = eq.c.f81518h)
    @oy.l
    public final a0 e0() {
        return this.f101326g;
    }

    public final boolean f0() {
        return this.f101337r;
    }

    @cs.j(name = PglCryptUtils.KEY_MESSAGE)
    @oy.l
    public final String g0() {
        return this.f101323d;
    }

    @cs.j(name = "-deprecated_cacheControl")
    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "cacheControl", imports = {}))
    public final d h() {
        return G();
    }

    public final boolean isSuccessful() {
        return this.f101336q;
    }

    @cs.j(name = "networkResponse")
    @oy.m
    public final n0 j0() {
        return this.f101328i;
    }

    @cs.j(name = "-deprecated_cacheResponse")
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "cacheResponse", imports = {}))
    @oy.m
    public final n0 k() {
        return this.f101329j;
    }

    @cs.j(name = "-deprecated_code")
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = gp.e.f87280s, imports = {}))
    public final int l() {
        return this.f101324e;
    }

    @oy.l
    public final a l0() {
        return new a(this);
    }

    @cs.j(name = "-deprecated_handshake")
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "handshake", imports = {}))
    @oy.m
    public final y m() {
        return this.f101325f;
    }

    @oy.l
    public final o0 m0(long j10) throws IOException {
        fx.n nVarPeek = this.f101327h.source().peek();
        fx.l lVar = new fx.l();
        nVarPeek.request(j10);
        lVar.R(nVarPeek, Math.min(j10, nVarPeek.getBuffer().size()));
        return o0.Companion.a(lVar, this.f101327h.contentType(), lVar.size());
    }

    @cs.j(name = "-deprecated_headers")
    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = eq.c.f81518h, imports = {}))
    public final a0 n() {
        return this.f101326g;
    }

    @oy.m
    public final a0 n0() throws IOException {
        return this.f101334o.peek();
    }

    @cs.j(name = "-deprecated_message")
    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = PglCryptUtils.KEY_MESSAGE, imports = {}))
    public final String o() {
        return this.f101323d;
    }

    @cs.j(name = "priorResponse")
    @oy.m
    public final n0 o0() {
        return this.f101330k;
    }

    @cs.j(name = "-deprecated_networkResponse")
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "networkResponse", imports = {}))
    @oy.m
    public final n0 p() {
        return this.f101328i;
    }

    @cs.j(name = "protocol")
    @oy.l
    public final k0 p0() {
        return this.f101322c;
    }

    @cs.j(name = "-deprecated_priorResponse")
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "priorResponse", imports = {}))
    @oy.m
    public final n0 q() {
        return this.f101330k;
    }

    @cs.j(name = "-deprecated_protocol")
    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "protocol", imports = {}))
    public final k0 r() {
        return this.f101322c;
    }

    @cs.j(name = "-deprecated_receivedResponseAtMillis")
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "receivedResponseAtMillis", imports = {}))
    public final long t() {
        return this.f101332m;
    }

    @oy.l
    public String toString() {
        return "Response{protocol=" + this.f101322c + ", code=" + this.f101324e + ", message=" + this.f101323d + ", url=" + this.f101321b.t() + fw.b.f85383j;
    }

    @cs.j(name = "receivedResponseAtMillis")
    public final long v0() {
        return this.f101332m;
    }

    @cs.j(name = AdActivity.REQUEST_KEY_EXTRA)
    @oy.l
    public final l0 w0() {
        return this.f101321b;
    }

    @cs.j(name = "-deprecated_request")
    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = AdActivity.REQUEST_KEY_EXTRA, imports = {}))
    public final l0 y() {
        return this.f101321b;
    }

    @cs.j(name = "sentRequestAtMillis")
    public final long y0() {
        return this.f101331l;
    }

    public final void z0(@oy.m d dVar) {
        this.f101335p = dVar;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,517:1\n1#2:518\n*E\n"})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        public l0 f101338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        public k0 f101339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.m
        public String f101341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oy.m
        public y f101342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @oy.l
        public a0.a f101343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @oy.l
        public o0 f101344g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @oy.m
        public n0 f101345h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @oy.m
        public n0 f101346i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @oy.m
        public n0 f101347j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f101348k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f101349l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @oy.m
        public pw.i f101350m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @oy.l
        public s0 f101351n;

        public a() {
            this.f101340c = -1;
            this.f101344g = o0.EMPTY;
            this.f101351n = s0.f101411b;
            this.f101343f = new a0.a();
        }

        @oy.l
        public a A(@oy.m n0 n0Var) {
            this.f101347j = n0Var;
            return this;
        }

        @oy.l
        public a B(@oy.l k0 protocol) {
            kotlin.jvm.internal.m0.p(protocol, "protocol");
            this.f101339b = protocol;
            return this;
        }

        @oy.l
        public a C(long j10) {
            this.f101349l = j10;
            return this;
        }

        @oy.l
        public a D(@oy.l String name) {
            kotlin.jvm.internal.m0.p(name, "name");
            this.f101343f.l(name);
            return this;
        }

        @oy.l
        public a E(@oy.l l0 request) {
            kotlin.jvm.internal.m0.p(request, "request");
            this.f101338a = request;
            return this;
        }

        @oy.l
        public a F(long j10) {
            this.f101348k = j10;
            return this;
        }

        public final void G(@oy.l o0 o0Var) {
            kotlin.jvm.internal.m0.p(o0Var, "<set-?>");
            this.f101344g = o0Var;
        }

        public final void H(@oy.m n0 n0Var) {
            this.f101346i = n0Var;
        }

        public final void I(int i10) {
            this.f101340c = i10;
        }

        public final void J(@oy.m pw.i iVar) {
            this.f101350m = iVar;
        }

        public final void K(@oy.m y yVar) {
            this.f101342e = yVar;
        }

        public final void L(@oy.l a0.a aVar) {
            kotlin.jvm.internal.m0.p(aVar, "<set-?>");
            this.f101343f = aVar;
        }

        public final void M(@oy.m String str) {
            this.f101341d = str;
        }

        public final void N(@oy.m n0 n0Var) {
            this.f101345h = n0Var;
        }

        public final void O(@oy.m n0 n0Var) {
            this.f101347j = n0Var;
        }

        public final void P(@oy.m k0 k0Var) {
            this.f101339b = k0Var;
        }

        public final void Q(long j10) {
            this.f101349l = j10;
        }

        public final void R(@oy.m l0 l0Var) {
            this.f101338a = l0Var;
        }

        public final void S(long j10) {
            this.f101348k = j10;
        }

        public final void T(@oy.l s0 s0Var) {
            kotlin.jvm.internal.m0.p(s0Var, "<set-?>");
            this.f101351n = s0Var;
        }

        @oy.l
        public a U(@oy.l s0 trailersSource) {
            kotlin.jvm.internal.m0.p(trailersSource, "trailersSource");
            this.f101351n = trailersSource;
            return this;
        }

        @oy.l
        public a a(@oy.l String name, @oy.l String value) {
            kotlin.jvm.internal.m0.p(name, "name");
            kotlin.jvm.internal.m0.p(value, "value");
            this.f101343f.b(name, value);
            return this;
        }

        @oy.l
        public a b(@oy.l o0 body) {
            kotlin.jvm.internal.m0.p(body, "body");
            this.f101344g = body;
            return this;
        }

        @oy.l
        public n0 c() {
            int i10 = this.f101340c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f101340c).toString());
            }
            l0 l0Var = this.f101338a;
            if (l0Var == null) {
                throw new IllegalStateException("request == null");
            }
            k0 k0Var = this.f101339b;
            if (k0Var == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f101341d;
            if (str != null) {
                return new n0(l0Var, k0Var, str, i10, this.f101342e, this.f101343f.i(), this.f101344g, this.f101345h, this.f101346i, this.f101347j, this.f101348k, this.f101349l, this.f101350m, this.f101351n);
            }
            throw new IllegalStateException("message == null");
        }

        @oy.l
        public a d(@oy.m n0 n0Var) {
            e("cacheResponse", n0Var);
            this.f101346i = n0Var;
            return this;
        }

        public final void e(String str, n0 n0Var) {
            if (n0Var != null) {
                if (n0Var.j0() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (n0Var.H() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (n0Var.o0() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        @oy.l
        public a f(int i10) {
            this.f101340c = i10;
            return this;
        }

        @oy.l
        public final o0 g() {
            return this.f101344g;
        }

        @oy.m
        public final n0 h() {
            return this.f101346i;
        }

        public final int i() {
            return this.f101340c;
        }

        @oy.m
        public final pw.i j() {
            return this.f101350m;
        }

        @oy.m
        public final y k() {
            return this.f101342e;
        }

        @oy.l
        public final a0.a l() {
            return this.f101343f;
        }

        @oy.m
        public final String m() {
            return this.f101341d;
        }

        @oy.m
        public final n0 n() {
            return this.f101345h;
        }

        @oy.m
        public final n0 o() {
            return this.f101347j;
        }

        @oy.m
        public final k0 p() {
            return this.f101339b;
        }

        public final long q() {
            return this.f101349l;
        }

        @oy.m
        public final l0 r() {
            return this.f101338a;
        }

        public final long s() {
            return this.f101348k;
        }

        @oy.l
        public final s0 t() {
            return this.f101351n;
        }

        @oy.l
        public a u(@oy.m y yVar) {
            this.f101342e = yVar;
            return this;
        }

        @oy.l
        public a v(@oy.l String name, @oy.l String value) {
            kotlin.jvm.internal.m0.p(name, "name");
            kotlin.jvm.internal.m0.p(value, "value");
            this.f101343f.m(name, value);
            return this;
        }

        @oy.l
        public a w(@oy.l a0 headers) {
            kotlin.jvm.internal.m0.p(headers, "headers");
            this.f101343f = headers.m();
            return this;
        }

        public final void x(@oy.l pw.i exchange) {
            kotlin.jvm.internal.m0.p(exchange, "exchange");
            this.f101350m = exchange;
        }

        @oy.l
        public a y(@oy.l String message) {
            kotlin.jvm.internal.m0.p(message, "message");
            this.f101341d = message;
            return this;
        }

        @oy.l
        public a z(@oy.m n0 n0Var) {
            e("networkResponse", n0Var);
            this.f101345h = n0Var;
            return this;
        }

        public a(@oy.l n0 response) {
            kotlin.jvm.internal.m0.p(response, "response");
            this.f101340c = -1;
            this.f101344g = o0.EMPTY;
            this.f101351n = s0.f101411b;
            this.f101338a = response.w0();
            this.f101339b = response.p0();
            this.f101340c = response.L();
            this.f101341d = response.g0();
            this.f101342e = response.S();
            this.f101343f = response.e0().m();
            this.f101344g = response.F();
            this.f101345h = response.j0();
            this.f101346i = response.H();
            this.f101347j = response.o0();
            this.f101348k = response.y0();
            this.f101349l = response.v0();
            this.f101350m = response.N();
            this.f101351n = response.f101334o;
        }
    }
}
