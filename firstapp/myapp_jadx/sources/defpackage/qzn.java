package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
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
public final class qzn implements lyh<yc30> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ pzn b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingQuickBetHandlerImpl$init$$inlined$combine$1", f = "InstantRacingQuickBetHandlerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return qzn.this.collect(null, this);
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingQuickBetHandlerImpl$init$$inlined$combine$1$3", f = "InstantRacingQuickBetHandlerImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super yc30>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ pzn d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, pzn pznVar) {
            super(3, v1bVar);
            this.d = pznVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super yc30> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0331 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:105:0x0232 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:107:0x021e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:67:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:71:0x0203 A[LOOP:0: B:69:0x01fd->B:71:0x0203, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:75:0x0224  */
        /* JADX WARN: Code duplicated, block: B:84:0x0263  */
        /* JADX WARN: Code duplicated, block: B:87:0x026d  */
        /* JADX WARN: Code duplicated, block: B:89:0x0270  */
        /* JADX WARN: Code duplicated, block: B:92:0x02a5  */
        /* JADX WARN: Code duplicated, block: B:94:0x02b6  */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], myh] */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v25 */
        /* JADX WARN: Type inference failed for: r1v26 */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object mc30Var;
            ?? r1;
            Object obj3;
            String str;
            h3o h3oVar;
            dxn dxnVar;
            int iA;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            Iterator it;
            cd30 cd30Var;
            String str2;
            boolean z;
            ord0 ord0VarO;
            boolean z2;
            String strL;
            BigDecimal bigDecimal;
            c cVar = this;
            y5b y5bVar = y5b.a;
            int i = cVar.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = cVar.b;
                Object[] objArr = cVar.c;
                Object obj4 = objArr[0];
                obj4.getClass();
                List list = (List) obj4;
                Object obj5 = objArr[1];
                obj5.getClass();
                pzn.a aVar = (pzn.a) obj5;
                zrd0 zrd0Var = (zrd0) objArr[2];
                Object obj6 = objArr[3];
                obj6.getClass();
                l3o l3oVar = (l3o) obj6;
                Object obj7 = objArr[4];
                obj7.getClass();
                AssetsInfo assetsInfo = (AssetsInfo) obj7;
                Object obj8 = objArr[5];
                obj8.getClass();
                TaxConfigs taxConfigs = (TaxConfigs) obj8;
                Object obj9 = objArr[6];
                obj9.getClass();
                List list2 = (List) obj9;
                m780 m780Var = (m780) objArr[7];
                if (list.isEmpty()) {
                    obj2 = null;
                } else {
                    obj2 = null;
                    if (aVar != pzn.a.c) {
                        if (list.size() > 1) {
                            r1 = 0;
                            mc30Var = new mc30(R.color.bg_secondary_d_lightest, list.size(), new ResourceUiText(R.string.bet_history__singles), ht90.l(hn9.a(list), hn9.f(list)), R.color.text_primary, ht90.d());
                        } else {
                            x3o x3oVar = (x3o) CollectionsKt.n0(list);
                            pzn pznVar = cVar.d;
                            nzm nzmVar = pznVar.e;
                            MyFavoriteStake stake = pznVar.c.getStake();
                            List listK = stake != null ? kotlin.collections.b.k(stake.getQuickAddStake1(), stake.getQuickAddStake2(), stake.getQuickAddStake3()) : null;
                            List<BigDecimal> listI = nzmVar.i();
                            String strJ = nzmVar.j();
                            strJ.getClass();
                            BigDecimal bigDecimal2 = new BigDecimal(strJ);
                            vsn vsnVar = l3oVar.a.d;
                            BigDecimal bigDecimal3 = vsnVar.a;
                            BigDecimal bigDecimal4 = vsnVar.b;
                            BigDecimal bigDecimal5 = vsnVar.c;
                            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(assetsInfo.balance);
                            bigDecimalValueOf.getClass();
                            BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(heo.a, 2, RoundingMode.HALF_UP);
                            TaxConfig virtualTaxConfig = taxConfigs.getVirtualTaxConfig();
                            List listC = kotlin.collections.a.c(x3oVar);
                            BigDecimal bigDecimalH = hn9.h(listC);
                            BigDecimal bigDecimalG = hn9.g(bigDecimal5, listC);
                            BigDecimal bigDecimalI = hn9.i(virtualTaxConfig, bigDecimalH, bigDecimalG);
                            BigDecimal bigDecimalE = hn9.e(bigDecimalH, m780Var);
                            BigDecimal exciseTax = virtualTaxConfig.getExciseTax(bigDecimalE);
                            exciseTax.getClass();
                            BigDecimal bigDecimalAdd = bigDecimalE.add(exciseTax);
                            bigDecimalAdd.getClass();
                            h3o h3oVar2 = x3oVar.a;
                            fun funVar = h3oVar2.b;
                            gun gunVar = h3oVar2.c;
                            String str3 = gunVar.a;
                            String str4 = x3oVar.b;
                            cxn cxnVar = l3oVar.b;
                            dxn dxnVar2 = funVar.g;
                            if ((dxnVar2 instanceof dxn.d) || (dxnVar2 instanceof dxn.c)) {
                                ArrayList arrayList2 = cxnVar.a;
                                int size = arrayList2.size();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= size) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = arrayList2.get(i2);
                                    i2++;
                                    ArrayList arrayList3 = arrayList2;
                                    int i3 = size;
                                    if (((rwn) obj3).c.contains(funVar.c)) {
                                        break;
                                    }
                                    arrayList2 = arrayList3;
                                    size = i3;
                                }
                                rwn rwnVar = (rwn) obj3;
                                str = rwnVar != null ? rwnVar.b : null;
                                if (str == null) {
                                }
                                g3o g3oVar = l3oVar.c;
                                h3oVar = x3oVar.a;
                                dxnVar = h3oVar.b.g;
                                if (!(dxnVar instanceof dxn.d) || (dxnVar instanceof dxn.a) || (dxnVar instanceof dxn.b)) {
                                    List listSplit$default = StringsKt__StringsKt.split$default(h3oVar.c.d, new String[]{","}, false, 0, 6, null);
                                    List<h2o> list3 = h3oVar.a.c;
                                    iA = jpu.a(l48.r(list3, 10));
                                    if (iA < 16) {
                                        iA = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iA);
                                    for (h2o h2oVar : list3) {
                                        linkedHashMap.put(String.valueOf(h2oVar.b), h2oVar.c);
                                    }
                                    arrayList = new ArrayList();
                                    it = listSplit$default.iterator();
                                    while (it.hasNext()) {
                                        str2 = (String) linkedHashMap.get((String) it.next());
                                        if (str2 != null) {
                                            arrayList.add(str2);
                                        }
                                    }
                                    cd30Var = new cd30(CollectionsKt.a0(arrayList, null, null, null, null, 63), R.color.text_primary, R.style.B2_B);
                                } else {
                                    if (!(dxnVar instanceof dxn.c)) {
                                        uhc.a();
                                        return null;
                                    }
                                    own ownVar = (own) CollectionsKt.firstOrNull(g3oVar.c);
                                    String str5 = ownVar != null ? ownVar.c : null;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    cd30Var = new cd30(str5, R.color.text_secondary, R.style.B1_M);
                                }
                                cd30 cd30Var2 = cd30Var;
                                if ((zrd0Var instanceof zrd0.b) || !Intrinsics.g(((zrd0.b) zrd0Var).a, str3)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                bigDecimalDivide.getClass();
                                ord0VarO = ht90.o(bigDecimalH, bigDecimalE, bigDecimal3, bigDecimal4, bigDecimalDivide);
                                if (ord0VarO != null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                asd0 asd0VarH = ht90.h(str4, bigDecimal3, true, z, z2);
                                ResourceUiText resourceUiTextP = ht90.p(ord0VarO);
                                dqk dqkVarE = ht90.e(list2, m780Var, bigDecimalH, pznVar.d.B());
                                listI.getClass();
                                usd0 usd0VarI = ht90.i(str4, listK, listI, bigDecimal2, bigDecimal3, bigDecimal4);
                                dg30 dg30VarG = ht90.g(virtualTaxConfig.hasRate(), bigDecimalG, bigDecimalI);
                                if (virtualTaxConfig.hasExciseTaxRate()) {
                                    strL = bjb0.L(exciseTax, Locale.US);
                                    bigDecimal = bigDecimalAdd;
                                } else {
                                    bigDecimal = bigDecimalAdd;
                                    strL = null;
                                }
                                sg10 sg10VarF = ht90.f(strL, bigDecimalE, ht90.t(listC, bigDecimalH, bigDecimal, bigDecimal3, bigDecimal4, bigDecimalDivide));
                                String string = gunVar.b.toString();
                                string.getClass();
                                xc30 xc30Var = new xc30(str3, R.color.bg_secondary_d_lightest, gky.a.a(string, false), R.color.text_primary, R.drawable.ic__sports__dog_racing, R.color.icon_primary, gunVar.c, R.color.text_primary, new x280.b(str, R.color.text_secondary), cd30Var2, null, new zrd0.b(str3), asd0VarH, resourceUiTextP, dqkVarE, z, usd0VarI, dg30VarG, sg10VarF, false);
                                cVar = this;
                                r1 = 0;
                                mc30Var = xc30Var;
                            } else if (!(dxnVar2 instanceof dxn.a) && !(dxnVar2 instanceof dxn.b)) {
                                uhc.a();
                                return null;
                            }
                            str = "";
                            g3o g3oVar2 = l3oVar.c;
                            h3oVar = x3oVar.a;
                            dxnVar = h3oVar.b.g;
                            if (dxnVar instanceof dxn.d) {
                                List listSplit$default2 = StringsKt__StringsKt.split$default(h3oVar.c.d, new String[]{","}, false, 0, 6, null);
                                List<h2o> list4 = h3oVar.a.c;
                                iA = jpu.a(l48.r(list4, 10));
                                if (iA < 16) {
                                    iA = 16;
                                }
                                linkedHashMap = new LinkedHashMap(iA);
                                while (r3.hasNext()) {
                                    linkedHashMap.put(String.valueOf(h2oVar.b), h2oVar.c);
                                }
                                arrayList = new ArrayList();
                                it = listSplit$default2.iterator();
                                while (it.hasNext()) {
                                    str2 = (String) linkedHashMap.get((String) it.next());
                                    if (str2 != null) {
                                        arrayList.add(str2);
                                    }
                                }
                                cd30Var = new cd30(CollectionsKt.a0(arrayList, null, null, null, null, 63), R.color.text_primary, R.style.B2_B);
                            } else {
                                List listSplit$default3 = StringsKt__StringsKt.split$default(h3oVar.c.d, new String[]{","}, false, 0, 6, null);
                                List<h2o> list5 = h3oVar.a.c;
                                iA = jpu.a(l48.r(list5, 10));
                                if (iA < 16) {
                                    iA = 16;
                                }
                                linkedHashMap = new LinkedHashMap(iA);
                                while (r3.hasNext()) {
                                    linkedHashMap.put(String.valueOf(h2oVar.b), h2oVar.c);
                                }
                                arrayList = new ArrayList();
                                it = listSplit$default3.iterator();
                                while (it.hasNext()) {
                                    str2 = (String) linkedHashMap.get((String) it.next());
                                    if (str2 != null) {
                                        arrayList.add(str2);
                                    }
                                }
                                cd30Var = new cd30(CollectionsKt.a0(arrayList, null, null, null, null, 63), R.color.text_primary, R.style.B2_B);
                            }
                            cd30 cd30Var3 = cd30Var;
                            if (zrd0Var instanceof zrd0.b) {
                                z = false;
                            } else {
                                z = false;
                            }
                            bigDecimalDivide.getClass();
                            ord0VarO = ht90.o(bigDecimalH, bigDecimalE, bigDecimal3, bigDecimal4, bigDecimalDivide);
                            if (ord0VarO != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            asd0 asd0VarH2 = ht90.h(str4, bigDecimal3, true, z, z2);
                            ResourceUiText resourceUiTextP2 = ht90.p(ord0VarO);
                            dqk dqkVarE2 = ht90.e(list2, m780Var, bigDecimalH, pznVar.d.B());
                            listI.getClass();
                            usd0 usd0VarI2 = ht90.i(str4, listK, listI, bigDecimal2, bigDecimal3, bigDecimal4);
                            dg30 dg30VarG2 = ht90.g(virtualTaxConfig.hasRate(), bigDecimalG, bigDecimalI);
                            if (virtualTaxConfig.hasExciseTaxRate()) {
                                bigDecimal = bigDecimalAdd;
                                strL = null;
                            } else {
                                strL = bjb0.L(exciseTax, Locale.US);
                                bigDecimal = bigDecimalAdd;
                            }
                            sg10 sg10VarF2 = ht90.f(strL, bigDecimalE, ht90.t(listC, bigDecimalH, bigDecimal, bigDecimal3, bigDecimal4, bigDecimalDivide));
                            String string2 = gunVar.b.toString();
                            string2.getClass();
                            xc30 xc30Var2 = new xc30(str3, R.color.bg_secondary_d_lightest, gky.a.a(string2, false), R.color.text_primary, R.drawable.ic__sports__dog_racing, R.color.icon_primary, gunVar.c, R.color.text_primary, new x280.b(str, R.color.text_secondary), cd30Var3, null, new zrd0.b(str3), asd0VarH2, resourceUiTextP2, dqkVarE2, z, usd0VarI2, dg30VarG2, sg10VarF2, false);
                            cVar = this;
                            r1 = 0;
                            mc30Var = xc30Var2;
                        }
                    }
                    cVar.b = r1;
                    cVar.c = r1;
                    cVar.a = 1;
                    if (myhVar.emit(mc30Var, cVar) == y5bVar) {
                        return y5bVar;
                    }
                }
                cVar = this;
                Object obj10 = obj2;
                mc30Var = obj10;
                r1 = obj10;
                cVar.b = r1;
                cVar.c = r1;
                cVar.a = 1;
                if (myhVar.emit(mc30Var, cVar) == y5bVar) {
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

    public qzn(lyh[] lyhVarArr, pzn pznVar) {
        this.a = lyhVarArr;
        this.b = pznVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super yc30> myhVar, v1b v1bVar) {
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
