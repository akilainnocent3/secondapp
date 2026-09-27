package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p00 f147233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f147234c;

    public bl0(String str, p00 p00Var, long j10) {
        this.f147232a = str;
        this.f147233b = p00Var;
        this.f147234c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl0)) {
            return false;
        }
        bl0 bl0Var = (bl0) obj;
        return kotlin.jvm.internal.m0.g(this.f147232a, bl0Var.f147232a) && this.f147233b == bl0Var.f147233b && this.f147234c == bl0Var.f147234c;
    }

    public final int hashCode() {
        return f0.p.a(this.f147234c) + ((this.f147233b.hashCode() + (this.f147232a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AdBreakSignature(adBreakType=" + this.f147232a + ", adBreakPositionType=" + this.f147233b + ", adBreakPositionValue=" + this.f147234c + gi.j.f86771d;
    }
}
