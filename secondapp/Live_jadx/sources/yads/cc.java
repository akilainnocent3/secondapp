package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f147669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f147670b;

    public cc(long j10, long j11) {
        this.f147669a = j10;
        this.f147670b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc)) {
            return false;
        }
        cc ccVar = (cc) obj;
        return this.f147669a == ccVar.f147669a && this.f147670b == ccVar.f147670b;
    }

    public final int hashCode() {
        return (((int) this.f147669a) * 31) + ((int) this.f147670b);
    }
}
