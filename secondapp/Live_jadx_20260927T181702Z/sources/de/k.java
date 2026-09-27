package de;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f78976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f78978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f78979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f78980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<t> f78981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f78982g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f78983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f78984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o f78985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f78986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f78987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<t> f78988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public x f78989g;

        @Override // de.u.a
        public u a() {
            String str = "";
            if (this.f78983a == null) {
                str = " requestTimeMs";
            }
            if (this.f78984b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f78983a.longValue(), this.f78984b.longValue(), this.f78985c, this.f78986d, this.f78987e, this.f78988f, this.f78989g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // de.u.a
        public u.a b(@Nullable o oVar) {
            this.f78985c = oVar;
            return this;
        }

        @Override // de.u.a
        public u.a c(@Nullable List<t> list) {
            this.f78988f = list;
            return this;
        }

        @Override // de.u.a
        public u.a d(@Nullable Integer num) {
            this.f78986d = num;
            return this;
        }

        @Override // de.u.a
        public u.a e(@Nullable String str) {
            this.f78987e = str;
            return this;
        }

        @Override // de.u.a
        public u.a f(@Nullable x xVar) {
            this.f78989g = xVar;
            return this;
        }

        @Override // de.u.a
        public u.a g(long j10) {
            this.f78983a = Long.valueOf(j10);
            return this;
        }

        @Override // de.u.a
        public u.a h(long j10) {
            this.f78984b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // de.u
    @Nullable
    public o b() {
        return this.f78978c;
    }

    @Override // de.u
    @Nullable
    @uk.a.InterfaceC1443a(name = "logEvent")
    public List<t> c() {
        return this.f78981f;
    }

    @Override // de.u
    @Nullable
    public Integer d() {
        return this.f78979d;
    }

    @Override // de.u
    @Nullable
    public String e() {
        return this.f78980e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List<t> list;
        x xVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f78976a == uVar.g() && this.f78977b == uVar.h() && ((oVar = this.f78978c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f78979d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f78980e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f78981f) != null ? list.equals(uVar.c()) : uVar.c() == null) && ((xVar = this.f78982g) != null ? xVar.equals(uVar.f()) : uVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // de.u
    @Nullable
    public x f() {
        return this.f78982g;
    }

    @Override // de.u
    public long g() {
        return this.f78976a;
    }

    @Override // de.u
    public long h() {
        return this.f78977b;
    }

    public int hashCode() {
        long j10 = this.f78976a;
        long j11 = this.f78977b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        o oVar = this.f78978c;
        int iHashCode = (i10 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f78979d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f78980e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<t> list = this.f78981f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f78982g;
        return iHashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f78976a + ", requestUptimeMs=" + this.f78977b + ", clientInfo=" + this.f78978c + ", logSource=" + this.f78979d + ", logSourceName=" + this.f78980e + ", logEvents=" + this.f78981f + ", qosTier=" + this.f78982g + "}";
    }

    public k(long j10, long j11, @Nullable o oVar, @Nullable Integer num, @Nullable String str, @Nullable List<t> list, @Nullable x xVar) {
        this.f78976a = j10;
        this.f78977b = j11;
        this.f78978c = oVar;
        this.f78979d = num;
        this.f78980e = str;
        this.f78981f = list;
        this.f78982g = xVar;
    }
}
