package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk f149514b;

    public gc(String str, jk jkVar) {
        this.f149513a = str;
        this.f149514b = jkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return kotlin.jvm.internal.m0.g(this.f149513a, gcVar.f149513a) && kotlin.jvm.internal.m0.g(this.f149514b, gcVar.f149514b);
    }

    public final int hashCode() {
        String str = this.f149513a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        jk jkVar = this.f149514b;
        return iHashCode + (jkVar != null ? jkVar.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalInfo(skuId=" + this.f149513a + ", attributes=" + this.f149514b + gi.j.f86771d;
    }
}
