package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cis {
    public final int a;
    public final List<dza> b;

    public cis(int i, List<dza> list) {
        list.getClass();
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cis)) {
            return false;
        }
        cis cisVar = (cis) obj;
        return this.a == cisVar.a && Intrinsics.g(this.b, cisVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ListLayoutSnapshot(afterContentPadding=" + this.a + ", contentAnchors=" + this.b + ")";
    }
}
