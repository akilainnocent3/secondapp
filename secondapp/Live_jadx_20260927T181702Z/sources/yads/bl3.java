package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al3 f147260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final af1 f147261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jj1 f147262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f147263d;

    public bl3(al3 al3Var, af1 af1Var, jj1 jj1Var, Map map) {
        this.f147260a = al3Var;
        this.f147261b = af1Var;
        this.f147262c = jj1Var;
        this.f147263d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl3)) {
            return false;
        }
        bl3 bl3Var = (bl3) obj;
        return kotlin.jvm.internal.m0.g(this.f147260a, bl3Var.f147260a) && kotlin.jvm.internal.m0.g(this.f147261b, bl3Var.f147261b) && kotlin.jvm.internal.m0.g(this.f147262c, bl3Var.f147262c) && kotlin.jvm.internal.m0.g(this.f147263d, bl3Var.f147263d);
    }

    public final int hashCode() {
        return this.f147263d.hashCode() + ((this.f147262c.hashCode() + ((this.f147261b.hashCode() + (this.f147260a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ViewSizeInfo(view=" + this.f147260a + ", layoutParams=" + this.f147261b + ", measured=" + this.f147262c + ", additionalInfo=" + this.f147263d + gi.j.f86771d;
    }
}
