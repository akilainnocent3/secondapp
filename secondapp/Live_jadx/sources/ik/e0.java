package ik;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends g0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94634c;

    public e0(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f94632a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f94633b = str2;
        this.f94634c = z10;
    }

    @Override // ik.g0.c
    public boolean b() {
        return this.f94634c;
    }

    @Override // ik.g0.c
    public String c() {
        return this.f94633b;
    }

    @Override // ik.g0.c
    public String d() {
        return this.f94632a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.c) {
            g0.c cVar = (g0.c) obj;
            if (this.f94632a.equals(cVar.d()) && this.f94633b.equals(cVar.c()) && this.f94634c == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f94632a.hashCode() ^ 1000003) * 1000003) ^ this.f94633b.hashCode()) * 1000003) ^ (this.f94634c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f94632a + ", osCodeName=" + this.f94633b + ", isRooted=" + this.f94634c + "}";
    }
}
