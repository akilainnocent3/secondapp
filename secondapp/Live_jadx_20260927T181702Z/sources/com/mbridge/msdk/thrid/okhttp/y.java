package com.mbridge.msdk.thrid.okhttp;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s f70125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f70126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final r f70127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @zq.h
    final z f70128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Map<Class<?>, Object> f70129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @zq.h
    private volatile c f70130f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @zq.h
        s f70131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f70132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        r.a f70133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @zq.h
        z f70134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Map<Class<?>, Object> f70135e;

        public a() {
            this.f70135e = Collections.EMPTY_MAP;
            this.f70132b = "GET";
            this.f70133c = new r.a();
        }

        public a a(s sVar) {
            if (sVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f70131a = sVar;
            return this;
        }

        public a b(String str) {
            String str2;
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str2 = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str2 = "https:" + str.substring(4);
            } else {
                str2 = str;
            }
            return a(s.b(str2));
        }

        public a c() {
            return a("GET", (z) null);
        }

        public a d() {
            return a("HEAD", (z) null);
        }

        public a c(z zVar) {
            return a("POST", zVar);
        }

        public a d(z zVar) {
            return a("PUT", zVar);
        }

        public a a(String str, String str2) {
            this.f70133c.a(str, str2);
            return this;
        }

        public a a(String str) {
            this.f70133c.b(str);
            return this;
        }

        public a(y yVar) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.f70135e = map;
            this.f70131a = yVar.f70125a;
            this.f70132b = yVar.f70126b;
            this.f70134d = yVar.f70128d;
            this.f70135e = yVar.f70129e.isEmpty() ? map : new LinkedHashMap<>(yVar.f70129e);
            this.f70133c = yVar.f70127c.a();
        }

        public a a(r rVar) {
            this.f70133c = rVar.a();
            return this;
        }

        public a a(c cVar) {
            String string = cVar.toString();
            return string.isEmpty() ? a("Cache-Control") : b("Cache-Control", string);
        }

        public a b(String str, String str2) {
            this.f70133c.c(str, str2);
            return this;
        }

        public a b() {
            return a(com.mbridge.msdk.thrid.okhttp.internal.c.f69625d);
        }

        public a a(@zq.h z zVar) {
            return a("DELETE", zVar);
        }

        public a b(z zVar) {
            return a("PATCH", zVar);
        }

        public a a(String str, @zq.h z zVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (zVar != null && !com.mbridge.msdk.thrid.okhttp.internal.http.f.a(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                    if (zVar == null && com.mbridge.msdk.thrid.okhttp.internal.http.f.d(str)) {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    }
                    this.f70132b = str;
                    this.f70134d = zVar;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public y a() {
            if (this.f70131a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    public y(a aVar) {
        this.f70125a = aVar.f70131a;
        this.f70126b = aVar.f70132b;
        this.f70127c = aVar.f70133c.a();
        this.f70128d = aVar.f70134d;
        this.f70129e = com.mbridge.msdk.thrid.okhttp.internal.c.a(aVar.f70135e);
    }

    @zq.h
    public String a(String str) {
        return this.f70127c.b(str);
    }

    public c b() {
        c cVar = this.f70130f;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f70127c);
        this.f70130f = cVarA;
        return cVarA;
    }

    public r c() {
        return this.f70127c;
    }

    public boolean d() {
        return this.f70125a.h();
    }

    public String e() {
        return this.f70126b;
    }

    public a f() {
        return new a(this);
    }

    public s g() {
        return this.f70125a;
    }

    public String toString() {
        return "Request{method=" + this.f70126b + ", url=" + this.f70125a + ", tags=" + this.f70129e + fw.b.f85383j;
    }

    @zq.h
    public z a() {
        return this.f70128d;
    }
}
