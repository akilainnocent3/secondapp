package defpackage;

import com.appsflyer.internal.p;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.League;
import com.sportybet.android.instantwin.newtork.model.response.MarketInRound;
import com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.TicketInRound;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t4k0 implements kci {
    public final eko a;
    public final psm b;
    public final b390 c;
    public final tuw d;
    public final wwd0 e;
    public final Round f;
    public final wwd0 g;

    public static final class a {
        public final Throwable a;

        public a(Throwable th) {
            th.getClass();
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return kox.a("LeagueEventsDataError(throwable=", ")", this.a);
        }
    }

    public interface b {

        public static final class a implements b {
            public final a a;

            public a(a aVar) {
                this.a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return this.a.a.hashCode();
            }

            public final String toString() {
                return "Failure(error=" + this.a + ")";
            }
        }

        /* JADX INFO: renamed from: t4k0$b$b, reason: collision with other inner class name */
        public static final class C1113b implements b {
            public static final C1113b a = new C1113b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1113b);
            }

            public final int hashCode() {
                return 222954250;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c implements b {
            public final List<j6k0> a;

            public c(List<j6k0> list) {
                list.getClass();
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return p.a("Success(events=", ")", this.a);
            }
        }
    }

    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cd3.values().length];
            try {
                cd3.a aVar = cd3.b;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                cd3.a aVar2 = cd3.b;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                cd3.a aVar3 = cd3.b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                cd3.a aVar4 = cd3.b;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                cd3.a aVar5 = cd3.b;
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t4k0(eko ekoVar, psm psmVar, d5k0 d5k0Var, reo reoVar, sfi sfiVar, rqf0 rqf0Var) {
        ekoVar.getClass();
        psmVar.getClass();
        this.a = ekoVar;
        this.b = psmVar;
        this.c = d390.b(0, 1, pb5.b, 1);
        this.d = uuw.a();
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.e = xwd0.a(o2gVar);
        hqc hqcVarD = yy50.a.d();
        nqc nqcVar = (nqc) (hqcVarD instanceof nqc ? hqcVarD : null);
        this.f = nqcVar != null ? (Round) nqcVar.a : null;
        this.g = xwd0.a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hdi j(Pair pair, fci fciVar, j6k0 j6k0Var, boolean z) {
        if (!z) {
            return fciVar == null ? new hdi.b(j6k0Var.d, j6k0Var.f) : new hdi.a(String.valueOf(fciVar.b), String.valueOf(fciVar.c));
        }
        if (pair != null) {
            return new gdi(String.valueOf(((Number) pair.a).intValue()), String.valueOf(((Number) pair.b).intValue()));
        }
        return fdi.a;
    }

    public static BigDecimal l(i4k0 i4k0Var) {
        List<j4k0> list = i4k0Var.c;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        bigDecimalValueOf.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((j4k0) it.next()).e);
            bigDecimalValueOf.getClass();
        }
        return bigDecimalValueOf;
    }

    public static boolean m(i4k0 i4k0Var) {
        List<j4k0> list = i4k0Var.c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            q5k0 q5k0Var = (q5k0) CollectionsKt.p0(((j4k0) it.next()).m);
            if (q5k0Var != null && q5k0Var.g) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kci
    public final xro a(Integer num) {
        i4k0 i4k0VarK = k();
        if (i4k0VarK != null) {
            BigDecimal bigDecimalL = l(i4k0VarK);
            if (bigDecimalL.compareTo(BigDecimal.ZERO) > 0) {
                String str = this.b.b() + " " + sfi.f(bigDecimalL);
                StringUiText stringUiText = vch0.a;
                Iterator it = kotlin.collections.b.k(new ResourceUiText(R.string.common_dates__from), new StringUiText(" "), num != null ? new ResourceUiText(num.intValue()) : new ResourceUiText(R.string.common_functions__unknown)).iterator();
                if (!it.hasNext()) {
                    zkh.a("Empty collection can't be reduced.");
                    return null;
                }
                Object next = it.next();
                while (it.hasNext()) {
                    next = ((UiText) next).h((UiText) it.next());
                }
                return new xro(str, (UiText) next, m(i4k0VarK), gro.a.a);
            }
        }
        return null;
    }

    @Override // defpackage.kci
    public final v340 b() {
        return e1i.b(this.g);
    }

    @Override // defpackage.kci
    public final List<tci> c() {
        i4k0 i4k0VarK = k();
        if (i4k0VarK == null) {
            return m2g.a;
        }
        ArrayList arrayListI0 = CollectionsKt.i0(i4k0VarK.f, CollectionsKt.O(i4k0VarK.e, 1));
        ArrayList arrayList = new ArrayList(l48.r(arrayListI0, 10));
        int size = arrayListI0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListI0.get(i);
            i++;
            j6k0 j6k0Var = (j6k0) obj;
            arrayList.add(new tci(j6k0Var.a, j6k0Var.g));
        }
        return arrayList;
    }

    @Override // defpackage.kci
    public final void d(String str) {
        this.c.a(str);
    }

    @Override // defpackage.kci
    public final Round e() {
        return this.f;
    }

    @Override // defpackage.kci
    public final void f(et7 et7Var, String str, boolean z, wwd0 wwd0Var, wwd0 wwd0Var2, wwd0 wwd0Var3, wwd0 wwd0Var4, wwd0 wwd0Var5, wwd0 wwd0Var6, wwd0 wwd0Var7, wwd0 wwd0Var8, wwd0 wwd0Var9) {
        kzh.d(new g1i(new v4k0(new lyh[]{wwd0Var, wwd0Var2, wwd0Var3, wwd0Var4, wwd0Var5, wwd0Var6, wwd0Var7, this.e, wwd0Var8, wwd0Var9}, this, z), new x4k0(this, null)), et7Var);
        kzh.d(new g1i(new w4k0(wwd0Var6), new y4k0(et7Var, this, str, null)), et7Var);
        kzh.d(new g1i(this.c, new z4k0(this, str, null)), et7Var);
    }

    @Override // defpackage.kci
    public final Set<String> g() {
        Set<String> setE0;
        List<j6k0> list;
        i4k0 i4k0VarK = k();
        if (i4k0VarK == null || (list = i4k0VarK.e) == null) {
            setE0 = null;
        } else {
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((j6k0) it.next()).a);
            }
            setE0 = CollectionsKt.E0(arrayList);
        }
        return setE0 == null ? t3g.a : setE0;
    }

    public final gci h(List<j4k0> list, final List<l6k0> list2, final List<n6k0> list3, final List<r5k0> list4, final List<vci> list5, final j6k0 j6k0Var, final String str) {
        hdi.b bVar = new hdi.b(j6k0Var.d, j6k0Var.f);
        qeo qeoVarB = reo.b(j6k0Var.g);
        u48 u48VarK = CollectionsKt.K(list);
        o4k0 o4k0Var = new o4k0();
        jd80 jd80Var = jd80.a;
        uf00 uf00VarC = a4h.c(new ruh(new lte(ld80.d(new ruh(new ruh(u48VarK, o4k0Var, jd80Var), new p4k0(), jd80Var), new Function1() { // from class: q4k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                u5k0 u5k0Var = (u5k0) obj;
                u5k0Var.getClass();
                return Boolean.valueOf(u5k0Var.a.equals(j6k0Var.a));
            }
        }), new r4k0()), new Function1(this) { // from class: s4k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                u5k0 u5k0Var = (u5k0) obj;
                u5k0Var.getClass();
                return d5k0.b(list2, list3, list4, list5, u5k0Var, false, str);
            }
        }, jd80Var));
        String str2 = j6k0Var.a;
        m5k0 m5k0Var = j6k0Var.c;
        String str3 = m5k0Var.a;
        String str4 = m5k0Var.b;
        m5k0 m5k0Var2 = j6k0Var.e;
        return new gci(str2, str3, str4, m5k0Var2.a, m5k0Var2.b, null, bVar, qeoVarB, null, uf00VarC);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x0138  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object i(String str, String str2, boolean z, x1b x1bVar) {
        u4k0 u4k0Var;
        boolean z2;
        String str3;
        String str4;
        quw quwVar;
        Object value;
        boolean z3;
        Object objY;
        boolean z4;
        boolean z5;
        Throwable thA;
        Throwable th;
        String str5;
        List list;
        List list2;
        String str6;
        Object value2;
        Object value3;
        if (x1bVar instanceof u4k0) {
            u4k0Var = (u4k0) x1bVar;
            int i = u4k0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                u4k0Var.w = i - Integer.MIN_VALUE;
            } else {
                u4k0Var = new u4k0(this, x1bVar);
            }
        } else {
            u4k0Var = new u4k0(this, x1bVar);
        }
        Object obj = u4k0Var.i;
        y5b y5bVar = y5b.a;
        int i2 = u4k0Var.w;
        tuw tuwVar = this.d;
        wwd0 wwd0Var = this.e;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                u4k0Var.a = str;
                u4k0Var.b = str2;
                u4k0Var.c = tuwVar;
                z2 = z;
                u4k0Var.e = z2;
                u4k0Var.w = 1;
                if (tuwVar.d(u4k0Var) != y5bVar) {
                    str3 = str;
                    str4 = str2;
                    quwVar = tuwVar;
                }
                return y5bVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        tuwVar = u4k0Var.d;
                        th = (Throwable) u4k0Var.c;
                        str5 = u4k0Var.b;
                        uj50.b(obj);
                        do {
                            try {
                                value2 = wwd0Var.getValue();
                            } catch (Throwable th2) {
                                tuwVar.f(null);
                                throw th2;
                            }
                        } while (!wwd0Var.g(value2, kpu.i((Map) value2, new Pair(str5, new b.a(new a(th))))));
                        Unit unit = Unit.a;
                        tuwVar.f(null);
                        return Unit.a;
                    }
                    if (i2 != 4) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tuwVar = u4k0Var.d;
                    list2 = (List) u4k0Var.c;
                    str6 = u4k0Var.b;
                    uj50.b(obj);
                    do {
                        try {
                            value3 = wwd0Var.getValue();
                        } catch (Throwable th3) {
                            tuwVar.f(null);
                            throw th3;
                        }
                    } while (!wwd0Var.g(value3, kpu.i((Map) value3, new Pair(str6, new b.c(list2)))));
                    Unit unit2 = Unit.a;
                    tuwVar.f(null);
                    return Unit.a;
                }
                z4 = u4k0Var.f;
                z5 = u4k0Var.e;
                String str7 = u4k0Var.b;
                uj50.b(obj);
                objY = ((zi50) obj).a;
                str4 = str7;
                thA = zi50.a(objY);
                if (thA == null) {
                    list = (List) objY;
                    u4k0Var.a = null;
                    u4k0Var.b = str4;
                    u4k0Var.c = list;
                    u4k0Var.d = tuwVar;
                    u4k0Var.e = z5;
                    u4k0Var.f = z4;
                    u4k0Var.w = 4;
                    if (tuwVar.d(u4k0Var) != y5bVar) {
                        list2 = list;
                        str6 = str4;
                        do {
                            value3 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value3, kpu.i((Map) value3, new Pair(str6, new b.c(list2)))));
                        Unit unit3 = Unit.a;
                        tuwVar.f(null);
                        return Unit.a;
                    }
                } else {
                    u4k0Var.a = null;
                    u4k0Var.b = str4;
                    u4k0Var.c = thA;
                    u4k0Var.d = tuwVar;
                    u4k0Var.e = z5;
                    u4k0Var.f = z4;
                    u4k0Var.w = 3;
                    if (tuwVar.d(u4k0Var) != y5bVar) {
                        th = thA;
                        str5 = str4;
                        do {
                            value2 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value2, kpu.i((Map) value2, new Pair(str5, new b.a(new a(th))))));
                        Unit unit4 = Unit.a;
                        tuwVar.f(null);
                        return Unit.a;
                    }
                }
                return y5bVar;
            }
            boolean z6 = u4k0Var.e;
            quw quwVar2 = (quw) u4k0Var.c;
            str4 = u4k0Var.b;
            str3 = u4k0Var.a;
            uj50.b(obj);
            quwVar = quwVar2;
            z2 = z6;
            if (((Map) wwd0Var.getValue()).get(str4) == null || z2) {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, kpu.i((Map) value, new Pair(str4, b.C1113b.a))));
                z3 = true;
            } else {
                z3 = false;
            }
            quwVar.f(null);
            if (!z3) {
                return Unit.a;
            }
            u4k0Var.a = null;
            u4k0Var.b = str4;
            u4k0Var.c = null;
            u4k0Var.e = z2;
            u4k0Var.f = z3;
            u4k0Var.w = 2;
            objY = this.a.y(str3, str4, u4k0Var);
            if (objY != y5bVar) {
                z4 = z3;
                z5 = z2;
                thA = zi50.a(objY);
                if (thA == null) {
                    list = (List) objY;
                    u4k0Var.a = null;
                    u4k0Var.b = str4;
                    u4k0Var.c = list;
                    u4k0Var.d = tuwVar;
                    u4k0Var.e = z5;
                    u4k0Var.f = z4;
                    u4k0Var.w = 4;
                    if (tuwVar.d(u4k0Var) != y5bVar) {
                        list2 = list;
                        str6 = str4;
                        do {
                            value3 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value3, kpu.i((Map) value3, new Pair(str6, new b.c(list2)))));
                        Unit unit5 = Unit.a;
                        tuwVar.f(null);
                        return Unit.a;
                    }
                } else {
                    u4k0Var.a = null;
                    u4k0Var.b = str4;
                    u4k0Var.c = thA;
                    u4k0Var.d = tuwVar;
                    u4k0Var.e = z5;
                    u4k0Var.f = z4;
                    u4k0Var.w = 3;
                    if (tuwVar.d(u4k0Var) != y5bVar) {
                        th = thA;
                        str5 = str4;
                        do {
                            value2 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value2, kpu.i((Map) value2, new Pair(str5, new b.a(new a(th))))));
                        Unit unit6 = Unit.a;
                        tuwVar.f(null);
                        return Unit.a;
                    }
                }
            }
            return y5bVar;
        } catch (Throwable th4) {
            quwVar.f(null);
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v23, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v25, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v27, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v29, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v31, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [m2g] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    public final i4k0 k() {
        List list;
        List list2;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        ?? arrayList5;
        List list3;
        BigDecimal bigDecimalG;
        ?? arrayList6;
        Round round = this.f;
        if (round == null) {
            return null;
        }
        String str = round.sportId;
        String str2 = str == null ? "" : str;
        String str3 = round.roundId;
        String str4 = str3 == null ? "" : str3;
        List<TicketInRound> list4 = round.tickets;
        if (list4 != null) {
            ArrayList arrayList7 = new ArrayList(l48.r(list4, 10));
            for (Iterator it = list4.iterator(); it.hasNext(); it = it) {
                TicketInRound ticketInRound = (TicketInRound) it.next();
                ticketInRound.getClass();
                String str5 = ticketInRound.ticketId;
                String str6 = str5 == null ? "" : str5;
                String str7 = ticketInRound.ticketNumber;
                String str8 = str7 == null ? "" : str7;
                String str9 = ticketInRound.type;
                String str10 = str9 == null ? "" : str9;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(ticketInRound.totalStake);
                bigDecimalValueOf.getClass();
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(ticketInRound.totalReturn);
                bigDecimalValueOf2.getClass();
                BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(ticketInRound.wht);
                bigDecimalValueOf3.getClass();
                long createTime = ticketInRound.getCreateTime();
                String str11 = ticketInRound.giftId;
                String str12 = str11 == null ? "" : str11;
                BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(ticketInRound.giftAmount);
                bigDecimalValueOf4.getClass();
                int i = ticketInRound.giftKind;
                int i2 = ticketInRound.flexibleFitSize;
                String str13 = ticketInRound.totalOdds;
                if (str13 == null || (bigDecimalG = kotlin.text.b.g(str13)) == null) {
                    bigDecimalG = BigDecimal.ZERO;
                }
                BigDecimal bigDecimal = bigDecimalG;
                bigDecimal.getClass();
                List<Bet> list5 = ticketInRound.bets;
                if (list5 != null) {
                    arrayList6 = new ArrayList(l48.r(list5, 10));
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        arrayList6.add(j8l.b((Bet) it2.next()));
                    }
                } else {
                    arrayList6 = 0;
                }
                if (arrayList6 == 0) {
                    arrayList6 = m2g.a;
                }
                arrayList7.add(new j4k0(str6, str8, str10, bigDecimalValueOf, bigDecimalValueOf2, bigDecimalValueOf3, createTime, str12, bigDecimalValueOf4, i, i2, bigDecimal, arrayList6));
            }
            list = null;
            list2 = arrayList7;
        } else {
            list = null;
            list2 = null;
        }
        if (list2 == null) {
            list2 = m2g.a;
        }
        List<League> list6 = round.leagues;
        if (list6 != null) {
            arrayList = new ArrayList(l48.r(list6, 10));
            for (League league : list6) {
                league.getClass();
                String str14 = league.leagueId;
                if (str14 == null) {
                    str14 = "";
                }
                String str15 = league.name;
                if (str15 == null) {
                    str15 = "";
                }
                arrayList.add(new uyj0(str14, str15));
            }
        } else {
            arrayList = list;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        ?? r8 = arrayList;
        List<EventInRound> list7 = round.events;
        if (list7 != null) {
            arrayList2 = new ArrayList(l48.r(list7, 10));
            for (EventInRound eventInRound : list7) {
                eventInRound.getClass();
                arrayList2.add(k6k0.a(eventInRound));
            }
        } else {
            arrayList2 = list;
        }
        if (arrayList2 == 0) {
            arrayList2 = m2g.a;
        }
        ?? r9 = arrayList2;
        List<EventInRound> list8 = round.fillingEvents;
        if (list8 != null) {
            arrayList3 = new ArrayList(l48.r(list8, 10));
            for (EventInRound eventInRound2 : list8) {
                eventInRound2.getClass();
                arrayList3.add(k6k0.a(eventInRound2));
            }
        } else {
            arrayList3 = list;
        }
        if (arrayList3 == 0) {
            arrayList3 = m2g.a;
        }
        ?? r10 = arrayList3;
        List<MarketInRound> list9 = round.markets;
        if (list9 != null) {
            arrayList4 = new ArrayList();
            for (MarketInRound marketInRound : list9) {
                marketInRound.getClass();
                arrayList4.add(m6k0.a(marketInRound));
            }
        } else {
            arrayList4 = list;
        }
        if (arrayList4 == 0) {
            arrayList4 = m2g.a;
        }
        ?? r11 = arrayList4;
        List<OutcomeInRound> list10 = round.outcomes;
        if (list10 != null) {
            arrayList5 = new ArrayList(l48.r(list10, 10));
            for (OutcomeInRound outcomeInRound : list10) {
                outcomeInRound.getClass();
                arrayList5.add(o6k0.a(outcomeInRound));
            }
        } else {
            arrayList5 = list;
        }
        if (arrayList5 == 0) {
            arrayList5 = m2g.a;
        }
        ?? r12 = arrayList5;
        List<BetBuilderInRound> list11 = round.betBuilders;
        if (list11 != null) {
            ArrayList arrayList8 = new ArrayList(l48.r(list11, 10));
            for (BetBuilderInRound betBuilderInRound : list11) {
                betBuilderInRound.getClass();
                arrayList8.add(s5k0.a(betBuilderInRound));
            }
            list3 = arrayList8;
        } else {
            list3 = list;
        }
        if (list3 == null) {
            list3 = m2g.a;
        }
        return new i4k0(str2, str4, list2, r8, r9, r10, r11, r12, list3);
    }
}
