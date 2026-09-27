package ne;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f116452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee.r f116453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee.j f116454c;

    public b(long j10, ee.r rVar, ee.j jVar) {
        this.f116452a = j10;
        if (rVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f116453b = rVar;
        if (jVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f116454c = jVar;
    }

    @Override // ne.k
    public ee.j b() {
        return this.f116454c;
    }

    @Override // ne.k
    public long c() {
        return this.f116452a;
    }

    @Override // ne.k
    public ee.r d() {
        return this.f116453b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f116452a == kVar.c() && this.f116453b.equals(kVar.d()) && this.f116454c.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f116452a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f116453b.hashCode()) * 1000003) ^ this.f116454c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f116452a + ", transportContext=" + this.f116453b + ", event=" + this.f116454c + "}";
    }
}
