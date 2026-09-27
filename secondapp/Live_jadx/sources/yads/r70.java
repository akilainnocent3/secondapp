package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class r70 extends s70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154796b;

    public r70(String str) {
        super(str, 0);
        this.f154796b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r70) && kotlin.jvm.internal.m0.g(this.f154796b, ((r70) obj).f154796b);
    }

    public final int hashCode() {
        return this.f154796b.hashCode();
    }

    public final String toString() {
        return "MediationNetwork(network=" + this.f154796b + gi.j.f86771d;
    }
}
