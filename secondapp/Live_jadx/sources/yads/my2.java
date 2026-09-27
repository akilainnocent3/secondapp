package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class my2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f152764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f152765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f152766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yz2 f152767e;

    public my2(String str, Long l10, boolean z10, boolean z11, yz2 yz2Var) {
        this.f152763a = str;
        this.f152764b = l10;
        this.f152765c = z10;
        this.f152766d = z11;
        this.f152767e = yz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my2)) {
            return false;
        }
        my2 my2Var = (my2) obj;
        return kotlin.jvm.internal.m0.g(this.f152763a, my2Var.f152763a) && kotlin.jvm.internal.m0.g(this.f152764b, my2Var.f152764b) && this.f152765c == my2Var.f152765c && this.f152766d == my2Var.f152766d && kotlin.jvm.internal.m0.g(this.f152767e, my2Var.f152767e);
    }

    public final int hashCode() {
        String str = this.f152763a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f152764b;
        int iA = (g8.a.a(this.f152766d) + ((g8.a.a(this.f152765c) + ((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31)) * 31)) * 31;
        yz2 yz2Var = this.f152767e;
        return iA + (yz2Var != null ? yz2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Settings(templateType=" + this.f152763a + ", multiBannerAutoScrollInterval=" + this.f152764b + ", isHighlightingEnabled=" + this.f152765c + ", isLoopingVideo=" + this.f152766d + ", mediaAssetImageFallbackSize=" + this.f152767e + gi.j.f86771d;
    }
}
