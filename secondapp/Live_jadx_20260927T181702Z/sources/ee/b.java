package ee;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f80747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f80748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f80749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f80750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f80751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f80752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f80753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f80754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f80755j;

    /* JADX INFO: renamed from: ee.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0793b extends j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f80756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f80757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i f80758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f80759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f80760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map<String, String> f80761f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f80762g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f80763h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f80764i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f80765j;

        @Override // ee.j.a
        public j d() {
            String str = "";
            if (this.f80756a == null) {
                str = " transportName";
            }
            if (this.f80758c == null) {
                str = str + " encodedPayload";
            }
            if (this.f80759d == null) {
                str = str + " eventMillis";
            }
            if (this.f80760e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f80761f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f80756a, this.f80757b, this.f80758c, this.f80759d.longValue(), this.f80760e.longValue(), this.f80761f, this.f80762g, this.f80763h, this.f80764i, this.f80765j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ee.j.a
        public Map<String, String> e() {
            Map<String, String> map = this.f80761f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // ee.j.a
        public j.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f80761f = map;
            return this;
        }

        @Override // ee.j.a
        public j.a g(Integer num) {
            this.f80757b = num;
            return this;
        }

        @Override // ee.j.a
        public j.a h(i iVar) {
            if (iVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f80758c = iVar;
            return this;
        }

        @Override // ee.j.a
        public j.a i(long j10) {
            this.f80759d = Long.valueOf(j10);
            return this;
        }

        @Override // ee.j.a
        public j.a j(byte[] bArr) {
            this.f80764i = bArr;
            return this;
        }

        @Override // ee.j.a
        public j.a k(byte[] bArr) {
            this.f80765j = bArr;
            return this;
        }

        @Override // ee.j.a
        public j.a l(Integer num) {
            this.f80762g = num;
            return this;
        }

        @Override // ee.j.a
        public j.a m(String str) {
            this.f80763h = str;
            return this;
        }

        @Override // ee.j.a
        public j.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f80756a = str;
            return this;
        }

        @Override // ee.j.a
        public j.a o(long j10) {
            this.f80760e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // ee.j
    public Map<String, String> c() {
        return this.f80751f;
    }

    @Override // ee.j
    @Nullable
    public Integer d() {
        return this.f80747b;
    }

    @Override // ee.j
    public i e() {
        return this.f80748c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f80746a.equals(jVar.p()) && ((num = this.f80747b) != null ? num.equals(jVar.d()) : jVar.d() == null) && this.f80748c.equals(jVar.e()) && this.f80749d == jVar.f() && this.f80750e == jVar.q() && this.f80751f.equals(jVar.c()) && ((num2 = this.f80752g) != null ? num2.equals(jVar.n()) : jVar.n() == null) && ((str = this.f80753h) != null ? str.equals(jVar.o()) : jVar.o() == null)) {
                boolean z10 = jVar instanceof b;
                if (Arrays.equals(this.f80754i, z10 ? ((b) jVar).f80754i : jVar.g())) {
                    if (Arrays.equals(this.f80755j, z10 ? ((b) jVar).f80755j : jVar.h())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // ee.j
    public long f() {
        return this.f80749d;
    }

    @Override // ee.j
    @Nullable
    public byte[] g() {
        return this.f80754i;
    }

    @Override // ee.j
    @Nullable
    public byte[] h() {
        return this.f80755j;
    }

    public int hashCode() {
        int iHashCode = (this.f80746a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f80747b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f80748c.hashCode()) * 1000003;
        long j10 = this.f80749d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f80750e;
        int iHashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f80751f.hashCode()) * 1000003;
        Integer num2 = this.f80752g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f80753h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f80754i)) * 1000003) ^ Arrays.hashCode(this.f80755j);
    }

    @Override // ee.j
    @Nullable
    public Integer n() {
        return this.f80752g;
    }

    @Override // ee.j
    @Nullable
    public String o() {
        return this.f80753h;
    }

    @Override // ee.j
    public String p() {
        return this.f80746a;
    }

    @Override // ee.j
    public long q() {
        return this.f80750e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f80746a + ", code=" + this.f80747b + ", encodedPayload=" + this.f80748c + ", eventMillis=" + this.f80749d + ", uptimeMillis=" + this.f80750e + ", autoMetadata=" + this.f80751f + ", productId=" + this.f80752g + ", pseudonymousId=" + this.f80753h + ", experimentIdsClear=" + Arrays.toString(this.f80754i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f80755j) + "}";
    }

    public b(String str, @Nullable Integer num, i iVar, long j10, long j11, Map<String, String> map, @Nullable Integer num2, @Nullable String str2, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        this.f80746a = str;
        this.f80747b = num;
        this.f80748c = iVar;
        this.f80749d = j10;
        this.f80750e = j11;
        this.f80751f = map;
        this.f80752g = num2;
        this.f80753h = str2;
        this.f80754i = bArr;
        this.f80755j = bArr2;
    }
}
