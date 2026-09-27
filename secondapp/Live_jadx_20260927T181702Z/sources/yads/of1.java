package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class of1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f153475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cw0 f153476b = new cw0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f153477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f153478d;

    public of1(Object obj) {
        this.f153475a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || of1.class != obj.getClass()) {
            return false;
        }
        return this.f153475a.equals(((of1) obj).f153475a);
    }

    public final int hashCode() {
        return this.f153475a.hashCode();
    }
}
