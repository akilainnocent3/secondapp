package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nt extends w43 implements Comparable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f153145k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        nt ntVar = (nt) obj;
        if (b(4) != ntVar.b(4)) {
            return b(4) ? 1 : -1;
        }
        long j10 = this.f155334f - ntVar.f155334f;
        if (j10 == 0) {
            j10 = this.f153145k - ntVar.f153145k;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
