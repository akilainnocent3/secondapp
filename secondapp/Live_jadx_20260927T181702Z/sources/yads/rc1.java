package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f154873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f154874d;

    public rc1(int i10, int i11, String str, String str2) {
        this.f154871a = str;
        this.f154872b = str2;
        this.f154873c = i10;
        this.f154874d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc1)) {
            return false;
        }
        rc1 rc1Var = (rc1) obj;
        return kotlin.jvm.internal.m0.g(this.f154871a, rc1Var.f154871a) && kotlin.jvm.internal.m0.g(this.f154872b, rc1Var.f154872b) && this.f154873c == rc1Var.f154873c && this.f154874d == rc1Var.f154874d;
    }

    public final int hashCode() {
        return this.f154874d + nd3.a(this.f154873c, k4.a(this.f154872b, this.f154871a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "InteractiveCreativeFile(html=" + this.f154871a + ", mimeType=" + this.f154872b + ", height=" + this.f154873c + ", width=" + this.f154874d + gi.j.f86771d;
    }
}
