package yads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f147462b;

    public c(String str, Set set) {
        this.f147461a = str;
        this.f147462b = set;
    }

    public final String a() {
        return this.f147461a;
    }

    public final Set b() {
        return this.f147462b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m0.g(this.f147461a, cVar.f147461a) && kotlin.jvm.internal.m0.g(this.f147462b, cVar.f147462b);
    }

    public final int hashCode() {
        return this.f147462b.hashCode() + (this.f147461a.hashCode() * 31);
    }

    public final String toString() {
        return "AbExperimentData(experiments=" + this.f147461a + ", triggeredTestIds=" + this.f147462b + gi.j.f86771d;
    }
}
