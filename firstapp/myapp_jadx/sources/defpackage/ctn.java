package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ctn implements lyh<iv3> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ jtn b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingBetslipSingleHandlerImpl$init$$inlined$combine$1", f = "InstantRacingBetslipSingleHandlerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return ctn.this.collect(null, this);
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingBetslipSingleHandlerImpl$init$$inlined$combine$1$3", f = "InstantRacingBetslipSingleHandlerImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super iv3>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ jtn d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, jtn jtnVar) {
            super(3, v1bVar);
            this.d = jtnVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super iv3> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str;
            BigDecimal bigDecimal;
            zv3 zv3VarA;
            BigDecimal bigDecimal2;
            BigDecimal bigDecimal3;
            BigDecimal bigDecimal4;
            iv3 iv3Var;
            Iterator it;
            BigDecimal bigDecimal5;
            Object next;
            ord0 ord0VarJ;
            ut3 ou3Var;
            ou3.a aVar;
            ou3.a aVar2;
            StringUiText stringUiText;
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
                l3o l3oVar = (l3o) obj4;
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
                jtn jtnVar = cVar.d;
                nzm nzmVar = jtnVar.e;
                if (list.isEmpty()) {
                    iv3Var = null;
                } else {
                    String strB = jtnVar.d.B();
                    MyFavoriteStake stake = jtnVar.c.getStake();
                    List listK = stake != null ? kotlin.collections.b.k(stake.getQuickAddStake1(), stake.getQuickAddStake2(), stake.getQuickAddStake3()) : null;
                    List<BigDecimal> listI = nzmVar.i();
                    String strJ = nzmVar.j();
                    strJ.getClass();
                    BigDecimal bigDecimal6 = new BigDecimal(strJ);
                    vsn vsnVar = l3oVar.a.d;
                    BigDecimal bigDecimal7 = vsnVar.a;
                    BigDecimal bigDecimal8 = vsnVar.b;
                    BigDecimal bigDecimal9 = vsnVar.c;
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(assetsInfo.balance);
                    bigDecimalValueOf.getClass();
                    BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(heo.a, 2, RoundingMode.HALF_UP);
                    TaxConfig virtualTaxConfig = taxConfigs.getVirtualTaxConfig();
                    BigDecimal bigDecimalC = hn9.c(list);
                    BigDecimal bigDecimalH = hn9.h(list);
                    BigDecimal bigDecimalB = hn9.b(bigDecimal9, list);
                    BigDecimal bigDecimalG = hn9.g(bigDecimal9, list);
                    BigDecimal bigDecimalD = hn9.d(virtualTaxConfig, bigDecimalC, bigDecimalH, bigDecimalB, bigDecimalG);
                    BigDecimal tax = virtualTaxConfig.getTax(bigDecimalG, bigDecimalH);
                    BigDecimal bigDecimalE = hn9.e(bigDecimalH, m780Var);
                    BigDecimal exciseTax = virtualTaxConfig.getExciseTax(bigDecimalE);
                    exciseTax.getClass();
                    BigDecimal bigDecimalAdd = bigDecimalE.add(exciseTax);
                    bigDecimalAdd.getClass();
                    boolean z = list.size() == 1;
                    List<qwn> list3 = l3oVar.b.b;
                    boolean z2 = z;
                    ArrayList arrayList = new ArrayList(l48.r(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        x3o x3oVar = (x3o) it2.next();
                        Iterator<T> it3 = list3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                it = it2;
                                bigDecimal5 = bigDecimalC;
                                next = null;
                                break;
                            }
                            next = it3.next();
                            it = it2;
                            bigDecimal5 = bigDecimalC;
                            if (((qwn) next).a == x3oVar.a.b.c) {
                                break;
                            }
                            it2 = it;
                            bigDecimalC = bigDecimal5;
                        }
                        qwn qwnVar = (qwn) next;
                        String str3 = qwnVar != null ? qwnVar.b : null;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        h3o h3oVar = x3oVar.a;
                        gun gunVar = h3oVar.c;
                        List list4 = list2;
                        String str5 = gunVar.a;
                        String str6 = x3oVar.b;
                        BigDecimal bigDecimal10 = exciseTax;
                        boolean z3 = (zrd0Var instanceof zrd0.b) && Intrinsics.g(((zrd0.b) zrd0Var).a, str5);
                        str6.getClass();
                        if (z2) {
                            ord0VarJ = null;
                        } else {
                            bigDecimalDivide.getClass();
                            ord0VarJ = ht90.j(str6, str2, bigDecimal7, bigDecimal8, bigDecimalDivide);
                        }
                        BigDecimal bigDecimal11 = bigDecimalDivide;
                        BigDecimal bigDecimal12 = bigDecimal8;
                        asd0 asd0VarH = ht90.h(str6, bigDecimal7, true, z3, ord0VarJ != null);
                        ResourceUiText resourceUiTextP = ht90.p(ord0VarJ);
                        String string = gunVar.b.toString();
                        string.getClass();
                        String strA = gky.a.a(string, false);
                        List<h2o> listR0 = CollectionsKt.r0(h3oVar.a.c, new btn());
                        int iA = jpu.a(l48.r(listR0, 10));
                        if (iA < 16) {
                            iA = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                        for (h2o h2oVar : listR0) {
                            linkedHashMap.put(String.valueOf(h2oVar.b), h2oVar);
                            z3 = z3;
                        }
                        boolean z4 = z3;
                        fun funVar = h3oVar.b;
                        gun gunVar2 = h3oVar.c;
                        String str7 = gunVar2.d;
                        dxn dxnVar = funVar.g;
                        String str8 = str2;
                        if (dxnVar instanceof dxn.d) {
                            List listSplit$default = StringsKt__StringsKt.split$default(str7, new String[]{","}, false, 0, 6, null);
                            ArrayList arrayList2 = new ArrayList();
                            for (Iterator it4 = listSplit$default.iterator(); it4.hasNext(); it4 = it4) {
                                h2o h2oVar2 = (h2o) linkedHashMap.get((String) it4.next());
                                ou3.a aVar3 = h2oVar2 == null ? null : new ou3.a(null, h2oVar2.i, h2oVar2.c);
                                if (aVar3 != null) {
                                    arrayList2.add(aVar3);
                                }
                            }
                            ou3Var = new ou3(R.color.text_primary, a4h.b(arrayList2), strA);
                        } else if (dxnVar instanceof dxn.c) {
                            ou3Var = new ju3(strA, gunVar2.c);
                        } else if (dxnVar instanceof dxn.a) {
                            List listSplit$default2 = StringsKt__StringsKt.split$default(funVar.f, new String[]{";"}, false, 0, 6, null);
                            List listSplit$default3 = StringsKt__StringsKt.split$default(str7, new String[]{","}, false, 0, 6, null);
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it5 = listSplit$default3.iterator();
                            int i2 = 0;
                            while (it5.hasNext()) {
                                Object next2 = it5.next();
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    kotlin.collections.b.q();
                                    throw null;
                                }
                                h2o h2oVar3 = (h2o) linkedHashMap.get((String) next2);
                                if (h2oVar3 == null) {
                                    it5 = it5;
                                    aVar2 = null;
                                } else {
                                    String str9 = (String) CollectionsKt.V(i2, listSplit$default2);
                                    if (str9 != null) {
                                        StringUiText stringUiText2 = vch0.a;
                                        stringUiText = new StringUiText(str9);
                                    } else {
                                        stringUiText = null;
                                    }
                                    aVar2 = new ou3.a(stringUiText, h2oVar3.i, h2oVar3.c);
                                }
                                if (aVar2 != null) {
                                    arrayList3.add(aVar2);
                                }
                                i2 = i3;
                                listSplit$default2 = listSplit$default2;
                                it5 = it5;
                            }
                            ou3Var = new ou3(R.color.icon_primary, a4h.b(arrayList3), strA);
                        } else {
                            if (!(dxnVar instanceof dxn.b)) {
                                uhc.a();
                                return null;
                            }
                            List listSplit$default4 = StringsKt__StringsKt.split$default(str7, new String[]{","}, false, 0, 6, null);
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it6 = listSplit$default4.iterator();
                            while (it6.hasNext()) {
                                h2o h2oVar4 = (h2o) linkedHashMap.get((String) it6.next());
                                if (h2oVar4 == null) {
                                    aVar = null;
                                } else {
                                    StringUiText stringUiText3 = vch0.a;
                                    aVar = new ou3.a(new ResourceUiText(R.string.page_instant_virtual__any), h2oVar4.i, h2oVar4.c);
                                }
                                if (aVar != null) {
                                    arrayList4.add(aVar);
                                }
                                linkedHashMap = linkedHashMap;
                            }
                            ou3Var = new ou3(R.color.icon_primary, a4h.b(arrayList4), strA);
                        }
                        ut3 ut3Var = ou3Var;
                        zrd0.b bVar = new zrd0.b(str5);
                        listI.getClass();
                        arrayList.add(new ov3(str5, R.color.transparent, null, null, ut3Var, str4, R.color.text_primary, bVar, asd0VarH, resourceUiTextP, z4, ht90.i(str6, listK, listI, bigDecimal6, bigDecimal7, bigDecimal12)));
                        bigDecimal8 = bigDecimal12;
                        it2 = it;
                        bigDecimalC = bigDecimal5;
                        list2 = list4;
                        exciseTax = bigDecimal10;
                        bigDecimalDivide = bigDecimal11;
                        str2 = str8;
                    }
                    BigDecimal bigDecimal13 = bigDecimalDivide;
                    BigDecimal bigDecimal14 = exciseTax;
                    BigDecimal bigDecimal15 = bigDecimalC;
                    List list5 = list2;
                    BigDecimal bigDecimal16 = bigDecimal8;
                    qcn qcnVarB = a4h.b(arrayList);
                    ResourceUiText resourceUiTextK = ht90.k(bigDecimalH, bigDecimal16);
                    Object[] objArr2 = {Integer.valueOf(list.size())};
                    StringUiText stringUiText4 = vch0.a;
                    ResourceUiText resourceUiText = new ResourceUiText(R.string.component_betslip__stake_per_bet_vstakecount_bets, ay0.S(objArr2));
                    listI.getClass();
                    usd0 usd0VarI = ht90.i(str2, listK, listI, bigDecimal6, bigDecimal7, bigDecimal16);
                    if (z2) {
                        bigDecimal13.getClass();
                        bigDecimal4 = bigDecimal13;
                        zv3VarA = ht90.c(str2, bigDecimalH, bigDecimalE, zrd0Var, strB, bigDecimal7, bigDecimal16, bigDecimal4, resourceUiText, usd0VarI);
                        bigDecimal2 = bigDecimalH;
                        bigDecimal = bigDecimalE;
                        str = strB;
                        bigDecimal3 = bigDecimal16;
                    } else {
                        str = strB;
                        ArrayList arrayList5 = new ArrayList(l48.r(list, 10));
                        Iterator it7 = list.iterator();
                        while (it7.hasNext()) {
                            arrayList5.add(((x3o) it7.next()).b);
                        }
                        bigDecimal13.getClass();
                        bigDecimal = bigDecimalE;
                        zv3VarA = ht90.a(arrayList5, str2, zrd0Var, str, bigDecimal15, bigDecimalH, bigDecimal7, bigDecimal16, bigDecimal13, resourceUiText, usd0VarI);
                        bigDecimal2 = bigDecimalH;
                        bigDecimal3 = bigDecimal16;
                        bigDecimal4 = bigDecimal13;
                    }
                    Locale locale = Locale.US;
                    iv3Var = new iv3(qcnVarB, resourceUiTextK, zv3VarA, bjb0.L(bigDecimal2, locale), ht90.r(virtualTaxConfig.hasRate(), bigDecimalB, bigDecimalG, bigDecimalD, tax), !virtualTaxConfig.hasExciseTaxRate() ? null : bjb0.L(bigDecimal14, locale), ht90.q(bigDecimalB, bigDecimalG, bigDecimalD, tax), ht90.e(list5, m780Var, bigDecimal2, str), ht90.b(ht90.t(list, bigDecimal2, bigDecimalAdd, bigDecimal7, bigDecimal3, bigDecimal4), bigDecimal), false, null);
                    cVar = this;
                }
                cVar.b = null;
                cVar.c = null;
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

    public ctn(lyh[] lyhVarArr, jtn jtnVar) {
        this.a = lyhVarArr;
        this.b = jtnVar;
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
