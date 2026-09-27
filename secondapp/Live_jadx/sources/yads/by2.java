package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class by2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147399a;

    public by2(String str) {
        this.f147399a = str;
    }

    public final String a() {
        return this.f147399a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof by2) && kotlin.jvm.internal.m0.g(this.f147399a, ((by2) obj).f147399a);
    }

    public final int hashCode() {
        return this.f147399a.hashCode();
    }

    public final String toString() {
        return "SessionParameters(token=" + this.f147399a + gi.j.f86771d;
    }
}
