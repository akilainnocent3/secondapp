package com.mbridge.msdk.thrid.okhttp;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class a0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y f69471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final w f69472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f69473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f69474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @zq.h
    final q f69475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final r f69476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @zq.h
    final b0 f69477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @zq.h
    final a0 f69478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @zq.h
    final a0 f69479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @zq.h
    final a0 f69480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final long f69481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final long f69482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @zq.h
    private volatile c f69483m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @zq.h
        y f69484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @zq.h
        w f69485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f69486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f69487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @zq.h
        q f69488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        r.a f69489f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @zq.h
        b0 f69490g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @zq.h
        a0 f69491h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @zq.h
        a0 f69492i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @zq.h
        a0 f69493j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        long f69494k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f69495l;

        public a() {
            this.f69486c = -1;
            this.f69489f = new r.a();
        }

        public a a(y yVar) {
            this.f69484a = yVar;
            return this;
        }

        public a b(String str, String str2) {
            this.f69489f.c(str, str2);
            return this;
        }

        public a c(@zq.h a0 a0Var) {
            if (a0Var != null) {
                a("networkResponse", a0Var);
            }
            this.f69491h = a0Var;
            return this;
        }

        public a d(@zq.h a0 a0Var) {
            if (a0Var != null) {
                b(a0Var);
            }
            this.f69493j = a0Var;
            return this;
        }

        private void b(a0 a0Var) {
            if (a0Var.f69477g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(w wVar) {
            this.f69485b = wVar;
            return this;
        }

        public a a(int i10) {
            this.f69486c = i10;
            return this;
        }

        public a(a0 a0Var) {
            this.f69486c = -1;
            this.f69484a = a0Var.f69471a;
            this.f69485b = a0Var.f69472b;
            this.f69486c = a0Var.f69473c;
            this.f69487d = a0Var.f69474d;
            this.f69488e = a0Var.f69475e;
            this.f69489f = a0Var.f69476f.a();
            this.f69490g = a0Var.f69477g;
            this.f69491h = a0Var.f69478h;
            this.f69492i = a0Var.f69479i;
            this.f69493j = a0Var.f69480j;
            this.f69494k = a0Var.f69481k;
            this.f69495l = a0Var.f69482l;
        }

        public a a(String str) {
            this.f69487d = str;
            return this;
        }

        public a b(long j10) {
            this.f69494k = j10;
            return this;
        }

        public a a(@zq.h q qVar) {
            this.f69488e = qVar;
            return this;
        }

        public a a(String str, String str2) {
            this.f69489f.a(str, str2);
            return this;
        }

        public a a(r rVar) {
            this.f69489f = rVar.a();
            return this;
        }

        public a a(@zq.h b0 b0Var) {
            this.f69490g = b0Var;
            return this;
        }

        public a a(@zq.h a0 a0Var) {
            if (a0Var != null) {
                a("cacheResponse", a0Var);
            }
            this.f69492i = a0Var;
            return this;
        }

        private void a(String str, a0 a0Var) {
            if (a0Var.f69477g == null) {
                if (a0Var.f69478h == null) {
                    if (a0Var.f69479i == null) {
                        if (a0Var.f69480j == null) {
                            return;
                        }
                        throw new IllegalArgumentException(str + ".priorResponse != null");
                    }
                    throw new IllegalArgumentException(str + ".cacheResponse != null");
                }
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            throw new IllegalArgumentException(str + ".body != null");
        }

        public a a(long j10) {
            this.f69495l = j10;
            return this;
        }

        public a0 a() {
            if (this.f69484a != null) {
                if (this.f69485b != null) {
                    if (this.f69486c >= 0) {
                        if (this.f69487d != null) {
                            return new a0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f69486c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    public a0(a aVar) {
        this.f69471a = aVar.f69484a;
        this.f69472b = aVar.f69485b;
        this.f69473c = aVar.f69486c;
        this.f69474d = aVar.f69487d;
        this.f69475e = aVar.f69488e;
        this.f69476f = aVar.f69489f.a();
        this.f69477g = aVar.f69490g;
        this.f69478h = aVar.f69491h;
        this.f69479i = aVar.f69492i;
        this.f69480j = aVar.f69493j;
        this.f69481k = aVar.f69494k;
        this.f69482l = aVar.f69495l;
    }

    @zq.h
    public String a(String str, @zq.h String str2) {
        String strB = this.f69476f.b(str);
        return strB != null ? strB : str2;
    }

    @zq.h
    public String b(String str) {
        return a(str, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.f69477g;
        if (b0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        b0Var.close();
    }

    @zq.h
    public b0 d() {
        return this.f69477g;
    }

    public c h() {
        c cVar = this.f69483m;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f69476f);
        this.f69483m = cVarA;
        return cVarA;
    }

    public int k() {
        return this.f69473c;
    }

    @zq.h
    public q l() {
        return this.f69475e;
    }

    public r m() {
        return this.f69476f;
    }

    public boolean n() {
        int i10 = this.f69473c;
        return i10 >= 200 && i10 < 300;
    }

    public String o() {
        return this.f69474d;
    }

    public a p() {
        return new a(this);
    }

    @zq.h
    public a0 q() {
        return this.f69480j;
    }

    public long r() {
        return this.f69482l;
    }

    public y s() {
        return this.f69471a;
    }

    public long t() {
        return this.f69481k;
    }

    public String toString() {
        return "Response{protocol=" + this.f69472b + ", code=" + this.f69473c + ", message=" + this.f69474d + ", url=" + this.f69471a.g() + fw.b.f85383j;
    }
}
