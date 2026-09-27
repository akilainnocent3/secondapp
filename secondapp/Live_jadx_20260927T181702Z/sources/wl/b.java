package wl;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f143413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f143414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f143415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f143416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f143417k;

    /* JADX INFO: renamed from: wl.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1507b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f143418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f143419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f143420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f143421d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f143422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f143423f;

        @Override // wl.d.a
        public d a() {
            if (this.f143423f == 1 && this.f143418a != null && this.f143419b != null && this.f143420c != null && this.f143421d != null) {
                return new b(this.f143418a, this.f143419b, this.f143420c, this.f143421d, this.f143422e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f143418a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f143419b == null) {
                sb2.append(" variantId");
            }
            if (this.f143420c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f143421d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f143423f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // wl.d.a
        public d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f143420c = str;
            return this;
        }

        @Override // wl.d.a
        public d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f143421d = str;
            return this;
        }

        @Override // wl.d.a
        public d.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f143418a = str;
            return this;
        }

        @Override // wl.d.a
        public d.a e(long j10) {
            this.f143422e = j10;
            this.f143423f = (byte) (this.f143423f | 1);
            return this;
        }

        @Override // wl.d.a
        public d.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f143419b = str;
            return this;
        }
    }

    @Override // wl.d
    @NonNull
    public String d() {
        return this.f143415i;
    }

    @Override // wl.d
    @NonNull
    public String e() {
        return this.f143416j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f143413g.equals(dVar.f()) && this.f143414h.equals(dVar.h()) && this.f143415i.equals(dVar.d()) && this.f143416j.equals(dVar.e()) && this.f143417k == dVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // wl.d
    @NonNull
    public String f() {
        return this.f143413g;
    }

    @Override // wl.d
    public long g() {
        return this.f143417k;
    }

    @Override // wl.d
    @NonNull
    public String h() {
        return this.f143414h;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f143413g.hashCode() ^ 1000003) * 1000003) ^ this.f143414h.hashCode()) * 1000003) ^ this.f143415i.hashCode()) * 1000003) ^ this.f143416j.hashCode()) * 1000003;
        long j10 = this.f143417k;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f143413g + ", variantId=" + this.f143414h + ", parameterKey=" + this.f143415i + ", parameterValue=" + this.f143416j + ", templateVersion=" + this.f143417k + "}";
    }

    public b(String str, String str2, String str3, String str4, long j10) {
        this.f143413g = str;
        this.f143414h = str2;
        this.f143415i = str3;
        this.f143416j = str4;
        this.f143417k = j10;
    }
}
