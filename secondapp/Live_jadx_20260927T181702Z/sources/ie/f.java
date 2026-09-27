package ie;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f90624c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f90625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f90626b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f90627a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f90628b = 0;

        public f a() {
            return new f(this.f90627a, this.f90628b);
        }

        public a b(long j10) {
            this.f90628b = j10;
            return this;
        }

        public a c(long j10) {
            this.f90627a = j10;
            return this;
        }
    }

    public f(long j10, long j11) {
        this.f90625a = j10;
        this.f90626b = j11;
    }

    public static f a() {
        return f90624c;
    }

    public static a d() {
        return new a();
    }

    @xk.d(tag = 2)
    public long b() {
        return this.f90626b;
    }

    @xk.d(tag = 1)
    public long c() {
        return this.f90625a;
    }
}
