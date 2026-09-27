package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class af1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f146783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f146784b;

    public af1(Integer num, Integer num2) {
        this.f146783a = num;
        this.f146784b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af1)) {
            return false;
        }
        af1 af1Var = (af1) obj;
        return kotlin.jvm.internal.m0.g(this.f146783a, af1Var.f146783a) && kotlin.jvm.internal.m0.g(this.f146784b, af1Var.f146784b);
    }

    public final int hashCode() {
        Integer num = this.f146783a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f146784b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "LayoutParamsSize(width=" + this.f146783a + ", height=" + this.f146784b + gi.j.f86771d;
    }
}
