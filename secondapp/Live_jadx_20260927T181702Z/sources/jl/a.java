package jl;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f100586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d.b f100587e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f100588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f100589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f100590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f100591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d.b f100592e;

        @Override // jl.d.a
        public d a() {
            return new a(this.f100588a, this.f100589b, this.f100590c, this.f100591d, this.f100592e);
        }

        @Override // jl.d.a
        public d.a b(f fVar) {
            this.f100591d = fVar;
            return this;
        }

        @Override // jl.d.a
        public d.a c(String str) {
            this.f100589b = str;
            return this;
        }

        @Override // jl.d.a
        public d.a d(String str) {
            this.f100590c = str;
            return this;
        }

        @Override // jl.d.a
        public d.a e(d.b bVar) {
            this.f100592e = bVar;
            return this;
        }

        @Override // jl.d.a
        public d.a f(String str) {
            this.f100588a = str;
            return this;
        }

        public b() {
        }

        public b(d dVar) {
            this.f100588a = dVar.f();
            this.f100589b = dVar.c();
            this.f100590c = dVar.d();
            this.f100591d = dVar.b();
            this.f100592e = dVar.e();
        }
    }

    @Override // jl.d
    @Nullable
    public f b() {
        return this.f100586d;
    }

    @Override // jl.d
    @Nullable
    public String c() {
        return this.f100584b;
    }

    @Override // jl.d
    @Nullable
    public String d() {
        return this.f100585c;
    }

    @Override // jl.d
    @Nullable
    public d.b e() {
        return this.f100587e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f100583a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f100584b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f100585c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f100586d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f100587e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // jl.d
    @Nullable
    public String f() {
        return this.f100583a;
    }

    @Override // jl.d
    public d.a g() {
        return new b(this);
    }

    public int hashCode() {
        String str = this.f100583a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f100584b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f100585c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f100586d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f100587e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f100583a + ", fid=" + this.f100584b + ", refreshToken=" + this.f100585c + ", authToken=" + this.f100586d + ", responseCode=" + this.f100587e + "}";
    }

    public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable f fVar, @Nullable d.b bVar) {
        this.f100583a = str;
        this.f100584b = str2;
        this.f100585c = str3;
        this.f100586d = fVar;
        this.f100587e = bVar;
    }
}
