package ik;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends f0.f.d.a.b.AbstractC0915d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f94774c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f0.f.d.a.b.AbstractC0915d.AbstractC0916a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f94775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f94776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f94777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f94778d;

        @Override // ik.f0.f.d.a.b.AbstractC0915d.AbstractC0916a
        public f0.f.d.a.b.AbstractC0915d a() {
            String str;
            String str2;
            if (this.f94778d == 1 && (str = this.f94775a) != null && (str2 = this.f94776b) != null) {
                return new q(str, str2, this.f94777c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f94775a == null) {
                sb2.append(" name");
            }
            if (this.f94776b == null) {
                sb2.append(" code");
            }
            if ((1 & this.f94778d) == 0) {
                sb2.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // ik.f0.f.d.a.b.AbstractC0915d.AbstractC0916a
        public f0.f.d.a.b.AbstractC0915d.AbstractC0916a b(long j10) {
            this.f94777c = j10;
            this.f94778d = (byte) (this.f94778d | 1);
            return this;
        }

        @Override // ik.f0.f.d.a.b.AbstractC0915d.AbstractC0916a
        public f0.f.d.a.b.AbstractC0915d.AbstractC0916a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f94776b = str;
            return this;
        }

        @Override // ik.f0.f.d.a.b.AbstractC0915d.AbstractC0916a
        public f0.f.d.a.b.AbstractC0915d.AbstractC0916a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f94775a = str;
            return this;
        }
    }

    @Override // ik.f0.f.d.a.b.AbstractC0915d
    @NonNull
    public long b() {
        return this.f94774c;
    }

    @Override // ik.f0.f.d.a.b.AbstractC0915d
    @NonNull
    public String c() {
        return this.f94773b;
    }

    @Override // ik.f0.f.d.a.b.AbstractC0915d
    @NonNull
    public String d() {
        return this.f94772a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.a.b.AbstractC0915d) {
            f0.f.d.a.b.AbstractC0915d abstractC0915d = (f0.f.d.a.b.AbstractC0915d) obj;
            if (this.f94772a.equals(abstractC0915d.d()) && this.f94773b.equals(abstractC0915d.c()) && this.f94774c == abstractC0915d.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f94772a.hashCode() ^ 1000003) * 1000003) ^ this.f94773b.hashCode()) * 1000003;
        long j10 = this.f94774c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f94772a + ", code=" + this.f94773b + ", address=" + this.f94774c + "}";
    }

    public q(String str, String str2, long j10) {
        this.f94772a = str;
        this.f94773b = str2;
        this.f94774c = j10;
    }
}
