package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class od3 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f153456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f153457d;

    public od3(int i10, int i11, int i12) {
        this.f153455b = i10;
        this.f153456c = i11;
        this.f153457d = i12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(od3 od3Var) {
        int i10 = this.f153455b;
        int i11 = od3Var.f153455b;
        if (i10 != i11) {
            return kotlin.jvm.internal.m0.t(i10, i11);
        }
        int i12 = this.f153456c;
        int i13 = od3Var.f153456c;
        return i12 != i13 ? kotlin.jvm.internal.m0.t(i12, i13) : kotlin.jvm.internal.m0.t(this.f153457d, od3Var.f153457d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od3)) {
            return false;
        }
        od3 od3Var = (od3) obj;
        return this.f153455b == od3Var.f153455b && this.f153456c == od3Var.f153456c && this.f153457d == od3Var.f153457d;
    }

    public final int hashCode() {
        return this.f153457d + nd3.a(this.f153456c, this.f153455b * 31, 31);
    }

    public final String toString() {
        return this.f153455b + androidx.media3.session.fe.F + this.f153456c + androidx.media3.session.fe.F + this.f153457d;
    }
}
