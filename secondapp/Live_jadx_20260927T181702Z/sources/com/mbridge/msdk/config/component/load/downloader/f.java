package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f65500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f65501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f65502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f65503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f65504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f65505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f65506g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f65507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f65508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f65509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f65510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f65511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f65512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f65513g;

        public b() {
            this(null);
        }

        public b(f fVar) {
            this.f65507a = 20000L;
            this.f65508b = 10L;
            this.f65509c = 20000L;
            this.f65510d = 20000L;
            this.f65511e = 64;
            this.f65512f = 20;
            this.f65513g = 10;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(fVar)) {
                this.f65509c = fVar.c();
                this.f65507a = fVar.a();
                this.f65511e = fVar.f();
                this.f65510d = fVar.d();
                this.f65512f = fVar.g();
                this.f65508b = fVar.b();
                this.f65513g = fVar.e();
            }
        }

        public f a() {
            return new f(this);
        }

        public b a(int i10) {
            this.f65513g = i10;
            return this;
        }
    }

    public long a() {
        return this.f65500a;
    }

    public long b() {
        return this.f65501b;
    }

    public long c() {
        return this.f65502c;
    }

    public long d() {
        return this.f65503d;
    }

    public int e() {
        return this.f65506g;
    }

    public int f() {
        return this.f65504e;
    }

    public int g() {
        return this.f65505f;
    }

    private f(b bVar) {
        this.f65500a = bVar.f65507a;
        this.f65502c = bVar.f65509c;
        this.f65503d = bVar.f65510d;
        this.f65504e = bVar.f65511e;
        this.f65505f = bVar.f65512f;
        this.f65501b = bVar.f65508b;
        this.f65506g = bVar.f65513g;
    }
}
