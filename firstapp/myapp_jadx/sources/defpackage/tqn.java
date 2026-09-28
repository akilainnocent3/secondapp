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
public final class tqn implements lyh<obi> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ rqn b;
    public final /* synthetic */ boolean c;

    @c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.handler.InstantFootballSettlementHandlerImpl$init$$inlined$combine$1", f = "InstantFootballSettlementHandlerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return tqn.this.collect(null, this);
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.handler.InstantFootballSettlementHandlerImpl$init$$inlined$combine$1$3", f = "InstantFootballSettlementHandlerImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super obi>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ rqn d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, rqn rqnVar, boolean z) {
            super(3, v1bVar);
            this.d = rqnVar;
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
        /* JADX WARN: Type inference failed for: r3v58 */
        /* JADX WARN: Type inference failed for: r3v59, types: [java.lang.Object[], myh] */
        /* JADX WARN: Type inference failed for: r3v61 */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List<dsn> list;
            List<grn> list2;
            rqn rqnVar;
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
            List<irn> list3;
            irn irnVar;
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
            rqn rqnVar2;
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
                rqn rqnVar3 = this.d;
                if (z2) {
                    zta0.a aVar = ((nbi.a) nbiVar).a;
                    iqn iqnVarK = rqnVar3.k();
                    if (iqnVarK != null) {
                        List<asn> list5 = iqnVarK.e;
                        asn asnVar = (asn) CollectionsKt.firstOrNull(list5);
                        if (asnVar != null) {
                            drn drnVar = asnVar.c;
                            String str5 = drnVar.a;
                            String str6 = drnVar.b;
                            drn drnVar2 = asnVar.e;
                            zki zkiVarB = sfi.b(str5, str6, drnVar2.a, drnVar2.b, asnVar.g, aVar.getValue(), sji.KICK_OFF_LOGO);
                            ResourceUiText resourceUiTextE = sfi.e(aVar, this.e);
                            ResourceUiText resourceUiTextD = sfi.d(rqnVar3.g(), set);
                            List<jqn> list6 = iqnVarK.c;
                            final List<csn> list7 = iqnVarK.g;
                            final List<dsn> list8 = iqnVarK.h;
                            final List<grn> list9 = iqnVarK.i;
                            final List listA = brn.a(list6);
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
                                final asn asnVar2 = (asn) next8;
                                boolean z3 = i2 == 0;
                                sbi sbiVar = z3 ? sbi.b : sbi.a;
                                Iterator it4 = list4.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        it2 = it3;
                                        rqnVar2 = rqnVar3;
                                        next7 = null;
                                        break;
                                    }
                                    next7 = it4.next();
                                    it2 = it3;
                                    rqnVar2 = rqnVar3;
                                    if (((fci) next7).a.equals(asnVar2.a)) {
                                        break;
                                    }
                                    rqnVar3 = rqnVar2;
                                    it3 = it2;
                                }
                                hdi hdiVarJ = rqn.j(pair, (fci) next7, asnVar2, z3);
                                hci hciVar2 = set.contains(asnVar2.a) ? hci.a : hci.b;
                                u48 u48Var = new u48(list6);
                                kqn kqnVar = new kqn();
                                List<jqn> list10 = list6;
                                jd80 jd80Var = jd80.a;
                                final rqn rqnVar4 = rqnVar2;
                                uf00 uf00VarC = a4h.c(new ruh(new lte(ld80.d(new ruh(new ruh(u48Var, kqnVar, jd80Var), new mqn(), jd80Var), new Function1() { // from class: nqn
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj9) {
                                        irn irnVar2 = (irn) obj9;
                                        irnVar2.getClass();
                                        return Boolean.valueOf(irnVar2.a.equals(asnVar2.a));
                                    }
                                }), new cr(2)), new Function1(rqnVar4, list7, list8, list9, listA) { // from class: oqn
                                    public final /* synthetic */ List a;
                                    public final /* synthetic */ List b;
                                    public final /* synthetic */ List c;
                                    public final /* synthetic */ List d;

                                    {
                                        this.a = list7;
                                        this.b = list8;
                                        this.c = list9;
                                        this.d = listA;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj9) {
                                        irn irnVar2 = (irn) obj9;
                                        irnVar2.getClass();
                                        return brn.b(this.a, this.b, this.c, this.d, irnVar2, true, null);
                                    }
                                }, jd80Var));
                                String str7 = asnVar2.a;
                                drn drnVar3 = asnVar2.c;
                                String str8 = drnVar3.a;
                                String str9 = drnVar3.b;
                                drn drnVar4 = asnVar2.e;
                                arrayList.add(new gci(str7, str8, str9, drnVar4.a, drnVar4.b, sbiVar, hdiVarJ, null, hciVar2, uf00VarC));
                                i2 = i3;
                                rqnVar3 = rqnVar4;
                                it3 = it2;
                                list6 = list10;
                            }
                            qcn qcnVarB2 = a4h.b(arrayList);
                            List<hqn> list11 = iqnVarK.d;
                            List<asn> list12 = iqnVarK.f;
                            asn asnVar3 = (asn) CollectionsKt.firstOrNull(list12);
                            if (asnVar3 == null) {
                                iciVar = null;
                            } else {
                                Iterator<T> it5 = list11.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        next5 = null;
                                        break;
                                    }
                                    next5 = it5.next();
                                } while (!((hqn) next5).a.equals(asnVar3.b.a));
                                hqn hqnVar = (hqn) next5;
                                String str10 = hqnVar != null ? hqnVar.b : null;
                                if (str10 == null) {
                                    str10 = "";
                                }
                                ArrayList arrayList2 = new ArrayList(l48.r(list12, 10));
                                for (asn asnVar4 : list12) {
                                    Iterator it6 = list4.iterator();
                                    do {
                                        if (!it6.hasNext()) {
                                            next6 = null;
                                            break;
                                        }
                                        next6 = it6.next();
                                    } while (!((fci) next6).a.equals(asnVar4.a));
                                    hdi hdiVarJ2 = rqn.j(pair, (fci) next6, asnVar4, false);
                                    String str11 = asnVar4.a;
                                    drn drnVar5 = asnVar4.c;
                                    String str12 = drnVar5.a;
                                    String str13 = drnVar5.b;
                                    drn drnVar6 = asnVar4.e;
                                    arrayList2.add(new gci(str11, str12, str13, drnVar6.a, drnVar6.b, null, hdiVarJ2, null, null, null));
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
                    rqn rqnVar5 = rqnVar3;
                    if (nbiVar instanceof nbi.b) {
                        iqn iqnVarK2 = rqnVar5.k();
                        if (iqnVarK2 != null) {
                            List<jqn> list13 = iqnVarK2.c;
                            List<asn> list14 = iqnVarK2.e;
                            List<csn> list15 = iqnVarK2.g;
                            List<dsn> list16 = iqnVarK2.h;
                            List<grn> list17 = iqnVarK2.i;
                            List<hqn> list18 = iqnVarK2.d;
                            StringUiText stringUiText2 = vch0.a;
                            jfi jfiVar = new jfi(new ResourceUiText(R.string.page_instant_virtual__my_events), "MY_EVENTS_TAB_ID");
                            List<jqn> list19 = list13;
                            ArrayList arrayList3 = new ArrayList(l48.r(list18, 10));
                            Iterator it7 = list18.iterator();
                            while (it7.hasNext()) {
                                hqn hqnVar2 = (hqn) it7.next();
                                arrayList3.add(new jfi(new StringUiText(hqnVar2.b), hqnVar2.a));
                                it7 = it7;
                                list15 = list15;
                            }
                            List<csn> list20 = list15;
                            uf00 uf00VarAddAll = a4h.a(jfiVar).addAll((Collection) arrayList3);
                            boolean zEquals = str3.equals("MY_EVENTS_TAB_ID");
                            boolean z4 = rqn.m(iqnVarK2) && zEquals;
                            List<vci> listA2 = brn.a(list19);
                            if (zEquals) {
                                ArrayList arrayList4 = new ArrayList(l48.r(list14, 10));
                                Iterator<T> it8 = list14.iterator();
                                while (it8.hasNext()) {
                                    List<dsn> list21 = list16;
                                    arrayList4.add(rqnVar5.h(list19, list20, list21, list17, listA2, (asn) it8.next(), str4));
                                    list16 = list21;
                                }
                                list = list16;
                                list2 = list17;
                                qciVar = new sci(a4h.b(arrayList4));
                                rqnVar = rqnVar5;
                                list19 = list19;
                            } else {
                                list = list16;
                                list2 = list17;
                                rqn.b bVar = (rqn.b) map.get(str3);
                                if (bVar instanceof rqn.b.C1058b) {
                                    cVar = rci.b.a;
                                } else {
                                    if (bVar instanceof rqn.b.a) {
                                        cVar = rci.a.a;
                                    } else if (bVar instanceof rqn.b.c) {
                                        ArrayList arrayList5 = new ArrayList(l48.r(list14, 10));
                                        Iterator<T> it9 = list14.iterator();
                                        while (it9.hasNext()) {
                                            arrayList5.add(((asn) it9.next()).a);
                                        }
                                        Set setE0 = CollectionsKt.E0(arrayList5);
                                        List<asn> list22 = ((rqn.b.c) bVar).a;
                                        ArrayList arrayList6 = new ArrayList();
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj9 : list22) {
                                            if (setE0.contains(((asn) obj9).a)) {
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
                                            rqn rqnVar6 = rqnVar5;
                                            arrayList8.add(rqnVar6.h(list19, list20, list, list2, listA2, (asn) obj10, str4));
                                            rqnVar5 = rqnVar6;
                                        }
                                        rqnVar = rqnVar5;
                                        cVar = new rci.c(a4h.b(arrayList8));
                                    } else {
                                        rqnVar = rqnVar5;
                                        if (bVar != null) {
                                            uhc.a();
                                            return null;
                                        }
                                        cVar = rci.b.a;
                                    }
                                    qciVar = new qci(cVar);
                                }
                                rqnVar = rqnVar5;
                                qciVar = new qci(cVar);
                            }
                            cfi cfiVar = qciVar;
                            if (zBooleanValue) {
                                ArrayList arrayList9 = new ArrayList(l48.r(list19, 10));
                                for (jqn jqnVar : list19) {
                                    List<frn> list23 = jqnVar.m;
                                    String str14 = jqnVar.c;
                                    if (list23 != null && list23.isEmpty()) {
                                        z = false;
                                        break;
                                    }
                                    Iterator<T> it10 = list23.iterator();
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            z = false;
                                            break;
                                        }
                                        if (((frn) it10.next()).g) {
                                            z = true;
                                            break;
                                        }
                                    }
                                    String str15 = jqnVar.h;
                                    BigDecimal bigDecimal3 = jqnVar.i;
                                    BigDecimal bigDecimal4 = BigDecimal.ZERO;
                                    Iterator<T> it11 = list23.iterator();
                                    String str16 = str3;
                                    BigDecimal bigDecimalAdd = bigDecimal4;
                                    while (it11.hasNext()) {
                                        bigDecimalAdd = bigDecimalAdd.add(((frn) it11.next()).f);
                                        uf00VarAddAll = uf00VarAddAll;
                                    }
                                    uf00 uf00Var2 = uf00VarAddAll;
                                    ResourceUiText resourceUiTextQ = rqf0.q(jqnVar.b);
                                    int i6 = z ? R.color.bg_brand_sub_primary_d_base : R.color.border_secondary;
                                    UiText uiTextD = rqf0.d(list23.size(), str14);
                                    Integer numValueOf = z ? Integer.valueOf(R.drawable.ic__feature__won) : null;
                                    int i7 = z ? R.string.bet_history__won : R.string.bet_history__lost;
                                    StringUiText stringUiText3 = vch0.a;
                                    BigDecimal bigDecimal5 = bigDecimalAdd;
                                    ResourceUiText resourceUiText = new ResourceUiText(i7);
                                    cd3.b.getClass();
                                    cd3 cd3VarA = cd3.a.a(str14);
                                    int i8 = cd3VarA == null ? -1 : rqn.c.a[cd3VarA.ordinal()];
                                    if (i8 == 1) {
                                        frn frnVar = (frn) CollectionsKt.firstOrNull(list23);
                                        if (frnVar != null) {
                                            pciVarA = sfi.a(jqnVar.k, frnVar.h.size());
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
                                    String strF = sfi.f(jqnVar.e);
                                    int i9 = z ? R.color.text_brand_sub_primary_d_lighter : R.color.text_secondary;
                                    String strP = rqf0.p(jqnVar.d);
                                    ResourceUiText resourceUiTextJ = rqf0.j(str15, bigDecimal3, new gr(jqnVar, 1));
                                    ResourceUiText resourceUiTextI = rqf0.i(bigDecimal3, str15);
                                    BigDecimal bigDecimal6 = jqnVar.l;
                                    cd3 cd3VarA2 = cd3.a.a(str14);
                                    int i10 = cd3VarA2 == null ? -1 : rqn.c.a[cd3VarA2.ordinal()];
                                    if (i10 != -1) {
                                        if (i10 == 1) {
                                            strA = gky.a.a(bjb0.L(bigDecimal6.setScale(2, RoundingMode.HALF_UP), Locale.US), false);
                                        } else if (i10 == 2) {
                                            strA = gky.a.a(bjb0.L(bigDecimal6.setScale(2, RoundingMode.HALF_UP), Locale.US), false);
                                        } else if (i10 != 3) {
                                            if (i10 == 4) {
                                                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                                                bigDecimalValueOf.getClass();
                                                Iterator it12 = list23.iterator();
                                                while (true) {
                                                    if (it12.hasNext()) {
                                                        List<irn> list24 = ((frn) it12.next()).h;
                                                        BigDecimal bigDecimalMultiply = BigDecimal.ONE;
                                                        Iterator<T> it13 = list24.iterator();
                                                        while (true) {
                                                            if (it13.hasNext()) {
                                                                irn irnVar2 = (irn) it13.next();
                                                                Iterator<T> it14 = list.iterator();
                                                                do {
                                                                    if (!it14.hasNext()) {
                                                                        next3 = null;
                                                                        break;
                                                                    }
                                                                    next3 = it14.next();
                                                                } while (!((dsn) next3).a.equals(irnVar2.c));
                                                                dsn dsnVar = (dsn) next3;
                                                                if (dsnVar != null) {
                                                                    bigDecimal2 = dsnVar.b;
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
                                                                        if (((grn) next4).a.equals(irnVar2.c)) {
                                                                            break;
                                                                        }
                                                                        it12 = it;
                                                                        iIntValue = iIntValue;
                                                                    }
                                                                    grn grnVar = (grn) next4;
                                                                    if (grnVar != null) {
                                                                        bigDecimal2 = grnVar.b;
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
                                            frn frnVar2 = (frn) CollectionsKt.p0(list23);
                                            if (frnVar2 != null && (list3 = frnVar2.h) != null && (irnVar = (irn) CollectionsKt.p0(list3)) != null) {
                                                String str17 = irnVar.c;
                                                Iterator<T> it16 = list.iterator();
                                                do {
                                                    if (!it16.hasNext()) {
                                                        next = null;
                                                        break;
                                                    }
                                                    next = it16.next();
                                                } while (!((dsn) next).a.equals(str17));
                                                dsn dsnVar2 = (dsn) next;
                                                if (dsnVar2 != null) {
                                                    bigDecimal = dsnVar2.b;
                                                } else {
                                                    Iterator<T> it17 = list2.iterator();
                                                    do {
                                                        if (!it17.hasNext()) {
                                                            next2 = null;
                                                            break;
                                                        }
                                                        next2 = it17.next();
                                                    } while (!((grn) next2).a.equals(str17));
                                                    grn grnVar2 = (grn) next2;
                                                    bigDecimal = grnVar2 != null ? grnVar2.b : null;
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
                                    arrayList9.add(new qfi(jqnVar.a, resourceUiTextQ, i6, uiTextD, numValueOf, resourceUiText, pciVar, strF, i9, strP, resourceUiTextJ, resourceUiTextI, str2, rqf0.f(bigDecimal5), rqf0.v(jqnVar.f)));
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
                            xeiVar = new xei(uf00Var, str, z4, cfiVar, qcnVarB, sfi.g(rqn.l(iqnVarK2), rqnVar.b.b()));
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

    public tqn(lyh[] lyhVarArr, rqn rqnVar, boolean z) {
        this.a = lyhVarArr;
        this.b = rqnVar;
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
