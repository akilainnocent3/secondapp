package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public interface krm {
    BigDecimal A();

    void B();

    int C();

    int D();

    Map<Event, HashSet<lw2.a>> E();

    void F();

    List<lw2.a> G();

    void H(Event event, Market market, Outcome outcome, List<Selection> list);

    boolean I();

    lw2.b J(boolean z, egy egyVar);

    boolean K(Event event);

    boolean L(boolean z);

    BigDecimal M();

    double N(int i);

    void O(boolean z);

    boolean P();

    long Q(int i);

    void R(String str);

    mr4 b();

    List<BigDecimal> c();

    void clear();

    void d();

    BigDecimal e(egy egyVar);

    lw2.b f(boolean z, BigDecimal bigDecimal, egy egyVar);

    List<lw2.a> g(List<Selection> list);

    void h(Event event, Market market, Outcome outcome, List<Selection> list);

    void i(Event event, boolean z);

    BigDecimal j();

    void k(ArrayList arrayList, int i, int i2);

    Map<String, BigDecimal> l();

    void m();

    List<BigDecimal> n();

    void o(List<? extends Selection> list);

    BigDecimal p(egy egyVar);

    Map<String, BigDecimal> q();

    Map<Event, Integer> r();

    Map<Event, HashSet<lw2.a>> s();

    boolean t();

    Set<Event> u();

    boolean v();

    int w();

    int x();

    void y();

    void z(int i, String str, String str2);
}
