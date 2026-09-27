package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c90 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f147634a;

    public c90(boolean z10) {
        this.f147634a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c90) && this.f147634a == ((c90) obj).f147634a;
    }

    public final int hashCode() {
        return g8.a.a(this.f147634a);
    }

    public final String toString() {
        return "OnDebugErrorIndicatorSwitch(isChecked=" + this.f147634a + gi.j.f86771d;
    }
}
