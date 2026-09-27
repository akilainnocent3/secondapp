package yads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jq2 extends sa2 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jq2 f151214b = new jq2();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f151214b;
    }

    @Override // yads.sa2
    public final sa2 a() {
        return y72.f158173b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
