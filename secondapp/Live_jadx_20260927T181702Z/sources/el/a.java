package el;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f81353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f81354c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f81355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f81356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f81357c;

        @Override // el.p.a
        public p a() {
            String str = "";
            if (this.f81355a == null) {
                str = " token";
            }
            if (this.f81356b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f81357c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f81355a, this.f81356b.longValue(), this.f81357c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // el.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f81355a = str;
            return this;
        }

        @Override // el.p.a
        public p.a c(long j10) {
            this.f81357c = Long.valueOf(j10);
            return this;
        }

        @Override // el.p.a
        public p.a d(long j10) {
            this.f81356b = Long.valueOf(j10);
            return this;
        }

        public b() {
        }

        public b(p pVar) {
            this.f81355a = pVar.b();
            this.f81356b = Long.valueOf(pVar.d());
            this.f81357c = Long.valueOf(pVar.c());
        }
    }

    @Override // el.p
    @NonNull
    public String b() {
        return this.f81352a;
    }

    @Override // el.p
    @NonNull
    public long c() {
        return this.f81354c;
    }

    @Override // el.p
    @NonNull
    public long d() {
        return this.f81353b;
    }

    @Override // el.p
    public p.a e() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f81352a.equals(pVar.b()) && this.f81353b == pVar.d() && this.f81354c == pVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f81352a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f81353b;
        long j11 = this.f81354c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f81352a + ", tokenExpirationTimestamp=" + this.f81353b + ", tokenCreationTimestamp=" + this.f81354c + "}";
    }

    public a(String str, long j10, long j11) {
        this.f81352a = str;
        this.f81353b = j10;
        this.f81354c = j11;
    }
}
