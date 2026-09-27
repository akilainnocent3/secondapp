package ik;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends g0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f94622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f94623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f94624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f94625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f94626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f94627i;

    public d0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f94619a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f94620b = str;
        this.f94621c = i11;
        this.f94622d = j10;
        this.f94623e = j11;
        this.f94624f = z10;
        this.f94625g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f94626h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f94627i = str3;
    }

    @Override // ik.g0.b
    public int a() {
        return this.f94619a;
    }

    @Override // ik.g0.b
    public int b() {
        return this.f94621c;
    }

    @Override // ik.g0.b
    public long d() {
        return this.f94623e;
    }

    @Override // ik.g0.b
    public boolean e() {
        return this.f94624f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.b) {
            g0.b bVar = (g0.b) obj;
            if (this.f94619a == bVar.a() && this.f94620b.equals(bVar.g()) && this.f94621c == bVar.b() && this.f94622d == bVar.j() && this.f94623e == bVar.d() && this.f94624f == bVar.e() && this.f94625g == bVar.i() && this.f94626h.equals(bVar.f()) && this.f94627i.equals(bVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // ik.g0.b
    public String f() {
        return this.f94626h;
    }

    @Override // ik.g0.b
    public String g() {
        return this.f94620b;
    }

    @Override // ik.g0.b
    public String h() {
        return this.f94627i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f94619a ^ 1000003) * 1000003) ^ this.f94620b.hashCode()) * 1000003) ^ this.f94621c) * 1000003;
        long j10 = this.f94622d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f94623e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f94624f ? 1231 : 1237)) * 1000003) ^ this.f94625g) * 1000003) ^ this.f94626h.hashCode()) * 1000003) ^ this.f94627i.hashCode();
    }

    @Override // ik.g0.b
    public int i() {
        return this.f94625g;
    }

    @Override // ik.g0.b
    public long j() {
        return this.f94622d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f94619a + ", model=" + this.f94620b + ", availableProcessors=" + this.f94621c + ", totalRam=" + this.f94622d + ", diskSpace=" + this.f94623e + ", isEmulator=" + this.f94624f + ", state=" + this.f94625g + ", manufacturer=" + this.f94626h + ", modelClass=" + this.f94627i + "}";
    }
}
