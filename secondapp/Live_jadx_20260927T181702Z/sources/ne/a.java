package ne;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f116442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f116443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f116444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f116445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f116446k;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f116447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f116448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f116449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f116450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f116451e;

        @Override // ne.e.a
        public e a() {
            String str = "";
            if (this.f116447a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f116448b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f116449c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f116450d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f116451e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f116447a.longValue(), this.f116448b.intValue(), this.f116449c.intValue(), this.f116450d.longValue(), this.f116451e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ne.e.a
        public e.a b(int i10) {
            this.f116449c = Integer.valueOf(i10);
            return this;
        }

        @Override // ne.e.a
        public e.a c(long j10) {
            this.f116450d = Long.valueOf(j10);
            return this;
        }

        @Override // ne.e.a
        public e.a d(int i10) {
            this.f116448b = Integer.valueOf(i10);
            return this;
        }

        @Override // ne.e.a
        public e.a e(int i10) {
            this.f116451e = Integer.valueOf(i10);
            return this;
        }

        @Override // ne.e.a
        public e.a f(long j10) {
            this.f116447a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // ne.e
    public int b() {
        return this.f116444i;
    }

    @Override // ne.e
    public long c() {
        return this.f116445j;
    }

    @Override // ne.e
    public int d() {
        return this.f116443h;
    }

    @Override // ne.e
    public int e() {
        return this.f116446k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f116442g == eVar.f() && this.f116443h == eVar.d() && this.f116444i == eVar.b() && this.f116445j == eVar.c() && this.f116446k == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // ne.e
    public long f() {
        return this.f116442g;
    }

    public int hashCode() {
        long j10 = this.f116442g;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f116443h) * 1000003) ^ this.f116444i) * 1000003;
        long j11 = this.f116445j;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f116446k;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f116442g + ", loadBatchSize=" + this.f116443h + ", criticalSectionEnterTimeoutMs=" + this.f116444i + ", eventCleanUpAge=" + this.f116445j + ", maxBlobByteSizePerRow=" + this.f116446k + "}";
    }

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f116442g = j10;
        this.f116443h = i10;
        this.f116444i = i11;
        this.f116445j = j11;
        this.f116446k = i12;
    }
}
