package ik;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends g0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f94610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f94611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ck.f f94612f;

    public c0(String str, String str2, String str3, String str4, int i10, ck.f fVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f94607a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f94608b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f94609c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f94610d = str4;
        this.f94611e = i10;
        if (fVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f94612f = fVar;
    }

    @Override // ik.g0.a
    public String a() {
        return this.f94607a;
    }

    @Override // ik.g0.a
    public int c() {
        return this.f94611e;
    }

    @Override // ik.g0.a
    public ck.f d() {
        return this.f94612f;
    }

    @Override // ik.g0.a
    public String e() {
        return this.f94610d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.a) {
            g0.a aVar = (g0.a) obj;
            if (this.f94607a.equals(aVar.a()) && this.f94608b.equals(aVar.f()) && this.f94609c.equals(aVar.g()) && this.f94610d.equals(aVar.e()) && this.f94611e == aVar.c() && this.f94612f.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // ik.g0.a
    public String f() {
        return this.f94608b;
    }

    @Override // ik.g0.a
    public String g() {
        return this.f94609c;
    }

    public int hashCode() {
        return ((((((((((this.f94607a.hashCode() ^ 1000003) * 1000003) ^ this.f94608b.hashCode()) * 1000003) ^ this.f94609c.hashCode()) * 1000003) ^ this.f94610d.hashCode()) * 1000003) ^ this.f94611e) * 1000003) ^ this.f94612f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f94607a + ", versionCode=" + this.f94608b + ", versionName=" + this.f94609c + ", installUuid=" + this.f94610d + ", deliveryMechanism=" + this.f94611e + ", developmentPlatformProvider=" + this.f94612f + "}";
    }
}
