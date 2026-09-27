package ul;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139584b;

    public a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f139583a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f139584b = str2;
    }

    @Override // ul.f
    @zq.g
    public String b() {
        return this.f139583a;
    }

    @Override // ul.f
    @zq.g
    public String c() {
        return this.f139584b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f139583a.equals(fVar.b()) && this.f139584b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f139583a.hashCode() ^ 1000003) * 1000003) ^ this.f139584b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f139583a + ", version=" + this.f139584b + "}";
    }
}
