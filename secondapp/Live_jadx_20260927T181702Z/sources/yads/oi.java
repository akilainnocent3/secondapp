package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f153503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final if1 f153504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f153505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f153506f;

    public oi(String str, String str2, Object obj, if1 if1Var, boolean z10, boolean z11) {
        this.f153501a = str;
        this.f153502b = str2;
        this.f153503c = obj;
        this.f153504d = if1Var;
        this.f153505e = z10;
        this.f153506f = z11;
    }

    public final if1 a() {
        return this.f153504d;
    }

    public final String b() {
        return this.f153501a;
    }

    public final Object c() {
        return this.f153503c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) obj;
        return kotlin.jvm.internal.m0.g(this.f153501a, oiVar.f153501a) && kotlin.jvm.internal.m0.g(this.f153502b, oiVar.f153502b) && kotlin.jvm.internal.m0.g(this.f153503c, oiVar.f153503c) && kotlin.jvm.internal.m0.g(this.f153504d, oiVar.f153504d) && this.f153505e == oiVar.f153505e && this.f153506f == oiVar.f153506f;
    }

    public final int hashCode() {
        int iA = k4.a(this.f153502b, this.f153501a.hashCode() * 31, 31);
        Object obj = this.f153503c;
        int iHashCode = (iA + (obj == null ? 0 : obj.hashCode())) * 31;
        if1 if1Var = this.f153504d;
        return g8.a.a(this.f153506f) + ((g8.a.a(this.f153505e) + ((iHashCode + (if1Var != null ? if1Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Asset(name=" + this.f153501a + ", type=" + this.f153502b + ", value=" + this.f153503c + ", link=" + this.f153504d + ", isClickable=" + this.f153505e + ", isRequired=" + this.f153506f + gi.j.f86771d;
    }
}
