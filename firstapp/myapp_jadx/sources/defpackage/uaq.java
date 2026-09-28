package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.feature.luckynumber.featurematch.domain.data.LNLastMinuteCard;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luaq;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uaq extends j8i0 {
    public final BigDecimal A;
    public final String B;
    public final BigDecimal C;
    public final v340 D;
    public final wwd0 E;
    public final wwd0 F;
    public final wwd0 G;
    public final wwd0 H;
    public final wwd0 I;
    public final wwd0 J;
    public final v340 K;
    public final v340 L;
    public final ku90<k9q> M;
    public jvd0 N;
    public jvd0 O;
    public jvd0 P;
    public final qq40 a;
    public final m9k b;
    public final th80 c;
    public final ai10 d;
    public final psm e;
    public final odd f;
    public final d9q i;
    public final LNLastMinuteCard v;
    public final uf00 w;
    public final BigDecimal y;
    public final BigDecimal z;

    public uaq(vu60 vu60Var, iey ieyVar, qq40 qq40Var, m9k m9kVar, th80 th80Var, ai10 ai10Var, psm psmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        vu60Var.getClass();
        psmVar.getClass();
        this.a = qq40Var;
        this.b = m9kVar;
        this.c = th80Var;
        this.d = ai10Var;
        this.e = psmVar;
        this.f = oddVar;
        String str = (String) vu60Var.b("lotteryId");
        String str2 = str == null ? "" : str;
        String str3 = (String) vu60Var.b("lotteryName");
        str3 = str3 == null ? "" : str3;
        String str4 = (String) vu60Var.b("gameType");
        String str5 = str4 == null ? "" : str4;
        String str6 = (String) vu60Var.b("drawId");
        String str7 = str6 == null ? "" : str6;
        Long l = (Long) vu60Var.b("drawTime");
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = (Long) vu60Var.b("drawTimeForElapsedRealtime");
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        Long l3 = (Long) vu60Var.b("refreshAtElapsedRealtime");
        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
        String str8 = (String) vu60Var.b("marketId");
        String str9 = str8 == null ? "" : str8;
        String str10 = (String) vu60Var.b("marketTitle");
        String str11 = (String) vu60Var.b("specifier");
        String str12 = str11 == null ? "" : str11;
        String str13 = (String) vu60Var.b("outcomeId");
        String str14 = str13 == null ? "" : str13;
        Double d = (Double) vu60Var.b("odds");
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = (Double) vu60Var.b("probability");
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Integer num = (Integer) vu60Var.b("maxMainBallAmount");
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) vu60Var.b("ballCount");
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        String str15 = (String) vu60Var.b("balls");
        str15 = str15 == null ? "" : str15;
        String str16 = (String) vu60Var.b("minStake");
        str16 = str16 == null ? "" : str16;
        String str17 = (String) vu60Var.b("maxStake");
        String str18 = str17 == null ? "" : str17;
        String str19 = str2;
        String str20 = str7;
        int i = iIntValue2;
        double d3 = dDoubleValue;
        String str21 = str15;
        String str22 = str5;
        int i2 = iIntValue;
        String str23 = str16;
        long j = jLongValue;
        String str24 = str9;
        String str25 = str14;
        double d4 = dDoubleValue2;
        long j2 = jLongValue3;
        long j3 = jLongValue2;
        String str26 = str12;
        this.i = new d9q(str19, str3, str22, str20, j, j3, j2, str24, str10, str26, str25, d3, d4, i2, i, str21, str23, str18, (String) vu60Var.b("maxPayout"));
        this.v = new LNLastMinuteCard(str19, str3, str22, str20, j, j3, j2, str24, str10, str26, str25, d3, d4, i2, i);
        List listF0 = StringsKt.f0(str21, new char[]{','});
        ArrayList arrayList = new ArrayList();
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        this.w = a4h.f(arrayList);
        this.y = x1(this.i.q);
        this.z = x1(this.i.r);
        String str27 = this.i.s;
        this.A = str27 != null ? x1(str27) : null;
        this.B = this.e.B();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.v.A);
        bigDecimalValueOf.getClass();
        rkd0.a aVar = rkd0.Companion;
        this.C = bigDecimalValueOf;
        v340 v340VarZ1 = z1(this.b.b(), new cvq());
        this.D = v340VarZ1;
        wwd0 wwd0VarA = xwd0.a("");
        this.E = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(3);
        this.F = wwd0VarA2;
        hey heyVar = new hey(bm50.f(ieyVar.a.h(pu0.b.a)));
        rkd0.Companion.getClass();
        v340 v340VarZ2 = z1(heyVar, new rkd0(rkd0.b));
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA3 = xwd0.a(bool);
        this.G = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(t2q.c.a);
        this.H = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(bool);
        this.I = wwd0VarA5;
        wwd0 wwd0VarA6 = xwd0.a(bool);
        this.J = wwd0VarA6;
        v340 v340VarZ3 = z1(new n1i(wwd0VarA, v340VarZ2, new oaq(this, null)), null);
        this.K = v340VarZ3;
        this.L = z1(r1i.b(z1(r1i.c(wwd0VarA, v340VarZ3, z1(new n1i(wwd0VarA, v340VarZ3, new taq(this, null)), s2q.a.a), z1(r1i.a(v340VarZ1, wwd0VarA2, v340VarZ3, new qaq(4, null)), new tsd0(0)), wwd0VarA3, new paq(this, null)), new kaq(null, null, null, null, null, null, null, null, null, null, null, null, false, false, 131071)), wwd0VarA4, wwd0VarA5, wwd0VarA6, new saq(5, null)), new kaq(null, null, null, null, null, null, null, null, null, null, null, null, false, false, 131071));
        this.M = new ku90<>();
        ej5.c(o8i0.d(this), this.f, null, new laq(this, null), 2);
    }

    public static BigDecimal x1(String str) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = new rkd0(new BigDecimal(str));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        rkd0 rkd0Var = (rkd0) bVar;
        BigDecimal bigDecimal = rkd0Var != null ? rkd0Var.a : null;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        rkd0.Companion.getClass();
        return rkd0.b;
    }

    public final void y1(c9q c9qVar) {
        Object value;
        String strE;
        Object value2;
        String str;
        Object value3;
        String str2;
        Object value4;
        c9qVar.getClass();
        boolean zEquals = c9qVar.equals(c9q.c.a);
        ku90<k9q> ku90Var = this.M;
        if (zEquals) {
            ku90Var.a(k9q.a.a);
            return;
        }
        boolean zEquals2 = c9qVar.equals(c9q.l.a);
        wwd0 wwd0Var = this.G;
        if (zEquals2) {
            do {
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, Boolean.valueOf(!((Boolean) value4).booleanValue())));
            return;
        }
        boolean z = c9qVar instanceof c9q.h;
        v340 v340Var = this.K;
        wwd0 wwd0Var2 = this.E;
        if (z) {
            do {
                value3 = wwd0Var2.getValue();
                str2 = (String) value3;
                String strA = srd0.a(str2, ((c9q.h) c9qVar).a);
                if (!(((qrd0) v340Var.a.getValue()) instanceof qrd0.c)) {
                    str2 = strA;
                }
            } while (!wwd0Var2.g(value3, str2));
            return;
        }
        if (c9qVar instanceof c9q.a) {
            do {
                value2 = wwd0Var2.getValue();
                str = (String) value2;
                BigDecimal bigDecimalAdd = x1(str).add(((c9q.a) c9qVar).a);
                bigDecimalAdd.getClass();
                rkd0.a aVar = rkd0.Companion;
                String strA2 = ukd0.a(2, bigDecimalAdd, false, false);
                if (!(((qrd0) v340Var.a.getValue()) instanceof qrd0.c)) {
                    str = strA2;
                }
            } while (!wwd0Var2.g(value2, str));
            return;
        }
        if (c9qVar.equals(c9q.e.a)) {
            do {
                value = wwd0Var2.getValue();
                strE = (String) value;
                if (strE.length() != 0) {
                    strE = wae0.E(strE);
                }
            } while (!wwd0Var2.g(value, strE));
            return;
        }
        if (c9qVar.equals(c9q.b.a)) {
            wwd0Var2.getClass();
            wwd0Var2.k(null, "");
            return;
        }
        boolean z2 = c9qVar instanceof c9q.g;
        odd oddVar = this.f;
        if (z2) {
            Boolean bool = Boolean.FALSE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            int i = ((c9q.g) c9qVar).a;
            wwd0 wwd0Var3 = this.F;
            if (i != 2) {
                kd2.a(i, wwd0Var3, null);
                return;
            }
            jvd0 jvd0Var = this.O;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            BigDecimal bigDecimalX1 = x1((String) wwd0Var2.getValue());
            th80 th80Var = this.c;
            th80Var.getClass();
            bigDecimalX1.getClass();
            this.O = kzh.d(bm50.a(ozh.c(new or60(new sh80(th80Var, bigDecimalX1, null)), oddVar)), o8i0.d(this));
            kd2.a(3, wwd0Var3, null);
            return;
        }
        boolean zEquals3 = c9qVar.equals(c9q.j.a);
        wwd0 wwd0Var4 = this.H;
        v340 v340Var2 = this.L;
        if (zEquals3) {
            if (((kaq) v340Var2.a.getValue()).n) {
                t2q.a aVar2 = new t2q.a(oxc.a(this.B, " ", ((kaq) v340Var2.a.getValue()).h));
                wwd0Var4.getClass();
                wwd0Var4.k(null, aVar2);
                return;
            }
            return;
        }
        if (c9qVar.equals(c9q.d.a)) {
            jvd0 jvd0Var2 = this.N;
            if (jvd0Var2 == null || !jvd0Var2.isActive()) {
                wwd0 wwd0Var5 = this.J;
                if (((Boolean) wwd0Var5.getValue()).booleanValue() || !((kaq) v340Var2.a.getValue()).n) {
                    return;
                }
                wwd0Var5.k(null, Boolean.TRUE);
                LNLastMinuteCard lNLastMinuteCard = this.v;
                String str3 = lNLastMinuteCard.v;
                String str4 = lNLastMinuteCard.y;
                erq erqVar = new erq(4604, lNLastMinuteCard.e, lNLastMinuteCard.f, lNLastMinuteCard.a, lNLastMinuteCard.b, lNLastMinuteCard.d);
                String str5 = lNLastMinuteCard.w;
                String str6 = str5 == null ? "" : str5;
                String str7 = lNLastMinuteCard.z;
                String strValueOf = String.valueOf(lNLastMinuteCard.A);
                String strValueOf2 = String.valueOf(lNLastMinuteCard.B);
                uf00 uf00Var = this.w;
                yxq yxqVar = new yxq(str6, str7, strValueOf, strValueOf2, uf00Var.size(), this.C);
                ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
                Iterator<E> it = uf00Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(new kxq.e(((Number) it.next()).intValue(), null, zxq.k.a));
                }
                this.N = kzh.d(ozh.c(new yzh(new g1i(this.d.a(str3, str4, erqVar, yxqVar, new dqh0.c(a4h.f(arrayList), lNLastMinuteCard.z), (String) wwd0Var2.getValue(), this.B), new maq(this, null)), new naq(this, null)), oddVar), o8i0.d(this));
                return;
            }
            return;
        }
        if (!c9qVar.equals(c9q.f.a)) {
            if (c9qVar.equals(c9q.i.a)) {
                ku90Var.a(k9q.b.a);
                return;
            }
            if (c9qVar.equals(c9q.k.a)) {
                ku90Var.a(k9q.a.a);
                return;
            } else if (c9qVar instanceof c9q.m) {
                ku90Var.a(new k9q.c(((c9q.m) c9qVar).a));
                return;
            } else {
                uhc.a();
                return;
            }
        }
        t2q t2qVar = (t2q) wwd0Var4.getValue();
        t2q.c cVar = t2q.c.a;
        if (Intrinsics.g(t2qVar, cVar)) {
            return;
        }
        if (t2qVar instanceof t2q.a) {
            wwd0Var4.setValue(cVar);
        } else {
            if (Intrinsics.g(t2qVar, t2q.e.a)) {
                return;
            }
            if (t2qVar instanceof t2q.d) {
                ku90Var.a(k9q.a.a);
            } else {
                uhc.a();
            }
        }
    }

    public final v340 z1(lyh lyhVar, Object obj) {
        return e1i.e(ozh.c(lyhVar, this.f), o8i0.d(this), q490.a.a, obj);
    }
}
