package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147930a;

    public cx(String str) {
        super(0);
        this.f147930a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx) && kotlin.jvm.internal.m0.g(this.f147930a, ((cx) obj).f147930a);
    }

    public final int hashCode() {
        String str = this.f147930a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "AdditionalConsent(value=" + this.f147930a + gi.j.f86771d;
    }
}
