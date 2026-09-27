package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cn0 f147283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147284b;

    public bn0(cn0 cn0Var, String str) {
        this.f147283a = cn0Var;
        this.f147284b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn0)) {
            return false;
        }
        bn0 bn0Var = (bn0) obj;
        return this.f147283a == bn0Var.f147283a && kotlin.jvm.internal.m0.g(this.f147284b, bn0Var.f147284b);
    }

    public final int hashCode() {
        return this.f147284b.hashCode() + (this.f147283a.hashCode() * 31);
    }

    public final String toString() {
        return "ExclusionRule(type=" + this.f147283a + ", value=" + this.f147284b + gi.j.f86771d;
    }
}
