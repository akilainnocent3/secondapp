package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class u70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f156302a;

    public u70(boolean z10) {
        this.f156302a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u70) && this.f156302a == ((u70) obj).f156302a;
    }

    public final int hashCode() {
        return g8.a.a(this.f156302a);
    }

    public final String toString() {
        return "DebugPanelErrorIndicatorData(isEnabled=" + this.f156302a + gi.j.f86771d;
    }
}
