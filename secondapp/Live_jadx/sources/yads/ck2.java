package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ck2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f147758b;

    public ck2(boolean z10, int i10) {
        this.f147757a = i10;
        this.f147758b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ck2.class == obj.getClass()) {
            ck2 ck2Var = (ck2) obj;
            if (this.f147757a == ck2Var.f147757a && this.f147758b == ck2Var.f147758b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f147757a * 31) + (this.f147758b ? 1 : 0);
    }
}
