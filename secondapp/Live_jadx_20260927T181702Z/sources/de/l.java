package de;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78990b;

    public l(long j10) {
        this.f78990b = j10;
    }

    @Override // de.v
    public long c() {
        return this.f78990b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f78990b == ((v) obj).c();
    }

    public int hashCode() {
        long j10 = this.f78990b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f78990b + "}";
    }
}
