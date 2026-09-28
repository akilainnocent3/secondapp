package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ConcatUiText;
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
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nr90 extends pf implements jaj<bn90, hug0, String, slo, v1b<? super ts90>, Object> {
    /* JADX WARN: Code duplicated, block: B:100:0x0269  */
    /* JADX WARN: Code duplicated, block: B:101:0x0270  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:121:0x0308 A[LOOP:6: B:119:0x0302->B:121:0x0308, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x0323  */
    /* JADX WARN: Code duplicated, block: B:128:0x0334  */
    /* JADX WARN: Code duplicated, block: B:131:0x034d  */
    /* JADX WARN: Code duplicated, block: B:134:0x036e A[LOOP:9: B:132:0x0368->B:134:0x036e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x03af  */
    /* JADX WARN: Code duplicated, block: B:144:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:147:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:150:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:156:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:157:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:162:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:167:0x0412  */
    /* JADX WARN: Code duplicated, block: B:170:0x0427  */
    /* JADX WARN: Code duplicated, block: B:172:0x042f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0443  */
    /* JADX WARN: Code duplicated, block: B:176:0x044d  */
    /* JADX WARN: Code duplicated, block: B:246:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x05ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0117  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    /* JADX WARN: Code duplicated, block: B:50:0x013a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0140  */
    /* JADX WARN: Code duplicated, block: B:55:0x015e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0160  */
    /* JADX WARN: Code duplicated, block: B:98:0x0265  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jaj
    public final Object l(bn90 bn90Var, hug0 hug0Var, String str, slo sloVar, v1b<? super ts90> v1bVar) {
        BigDecimal bigDecimal;
        vr90 tr90Var;
        vr90 vr90Var;
        UiText resourceUiText;
        int i;
        Locale locale;
        int i2;
        bt90 bt90Var;
        BigDecimal bigDecimalB;
        String strA;
        BigDecimal bigDecimal2;
        String str2;
        String strP;
        String strP2;
        int iA;
        LinkedHashMap linkedHashMap;
        int iA2;
        LinkedHashMap linkedHashMap2;
        Iterator it;
        String str3;
        LinkedHashMap linkedHashMap3;
        Iterator it2;
        String str4;
        Iterator it3;
        int i3;
        Object next;
        int i4;
        vq90 vq90Var;
        String str5;
        String str6;
        fr90 fr90Var;
        LinkedHashMap linkedHashMap4;
        Map map;
        Pair pair;
        ms90 ms90Var;
        us90 us90Var;
        us90 us90Var2;
        os90 os90Var;
        ms90 ms90Var2;
        Iterator<T> it4;
        String str7;
        Iterator<T> it5;
        Object next2;
        xr90 xr90Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it6;
        int i5;
        bn90 bn90Var2 = bn90Var;
        hug0 hug0Var2 = hug0Var;
        String str8 = str;
        slo sloVar2 = sloVar;
        ((pr90) this.a).getClass();
        if (!(bn90Var2 instanceof bn90.d)) {
            return null;
        }
        StringUiText stringUiText = vch0.a;
        bt90 bt90Var2 = new bt90(R.color.bg_inverse_tertiary_d_lighter, new ResourceUiText(R.string.component_betslip__sim_ticket_details));
        rq90 rq90Var = ((bn90.d) bn90Var2).a;
        hug0Var2.getClass();
        List<uq90> list = rq90Var.l;
        List<fr90> list2 = rq90Var.m;
        String str9 = rq90Var.b;
        BigDecimal bigDecimal3 = rq90Var.n;
        uq90 uq90Var = (uq90) CollectionsKt.firstOrNull(list);
        boolean z = uq90Var != null ? uq90Var.f : false;
        if (uq90Var == null || (bigDecimal = uq90Var.e) == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        cd3.a aVar = cd3.b;
        String str10 = rq90Var.c;
        aVar.getClass();
        cd3 cd3VarA = cd3.a.a(str10);
        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.bet_history__round_id_vid, ay0.S(new Object[]{str9}));
        String strD = bwf0.a.d(rq90Var.g, false);
        UiText uiTextE = cd3VarA != null ? rqf0.e(cd3VarA, 1) : vch0.a;
        qs90 rs90Var = z ? new rs90(new ResourceUiText(R.string.bet_history__won)) : new ps90(new ResourceUiText(R.string.bet_history__lost));
        int i6 = cd3VarA == null ? -1 : sr90.a.a[cd3VarA.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                vr90Var = null;
            } else {
                int iOrdinal = hug0Var2.ordinal();
                if (iOrdinal == 1) {
                    i5 = R.drawable.ic_one_bet_cut_sw;
                } else if (iOrdinal != 2) {
                    i5 = iOrdinal != 3 ? R.drawable.ic_one_bet_cut : R.drawable.ic_one_bet_cut_pt_br;
                } else {
                    i5 = R.drawable.ic_one_bet_cut_es_mx;
                }
                tr90Var = new ur90(i5);
            }
            if (z) {
                resourceUiText = new StringUiText(bjb0.P(p54.b(rq90Var.f).toString(), Locale.US));
            } else {
                resourceUiText = new ResourceUiText(R.string.app_common__zero_point_zero);
            }
            UiText uiText = resourceUiText;
            if (z) {
                i = R.color.bg_brand_sub_primary_d_lighter;
            } else {
                i = R.color.text_inverse_primary;
            }
            int i7 = i;
            String string = p54.b(rq90Var.e).toString();
            locale = Locale.US;
            String strP3 = bjb0.P(string, locale);
            ResourceUiText resourceUiTextI = rqf0.i(rq90Var.j, rq90Var.i);
            if (cd3VarA == null) {
                i2 = -1;
            } else {
                i2 = sr90.a.a[cd3VarA.ordinal()];
            }
            int i8 = 10;
            if (i2 != 1 || i2 == 2) {
                bt90Var = bt90Var2;
                if (uq90Var != null) {
                    bigDecimalB = p54.b(uq90Var.h);
                } else {
                    bigDecimalB = null;
                }
                strA = gky.a.a(bjb0.P(String.valueOf(bigDecimalB), locale), false);
            } else {
                int iA3 = jpu.a(l48.r(list2, 10));
                if (iA3 < 16) {
                    iA3 = 16;
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(iA3);
                Iterator it7 = list2.iterator();
                while (it7.hasNext()) {
                    fr90 fr90Var2 = (fr90) it7.next();
                    String str11 = fr90Var2.b;
                    List<wr90> list3 = fr90Var2.n;
                    Iterator it8 = it7;
                    bt90 bt90Var3 = bt90Var2;
                    ArrayList arrayList3 = new ArrayList(l48.r(list3, i8));
                    Iterator it9 = list3.iterator();
                    while (it9.hasNext()) {
                        List<xr90> list4 = ((wr90) it9.next()).f;
                        int iA4 = jpu.a(l48.r(list4, i8));
                        Iterator it10 = it9;
                        if (iA4 < 16) {
                            iA4 = 16;
                        }
                        LinkedHashMap linkedHashMap6 = new LinkedHashMap(iA4);
                        for (Iterator it11 = list4.iterator(); it11.hasNext(); it11 = it11) {
                            xr90 xr90Var2 = (xr90) it11.next();
                            linkedHashMap6.put(xr90Var2.a, xr90Var2.c);
                        }
                        arrayList3.add(linkedHashMap6);
                        it9 = it10;
                        i8 = 10;
                    }
                    linkedHashMap5.put(str11, arrayList3);
                    it7 = it8;
                    bt90Var2 = bt90Var3;
                    i8 = 10;
                }
                bt90Var = bt90Var2;
                BigDecimal bigDecimalMultiply = BigDecimal.ONE;
                Iterator<T> it12 = list.iterator();
                while (it12.hasNext()) {
                    for (vq90 vq90Var2 : ((uq90) it12.next()).g) {
                        List list5 = (List) linkedHashMap5.get(vq90Var2.a);
                        if (list5 != null) {
                            Iterator it13 = list5.iterator();
                            while (it13.hasNext()) {
                                LinkedHashMap linkedHashMap7 = linkedHashMap5;
                                BigDecimal bigDecimal4 = (BigDecimal) ((Map) it13.next()).get(vq90Var2.c);
                                if (bigDecimal4 == null) {
                                    bigDecimal4 = BigDecimal.ZERO;
                                }
                                bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal4);
                                linkedHashMap5 = linkedHashMap7;
                            }
                        }
                        linkedHashMap5 = linkedHashMap5;
                    }
                }
                bigDecimalMultiply.getClass();
                strA = gky.a.a(bjb0.N(bigDecimalMultiply), false);
            }
            String str12 = strA;
            bigDecimal2 = BigDecimal.ZERO;
            str2 = "";
            if (bigDecimal.compareTo(bigDecimal2) > 0 || !z || cd3VarA == cd3.ONE_CUT) {
                strP = "";
            } else {
                strP = bjb0.P(p54.b(bigDecimal).toString(), Locale.US);
            }
            if (bigDecimal3.compareTo(bigDecimal2) > 0 || !z) {
                strP2 = "";
            } else {
                BigDecimal bigDecimalMultiply2 = bigDecimal3.multiply(heo.b);
                bigDecimalMultiply2.getClass();
                strP2 = bjb0.P(p54.b(bigDecimalMultiply2).toString(), Locale.US);
            }
            rr90 rr90Var = new rr90(resourceUiText2, strD, uiTextE, rs90Var, vr90Var, uiText, i7, strP3, resourceUiTextI, str12, strP, strP2);
            ArrayList arrayList4 = new ArrayList();
            ColoredUiText coloredUiText = new ColoredUiText(new ResourceUiText(R.string.app_common__simulate_vs), Integer.valueOf(R.color.text_inverse_secondary), null);
            iA = jpu.a(l48.r(list2, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            for (Object obj : list2) {
                linkedHashMap.put(((fr90) obj).b, obj);
            }
            iA2 = jpu.a(l48.r(list2, 10));
            if (iA2 < 16) {
                iA2 = 16;
            }
            linkedHashMap2 = new LinkedHashMap(iA2);
            it = list2.iterator();
            while (it.hasNext()) {
                fr90 fr90Var3 = (fr90) it.next();
                String str13 = fr90Var3.b;
                List<wr90> list6 = fr90Var3.n;
                arrayList = new ArrayList();
                for (wr90 wr90Var : list6) {
                    List<xr90> list7 = wr90Var.f;
                    Iterator it14 = it;
                    String str14 = str2;
                    arrayList2 = new ArrayList(l48.r(list7, 10));
                    for (it6 = list7.iterator(); it6.hasNext(); it6 = it6) {
                        xr90 xr90Var3 = (xr90) it6.next();
                        arrayList2.add(new Pair(xr90Var3.a, new Pair(wr90Var, xr90Var3)));
                    }
                    p48.w(arrayList2, arrayList);
                    it = it14;
                    str2 = str14;
                }
                linkedHashMap2.put(str13, kpu.k(arrayList));
                it = it;
            }
            str3 = str2;
            int iA5 = jpu.a(l48.r(list2, 10));
            linkedHashMap3 = new LinkedHashMap(iA5 >= 16 ? iA5 : 16);
            for (fr90 fr90Var4 : list2) {
                it4 = fr90Var4.n.iterator();
                do {
                    if (it4.hasNext()) {
                        str7 = null;
                        break;
                    }
                    it5 = ((wr90) it4.next()).f.iterator();
                    do {
                        if (it5.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it5.next();
                    } while (!((xr90) next2).d);
                    xr90Var = (xr90) next2;
                    if (xr90Var != null) {
                        str7 = xr90Var.b;
                    } else {
                        str7 = null;
                    }
                } while (str7 == null);
                if (str7 == null) {
                    str7 = str3;
                }
                linkedHashMap3.put(fr90Var4.b, str7);
            }
            it2 = rq90Var.l.iterator();
            while (it2.hasNext()) {
                uq90 uq90Var2 = (uq90) it2.next();
                List<vq90> list8 = uq90Var2.g;
                str4 = uq90Var2.b;
                it3 = list8.iterator();
                i3 = 0;
                while (it3.hasNext()) {
                    next = it3.next();
                    i4 = i3 + 1;
                    if (i3 >= 0) {
                        b.q();
                        throw null;
                    }
                    vq90Var = (vq90) next;
                    str5 = vq90Var.a;
                    str6 = vq90Var.c;
                    oq90 oq90Var = vq90Var.e;
                    Iterator it15 = it2;
                    fr90Var = (fr90) linkedHashMap.get(str5);
                    if (fr90Var == null) {
                        linkedHashMap4 = linkedHashMap;
                    } else {
                        linkedHashMap4 = linkedHashMap;
                        qeo qeoVarB = reo.b(fr90Var.m);
                        String strA2 = uf80.a(ux5.a(str4, "_", str5, "_", vq90Var.b), "_", str6);
                        map = (Map) linkedHashMap2.get(str5);
                        if (map == null && (pair = (Pair) map.get(str6)) != null) {
                            wr90 wr90Var2 = (wr90) pair.a;
                            xr90 xr90Var4 = (xr90) pair.b;
                            boolean z2 = xr90Var4.d;
                            if (oq90Var != null) {
                                int iOrdinal2 = oq90Var.ordinal();
                                if (iOrdinal2 == 0) {
                                    ms90Var2 = new ms90(ns90.a, new ResourceUiText(R.string.bet_history__1up_win_achieved));
                                } else {
                                    if (iOrdinal2 != 1) {
                                        uhc.a();
                                        return null;
                                    }
                                    ms90Var2 = new ms90(ns90.b, new ResourceUiText(R.string.bet_history__2up_win_achieved));
                                }
                                ms90Var = ms90Var2;
                            } else {
                                it3 = it3;
                                str4 = str4;
                                z2 = z2;
                                ms90Var = null;
                            }
                            oq90 oq90Var2 = oq90.ONE_X_TWO_ONE_UP;
                            if (oq90Var == oq90Var2) {
                                us90Var = new us90(new er90.b(R.drawable.ic__feature__match_status_1up), "simulation_ticket_detail_selection_result_hit_one_up_watermark_icon");
                            } else {
                                if (oq90Var == oq90.ONE_X_TWO_TWO_UP) {
                                    us90Var2 = new us90(new er90.b(R.drawable.ic__feature__match_status_2up), "simulation_ticket_detail_selection_result_hit_two_up_watermark_icon");
                                } else if (z2) {
                                    us90Var2 = new us90(new er90.a(), "simulation_ticket_detail_selection_result_hit_normal_watermark_icon");
                                } else {
                                    us90Var = null;
                                }
                                us90Var = us90Var2;
                            }
                            ConcatUiText concatUiTextH = new StringUiText(fr90Var.c).h(coloredUiText).h(new StringUiText(fr90Var.g));
                            ResourceUiText resourceUiText3 = new ResourceUiText(R.string.app_common__pick_value, ay0.S(new Object[]{xr90Var4.b, gky.a.a(bjb0.L(xr90Var4.c, Locale.US), false)}));
                            String str15 = wr90Var2.b;
                            String str16 = (String) linkedHashMap3.get(fr90Var.b);
                            String str17 = str16 == null ? str3 : str16;
                            ResourceUiText resourceUiText4 = new ResourceUiText(R.string.bet_history__bet_id_vid, ay0.S(new Object[]{str4}));
                            boolean z3 = i4 == uq90Var2.g.size();
                            if (oq90Var == oq90Var2) {
                                os90Var = new os90(R.drawable.ic__feature__match_status_1up, new ResourceUiText(R.string.bet_history__1up_early_payout), "simulation_settlement_selection_result_hit_one_up_icon");
                            } else if (oq90Var == oq90.ONE_X_TWO_TWO_UP) {
                                os90Var = new os90(R.drawable.ic__feature__match_status_2up, new ResourceUiText(R.string.bet_history__2up_early_payout), "simulation_settlement_selection_result_hit_two_up_icon");
                            } else {
                                os90Var = z2 ? new os90(R.drawable.ic__feature__match_status_won, new ResourceUiText(R.string.bet_history__won), "simulation_settlement_selection_result_hit_normal_icon") : new os90(R.drawable.ic__feature__match_status_lost, new ResourceUiText(R.string.bet_history__lost), "simulation_settlement_selection_result_miss_icon");
                            }
                            arrayList4.add(new br90(concatUiTextH, qeoVarB, resourceUiText3, str15, str17, us90Var, ms90Var, resourceUiText4, z3, strA2, os90Var, Intrinsics.g(str8, strA2), (z2 || oq90Var != null) ? R.color.bg_brand_sub_secondary_d_darker : R.color.border_primary));
                        }
                        i3 = i4;
                        linkedHashMap = linkedHashMap4;
                        it2 = it15;
                        linkedHashMap2 = linkedHashMap2;
                        it3 = it3;
                        str4 = str4;
                    }
                    it3 = it3;
                    str4 = str4;
                    i3 = i4;
                    linkedHashMap = linkedHashMap4;
                    it2 = it15;
                    linkedHashMap2 = linkedHashMap2;
                    it3 = it3;
                    str4 = str4;
                }
            }
            return new ts90(bt90Var, rr90Var, new cr90(a4h.b(arrayList4)), new hr90(str9), sloVar2);
        }
        uq90 uq90Var3 = (uq90) CollectionsKt.firstOrNull(list);
        tr90Var = uq90Var3 == null ? null : new tr90(new ResourceUiText(R.string.component_wap_share_bet__flex_your_bet_vmintowin_of_vsize, ay0.S(new Object[]{String.valueOf(rq90Var.o), String.valueOf(uq90Var3.g.size())})));
        vr90Var = tr90Var;
        if (z) {
            resourceUiText = new StringUiText(bjb0.P(p54.b(rq90Var.f).toString(), Locale.US));
        } else {
            resourceUiText = new ResourceUiText(R.string.app_common__zero_point_zero);
        }
        UiText uiText2 = resourceUiText;
        if (z) {
            i = R.color.bg_brand_sub_primary_d_lighter;
        } else {
            i = R.color.text_inverse_primary;
        }
        int i9 = i;
        String string2 = p54.b(rq90Var.e).toString();
        locale = Locale.US;
        String strP4 = bjb0.P(string2, locale);
        ResourceUiText resourceUiTextI2 = rqf0.i(rq90Var.j, rq90Var.i);
        if (cd3VarA == null) {
            i2 = -1;
        } else {
            i2 = sr90.a.a[cd3VarA.ordinal()];
        }
        int i10 = 10;
        if (i2 != 1) {
            bt90Var = bt90Var2;
            if (uq90Var != null) {
                bigDecimalB = p54.b(uq90Var.h);
            } else {
                bigDecimalB = null;
            }
            strA = gky.a.a(bjb0.P(String.valueOf(bigDecimalB), locale), false);
        } else {
            bt90Var = bt90Var2;
            if (uq90Var != null) {
                bigDecimalB = p54.b(uq90Var.h);
            } else {
                bigDecimalB = null;
            }
            strA = gky.a.a(bjb0.P(String.valueOf(bigDecimalB), locale), false);
        }
        String str18 = strA;
        bigDecimal2 = BigDecimal.ZERO;
        str2 = "";
        if (bigDecimal.compareTo(bigDecimal2) > 0) {
            strP = "";
        } else {
            strP = "";
        }
        if (bigDecimal3.compareTo(bigDecimal2) > 0) {
            strP2 = "";
        } else {
            strP2 = "";
        }
        rr90 rr90Var2 = new rr90(resourceUiText2, strD, uiTextE, rs90Var, vr90Var, uiText2, i9, strP4, resourceUiTextI2, str18, strP, strP2);
        ArrayList arrayList5 = new ArrayList();
        ColoredUiText coloredUiText2 = new ColoredUiText(new ResourceUiText(R.string.app_common__simulate_vs), Integer.valueOf(R.color.text_inverse_secondary), null);
        iA = jpu.a(l48.r(list2, 10));
        if (iA < 16) {
            iA = 16;
        }
        linkedHashMap = new LinkedHashMap(iA);
        while (r3.hasNext()) {
            linkedHashMap.put(((fr90) obj).b, obj);
        }
        iA2 = jpu.a(l48.r(list2, 10));
        if (iA2 < 16) {
            iA2 = 16;
        }
        linkedHashMap2 = new LinkedHashMap(iA2);
        it = list2.iterator();
        while (it.hasNext()) {
            fr90 fr90Var5 = (fr90) it.next();
            String str19 = fr90Var5.b;
            List<wr90> list9 = fr90Var5.n;
            arrayList = new ArrayList();
            while (r10.hasNext()) {
                List<xr90> list10 = wr90Var.f;
                Iterator it16 = it;
                String str110 = str2;
                arrayList2 = new ArrayList(l48.r(list10, 10));
                while (it6.hasNext()) {
                    xr90 xr90Var5 = (xr90) it6.next();
                    arrayList2.add(new Pair(xr90Var5.a, new Pair(wr90Var, xr90Var5)));
                }
                p48.w(arrayList2, arrayList);
                it = it16;
                str2 = str110;
            }
            linkedHashMap2.put(str19, kpu.k(arrayList));
            it = it;
        }
        str3 = str2;
        int iA6 = jpu.a(l48.r(list2, 10));
        linkedHashMap3 = new LinkedHashMap(iA6 >= 16 ? iA6 : 16);
        while (r4.hasNext()) {
            it4 = fr90Var4.n.iterator();
            do {
                if (it4.hasNext()) {
                    str7 = null;
                    break;
                }
                it5 = ((wr90) it4.next()).f.iterator();
                do {
                    if (it5.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it5.next();
                } while (!((xr90) next2).d);
                xr90Var = (xr90) next2;
                if (xr90Var != null) {
                    str7 = xr90Var.b;
                } else {
                    str7 = null;
                }
            } while (str7 == null);
            if (str7 == null) {
                str7 = str3;
            }
            linkedHashMap3.put(fr90Var4.b, str7);
        }
        it2 = rq90Var.l.iterator();
        while (it2.hasNext()) {
            uq90 uq90Var4 = (uq90) it2.next();
            List<vq90> list11 = uq90Var4.g;
            str4 = uq90Var4.b;
            it3 = list11.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                next = it3.next();
                i4 = i3 + 1;
                if (i3 >= 0) {
                    b.q();
                    throw null;
                }
                vq90Var = (vq90) next;
                str5 = vq90Var.a;
                str6 = vq90Var.c;
                oq90 oq90Var3 = vq90Var.e;
                Iterator it17 = it2;
                fr90Var = (fr90) linkedHashMap.get(str5);
                if (fr90Var == null) {
                    linkedHashMap4 = linkedHashMap;
                } else {
                    linkedHashMap4 = linkedHashMap;
                    qeo qeoVarB2 = reo.b(fr90Var.m);
                    String strA3 = uf80.a(ux5.a(str4, "_", str5, "_", vq90Var.b), "_", str6);
                    map = (Map) linkedHashMap2.get(str5);
                    if (map == null) {
                    }
                    i3 = i4;
                    linkedHashMap = linkedHashMap4;
                    it2 = it17;
                    linkedHashMap2 = linkedHashMap2;
                    it3 = it3;
                    str4 = str4;
                }
                it3 = it3;
                str4 = str4;
                i3 = i4;
                linkedHashMap = linkedHashMap4;
                it2 = it17;
                linkedHashMap2 = linkedHashMap2;
                it3 = it3;
                str4 = str4;
            }
        }
        return new ts90(bt90Var, rr90Var2, new cr90(a4h.b(arrayList5)), new hr90(str9), sloVar2);
    }
}
