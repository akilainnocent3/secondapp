package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class m40 {

    @oy.l
    public static final l40 Companion = new l40();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zv.j[] f152314c = {new dw.f(s40.f155256a), new dw.f(f40.f148965a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f152316b;

    public /* synthetic */ m40(int i10, List list, List list2) {
        if (3 != (i10 & 3)) {
            dw.g2.b(i10, 3, k40.f151382a.getDescriptor());
        }
        this.f152315a = list;
        this.f152316b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m40)) {
            return false;
        }
        m40 m40Var = (m40) obj;
        return kotlin.jvm.internal.m0.g(this.f152315a, m40Var.f152315a) && kotlin.jvm.internal.m0.g(this.f152316b, m40Var.f152316b);
    }

    public final int hashCode() {
        return this.f152316b.hashCode() + (this.f152315a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitMediation(waterfall=" + this.f152315a + ", bidding=" + this.f152316b + gi.j.f86771d;
    }
}
