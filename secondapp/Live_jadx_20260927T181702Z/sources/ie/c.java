package ie;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f90600c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f90601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f90602b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f90603a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f90604b = b.REASON_UNKNOWN;

        public c a() {
            return new c(this.f90603a, this.f90604b);
        }

        public a b(long j10) {
            this.f90603a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f90604b = bVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b implements xk.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f90613b;

        b(int i10) {
            this.f90613b = i10;
        }

        @Override // xk.c
        public int getNumber() {
            return this.f90613b;
        }
    }

    public c(long j10, b bVar) {
        this.f90601a = j10;
        this.f90602b = bVar;
    }

    public static c a() {
        return f90600c;
    }

    public static a d() {
        return new a();
    }

    @xk.d(tag = 1)
    public long b() {
        return this.f90601a;
    }

    @xk.d(tag = 3)
    public b c() {
        return this.f90602b;
    }
}
