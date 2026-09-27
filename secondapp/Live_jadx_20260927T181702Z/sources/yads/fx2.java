package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f149291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f149292b;

    public fx2(long j10, long j11) {
        this.f149291a = j10;
        this.f149292b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fx2.class == obj.getClass()) {
            fx2 fx2Var = (fx2) obj;
            if (this.f149291a == fx2Var.f149291a && this.f149292b == fx2Var.f149292b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f149291a) * 31) + ((int) this.f149292b);
    }
}
