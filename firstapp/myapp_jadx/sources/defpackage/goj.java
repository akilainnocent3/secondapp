package defpackage;

import android.os.SystemClock;
import androidx.compose.runtime.m;
import com.sportygames.commons.models.GPSData;
import com.sportygames.crash.models.BetData;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.CashoutRequest;
import com.sportygames.crash.remote.models.MultiplierResponse;
import com.sportygames.crash.remote.models.PlaceBetRequest;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class goj extends j8i0 {
    public ytw<String[]> A;
    public final ytw<String[]> B;
    public ytw<Integer> C;
    public ytw<String> D;
    public final ytw<Boolean> E;
    public int F;
    public int G;
    public final ytw<String> H;
    public final ytw<String> I;
    public final ytw<BetData> J;
    public final ytw<j58> K;
    public final ytw<j58> L;
    public final ytw<Integer> M;
    public final ytw<j58> N;
    public final ytw<Boolean> O;
    public final ytw<Boolean> P;
    public final ytw<Integer> Q;
    public final ytw<String> R;
    public final ytw<String> S;
    public final ytw<Boolean> T;
    public final ytw<String> U;
    public final ytw<String> V;
    public final ytw<String> W;
    public final ytw<String> X;
    public final ytw<Boolean> Y;
    public final ytw<Boolean> Z;
    public final List<ul2> a;
    public final ytw<Boolean> a0;
    public final t530 b;
    public final ytw<Boolean> b0;
    public final loa0 c;
    public final ytw<Boolean> c0;
    public final ts6 d;
    public final ytw<String> d0;
    public final qd3 e;
    public final ytw<mz1> e0;
    public final ly50 f;
    public final ytw<cj5> f0;
    public final ytw<Boolean> g0;
    public final ytw<Boolean> h0;
    public final os6 i;
    public final ytw<Boolean> i0;
    public final ytw<Boolean> j0;
    public final ytw<Boolean> k0;
    public final ytw<Boolean> l0;
    public final ytw<Boolean> m0;
    public rd7 n0;
    public qdb o0;
    public oeb p0;
    public final ytw<Boolean> q0;
    public final ytw<Boolean> r0;
    public final ytw<String> s0;
    public final ytw<Boolean> t0;
    public final ytw<Boolean> u0;
    public ytw<String> v;
    public ul2 v0;
    public ytw<String> w;
    public final ytw<a> w0;
    public final ssw<MultiplierResponse> x0;
    public final ytw<String> y;
    public final ssw<Pair<Integer, String>> y0;
    public ytw<String> z;
    public final ytw<Boolean> z0;

    public static abstract class b {

        public static final class a extends b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2034797583;
            }

            public final String toString() {
                return "Classic";
            }
        }

        /* JADX INFO: renamed from: goj$b$b, reason: collision with other inner class name */
        public static final class C0606b extends b {
            public final String a;
            public final double b;

            public C0606b(String str, double d) {
                this.a = str;
                this.b = d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0606b)) {
                    return false;
                }
                C0606b c0606b = (C0606b) obj;
                return Intrinsics.g(this.a, c0606b.a) && Double.compare(this.b, c0606b.b) == 0;
            }

            public final int hashCode() {
                String str = this.a;
                return Double.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return "OverUnder(betType=" + this.a + ", targetCoefficient=" + this.b + ")";
            }
        }

        public static final class c extends b {
            public final double a;
            public final double b;

            public c(double d, double d2) {
                this.a = d;
                this.b = d2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Double.compare(this.a, cVar.a) == 0 && Double.compare(this.b, cVar.b) == 0;
            }

            public final int hashCode() {
                return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sbA = ffp.a(this.a, "Range(startCoefficient=", ", endCoefficient=");
                sbA.append(this.b);
                sbA.append(")");
                return sbA.toString();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public goj(List<ul2> list, t530 t530Var, loa0 loa0Var, ts6 ts6Var, qd3 qd3Var, ly50 ly50Var, os6 os6Var) {
        ts6Var.getClass();
        qd3Var.getClass();
        ly50Var.getClass();
        os6Var.getClass();
        this.a = list;
        this.b = t530Var;
        this.c = loa0Var;
        this.d = ts6Var;
        this.e = qd3Var;
        this.f = ly50Var;
        this.i = os6Var;
        this.v = m.b("");
        this.w = m.b("");
        this.y = m.b("game_title_webp");
        this.z = m.b("");
        this.A = m.b(new String[]{""});
        this.B = m.b(new String[]{""});
        this.C = m.b(0);
        this.D = m.b("");
        Boolean bool = Boolean.FALSE;
        this.E = m.b(bool);
        this.H = m.b("");
        this.I = m.b("");
        this.J = m.b(new BetData(null, null == true ? 1 : 0, 3, null == true ? 1 : 0));
        long j = j58.f;
        this.K = m.b(new j58(j));
        this.L = m.b(new j58(j));
        this.M = m.b(1);
        this.N = m.b(new j58(j58.l));
        this.O = m.b(bool);
        this.P = m.b(bool);
        this.Q = m.b(0);
        this.R = m.b("");
        this.S = m.b("");
        this.T = m.b(bool);
        this.U = m.b("");
        this.V = m.b("");
        this.W = m.b("");
        this.X = m.b("");
        this.Y = m.b(bool);
        this.Z = m.b(bool);
        this.a0 = m.b(bool);
        this.b0 = m.b(bool);
        this.c0 = m.b(bool);
        this.d0 = m.b("");
        this.e0 = m.b(new mz1());
        this.f0 = m.b(new cj5());
        this.g0 = m.b(bool);
        this.h0 = m.b(bool);
        this.i0 = m.b(bool);
        this.j0 = m.b(Boolean.TRUE);
        this.k0 = m.b(bool);
        this.l0 = m.b(bool);
        this.m0 = m.b(bool);
        this.q0 = m.b(bool);
        this.r0 = m.b(bool);
        this.s0 = m.b("");
        this.t0 = m.b(bool);
        this.u0 = m.b(bool);
        this.v0 = new ul2();
        String symbol = Currency.getInstance("INR").getSymbol();
        symbol.getClass();
        this.w0 = m.b(new a(null, symbol, "", "", "", "", null, null, false, false, false, 4289));
        this.x0 = new ssw<>();
        this.y0 = new ssw<>();
        this.z0 = m.b(bool);
    }

    public static /* synthetic */ void A1(goj gojVar, BetData betData, long j, GPSData gPSData, boolean z, int i, String str, Function0 function0, Function1 function1, Long l, Long l2, String str2, int i2) {
        if ((i2 & 256) != 0) {
            l = null;
        }
        if ((i2 & 512) != 0) {
            l2 = null;
        }
        if ((i2 & 1024) != 0) {
            str2 = null;
        }
        gojVar.z1(betData, j, gPSData, z, i, str, function0, function1, l, l2, str2);
    }

    public static void C1(goj gojVar, double d, double d2, Double d3, Double d4, String str, String str2, String str3, double d5, double d6, Function1 function1, b bVar, Double d7, Double d8, int i) {
        gr6 gr6Var;
        double dDoubleValue;
        String str4;
        b bVar2 = (i & 1024) != 0 ? b.a.a : bVar;
        String strN = null;
        Double d9 = (i & 2048) != 0 ? null : d7;
        Double d10 = (i & 4096) != 0 ? null : d8;
        gojVar.getClass();
        str3.getClass();
        bVar2.getClass();
        Double dH = str != null ? kotlin.text.b.h(str) : null;
        if (dH == null) {
            if ((bVar2 instanceof b.a) || d <= 0.0d) {
                dH = null;
            } else {
                dH = Double.valueOf((d3 != null ? d3.doubleValue() : d2) / d);
            }
        }
        gojVar.i.getClass();
        double dDoubleValue2 = (dH != null ? dH.doubleValue() : 0.0d) * d;
        double d11 = dDoubleValue2 > d5 ? d5 : dDoubleValue2;
        boolean z = d4 != null;
        if (z || d6 <= 0.0d) {
            gr6Var = new gr6(d11, d11 - (d4 != null ? d4.doubleValue() : 0.0d), d2, d4, null, z, false, d9, d10);
        } else {
            double d12 = d2 - d11;
            if (d12 < 0.0d) {
                d12 = 0.0d;
            }
            gr6Var = new gr6(d2, d2, d2, null, Double.valueOf(d12), false, d12 > 0.0d, null, null);
        }
        boolean z2 = gr6Var.g;
        double d13 = gr6Var.a;
        Double d14 = gr6Var.e;
        double d15 = gr6Var.c;
        if (z2) {
            dDoubleValue = d15 - (d14 != null ? d14.doubleValue() : 0.0d);
        } else {
            dDoubleValue = d13;
        }
        if (str2 != null) {
            if (StringsKt.U(str2)) {
                if (dH != null) {
                    double dDoubleValue3 = dH.doubleValue();
                    TreeMap treeMap = pw.a;
                    strN = pw.n(dDoubleValue3);
                }
                str4 = strN == null ? "" : strN;
            } else {
                str4 = str2;
            }
            strN = str4;
        }
        ((x5a0) gojVar.w0).setValue(new a(strN, str3, x1(str3, d13, function1), x1(str3, d15, function1), y1(str3, Double.valueOf(dDoubleValue), function1), y1(str3, gr6Var.d, function1), y1(str3, d14, function1), x1(str3, gr6Var.b, function1), true, gr6Var.f, gr6Var.g, bVar2, gr6Var.h, gr6Var.i));
    }

    public static String x1(String str, double d, Function1 function1) {
        Object objInvoke = function1.invoke(str);
        TreeMap treeMap = pw.a;
        return objInvoke + " " + pw.d(d);
    }

    public static String y1(String str, Double d, Function1 function1) {
        String str2;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            Object objInvoke = function1.invoke(str);
            TreeMap treeMap = pw.a;
            str2 = objInvoke + " " + pw.m(dDoubleValue);
        } else {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    public final void B1(MultiplierResponse multiplierResponse, boolean z, String str, boolean z2, int i, Function1 function1, Long l) {
        boolean z3;
        oeb oebVar;
        multiplierResponse.getClass();
        str.getClass();
        ts6.b bVar = ts6.b.b;
        this.d.getClass();
        ArrayList arrayListA = ts6.a(this.a, multiplierResponse, z, str, z2, bVar);
        int size = arrayListA.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListA.get(i2);
            i2++;
            ts6.a aVar = (ts6.a) obj;
            int i3 = aVar.a;
            CashoutRequest cashoutRequest = aVar.d;
            if (i3 == i + 1 && cashoutRequest != null) {
                this.y0.j(new Pair<>(Integer.valueOf(i3), aVar.b));
                String strJ = new eal().j(cashoutRequest);
                String strValueOf = String.valueOf(cashoutRequest.getRoundId());
                long betId = cashoutRequest.getBetId();
                loa0 loa0Var = this.c;
                loa0Var.getClass();
                strValueOf.getClass();
                if (Intrinsics.g(loa0Var.L.get(loa0.E1(betId, strValueOf)), Boolean.TRUE)) {
                    function1.invoke(strJ);
                    Unit unit = Unit.a;
                    z3 = true;
                } else {
                    usm usmVar = loa0Var.b;
                    brb brbVar = brb.v;
                    z3 = true;
                    usm.g(usmVar, brbVar, tzm.a(loa0Var.c, brbVar, null, 6), strJ);
                    loa0Var.A1(betId, strValueOf);
                    if (l != null && (oebVar = this.p0) != null) {
                        oebVar.invoke(Long.valueOf(SystemClock.elapsedRealtime() - l.longValue()));
                    }
                }
                this.a.get(aVar.a - 1).K1(z3);
            }
        }
    }

    public final void D1(PlaceBetRequest placeBetRequest, ul2 ul2Var, Function0<Unit> function0, final Function1<? super String, Unit> function1, Long l) {
        qdb qdbVar;
        placeBetRequest.getClass();
        final String strJ = new eal().j(placeBetRequest);
        if (this.c.I1(placeBetRequest.getBetIndex(), strJ, String.valueOf(placeBetRequest.getRoundId()), new Function0() { // from class: eoj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                function1.invoke(strJ);
                return Unit.a;
            }
        }) && l != null && (qdbVar = this.o0) != null) {
            qdbVar.invoke(Long.valueOf(SystemClock.elapsedRealtime() - l.longValue()));
        }
        ul2Var.I1(true);
        osw oswVar = ul2Var.M;
        ul2Var.H1(false);
        ((u5a0) oswVar).k(oswVar.getValue().intValue() + 1);
        function0.invoke();
        rd7 rd7Var = this.n0;
        if (rd7Var != null) {
            rd7Var.invoke(placeBetRequest.getBetAmount());
        }
        wz.a("AutoBetPlaced", (String) ((x5a0) this.D).getValue(), "1", String.valueOf(oswVar.getValue().intValue()));
    }

    public final void E1(ul2 ul2Var) {
        ul2Var.getClass();
        this.v0 = ul2Var;
    }

    public final void F1(boolean z) {
        ((x5a0) this.t0).setValue(Boolean.valueOf(z));
    }

    public final void G1(boolean z) {
        ((x5a0) this.q0).setValue(Boolean.valueOf(z));
    }

    public final void H1(boolean z) {
        ((x5a0) this.u0).setValue(Boolean.valueOf(z));
    }

    public final void z1(BetData betData, long j, GPSData gPSData, boolean z, int i, String str, Function0<Unit> function0, Function1<? super String, Unit> function1, Long l, Long l2, String str2) {
        long jLongValue;
        String str3;
        ytw<MultiplierResponse> ytwVar;
        goj gojVar = this;
        betData.getClass();
        ul2 ul2Var = (ul2) CollectionsKt.V(i, gojVar.a);
        MultiplierResponse multiplierResponse = (ul2Var == null || (ytwVar = ul2Var.b) == null) ? null : (MultiplierResponse) ((x5a0) ytwVar).getValue();
        if (l2 != null) {
            jLongValue = l2.longValue();
        } else {
            Long lValueOf = multiplierResponse != null ? Long.valueOf(multiplierResponse.getRoundId()) : null;
            jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
        }
        long j2 = jLongValue;
        if (str2 == null) {
            String messageType = multiplierResponse != null ? multiplierResponse.getMessageType() : null;
            if (messageType == null) {
                messageType = "";
            }
            str3 = messageType;
        } else {
            str3 = str2;
        }
        gojVar.e.getClass();
        ArrayList arrayListA = qd3.a(gojVar.a, j, gPSData, z, str, j2, str3);
        int size = arrayListA.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            qd3.a aVar = (qd3.a) arrayListA.get(i2);
            if (((BetContainerState) aVar.a.a.getValue()).getDetailResponse().getBetIndex() == i + 1) {
                try {
                    if (aVar.b != null) {
                        ul2 ul2Var2 = ((qd3.a) arrayListA.get(i)).a;
                        ul2Var2.R1(false);
                        gojVar.D1(aVar.b, ul2Var2, function0, function1, l);
                    }
                } catch (Exception unused) {
                }
            }
            gojVar = this;
            i2 = i3;
        }
    }

    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final b l;
        public final Double m;
        public final Double n;

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, int i) {
            this((i & 1) != 0 ? "" : str, str2, str3, str4, str5, str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, z, z2, z3, b.a.a, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && Intrinsics.g(this.f, aVar.f) && Intrinsics.g(this.g, aVar.g) && Intrinsics.g(this.h, aVar.h) && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && Intrinsics.g(this.l, aVar.l) && Intrinsics.g(this.m, aVar.m) && Intrinsics.g(this.n, aVar.n);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (this.l.hashCode() + mtg0.a(mtg0.a(mtg0.a(mtg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, false)) * 31;
            Double d = this.m;
            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.n;
            return iHashCode2 + (d2 != null ? d2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("CashoutModel(cashoutCoeff=", this.a, ", currency=", this.b, ", cashoutAmount=");
            hxa.c(sbA, this.c, ", payoutAmount=", this.d, ", totalAmount=");
            hxa.c(sbA, this.e, ", giftAmount=", this.f, ", bonusAmount=");
            hxa.c(sbA, this.g, ", winAmount=", this.h, ", showCard=");
            nng.a(", showGiftLayout1=", ", showBonusLayout1=", sbA, this.i, this.j);
            sbA.append(this.k);
            sbA.append(", showGiftLayout2=false, variant=");
            sbA.append(this.l);
            sbA.append(", turboBonusAmount=");
            sbA.append(this.m);
            sbA.append(", payoutWithoutTurboBonusAmount=");
            sbA.append(this.n);
            sbA.append(")");
            return sbA.toString();
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, b bVar, Double d, Double d2) {
            qn4.b(str2, str3, str4, str5, str6);
            str7.getClass();
            str8.getClass();
            bVar.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = z;
            this.j = z2;
            this.k = z3;
            this.l = bVar;
            this.m = d;
            this.n = d2;
        }
    }
}
