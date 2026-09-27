package bl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21777c;

    public b(String str, long j10) {
        if (str == null) {
            throw new NullPointerException("Null sdkName");
        }
        this.f21776b = str;
        this.f21777c = j10;
    }

    @Override // bl.x
    public long c() {
        return this.f21777c;
    }

    @Override // bl.x
    public String d() {
        return this.f21776b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f21776b.equals(xVar.d()) && this.f21777c == xVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f21776b.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f21777c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.f21776b + ", millis=" + this.f21777c + "}";
    }
}
