package defpackage;

import android.os.SystemClock;
import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.model.scheduledfootball.ScheduledFootballServerTime;
import com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.b;
import com.sportybet.android.instantwin.router.openbet.ScheduledFootballOpenBetsInput;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xc70 extends pf implements iaj<fqo.c, dc70, String, v1b<? super wc70>, Object> {
    /* JADX WARN: Code duplicated, block: B:102:0x0309  */
    /* JADX WARN: Code duplicated, block: B:103:0x030c  */
    /* JADX WARN: Code duplicated, block: B:105:0x030f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0312  */
    /* JADX WARN: Code duplicated, block: B:108:0x0319  */
    /* JADX WARN: Code duplicated, block: B:111:0x031d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0330  */
    /* JADX WARN: Code duplicated, block: B:118:0x0338  */
    /* JADX WARN: Code duplicated, block: B:135:0x03e1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iaj
    public final Object d(fqo.c cVar, dc70 dc70Var, String str, v1b<? super wc70> v1bVar) {
        bb70 dVar;
        List<wk70> list;
        rqf0 rqf0Var;
        Object next;
        ArrayList arrayList;
        Object next2;
        Object obj;
        char c;
        rc70 rc70Var;
        String str2;
        String str3;
        String str4;
        UiText uiText;
        String str5;
        String strValueOf;
        ResourceUiText resourceUiText;
        UiText uiText2;
        ScheduledFootballOpenBetsInput scheduledFootballOpenBetsInput;
        ScheduledFootballServerTime scheduledFootballServerTime;
        UiText stringUiText;
        ResourceUiText resourceUiText2;
        fqo.c cVar2 = cVar;
        dc70 dc70Var2 = dc70Var;
        String str6 = str;
        b bVar = (b) this.a;
        bVar.getClass();
        if (dc70Var2 instanceof dc70.b) {
            dVar = bb70.c.a;
        } else if (dc70Var2 instanceof dc70.a) {
            dVar = bb70.b.a;
        } else {
            if (!(dc70Var2 instanceof dc70.c)) {
                uhc.a();
                return null;
            }
            ga70 ga70Var = ((dc70.c) dc70Var2).a;
            if (ga70Var.d.isEmpty()) {
                dVar = bb70.a.a;
            } else {
                rqf0 rqf0Var2 = bVar.c;
                List<fa70> list2 = ga70Var.d;
                ArrayList arrayList2 = new ArrayList();
                for (fa70 fa70Var : list2) {
                    List<gk70> list3 = fa70Var.f;
                    ArrayList arrayList3 = new ArrayList(l48.r(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new Pair((gk70) it.next(), fa70Var));
                    }
                    p48.w(arrayList3, arrayList2);
                }
                ArrayList arrayList4 = new ArrayList(l48.r(arrayList2, 10));
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    int i2 = i + 1;
                    Pair pair = (Pair) obj2;
                    gk70 gk70Var = (gk70) pair.a;
                    fa70 fa70Var2 = (fa70) pair.b;
                    Object[] objArr = {fa70Var2.b};
                    StringUiText stringUiText2 = vch0.a;
                    String str7 = null;
                    ResourceUiText resourceUiText3 = new ResourceUiText(R.string.bet_history__ticket_id_vid, ay0.S(objArr));
                    String str8 = fa70Var2.c;
                    List<yk70> list4 = gk70Var.d;
                    int size2 = list4.size();
                    rqf0Var2.getClass();
                    UiText uiTextD = rqf0.d(size2, str8);
                    if (uiTextD == null) {
                        uiTextD = vch0.a;
                    }
                    UiText uiText3 = uiTextD;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        p48.w(((yk70) it2.next()).g, arrayList5);
                    }
                    List listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList5));
                    ArrayList arrayList6 = new ArrayList(l48.r(listA0, 10));
                    Iterator it3 = listA0.iterator();
                    while (it3.hasNext()) {
                        xk70 xk70Var = (xk70) it3.next();
                        List<ea70> list5 = ga70Var.e;
                        Iterator it4 = it3;
                        List<vk70> list6 = ga70Var.f;
                        List<wk70> list7 = ga70Var.g;
                        Iterator<T> it5 = list5.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                list = list7;
                                rqf0Var = rqf0Var2;
                                next = str7;
                                break;
                            }
                            next = it5.next();
                            list = list7;
                            rqf0Var = rqf0Var2;
                            if (((ea70) next).a.equals(xk70Var.c)) {
                                break;
                            }
                            rqf0Var2 = rqf0Var;
                            list7 = list;
                        }
                        ea70 ea70Var = (ea70) next;
                        Iterator it6 = list.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                arrayList = arrayList2;
                                next2 = str7;
                                break;
                            }
                            next2 = it6.next();
                            Iterator it7 = it6;
                            arrayList = arrayList2;
                            if (((wk70) next2).a.equals(xk70Var.e)) {
                                break;
                            }
                            it6 = it7;
                            arrayList2 = arrayList;
                        }
                        wk70 wk70Var = (wk70) next2;
                        Iterator it8 = list6.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                obj = str7;
                                break;
                            }
                            Object next3 = it8.next();
                            Iterator it9 = it8;
                            obj = next3;
                            if (((vk70) next3).a.equals(xk70Var.d)) {
                                break;
                            }
                            it8 = it9;
                        }
                        vk70 vk70Var = (vk70) obj;
                        String str9 = xk70Var.a;
                        int iOrdinal = xk70Var.b.ordinal();
                        int i3 = size;
                        if (iOrdinal == 0) {
                            c = 1;
                            rc70Var = new rc70(new ec70.a(), new ResourceUiText(R.string.bet_history__waiting_for_result), "selection_result_unsettled_icon");
                        } else if (iOrdinal != 1) {
                            c = 1;
                            if (iOrdinal == 2) {
                                rc70Var = new rc70(new ec70.b(R.drawable.ic__feature__match_status_lost), new ResourceUiText(R.string.bet_history__lost), "selection_result_miss_icon");
                            } else {
                                if (iOrdinal != 3) {
                                    uhc.a();
                                    return str7;
                                }
                                rc70Var = new rc70(new ec70.b(R.drawable.ic__feature__match_status_void), new ResourceUiText(R.string.bet_history__void), "selection_result_void_icon");
                            }
                        } else {
                            c = 1;
                            rc70Var = new rc70(new ec70.b(R.drawable.ic__feature__match_status_won), new ResourceUiText(R.string.bet_history__won), "selection_result_hit_icon");
                        }
                        rc70 rc70Var2 = rc70Var;
                        boolean zEquals = str9.equals(str6);
                        String strA = wk70Var != null ? uf80.a(new StringBuilder(wk70Var.c), " @", gky.a.a(bjb0.L(wk70Var.b, Locale.US), false)) : str7;
                        String str10 = strA == null ? "" : strA;
                        String str11 = vk70Var != null ? vk70Var.b : str7;
                        String str12 = str11 == null ? "" : str11;
                        if (ea70Var != null) {
                            StringUiText stringUiText3 = new StringUiText(ea70Var.e);
                            Integer numValueOf = Integer.valueOf(R.color.text_primary);
                            ColoredUiText coloredUiText = new ColoredUiText(stringUiText3, numValueOf, str7);
                            ResourceUiText resourceUiText4 = new ResourceUiText(R.string.app_common__blank_space);
                            str2 = str6;
                            str3 = "Empty collection can't be reduced.";
                            str4 = str9;
                            ColoredUiText coloredUiText2 = new ColoredUiText(new ResourceUiText(R.string.bet_history__vs), Integer.valueOf(R.color.text_secondary), null);
                            ResourceUiText resourceUiText5 = new ResourceUiText(R.string.app_common__blank_space);
                            ColoredUiText coloredUiText3 = new ColoredUiText(new StringUiText(ea70Var.g), numValueOf, null);
                            UiText[] uiTextArr = new UiText[5];
                            uiTextArr[0] = coloredUiText;
                            uiTextArr[c] = resourceUiText4;
                            uiTextArr[2] = coloredUiText2;
                            uiTextArr[3] = resourceUiText5;
                            uiTextArr[4] = coloredUiText3;
                            Iterator it10 = kotlin.collections.b.k(uiTextArr).iterator();
                            if (!it10.hasNext()) {
                                zkh.a(str3);
                                return null;
                            }
                            Object next4 = it10.next();
                            while (it10.hasNext()) {
                                next4 = ((UiText) next4).h((UiText) it10.next());
                            }
                            uiText = (UiText) next4;
                            if (uiText == null) {
                            }
                            if (ea70Var != null) {
                                str5 = ea70Var.d;
                            } else {
                                str5 = null;
                            }
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (ea70Var != null) {
                                strValueOf = String.valueOf(ea70Var.j);
                            } else {
                                strValueOf = null;
                            }
                            resourceUiText = new ResourceUiText(R.string.page_instant_virtual__matchday_vnum, ay0.S(new Object[]{strValueOf != null ? strValueOf : ""}));
                            if (ea70Var != null) {
                                scheduledFootballOpenBetsInput = bVar.f;
                                if (scheduledFootballOpenBetsInput == null && (scheduledFootballServerTime = scheduledFootballOpenBetsInput.b) != null) {
                                    long j = ea70Var.i;
                                    Date date = new Date(j);
                                    bVar.d.getClass();
                                    if (gsc.e(date, new Date((scheduledFootballServerTime.b + SystemClock.elapsedRealtime()) - scheduledFootballServerTime.a))) {
                                        stringUiText = new ResourceUiText(R.string.common_dates__today);
                                    } else {
                                        String str13 = bVar.i.format(Long.valueOf(j));
                                        str13.getClass();
                                        stringUiText = new StringUiText(str13);
                                    }
                                    ResourceUiText resourceUiText6 = new ResourceUiText(R.string.app_common__blank_space);
                                    String str14 = bVar.v.format(Long.valueOf(j));
                                    str14.getClass();
                                    StringUiText stringUiText4 = new StringUiText(str14);
                                    UiText[] uiTextArr2 = new UiText[3];
                                    uiTextArr2[0] = stringUiText;
                                    uiTextArr2[c] = resourceUiText6;
                                    uiTextArr2[2] = stringUiText4;
                                    Iterator it11 = kotlin.collections.b.k(uiTextArr2).iterator();
                                    if (!it11.hasNext()) {
                                        zkh.a(str3);
                                        return null;
                                    }
                                    Object next5 = it11.next();
                                    while (it11.hasNext()) {
                                        next5 = ((UiText) next5).h((UiText) it11.next());
                                    }
                                    uiText2 = (UiText) next5;
                                }
                                if (uiText2 == null) {
                                }
                                arrayList6.add(new sc70(str4, rc70Var2, zEquals, str10, str12, uiText, str5, resourceUiText, uiText2));
                                it3 = it4;
                                rqf0Var2 = rqf0Var;
                                size = i3;
                                list4 = list4;
                                arrayList2 = arrayList;
                                i2 = i2;
                                str6 = str2;
                                str7 = null;
                            } else {
                                resourceUiText = resourceUiText;
                            }
                            uiText2 = vch0.a;
                            arrayList6.add(new sc70(str4, rc70Var2, zEquals, str10, str12, uiText, str5, resourceUiText, uiText2));
                            it3 = it4;
                            rqf0Var2 = rqf0Var;
                            size = i3;
                            list4 = list4;
                            arrayList2 = arrayList;
                            i2 = i2;
                            str6 = str2;
                            str7 = null;
                        } else {
                            str2 = str6;
                            str3 = "Empty collection can't be reduced.";
                            str4 = str9;
                        }
                        uiText = vch0.a;
                        if (ea70Var != null) {
                            str5 = ea70Var.d;
                        } else {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str5 = "";
                        }
                        if (ea70Var != null) {
                            strValueOf = String.valueOf(ea70Var.j);
                        } else {
                            strValueOf = null;
                        }
                        resourceUiText = new ResourceUiText(R.string.page_instant_virtual__matchday_vnum, ay0.S(new Object[]{strValueOf != null ? strValueOf : ""}));
                        if (ea70Var != null) {
                            scheduledFootballOpenBetsInput = bVar.f;
                            uiText2 = scheduledFootballOpenBetsInput == null ? null : null;
                            if (uiText2 == null) {
                            }
                            arrayList6.add(new sc70(str4, rc70Var2, zEquals, str10, str12, uiText, str5, resourceUiText, uiText2));
                            it3 = it4;
                            rqf0Var2 = rqf0Var;
                            size = i3;
                            list4 = list4;
                            arrayList2 = arrayList;
                            i2 = i2;
                            str6 = str2;
                            str7 = null;
                        } else {
                            resourceUiText = resourceUiText;
                        }
                        uiText2 = vch0.a;
                        arrayList6.add(new sc70(str4, rc70Var2, zEquals, str10, str12, uiText, str5, resourceUiText, uiText2));
                        it3 = it4;
                        rqf0Var2 = rqf0Var;
                        size = i3;
                        list4 = list4;
                        arrayList2 = arrayList;
                        i2 = i2;
                        str6 = str2;
                        str7 = null;
                    }
                    String str15 = str6;
                    rqf0 rqf0Var3 = rqf0Var2;
                    ArrayList arrayList7 = arrayList2;
                    int i4 = size;
                    int i5 = i2;
                    qcn qcnVarB = a4h.b(arrayList6);
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                    bigDecimalValueOf.getClass();
                    Iterator<T> it12 = list4.iterator();
                    while (it12.hasNext()) {
                        bigDecimalValueOf = bigDecimalValueOf.add(((yk70) it12.next()).c);
                        bigDecimalValueOf.getClass();
                    }
                    arrayList4.add(new ua70(resourceUiText3, uiText3, qcnVarB, rqf0.p(bigDecimalValueOf), bjb0.L(s5y.a(gk70Var.c), Locale.US)));
                    rqf0Var2 = rqf0Var3;
                    size = i4;
                    arrayList2 = arrayList7;
                    i = i5;
                    str6 = str15;
                }
                dVar = new bb70.d(a4h.b(arrayList4), ga70Var.h);
            }
        }
        fqo.a.C0579a c0579a = fqo.a.C0579a.a;
        Integer numC = bVar.a.c(bVar.y1());
        if (numC != null) {
            int iIntValue = numC.intValue();
            StringUiText stringUiText5 = vch0.a;
            resourceUiText2 = new ResourceUiText(iIntValue);
        } else {
            resourceUiText2 = null;
        }
        return new wc70(new fqo(R.color.bg_brand_main_primary, c0579a, resourceUiText2, cVar2), bVar.x1(dc70Var2), dVar);
    }
}
