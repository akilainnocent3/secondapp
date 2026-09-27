package ik;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends f0.f.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f94698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f94699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f94700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f94701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f94702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f94703i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f0.f.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f94705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f94706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f94707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f94708e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f94709f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f94710g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f94711h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f94712i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte f94713j;

        @Override // ik.f0.f.c.a
        public f0.f.c a() {
            String str;
            String str2;
            String str3;
            if (this.f94713j == 63 && (str = this.f94705b) != null && (str2 = this.f94711h) != null && (str3 = this.f94712i) != null) {
                return new k(this.f94704a, str, this.f94706c, this.f94707d, this.f94708e, this.f94709f, this.f94710g, str2, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f94713j & 1) == 0) {
                sb2.append(" arch");
            }
            if (this.f94705b == null) {
                sb2.append(" model");
            }
            if ((this.f94713j & 2) == 0) {
                sb2.append(" cores");
            }
            if ((this.f94713j & 4) == 0) {
                sb2.append(" ram");
            }
            if ((this.f94713j & 8) == 0) {
                sb2.append(" diskSpace");
            }
            if ((this.f94713j & zi.c.f161640r) == 0) {
                sb2.append(" simulator");
            }
            if ((this.f94713j & 32) == 0) {
                sb2.append(" state");
            }
            if (this.f94711h == null) {
                sb2.append(" manufacturer");
            }
            if (this.f94712i == null) {
                sb2.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // ik.f0.f.c.a
        public f0.f.c.a b(int i10) {
            this.f94704a = i10;
            this.f94713j = (byte) (this.f94713j | 1);
            return this;
        }

        @Override // ik.f0.f.c.a
        public f0.f.c.a c(int i10) {
            this.f94706c = i10;
            this.f94713j = (byte) (this.f94713j | 2);
            return this;
        }

        @Override // ik.f0.f.c.a
        public f0.f.c.a d(long j10) {
            this.f94708e = j10;
            this.f94713j = (byte) (this.f94713j | 8);
            return this;
        }

        @Override // ik.f0.f.c.a
        public f0.f.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f94711h = str;
            return this;
        }

        @Override // ik.f0.f.c.a
        public f0.f.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f94705b = str;
            return this;
        }

        @Override // ik.f0.f.c.a
        public f0.f.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f94712i = str;
            return this;
        }

        @Override // ik.f0.f.c.a
        public f0.f.c.a h(long j10) {
            this.f94707d = j10;
            this.f94713j = (byte) (this.f94713j | 4);
            return this;
        }

        @Override // ik.f0.f.c.a
        public f0.f.c.a i(boolean z10) {
            this.f94709f = z10;
            this.f94713j = (byte) (this.f94713j | zi.c.f161640r);
            return this;
        }

        @Override // ik.f0.f.c.a
        public f0.f.c.a j(int i10) {
            this.f94710g = i10;
            this.f94713j = (byte) (this.f94713j | 32);
            return this;
        }
    }

    @Override // ik.f0.f.c
    @NonNull
    public int b() {
        return this.f94695a;
    }

    @Override // ik.f0.f.c
    public int c() {
        return this.f94697c;
    }

    @Override // ik.f0.f.c
    public long d() {
        return this.f94699e;
    }

    @Override // ik.f0.f.c
    @NonNull
    public String e() {
        return this.f94702h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.c) {
            f0.f.c cVar = (f0.f.c) obj;
            if (this.f94695a == cVar.b() && this.f94696b.equals(cVar.f()) && this.f94697c == cVar.c() && this.f94698d == cVar.h() && this.f94699e == cVar.d() && this.f94700f == cVar.j() && this.f94701g == cVar.i() && this.f94702h.equals(cVar.e()) && this.f94703i.equals(cVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // ik.f0.f.c
    @NonNull
    public String f() {
        return this.f94696b;
    }

    @Override // ik.f0.f.c
    @NonNull
    public String g() {
        return this.f94703i;
    }

    @Override // ik.f0.f.c
    public long h() {
        return this.f94698d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f94695a ^ 1000003) * 1000003) ^ this.f94696b.hashCode()) * 1000003) ^ this.f94697c) * 1000003;
        long j10 = this.f94698d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f94699e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f94700f ? 1231 : 1237)) * 1000003) ^ this.f94701g) * 1000003) ^ this.f94702h.hashCode()) * 1000003) ^ this.f94703i.hashCode();
    }

    @Override // ik.f0.f.c
    public int i() {
        return this.f94701g;
    }

    @Override // ik.f0.f.c
    public boolean j() {
        return this.f94700f;
    }

    public String toString() {
        return "Device{arch=" + this.f94695a + ", model=" + this.f94696b + ", cores=" + this.f94697c + ", ram=" + this.f94698d + ", diskSpace=" + this.f94699e + ", simulator=" + this.f94700f + ", state=" + this.f94701g + ", manufacturer=" + this.f94702h + ", modelClass=" + this.f94703i + "}";
    }

    public k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f94695a = i10;
        this.f94696b = str;
        this.f94697c = i11;
        this.f94698d = j10;
        this.f94699e = j11;
        this.f94700f = z10;
        this.f94701g = i12;
        this.f94702h = str2;
        this.f94703i = str3;
    }
}
