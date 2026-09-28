package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.newtork.model.response.OddsFilterData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oec0 {
    public final ihy a;
    public final ljc0 b;
    public final fac0 c;
    public final wwd0 d = xwd0.a("");
    public final wwd0 e;
    public final wwd0 f;
    public final wwd0 g;
    public final wwd0 h;
    public final wwd0 i;
    public final wwd0 j;
    public OddsFilterData k;
    public pjc0 l;
    public icc0 m;
    public BetBuilderConfig n;
    public Map<String, gh2> o;
    public String p;

    public static final class a {
        public final pjc0 a;
        public final List<lcc0> b;
        public final List<kjc0> c;

        public a(pjc0 pjc0Var, List<lcc0> list, List<kjc0> list2) {
            pjc0Var.getClass();
            list.getClass();
            list2.getClass();
            this.a = pjc0Var;
            this.b = list;
            this.c = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ai50.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarketInputs(sessionData=");
            sb.append(this.a);
            sb.append(", marketExpansions=");
            sb.append(this.b);
            sb.append(", selectedSelections=");
            return ng1.a(sb, this.c, ")");
        }
    }

    public oec0(ihy ihyVar, ljc0 ljc0Var, fac0 fac0Var) {
        this.a = ihyVar;
        this.b = ljc0Var;
        this.c = fac0Var;
        n1a0 n1a0Var = n1a0.c;
        this.e = xwd0.a(n1a0Var);
        this.f = xwd0.a(n1a0Var);
        this.g = xwd0.a(null);
        this.h = xwd0.a(Boolean.FALSE);
        this.i = xwd0.a(n1a0Var);
        this.j = xwd0.a(m2g.a);
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.o = o2gVar;
    }
}
