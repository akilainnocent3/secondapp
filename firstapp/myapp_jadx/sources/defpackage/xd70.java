package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xd70 extends pf implements iaj<ve70, je70, te70, v1b<? super kd70>, Object> {
    /* JADX WARN: Code duplicated, block: B:101:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:104:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:106:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:111:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:120:0x0302  */
    /* JADX WARN: Code duplicated, block: B:123:0x0309  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.iaj
    public final Object d(ve70 ve70Var, je70 je70Var, te70 te70Var, v1b<? super kd70> v1bVar) {
        int i;
        re70 re70Var;
        boolean z;
        sd70 cVar;
        he70 he70Var;
        Object next;
        ArrayList arrayList;
        int iOrdinal;
        int i2;
        boolean z2;
        int iOrdinal2;
        int i3;
        String str;
        re70 re70Var2;
        ve70 ve70Var2 = ve70Var;
        je70 je70Var2 = je70Var;
        te70 te70Var2 = te70Var;
        ((td70) this.a).getClass();
        if (ve70Var2 == null) {
            return null;
        }
        int iOrdinal3 = ve70Var2.ordinal();
        int i4 = 3;
        int i5 = 0;
        int i6 = R.string.page_instant_virtual__season_vnum;
        int i7 = 10;
        int i8 = 1;
        if (iOrdinal3 == 0) {
            i = 1;
            re70Var = null;
            if (!(je70Var2 instanceof je70.b)) {
                if (je70Var2 instanceof je70.a) {
                    cVar = sd70.a.a;
                } else if (je70Var2 instanceof je70.c) {
                    r770 r770Var = ((je70.c) je70Var2).a;
                    if (r770Var != null) {
                        String str2 = r770Var.b;
                        StringUiText stringUiText = vch0.a;
                        z = false;
                        Iterator it = b.k(new StringUiText(str2), new StringUiText(" - "), new ResourceUiText(R.string.page_instant_virtual__season_vnum, ay0.S(new Object[]{String.valueOf(r770Var.c)}))).iterator();
                        if (!it.hasNext()) {
                            zkh.a("Empty collection can't be reduced.");
                            return null;
                        }
                        Object next2 = it.next();
                        while (it.hasNext()) {
                            next2 = ((UiText) next2).h((UiText) it.next());
                        }
                        UiText uiText = (UiText) next2;
                        List<t770> list = r770Var.d;
                        ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
                        for (t770 t770Var : list) {
                            int i9 = t770Var.a;
                            int i10 = i9 % 2 == 0 ? R.color.bg_surface_primary : R.color.transparent;
                            String strValueOf = String.valueOf(i9);
                            qzd0.a aVar = qzd0.b;
                            String str3 = t770Var.j;
                            aVar.getClass();
                            Iterator<T> it2 = qzd0.d.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!((qzd0) next).a.equalsIgnoreCase(str3));
                            arrayList2.add(new ke70(i10, strValueOf, (qzd0) next, t770Var.d, t770Var.c, String.valueOf(t770Var.e), String.valueOf(t770Var.f), String.valueOf(t770Var.g), String.valueOf(t770Var.h), String.valueOf(t770Var.i)));
                        }
                        he70Var = new he70(a4h.b(arrayList2), uiText);
                    } else {
                        z = false;
                        he70Var = null;
                    }
                    cVar = new sd70.c(he70Var);
                } else {
                    z = false;
                    if (je70Var2 != null) {
                        uhc.a();
                        return null;
                    }
                    cVar = null;
                }
                if (cVar == null) {
                    return re70Var;
                }
                uag<ve70> uagVar = ve70.c;
                arrayList = new ArrayList(l48.r(uagVar, 10));
                for (ve70 ve70Var3 : uagVar) {
                    iOrdinal = ve70Var3.ordinal();
                    if (iOrdinal != 0) {
                        i2 = R.string.page_instant_virtual__league_standings;
                    } else {
                        if (iOrdinal == i) {
                            uhc.a();
                            return re70Var;
                        }
                        i2 = R.string.page_instant_virtual__match_results;
                    }
                    StringUiText stringUiText2 = vch0.a;
                    ResourceUiText resourceUiText = new ResourceUiText(i2);
                    if (ve70Var3 == ve70Var2) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    iOrdinal2 = ve70Var3.ordinal();
                    if (iOrdinal2 != 0) {
                        i3 = 1;
                        if (iOrdinal2 == 1) {
                            uhc.a();
                            return re70Var;
                        }
                        str = "overview_stats_match_results_chip";
                    } else {
                        i3 = 1;
                        str = "overview_stats_league_standings_chip";
                    }
                    arrayList.add(new ld70(ve70Var3, resourceUiText, z2, str));
                    i = i3;
                }
                return new kd70(ve70Var2, a4h.b(arrayList), cVar);
            }
            cVar = sd70.b.a;
        } else {
            if (iOrdinal3 != 1) {
                uhc.a();
                return null;
            }
            if (te70Var2 instanceof te70.b) {
                cVar = sd70.b.a;
            } else if (te70Var2 instanceof te70.a) {
                cVar = sd70.a.a;
            } else if (te70Var2 instanceof te70.c) {
                List<h970> list2 = ((te70.c) te70Var2).a;
                if (list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(l48.r(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        h970 h970Var = (h970) it3.next();
                        String str4 = h970Var.e;
                        String str5 = h970Var.d;
                        StringUiText stringUiText3 = vch0.a;
                        StringUiText stringUiText4 = new StringUiText(str5);
                        StringUiText stringUiText5 = new StringUiText(" - ");
                        int i11 = i8;
                        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_instant_virtual__matchday_vnum, ay0.S(new Object[]{String.valueOf(h970Var.b)}));
                        UiText[] uiTextArr = new UiText[i4];
                        uiTextArr[i5] = stringUiText4;
                        uiTextArr[i11] = stringUiText5;
                        uiTextArr[2] = resourceUiText2;
                        Iterator it4 = b.k(uiTextArr).iterator();
                        if (!it4.hasNext()) {
                            zkh.a("Empty collection can't be reduced.");
                            return null;
                        }
                        Object next3 = it4.next();
                        while (it4.hasNext()) {
                            next3 = ((UiText) next3).h((UiText) it4.next());
                        }
                        UiText uiText2 = (UiText) next3;
                        ResourceUiText resourceUiText3 = new ResourceUiText(i6, ay0.S(new Object[]{String.valueOf(h970Var.a)}));
                        List<i970> list3 = h970Var.f;
                        ArrayList arrayList4 = new ArrayList(l48.r(list3, i7));
                        int i12 = i5;
                        for (Iterator it5 = list3.iterator(); it5.hasNext(); it5 = it5) {
                            Object next4 = it5.next();
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                b.q();
                                throw null;
                            }
                            i970 i970Var = (i970) next4;
                            arrayList4.add(new ue70(String.valueOf(i13), i13 % 2 == 0 ? R.color.bg_surface_primary : R.color.transparent, i970Var.c, i970Var.b, i970Var.e, i970Var.d, c.p(i970Var.f, ":", "-", false), c.p(i970Var.g, ":", "-", false)));
                            i12 = i13;
                            it3 = it3;
                        }
                        arrayList3.add(new le70(str4, uiText2, resourceUiText3, a4h.b(arrayList4)));
                        i8 = i11;
                        it3 = it3;
                        i4 = 3;
                        i5 = 0;
                        i6 = R.string.page_instant_virtual__season_vnum;
                        i7 = 10;
                    }
                    i = i8;
                    re70Var = null;
                    qcn qcnVarB = a4h.b(arrayList3);
                    if (qcnVarB != null) {
                        re70Var2 = new re70(qcnVarB);
                    }
                    cVar = new sd70.c(re70Var2);
                } else {
                    i = 1;
                    re70Var = null;
                }
                re70Var2 = re70Var;
                cVar = new sd70.c(re70Var2);
            } else {
                i = 1;
                re70Var = null;
                if (te70Var2 != null) {
                    uhc.a();
                    return null;
                }
                cVar = null;
            }
            i = 1;
            re70Var = null;
        }
        z = false;
        if (cVar == null) {
            return re70Var;
        }
        uag<ve70> uagVar2 = ve70.c;
        arrayList = new ArrayList(l48.r(uagVar2, 10));
        while (r2.hasNext()) {
            iOrdinal = ve70Var3.ordinal();
            if (iOrdinal != 0) {
                i2 = R.string.page_instant_virtual__league_standings;
            } else {
                if (iOrdinal == i) {
                    uhc.a();
                    return re70Var;
                }
                i2 = R.string.page_instant_virtual__match_results;
            }
            StringUiText stringUiText6 = vch0.a;
            ResourceUiText resourceUiText4 = new ResourceUiText(i2);
            if (ve70Var3 == ve70Var2) {
                z2 = true;
            } else {
                z2 = z;
            }
            iOrdinal2 = ve70Var3.ordinal();
            if (iOrdinal2 != 0) {
                i3 = 1;
                if (iOrdinal2 == 1) {
                    uhc.a();
                    return re70Var;
                }
                str = "overview_stats_match_results_chip";
            } else {
                i3 = 1;
                str = "overview_stats_league_standings_chip";
            }
            arrayList.add(new ld70(ve70Var3, resourceUiText4, z2, str));
            i = i3;
        }
        return new kd70(ve70Var2, a4h.b(arrayList), cVar);
    }
}
