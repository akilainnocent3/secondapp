package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ez00 {
    public final List<cz00> a;
    public final int b;

    public ez00(List<cz00> list, int i) {
        list.getClass();
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez00)) {
            return false;
        }
        ez00 ez00Var = (ez00) obj;
        return Intrinsics.g(this.a, ez00Var.a) && this.b == ez00Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PillMaskLayoutInfo(visibleItems=" + this.a + ", viewportWidthPx=" + this.b + ")";
    }

    public ez00(int i) {
        this(m2g.a, 0);
    }

    public ez00() {
        this(0);
    }
}
