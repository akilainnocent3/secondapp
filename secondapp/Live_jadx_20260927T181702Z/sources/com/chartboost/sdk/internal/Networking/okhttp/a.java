package com.chartboost.sdk.internal.Networking.okhttp;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import dr.v1;
import fr.n1;
import java.util.Map;
import kotlin.jvm.internal.x;
import ql.g0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f41805c = new d(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f41806d = n1.W(v1.a(400, "Bad Request"), v1.a(401, "Unauthorized"), v1.a(403, "Forbidden"), v1.a(404, "Not Found"), v1.a(408, "Request Timeout"), v1.a(409, "Conflict"), v1.a(Integer.valueOf(CommonGatewayClient.CODE_TOO_MANY_REQUESTS), "Too Many Requests"), v1.a(500, "Internal Server Error"), v1.a(502, "Bad Gateway"), v1.a(503, "Service Unavailable"), v1.a(504, "Gateway Timeout"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41807b;

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0416a extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C0416a f41808e = new C0416a();

        public C0416a() {
            super(502, a.f41805c.a(502), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0416a);
        }

        public int hashCode() {
            return -1600884457;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BadGateway";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f41809e = new b();

        public b() {
            super(400, a.f41805c.a(400), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -316072606;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BadRequest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f41810e;

        public c(int i10) {
            super(i10, a.f41805c.a(i10), null);
            this.f41810e = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f41810e == ((c) obj).f41810e;
        }

        public int hashCode() {
            return this.f41810e;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ClientError(status=" + this.f41810e + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {
        public /* synthetic */ d(x xVar) {
            this();
        }

        public final a b(int i10) {
            if (i10 == 400) {
                return b.f41809e;
            }
            if (i10 == 401) {
                return n.f41820e;
            }
            if (i10 == 403) {
                return f.f41812e;
            }
            if (i10 == 404) {
                return i.f41815e;
            }
            if (i10 == 408) {
                return j.f41816e;
            }
            if (i10 == 409) {
                return e.f41811e;
            }
            if (i10 == 429) {
                return m.f41819e;
            }
            if (i10 == 500) {
                return h.f41814e;
            }
            if (i10 == 502) {
                return C0416a.f41808e;
            }
            if (i10 == 503) {
                return l.f41818e;
            }
            if (i10 == 504) {
                return g.f41813e;
            }
            if (400 > i10 || i10 >= 500) {
                return (500 > i10 || i10 >= 600) ? new o(i10) : new k(i10);
            }
            return new c(i10);
        }

        public d() {
        }

        public final String a(int i10) {
            String str = (String) a.f41806d.get(Integer.valueOf(i10));
            if (str == null) {
                str = "Unknown";
            }
            return "HTTP " + i10 + " " + str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f41811e = new e();

        public e() {
            super(409, a.f41805c.a(409), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 488153194;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Conflict";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final f f41812e = new f();

        public f() {
            super(403, a.f41805c.a(403), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 258062945;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Forbidden";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final g f41813e = new g();

        public g() {
            super(504, a.f41805c.a(504), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -1275433707;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "GatewayTimeout";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h f41814e = new h();

        public h() {
            super(500, a.f41805c.a(500), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 693189104;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return g0.f122411o;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class i extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final i f41815e = new i();

        public i() {
            super(404, a.f41805c.a(404), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return -1673446137;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NotFound";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class j extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final j f41816e = new j();

        public j() {
            super(408, a.f41805c.a(408), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return -1845205398;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "RequestTimeout";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class k extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f41817e;

        public k(int i10) {
            super(i10, a.f41805c.a(i10), null);
            this.f41817e = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f41817e == ((k) obj).f41817e;
        }

        public int hashCode() {
            return this.f41817e;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ServerError(status=" + this.f41817e + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class l extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final l f41818e = new l();

        public l() {
            super(503, a.f41805c.a(503), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public int hashCode() {
            return 315784435;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ServiceUnavailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class m extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final m f41819e = new m();

        public m() {
            super(CommonGatewayClient.CODE_TOO_MANY_REQUESTS, a.f41805c.a(CommonGatewayClient.CODE_TOO_MANY_REQUESTS), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public int hashCode() {
            return 1422549791;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "TooManyRequests";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class n extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final n f41820e = new n();

        public n() {
            super(401, a.f41805c.a(401), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public int hashCode() {
            return 36815244;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unauthorized";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class o extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f41821e;

        public o(int i10) {
            super(i10, a.f41805c.a(i10), null);
            this.f41821e = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f41821e == ((o) obj).f41821e;
        }

        public int hashCode() {
            return this.f41821e;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unknown(status=" + this.f41821e + gi.j.f86771d;
        }
    }

    public /* synthetic */ a(int i10, String str, x xVar) {
        this(i10, str);
    }

    public final int b() {
        return this.f41807b;
    }

    public a(int i10, String str) {
        super(str);
        this.f41807b = i10;
    }
}
