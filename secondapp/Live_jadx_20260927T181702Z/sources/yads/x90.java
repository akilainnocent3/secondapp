package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x80 f157739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q50 f157740c;

    public x90(String str, String str2) {
        this(str, new x80(str2, 0, null, 0, 14));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x90)) {
            return false;
        }
        x90 x90Var = (x90) obj;
        return kotlin.jvm.internal.m0.g(this.f157738a, x90Var.f157738a) && kotlin.jvm.internal.m0.g(this.f157739b, x90Var.f157739b) && kotlin.jvm.internal.m0.g(this.f157740c, x90Var.f157740c);
    }

    public final int hashCode() {
        String str = this.f157738a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        x80 x80Var = this.f157739b;
        int iHashCode2 = (iHashCode + (x80Var == null ? 0 : x80Var.hashCode())) * 31;
        q50 q50Var = this.f157740c;
        return iHashCode2 + (q50Var != null ? q50Var.hashCode() : 0);
    }

    public final String toString() {
        return "KeyValue(title=" + this.f157738a + ", subtitle=" + this.f157739b + ", text=" + this.f157740c + gi.j.f86771d;
    }

    public /* synthetic */ x90(String str, x80 x80Var) {
        this(str, x80Var, null);
    }

    public x90(String str, x80 x80Var, q50 q50Var) {
        super(0);
        this.f157738a = str;
        this.f157739b = x80Var;
        this.f157740c = q50Var;
    }
}
