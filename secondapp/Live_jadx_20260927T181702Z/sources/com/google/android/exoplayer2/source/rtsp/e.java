package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import cj.v6;
import cj.w6;
import cj.z7;
import eh.o1;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e {
    public static final String A = "Speed";
    public static final String B = "Supported";
    public static final String C = "Timestamp";
    public static final String D = "Transport";
    public static final String E = "User-Agent";
    public static final String F = "Via";
    public static final String G = "WWW-Authenticate";
    public static final e H = new b().e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f48998b = "Accept";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f48999c = "Allow";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f49000d = "Authorization";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f49001e = "Bandwidth";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f49002f = "Blocksize";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f49003g = "Cache-Control";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f49004h = "Connection";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f49005i = "Content-Base";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f49006j = "Content-Encoding";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f49007k = "Content-Language";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f49008l = "Content-Length";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f49009m = "Content-Location";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f49010n = "Content-Type";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f49011o = "CSeq";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f49012p = "Date";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f49013q = "Expires";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f49014r = "Location";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f49015s = "Proxy-Authenticate";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f49016t = "Proxy-Require";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f49017u = "Public";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f49018v = "Range";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f49019w = "RTP-Info";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f49020x = "RTCP-Interval";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f49021y = "Scale";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f49022z = "Session";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w6<String, String> f49023a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w6.a<String, String> f49024a;

        @qj.a
        public b b(String str, String str2) {
            this.f49024a.i(e.d(str.trim()), str2.trim());
            return this;
        }

        @qj.a
        public b c(List<String> list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                String[] strArrK1 = o1.K1(list.get(i10), ":\\s?");
                if (strArrK1.length == 2) {
                    b(strArrK1[0], strArrK1[1]);
                }
            }
            return this;
        }

        @qj.a
        public b d(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public e e() {
            return new e(this);
        }

        public b() {
            this.f49024a = new w6.a<>();
        }

        public b(String str, @Nullable String str2, int i10) {
            this();
            b("User-Agent", str);
            b(e.f49011o, String.valueOf(i10));
            if (str2 != null) {
                b(e.f49022z, str2);
            }
        }

        public b(w6.a<String, String> aVar) {
            this.f49024a = aVar;
        }
    }

    public static String d(String str) {
        if (zi.c.a(str, "Accept")) {
            return "Accept";
        }
        if (zi.c.a(str, "Allow")) {
            return "Allow";
        }
        if (zi.c.a(str, "Authorization")) {
            return "Authorization";
        }
        if (zi.c.a(str, "Bandwidth")) {
            return "Bandwidth";
        }
        if (zi.c.a(str, f49002f)) {
            return f49002f;
        }
        if (zi.c.a(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (zi.c.a(str, "Connection")) {
            return "Connection";
        }
        if (zi.c.a(str, f49005i)) {
            return f49005i;
        }
        if (zi.c.a(str, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (zi.c.a(str, "Content-Language")) {
            return "Content-Language";
        }
        if (zi.c.a(str, "Content-Length")) {
            return "Content-Length";
        }
        if (zi.c.a(str, "Content-Location")) {
            return "Content-Location";
        }
        if (zi.c.a(str, "Content-Type")) {
            return "Content-Type";
        }
        if (zi.c.a(str, f49011o)) {
            return f49011o;
        }
        if (zi.c.a(str, "Date")) {
            return "Date";
        }
        if (zi.c.a(str, "Expires")) {
            return "Expires";
        }
        if (zi.c.a(str, "Location")) {
            return "Location";
        }
        if (zi.c.a(str, "Proxy-Authenticate")) {
            return "Proxy-Authenticate";
        }
        if (zi.c.a(str, f49016t)) {
            return f49016t;
        }
        if (zi.c.a(str, f49017u)) {
            return f49017u;
        }
        if (zi.c.a(str, "Range")) {
            return "Range";
        }
        if (zi.c.a(str, f49019w)) {
            return f49019w;
        }
        if (zi.c.a(str, f49020x)) {
            return f49020x;
        }
        if (zi.c.a(str, f49021y)) {
            return f49021y;
        }
        if (zi.c.a(str, f49022z)) {
            return f49022z;
        }
        if (zi.c.a(str, A)) {
            return A;
        }
        if (zi.c.a(str, B)) {
            return B;
        }
        if (zi.c.a(str, C)) {
            return C;
        }
        if (zi.c.a(str, D)) {
            return D;
        }
        if (zi.c.a(str, "User-Agent")) {
            return "User-Agent";
        }
        if (zi.c.a(str, "Via")) {
            return "Via";
        }
        return zi.c.a(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public w6<String, String> b() {
        return this.f49023a;
    }

    public b c() {
        w6.a aVar = new w6.a();
        aVar.k(this.f49023a);
        return new b(aVar);
    }

    @Nullable
    public String e(String str) {
        v6<String> v6VarF = f(str);
        if (v6VarF.isEmpty()) {
            return null;
        }
        return (String) z7.w(v6VarF);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f49023a.equals(((e) obj).f49023a);
        }
        return false;
    }

    public v6<String> f(String str) {
        return this.f49023a.get(d(str));
    }

    public int hashCode() {
        return this.f49023a.hashCode();
    }

    public e(b bVar) {
        this.f49023a = bVar.f49024a.a();
    }
}
