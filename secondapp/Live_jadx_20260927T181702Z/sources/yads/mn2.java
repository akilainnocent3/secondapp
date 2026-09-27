package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mn2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mn2 f152569b = new mn2(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f152570a;

    public mn2(boolean z10) {
        this.f152570a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mn2.class == obj.getClass() && this.f152570a == ((mn2) obj).f152570a;
    }

    public final int hashCode() {
        return !this.f152570a ? 1 : 0;
    }
}
