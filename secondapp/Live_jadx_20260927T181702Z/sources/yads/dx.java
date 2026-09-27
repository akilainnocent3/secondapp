package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f148399a;

    public dx(boolean z10) {
        super(0);
        this.f148399a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx) && this.f148399a == ((dx) obj).f148399a;
    }

    public final int hashCode() {
        return g8.a.a(this.f148399a);
    }

    public final String toString() {
        return "CmpPresent(value=" + this.f148399a + gi.j.f86771d;
    }
}
