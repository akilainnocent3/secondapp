package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
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
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cbc0 implements lyh<iv3> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ jbc0 b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsBetslipSingleHandlerImpl$init$$inlined$combine$1", f = "SportyLegendsBetslipSingleHandlerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return cbc0.this.collect(null, this);
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsBetslipSingleHandlerImpl$init$$inlined$combine$1$3", f = "SportyLegendsBetslipSingleHandlerImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super iv3>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ jbc0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, jbc0 jbc0Var) {
            super(3, v1bVar);
            this.d = jbc0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super iv3> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object[], myh] */
        /* JADX WARN: Type inference failed for: r14v13 */
        /* JADX WARN: Type inference failed for: r14v8 */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            BigDecimal bigDecimal;
            String str;
            zv3 zv3VarA;
            BigDecimal bigDecimal2;
            BigDecimal bigDecimal3;
            ?? r14;
            iv3 iv3Var;
            c cVar = this;
            y5b y5bVar = y5b.a;
            int i = cVar.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = cVar.b;
                Object[] objArr = cVar.c;
                Object obj2 = objArr[0];
                obj2.getClass();
                List list = (List) obj2;
                Object obj3 = objArr[1];
                obj3.getClass();
                String str2 = (String) obj3;
                zrd0 zrd0Var = (zrd0) objArr[2];
                Object obj4 = objArr[3];
                obj4.getClass();
                pjc0 pjc0Var = (pjc0) obj4;
                Object obj5 = objArr[4];
                obj5.getClass();
                AssetsInfo assetsInfo = (AssetsInfo) obj5;
                Object obj6 = objArr[5];
                obj6.getClass();
                TaxConfigs taxConfigs = (TaxConfigs) obj6;
                Object obj7 = objArr[6];
                obj7.getClass();
                List list2 = (List) obj7;
                m780 m780Var = (m780) objArr[7];
                kk3 kk3Var = (kk3) objArr[8];
                jbc0 jbc0Var = cVar.d;
                nzm nzmVar = jbc0Var.e;
                if (list.isEmpty()) {
                    iv3Var = null;
                    r14 = 0;
                } else {
                    String strB = jbc0Var.d.B();
                    MyFavoriteStake stake = jbc0Var.c.getStake();
                    List listK = stake != null ? kotlin.collections.b.k(stake.getQuickAddStake1(), stake.getQuickAddStake2(), stake.getQuickAddStake3()) : null;
                    List<BigDecimal> listI = nzmVar.i();
                    String strJ = nzmVar.j();
                    strJ.getClass();
                    BigDecimal bigDecimal4 = new BigDecimal(strJ);
                    vac0 vac0Var = pjc0Var.a.c;
                    BigDecimal bigDecimal5 = vac0Var.a;
                    BigDecimal bigDecimal6 = vac0Var.b;
                    BigDecimal bigDecimal7 = vac0Var.c;
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(assetsInfo.balance);
                    bigDecimalValueOf.getClass();
                    BigDecimal bigDecimalA = s5y.a(bigDecimalValueOf);
                    TaxConfig virtualTaxConfig = taxConfigs.getVirtualTaxConfig();
                    BigDecimal bigDecimalC = hn9.c(list);
                    BigDecimal bigDecimalH = hn9.h(list);
                    BigDecimal bigDecimalB = hn9.b(bigDecimal7, list);
                    BigDecimal bigDecimalG = hn9.g(bigDecimal7, list);
                    BigDecimal bigDecimalD = hn9.d(virtualTaxConfig, bigDecimalC, bigDecimalH, bigDecimalB, bigDecimalG);
                    BigDecimal tax = virtualTaxConfig.getTax(bigDecimalG, bigDecimalH);
                    BigDecimal bigDecimalE = hn9.e(bigDecimalH, m780Var);
                    BigDecimal exciseTax = virtualTaxConfig.getExciseTax(bigDecimalE);
                    exciseTax.getClass();
                    BigDecimal bigDecimalAdd = bigDecimalE.add(exciseTax);
                    bigDecimalAdd.getClass();
                    boolean z = list.size() == 1;
                    ArrayList arrayList = new ArrayList(l48.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        dmc0 dmc0Var = (dmc0) it.next();
                        Iterator it2 = it;
                        kjc0 kjc0Var = dmc0Var.a;
                        BigDecimal bigDecimal8 = bigDecimal4;
                        String str3 = kjc0Var.b.d;
                        gfc0 gfc0Var = kjc0Var.c;
                        String str4 = gfc0Var.a;
                        BigDecimal bigDecimal9 = exciseTax;
                        String str5 = dmc0Var.b;
                        BigDecimal bigDecimal10 = tax;
                        boolean z2 = (zrd0Var instanceof zrd0.b) && Intrinsics.g(((zrd0.b) zrd0Var).a, str4);
                        str5.getClass();
                        ord0 ord0VarJ = z ? null : ht90.j(str5, str2, bigDecimal5, bigDecimal6, bigDecimalA);
                        BigDecimal bigDecimal11 = bigDecimalA;
                        String str6 = str2;
                        asd0 asd0VarH = ht90.h(str5, bigDecimal5, true, z2, ord0VarJ != null);
                        ResourceUiText resourceUiTextP = ht90.p(ord0VarJ);
                        BigDecimal bigDecimal12 = gfc0Var.b;
                        kjc0 kjc0Var2 = dmc0Var.a;
                        icc0 icc0Var = kjc0Var2.a;
                        gfc0 gfc0Var2 = kjc0Var2.c;
                        String str7 = icc0Var.b.a;
                        StringUiText stringUiText = vch0.a;
                        boolean z3 = z2;
                        StringUiText stringUiText2 = new StringUiText(str7);
                        Integer numValueOf = Integer.valueOf(R.color.text_primary);
                        BigDecimal bigDecimal13 = bigDecimal6;
                        BigDecimal bigDecimal14 = bigDecimal5;
                        Iterator it3 = kotlin.collections.b.k(new ColoredUiText(stringUiText2, numValueOf, null), new StringUiText(" "), new ColoredUiText(new ResourceUiText(R.string.bet_history__vs), Integer.valueOf(R.color.text_secondary), null), new StringUiText(" "), new ColoredUiText(new StringUiText(icc0Var.c.a), numValueOf, null)).iterator();
                        if (!it3.hasNext()) {
                            zkh.a("Empty collection can't be reduced.");
                            return null;
                        }
                        Object next = it3.next();
                        while (it3.hasNext()) {
                            next = ((UiText) next).h((UiText) it3.next());
                        }
                        String string = bigDecimal12.toString();
                        string.getClass();
                        au3 au3Var = new au3((UiText) next, gky.a.a(string, false), gfc0Var2.c);
                        zrd0.b bVar = new zrd0.b(str4);
                        listI.getClass();
                        bigDecimal5 = bigDecimal14;
                        arrayList.add(new ov3(str4, R.color.transparent, null, null, au3Var, str3, R.color.text_primary, bVar, asd0VarH, resourceUiTextP, z3, ht90.i(str5, listK, listI, bigDecimal8, bigDecimal14, bigDecimal13)));
                        bigDecimal6 = bigDecimal13;
                        bigDecimal4 = bigDecimal8;
                        it = it2;
                        exciseTax = bigDecimal9;
                        tax = bigDecimal10;
                        bigDecimalA = bigDecimal11;
                        str2 = str6;
                    }
                    BigDecimal bigDecimal15 = tax;
                    BigDecimal bigDecimal16 = bigDecimalA;
                    BigDecimal bigDecimal17 = exciseTax;
                    BigDecimal bigDecimal18 = bigDecimal6;
                    qcn qcnVarB = a4h.b(arrayList);
                    ResourceUiText resourceUiTextK = ht90.k(bigDecimalH, bigDecimal18);
                    Object[] objArr2 = {Integer.valueOf(list.size())};
                    StringUiText stringUiText3 = vch0.a;
                    ResourceUiText resourceUiText = new ResourceUiText(R.string.component_betslip__stake_per_bet_vstakecount_bets, ay0.S(objArr2));
                    listI.getClass();
                    BigDecimal bigDecimal19 = bigDecimal5;
                    usd0 usd0VarI = ht90.i(str2, listK, listI, bigDecimal4, bigDecimal19, bigDecimal18);
                    BigDecimal bigDecimal20 = bigDecimal19;
                    if (z) {
                        bigDecimal3 = bigDecimal16;
                        zv3VarA = ht90.c(str2, bigDecimalH, bigDecimalE, zrd0Var, strB, bigDecimal20, bigDecimal18, bigDecimal3, resourceUiText, usd0VarI);
                        bigDecimal = bigDecimalE;
                        bigDecimal2 = bigDecimalH;
                        str = strB;
                    } else {
                        String str8 = str2;
                        bigDecimal = bigDecimalE;
                        str = strB;
                        ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(((dmc0) it4.next()).b);
                        }
                        zv3VarA = ht90.a(arrayList2, str8, zrd0Var, str, bigDecimalC, bigDecimalH, bigDecimal20, bigDecimal18, bigDecimal16, resourceUiText, usd0VarI);
                        bigDecimal2 = bigDecimalH;
                        bigDecimal20 = bigDecimal20;
                        bigDecimal3 = bigDecimal16;
                    }
                    zv3 zv3Var = zv3VarA;
                    Locale locale = Locale.US;
                    iv3 iv3Var2 = new iv3(qcnVarB, resourceUiTextK, zv3Var, bjb0.L(bigDecimal2, locale), ht90.r(virtualTaxConfig.hasRate(), bigDecimalB, bigDecimalG, bigDecimalD, bigDecimal15), !virtualTaxConfig.hasExciseTaxRate() ? null : bjb0.L(bigDecimal17, locale), ht90.q(bigDecimalB, bigDecimalG, bigDecimalD, bigDecimal15), ht90.e(list2, m780Var, bigDecimal2, str), ht90.b(ht90.t(list, bigDecimal2, bigDecimalAdd, bigDecimal20, bigDecimal18, bigDecimal3), bigDecimal), false, kk3Var);
                    r14 = 0;
                    cVar = this;
                    iv3Var = iv3Var2;
                }
                cVar.b = r14;
                cVar.c = r14;
                cVar.a = 1;
                if (myhVar.emit(iv3Var, cVar) == y5bVar) {
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

    public cbc0(lyh[] lyhVarArr, jbc0 jbc0Var) {
        this.a = lyhVarArr;
        this.b = jbc0Var;
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
