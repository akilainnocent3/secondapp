package ie;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f90619c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f90620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f90621b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f90622a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f90623b = 0;

        public e a() {
            return new e(this.f90622a, this.f90623b);
        }

        public a b(long j10) {
            this.f90622a = j10;
            return this;
        }

        public a c(long j10) {
            this.f90623b = j10;
            return this;
        }
    }

    public e(long j10, long j11) {
        this.f90620a = j10;
        this.f90621b = j11;
    }

    public static e b() {
        return f90619c;
    }

    public static a d() {
        return new a();
    }

    @xk.d(tag = 1)
    public long a() {
        return this.f90620a;
    }

    @xk.d(tag = 2)
    public long c() {
        return this.f90621b;
    }
}
