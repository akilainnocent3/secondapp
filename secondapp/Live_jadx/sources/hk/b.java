package hk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f88407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f88408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f88409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f88410g;

    public b(String str, String str2, String str3, String str4, long j10) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f88406c = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f88407d = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f88408e = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f88409f = str4;
        this.f88410g = j10;
    }

    @Override // hk.j
    public String c() {
        return this.f88407d;
    }

    @Override // hk.j
    public String d() {
        return this.f88408e;
    }

    @Override // hk.j
    public String e() {
        return this.f88406c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f88406c.equals(jVar.e()) && this.f88407d.equals(jVar.c()) && this.f88408e.equals(jVar.d()) && this.f88409f.equals(jVar.g()) && this.f88410g == jVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // hk.j
    public long f() {
        return this.f88410g;
    }

    @Override // hk.j
    public String g() {
        return this.f88409f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f88406c.hashCode() ^ 1000003) * 1000003) ^ this.f88407d.hashCode()) * 1000003) ^ this.f88408e.hashCode()) * 1000003) ^ this.f88409f.hashCode()) * 1000003;
        long j10 = this.f88410g;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f88406c + ", parameterKey=" + this.f88407d + ", parameterValue=" + this.f88408e + ", variantId=" + this.f88409f + ", templateVersion=" + this.f88410g + "}";
    }
}
