package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class toc0 extends pf implements jaj<qoc0.b, Set<? extends String>, String, v4f, v1b<? super bno>, Object> {
    /* JADX WARN: Code duplicated, block: B:354:0x0741  */
    /* JADX WARN: Code duplicated, block: B:355:0x0744  */
    /* JADX WARN: Code duplicated, block: B:357:0x0747  */
    /* JADX WARN: Code duplicated, block: B:359:0x074b  */
    /* JADX WARN: Code duplicated, block: B:360:0x074e  */
    /* JADX WARN: Code duplicated, block: B:362:0x0751  */
    /* JADX WARN: Code duplicated, block: B:446:0x0753 A[SYNTHETIC] */
    @Override // defpackage.jaj
    public final Object l(qoc0.b bVar, Set<? extends String> set, String str, v4f v4fVar, v1b<? super bno> v1bVar) {
        int i;
        ColoredUiText coloredUiText;
        Object next;
        List<noc0> list;
        noc0 noc0Var;
        Object next2;
        ResourceUiText resourceUiText;
        Object next3;
        BigDecimal bigDecimal;
        String strA;
        ColoredUiText coloredUiText2;
        Object next4;
        List<dpc0> list2;
        Set<? extends String> set2;
        nno nnoVar;
        String str2;
        Object next5;
        ResourceUiText resourceUiText2;
        Object next6;
        String str3;
        Object next7;
        koo jmoVar;
        Object next8;
        Object next9;
        Iterator it;
        String str4;
        String str5;
        Object next10;
        Integer numB;
        int i2;
        Object next11;
        Object next12;
        BigDecimal bigDecimal2;
        List listB;
        List<a1f> list3;
        u4f u4fVar;
        u4f.a aVar;
        k5f k5fVar;
        qoc0.b bVar2 = bVar;
        Set<? extends String> set3 = set;
        String str6 = str;
        v4f v4fVar2 = v4fVar;
        qoc0 qoc0Var = (qoc0) this.a;
        qoc0Var.getClass();
        if (bVar2 instanceof qoc0.b.C1019b) {
            return bno.b.a;
        }
        if (bVar2 instanceof qoc0.b.a) {
            return new bno.a(new wmo.a(((qoc0.b.a) bVar2).a.a));
        }
        if (!(bVar2 instanceof qoc0.b.c)) {
            uhc.a();
            return null;
        }
        final joc0 joc0Var = ((qoc0.b.c) bVar2).a;
        Integer numValueOf = Integer.valueOf(R.drawable.ic__feature__won);
        ngs ngsVarB = a.b();
        cmo cmoVar = qoc0Var.c.a;
        joc0Var.getClass();
        String str7 = joc0Var.b;
        List<loc0> list4 = joc0Var.v;
        List<epc0> list5 = joc0Var.u;
        z0f z0fVar = joc0Var.w;
        String str8 = joc0Var.d;
        String str9 = joc0Var.c;
        boolean z = joc0Var.p;
        boolean z2 = joc0Var.o;
        String str10 = joc0Var.j;
        BigDecimal bigDecimal3 = joc0Var.k;
        List<koc0> list6 = joc0Var.r;
        BigDecimal bigDecimal4 = BigDecimal.ZERO;
        Iterator<T> it2 = list6.iterator();
        BigDecimal bigDecimalAdd = bigDecimal4;
        while (it2.hasNext()) {
            bigDecimalAdd = bigDecimalAdd.add(((koc0) it2.next()).f);
            z0fVar = z0fVar;
        }
        z0f z0fVar2 = z0fVar;
        Integer numValueOf2 = Integer.valueOf(R.string.page_instant_virtual__sporty_legend_watermark);
        BigDecimal bigDecimal5 = bigDecimalAdd;
        Integer numC = cmoVar.c(str8);
        ResourceUiText resourceUiTextQ = rqf0.q(str7);
        long j = joc0Var.h;
        String str11 = str6;
        bwf0 bwf0Var = bwf0.a;
        Set<? extends String> set4 = set3;
        String strD = bwf0Var.d(j, true);
        Integer numA = cmoVar.a(str8);
        UiText uiTextD = rqf0.d(list6.size(), str9);
        Integer num = z ? numValueOf : null;
        epo.a aVar2 = num != null ? new epo.a(num.intValue(), R.color.icon_brand_sub_secondary) : null;
        int i3 = R.color.text_inverse_primary;
        if (!z2) {
            i = R.string.bet_history__waiting_to_kick_off;
        } else if (z) {
            i = R.string.bet_history__won;
            i3 = R.color.text_inverse_brand_sub;
        } else {
            i = R.string.bet_history__lost;
        }
        ColoredUiText coloredUiText3 = new ColoredUiText(new ResourceUiText(i), Integer.valueOf(i3), null);
        ColoredUiText coloredUiTextT = rqf0.t(R.color.text_inverse_brand_sub, joc0Var.f, z2, z);
        String strP = rqf0.p(joc0Var.e);
        ResourceUiText resourceUiTextJ = rqf0.j(str10, bigDecimal3, new Function0() { // from class: zoc0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = joc0Var.l;
                if (i4 == 1) {
                    return Integer.valueOf(R.string.common_functions__cash_gift);
                }
                if (i4 == 2) {
                    return Integer.valueOf(R.string.common_functions__discount_gift);
                }
                if (i4 == 3) {
                    return Integer.valueOf(R.string.common_functions__free_bet_gift);
                }
                return null;
            }
        });
        ResourceUiText resourceUiTextI = rqf0.i(bigDecimal3, str10);
        Iterator<T> it3 = cd3.f.iterator();
        while (true) {
            if (!it3.hasNext()) {
                coloredUiText = coloredUiTextT;
                next = null;
                break;
            }
            next = it3.next();
            coloredUiText = coloredUiTextT;
            if (((cd3) next).a.equalsIgnoreCase(str9)) {
                break;
            }
            coloredUiTextT = coloredUiText;
        }
        cd3 cd3Var = (cd3) next;
        if (cd3Var != null) {
            int iOrdinal = cd3Var.ordinal();
            if (iOrdinal == 0) {
                koc0 koc0Var = (koc0) CollectionsKt.p0(list6);
                if (koc0Var != null && (list = koc0Var.h) != null && (noc0Var = (noc0) CollectionsKt.p0(list)) != null) {
                    String str12 = noc0Var.c;
                    Iterator<T> it4 = list5.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                    } while (!((epc0) next2).a.equals(str12));
                    epc0 epc0Var = (epc0) next2;
                    if (epc0Var != null) {
                        bigDecimal = epc0Var.b;
                        resourceUiText = resourceUiTextI;
                    } else {
                        Iterator<T> it5 = list4.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                resourceUiText = resourceUiTextI;
                                next3 = null;
                                break;
                            }
                            next3 = it5.next();
                            resourceUiText = resourceUiTextI;
                            if (((loc0) next3).a.equals(str12)) {
                                break;
                            }
                            resourceUiTextI = resourceUiText;
                        }
                        loc0 loc0Var = (loc0) next3;
                        bigDecimal = loc0Var != null ? loc0Var.b : null;
                    }
                    if (bigDecimal != null) {
                        ColoredUiText coloredUiText4 = coloredUiText;
                        strA = gky.a.a(bjb0.L(bigDecimal, Locale.US), false);
                        coloredUiText2 = coloredUiText4;
                    }
                }
                coloredUiText2 = coloredUiText;
                strA = null;
            } else if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                uhc.a();
                return null;
            }
            resourceUiText = resourceUiTextI;
            coloredUiText2 = coloredUiText;
            strA = null;
        } else {
            resourceUiText = resourceUiTextI;
            coloredUiText2 = coloredUiText;
            strA = null;
        }
        bigDecimal5.getClass();
        String str13 = str8;
        char c = 2;
        ngsVarB.add(new epo(numValueOf2, numC, resourceUiTextQ, str7, strD, numA, uiTextD, aVar2, coloredUiText3, null, coloredUiText2, strP, resourceUiTextJ, resourceUiText, strA, rqf0.f(bigDecimal5), rqf0.v(joc0Var.g)));
        Iterator<T> it6 = cd3.f.iterator();
        do {
            if (!it6.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it6.next();
        } while (!((cd3) next4).a.equalsIgnoreCase(str9));
        cd3 cd3Var2 = (cd3) next4;
        if (cd3Var2 == null) {
            listB = n1a0.c;
        } else {
            ArrayList arrayList = new ArrayList();
            int iOrdinal2 = cd3Var2.ordinal();
            if (iOrdinal2 == 0) {
                yoc0 yoc0Var = qoc0Var.b;
                String str14 = z0fVar2 != null ? z0fVar2.a : null;
                set4.getClass();
                List<bpc0> list7 = joc0Var.s;
                List<dpc0> list8 = joc0Var.t;
                ArrayList arrayList2 = new ArrayList(l48.r(list6, 10));
                Iterator it7 = list6.iterator();
                int i4 = 0;
                while (it7.hasNext()) {
                    Object next13 = it7.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        b.q();
                        throw null;
                    }
                    koc0 koc0Var2 = (koc0) next13;
                    char c2 = c;
                    if ((list6.size() > 1 ? list6 : null) != null) {
                        boolean z3 = i4 == 0;
                        Integer numValueOf3 = (str14 == null || str14.length() == 0 || !koc0Var2.a.equals(str14)) ? null : Integer.valueOf(R.drawable.ic__feature__double_or_nothing);
                        boolean z4 = koc0Var2.g;
                        String str15 = koc0Var2.b;
                        noc0 noc0Var2 = (noc0) CollectionsKt.firstOrNull(koc0Var2.h);
                        String str16 = noc0Var2 != null ? noc0Var2.c : null;
                        Iterator<T> it8 = list5.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                list2 = list8;
                                next11 = null;
                                break;
                            }
                            next11 = it8.next();
                            list2 = list8;
                            if (((epc0) next11).a.equals(str16)) {
                                break;
                            }
                            list8 = list2;
                        }
                        epc0 epc0Var2 = (epc0) next11;
                        if (epc0Var2 != null) {
                            bigDecimal2 = epc0Var2.b;
                        } else {
                            Iterator it9 = list4.iterator();
                            while (true) {
                                if (!it9.hasNext()) {
                                    next12 = null;
                                    break;
                                }
                                next12 = it9.next();
                                Iterator it10 = it9;
                                if (((loc0) next12).a.equals(str16)) {
                                    break;
                                }
                                it9 = it10;
                            }
                            loc0 loc0Var2 = (loc0) next12;
                            bigDecimal2 = loc0Var2 != null ? loc0Var2.b : BigDecimal.ZERO;
                        }
                        String strA2 = gky.a.a(bjb0.L(bigDecimal2, Locale.US), false);
                        set2 = set4;
                        nnoVar = new nno(str15, set2.contains(str15), new ResourceUiText(R.string.component_betslip__single), z4 ? numValueOf : null, rqf0.c(z2, z4), rqf0.m(koc0Var2.d, z2, z4), rqf0.p(koc0Var2.c), strA2, null, rqf0.v(koc0Var2.e), z3, numValueOf3);
                    } else {
                        list2 = list8;
                        set2 = set4;
                        nnoVar = null;
                    }
                    xoc0 xoc0Var = yoc0Var.a;
                    list7.getClass();
                    list2.getClass();
                    list5.getClass();
                    list4.getClass();
                    koc0Var2.getClass();
                    String str17 = koc0Var2.b;
                    noc0 noc0Var3 = (noc0) CollectionsKt.firstOrNull(koc0Var2.h);
                    set4 = set2;
                    String str18 = noc0Var3 != null ? noc0Var3.a : null;
                    yoc0 yoc0Var2 = yoc0Var;
                    String str19 = noc0Var3 != null ? noc0Var3.b : null;
                    String str20 = noc0Var3 != null ? noc0Var3.c : null;
                    Iterator<T> it11 = list7.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            str2 = str19;
                            next5 = null;
                            break;
                        }
                        next5 = it11.next();
                        str2 = str19;
                        if (((bpc0) next5).a.equals(str18)) {
                            break;
                        }
                        str19 = str2;
                    }
                    bpc0 bpc0Var = (bpc0) next5;
                    boolean z5 = koc0Var2.g;
                    if (str18 == null) {
                        str18 = "";
                    }
                    String str21 = str14;
                    String str22 = str2 == null ? "" : str2;
                    List<bpc0> list9 = list7;
                    Iterator it12 = it7;
                    String strA3 = uf80.a(ux5.a(str17, "_", str18, "_", str22), "_", str20 == null ? "" : str20);
                    uoo uooVarN = rqf0.n(z2, null, z5, R.drawable.ic__feature__match_status_won);
                    String str23 = str11;
                    if (Intrinsics.g(str23, strA3)) {
                        if (z2) {
                            jrn.a aVar3 = jrn.b;
                            i2 = z5 ? R.string.bet_history__won : R.string.bet_history__lost;
                        } else {
                            i2 = R.string.bet_history__waiting_to_kick_off;
                        }
                        resourceUiText2 = new ResourceUiText(i2);
                    } else {
                        resourceUiText2 = null;
                    }
                    String str24 = bpc0Var != null ? bpc0Var.c.a : null;
                    if (str24 == null) {
                        str24 = "";
                    }
                    StringUiText stringUiText = vch0.a;
                    StringUiText stringUiText2 = new StringUiText(str24);
                    ResourceUiText resourceUiText3 = new ResourceUiText(R.string.app_common__blank_space);
                    ResourceUiText resourceUiText4 = new ResourceUiText(R.string.bet_history__vs);
                    ResourceUiText resourceUiText5 = new ResourceUiText(R.string.app_common__blank_space);
                    String str25 = bpc0Var != null ? bpc0Var.e.a : null;
                    if (str25 == null) {
                        str25 = "";
                    }
                    StringUiText stringUiText3 = new StringUiText(str25);
                    UiText[] uiTextArr = new UiText[5];
                    uiTextArr[0] = stringUiText2;
                    uiTextArr[1] = resourceUiText3;
                    uiTextArr[c2] = resourceUiText4;
                    uiTextArr[3] = resourceUiText5;
                    uiTextArr[4] = stringUiText3;
                    Iterator it13 = b.k(uiTextArr).iterator();
                    if (!it13.hasNext()) {
                        zkh.a("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next14 = it13.next();
                    while (it13.hasNext()) {
                        next14 = ((UiText) next14).h((UiText) it13.next());
                    }
                    UiText uiText = (UiText) next14;
                    qeo qeoVarB = z2 ? reo.b(bpc0Var != null ? bpc0Var.g : null) : null;
                    Iterator<T> it14 = list5.iterator();
                    do {
                        if (!it14.hasNext()) {
                            next6 = null;
                            break;
                        }
                        next6 = it14.next();
                    } while (!((epc0) next6).a.equals(str20));
                    epc0 epc0Var3 = (epc0) next6;
                    String strA0 = "--";
                    if (epc0Var3 != null) {
                        Iterator<T> it15 = list2.iterator();
                        do {
                            if (!it15.hasNext()) {
                                next10 = null;
                                break;
                            }
                            next10 = it15.next();
                        } while (!((dpc0) next10).a.equals(epc0Var3.d));
                        dpc0 dpc0Var = (dpc0) next10;
                        boolean z6 = epc0Var3.e;
                        int iA = rqf0.a(null, z6);
                        gno.a aVar4 = (!z6 || (numB = xoc0Var.a.b(str13)) == null) ? null : new gno.a(numB.intValue(), R.color.icon_brand_sub_primary_d_base);
                        str3 = str13;
                        String strA4 = uf80.a(new StringBuilder(epc0Var3.c), " @", gky.a.a(bjb0.L(epc0Var3.b, Locale.US), false));
                        if (z2) {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it16 = list5.iterator();
                            while (it16.hasNext()) {
                                Object next15 = it16.next();
                                epc0 epc0Var4 = (epc0) next15;
                                Iterator it17 = it16;
                                String str26 = strA0;
                                if (epc0Var4.d.equals(dpc0Var != null ? dpc0Var.a : null) && epc0Var4.e) {
                                    arrayList3.add(next15);
                                }
                                it16 = it17;
                                strA0 = str26;
                            }
                            String str27 = strA0;
                            ArrayList arrayList4 = new ArrayList();
                            int size = arrayList3.size();
                            int i6 = 0;
                            while (i6 < size) {
                                Object obj = arrayList3.get(i6);
                                i6++;
                                ArrayList arrayList5 = arrayList3;
                                if (!StringsKt.U(((epc0) obj).c)) {
                                    arrayList4.add(obj);
                                }
                                arrayList3 = arrayList5;
                            }
                            ArrayList arrayList6 = !arrayList4.isEmpty() ? arrayList4 : null;
                            strA0 = arrayList6 != null ? CollectionsKt.a0(arrayList6, "\n", null, null, new woc0(), 30) : str27;
                        }
                        String str28 = dpc0Var != null ? dpc0Var.b : null;
                        if (str28 == null) {
                            str28 = "";
                        }
                        jmoVar = new vmo(iA, aVar4, new poo(strA4, str28, strA0), null);
                    } else {
                        str3 = str13;
                        Iterator<T> it18 = list4.iterator();
                        do {
                            if (!it18.hasNext()) {
                                next7 = null;
                                break;
                            }
                            next7 = it18.next();
                        } while (!((loc0) next7).a.equals(str20));
                        loc0 loc0Var3 = (loc0) next7;
                        if (loc0Var3 != null) {
                            String strA5 = gky.a.a(bjb0.L(loc0Var3.b, Locale.US), false);
                            ResourceUiText resourceUiText6 = new ResourceUiText(R.string.page_instant_virtual__bet_builder);
                            StringUiText stringUiText4 = new StringUiText(" @");
                            StringUiText stringUiTextD = vch0.d(strA5);
                            UiText[] uiTextArr2 = new UiText[3];
                            uiTextArr2[0] = resourceUiText6;
                            uiTextArr2[1] = stringUiText4;
                            uiTextArr2[c2] = stringUiTextD;
                            Iterator it19 = b.k(uiTextArr2).iterator();
                            if (!it19.hasNext()) {
                                zkh.a("Empty collection can't be reduced.");
                                return null;
                            }
                            Object next16 = it19.next();
                            while (it19.hasNext()) {
                                next16 = ((UiText) next16).h((UiText) it19.next());
                            }
                            UiText uiText2 = (UiText) next16;
                            List<moc0> list10 = loc0Var3.d;
                            ArrayList arrayList7 = new ArrayList(l48.r(list10, 10));
                            Iterator it20 = list10.iterator();
                            while (it20.hasNext()) {
                                moc0 moc0Var = (moc0) it20.next();
                                Iterator<T> it21 = list5.iterator();
                                do {
                                    if (!it21.hasNext()) {
                                        next8 = null;
                                        break;
                                    }
                                    next8 = it21.next();
                                } while (!((epc0) next8).a.equals(moc0Var.b));
                                epc0 epc0Var5 = (epc0) next8;
                                Iterator<T> it22 = list2.iterator();
                                do {
                                    if (!it22.hasNext()) {
                                        next9 = null;
                                        break;
                                    }
                                    next9 = it22.next();
                                } while (!((dpc0) next9).a.equals(moc0Var.a));
                                dpc0 dpc0Var2 = (dpc0) next9;
                                if (z2) {
                                    ArrayList arrayList8 = new ArrayList();
                                    Iterator it23 = list5.iterator();
                                    while (it23.hasNext()) {
                                        Object next17 = it23.next();
                                        epc0 epc0Var6 = (epc0) next17;
                                        Iterator it24 = it20;
                                        Iterator it25 = it23;
                                        if (epc0Var6.d.equals(dpc0Var2 != null ? dpc0Var2.a : null) && epc0Var6.e) {
                                            arrayList8.add(next17);
                                        }
                                        it20 = it24;
                                        it23 = it25;
                                    }
                                    it = it20;
                                    ArrayList arrayList9 = new ArrayList();
                                    int size2 = arrayList8.size();
                                    int i7 = 0;
                                    while (i7 < size2) {
                                        Object obj2 = arrayList8.get(i7);
                                        i7++;
                                        ArrayList arrayList10 = arrayList8;
                                        if (!StringsKt.U(((epc0) obj2).c)) {
                                            arrayList9.add(obj2);
                                        }
                                        arrayList8 = arrayList10;
                                    }
                                    ArrayList arrayList11 = !arrayList9.isEmpty() ? arrayList9 : null;
                                    String strA1 = arrayList11 != null ? CollectionsKt.a0(arrayList11, "\n", null, null, new voc0(), 30) : "--";
                                    if (epc0Var5 != null) {
                                        str4 = epc0Var5.c;
                                    } else {
                                        str4 = null;
                                    }
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    if (dpc0Var2 != null) {
                                        str5 = dpc0Var2.b;
                                    } else {
                                        str5 = null;
                                    }
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    arrayList7.add(new poo(str4, str5, strA1));
                                    it20 = it;
                                } else {
                                    it = it20;
                                }
                                if (epc0Var5 != null) {
                                    str4 = epc0Var5.c;
                                } else {
                                    str4 = null;
                                }
                                if (str4 == null) {
                                    str4 = "";
                                }
                                if (dpc0Var2 != null) {
                                    str5 = dpc0Var2.b;
                                } else {
                                    str5 = null;
                                }
                                if (str5 == null) {
                                    str5 = "";
                                }
                                arrayList7.add(new poo(str4, str5, strA1));
                                it20 = it;
                            }
                            jmoVar = new jmo(a4h.b(arrayList7), uiText2);
                        } else {
                            jmoVar = null;
                        }
                    }
                    arrayList2.add(new nmo(nnoVar, a4h.a(new voo(strA3, uooVarN, resourceUiText2, null, uiText, null, null, null, qeoVarB, jmoVar)), rqf0.b(str17), null));
                    str11 = str23;
                    i4 = i5;
                    c = c2;
                    list6 = list6;
                    yoc0Var = yoc0Var2;
                    list8 = list2;
                    str14 = str21;
                    list7 = list9;
                    it7 = it12;
                    str13 = str3;
                }
                arrayList.addAll(arrayList2);
            } else if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3 && iOrdinal2 != 4) {
                uhc.a();
                return null;
            }
            listB = a4h.b(arrayList);
        }
        ngsVarB.addAll(listB);
        if (z0fVar2 != null && (list3 = z0fVar2.g) != null && (!list3.isEmpty())) {
            List<a1f> listR0 = CollectionsKt.r0(list3, new ooc0());
            String strD2 = bwf0Var.d(z0fVar2.f, true);
            BigDecimal bigDecimalB = p54.b(z0fVar2.b);
            Locale locale = Locale.US;
            String strL = bjb0.L(bigDecimalB, locale);
            String strL2 = bjb0.L(p54.b(z0fVar2.e), locale);
            a1f a1fVar = (a1f) CollectionsKt.d0(listR0);
            if (a1fVar == null) {
                u4fVar = null;
            } else {
                qcn qcnVarA = z2f.a(z0fVar2.c, z0fVar2.d);
                int i8 = a1fVar.a;
                int iOrdinal3 = a1fVar.c.ordinal();
                if (iOrdinal3 == 0) {
                    aVar = u4f.a.b;
                } else {
                    if (iOrdinal3 != 1) {
                        uhc.a();
                        return null;
                    }
                    aVar = u4f.a.c;
                }
                u4fVar = new u4f(qcnVarA, i8, aVar);
            }
            y4f y4fVar = new y4f(strD2, strL, strL2, u4fVar);
            ArrayList arrayList12 = new ArrayList(l48.r(listR0, 10));
            for (a1f a1fVar2 : listR0) {
                int i9 = a1fVar2.a;
                int iOrdinal4 = a1fVar2.c.ordinal();
                if (iOrdinal4 == 0) {
                    k5fVar = k5f.WIN;
                } else {
                    if (iOrdinal4 != 1) {
                        uhc.a();
                        return null;
                    }
                    k5fVar = k5f.LOSE;
                }
                k5f k5fVar2 = k5fVar;
                BigDecimal bigDecimalB2 = p54.b(a1fVar2.d);
                Locale locale2 = Locale.US;
                arrayList12.add(new j5f(i9, k5fVar2, bjb0.L(bigDecimalB2, locale2), bjb0.L(p54.b(a1fVar2.e), locale2), bjb0.L(p54.b(a1fVar2.f), locale2), bjb0.L(p54.b(a1fVar2.g), locale2), a1fVar2.b));
            }
            ngsVarB.add(new fno(y4fVar, a4h.b(arrayList12), v4fVar2));
        }
        return new bno.c(a4h.b(a.a(ngsVarB)));
    }
}
