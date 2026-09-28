package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w7d0 {
    public final List<pt00> a;
    public final Set<String> b;
    public final e0b c;

    public w7d0(List<pt00> list, Set<String> set, e0b e0bVar) {
        list.getClass();
        set.getClass();
        e0bVar.getClass();
        this.a = list;
        this.b = set;
        this.c = e0bVar;
    }

    public static w7d0 a(w7d0 w7d0Var, List list, Set set, e0b e0bVar, int i) {
        if ((i & 1) != 0) {
            list = w7d0Var.a;
        }
        if ((i & 2) != 0) {
            set = w7d0Var.b;
        }
        if ((i & 4) != 0) {
            e0bVar = w7d0Var.c;
        }
        w7d0Var.getClass();
        list.getClass();
        set.getClass();
        e0bVar.getClass();
        return new w7d0(list, set, e0bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7d0)) {
            return false;
        }
        w7d0 w7d0Var = (w7d0) obj;
        return Intrinsics.g(this.a, w7d0Var.a) && Intrinsics.g(this.b, w7d0Var.b) && Intrinsics.g(this.c, w7d0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SportyPicksUiState(tournaments=" + this.a + ", selectedTournamentIds=" + this.b + ", content=" + this.c + ")";
    }

    public w7d0() {
        this(7, null);
    }

    public w7d0(int i, Set set) {
        this(m2g.a, (i & 2) != 0 ? t3g.a : set, e0b.d.a);
    }
}
