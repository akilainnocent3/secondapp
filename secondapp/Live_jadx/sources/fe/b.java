package fe;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.a f83904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f83905b;

    public b(h.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f83904a = aVar;
        this.f83905b = j10;
    }

    @Override // fe.h
    public long b() {
        return this.f83905b;
    }

    @Override // fe.h
    public h.a c() {
        return this.f83904a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f83904a.equals(hVar.c()) && this.f83905b == hVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f83904a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f83905b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f83904a + ", nextRequestWaitMillis=" + this.f83905b + "}";
    }
}
