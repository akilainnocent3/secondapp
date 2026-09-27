package sj;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f135349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f135350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f135351c;

    public a(long j10, long j11, long j12) {
        this.f135349a = j10;
        this.f135350b = j11;
        this.f135351c = j12;
    }

    @Override // sj.v
    public long b() {
        return this.f135350b;
    }

    @Override // sj.v
    public long c() {
        return this.f135349a;
    }

    @Override // sj.v
    public long d() {
        return this.f135351c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f135349a == vVar.c() && this.f135350b == vVar.b() && this.f135351c == vVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f135349a;
        long j11 = this.f135350b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f135351c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f135349a + ", elapsedRealtime=" + this.f135350b + ", uptimeMillis=" + this.f135351c + "}";
    }
}
