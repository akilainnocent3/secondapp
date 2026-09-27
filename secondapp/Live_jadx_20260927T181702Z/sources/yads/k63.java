package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class k63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sj2 f151410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2 f151411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic0 f151412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yv f151413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lw f151414e;

    public /* synthetic */ k63(sj2 sj2Var, u2 u2Var, ic0 ic0Var, yv yvVar) {
        this(sj2Var, u2Var, ic0Var, yvVar, new lw());
    }

    public final yv a() {
        return this.f151413d;
    }

    public final lw b() {
        return this.f151414e;
    }

    public final ic0 c() {
        return this.f151412c;
    }

    public final sj2 d() {
        return this.f151410a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k63)) {
            return false;
        }
        k63 k63Var = (k63) obj;
        return kotlin.jvm.internal.m0.g(this.f151410a, k63Var.f151410a) && kotlin.jvm.internal.m0.g(this.f151411b, k63Var.f151411b) && kotlin.jvm.internal.m0.g(this.f151412c, k63Var.f151412c) && kotlin.jvm.internal.m0.g(this.f151413d, k63Var.f151413d) && kotlin.jvm.internal.m0.g(this.f151414e, k63Var.f151414e);
    }

    public final int hashCode() {
        return this.f151414e.hashCode() + ((this.f151413d.hashCode() + ((this.f151412c.hashCode() + ((this.f151411b.hashCode() + (this.f151410a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TimeProviderContainer(progressIncrementer=" + this.f151410a + ", adBlockDurationProvider=" + this.f151411b + ", defaultContentDelayProvider=" + this.f151412c + ", closableAdChecker=" + this.f151413d + ", closeTimerProgressIncrementer=" + this.f151414e + gi.j.f86771d;
    }

    public k63(sj2 sj2Var, u2 u2Var, ic0 ic0Var, yv yvVar, lw lwVar) {
        this.f151410a = sj2Var;
        this.f151411b = u2Var;
        this.f151412c = ic0Var;
        this.f151413d = yvVar;
        this.f151414e = lwVar;
    }
}
