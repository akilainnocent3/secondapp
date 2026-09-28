package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class aq implements lyh<obi> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ yp b;
    public final /* synthetic */ boolean c;

    @c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.handler.AfricanCupSettlementHandlerImpl$init$$inlined$combine$1", f = "AfricanCupSettlementHandlerImpl.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return aq.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[10];
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.handler.AfricanCupSettlementHandlerImpl$init$$inlined$combine$1$3", f = "AfricanCupSettlementHandlerImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super obi>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ yp d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, yp ypVar, boolean z) {
            super(3, v1bVar);
            this.d = ypVar;
            this.e = z;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super obi> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d, this.e);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:168:0x04f2  */
        /* JADX WARN: Type inference failed for: r3v59 */
        /* JADX WARN: Type inference failed for: r3v60, types: [java.lang.Object[], myh] */
        /* JADX WARN: Type inference failed for: r3v62 */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List<nr> list;
            List<pq> list2;
            rci cVar;
            cfi qciVar;
            String str;
            uf00 uf00Var;
            qcn qcnVarB;
            obi xeiVar;
            boolean z;
            pci pciVarA;
            pci pciVar;
            String str2;
            String strA;
            List<sq> list3;
            sq sqVar;
            Object next;
            Object next2;
            BigDecimal bigDecimal;
            String strA2;
            Object next3;
            Iterator it;
            Object next4;
            BigDecimal bigDecimal2;
            ?? r3;
            Object next5;
            ici iciVar;
            Object next6;
            Iterator it2;
            yp ypVar;
            Object next7;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                nbi nbiVar = (nbi) objArr[0];
                Object obj2 = objArr[1];
                obj2.getClass();
                hci hciVar = (hci) obj2;
                Object obj3 = objArr[2];
                obj3.getClass();
                Set set = (Set) obj3;
                Pair pair = (Pair) objArr[3];
                Object obj4 = objArr[4];
                obj4.getClass();
                List list4 = (List) obj4;
                Object obj5 = objArr[5];
                obj5.getClass();
                String str3 = (String) obj5;
                String str4 = (String) objArr[6];
                Object obj6 = objArr[7];
                obj6.getClass();
                Map map = (Map) obj6;
                Object obj7 = objArr[8];
                obj7.getClass();
                boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                Object obj8 = objArr[9];
                obj8.getClass();
                int iIntValue = ((Integer) obj8).intValue();
                boolean z2 = nbiVar instanceof nbi.a;
                yp ypVar2 = this.d;
                if (z2) {
                    zta0.a aVar = ((nbi.a) nbiVar).a;
                    kp kpVarK = ypVar2.k();
                    if (kpVarK != null) {
                        List<ir> list5 = kpVarK.e;
                        ir irVar = (ir) CollectionsKt.firstOrNull(list5);
                        if (irVar != null) {
                            mq mqVar = irVar.c;
                            String str5 = mqVar.a;
                            String str6 = mqVar.b;
                            mq mqVar2 = irVar.e;
                            zki zkiVarB = sfi.b(str5, str6, mqVar2.a, mqVar2.b, irVar.g, aVar.getValue(), null);
                            ResourceUiText resourceUiTextE = sfi.e(aVar, this.e);
                            ResourceUiText resourceUiTextD = sfi.d(ypVar2.g(), set);
                            List<mp> list6 = kpVarK.c;
                            final List<lr> list7 = kpVarK.g;
                            List<nr> list8 = kpVarK.h;
                            final List<pq> list9 = kpVarK.i;
                            final List listA = kq.a(list6);
                            ArrayList arrayList = new ArrayList(l48.r(list5, 10));
                            Iterator it3 = list5.iterator();
                            int i2 = 0;
                            while (it3.hasNext()) {
                                Object next8 = it3.next();
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    kotlin.collections.b.q();
                                    throw null;
                                }
                                final ir irVar2 = (ir) next8;
                                boolean z3 = i2 == 0;
                                sbi sbiVar = z3 ? sbi.b : sbi.a;
                                Iterator it4 = list4.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        it2 = it3;
                                        ypVar = ypVar2;
                                        next7 = null;
                                        break;
                                    }
                                    next7 = it4.next();
                                    it2 = it3;
                                    ypVar = ypVar2;
                                    if (((fci) next7).a.equals(irVar2.a)) {
                                        break;
                                    }
                                    ypVar2 = ypVar;
                                    it3 = it2;
                                }
                                hdi hdiVarJ = yp.j(pair, (fci) next7, irVar2, z3);
                                hci hciVar2 = set.contains(irVar2.a) ? hci.a : hci.b;
                                u48 u48Var = new u48(list6);
                                up upVar = new up();
                                List<mp> list10 = list6;
                                jd80 jd80Var = jd80.a;
                                final yp ypVar3 = ypVar;
                                final List<nr> list11 = list8;
                                uf00 uf00VarC = a4h.c(new ruh(new lte(ld80.d(new ruh(new ruh(u48Var, upVar, jd80Var), new vp(0), jd80Var), new Function1() { // from class: wp
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj9) {
                                        sq sqVar2 = (sq) obj9;
                                        sqVar2.getClass();
                                        return Boolean.valueOf(sqVar2.a.equals(irVar2.a));
                                    }
                                }), new xp(0)), new Function1(ypVar3, list7, list11, list9, listA) { // from class: op
                                    public final /* synthetic */ List a;
                                    public final /* synthetic */ List b;
                                    public final /* synthetic */ List c;
                                    public final /* synthetic */ List d;

                                    {
                                        this.a = list7;
                                        this.b = list11;
                                        this.c = list9;
                                        this.d = listA;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj9) {
                                        sq sqVar2 = (sq) obj9;
                                        sqVar2.getClass();
                                        return kq.b(this.a, this.b, this.c, this.d, sqVar2, true, null);
                                    }
                                }, jd80Var));
                                String str7 = irVar2.a;
                                mq mqVar3 = irVar2.c;
                                String str8 = mqVar3.a;
                                String str9 = mqVar3.b;
                                mq mqVar4 = irVar2.e;
                                arrayList.add(new gci(str7, str8, str9, mqVar4.a, mqVar4.b, sbiVar, hdiVarJ, null, hciVar2, uf00VarC));
                                it3 = it2;
                                i2 = i3;
                                list8 = list11;
                                ypVar2 = ypVar3;
                                list6 = list10;
                            }
                            qcn qcnVarB2 = a4h.b(arrayList);
                            List<jp> list12 = kpVarK.d;
                            List<ir> list13 = kpVarK.f;
                            ir irVar3 = (ir) CollectionsKt.firstOrNull(list13);
                            if (irVar3 == null) {
                                iciVar = null;
                            } else {
                                Iterator<T> it5 = list12.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        next5 = null;
                                        break;
                                    }
                                    next5 = it5.next();
                                } while (!((jp) next5).a.equals(irVar3.b.a));
                                jp jpVar = (jp) next5;
                                String str10 = jpVar != null ? jpVar.b : null;
                                if (str10 == null) {
                                    str10 = "";
                                }
                                ArrayList arrayList2 = new ArrayList(l48.r(list13, 10));
                                for (ir irVar4 : list13) {
                                    Iterator it6 = list4.iterator();
                                    do {
                                        if (!it6.hasNext()) {
                                            next6 = null;
                                            break;
                                        }
                                        next6 = it6.next();
                                    } while (!((fci) next6).a.equals(irVar4.a));
                                    hdi hdiVarJ2 = yp.j(pair, (fci) next6, irVar4, false);
                                    String str11 = irVar4.a;
                                    mq mqVar5 = irVar4.c;
                                    String str12 = mqVar5.a;
                                    String str13 = mqVar5.b;
                                    mq mqVar6 = irVar4.e;
                                    arrayList2.add(new gci(str11, str12, str13, mqVar6.a, mqVar6.b, null, hdiVarJ2, null, null, null));
                                }
                                iciVar = new ici(a4h.b(arrayList2), str10);
                            }
                            int i4 = hciVar.a() ? R.string.common_functions__hide : R.string.common_functions__view;
                            StringUiText stringUiText = vch0.a;
                            xeiVar = new edi(zkiVarB, hciVar, new ResourceUiText(i4), resourceUiTextE, resourceUiTextD, qcnVarB2, iciVar);
                            r3 = 0;
                        }
                    }
                    r3 = 0;
                    xeiVar = null;
                } else {
                    yp ypVar4 = ypVar2;
                    if (nbiVar instanceof nbi.b) {
                        kp kpVarK2 = ypVar4.k();
                        if (kpVarK2 != null) {
                            List<mp> list14 = kpVarK2.c;
                            List<ir> list15 = kpVarK2.e;
                            List<lr> list16 = kpVarK2.g;
                            List<nr> list17 = kpVarK2.h;
                            List<pq> list18 = kpVarK2.i;
                            List<jp> list19 = kpVarK2.d;
                            StringUiText stringUiText2 = vch0.a;
                            jfi jfiVar = new jfi(new ResourceUiText(R.string.page_instant_virtual__my_events), "MY_EVENTS_TAB_ID");
                            List<mp> list20 = list14;
                            ArrayList arrayList3 = new ArrayList(l48.r(list19, 10));
                            Iterator it7 = list19.iterator();
                            while (it7.hasNext()) {
                                jp jpVar2 = (jp) it7.next();
                                arrayList3.add(new jfi(new StringUiText(jpVar2.b), jpVar2.a));
                                it7 = it7;
                                list16 = list16;
                            }
                            List<lr> list21 = list16;
                            uf00 uf00VarAddAll = a4h.a(jfiVar).addAll((Collection) arrayList3);
                            boolean zEquals = str3.equals("MY_EVENTS_TAB_ID");
                            boolean z4 = yp.m(kpVarK2) && zEquals;
                            List<vci> listA2 = kq.a(list20);
                            if (zEquals) {
                                ArrayList arrayList4 = new ArrayList(l48.r(list15, 10));
                                Iterator<T> it8 = list15.iterator();
                                while (it8.hasNext()) {
                                    List<nr> list22 = list17;
                                    arrayList4.add(ypVar4.h(list20, list21, list22, list18, listA2, (ir) it8.next(), str4));
                                    list17 = list22;
                                }
                                list = list17;
                                list2 = list18;
                                qciVar = new sci(a4h.b(arrayList4));
                                ypVar4 = ypVar4;
                                list20 = list20;
                            } else {
                                list = list17;
                                list2 = list18;
                                yp.b bVar = (yp.b) map.get(str3);
                                if (bVar instanceof yp.b.C1356b) {
                                    cVar = rci.b.a;
                                } else {
                                    if (bVar instanceof yp.b.a) {
                                        cVar = rci.a.a;
                                    } else if (bVar instanceof yp.b.c) {
                                        ArrayList arrayList5 = new ArrayList(l48.r(list15, 10));
                                        Iterator<T> it9 = list15.iterator();
                                        while (it9.hasNext()) {
                                            arrayList5.add(((ir) it9.next()).a);
                                        }
                                        Set setE0 = CollectionsKt.E0(arrayList5);
                                        List<ir> list23 = ((yp.b.c) bVar).a;
                                        ArrayList arrayList6 = new ArrayList();
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj9 : list23) {
                                            if (setE0.contains(((ir) obj9).a)) {
                                                arrayList6.add(obj9);
                                            } else {
                                                arrayList7.add(obj9);
                                            }
                                        }
                                        ArrayList arrayListI0 = CollectionsKt.i0(arrayList7, arrayList6);
                                        ArrayList arrayList8 = new ArrayList(l48.r(arrayListI0, 10));
                                        int size = arrayListI0.size();
                                        int i5 = 0;
                                        while (i5 < size) {
                                            Object obj10 = arrayListI0.get(i5);
                                            i5++;
                                            arrayList8.add(ypVar4.h(list20, list21, list, list2, listA2, (ir) obj10, str4));
                                        }
                                        cVar = new rci.c(a4h.b(arrayList8));
                                    } else {
                                        if (bVar != null) {
                                            uhc.a();
                                            return null;
                                        }
                                        cVar = rci.b.a;
                                    }
                                    qciVar = new qci(cVar);
                                }
                                qciVar = new qci(cVar);
                            }
                            cfi cfiVar = qciVar;
                            if (zBooleanValue) {
                                ArrayList arrayList9 = new ArrayList(l48.r(list20, 10));
                                for (final mp mpVar : list20) {
                                    List<oq> list24 = mpVar.m;
                                    String str14 = mpVar.c;
                                    if (list24 != null && list24.isEmpty()) {
                                        z = false;
                                        break;
                                    }
                                    Iterator<T> it10 = list24.iterator();
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            z = false;
                                            break;
                                        }
                                        if (((oq) it10.next()).g) {
                                            z = true;
                                            break;
                                        }
                                    }
                                    String str15 = mpVar.h;
                                    BigDecimal bigDecimal3 = mpVar.i;
                                    BigDecimal bigDecimal4 = BigDecimal.ZERO;
                                    Iterator<T> it11 = list24.iterator();
                                    String str16 = str3;
                                    BigDecimal bigDecimalAdd = bigDecimal4;
                                    while (it11.hasNext()) {
                                        bigDecimalAdd = bigDecimalAdd.add(((oq) it11.next()).f);
                                        uf00VarAddAll = uf00VarAddAll;
                                    }
                                    uf00 uf00Var2 = uf00VarAddAll;
                                    ResourceUiText resourceUiTextQ = rqf0.q(mpVar.b);
                                    int i6 = z ? R.color.bg_brand_sub_primary_d_base : R.color.border_secondary;
                                    UiText uiTextD = rqf0.d(list24.size(), str14);
                                    Integer numValueOf = z ? Integer.valueOf(R.drawable.ic__feature__won) : null;
                                    int i7 = z ? R.string.bet_history__won : R.string.bet_history__lost;
                                    StringUiText stringUiText3 = vch0.a;
                                    BigDecimal bigDecimal5 = bigDecimalAdd;
                                    ResourceUiText resourceUiText = new ResourceUiText(i7);
                                    cd3.b.getClass();
                                    cd3 cd3VarA = cd3.a.a(str14);
                                    int i8 = cd3VarA == null ? -1 : yp.c.a[cd3VarA.ordinal()];
                                    if (i8 == 1) {
                                        oq oqVar = (oq) CollectionsKt.firstOrNull(list24);
                                        if (oqVar != null) {
                                            pciVarA = sfi.a(mpVar.k, oqVar.h.size());
                                            pciVar = pciVarA;
                                        } else {
                                            pciVar = null;
                                        }
                                    } else if (i8 != 2) {
                                        pciVar = null;
                                    } else {
                                        pciVarA = new uci(iIntValue);
                                        pciVar = pciVarA;
                                    }
                                    String strF = sfi.f(mpVar.e);
                                    int i9 = z ? R.color.text_brand_sub_primary_d_lighter : R.color.text_secondary;
                                    String strP = rqf0.p(mpVar.d);
                                    ResourceUiText resourceUiTextJ = rqf0.j(str15, bigDecimal3, new Function0() { // from class: tp
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i10 = mpVar.j;
                                            if (i10 == 1) {
                                                return Integer.valueOf(R.string.common_functions__cash_gift);
                                            }
                                            if (i10 == 2) {
                                                return Integer.valueOf(R.string.common_functions__discount_gift);
                                            }
                                            if (i10 == 3) {
                                                return Integer.valueOf(R.string.common_functions__free_bet_gift);
                                            }
                                            return null;
                                        }
                                    });
                                    ResourceUiText resourceUiTextI = rqf0.i(bigDecimal3, str15);
                                    BigDecimal bigDecimal6 = mpVar.l;
                                    cd3 cd3VarA2 = cd3.a.a(str14);
                                    int i10 = cd3VarA2 == null ? -1 : yp.c.a[cd3VarA2.ordinal()];
                                    if (i10 != -1) {
                                        if (i10 == 1) {
                                            strA = gky.a.a(bjb0.L(bigDecimal6.setScale(2, RoundingMode.HALF_UP), Locale.US), false);
                                        } else if (i10 == 2) {
                                            strA = gky.a.a(bjb0.L(bigDecimal6.setScale(2, RoundingMode.HALF_UP), Locale.US), false);
                                        } else if (i10 != 3) {
                                            if (i10 == 4) {
                                                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                                                bigDecimalValueOf.getClass();
                                                Iterator it12 = list24.iterator();
                                                while (true) {
                                                    if (it12.hasNext()) {
                                                        List<sq> list25 = ((oq) it12.next()).h;
                                                        BigDecimal bigDecimalMultiply = BigDecimal.ONE;
                                                        Iterator<T> it13 = list25.iterator();
                                                        while (true) {
                                                            if (it13.hasNext()) {
                                                                sq sqVar2 = (sq) it13.next();
                                                                Iterator<T> it14 = list.iterator();
                                                                do {
                                                                    if (!it14.hasNext()) {
                                                                        next3 = null;
                                                                        break;
                                                                    }
                                                                    next3 = it14.next();
                                                                } while (!((nr) next3).a.equals(sqVar2.c));
                                                                nr nrVar = (nr) next3;
                                                                if (nrVar != null) {
                                                                    bigDecimal2 = nrVar.b;
                                                                    it = it12;
                                                                    iIntValue = iIntValue;
                                                                } else {
                                                                    Iterator<T> it15 = list2.iterator();
                                                                    while (true) {
                                                                        if (!it15.hasNext()) {
                                                                            it = it12;
                                                                            iIntValue = iIntValue;
                                                                            next4 = null;
                                                                            break;
                                                                        }
                                                                        next4 = it15.next();
                                                                        it = it12;
                                                                        iIntValue = iIntValue;
                                                                        if (((pq) next4).a.equals(sqVar2.c)) {
                                                                            break;
                                                                        }
                                                                        it12 = it;
                                                                        iIntValue = iIntValue;
                                                                    }
                                                                    pq pqVar = (pq) next4;
                                                                    if (pqVar != null) {
                                                                        bigDecimal2 = pqVar.b;
                                                                    }
                                                                }
                                                                bigDecimalMultiply.getClass();
                                                                bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal2);
                                                                bigDecimalMultiply.getClass();
                                                                it12 = it;
                                                                iIntValue = iIntValue;
                                                            } else {
                                                                bigDecimalMultiply.getClass();
                                                                bigDecimalValueOf = bigDecimalValueOf.add(bigDecimalMultiply);
                                                                bigDecimalValueOf.getClass();
                                                            }
                                                        }
                                                    } else {
                                                        iIntValue = iIntValue;
                                                        strA2 = gky.a.a(bjb0.L(bigDecimalValueOf, Locale.US), false);
                                                        str2 = strA2;
                                                    }
                                                }
                                            } else {
                                                if (i10 != 5) {
                                                    uhc.a();
                                                    return null;
                                                }
                                                iIntValue = iIntValue;
                                            }
                                            str2 = null;
                                        } else {
                                            iIntValue = iIntValue;
                                            oq oqVar2 = (oq) CollectionsKt.p0(list24);
                                            if (oqVar2 != null && (list3 = oqVar2.h) != null && (sqVar = (sq) CollectionsKt.p0(list3)) != null) {
                                                String str17 = sqVar.c;
                                                Iterator<T> it16 = list.iterator();
                                                do {
                                                    if (!it16.hasNext()) {
                                                        next = null;
                                                        break;
                                                    }
                                                    next = it16.next();
                                                } while (!((nr) next).a.equals(str17));
                                                nr nrVar2 = (nr) next;
                                                if (nrVar2 != null) {
                                                    bigDecimal = nrVar2.b;
                                                } else {
                                                    Iterator<T> it17 = list2.iterator();
                                                    do {
                                                        if (!it17.hasNext()) {
                                                            next2 = null;
                                                            break;
                                                        }
                                                        next2 = it17.next();
                                                    } while (!((pq) next2).a.equals(str17));
                                                    pq pqVar2 = (pq) next2;
                                                    bigDecimal = pqVar2 != null ? pqVar2.b : null;
                                                }
                                                if (bigDecimal != null) {
                                                    strA2 = gky.a.a(bjb0.L(bigDecimal, Locale.US), false);
                                                    str2 = strA2;
                                                }
                                            }
                                            str2 = null;
                                        }
                                        str2 = strA;
                                    } else {
                                        iIntValue = iIntValue;
                                        str2 = null;
                                    }
                                    bigDecimal5.getClass();
                                    arrayList9.add(new qfi(mpVar.a, resourceUiTextQ, i6, uiTextD, numValueOf, resourceUiText, pciVar, strF, i9, strP, resourceUiTextJ, resourceUiTextI, str2, rqf0.f(bigDecimal5), rqf0.v(mpVar.f)));
                                    iIntValue = iIntValue;
                                    str3 = str16;
                                    uf00VarAddAll = uf00Var2;
                                }
                                str = str3;
                                uf00Var = uf00VarAddAll;
                                qcnVarB = a4h.b(arrayList9);
                            } else {
                                str = str3;
                                uf00Var = uf00VarAddAll;
                                qcnVarB = null;
                            }
                            xeiVar = new xei(uf00Var, str, z4, cfiVar, qcnVarB, sfi.g(yp.l(kpVarK2), ypVar4.b.b()));
                            r3 = 0;
                        }
                    } else if (nbiVar != null) {
                        uhc.a();
                        return null;
                    }
                    r3 = 0;
                    xeiVar = null;
                }
                this.b = r3;
                this.c = r3;
                this.a = 1;
                if (myhVar.emit(xeiVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public aq(lyh[] lyhVarArr, yp ypVar, boolean z) {
        this.a = lyhVarArr;
        this.b = ypVar;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super obi> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            lyh[] lyhVarArr = this.a;
            b bVar = new b(lyhVarArr);
            c cVar = new c(null, this.b, this.c);
            aVar.b = 1;
            if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
