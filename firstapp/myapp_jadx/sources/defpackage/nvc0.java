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
public final class nvc0 implements lyh<iv3> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ uvc0 b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltyBetslipSingleHandlerImpl$init$$inlined$combine$1", f = "SportyPenaltyBetslipSingleHandlerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return nvc0.this.collect(null, this);
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltyBetslipSingleHandlerImpl$init$$inlined$combine$1$3", f = "SportyPenaltyBetslipSingleHandlerImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super iv3>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ uvc0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, uvc0 uvc0Var) {
            super(3, v1bVar);
            this.d = uvc0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super iv3> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0162  */
        /* JADX WARN: Code duplicated, block: B:32:0x0164  */
        /* JADX WARN: Code duplicated, block: B:35:0x016c  */
        /* JADX WARN: Code duplicated, block: B:37:0x0171  */
        /* JADX WARN: Code duplicated, block: B:40:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:43:0x0206 A[LOOP:1: B:41:0x0200->B:43:0x0206, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:66:0x0269 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object[], myh] */
        /* JADX WARN: Type inference failed for: r14v14 */
        /* JADX WARN: Type inference failed for: r14v6 */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            BigDecimal bigDecimal;
            BigDecimal bigDecimal2;
            BigDecimal bigDecimal3;
            String str;
            zv3 zv3VarA;
            ?? r14;
            iv3 iv3Var;
            zrd0 zrd0Var;
            boolean z;
            ord0 ord0VarJ;
            BigDecimal bigDecimal4;
            boolean z2;
            String str2;
            asd0 asd0VarH;
            ResourceUiText resourceUiTextP;
            String str3;
            BigDecimal bigDecimal5;
            hyc0 hyc0Var;
            boolean z3;
            BigDecimal bigDecimal6;
            BigDecimal bigDecimal7;
            Iterator it;
            Object next;
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
                String str4 = (String) obj3;
                zrd0 zrd0Var2 = (zrd0) objArr[2];
                Object obj4 = objArr[3];
                obj4.getClass();
                i1d0 i1d0Var = (i1d0) obj4;
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
                uvc0 uvc0Var = cVar.d;
                nzm nzmVar = uvc0Var.e;
                if (list.isEmpty()) {
                    iv3Var = null;
                    r14 = 0;
                } else {
                    String strB = uvc0Var.d.B();
                    MyFavoriteStake stake = uvc0Var.c.getStake();
                    List listK = stake != null ? kotlin.collections.b.k(stake.getQuickAddStake1(), stake.getQuickAddStake2(), stake.getQuickAddStake3()) : null;
                    List<BigDecimal> listI = nzmVar.i();
                    String strJ = nzmVar.j();
                    strJ.getClass();
                    BigDecimal bigDecimal8 = new BigDecimal(strJ);
                    hvc0 hvc0Var = i1d0Var.a.c;
                    BigDecimal bigDecimal9 = hvc0Var.a;
                    BigDecimal bigDecimal10 = hvc0Var.b;
                    BigDecimal bigDecimal11 = hvc0Var.c;
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(assetsInfo.balance);
                    bigDecimalValueOf.getClass();
                    BigDecimal bigDecimalA = s5y.a(bigDecimalValueOf);
                    TaxConfig virtualTaxConfig = taxConfigs.getVirtualTaxConfig();
                    BigDecimal bigDecimalC = hn9.c(list);
                    BigDecimal bigDecimalH = hn9.h(list);
                    BigDecimal bigDecimalB = hn9.b(bigDecimal11, list);
                    BigDecimal bigDecimalG = hn9.g(bigDecimal11, list);
                    BigDecimal bigDecimalD = hn9.d(virtualTaxConfig, bigDecimalC, bigDecimalH, bigDecimalB, bigDecimalG);
                    BigDecimal tax = virtualTaxConfig.getTax(bigDecimalG, bigDecimalH);
                    BigDecimal bigDecimalE = hn9.e(bigDecimalH, m780Var);
                    BigDecimal exciseTax = virtualTaxConfig.getExciseTax(bigDecimalE);
                    exciseTax.getClass();
                    BigDecimal bigDecimalAdd = bigDecimalE.add(exciseTax);
                    bigDecimalAdd.getClass();
                    boolean z4 = list.size() == 1;
                    ArrayList arrayList = new ArrayList(l48.r(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        f4d0 f4d0Var = (f4d0) it2.next();
                        Iterator it3 = it2;
                        e1d0 e1d0Var = f4d0Var.a;
                        BigDecimal bigDecimal12 = bigDecimal8;
                        String str5 = e1d0Var.b.d;
                        hyc0 hyc0Var2 = e1d0Var.c;
                        String str6 = f4d0Var.b;
                        BigDecimal bigDecimal13 = exciseTax;
                        if (zrd0Var2 instanceof zrd0.b) {
                            zrd0Var = zrd0Var2;
                            if (Intrinsics.g(((zrd0.b) zrd0Var2).a, hyc0Var2.a)) {
                                z = true;
                            }
                            str6.getClass();
                            if (z4) {
                                ord0VarJ = null;
                            } else {
                                ord0VarJ = ht90.j(str6, str4, bigDecimal9, bigDecimal10, bigDecimalA);
                            }
                            bigDecimal4 = bigDecimalA;
                            if (ord0VarJ != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            str2 = str4;
                            asd0VarH = ht90.h(str6, bigDecimal9, true, z, z2);
                            resourceUiTextP = ht90.p(ord0VarJ);
                            str3 = hyc0Var2.a;
                            bigDecimal5 = hyc0Var2.b;
                            e1d0 e1d0Var2 = f4d0Var.a;
                            lwc0 lwc0Var = e1d0Var2.a;
                            hyc0Var = e1d0Var2.c;
                            z3 = z;
                            String str7 = lwc0Var.b.a;
                            StringUiText stringUiText = vch0.a;
                            StringUiText stringUiText2 = new StringUiText(str7);
                            Integer numValueOf = Integer.valueOf(R.color.text_primary);
                            bigDecimal6 = bigDecimal10;
                            bigDecimal7 = bigDecimal9;
                            it = kotlin.collections.b.k(new ColoredUiText(stringUiText2, numValueOf, null), new StringUiText(" "), new ColoredUiText(new ResourceUiText(R.string.bet_history__vs), Integer.valueOf(R.color.text_secondary), null), new StringUiText(" "), new ColoredUiText(new StringUiText(lwc0Var.c.a), numValueOf, null)).iterator();
                            if (it.hasNext()) {
                                zkh.a("Empty collection can't be reduced.");
                                return null;
                            }
                            next = it.next();
                            while (it.hasNext()) {
                                next = ((UiText) next).h((UiText) it.next());
                            }
                            String string = bigDecimal5.toString();
                            string.getClass();
                            gu3 gu3Var = new gu3((UiText) next, gky.a.a(string, false), hyc0Var.c);
                            zrd0.b bVar = new zrd0.b(hyc0Var2.a);
                            listI.getClass();
                            arrayList.add(new ov3(str3, R.color.transparent, null, null, gu3Var, str5, R.color.text_primary, bVar, asd0VarH, resourceUiTextP, z3, ht90.i(str6, listK, listI, bigDecimal12, bigDecimal7, bigDecimal6)));
                            bigDecimal10 = bigDecimal6;
                            bigDecimal9 = bigDecimal7;
                            bigDecimal8 = bigDecimal12;
                            it2 = it3;
                            exciseTax = bigDecimal13;
                            zrd0Var2 = zrd0Var;
                            bigDecimalA = bigDecimal4;
                            str4 = str2;
                        } else {
                            zrd0Var = zrd0Var2;
                        }
                        z = false;
                        str6.getClass();
                        if (z4) {
                            ord0VarJ = null;
                        } else {
                            ord0VarJ = ht90.j(str6, str4, bigDecimal9, bigDecimal10, bigDecimalA);
                        }
                        bigDecimal4 = bigDecimalA;
                        if (ord0VarJ != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        str2 = str4;
                        asd0VarH = ht90.h(str6, bigDecimal9, true, z, z2);
                        resourceUiTextP = ht90.p(ord0VarJ);
                        str3 = hyc0Var2.a;
                        bigDecimal5 = hyc0Var2.b;
                        e1d0 e1d0Var3 = f4d0Var.a;
                        lwc0 lwc0Var2 = e1d0Var3.a;
                        hyc0Var = e1d0Var3.c;
                        z3 = z;
                        String str8 = lwc0Var2.b.a;
                        StringUiText stringUiText3 = vch0.a;
                        StringUiText stringUiText4 = new StringUiText(str8);
                        Integer numValueOf2 = Integer.valueOf(R.color.text_primary);
                        bigDecimal6 = bigDecimal10;
                        bigDecimal7 = bigDecimal9;
                        it = kotlin.collections.b.k(new ColoredUiText(stringUiText4, numValueOf2, null), new StringUiText(" "), new ColoredUiText(new ResourceUiText(R.string.bet_history__vs), Integer.valueOf(R.color.text_secondary), null), new StringUiText(" "), new ColoredUiText(new StringUiText(lwc0Var2.c.a), numValueOf2, null)).iterator();
                        if (it.hasNext()) {
                            zkh.a("Empty collection can't be reduced.");
                            return null;
                        }
                        next = it.next();
                        while (it.hasNext()) {
                            next = ((UiText) next).h((UiText) it.next());
                        }
                        String string2 = bigDecimal5.toString();
                        string2.getClass();
                        gu3 gu3Var2 = new gu3((UiText) next, gky.a.a(string2, false), hyc0Var.c);
                        zrd0.b bVar2 = new zrd0.b(hyc0Var2.a);
                        listI.getClass();
                        arrayList.add(new ov3(str3, R.color.transparent, null, null, gu3Var2, str5, R.color.text_primary, bVar2, asd0VarH, resourceUiTextP, z3, ht90.i(str6, listK, listI, bigDecimal12, bigDecimal7, bigDecimal6)));
                        bigDecimal10 = bigDecimal6;
                        bigDecimal9 = bigDecimal7;
                        bigDecimal8 = bigDecimal12;
                        it2 = it3;
                        exciseTax = bigDecimal13;
                        zrd0Var2 = zrd0Var;
                        bigDecimalA = bigDecimal4;
                        str4 = str2;
                    }
                    BigDecimal bigDecimal14 = exciseTax;
                    BigDecimal bigDecimal15 = bigDecimalA;
                    String str9 = str4;
                    BigDecimal bigDecimal16 = bigDecimal8;
                    zrd0 zrd0Var3 = zrd0Var2;
                    BigDecimal bigDecimal17 = bigDecimal10;
                    BigDecimal bigDecimal18 = bigDecimal9;
                    qcn qcnVarB = a4h.b(arrayList);
                    ResourceUiText resourceUiTextK = ht90.k(bigDecimalH, bigDecimal17);
                    Object[] objArr2 = {Integer.valueOf(list.size())};
                    StringUiText stringUiText5 = vch0.a;
                    ResourceUiText resourceUiText = new ResourceUiText(R.string.component_betslip__stake_per_bet_vstakecount_bets, ay0.S(objArr2));
                    listI.getClass();
                    usd0 usd0VarI = ht90.i(str9, listK, listI, bigDecimal16, bigDecimal18, bigDecimal17);
                    if (z4) {
                        zv3VarA = ht90.c(str9, bigDecimalH, bigDecimalE, zrd0Var3, strB, bigDecimal18, bigDecimal17, bigDecimal15, resourceUiText, usd0VarI);
                        bigDecimal3 = bigDecimalE;
                        str = strB;
                        bigDecimal2 = bigDecimal15;
                        bigDecimal18 = bigDecimal18;
                        bigDecimal = bigDecimalH;
                    } else {
                        bigDecimal = bigDecimalH;
                        bigDecimal2 = bigDecimal15;
                        bigDecimal3 = bigDecimalE;
                        ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(((f4d0) it4.next()).b);
                        }
                        str = strB;
                        zv3VarA = ht90.a(arrayList2, str9, zrd0Var3, str, bigDecimalC, bigDecimal, bigDecimal18, bigDecimal17, bigDecimal2, resourceUiText, usd0VarI);
                    }
                    Locale locale = Locale.US;
                    String strL = bjb0.L(bigDecimal, locale);
                    String strR = ht90.r(virtualTaxConfig.hasRate(), bigDecimalB, bigDecimalG, bigDecimalD, tax);
                    String strL2 = !virtualTaxConfig.hasExciseTaxRate() ? null : bjb0.L(bigDecimal14, locale);
                    String strQ = ht90.q(bigDecimalB, bigDecimalG, bigDecimalD, tax);
                    dqk dqkVarE = ht90.e(list2, m780Var, bigDecimal, str);
                    sg10 sg10VarB = ht90.b(ht90.t(list, bigDecimal, bigDecimalAdd, bigDecimal18, bigDecimal17, bigDecimal2), bigDecimal3);
                    r14 = 0;
                    iv3Var = new iv3(qcnVarB, resourceUiTextK, zv3VarA, strL, strR, strL2, strQ, dqkVarE, sg10VarB, false, null);
                    cVar = this;
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

    public nvc0(lyh[] lyhVarArr, uvc0 uvc0Var) {
        this.a = lyhVarArr;
        this.b = uvc0Var;
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
