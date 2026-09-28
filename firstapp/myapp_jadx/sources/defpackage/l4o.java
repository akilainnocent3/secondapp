package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l4o extends pf implements iaj<i4o.b, Set<? extends String>, String, v1b<? super bno>, Object> {
    /* JADX WARN: Code duplicated, block: B:238:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:259:0x0540  */
    /* JADX WARN: Code duplicated, block: B:261:0x0548 A[PHI: r0
      0x0548: PHI (r0v37 java.lang.String) = (r0v35 java.lang.String), (r0v41 java.lang.String) binds: [B:275:0x0572, B:258:0x053e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.iaj
    public final Object d(i4o.b bVar, Set<? extends String> set, String str, v1b<? super bno> v1bVar) {
        int i;
        Object next;
        Object next2;
        String strA;
        List<h4o> list;
        h4o h4oVar;
        Object next3;
        ngs ngsVar;
        List<w4o> list2;
        Set<? extends String> set2;
        nno nnoVar;
        String str2;
        Object next4;
        List<u4o> list3;
        Object next5;
        String str3;
        Iterator it;
        Object next6;
        ResourceUiText resourceUiText;
        String strA2;
        char c;
        String strA0;
        Object next7;
        Object next8;
        List listSplit$default;
        Integer numB;
        int i2;
        Object next9;
        List listB;
        ngs ngsVar2;
        i4o.b bVar2 = bVar;
        Set<? extends String> set3 = set;
        String str4 = str;
        i4o i4oVar = (i4o) this.a;
        i4oVar.getClass();
        if (bVar2 instanceof i4o.b.C0669b) {
            return bno.b.a;
        }
        if (bVar2 instanceof i4o.b.a) {
            return new bno.a(new wmo.a(((i4o.b.a) bVar2).a.a));
        }
        if (!(bVar2 instanceof i4o.b.c)) {
            uhc.a();
            return null;
        }
        final f4o f4oVar = ((i4o.b.c) bVar2).a;
        Integer numValueOf = Integer.valueOf(R.drawable.ic__feature__won);
        ngs ngsVarB = a.b();
        t4o t4oVar = i4oVar.c;
        f4oVar.getClass();
        String str5 = f4oVar.b;
        List<x4o> list4 = f4oVar.t;
        String str6 = f4oVar.d;
        boolean z = f4oVar.p;
        boolean z2 = f4oVar.o;
        String str7 = f4oVar.j;
        BigDecimal bigDecimal = f4oVar.k;
        cmo cmoVar = t4oVar.a;
        Integer numC = cmoVar.c(str6);
        ResourceUiText resourceUiTextQ = rqf0.q(str5);
        Set<? extends String> set4 = set3;
        String str8 = str4;
        String strD = bwf0.a.d(f4oVar.h, true);
        Integer numA = cmoVar.a(str6);
        String str9 = f4oVar.c;
        List<g4o> list5 = f4oVar.q;
        UiText uiTextD = rqf0.d(list5.size(), str9);
        Integer num = z ? numValueOf : null;
        epo.a aVar = num != null ? new epo.a(num.intValue(), R.color.icon_brand_sub_secondary) : null;
        int i3 = R.color.text_inverse_primary;
        if (!z2) {
            i = R.string.bet_history__waiting_to_kick_off;
        } else if (z) {
            i = R.string.bet_history__won;
            i3 = R.color.text_inverse_brand_sub;
        } else {
            i = R.string.bet_history__lost;
        }
        ColoredUiText coloredUiText = new ColoredUiText(new ResourceUiText(i), Integer.valueOf(i3), null);
        ColoredUiText coloredUiTextT = rqf0.t(R.color.text_inverse_brand_sub, f4oVar.f, z2, z);
        String strP = rqf0.p(f4oVar.e);
        ResourceUiText resourceUiTextJ = rqf0.j(str7, bigDecimal, new Function0() { // from class: s4o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = f4oVar.l;
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
        ResourceUiText resourceUiTextI = rqf0.i(bigDecimal, str7);
        Iterator<T> it2 = cd3.f.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((cd3) next).a.equalsIgnoreCase(str9));
        cd3 cd3Var = (cd3) next;
        String str10 = str6;
        if (cd3Var != null) {
            int iOrdinal = cd3Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        uhc.a();
                        return null;
                    }
                }
                strA = null;
            } else {
                g4o g4oVar = (g4o) CollectionsKt.p0(list5);
                String str11 = (g4oVar == null || (list = g4oVar.v) == null || (h4oVar = (h4o) CollectionsKt.p0(list)) == null) ? null : h4oVar.c;
                Iterator<T> it3 = list4.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!((x4o) next2).a.equals(str11));
                x4o x4oVar = (x4o) next2;
                if (x4oVar != null) {
                    strA = gky.a.a(bjb0.L(x4oVar.b, Locale.US), false);
                    str10 = str10;
                } else {
                    strA = null;
                }
            }
        } else {
            strA = null;
        }
        boolean z3 = z2;
        String str12 = str10;
        char c2 = 2;
        ngsVarB.add(new epo(null, numC, resourceUiTextQ, str5, strD, numA, uiTextD, aVar, coloredUiText, null, coloredUiTextT, strP, resourceUiTextJ, resourceUiTextI, strA, null, rqf0.v(f4oVar.g)));
        Iterator<T> it4 = cd3.f.iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
        } while (!((cd3) next3).a.equalsIgnoreCase(str9));
        cd3 cd3Var2 = (cd3) next3;
        if (cd3Var2 == null) {
            listB = n1a0.c;
            ngsVar2 = ngsVarB;
        } else {
            ArrayList arrayList = new ArrayList();
            int iOrdinal2 = cd3Var2.ordinal();
            if (iOrdinal2 == 0) {
                r4o r4oVar = i4oVar.b;
                set4.getClass();
                List<u4o> list6 = f4oVar.r;
                List<w4o> list7 = f4oVar.s;
                ArrayList arrayList2 = new ArrayList(l48.r(list5, 10));
                Iterator it5 = list5.iterator();
                int i4 = 0;
                while (it5.hasNext()) {
                    Object next10 = it5.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        b.q();
                        throw null;
                    }
                    g4o g4oVar2 = (g4o) next10;
                    char c3 = c2;
                    if ((list5.size() > 1 ? list5 : null) != null) {
                        boolean z4 = i4 == 0;
                        boolean z5 = g4oVar2.i;
                        String str13 = g4oVar2.b;
                        Iterator<T> it6 = list4.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                next9 = it6.next();
                                String str14 = ((x4o) next9).a;
                                list2 = list7;
                                h4o h4oVar2 = (h4o) CollectionsKt.firstOrNull(g4oVar2.v);
                                if (!str14.equals(h4oVar2 != null ? h4oVar2.c : null)) {
                                    list7 = list2;
                                }
                            } else {
                                list2 = list7;
                                next9 = null;
                            }
                        }
                        x4o x4oVar2 = (x4o) next9;
                        String strA3 = gky.a.a(bjb0.L(x4oVar2 != null ? x4oVar2.b : BigDecimal.ZERO, Locale.US), false);
                        set2 = set4;
                        nnoVar = new nno(str13, set2.contains(str13), new ResourceUiText(R.string.component_betslip__single), z5 ? numValueOf : null, rqf0.c(z3, z5), rqf0.m(g4oVar2.d, z3, z5), rqf0.p(g4oVar2.c), strA3, null, rqf0.v(g4oVar2.e), z4, null);
                    } else {
                        list2 = list7;
                        set2 = set4;
                        nnoVar = null;
                    }
                    List<h4o> list8 = g4oVar2.v;
                    String str15 = g4oVar2.b;
                    h4o h4oVar3 = (h4o) CollectionsKt.firstOrNull(list8);
                    String str16 = h4oVar3 != null ? h4oVar3.a : null;
                    set4 = set2;
                    String str17 = h4oVar3 != null ? h4oVar3.b : null;
                    String str18 = h4oVar3 != null ? h4oVar3.c : null;
                    Iterator<T> it7 = list6.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            next4 = it7.next();
                            str2 = str17;
                            if (!((u4o) next4).a.equals(str16)) {
                                str17 = str2;
                            }
                        } else {
                            str2 = str17;
                            next4 = null;
                        }
                    }
                    u4o u4oVar = (u4o) next4;
                    List<g4o> list9 = list5;
                    String str19 = u4oVar != null ? u4oVar.f : null;
                    Iterator<T> it8 = list4.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next5 = it8.next();
                            list3 = list6;
                            if (!((x4o) next5).a.equals(str18)) {
                                list6 = list3;
                            }
                        } else {
                            list3 = list6;
                            next5 = null;
                        }
                    }
                    x4o x4oVar3 = (x4o) next5;
                    Iterator<T> it9 = list2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next6 = it9.next();
                            str3 = str18;
                            it = it5;
                            if (!((w4o) next6).a.equals(x4oVar3 != null ? x4oVar3.e : null)) {
                                str18 = str3;
                                it5 = it;
                            }
                        } else {
                            str3 = str18;
                            it = it5;
                            next6 = null;
                        }
                    }
                    w4o w4oVar = (w4o) next6;
                    boolean z6 = g4oVar2.i;
                    if (str16 == null) {
                        str16 = "";
                    }
                    ngs ngsVar3 = ngsVarB;
                    String strA4 = uf80.a(ux5.a(str15, "_", str16, "_", str2 != null ? str2 : ""), "_", str3 == null ? "" : str3);
                    uoo uooVarN = rqf0.n(z3, null, z6, R.drawable.ic__feature__match_status_won);
                    String str20 = str8;
                    if (Intrinsics.g(str20, strA4)) {
                        if (z3) {
                            jrn.a aVar2 = jrn.b;
                            i2 = z6 ? R.string.bet_history__won : R.string.bet_history__lost;
                        } else {
                            i2 = R.string.bet_history__waiting_to_kick_off;
                        }
                        resourceUiText = new ResourceUiText(i2);
                    } else {
                        resourceUiText = null;
                    }
                    String str21 = u4oVar != null ? u4oVar.d : null;
                    if (str21 == null) {
                        str21 = "";
                    }
                    StringUiText stringUiText = vch0.a;
                    StringUiText stringUiText2 = new StringUiText(str21);
                    boolean z7 = z3;
                    ColoredUiText coloredUiText2 = new ColoredUiText(new ResourceUiText(R.string.page_instant_virtual__final_result), Integer.valueOf(R.color.text_primary), null);
                    ResourceUiText resourceUiText2 = new ResourceUiText(R.string.app_common__blank_space);
                    String strP2 = str19 != null ? c.p(str19, ",", "-", false) : null;
                    if (strP2 == null) {
                        strP2 = "";
                    }
                    ColoredUiText coloredUiText3 = new ColoredUiText(new StringUiText(strP2), Integer.valueOf(R.color.text_secondary), null);
                    UiText[] uiTextArr = new UiText[3];
                    uiTextArr[0] = coloredUiText2;
                    uiTextArr[1] = resourceUiText2;
                    uiTextArr[c3] = coloredUiText3;
                    Iterator it10 = b.k(uiTextArr).iterator();
                    if (!it10.hasNext()) {
                        zkh.a("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next11 = it10.next();
                    while (it10.hasNext()) {
                        next11 = ((UiText) next11).h((UiText) it10.next());
                    }
                    UiText uiText = (UiText) next11;
                    boolean z8 = x4oVar3 != null && x4oVar3.f;
                    int iA = rqf0.a(null, z8);
                    gno.a aVar3 = (!z8 || (numB = r4oVar.a.b(str12)) == null) ? null : new gno.a(numB.intValue(), R.color.icon_brand_sub_primary_d_base);
                    if (w4oVar == null || x4oVar3 == null) {
                        strA2 = "";
                    } else {
                        String str22 = x4oVar3.d;
                        switch (w4oVar.b.ordinal()) {
                            case 0:
                            case 1:
                            case 2:
                                strA2 = lx5.a("[ ", str22, " ] @", gky.a.a(bjb0.L(x4oVar3.b, Locale.US), false));
                                break;
                            case 3:
                            case 4:
                                strA2 = x4oVar3.c;
                                break;
                            case 5:
                            case 6:
                            case 7:
                                strA2 = CollectionsKt.a0(StringsKt__StringsKt.split$default(str22, new String[]{","}, false, 0, 6, null), " ", null, null, new n4o(0), 30);
                                break;
                            default:
                                uhc.a();
                                return null;
                        }
                    }
                    if (w4oVar != null) {
                        String str23 = w4oVar.a;
                        if (x4oVar3 == null) {
                            r4oVar = r4oVar;
                            c = '\n';
                            strA0 = "";
                        } else {
                            switch (w4oVar.b.ordinal()) {
                                case 0:
                                case 1:
                                case 2:
                                    List listSplit$default2 = str19 != null ? StringsKt__StringsKt.split$default(str19, new String[]{","}, false, 0, 6, null) : null;
                                    if (listSplit$default2 == null) {
                                        listSplit$default2 = m2g.a;
                                    }
                                    gfn gfnVarG0 = CollectionsKt.G0(listSplit$default2);
                                    int iA2 = jpu.a(l48.r(gfnVarG0, 10));
                                    if (iA2 < 16) {
                                        iA2 = 16;
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA2);
                                    Iterator it11 = gfnVarG0.iterator();
                                    while (true) {
                                        hfn hfnVar = (hfn) it11;
                                        if (!hfnVar.a.hasNext()) {
                                            ArrayList arrayList3 = new ArrayList();
                                            for (Object obj : list4) {
                                                r4o r4oVar2 = r4oVar;
                                                if (((x4o) obj).e.equals(str23)) {
                                                    arrayList3.add(obj);
                                                }
                                                r4oVar = r4oVar2;
                                            }
                                            r4oVar = r4oVar;
                                            List listR0 = CollectionsKt.r0(arrayList3, new q4o(linkedHashMap));
                                            ArrayList arrayList4 = new ArrayList();
                                            for (Object obj2 : listR0) {
                                                if (((x4o) obj2).f) {
                                                    arrayList4.add(obj2);
                                                }
                                            }
                                            c = '\n';
                                            ArrayList arrayList5 = new ArrayList(l48.r(arrayList4, 10));
                                            int size = arrayList4.size();
                                            int i6 = 0;
                                            while (i6 < size) {
                                                Object obj3 = arrayList4.get(i6);
                                                i6++;
                                                arrayList5.add(((x4o) obj3).d);
                                            }
                                            strA0 = CollectionsKt.a0(arrayList5, " ", null, null, new o4o(), 30);
                                        } else {
                                            IndexedValue indexedValue = (IndexedValue) hfnVar.next();
                                            linkedHashMap.put(indexedValue.b, Integer.valueOf(indexedValue.a));
                                        }
                                        break;
                                    }
                                    break;
                                case 3:
                                case 4:
                                    Iterator<T> it12 = list4.iterator();
                                    while (true) {
                                        if (it12.hasNext()) {
                                            next7 = it12.next();
                                            x4o x4oVar4 = (x4o) next7;
                                            if (!x4oVar4.e.equals(str23) || !x4oVar4.f) {
                                            }
                                        } else {
                                            next7 = null;
                                        }
                                    }
                                    x4o x4oVar5 = (x4o) next7;
                                    strA0 = x4oVar5 != null ? x4oVar5.c : null;
                                    if (strA0 == null) {
                                        strA0 = "";
                                    }
                                    c = '\n';
                                    break;
                                case 5:
                                case 6:
                                case 7:
                                    Iterator<T> it13 = list4.iterator();
                                    while (true) {
                                        if (it13.hasNext()) {
                                            next8 = it13.next();
                                            x4o x4oVar6 = (x4o) next8;
                                            if (!x4oVar6.e.equals(str23) || !x4oVar6.f) {
                                            }
                                        } else {
                                            next8 = null;
                                        }
                                    }
                                    x4o x4oVar7 = (x4o) next8;
                                    strA0 = (x4oVar7 == null || (listSplit$default = StringsKt__StringsKt.split$default(x4oVar7.d, new String[]{","}, false, 0, 6, null)) == null) ? null : CollectionsKt.a0(listSplit$default, " ", null, null, new p4o(), 30);
                                    if (strA0 == null) {
                                        strA0 = "";
                                    }
                                    c = '\n';
                                    break;
                                default:
                                    uhc.a();
                                    return null;
                            }
                        }
                    } else {
                        r4oVar = r4oVar;
                        c = '\n';
                        strA0 = "";
                    }
                    String str24 = w4oVar != null ? w4oVar.c : null;
                    arrayList2.add(new nmo(nnoVar, a4h.a(new voo(strA4, uooVarN, resourceUiText, null, stringUiText2, uiText, null, null, null, new vmo(iA, aVar3, new poo(strA2, str24 == null ? "" : str24, strA0), null))), rqf0.b(str15), null));
                    str8 = str20;
                    list5 = list9;
                    list7 = list2;
                    i4 = i5;
                    ngsVarB = ngsVar3;
                    list6 = list3;
                    z3 = z7;
                    c2 = c3;
                    it5 = it;
                    r4oVar = r4oVar;
                    str12 = str12;
                }
                ngsVar = ngsVarB;
                arrayList.addAll(arrayList2);
            } else {
                if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3 && iOrdinal2 != 4) {
                    uhc.a();
                    return null;
                }
                ngsVar = ngsVarB;
            }
            listB = a4h.b(arrayList);
            ngsVar2 = ngsVar;
        }
        ngsVar2.addAll(listB);
        return new bno.c(a4h.b(a.a(ngsVar2)));
    }
}
