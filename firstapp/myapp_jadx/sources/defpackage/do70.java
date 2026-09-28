package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class do70 {
    public final qcn<eo70> a;

    public do70(int i) {
        List<Integer> list = fc60.a;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new eo70.a("0.00", ((Number) it.next()).intValue()));
        }
        this(a4h.f(arrayList));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof do70) && Intrinsics.g(this.a, ((do70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScoreBoardLayoutState(boardList=" + this.a + ')';
    }

    public do70() {
        this(0);
    }

    public do70(uf00 uf00Var) {
        uf00Var.getClass();
        this.a = uf00Var;
    }
}
