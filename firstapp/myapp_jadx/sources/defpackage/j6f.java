package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j6f {
    public final Set<g6f> a;
    public final Set<g6f> b;
    public final Set<g6f> c;

    public j6f(Set set, Set set2, Set set3) {
        h6f h6fVar = h6f.a;
        set.getClass();
        set2.getClass();
        set3.getClass();
        this.a = set;
        this.b = set2;
        this.c = set3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6f)) {
            return false;
        }
        j6f j6fVar = (j6f) obj;
        h6f h6fVar = h6f.a;
        return Intrinsics.g(this.a, j6fVar.a) && Intrinsics.g(this.b, j6fVar.b) && Intrinsics.g(this.c, j6fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + (h6f.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DownSelectionSupport(family=" + h6f.a + ", supportedCases=" + this.a + ", allowedCases=" + this.b + ", activatedCases=" + this.c + ")";
    }
}
