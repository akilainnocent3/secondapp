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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b170 implements lyh<iv3> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ k170 b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballBetslipSingleHandlerImpl$init$$inlined$combine$1", f = "ScheduledFootballBetslipSingleHandlerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return b170.this.collect(null, this);
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballBetslipSingleHandlerImpl$init$$inlined$combine$1$3", f = "ScheduledFootballBetslipSingleHandlerImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super iv3>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ k170 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, k170 k170Var) {
            super(3, v1bVar);
            this.d = k170Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super iv3> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object[], myh] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            BigDecimal bigDecimal;
            String str;
            BigDecimal bigDecimal2;
            BigDecimal bigDecimal3;
            zv3 zv3Var;
            boolean z;
            c cVar;
            ?? r2;
            iv3 iv3Var;
            xt3 xt3Var;
            ResourceUiText resourceUiText;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                Object obj2 = objArr[0];
                obj2.getClass();
                List list = (List) obj2;
                Object obj3 = objArr[1];
                obj3.getClass();
                ft90 ft90Var = (ft90) obj3;
                Object obj4 = objArr[2];
                obj4.getClass();
                et90 et90Var = (et90) obj4;
                Object obj5 = objArr[3];
                obj5.getClass();
                String str2 = (String) obj5;
                zrd0 zrd0Var = (zrd0) objArr[4];
                Object obj6 = objArr[5];
                obj6.getClass();
                ni70 ni70Var = (ni70) obj6;
                Object obj7 = objArr[6];
                obj7.getClass();
                long jLongValue = ((Long) obj7).longValue();
                Object obj8 = objArr[7];
                obj8.getClass();
                AssetsInfo assetsInfo = (AssetsInfo) obj8;
                Object obj9 = objArr[8];
                obj9.getClass();
                TaxConfigs taxConfigs = (TaxConfigs) obj9;
                Object obj10 = objArr[9];
                obj10.getClass();
                List list2 = (List) obj10;
                m780 m780Var = (m780) objArr[10];
                k170 k170Var = this.d;
                nzm nzmVar = k170Var.e;
                boolean z2 = ft90Var.c;
                Map<String, String> map = ft90Var.b;
                if (z2) {
                    String strB = k170Var.d.B();
                    MyFavoriteStake stake = k170Var.c.getStake();
                    List listK = stake != null ? kotlin.collections.b.k(stake.getQuickAddStake1(), stake.getQuickAddStake2(), stake.getQuickAddStake3()) : null;
                    List<BigDecimal> listI = nzmVar.i();
                    String strJ = nzmVar.j();
                    strJ.getClass();
                    BigDecimal bigDecimal4 = new BigDecimal(strJ);
                    g070 g070Var = ni70Var.a.d;
                    BigDecimal bigDecimal5 = g070Var.a;
                    BigDecimal bigDecimal6 = g070Var.b;
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(assetsInfo.balance);
                    bigDecimalValueOf.getClass();
                    BigDecimal bigDecimalA = s5y.a(bigDecimalValueOf);
                    TaxConfig virtualTaxConfig = taxConfigs.getVirtualTaxConfig();
                    BigDecimal bigDecimal7 = et90Var.d;
                    BigDecimal bigDecimal8 = et90Var.e;
                    BigDecimal bigDecimal9 = et90Var.f;
                    BigDecimal bigDecimal10 = et90Var.g;
                    BigDecimal bigDecimalD = hn9.d(virtualTaxConfig, bigDecimal7, bigDecimal8, bigDecimal9, bigDecimal10);
                    BigDecimal tax = virtualTaxConfig.getTax(bigDecimal10, bigDecimal8);
                    BigDecimal bigDecimalE = hn9.e(bigDecimal8, m780Var);
                    BigDecimal exciseTax = virtualTaxConfig.getExciseTax(bigDecimalE);
                    exciseTax.getClass();
                    BigDecimal bigDecimalAdd = bigDecimalE.add(exciseTax);
                    bigDecimalAdd.getClass();
                    boolean z3 = ft90Var.e;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj11 : list) {
                        ft90 ft90Var2 = ft90Var;
                        TaxConfig taxConfig = virtualTaxConfig;
                        String str3 = ((bi70) obj11).a;
                        Object objA = linkedHashMap.get(str3);
                        if (objA == null) {
                            objA = r9i.a(str3, linkedHashMap);
                        }
                        ((List) objA).add(obj11);
                        ft90Var = ft90Var2;
                        virtualTaxConfig = taxConfig;
                    }
                    ft90 ft90Var3 = ft90Var;
                    TaxConfig taxConfig2 = virtualTaxConfig;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        List list3 = (List) ((Map.Entry) it.next()).getValue();
                        Iterator it2 = it;
                        BigDecimal bigDecimal11 = tax;
                        BigDecimal bigDecimal12 = exciseTax;
                        ArrayList arrayList2 = new ArrayList(l48.r(list3, 10));
                        Iterator it3 = list3.iterator();
                        int i2 = 0;
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            bi70 bi70Var = (bi70) next;
                            Iterator it4 = it3;
                            ad70 ad70Var = bi70Var.f;
                            int i4 = i2;
                            e970 e970Var = bi70Var.c;
                            String str4 = ad70Var.a;
                            String str5 = map.get(str4);
                            if (str5 == null) {
                                str5 = "";
                            }
                            Map<String, String> map2 = map;
                            BigDecimal bigDecimal13 = bigDecimal10;
                            String str6 = str5;
                            boolean zA = e970Var.a(jLongValue);
                            int i5 = zA ? R.color.bg_danger_secondary : R.color.transparent;
                            if (i4 == 0) {
                                l770 l770Var = bi70Var.b;
                                String str7 = l770Var.c;
                                String str8 = l770Var.b;
                                StringUiText stringUiText = vch0.a;
                                Iterator it5 = kotlin.collections.b.k(new StringUiText(str8), new StringUiText(" - "), new ResourceUiText(R.string.page_instant_virtual__matchday_vnum, ay0.S(new Object[]{String.valueOf(e970Var.c)}))).iterator();
                                if (!it5.hasNext()) {
                                    zkh.a("Empty collection can't be reduced.");
                                    return null;
                                }
                                Object next2 = it5.next();
                                while (it5.hasNext()) {
                                    next2 = ((UiText) next2).h((UiText) it5.next());
                                }
                                xt3Var = new xt3((UiText) next2, str7);
                            } else {
                                xt3Var = null;
                            }
                            if (zA) {
                                StringUiText stringUiText2 = vch0.a;
                                resourceUiText = new ResourceUiText(R.string.page_instant_virtual__bet_closed);
                            } else {
                                resourceUiText = null;
                            }
                            ru3 ru3VarA = m170.a(bi70Var, zA);
                            int i6 = zA ? R.color.text_disabled_action : R.color.text_primary;
                            boolean z4 = (zrd0Var instanceof zrd0.b) && Intrinsics.g(((zrd0.b) zrd0Var).a, str4);
                            ord0 ord0VarJ = z3 ? null : ht90.j(str6, str2, bigDecimal5, bigDecimal6, bigDecimalA);
                            asd0 asd0VarH = ht90.h(str6, bigDecimal5, !zA, z4, ord0VarJ != null);
                            ResourceUiText resourceUiTextP = ht90.p(ord0VarJ);
                            String str9 = bi70Var.e.c;
                            zrd0.b bVar = new zrd0.b(str4);
                            listI.getClass();
                            arrayList2.add(new ov3(str4, i5, xt3Var, resourceUiText, ru3VarA, str9, i6, bVar, asd0VarH, resourceUiTextP, z4, ht90.i(str6, listK, listI, bigDecimal4, bigDecimal5, bigDecimal6)));
                            it3 = it4;
                            i2 = i3;
                            map = map2;
                            bigDecimal10 = bigDecimal13;
                            jLongValue = jLongValue;
                            bigDecimalD = bigDecimalD;
                        }
                        p48.w(arrayList2, arrayList);
                        it = it2;
                        exciseTax = bigDecimal12;
                        tax = bigDecimal11;
                    }
                    BigDecimal bigDecimal14 = tax;
                    Map<String, String> map3 = map;
                    BigDecimal bigDecimal15 = exciseTax;
                    long j = jLongValue;
                    BigDecimal bigDecimal16 = bigDecimal10;
                    BigDecimal bigDecimal17 = bigDecimalD;
                    qcn qcnVarB = a4h.b(arrayList);
                    ResourceUiText resourceUiTextK = ht90.k(bigDecimal8, bigDecimal6);
                    Object[] objArr2 = {Long.valueOf(et90Var.a)};
                    StringUiText stringUiText3 = vch0.a;
                    ResourceUiText resourceUiText2 = new ResourceUiText(R.string.component_betslip__stake_per_bet_vstakecount_bets, ay0.S(objArr2));
                    listI.getClass();
                    usd0 usd0VarI = ht90.i(str2, listK, listI, bigDecimal4, bigDecimal5, bigDecimal6);
                    if (z3) {
                        zv3 zv3VarC = ht90.c(str2, bigDecimal8, bigDecimalE, zrd0Var, strB, bigDecimal5, bigDecimal6, bigDecimalA, resourceUiText2, usd0VarI);
                        bigDecimal = bigDecimalE;
                        str = strB;
                        bigDecimal2 = bigDecimalA;
                        zv3Var = zv3VarC;
                        bigDecimal3 = bigDecimal8;
                    } else {
                        bigDecimal = bigDecimalE;
                        zv3 zv3VarA = ht90.a(CollectionsKt.A0(map3.values()), str2, zrd0Var, strB, bigDecimal7, bigDecimal8, bigDecimal5, bigDecimal6, bigDecimalA, resourceUiText2, usd0VarI);
                        str = strB;
                        bigDecimal2 = bigDecimalA;
                        bigDecimal3 = bigDecimal8;
                        zv3Var = zv3VarA;
                    }
                    Locale locale = Locale.US;
                    String strL = bjb0.L(bigDecimal3, locale);
                    String strR = ht90.r(taxConfig2.hasRate(), bigDecimal9, bigDecimal16, bigDecimal17, bigDecimal14);
                    String strL2 = !taxConfig2.hasExciseTaxRate() ? null : bjb0.L(bigDecimal15, locale);
                    String strQ = ht90.q(bigDecimal9, bigDecimal16, bigDecimal17, bigDecimal14);
                    dqk dqkVarE = ht90.e(list2, m780Var, bigDecimal3, str);
                    sg10 sg10VarB = ht90.b(ht90.s(ft90Var3, bigDecimal3, bigDecimalAdd, bigDecimal5, bigDecimal6, bigDecimal2), bigDecimal);
                    if (list.isEmpty()) {
                        z = false;
                        break;
                    }
                    Iterator it6 = list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z = false;
                            break;
                        }
                        long j2 = j;
                        if (((bi70) it6.next()).c.a(j2)) {
                            z = true;
                            break;
                        }
                        j = j2;
                    }
                    cVar = this;
                    r2 = 0;
                    iv3Var = new iv3(qcnVarB, resourceUiTextK, zv3Var, strL, strR, strL2, strQ, dqkVarE, sg10VarB, z, null);
                } else {
                    y5bVar = y5bVar;
                    r2 = 0;
                    cVar = this;
                    iv3Var = null;
                }
                cVar.b = r2;
                cVar.c = r2;
                cVar.a = 1;
                Object objEmit = myhVar.emit(iv3Var, cVar);
                y5b y5bVar2 = y5bVar;
                if (objEmit == y5bVar2) {
                    return y5bVar2;
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

    public b170(lyh[] lyhVarArr, k170 k170Var) {
        this.a = lyhVarArr;
        this.b = k170Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super iv3> myhVar, v1b v1bVar) {
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
