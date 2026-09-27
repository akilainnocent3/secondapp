package jl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f100594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.b f100595c;

    /* JADX INFO: renamed from: jl.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0947b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f100596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f100597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f.b f100598c;

        @Override // jl.f.a
        public f a() {
            String str = "";
            if (this.f100597b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f100596a, this.f100597b.longValue(), this.f100598c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // jl.f.a
        public f.a b(f.b bVar) {
            this.f100598c = bVar;
            return this;
        }

        @Override // jl.f.a
        public f.a c(String str) {
            this.f100596a = str;
            return this;
        }

        @Override // jl.f.a
        public f.a d(long j10) {
            this.f100597b = Long.valueOf(j10);
            return this;
        }

        public C0947b() {
        }

        public C0947b(f fVar) {
            this.f100596a = fVar.c();
            this.f100597b = Long.valueOf(fVar.d());
            this.f100598c = fVar.b();
        }
    }

    @Override // jl.f
    @Nullable
    public f.b b() {
        return this.f100595c;
    }

    @Override // jl.f
    @Nullable
    public String c() {
        return this.f100593a;
    }

    @Override // jl.f
    @NonNull
    public long d() {
        return this.f100594b;
    }

    @Override // jl.f
    public f.a e() {
        return new C0947b(this);
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f100593a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f100594b == fVar.d() && ((bVar = this.f100595c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f100593a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f100594b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f100595c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f100593a + ", tokenExpirationTimestamp=" + this.f100594b + ", responseCode=" + this.f100595c + "}";
    }

    public b(@Nullable String str, long j10, @Nullable f.b bVar) {
        this.f100593a = str;
        this.f100594b = j10;
        this.f100595c = bVar;
    }
}
