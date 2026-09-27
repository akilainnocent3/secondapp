package il;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f94846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f94847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f94848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f94849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f94850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f94851h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f94852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.a f94853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f94854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f94855d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f94856e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f94857f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f94858g;

        @Override // il.d.a
        public d a() {
            String str = "";
            if (this.f94853b == null) {
                str = " registrationStatus";
            }
            if (this.f94856e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f94857f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f94852a, this.f94853b, this.f94854c, this.f94855d, this.f94856e.longValue(), this.f94857f.longValue(), this.f94858g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // il.d.a
        public d.a b(@Nullable String str) {
            this.f94854c = str;
            return this;
        }

        @Override // il.d.a
        public d.a c(long j10) {
            this.f94856e = Long.valueOf(j10);
            return this;
        }

        @Override // il.d.a
        public d.a d(String str) {
            this.f94852a = str;
            return this;
        }

        @Override // il.d.a
        public d.a e(@Nullable String str) {
            this.f94858g = str;
            return this;
        }

        @Override // il.d.a
        public d.a f(@Nullable String str) {
            this.f94855d = str;
            return this;
        }

        @Override // il.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f94853b = aVar;
            return this;
        }

        @Override // il.d.a
        public d.a h(long j10) {
            this.f94857f = Long.valueOf(j10);
            return this;
        }

        public b() {
        }

        public b(d dVar) {
            this.f94852a = dVar.d();
            this.f94853b = dVar.g();
            this.f94854c = dVar.b();
            this.f94855d = dVar.f();
            this.f94856e = Long.valueOf(dVar.c());
            this.f94857f = Long.valueOf(dVar.h());
            this.f94858g = dVar.e();
        }
    }

    @Override // il.d
    @Nullable
    public String b() {
        return this.f94847d;
    }

    @Override // il.d
    public long c() {
        return this.f94849f;
    }

    @Override // il.d
    @Nullable
    public String d() {
        return this.f94845b;
    }

    @Override // il.d
    @Nullable
    public String e() {
        return this.f94851h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f94845b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f94846c.equals(dVar.g()) && ((str = this.f94847d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f94848e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f94849f == dVar.c() && this.f94850g == dVar.h() && ((str3 = this.f94851h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // il.d
    @Nullable
    public String f() {
        return this.f94848e;
    }

    @Override // il.d
    @NonNull
    public c.a g() {
        return this.f94846c;
    }

    @Override // il.d
    public long h() {
        return this.f94850g;
    }

    public int hashCode() {
        String str = this.f94845b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f94846c.hashCode()) * 1000003;
        String str2 = this.f94847d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f94848e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f94849f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f94850g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f94851h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // il.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f94845b + ", registrationStatus=" + this.f94846c + ", authToken=" + this.f94847d + ", refreshToken=" + this.f94848e + ", expiresInSecs=" + this.f94849f + ", tokenCreationEpochInSecs=" + this.f94850g + ", fisError=" + this.f94851h + "}";
    }

    public a(@Nullable String str, c.a aVar, @Nullable String str2, @Nullable String str3, long j10, long j11, @Nullable String str4) {
        this.f94845b = str;
        this.f94846c = aVar;
        this.f94847d = str2;
        this.f94848e = str3;
        this.f94849f = j10;
        this.f94850g = j11;
        this.f94851h = str4;
    }
}
