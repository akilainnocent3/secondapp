package x8;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f144755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f144756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f144757c;

    public t(long j10, long j11, int i10) {
        this.f144755a = j10;
        this.f144756b = j11;
        this.f144757c = i10;
    }

    public final long a() {
        return this.f144756b;
    }

    public final long b() {
        return this.f144755a;
    }

    public final int c() {
        return this.f144757c;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f144755a == tVar.f144755a && this.f144756b == tVar.f144756b && this.f144757c == tVar.f144757c;
    }

    public int hashCode() {
        return (((f0.p.a(this.f144755a) * 31) + f0.p.a(this.f144756b)) * 31) + this.f144757c;
    }

    @oy.l
    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f144755a + ", ModelVersion=" + this.f144756b + ", TopicCode=" + this.f144757c + " }");
    }
}
