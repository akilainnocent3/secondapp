package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f147608c;

    public c7(List list, int i10, int i11) {
        this.f147606a = list;
        this.f147607b = i10;
        this.f147608c = i11;
    }

    public final List a() {
        return this.f147606a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj;
        return kotlin.jvm.internal.m0.g(this.f147606a, c7Var.f147606a) && this.f147607b == c7Var.f147607b && this.f147608c == c7Var.f147608c;
    }

    public final int hashCode() {
        return this.f147608c + nd3.a(this.f147607b, this.f147606a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdPod(items=" + this.f147606a + ", closableAdPosition=" + this.f147607b + ", rewardAdPosition=" + this.f147608c + gi.j.f86771d;
    }
}
