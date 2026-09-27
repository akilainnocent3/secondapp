package cv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f77280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ms.l f77281b;

    public o(@oy.l String value, @oy.l ms.l range) {
        kotlin.jvm.internal.m0.p(value, "value");
        kotlin.jvm.internal.m0.p(range, "range");
        this.f77280a = value;
        this.f77281b = range;
    }

    public static /* synthetic */ o d(o oVar, String str, ms.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oVar.f77280a;
        }
        if ((i10 & 2) != 0) {
            lVar = oVar.f77281b;
        }
        return oVar.c(str, lVar);
    }

    @oy.l
    public final String a() {
        return this.f77280a;
    }

    @oy.l
    public final ms.l b() {
        return this.f77281b;
    }

    @oy.l
    public final o c(@oy.l String value, @oy.l ms.l range) {
        kotlin.jvm.internal.m0.p(value, "value");
        kotlin.jvm.internal.m0.p(range, "range");
        return new o(value, range);
    }

    @oy.l
    public final ms.l e() {
        return this.f77281b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m0.g(this.f77280a, oVar.f77280a) && kotlin.jvm.internal.m0.g(this.f77281b, oVar.f77281b);
    }

    @oy.l
    public final String f() {
        return this.f77280a;
    }

    public int hashCode() {
        return (this.f77280a.hashCode() * 31) + this.f77281b.hashCode();
    }

    @oy.l
    public String toString() {
        return "MatchGroup(value=" + this.f77280a + ", range=" + this.f77281b + ')';
    }
}
