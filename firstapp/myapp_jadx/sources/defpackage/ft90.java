package defpackage;

import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ft90 {
    public static final ft90 f;
    public final List<cz2> a;
    public final Map<String, String> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    static {
        m2g m2gVar = m2g.a;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        f = new ft90(m2gVar, o2gVar);
    }

    public ft90(List<cz2> list, Map<String, String> map) {
        list.getClass();
        map.getClass();
        this.a = list;
        this.b = map;
        this.c = !list.isEmpty();
        this.d = list.size() > 1;
        this.e = list.size() == 1;
    }

    public static ft90 a(ft90 ft90Var, Map map) {
        List<cz2> list = ft90Var.a;
        list.getClass();
        map.getClass();
        return new ft90(list, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft90)) {
            return false;
        }
        ft90 ft90Var = (ft90) obj;
        return Intrinsics.g(this.a, ft90Var.a) && Intrinsics.g(this.b, ft90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SingleBetData(betSelections=" + this.a + ", stakeStringByOutcomeId=" + this.b + oLsIjJCWb.JrGBcZWmyGi;
    }
}
