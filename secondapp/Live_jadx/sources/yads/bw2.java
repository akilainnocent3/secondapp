package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bw2 implements pq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147383b;

    public bw2(int i10, String str) {
        this.f147382a = i10;
        this.f147383b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw2)) {
            return false;
        }
        bw2 bw2Var = (bw2) obj;
        return this.f147382a == bw2Var.f147382a && kotlin.jvm.internal.m0.g(this.f147383b, bw2Var.f147383b);
    }

    public final int hashCode() {
        return this.f147383b.hashCode() + (this.f147382a * 31);
    }

    public final String toString() {
        return "SdkReward(amount=" + this.f147382a + ", type=" + this.f147383b + gi.j.f86771d;
    }
}
