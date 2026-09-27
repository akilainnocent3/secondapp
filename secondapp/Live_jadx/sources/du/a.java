package du;

import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a implements Comparable<a> {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@l a other) {
        m0.p(other, "other");
        int iCompareTo = b().compareTo(other.b());
        if (iCompareTo == 0 && !c() && other.c()) {
            return 1;
        }
        return iCompareTo;
    }

    @l
    public abstract b b();

    public abstract boolean c();
}
