package ik;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0.a f94585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0.c f94586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0.b f94587c;

    public b0(g0.a aVar, g0.c cVar, g0.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f94585a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f94586b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f94587c = bVar;
    }

    @Override // ik.g0
    public g0.a a() {
        return this.f94585a;
    }

    @Override // ik.g0
    public g0.b c() {
        return this.f94587c;
    }

    @Override // ik.g0
    public g0.c d() {
        return this.f94586b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (this.f94585a.equals(g0Var.a()) && this.f94586b.equals(g0Var.d()) && this.f94587c.equals(g0Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f94585a.hashCode() ^ 1000003) * 1000003) ^ this.f94586b.hashCode()) * 1000003) ^ this.f94587c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f94585a + ", osData=" + this.f94586b + ", deviceData=" + this.f94587c + "}";
    }
}
