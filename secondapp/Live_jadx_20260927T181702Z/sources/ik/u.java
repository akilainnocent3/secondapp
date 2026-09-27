package ik;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends f0.f.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f94806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f94809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f94810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f94811f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f0.f.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Double f94812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f94813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f94814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f94815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f94816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f94817f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte f94818g;

        @Override // ik.f0.f.d.c.a
        public f0.f.d.c a() {
            if (this.f94818g == 31) {
                return new u(this.f94812a, this.f94813b, this.f94814c, this.f94815d, this.f94816e, this.f94817f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f94818g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f94818g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f94818g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f94818g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f94818g & zi.c.f161640r) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // ik.f0.f.d.c.a
        public f0.f.d.c.a b(Double d10) {
            this.f94812a = d10;
            return this;
        }

        @Override // ik.f0.f.d.c.a
        public f0.f.d.c.a c(int i10) {
            this.f94813b = i10;
            this.f94818g = (byte) (this.f94818g | 1);
            return this;
        }

        @Override // ik.f0.f.d.c.a
        public f0.f.d.c.a d(long j10) {
            this.f94817f = j10;
            this.f94818g = (byte) (this.f94818g | zi.c.f161640r);
            return this;
        }

        @Override // ik.f0.f.d.c.a
        public f0.f.d.c.a e(int i10) {
            this.f94815d = i10;
            this.f94818g = (byte) (this.f94818g | 4);
            return this;
        }

        @Override // ik.f0.f.d.c.a
        public f0.f.d.c.a f(boolean z10) {
            this.f94814c = z10;
            this.f94818g = (byte) (this.f94818g | 2);
            return this;
        }

        @Override // ik.f0.f.d.c.a
        public f0.f.d.c.a g(long j10) {
            this.f94816e = j10;
            this.f94818g = (byte) (this.f94818g | 8);
            return this;
        }
    }

    @Override // ik.f0.f.d.c
    @Nullable
    public Double b() {
        return this.f94806a;
    }

    @Override // ik.f0.f.d.c
    public int c() {
        return this.f94807b;
    }

    @Override // ik.f0.f.d.c
    public long d() {
        return this.f94811f;
    }

    @Override // ik.f0.f.d.c
    public int e() {
        return this.f94809d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.c) {
            f0.f.d.c cVar = (f0.f.d.c) obj;
            Double d10 = this.f94806a;
            if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
                if (this.f94807b == cVar.c() && this.f94808c == cVar.g() && this.f94809d == cVar.e() && this.f94810e == cVar.f() && this.f94811f == cVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ik.f0.f.d.c
    public long f() {
        return this.f94810e;
    }

    @Override // ik.f0.f.d.c
    public boolean g() {
        return this.f94808c;
    }

    public int hashCode() {
        Double d10 = this.f94806a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f94807b) * 1000003) ^ (this.f94808c ? 1231 : 1237)) * 1000003) ^ this.f94809d) * 1000003;
        long j10 = this.f94810e;
        long j11 = this.f94811f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f94806a + ", batteryVelocity=" + this.f94807b + ", proximityOn=" + this.f94808c + ", orientation=" + this.f94809d + ", ramUsed=" + this.f94810e + ", diskUsed=" + this.f94811f + "}";
    }

    public u(@Nullable Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f94806a = d10;
        this.f94807b = i10;
        this.f94808c = z10;
        this.f94809d = i11;
        this.f94810e = j10;
        this.f94811f = j11;
    }
}
