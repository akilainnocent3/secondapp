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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t5d0 extends pf implements iaj<q5d0.b, Set<? extends String>, String, v1b<? super bno>, Object> {
    @Override // defpackage.iaj
    public final Object d(q5d0.b bVar, Set<? extends String> set, String str, v1b<? super bno> v1bVar) {
        int i;
        Object next;
        Object next2;
        String strA;
        List<p5d0> list;
        p5d0 p5d0Var;
        Object next3;
        List<z5d0> list2;
        char c;
        Set<? extends String> set2;
        nno nnoVar;
        Object next4;
        List<o5d0> list3;
        Object next5;
        List<x5d0> list4;
        String str2;
        Object next6;
        ResourceUiText resourceUiText;
        String string;
        String str3;
        v5d0 v5d0Var;
        Object next7;
        Integer numB;
        int i2;
        Object next8;
        List listB;
        q5d0.b bVar2 = bVar;
        Set<? extends String> set3 = set;
        String str4 = str;
        q5d0 q5d0Var = (q5d0) this.a;
        q5d0Var.getClass();
        if (bVar2 instanceof q5d0.b.C1000b) {
            return bno.b.a;
        }
        if (bVar2 instanceof q5d0.b.a) {
            return new bno.a(new wmo.a(((q5d0.b.a) bVar2).a.a));
        }
        if (!(bVar2 instanceof q5d0.b.c)) {
            uhc.a();
            return null;
        }
        n5d0 n5d0Var = ((q5d0.b.c) bVar2).a;
        Integer numValueOf = Integer.valueOf(R.drawable.ic__feature__won);
        ngs ngsVarB = a.b();
        w5d0 w5d0Var = q5d0Var.c;
        n5d0Var.getClass();
        String str5 = n5d0Var.b;
        List<a6d0> list5 = n5d0Var.t;
        String str6 = n5d0Var.d;
        boolean z = n5d0Var.p;
        boolean z2 = n5d0Var.o;
        String str7 = n5d0Var.j;
        BigDecimal bigDecimal = n5d0Var.k;
        cmo cmoVar = w5d0Var.a;
        Integer numC = cmoVar.c(str6);
        ResourceUiText resourceUiTextQ = rqf0.q(str5);
        Set<? extends String> set4 = set3;
        String str8 = str4;
        String strD = bwf0.a.d(n5d0Var.h, true);
        Integer numA = cmoVar.a(str6);
        String str9 = n5d0Var.c;
        List<o5d0> list6 = n5d0Var.q;
        UiText uiTextD = rqf0.d(list6.size(), str9);
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
        ColoredUiText coloredUiTextT = rqf0.t(R.color.text_inverse_brand_sub, n5d0Var.f, z2, z);
        String strP = rqf0.p(n5d0Var.e);
        ResourceUiText resourceUiTextJ = rqf0.j(str7, bigDecimal, new xj9(n5d0Var, 1));
        ResourceUiText resourceUiTextI = rqf0.i(bigDecimal, str7);
        Iterator<T> it = cd3.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
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
                o5d0 o5d0Var = (o5d0) CollectionsKt.p0(list6);
                String str11 = (o5d0Var == null || (list = o5d0Var.v) == null || (p5d0Var = (p5d0) CollectionsKt.p0(list)) == null) ? null : p5d0Var.c;
                Iterator<T> it2 = list5.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!((a6d0) next2).a.equals(str11));
                a6d0 a6d0Var = (a6d0) next2;
                if (a6d0Var != null) {
                    strA = gky.a.a(bjb0.L(a6d0Var.b, Locale.US), false);
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
        ngsVarB.add(new epo(null, numC, resourceUiTextQ, str5, strD, numA, uiTextD, aVar, coloredUiText, null, coloredUiTextT, strP, resourceUiTextJ, resourceUiTextI, strA, null, rqf0.v(n5d0Var.g)));
        Iterator<T> it3 = cd3.f.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!((cd3) next3).a.equalsIgnoreCase(str9));
        cd3 cd3Var2 = (cd3) next3;
        if (cd3Var2 == null) {
            listB = n1a0.c;
        } else {
            ArrayList arrayList = new ArrayList();
            int iOrdinal2 = cd3Var2.ordinal();
            if (iOrdinal2 == 0) {
                char c3 = 3;
                char c4 = 4;
                v5d0 v5d0Var2 = q5d0Var.b;
                set4.getClass();
                List<x5d0> list7 = n5d0Var.r;
                List<z5d0> list8 = n5d0Var.s;
                ArrayList arrayList2 = new ArrayList(l48.r(list6, 10));
                Iterator it4 = list6.iterator();
                int i4 = 0;
                while (it4.hasNext()) {
                    Object next9 = it4.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        b.q();
                        throw null;
                    }
                    o5d0 o5d0Var2 = (o5d0) next9;
                    char c5 = c2;
                    char c6 = c3;
                    if ((list6.size() > 1 ? list6 : null) != null) {
                        boolean z4 = i4 == 0;
                        boolean z5 = o5d0Var2.i;
                        String str13 = o5d0Var2.b;
                        Iterator<T> it5 = list5.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                list2 = list8;
                                c = c4;
                                next8 = null;
                                break;
                            }
                            next8 = it5.next();
                            c = c4;
                            String str14 = ((a6d0) next8).a;
                            list2 = list8;
                            p5d0 p5d0Var2 = (p5d0) CollectionsKt.firstOrNull(o5d0Var2.v);
                            if (str14.equals(p5d0Var2 != null ? p5d0Var2.c : null)) {
                                break;
                            }
                            list8 = list2;
                            c4 = c;
                        }
                        a6d0 a6d0Var2 = (a6d0) next8;
                        String strA2 = gky.a.a(bjb0.L(a6d0Var2 != null ? a6d0Var2.b : BigDecimal.ZERO, Locale.US), false);
                        set2 = set4;
                        nnoVar = new nno(str13, set2.contains(str13), new ResourceUiText(R.string.component_betslip__single), z5 ? numValueOf : null, rqf0.c(z3, z5), rqf0.m(o5d0Var2.d, z3, z5), rqf0.p(o5d0Var2.c), strA2, null, rqf0.v(o5d0Var2.e), z4, null);
                    } else {
                        list2 = list8;
                        c = c4;
                        set2 = set4;
                        nnoVar = null;
                    }
                    p5d0 p5d0Var3 = (p5d0) CollectionsKt.firstOrNull(o5d0Var2.v);
                    String str15 = p5d0Var3 != null ? p5d0Var3.a : null;
                    String str16 = p5d0Var3 != null ? p5d0Var3.b : null;
                    String str17 = p5d0Var3 != null ? p5d0Var3.c : null;
                    Iterator<T> it6 = list7.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            set4 = set2;
                            next4 = null;
                            break;
                        }
                        next4 = it6.next();
                        set4 = set2;
                        if (((x5d0) next4).a.equals(str15)) {
                            break;
                        }
                        set2 = set4;
                    }
                    x5d0 x5d0Var = (x5d0) next4;
                    Iterator<T> it7 = list5.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            list3 = list6;
                            next5 = null;
                            break;
                        }
                        next5 = it7.next();
                        list3 = list6;
                        if (((a6d0) next5).a.equals(str17)) {
                            break;
                        }
                        list6 = list3;
                    }
                    a6d0 a6d0Var3 = (a6d0) next5;
                    Iterator<T> it8 = list2.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            list4 = list7;
                            str2 = str17;
                            next6 = null;
                            break;
                        }
                        next6 = it8.next();
                        list4 = list7;
                        str2 = str17;
                        if (((z5d0) next6).a.equals(a6d0Var3 != null ? a6d0Var3.d : null)) {
                            break;
                        }
                        list7 = list4;
                        str17 = str2;
                    }
                    z5d0 z5d0Var = (z5d0) next6;
                    boolean z6 = o5d0Var2.i;
                    if (str15 == null) {
                        str15 = "";
                    }
                    if (str16 == null) {
                        str16 = "";
                    }
                    Iterator it9 = it4;
                    String strA3 = tx5.a(str15, "_", str16, "_", str2 == null ? "" : str2);
                    uoo uooVarN = rqf0.n(z3, null, z6, R.drawable.ic__feature__match_status_won);
                    String str18 = str8;
                    if (Intrinsics.g(str18, strA3)) {
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
                    String str19 = x5d0Var != null ? x5d0Var.e.a : null;
                    if (str19 == null) {
                        str19 = "";
                    }
                    StringUiText stringUiText = vch0.a;
                    StringUiText stringUiText2 = new StringUiText(str19);
                    ResourceUiText resourceUiText2 = new ResourceUiText(R.string.app_common__blank_space);
                    boolean z7 = z3;
                    ResourceUiText resourceUiText3 = new ResourceUiText(R.string.bet_history__vs);
                    ResourceUiText resourceUiText4 = new ResourceUiText(R.string.app_common__blank_space);
                    String str20 = x5d0Var != null ? x5d0Var.i.a : null;
                    if (str20 == null) {
                        str20 = "";
                    }
                    StringUiText stringUiText3 = new StringUiText(str20);
                    UiText[] uiTextArr = new UiText[5];
                    uiTextArr[0] = stringUiText2;
                    uiTextArr[1] = resourceUiText2;
                    uiTextArr[c5] = resourceUiText3;
                    uiTextArr[c6] = resourceUiText4;
                    uiTextArr[c] = stringUiText3;
                    Iterator it10 = b.k(uiTextArr).iterator();
                    if (!it10.hasNext()) {
                        zkh.a("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next10 = it10.next();
                    while (it10.hasNext()) {
                        next10 = ((UiText) next10).h((UiText) it10.next());
                    }
                    UiText uiText = (UiText) next10;
                    ResourceUiText resourceUiText5 = new ResourceUiText(R.string.bet_history__final);
                    ResourceUiText resourceUiText6 = new ResourceUiText(R.string.app_common__blank_space);
                    String str21 = x5d0Var != null ? x5d0Var.f : null;
                    if (str21 == null) {
                        str21 = "";
                    }
                    StringUiText stringUiText4 = new StringUiText(str21);
                    StringUiText stringUiText5 = new StringUiText(" - ");
                    String str22 = x5d0Var != null ? x5d0Var.v : null;
                    if (str22 == null) {
                        str22 = "";
                    }
                    StringUiText stringUiText6 = new StringUiText(str22);
                    UiText[] uiTextArr2 = new UiText[5];
                    uiTextArr2[0] = resourceUiText5;
                    uiTextArr2[1] = resourceUiText6;
                    uiTextArr2[c5] = stringUiText4;
                    uiTextArr2[c6] = stringUiText5;
                    uiTextArr2[c] = stringUiText6;
                    Iterator it11 = b.k(uiTextArr2).iterator();
                    if (!it11.hasNext()) {
                        zkh.a("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next11 = it11.next();
                    while (it11.hasNext()) {
                        next11 = ((UiText) next11).h((UiText) it11.next());
                    }
                    ColoredUiText coloredUiTextF = vch0.f((UiText) next11, Integer.valueOf(R.color.text_secondary));
                    boolean z8 = a6d0Var3 != null && a6d0Var3.e;
                    int iA = rqf0.a(null, z8);
                    gno.a aVar3 = (!z8 || (numB = v5d0Var2.a.b(str12)) == null) ? null : new gno.a(numB.intValue(), R.color.icon_brand_sub_primary_d_base);
                    if (z5d0Var == null || a6d0Var3 == null) {
                        string = "";
                    } else {
                        StringBuilder sb = new StringBuilder(a6d0Var3.c);
                        sb.append(" @");
                        String string2 = a6d0Var3.b.toString();
                        string2.getClass();
                        sb.append(gky.a.a(string2, false));
                        string = sb.toString();
                    }
                    Iterator<T> it12 = list5.iterator();
                    while (true) {
                        if (!it12.hasNext()) {
                            str3 = str12;
                            v5d0Var = v5d0Var2;
                            next7 = null;
                            break;
                        }
                        next7 = it12.next();
                        a6d0 a6d0Var4 = (a6d0) next7;
                        str3 = str12;
                        v5d0Var = v5d0Var2;
                        if (a6d0Var4.d.equals(z5d0Var != null ? z5d0Var.a : null) && a6d0Var4.e) {
                            break;
                        }
                        str12 = str3;
                        v5d0Var2 = v5d0Var;
                    }
                    a6d0 a6d0Var5 = (a6d0) next7;
                    String str23 = a6d0Var5 != null ? a6d0Var5.c : null;
                    if (str23 == null) {
                        str23 = "";
                    }
                    String str24 = z5d0Var != null ? z5d0Var.b : null;
                    if (str24 == null) {
                        str24 = "";
                    }
                    arrayList2.add(new nmo(nnoVar, a4h.a(new voo(strA3, uooVarN, resourceUiText, null, uiText, coloredUiTextF, null, null, null, new vmo(iA, aVar3, new poo(string, str24, str23), null))), rqf0.b(o5d0Var2.b), null));
                    str8 = str18;
                    list8 = list2;
                    it4 = it9;
                    list6 = list3;
                    list7 = list4;
                    i4 = i5;
                    z3 = z7;
                    str12 = str3;
                    c2 = c5;
                    v5d0Var2 = v5d0Var;
                    c4 = c;
                    c3 = c6;
                }
                arrayList.addAll(arrayList2);
            } else if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3 && iOrdinal2 != 4) {
                uhc.a();
                return null;
            }
            listB = a4h.b(arrayList);
        }
        ngsVarB.addAll(listB);
        return new bno.c(a4h.b(a.a(ngsVarB)));
    }
}
