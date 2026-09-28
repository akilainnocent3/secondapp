package defpackage;

import android.content.Context;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public interface jrm {
    void A(QuickBetView quickBetView);

    LinkedHashMap A0();

    void A1();

    void B();

    void B0(Subscriber subscriber);

    boolean B1();

    ArrayList C();

    boolean C0();

    void C1(Selection selection);

    boolean D();

    String D0();

    vu2 D1();

    boolean E();

    lyh<Integer> E0();

    boolean E1();

    String F(int i, Context context, boolean z);

    Unit F0(pv3 pv3Var, sv3.a aVar);

    boolean F1();

    void G(boolean z);

    boolean G0(String str);

    boolean G1();

    String H(Context context);

    boolean H0();

    boolean H1(boolean z);

    boolean I();

    void I0(Selection selection, boolean z);

    void I1();

    g08 J();

    void J0(boolean z);

    boolean J1();

    void K(String str, boolean z);

    k53 K0();

    void K1();

    void L(Context context, Selection selection);

    void L0(Selection selection, boolean z);

    boolean L1();

    boolean M();

    boolean M0();

    boolean M1();

    boolean N(Event event, Market market, Outcome outcome, k980 k980Var, List list);

    boolean N0(Event event, Market market, Outcome outcome, boolean z, boolean z2, List<? extends Selection> list, k980 k980Var, boolean z3, boolean z4, boolean z5, Selection selection, boolean z6, boolean z7, boolean z8);

    void N1(String str);

    boolean O();

    boolean O0();

    boolean O1();

    void P(QuickBetView quickBetView);

    void P0(String str, Selection selection, Selection selection2);

    boolean P1(up3 up3Var);

    boolean Q();

    int Q0();

    LinkedHashSet Q1();

    boolean R();

    LinkedHashSet R0();

    LinkedHashMap S();

    void S0(t880.a aVar);

    void T(Selection selection, String str);

    boolean T0(Selection selection);

    ArrayList U();

    boolean U0();

    boolean V();

    void V0(Subscriber subscriber, boolean z);

    boolean W();

    void W0(ArrayList arrayList);

    int X();

    void X0(boolean z);

    int Y();

    String Y0();

    boolean Z();

    boolean Z0();

    BoreDrawConfig a();

    boolean a0();

    int a1(Event event, Market market, Outcome outcome, List<? extends Selection> list, String str, String str2);

    void b(boolean z);

    boolean b0();

    void b1();

    void c(Context context);

    void c0(Selection selection, boolean z);

    LinkedHashMap c1();

    void d();

    k980 d0();

    void d1(boolean z);

    boolean e();

    boolean e0(Selection selection);

    void e1(i63 i63Var);

    boolean f(Event event, Market market, boolean z);

    boolean f0();

    void f1(List list);

    boolean g(String str, String str2, String str3, boolean z);

    boolean g0();

    void g1(boolean z);

    boolean h();

    boolean h0();

    String h1(int i, boolean z);

    void i(boolean z);

    void i0(QuickBetView quickBetView, Selection selection);

    void i1(Selection selection);

    void j(Selection selection);

    boolean j0(Event event, Market market, Outcome outcome, k980 k980Var);

    void j1(iu2.a aVar);

    int k();

    void k0(j8s j8sVar);

    void k1(Selection selection);

    boolean l();

    boolean l0(Selection selection);

    LinkedHashMap l1();

    void m(Selection selection);

    boolean m0();

    void m1(iu2.a aVar);

    boolean n();

    boolean n0();

    boolean n1();

    int o();

    boolean o0();

    boolean o1();

    boolean p();

    void p0(boolean z);

    boolean p1();

    void q0(boolean z);

    boolean q1();

    void r(i63 i63Var);

    void r0(k53 k53Var);

    void r1();

    void s(String str);

    boolean s0(boolean z);

    void s1(boolean z);

    boolean t();

    Object t0(Subscriber subscriber, x1b x1bVar);

    boolean t1();

    boolean u();

    boolean u0();

    boolean u1(Selection selection);

    boolean v(Event event, Market market, Outcome outcome);

    boolean v0();

    boolean v1();

    j8s w();

    boolean w0(Event event, Market market, Outcome outcome);

    boolean w1();

    boolean x();

    void x0(boolean z);

    void x1();

    void y(List<? extends Selection> list, t880.a aVar);

    void y0(Subscriber subscriber, Selection selection, Subscriber subscriber2);

    boolean y1(Event event);

    int z();

    void z0(BoreDrawConfig boreDrawConfig);

    void z1(Subscriber subscriber, Subscriber subscriber2);
}
