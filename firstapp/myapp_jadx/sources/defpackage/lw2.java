package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "Please instead with IBetMutexData")
public final class lw2 implements krm {
    public static volatile krm b = null;
    public static volatile boolean c = false;
    public static final lw2 d = new lw2(null);
    public final krm a;

    public static class a implements Comparable<a> {
        public final Event a;
        public final Market b;
        public final Outcome c;
        public final List<Selection> d;

        public a(Event event, Market market, Outcome outcome, List<Selection> list) {
            this.a = event;
            this.b = market;
            this.c = outcome;
            this.d = list;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return new BigDecimal(this.c.odds).subtract(new BigDecimal(aVar.c.odds)).signum();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            List<Selection> list = aVar.d;
            if (!Objects.equals(this.a, aVar.a)) {
                return false;
            }
            List<Selection> list2 = this.d;
            if (list2 == null || list2.isEmpty() || list == null || list.isEmpty()) {
                if (Objects.equals(this.b, aVar.b)) {
                    return Objects.equals(this.c, aVar.c);
                }
                return false;
            }
            list2.getClass();
            list.getClass();
            return list2.size() == list.size() && CollectionsKt.E0(list2).containsAll(list);
        }

        public final int hashCode() {
            Event event = this.a;
            int iHashCode = event != null ? event.hashCode() : 1;
            List<Selection> list = this.d;
            if (list == null || list.isEmpty()) {
                int i = iHashCode * 31;
                Market market = this.b;
                int iHashCode2 = (i + (market != null ? market.hashCode() : 0)) * 31;
                Outcome outcome = this.c;
                return iHashCode2 + (outcome != null ? outcome.hashCode() : 0);
            }
            int i2 = iHashCode * 31;
            list.getClass();
            Iterator<T> it = list.iterator();
            int iHashCode3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode3 ^= next != null ? next.hashCode() : 0;
            }
            return i2 + iHashCode3;
        }
    }

    public static class b {
        public BigDecimal a;
        public BigDecimal b;

        public b(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            this.a = bigDecimal;
            this.b = bigDecimal2;
        }
    }

    public static class c {
        public final Market a;
        public final Event b;

        public c(Event event, Market market) {
            this.a = market;
            this.b = event;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (Objects.equals(this.a, cVar.a)) {
                return Objects.equals(this.b, cVar.b);
            }
            return false;
        }

        public final int hashCode() {
            Market market = this.a;
            int iHashCode = (market != null ? market.hashCode() : 0) * 31;
            Event event = this.b;
            return iHashCode + (event != null ? event.hashCode() : 0);
        }
    }

    public lw2(ow2 ow2Var) {
        this.a = ow2Var;
    }

    @Override // defpackage.krm
    public final BigDecimal A() {
        return a().A();
    }

    @Override // defpackage.krm
    public final void B() {
        a().B();
    }

    @Override // defpackage.krm
    public final int C() {
        return a().C();
    }

    @Override // defpackage.krm
    public final int D() {
        return a().D();
    }

    @Override // defpackage.krm
    public final Map<Event, HashSet<a>> E() {
        return a().E();
    }

    @Override // defpackage.krm
    public final void F() {
        a().F();
    }

    @Override // defpackage.krm
    public final List<a> G() {
        return a().G();
    }

    @Override // defpackage.krm
    public final void H(Event event, Market market, Outcome outcome, List<Selection> list) {
        a().H(event, market, outcome, list);
    }

    @Override // defpackage.krm
    public final boolean I() {
        return a().I();
    }

    @Override // defpackage.krm
    public final b J(boolean z, egy egyVar) {
        return a().J(z, egyVar);
    }

    @Override // defpackage.krm
    public final boolean K(Event event) {
        return a().K(event);
    }

    @Override // defpackage.krm
    public final boolean L(boolean z) {
        return a().L(z);
    }

    @Override // defpackage.krm
    public final BigDecimal M() {
        return a().M();
    }

    @Override // defpackage.krm
    public final double N(int i) {
        return a().N(i);
    }

    @Override // defpackage.krm
    public final void O(boolean z) {
        a().O(z);
    }

    @Override // defpackage.krm
    public final boolean P() {
        return a().P();
    }

    @Override // defpackage.krm
    public final long Q(int i) {
        return a().Q(i);
    }

    @Override // defpackage.krm
    public final void R(String str) {
        a().R(str);
    }

    public final krm a() {
        krm krmVar = this.a;
        if (krmVar != null) {
            return krmVar;
        }
        krm krmVar2 = b;
        if (krmVar2 != null) {
            return krmVar2;
        }
        synchronized (lw2.class) {
            if (b != null) {
                return b;
            }
            try {
                krm krmVarI0 = ((z03) qag.a(hp0.A, z03.class)).i0();
                if (!c) {
                    d13.c(krmVarI0);
                    c = true;
                }
                b = krmVarI0;
                return krmVarI0;
            } catch (IllegalStateException e) {
                e = e;
                itf0.a.p(e, "BetMutexData: Hilt not ready, fall back to local state", new Object[0]);
                return d13.a.e().c;
            } catch (NullPointerException e2) {
                e = e2;
                itf0.a.p(e, "BetMutexData: Hilt not ready, fall back to local state", new Object[0]);
                return d13.a.e().c;
            }
        }
    }

    @Override // defpackage.krm
    public final mr4 b() {
        return a().b();
    }

    @Override // defpackage.krm
    public final List<BigDecimal> c() {
        return a().c();
    }

    @Override // defpackage.krm
    public final void clear() {
        a().clear();
    }

    @Override // defpackage.krm
    public final void d() {
        a().d();
    }

    @Override // defpackage.krm
    public final BigDecimal e(egy egyVar) {
        return a().e(egyVar);
    }

    @Override // defpackage.krm
    public final b f(boolean z, BigDecimal bigDecimal, egy egyVar) {
        return a().f(z, bigDecimal, egyVar);
    }

    @Override // defpackage.krm
    public final List<a> g(List<Selection> list) {
        return a().g(list);
    }

    @Override // defpackage.krm
    public final void h(Event event, Market market, Outcome outcome, List<Selection> list) {
        a().h(event, market, outcome, list);
    }

    @Override // defpackage.krm
    public final void i(Event event, boolean z) {
        a().i(event, z);
    }

    @Override // defpackage.krm
    public final BigDecimal j() {
        return a().j();
    }

    @Override // defpackage.krm
    public final void k(ArrayList arrayList, int i, int i2) {
        a().k(arrayList, i, i2);
    }

    @Override // defpackage.krm
    public final Map<String, BigDecimal> l() {
        return a().l();
    }

    @Override // defpackage.krm
    public final void m() {
        a().m();
    }

    @Override // defpackage.krm
    public final List<BigDecimal> n() {
        return a().n();
    }

    @Override // defpackage.krm
    public final void o(List<? extends Selection> list) {
        a().o(list);
    }

    @Override // defpackage.krm
    public final BigDecimal p(egy egyVar) {
        return a().p(egyVar);
    }

    @Override // defpackage.krm
    public final Map<String, BigDecimal> q() {
        return a().q();
    }

    @Override // defpackage.krm
    public final Map<Event, Integer> r() {
        return a().r();
    }

    @Override // defpackage.krm
    public final Map<Event, HashSet<a>> s() {
        return a().s();
    }

    @Override // defpackage.krm
    public final boolean t() {
        return a().t();
    }

    @Override // defpackage.krm
    public final Set<Event> u() {
        return a().u();
    }

    @Override // defpackage.krm
    public final boolean v() {
        return a().v();
    }

    @Override // defpackage.krm
    public final int w() {
        return a().w();
    }

    @Override // defpackage.krm
    public final int x() {
        return a().x();
    }

    @Override // defpackage.krm
    public final void y() {
        a().y();
    }

    @Override // defpackage.krm
    public final void z(int i, String str, String str2) {
        a().z(i, str, str2);
    }
}
