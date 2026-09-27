package cj;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(serializable = true)
@j4
public final class jc extends m9<Object> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final jc f24021d = new jc();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f24022e = 0;

    private Object N() {
        return f24021d;
    }

    @Override // cj.m9, java.util.Comparator
    public int compare(Object left, Object right) {
        return left.toString().compareTo(right.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
