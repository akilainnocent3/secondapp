package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.account.MyFavoriteStake;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class r070 implements lyh<vr3> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ a170 b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballBetslipMultipleHandlerImpl$init$$inlined$combine$1", f = "ScheduledFootballBetslipMultipleHandlerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return r070.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[this.a.length];
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballBetslipMultipleHandlerImpl$init$$inlined$combine$1$3", f = "ScheduledFootballBetslipMultipleHandlerImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super vr3>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ a170 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, a170 a170Var) {
            super(3, v1bVar);
            this.d = a170Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super vr3> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:109:0x03f2  */
        /* JADX WARN: Code duplicated, block: B:110:0x03f5 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:111:0x03f7  */
        /* JADX WARN: Code duplicated, block: B:112:0x03fa  */
        /* JADX WARN: Code duplicated, block: B:115:0x0401  */
        /* JADX WARN: Code duplicated, block: B:116:0x0404  */
        /* JADX WARN: Code duplicated, block: B:118:0x0408  */
        /* JADX WARN: Code duplicated, block: B:119:0x0413  */
        /* JADX WARN: Code duplicated, block: B:121:0x0417  */
        /* JADX WARN: Code duplicated, block: B:122:0x0432  */
        /* JADX WARN: Code duplicated, block: B:124:0x0436  */
        /* JADX WARN: Code duplicated, block: B:127:0x0464  */
        /* JADX WARN: Code duplicated, block: B:129:0x046b  */
        /* JADX WARN: Code duplicated, block: B:132:0x0486  */
        /* JADX WARN: Code duplicated, block: B:133:0x0491  */
        /* JADX WARN: Code duplicated, block: B:135:0x049b  */
        /* JADX WARN: Code duplicated, block: B:136:0x04ae  */
        /* JADX WARN: Code duplicated, block: B:139:0x04dd  */
        /* JADX WARN: Code duplicated, block: B:140:0x04e0  */
        /* JADX WARN: Code duplicated, block: B:143:0x04ff  */
        /* JADX WARN: Code duplicated, block: B:144:0x0502  */
        /* JADX WARN: Code duplicated, block: B:147:0x0510  */
        /* JADX WARN: Code duplicated, block: B:149:0x0521  */
        /* JADX WARN: Code duplicated, block: B:156:0x055a  */
        /* JADX WARN: Code duplicated, block: B:169:0x0596  */
        /* JADX WARN: Code duplicated, block: B:171:0x059a  */
        /* JADX WARN: Code duplicated, block: B:174:0x05a9 A[EDGE_INSN: B:174:0x05a9->B:182:0x05cc BREAK  A[LOOP:5: B:176:0x05b0->B:181:0x05c9]] */
        /* JADX WARN: Code duplicated, block: B:175:0x05ac  */
        /* JADX WARN: Code duplicated, block: B:178:0x05b6  */
        /* JADX WARN: Code duplicated, block: B:181:0x05c9 A[LOOP:5: B:176:0x05b0->B:181:0x05c9, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:188:0x05f1  */
        /* JADX WARN: Code duplicated, block: B:203:0x05a9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:204:0x05c6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x0348  */
        /* JADX WARN: Instruction removed from duplicated block: B:136:0x04ae, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:149:0x0521, please report this as an issue */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object[], myh] */
        /* JADX WARN: Type inference failed for: r2v31 */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ResourceUiText resourceUiText;
            int i;
            int i2;
            BigDecimal bigDecimal;
            BigDecimal bigDecimal2;
            Object obj2;
            Object bVar;
            asd0.a aVar;
            ResourceUiText resourceUiText2;
            String strL;
            boolean zHasRate;
            BigDecimal bigDecimal3;
            BigDecimal bigDecimal4;
            BigDecimal bigDecimal5;
            BigDecimal bigDecimal6;
            String strL2;
            String strL3;
            String strL4;
            String strL5;
            BigDecimal bigDecimalG;
            boolean z;
            boolean z2;
            sg10.a aVar2;
            Iterator it;
            long j;
            boolean z3;
            c cVar;
            ?? r2;
            vr3 vr3Var;
            List<BigDecimal> list;
            BigDecimal bigDecimalMultiply;
            Double d;
            xt3 xt3Var;
            ResourceUiText resourceUiText3;
            Locale locale = Locale.US;
            y5b y5bVar = y5b.a;
            int i3 = this.a;
            if (i3 == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                Object obj3 = objArr[0];
                obj3.getClass();
                List list2 = (List) obj3;
                Object obj4 = objArr[1];
                obj4.getClass();
                nmw nmwVar = (nmw) obj4;
                boolean z4 = nmwVar.d;
                Object obj5 = objArr[2];
                obj5.getClass();
                lmw lmwVar = (lmw) obj5;
                Object obj6 = objArr[3];
                obj6.getClass();
                String str = (String) obj6;
                zrd0 zrd0Var = (zrd0) objArr[4];
                Object obj7 = objArr[5];
                obj7.getClass();
                ni70 ni70Var = (ni70) obj7;
                Object obj8 = objArr[6];
                obj8.getClass();
                long jLongValue = ((Long) obj8).longValue();
                Object obj9 = objArr[7];
                obj9.getClass();
                AssetsInfo assetsInfo = (AssetsInfo) obj9;
                Object obj10 = objArr[8];
                obj10.getClass();
                TaxConfigs taxConfigs = (TaxConfigs) obj10;
                Object obj11 = objArr[9];
                obj11.getClass();
                List list3 = (List) obj11;
                m780 m780Var = (m780) objArr[10];
                a170 a170Var = this.d;
                nzm nzmVar = a170Var.e;
                if (z4) {
                    String strB = a170Var.d.B();
                    MyFavoriteStake stake = a170Var.c.getStake();
                    List listK = stake != null ? kotlin.collections.b.k(stake.getQuickAddStake1(), stake.getQuickAddStake2(), stake.getQuickAddStake3()) : null;
                    List<BigDecimal> listI = nzmVar.i();
                    String strJ = nzmVar.j();
                    strJ.getClass();
                    BigDecimal bigDecimal7 = new BigDecimal(strJ);
                    g070 g070Var = ni70Var.a.d;
                    BigDecimal bigDecimal8 = g070Var.a;
                    BigDecimal bigDecimal9 = g070Var.b;
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(assetsInfo.balance);
                    bigDecimalValueOf.getClass();
                    BigDecimal bigDecimalA = s5y.a(bigDecimalValueOf);
                    TaxConfig virtualTaxConfig = taxConfigs.getVirtualTaxConfig();
                    BigDecimal bigDecimal10 = lmwVar.d;
                    BigDecimal bigDecimal11 = lmwVar.e;
                    BigDecimal bigDecimal12 = lmwVar.b;
                    BigDecimal bigDecimal13 = lmwVar.c;
                    BigDecimal bigDecimal14 = lmwVar.i;
                    float f = lmwVar.l;
                    BigDecimal bigDecimal15 = lmwVar.j;
                    BigDecimal bigDecimal16 = lmwVar.k;
                    virtualTaxConfig.getClass();
                    bigDecimal10.getClass();
                    bigDecimal11.getClass();
                    bigDecimal15.getClass();
                    bigDecimal16.getClass();
                    BigDecimal tax = virtualTaxConfig.getTax(bigDecimal15, bigDecimal15.compareTo(bigDecimal16) == 0 ? bigDecimal11 : bigDecimal10);
                    BigDecimal tax2 = virtualTaxConfig.getTax(bigDecimal16, bigDecimal11);
                    BigDecimal bigDecimalA2 = rmw.a(bigDecimal11, m780Var);
                    BigDecimal exciseTax = virtualTaxConfig.getExciseTax(bigDecimalA2);
                    exciseTax.getClass();
                    BigDecimal bigDecimalAdd = bigDecimalA2.add(exciseTax);
                    bigDecimalAdd.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj12 : list2) {
                        BigDecimal bigDecimal17 = exciseTax;
                        BigDecimal bigDecimal18 = bigDecimal15;
                        String str2 = ((bi70) obj12).a;
                        Object objA = linkedHashMap.get(str2);
                        if (objA == null) {
                            objA = r9i.a(str2, linkedHashMap);
                        }
                        ((List) objA).add(obj12);
                        exciseTax = bigDecimal17;
                        bigDecimal15 = bigDecimal18;
                    }
                    BigDecimal bigDecimal19 = bigDecimal15;
                    BigDecimal bigDecimal20 = exciseTax;
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        List list4 = (List) ((Map.Entry) it2.next()).getValue();
                        Iterator it3 = it2;
                        BigDecimal bigDecimal21 = bigDecimal16;
                        BigDecimal bigDecimal22 = bigDecimalA2;
                        ArrayList arrayList2 = new ArrayList(l48.r(list4, 10));
                        Iterator it4 = list4.iterator();
                        int i4 = 0;
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            bi70 bi70Var = (bi70) next;
                            Iterator it5 = it4;
                            boolean zA = bi70Var.c.a(jLongValue);
                            int i6 = zA ? R.color.bg_danger_secondary : R.color.transparent;
                            if (i4 == 0) {
                                l770 l770Var = bi70Var.b;
                                String str3 = l770Var.c;
                                String str4 = l770Var.b;
                                StringUiText stringUiText = vch0.a;
                                Iterator it6 = kotlin.collections.b.k(new StringUiText(str4), new StringUiText(" - "), new ResourceUiText(R.string.page_instant_virtual__matchday_vnum, ay0.S(new Object[]{String.valueOf(bi70Var.c.c)}))).iterator();
                                if (!it6.hasNext()) {
                                    zkh.a("Empty collection can't be reduced.");
                                    return null;
                                }
                                Object next2 = it6.next();
                                while (it6.hasNext()) {
                                    next2 = ((UiText) next2).h((UiText) it6.next());
                                }
                                xt3Var = new xt3((UiText) next2, str3);
                            } else {
                                xt3Var = null;
                            }
                            if (zA) {
                                StringUiText stringUiText2 = vch0.a;
                                resourceUiText3 = new ResourceUiText(R.string.page_instant_virtual__bet_closed);
                            } else {
                                resourceUiText3 = null;
                            }
                            arrayList2.add(new as3(bi70Var.f.a, i6, xt3Var, resourceUiText3, m170.a(bi70Var, zA), bi70Var.e.c));
                            it4 = it5;
                            i4 = i5;
                            jLongValue = jLongValue;
                            listI = listI;
                        }
                        p48.w(arrayList2, arrayList);
                        bigDecimalA2 = bigDecimal22;
                        it2 = it3;
                        bigDecimal16 = bigDecimal21;
                    }
                    BigDecimal bigDecimal23 = bigDecimal16;
                    long j2 = jLongValue;
                    List<BigDecimal> list5 = listI;
                    BigDecimal bigDecimal24 = bigDecimalA2;
                    qcn qcnVarB = a4h.b(arrayList);
                    if (bigDecimal11.compareTo(bigDecimal9) <= 0) {
                        resourceUiText = null;
                    } else {
                        Object[] objArr2 = {bjb0.Y(bigDecimal9)};
                        StringUiText stringUiText3 = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.component_betslip__total_stake_cannot_exceed_vmaxstake, ay0.S(objArr2));
                    }
                    StringUiText stringUiText4 = vch0.a;
                    lr4 lr4Var = new lr4(new ResourceUiText(R.string.component_betslip__add_more_qualifying_selection_to_boost_your_bonus), f);
                    long j3 = lmwVar.a;
                    ResourceUiText resourceUiText4 = j3 <= 1 ? new ResourceUiText(R.string.common_functions__total_stake) : new ResourceUiText(R.string.component_betslip__stake_per_bet_vstakecount_bets, ay0.S(new Object[]{Long.valueOf(j3)}));
                    list5.getClass();
                    BigDecimal bigDecimalG2 = kotlin.text.b.g(kotlin.text.c.p(str, ",", "", false));
                    if (bigDecimalG2 == null) {
                        i = 0;
                        i2 = 3;
                    } else {
                        boolean z5 = bigDecimalG2.compareTo(bigDecimal8) >= 0 && bigDecimalG2.compareTo(bigDecimal9) <= 0;
                        boolean z6 = bigDecimalG2.compareTo(bigDecimal7) != 0;
                        if (z5 && z6) {
                            i2 = 1;
                            i = 0;
                        } else {
                            i = 0;
                            i2 = 3;
                        }
                    }
                    List listK2 = kotlin.collections.b.k(Integer.valueOf(i), 1, 2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it7 = listK2.iterator();
                    while (it7.hasNext()) {
                        int iIntValue = ((Number) it7.next()).intValue();
                        if (listK == null || (d = (Double) CollectionsKt.V(iIntValue, listK)) == null) {
                            list = list5;
                            BigDecimal bigDecimal25 = (BigDecimal) CollectionsKt.V(iIntValue, list);
                            bigDecimalMultiply = bigDecimal25 != null ? bigDecimal25.multiply(heo.a) : null;
                        } else {
                            bigDecimalMultiply = new BigDecimal(String.valueOf(d.doubleValue()));
                            list = list5;
                        }
                        if (bigDecimalMultiply != null) {
                            arrayList3.add(bigDecimalMultiply);
                        }
                        list5 = list;
                    }
                    usd0 usd0Var = new usd0(3, i2, arrayList3);
                    strB.getClass();
                    boolean z7 = zrd0Var instanceof zrd0.a;
                    if (bigDecimal10.compareTo(bigDecimal8) < 0) {
                        bVar = new ord0.c(bigDecimal8);
                    } else {
                        if (bigDecimal10.compareTo(bigDecimal9) > 0) {
                            bVar = new ord0.b(bigDecimal9);
                        } else {
                            bigDecimal = bigDecimal24;
                            bigDecimal2 = bigDecimalA;
                            obj2 = bigDecimal.compareTo(bigDecimal2) > 0 ? ord0.a.a : null;
                        }
                        String string = bigDecimal8.toString();
                        string.getClass();
                        if (obj2 != null) {
                            aVar = asd0.a.f;
                        } else if (z7) {
                            aVar = asd0.a.e;
                        } else {
                            aVar = asd0.a.d;
                        }
                        asd0 asd0Var = new asd0(string, str, aVar);
                        if (obj2 == null) {
                            resourceUiText2 = null;
                        } else if (obj2 instanceof ord0.a) {
                            resourceUiText2 = new ResourceUiText(R.string.page_instant_virtual__less_balanc);
                        } else if (obj2 instanceof ord0.c) {
                            resourceUiText2 = new ResourceUiText(R.string.component_betslip__please_enter_a_value_no_less_than_vmount, ay0.S(new Object[]{bjb0.Y(((ord0.c) obj2).a)}));
                        } else {
                            if (obj2 instanceof ord0.b) {
                                uhc.a();
                                return null;
                            }
                            resourceUiText2 = new ResourceUiText(R.string.component_betslip__total_stake_cannot_exceed_vmaxstake, ay0.S(new Object[]{bjb0.Y(((ord0.b) obj2).a)}));
                        }
                        zv3 zv3Var = new zv3(resourceUiText4, strB, zrd0.a.a, asd0Var, resourceUiText2, z7, usd0Var);
                        if (bigDecimal11.compareTo(bigDecimal10) <= 0) {
                            strL = null;
                        } else {
                            strL = bjb0.L(bigDecimal11, Locale.US);
                        }
                        String strB2 = omw.b(bigDecimal12, bigDecimal13);
                        zHasRate = virtualTaxConfig.hasRate();
                        tax.getClass();
                        tax2.getClass();
                        if (zHasRate) {
                            bigDecimal3 = bigDecimal19;
                            bigDecimal4 = bigDecimal23;
                            if (bigDecimal3.compareTo(bigDecimal4) >= 0) {
                                bigDecimal5 = tax;
                                strL2 = bjb0.L(bigDecimal5.multiply(heo.b), Locale.US);
                                bigDecimal6 = tax2;
                            } else {
                                bigDecimal5 = tax;
                                BigDecimal bigDecimal26 = heo.b;
                                BigDecimal bigDecimalMultiply2 = bigDecimal5.multiply(bigDecimal26);
                                bigDecimal6 = tax2;
                                BigDecimal bigDecimalMultiply3 = bigDecimal6.multiply(bigDecimal26);
                                Locale locale2 = Locale.US;
                                strL2 = bjb0.L(bigDecimalMultiply2, locale2) + " ~ " + bjb0.L(bigDecimalMultiply3, locale2);
                            }
                        } else {
                            strL2 = null;
                            bigDecimal5 = tax;
                            bigDecimal6 = tax2;
                            bigDecimal3 = bigDecimal19;
                            bigDecimal4 = bigDecimal23;
                        }
                        if (virtualTaxConfig.hasExciseTaxRate()) {
                            strL3 = bjb0.L(bigDecimal20, Locale.US);
                        } else {
                            strL3 = null;
                        }
                        bigDecimal14.getClass();
                        if (bigDecimal14.setScale(2, RoundingMode.HALF_UP).compareTo(BigDecimal.ZERO) <= 0) {
                            strL4 = null;
                        } else {
                            strL4 = bjb0.L(bigDecimal14, Locale.US);
                        }
                        if (bigDecimal3.compareTo(bigDecimal4) >= 0) {
                            strL5 = bjb0.L(bigDecimal3.subtract(bigDecimal5), Locale.US);
                        } else {
                            BigDecimal bigDecimalSubtract = bigDecimal3.subtract(bigDecimal5);
                            BigDecimal bigDecimalSubtract2 = bigDecimal4.subtract(bigDecimal6);
                            Locale locale3 = Locale.US;
                            strL5 = bjb0.L(bigDecimalSubtract, locale3) + " ~ " + bjb0.L(bigDecimalSubtract2, locale3);
                        }
                        String str5 = strL5;
                        dqk dqkVarA = omw.a(list3, m780Var, bigDecimal11, strB);
                        bigDecimalG = kotlin.text.b.g(nmwVar.b);
                        if (bigDecimalG != null || bigDecimalG.compareTo(bigDecimal8) < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = (z4 || !z) && bigDecimal11.compareTo(bigDecimal9) <= 0 && bigDecimalAdd.compareTo(bigDecimal2) <= 0;
                        ResourceUiText resourceUiText5 = new ResourceUiText(R.string.component_betslip__place_bet);
                        ResourceUiText resourceUiText6 = new ResourceUiText(R.string.component_betslip__about_to_pay_vamount, ay0.S(new Object[]{bjb0.L(bigDecimal, locale)}));
                        if (z2) {
                            aVar2 = sg10.a.d;
                        } else {
                            aVar2 = sg10.a.c;
                        }
                        sg10 sg10Var = new sg10(resourceUiText5, null, resourceUiText6, "betslip_pay_amount_text", aVar2);
                        if (list2.isEmpty()) {
                            z3 = false;
                            break;
                        }
                        it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z3 = false;
                                break;
                            }
                            j = j2;
                            if (((bi70) it.next()).c.a(j)) {
                                z3 = true;
                                break;
                            }
                            j2 = j;
                        }
                        vr3 vr3Var2 = new vr3(qcnVarB, resourceUiText, lr4Var, zv3Var, strL, strB2, strL2, strL3, strL4, str5, dqkVarA, sg10Var, z3);
                        cVar = this;
                        r2 = 0;
                        vr3Var = vr3Var2;
                    }
                    obj2 = bVar;
                    bigDecimal = bigDecimal24;
                    bigDecimal2 = bigDecimalA;
                    String string2 = bigDecimal8.toString();
                    string2.getClass();
                    if (obj2 != null) {
                        aVar = asd0.a.f;
                    } else if (z7) {
                        aVar = asd0.a.e;
                    } else {
                        aVar = asd0.a.d;
                    }
                    asd0 asd0Var2 = new asd0(string2, str, aVar);
                    if (obj2 == null) {
                        resourceUiText2 = null;
                    } else if (obj2 instanceof ord0.a) {
                        resourceUiText2 = new ResourceUiText(R.string.page_instant_virtual__less_balanc);
                    } else if (obj2 instanceof ord0.c) {
                        resourceUiText2 = new ResourceUiText(R.string.component_betslip__please_enter_a_value_no_less_than_vmount, ay0.S(new Object[]{bjb0.Y(((ord0.c) obj2).a)}));
                    } else {
                        if (obj2 instanceof ord0.b) {
                            uhc.a();
                            return null;
                        }
                        resourceUiText2 = new ResourceUiText(R.string.component_betslip__total_stake_cannot_exceed_vmaxstake, ay0.S(new Object[]{bjb0.Y(((ord0.b) obj2).a)}));
                    }
                    zv3 zv3Var2 = new zv3(resourceUiText4, strB, zrd0.a.a, asd0Var2, resourceUiText2, z7, usd0Var);
                    if (bigDecimal11.compareTo(bigDecimal10) <= 0) {
                        strL = null;
                    } else {
                        strL = bjb0.L(bigDecimal11, Locale.US);
                    }
                    String strB3 = omw.b(bigDecimal12, bigDecimal13);
                    zHasRate = virtualTaxConfig.hasRate();
                    tax.getClass();
                    tax2.getClass();
                    if (zHasRate) {
                        strL2 = null;
                        bigDecimal5 = tax;
                        bigDecimal6 = tax2;
                        bigDecimal3 = bigDecimal19;
                        bigDecimal4 = bigDecimal23;
                    } else {
                        bigDecimal3 = bigDecimal19;
                        bigDecimal4 = bigDecimal23;
                        if (bigDecimal3.compareTo(bigDecimal4) >= 0) {
                            bigDecimal5 = tax;
                            strL2 = bjb0.L(bigDecimal5.multiply(heo.b), Locale.US);
                            bigDecimal6 = tax2;
                        } else {
                            bigDecimal5 = tax;
                            BigDecimal bigDecimal27 = heo.b;
                            BigDecimal bigDecimalMultiply4 = bigDecimal5.multiply(bigDecimal27);
                            bigDecimal6 = tax2;
                            BigDecimal bigDecimalMultiply5 = bigDecimal6.multiply(bigDecimal27);
                            Locale locale4 = Locale.US;
                            strL2 = bjb0.L(bigDecimalMultiply4, locale4) + " ~ " + bjb0.L(bigDecimalMultiply5, locale4);
                        }
                    }
                    if (virtualTaxConfig.hasExciseTaxRate()) {
                        strL3 = null;
                    } else {
                        strL3 = bjb0.L(bigDecimal20, Locale.US);
                    }
                    bigDecimal14.getClass();
                    if (bigDecimal14.setScale(2, RoundingMode.HALF_UP).compareTo(BigDecimal.ZERO) <= 0) {
                        strL4 = null;
                    } else {
                        strL4 = bjb0.L(bigDecimal14, Locale.US);
                    }
                    if (bigDecimal3.compareTo(bigDecimal4) >= 0) {
                        strL5 = bjb0.L(bigDecimal3.subtract(bigDecimal5), Locale.US);
                    } else {
                        BigDecimal bigDecimalSubtract3 = bigDecimal3.subtract(bigDecimal5);
                        BigDecimal bigDecimalSubtract4 = bigDecimal4.subtract(bigDecimal6);
                        Locale locale5 = Locale.US;
                        strL5 = bjb0.L(bigDecimalSubtract3, locale5) + " ~ " + bjb0.L(bigDecimalSubtract4, locale5);
                    }
                    String str6 = strL5;
                    dqk dqkVarA2 = omw.a(list3, m780Var, bigDecimal11, strB);
                    bigDecimalG = kotlin.text.b.g(nmwVar.b);
                    if (bigDecimalG != null) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (z4) {
                    }
                    ResourceUiText resourceUiText7 = new ResourceUiText(R.string.component_betslip__place_bet);
                    ResourceUiText resourceUiText8 = new ResourceUiText(R.string.component_betslip__about_to_pay_vamount, ay0.S(new Object[]{bjb0.L(bigDecimal, locale)}));
                    if (z2) {
                        aVar2 = sg10.a.d;
                    } else {
                        aVar2 = sg10.a.c;
                    }
                    sg10 sg10Var2 = new sg10(resourceUiText7, null, resourceUiText8, "betslip_pay_amount_text", aVar2);
                    if (list2.isEmpty()) {
                        z3 = false;
                        break;
                    }
                    it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z3 = false;
                            break;
                        }
                        j = j2;
                        if (((bi70) it.next()).c.a(j)) {
                            z3 = true;
                            break;
                        }
                        j2 = j;
                    }
                    vr3 vr3Var3 = new vr3(qcnVarB, resourceUiText, lr4Var, zv3Var2, strL, strB3, strL2, strL3, strL4, str6, dqkVarA2, sg10Var2, z3);
                    cVar = this;
                    r2 = 0;
                    vr3Var = vr3Var3;
                } else {
                    cVar = this;
                    y5bVar = y5bVar;
                    vr3Var = null;
                    r2 = 0;
                }
                cVar.b = r2;
                cVar.c = r2;
                cVar.a = 1;
                Object objEmit = myhVar.emit(vr3Var, cVar);
                y5b y5bVar2 = y5bVar;
                if (objEmit == y5bVar2) {
                    return y5bVar2;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public r070(lyh[] lyhVarArr, a170 a170Var) {
        this.a = lyhVarArr;
        this.b = a170Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super vr3> myhVar, v1b v1bVar) {
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
            c cVar = new c(null, this.b);
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
