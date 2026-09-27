package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f157609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f157610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z9 f157611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lu2 f157612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w02 f157613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f157614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qf0 f157615g;

    public x1(v9 v9Var, d4 d4Var, z9 z9Var, lu2 lu2Var, w02 w02Var, int i10, qf0 qf0Var) {
        this.f157609a = v9Var;
        this.f157610b = d4Var;
        this.f157611c = z9Var;
        this.f157612d = lu2Var;
        this.f157613e = w02Var;
        this.f157614f = i10;
        this.f157615g = qf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return kotlin.jvm.internal.m0.g(this.f157609a, x1Var.f157609a) && kotlin.jvm.internal.m0.g(this.f157610b, x1Var.f157610b) && kotlin.jvm.internal.m0.g(this.f157611c, x1Var.f157611c) && kotlin.jvm.internal.m0.g(this.f157612d, x1Var.f157612d) && kotlin.jvm.internal.m0.g(this.f157613e, x1Var.f157613e) && this.f157614f == x1Var.f157614f && kotlin.jvm.internal.m0.g(this.f157615g, x1Var.f157615g);
    }

    public final int hashCode() {
        int iHashCode = (this.f157612d.hashCode() + ((this.f157611c.hashCode() + ((this.f157610b.hashCode() + (this.f157609a.hashCode() * 31)) * 31)) * 31)) * 31;
        w02 w02Var = this.f157613e;
        int iA = nd3.a(this.f157614f, (iHashCode + (w02Var == null ? 0 : w02Var.hashCode())) * 31, 31);
        qf0 qf0Var = this.f157615g;
        return iA + (qf0Var != null ? qf0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdActivityData(adResponse=" + this.f157609a + ", adConfiguration=" + this.f157610b + ", adResultReceiver=" + this.f157611c + ", sdkEnvironmentModule=" + this.f157612d + ", nativeAd=" + this.f157613e + ", requestedOrientation=" + this.f157614f + ", delegatedActivityLaunchInfo=" + this.f157615g + gi.j.f86771d;
    }

    public /* synthetic */ x1(v9 v9Var, d4 d4Var, z9 z9Var, lu2 lu2Var, w02 w02Var, int i10, qf0 qf0Var, int i11) {
        this(v9Var, d4Var, z9Var, lu2Var, (i11 & 16) != 0 ? null : w02Var, (i11 & 32) != 0 ? 0 : i10, (i11 & 64) != 0 ? null : qf0Var);
    }
}
