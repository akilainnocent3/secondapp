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
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bi5 extends pf implements gaj<yh5.b, String, v1b<? super bno>, Object> {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gaj
    public final Object invoke(yh5.b bVar, String str, v1b<? super bno> v1bVar) {
        int i;
        Object next;
        Object next2;
        boolean z;
        String strA;
        List<uh5> list;
        uh5 uh5Var;
        Object next3;
        char c;
        Object next4;
        ResourceUiText resourceUiText;
        qeo qeoVarB;
        Object next5;
        List<hi5> list2;
        String str2;
        jmo jmoVar;
        Object next6;
        Iterator it;
        List<hi5> list3;
        Object next7;
        String str3;
        int i2;
        qcn qcnVarB;
        yh5.b bVar2 = bVar;
        String str4 = str;
        yh5 yh5Var = (yh5) this.a;
        yh5Var.getClass();
        if (bVar2 instanceof yh5.b.C1347b) {
            return bno.b.a;
        }
        if (bVar2 instanceof yh5.b.a) {
            return new bno.a(new wmo.a(((yh5.b.a) bVar2).a.a));
        }
        if (!(bVar2 instanceof yh5.b.c)) {
            uhc.a();
            return null;
        }
        qh5 qh5Var = ((yh5.b.c) bVar2).a;
        ngs ngsVarB = a.b();
        cmo cmoVar = yh5Var.b.a;
        qh5Var.getClass();
        String str5 = qh5Var.b;
        List<sh5> list4 = qh5Var.u;
        String str6 = qh5Var.d;
        String str7 = qh5Var.c;
        boolean z2 = qh5Var.p;
        boolean z3 = qh5Var.o;
        String str8 = qh5Var.j;
        BigDecimal bigDecimal = qh5Var.k;
        List<rh5> list5 = qh5Var.q;
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        Iterator<T> it2 = list5.iterator();
        while (it2.hasNext()) {
            bigDecimalAdd = bigDecimalAdd.add(((rh5) it2.next()).f);
        }
        Integer numC = cmoVar.c(str6);
        ResourceUiText resourceUiTextQ = rqf0.q(str5);
        BigDecimal bigDecimal2 = bigDecimalAdd;
        String strD = bwf0.a.d(qh5Var.h, true);
        Integer numA = cmoVar.a(str6);
        UiText uiTextD = rqf0.d(list5.size(), str7);
        Integer numValueOf = z2 ? Integer.valueOf(R.drawable.ic__feature__won) : null;
        epo.a aVar = numValueOf != null ? new epo.a(numValueOf.intValue(), R.color.bg_virtual_build_and_go) : null;
        int i3 = R.color.text_inverse_primary;
        if (!z3) {
            i = R.string.bet_history__waiting_to_kick_off;
        } else if (z2) {
            i3 = R.color.bg_virtual_build_and_go;
            i = R.string.bet_history__won;
        } else {
            i = R.string.bet_history__lost;
        }
        String str9 = strD;
        ColoredUiText coloredUiText = new ColoredUiText(new ResourceUiText(i), Integer.valueOf(i3), null);
        ColoredUiText coloredUiTextT = rqf0.t(R.color.bg_virtual_build_and_go, qh5Var.f, z3, z2);
        String strP = rqf0.p(qh5Var.e);
        ResourceUiText resourceUiTextJ = rqf0.j(str8, bigDecimal, new fi5(qh5Var, 0));
        ResourceUiText resourceUiTextI = rqf0.i(bigDecimal, str8);
        Iterator<T> it3 = cd3.f.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!((cd3) next).a.equalsIgnoreCase(str7));
        cd3 cd3Var = (cd3) next;
        if (cd3Var != null) {
            int iOrdinal = cd3Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        uhc.a();
                        return null;
                    }
                }
                z = false;
                strA = null;
            } else {
                rh5 rh5Var = (rh5) CollectionsKt.p0(list5);
                String str10 = (rh5Var == null || (list = rh5Var.h) == null || (uh5Var = (uh5) CollectionsKt.p0(list)) == null) ? null : uh5Var.c;
                Iterator<T> it4 = list4.iterator();
                do {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                } while (!((sh5) next2).a.equals(str10));
                sh5 sh5Var = (sh5) next2;
                if (sh5Var != null) {
                    z = false;
                    strA = gky.a.a(bjb0.L(sh5Var.b, Locale.US), false);
                    z3 = z3;
                    str9 = str9;
                } else {
                    z = false;
                    strA = null;
                }
            }
        } else {
            z = false;
            strA = null;
        }
        bigDecimal2.getClass();
        boolean z4 = z3;
        String str11 = str4;
        boolean z5 = z;
        char c2 = 1;
        ngsVarB.add(new epo(null, numC, resourceUiTextQ, str5, str9, numA, uiTextD, aVar, coloredUiText, null, coloredUiTextT, strP, resourceUiTextJ, resourceUiTextI, strA, rqf0.f(bigDecimal2), rqf0.v(qh5Var.g)));
        Iterator<T> it5 = cd3.f.iterator();
        do {
            if (!it5.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it5.next();
        } while (!((cd3) next3).a.equalsIgnoreCase(str7));
        cd3 cd3Var2 = (cd3) next3;
        if (cd3Var2 == null) {
            qcnVarB = n1a0.c;
        } else {
            ArrayList arrayList = new ArrayList();
            int iOrdinal2 = cd3Var2.ordinal();
            if (iOrdinal2 == 0) {
                char c3 = 2;
                int i4 = 3;
                List<hi5> list6 = qh5Var.r;
                List<ii5> list7 = qh5Var.s;
                List<ji5> list8 = qh5Var.t;
                ArrayList arrayList2 = new ArrayList(l48.r(list5, 10));
                Iterator it6 = list5.iterator();
                while (it6.hasNext()) {
                    rh5 rh5Var2 = (rh5) it6.next();
                    list6.getClass();
                    list7.getClass();
                    list8.getClass();
                    list4.getClass();
                    rh5Var2.getClass();
                    String str12 = rh5Var2.b;
                    uh5 uh5Var2 = (uh5) CollectionsKt.firstOrNull(rh5Var2.h);
                    String str13 = uh5Var2 != null ? uh5Var2.a : null;
                    String str14 = uh5Var2 != null ? uh5Var2.b : null;
                    String str15 = uh5Var2 != null ? uh5Var2.c : null;
                    Iterator<T> it7 = list6.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            c = c2;
                            next4 = null;
                            break;
                        }
                        next4 = it7.next();
                        c = c2;
                        if (((hi5) next4).a.equals(str13)) {
                            break;
                        }
                        c2 = c;
                    }
                    hi5 hi5Var = (hi5) next4;
                    boolean z6 = rh5Var2.g;
                    if (str13 == null) {
                        str13 = "";
                    }
                    if (str14 == null) {
                        str14 = "";
                    }
                    char c4 = c3;
                    String strA2 = uf80.a(ux5.a(str12, "_", str13, "_", str14), "_", str15 == null ? "" : str15);
                    boolean z7 = z4;
                    uoo uooVarN = rqf0.n(z7, null, z6, R.drawable.ic_bng_selection_status_win);
                    String str16 = str11;
                    if (Intrinsics.g(str16, strA2)) {
                        if (z7) {
                            jrn.a aVar2 = jrn.b;
                            i2 = z6 ? R.string.bet_history__won : R.string.bet_history__lost;
                        } else {
                            i2 = R.string.bet_history__waiting_to_kick_off;
                        }
                        resourceUiText = new ResourceUiText(i2);
                    } else {
                        resourceUiText = null;
                    }
                    String str17 = hi5Var != null ? hi5Var.c.a : null;
                    if (str17 == null) {
                        str17 = "";
                    }
                    StringUiText stringUiText = vch0.a;
                    StringUiText stringUiText2 = new StringUiText(str17);
                    int i5 = i4;
                    ResourceUiText resourceUiText2 = new ResourceUiText(R.string.app_common__blank_space);
                    List<ji5> list9 = list8;
                    ResourceUiText resourceUiText3 = new ResourceUiText(R.string.bet_history__vs);
                    Iterator it8 = it6;
                    ResourceUiText resourceUiText4 = new ResourceUiText(R.string.app_common__blank_space);
                    String str18 = hi5Var != null ? hi5Var.e.a : null;
                    if (str18 == null) {
                        str18 = "";
                    }
                    StringUiText stringUiText3 = new StringUiText(str18);
                    UiText[] uiTextArr = new UiText[5];
                    uiTextArr[z5 ? 1 : 0] = stringUiText2;
                    uiTextArr[c] = resourceUiText2;
                    uiTextArr[c4] = resourceUiText3;
                    uiTextArr[i5] = resourceUiText4;
                    uiTextArr[4] = stringUiText3;
                    Iterator it9 = b.k(uiTextArr).iterator();
                    if (!it9.hasNext()) {
                        zkh.a("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next8 = it9.next();
                    while (it9.hasNext()) {
                        next8 = ((UiText) next8).h((UiText) it9.next());
                    }
                    UiText uiText = (UiText) next8;
                    if (z7) {
                        qeoVarB = reo.b(hi5Var != null ? hi5Var.g : null);
                    } else {
                        qeoVarB = null;
                    }
                    Iterator<T> it10 = list4.iterator();
                    do {
                        if (!it10.hasNext()) {
                            next5 = null;
                            break;
                        }
                        next5 = it10.next();
                    } while (!((sh5) next5).a.equals(str15));
                    sh5 sh5Var2 = (sh5) next5;
                    if (sh5Var2 != null) {
                        String strA3 = gky.a.a(bjb0.L(sh5Var2.b, Locale.US), z5);
                        ResourceUiText resourceUiText5 = new ResourceUiText(R.string.page_instant_virtual__bet_builder);
                        StringUiText stringUiText4 = new StringUiText(" @");
                        StringUiText stringUiTextD = vch0.d(strA3);
                        UiText[] uiTextArr2 = new UiText[i5];
                        uiTextArr2[z5 ? 1 : 0] = resourceUiText5;
                        uiTextArr2[c] = stringUiText4;
                        uiTextArr2[c4] = stringUiTextD;
                        Iterator it11 = b.k(uiTextArr2).iterator();
                        if (!it11.hasNext()) {
                            zkh.a("Empty collection can't be reduced.");
                            return null;
                        }
                        Object next9 = it11.next();
                        while (it11.hasNext()) {
                            next9 = ((UiText) next9).h((UiText) it11.next());
                        }
                        UiText uiText2 = (UiText) next9;
                        List<th5> list10 = sh5Var2.d;
                        ArrayList arrayList3 = new ArrayList(l48.r(list10, 10));
                        Iterator it12 = list10.iterator();
                        while (it12.hasNext()) {
                            th5 th5Var = (th5) it12.next();
                            Iterator<T> it13 = list9.iterator();
                            do {
                                if (!it13.hasNext()) {
                                    next6 = null;
                                    break;
                                }
                                next6 = it13.next();
                            } while (!((ji5) next6).a.equals(th5Var.b));
                            ji5 ji5Var = (ji5) next6;
                            Iterator<T> it14 = list7.iterator();
                            while (true) {
                                if (!it14.hasNext()) {
                                    it = it12;
                                    list3 = list6;
                                    next7 = null;
                                    break;
                                }
                                next7 = it14.next();
                                it = it12;
                                list3 = list6;
                                if (((ii5) next7).a.equals(th5Var.a)) {
                                    break;
                                }
                                it12 = it;
                                list6 = list3;
                            }
                            ii5 ii5Var = (ii5) next7;
                            String strA0 = "--";
                            if (z7) {
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it15 = list9.iterator();
                                while (it15.hasNext()) {
                                    Object next10 = it15.next();
                                    String str19 = strA0;
                                    ji5 ji5Var2 = (ji5) next10;
                                    String str20 = strA2;
                                    Iterator it16 = it15;
                                    if (ji5Var2.d.equals(ii5Var != null ? ii5Var.a : null) && ji5Var2.e) {
                                        arrayList4.add(next10);
                                    }
                                    strA0 = str19;
                                    it15 = it16;
                                    strA2 = str20;
                                }
                                String str21 = strA0;
                                str3 = strA2;
                                ArrayList arrayList5 = new ArrayList();
                                int size = arrayList4.size();
                                int i6 = z5 ? 1 : 0;
                                while (i6 < size) {
                                    Object obj = arrayList4.get(i6);
                                    i6++;
                                    ArrayList arrayList6 = arrayList4;
                                    if (!StringsKt.U(((ji5) obj).c)) {
                                        arrayList5.add(obj);
                                    }
                                    arrayList4 = arrayList6;
                                }
                                ArrayList arrayList7 = !arrayList5.isEmpty() ? arrayList5 : null;
                                strA0 = arrayList7 != null ? CollectionsKt.a0(arrayList7, "\n", null, null, new di5(), 30) : str21;
                            } else {
                                str3 = strA2;
                            }
                            String str22 = ji5Var != null ? ji5Var.c : null;
                            if (str22 == null) {
                                str22 = "";
                            }
                            String str23 = ii5Var != null ? ii5Var.b : null;
                            if (str23 == null) {
                                str23 = "";
                            }
                            arrayList3.add(new poo(str22, str23, strA0));
                            it12 = it;
                            list6 = list3;
                            strA2 = str3;
                        }
                        list2 = list6;
                        str2 = strA2;
                        jmoVar = new jmo(a4h.b(arrayList3), uiText2);
                    } else {
                        list2 = list6;
                        str2 = strA2;
                        jmoVar = null;
                    }
                    arrayList2.add(new nmo(null, a4h.a(new voo(str2, uooVarN, resourceUiText, null, uiText, null, null, null, qeoVarB, jmoVar)), rqf0.b(str12), null));
                    c2 = c;
                    str11 = str16;
                    z4 = z7;
                    list8 = list9;
                    it6 = it8;
                    list6 = list2;
                    c3 = c4;
                    i4 = 3;
                }
                arrayList.addAll(arrayList2);
            } else if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3 && iOrdinal2 != 4) {
                uhc.a();
                return null;
            }
            qcnVarB = a4h.b(arrayList);
        }
        ngsVarB.addAll(qcnVarB);
        return new bno.c(a4h.b(a.a(ngsVarB)));
    }
}
