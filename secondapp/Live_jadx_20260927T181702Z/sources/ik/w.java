package ik;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends f0.f.d.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.f.d.e.b f94821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f94824d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f0.f.d.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f0.f.d.e.b f94825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f94826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f94827c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f94828d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f94829e;

        @Override // ik.f0.f.d.e.a
        public f0.f.d.e a() {
            f0.f.d.e.b bVar;
            String str;
            String str2;
            if (this.f94829e == 1 && (bVar = this.f94825a) != null && (str = this.f94826b) != null && (str2 = this.f94827c) != null) {
                return new w(bVar, str, str2, this.f94828d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f94825a == null) {
                sb2.append(" rolloutVariant");
            }
            if (this.f94826b == null) {
                sb2.append(" parameterKey");
            }
            if (this.f94827c == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f94829e) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // ik.f0.f.d.e.a
        public f0.f.d.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f94826b = str;
            return this;
        }

        @Override // ik.f0.f.d.e.a
        public f0.f.d.e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f94827c = str;
            return this;
        }

        @Override // ik.f0.f.d.e.a
        public f0.f.d.e.a d(f0.f.d.e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f94825a = bVar;
            return this;
        }

        @Override // ik.f0.f.d.e.a
        public f0.f.d.e.a e(long j10) {
            this.f94828d = j10;
            this.f94829e = (byte) (this.f94829e | 1);
            return this;
        }
    }

    @Override // ik.f0.f.d.e
    @NonNull
    public String b() {
        return this.f94822b;
    }

    @Override // ik.f0.f.d.e
    @NonNull
    public String c() {
        return this.f94823c;
    }

    @Override // ik.f0.f.d.e
    @NonNull
    public f0.f.d.e.b d() {
        return this.f94821a;
    }

    @Override // ik.f0.f.d.e
    @NonNull
    public long e() {
        return this.f94824d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.e) {
            f0.f.d.e eVar = (f0.f.d.e) obj;
            if (this.f94821a.equals(eVar.d()) && this.f94822b.equals(eVar.b()) && this.f94823c.equals(eVar.c()) && this.f94824d == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.f94821a.hashCode() ^ 1000003) * 1000003) ^ this.f94822b.hashCode()) * 1000003) ^ this.f94823c.hashCode()) * 1000003;
        long j10 = this.f94824d;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f94821a + ", parameterKey=" + this.f94822b + ", parameterValue=" + this.f94823c + ", templateVersion=" + this.f94824d + "}";
    }

    public w(f0.f.d.e.b bVar, String str, String str2, long j10) {
        this.f94821a = bVar;
        this.f94822b = str;
        this.f94823c = str2;
        this.f94824d = j10;
    }
}
