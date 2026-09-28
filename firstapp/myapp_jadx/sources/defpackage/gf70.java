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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gf70 implements lyh<yc30> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ ff70 b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballQuickBetHandlerImpl$init$$inlined$combine$1", f = "ScheduledFootballQuickBetHandlerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return gf70.this.collect(null, this);
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballQuickBetHandlerImpl$init$$inlined$combine$1$3", f = "ScheduledFootballQuickBetHandlerImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super yc30>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ ff70 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, ff70 ff70Var) {
            super(3, v1bVar);
            this.d = ff70Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super yc30> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:131:0x03f8  */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object[], myh] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ?? r2;
            Object mc30Var;
            Object next;
            boolean z;
            boolean z2;
            ResourceUiText resourceUiText;
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
                ft90 ft90Var = (ft90) obj3;
                Object obj4 = objArr[2];
                obj4.getClass();
                et90 et90Var = (et90) obj4;
                Object obj5 = objArr[3];
                obj5.getClass();
                nmw nmwVar = (nmw) obj5;
                Object obj6 = objArr[4];
                obj6.getClass();
                lmw lmwVar = (lmw) obj6;
                Object obj7 = objArr[5];
                obj7.getClass();
                ff70.a aVar = (ff70.a) obj7;
                zrd0 zrd0Var = (zrd0) objArr[6];
                Object obj8 = objArr[7];
                obj8.getClass();
                ni70 ni70Var = (ni70) obj8;
                Object obj9 = objArr[8];
                obj9.getClass();
                long jLongValue = ((Long) obj9).longValue();
                Object obj10 = objArr[9];
                obj10.getClass();
                AssetsInfo assetsInfo = (AssetsInfo) obj10;
                Object obj11 = objArr[10];
                obj11.getClass();
                TaxConfigs taxConfigs = (TaxConfigs) obj11;
                Object obj12 = objArr[11];
                obj12.getClass();
                List list2 = (List) obj12;
                m780 m780Var = (m780) objArr[12];
                if (list.isEmpty() || aVar == ff70.a.c) {
                    y5bVar = y5bVar;
                    myhVar = myhVar;
                    r2 = 0;
                    cVar = this;
                    mc30Var = null;
                } else {
                    boolean z3 = nmwVar.d;
                    int i2 = R.color.text_disabled_action;
                    if (z3) {
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = false;
                                    break;
                                }
                                if (((bi70) it.next()).c.a(jLongValue)) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                        int i3 = z2 ? R.color.bg_danger_secondary : R.color.bg_secondary_d_lightest;
                        int size = nmwVar.c.size();
                        if (size == 2) {
                            StringUiText stringUiText = vch0.a;
                            resourceUiText = new ResourceUiText(R.string.bet_history__doubles);
                        } else if (size != 3) {
                            Object[] objArr2 = {Integer.valueOf(size)};
                            StringUiText stringUiText2 = vch0.a;
                            resourceUiText = new ResourceUiText(R.string.bet_history__vnum_folds, ay0.S(objArr2));
                        } else {
                            StringUiText stringUiText3 = vch0.a;
                            resourceUiText = new ResourceUiText(R.string.bet_history__trebles);
                        }
                        mc30Var = new mc30(i3, list.size(), resourceUiText, omw.b(lmwVar.b, lmwVar.c), z2 ? R.color.text_disabled_action : R.color.text_primary, new lr4(new ResourceUiText(R.string.component_betslip__add_more_qualifying_selection_to_boost_your_bonus), lmwVar.l));
                    } else if (ft90Var.d) {
                        if (!list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z = false;
                                    break;
                                }
                                if (((bi70) it2.next()).c.a(jLongValue)) {
                                    z = true;
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                        mc30Var = new mc30(z ? R.color.bg_danger_secondary : R.color.bg_secondary_d_lightest, list.size(), new ResourceUiText(R.string.bet_history__singles), ht90.l(et90Var.b, et90Var.c), z ? R.color.text_disabled_action : R.color.text_primary, ht90.d());
                    } else {
                        cz2 cz2Var = (cz2) CollectionsKt.p0(ft90Var.a);
                        if (cz2Var != null) {
                            Iterator it3 = list.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                            } while (!((bi70) next).f.a.equals(cz2Var.c));
                            bi70 bi70Var = (bi70) next;
                            if (bi70Var == null) {
                                y5bVar = y5bVar;
                                myhVar = myhVar;
                                r2 = 0;
                                mc30Var = null;
                            } else {
                                ff70 ff70Var = cVar.d;
                                nzm nzmVar = ff70Var.e;
                                MyFavoriteStake stake = ff70Var.c.getStake();
                                List listK = stake != null ? kotlin.collections.b.k(stake.getQuickAddStake1(), stake.getQuickAddStake2(), stake.getQuickAddStake3()) : null;
                                List<BigDecimal> listI = nzmVar.i();
                                String strJ = nzmVar.j();
                                strJ.getClass();
                                BigDecimal bigDecimal = new BigDecimal(strJ);
                                g070 g070Var = ni70Var.a.d;
                                BigDecimal bigDecimal2 = g070Var.a;
                                BigDecimal bigDecimal3 = g070Var.b;
                                y5bVar = y5bVar;
                                myhVar = myhVar;
                                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(assetsInfo.balance);
                                bigDecimalValueOf.getClass();
                                BigDecimal bigDecimalA = s5y.a(bigDecimalValueOf);
                                TaxConfig virtualTaxConfig = taxConfigs.getVirtualTaxConfig();
                                BigDecimal bigDecimal4 = et90Var.e;
                                BigDecimal bigDecimal5 = et90Var.g;
                                BigDecimal bigDecimalI = hn9.i(virtualTaxConfig, bigDecimal4, bigDecimal5);
                                BigDecimal bigDecimalE = hn9.e(bigDecimal4, m780Var);
                                BigDecimal exciseTax = virtualTaxConfig.getExciseTax(bigDecimalE);
                                exciseTax.getClass();
                                BigDecimal bigDecimalAdd = bigDecimalE.add(exciseTax);
                                bigDecimalAdd.getClass();
                                e970 e970Var = bi70Var.c;
                                z370 z370Var = bi70Var.d;
                                g870 g870Var = bi70Var.e;
                                ad70 ad70Var = bi70Var.f;
                                Map<String, String> map = ft90Var.b;
                                String str = ad70Var.a;
                                String str2 = map.get(str);
                                if (str2 == null) {
                                    str2 = "";
                                }
                                boolean zA = e970Var.a(jLongValue);
                                int i4 = zA ? R.color.bg_danger_secondary : R.color.bg_secondary_d_lightest;
                                int i5 = zA ? R.color.text_disabled_action : R.color.text_primary;
                                int i6 = zA ? R.color.icon_disable : R.color.icon_primary;
                                int i7 = zA ? R.color.text_disabled_action : R.color.text_primary;
                                String str3 = g870Var.c;
                                int i8 = zA ? R.color.text_disabled_action : R.color.text_secondary;
                                int i9 = zA ? R.color.text_disabled_action : R.color.text_primary;
                                if (!zA) {
                                    i2 = R.color.text_secondary;
                                }
                                String str4 = z370Var.c;
                                StringUiText stringUiText4 = vch0.a;
                                int i10 = i8;
                                Iterator it4 = kotlin.collections.b.k(new ColoredUiText(new StringUiText(str4), Integer.valueOf(i9), null), new StringUiText(" "), new ColoredUiText(new ResourceUiText(R.string.bet_history__vs), Integer.valueOf(i2), null), new StringUiText(" "), new ColoredUiText(new StringUiText(z370Var.f), Integer.valueOf(i9), null)).iterator();
                                if (!it4.hasNext()) {
                                    zkh.a("Empty collection can't be reduced.");
                                    return null;
                                }
                                Object next2 = it4.next();
                                while (it4.hasNext()) {
                                    next2 = ((UiText) next2).h((UiText) it4.next());
                                }
                                dd30 dd30Var = new dd30((UiText) next2);
                                ResourceUiText resourceUiText2 = zA ? new ResourceUiText(R.string.page_instant_virtual__bet_closed) : null;
                                boolean z4 = (zrd0Var instanceof zrd0.b) && Intrinsics.g(((zrd0.b) zrd0Var).a, str);
                                ord0 ord0VarO = ht90.o(bigDecimal4, bigDecimalE, bigDecimal2, bigDecimal3, bigDecimalA);
                                asd0 asd0VarH = ht90.h(str2, bigDecimal2, !zA, z4, ord0VarO != null);
                                ResourceUiText resourceUiTextP = ht90.p(ord0VarO);
                                dqk dqkVarE = ht90.e(list2, m780Var, bigDecimal4, ff70Var.d.B());
                                listI.getClass();
                                usd0 usd0VarI = ht90.i(str2, listK, listI, bigDecimal, bigDecimal2, bigDecimal3);
                                dg30 dg30VarG = ht90.g(virtualTaxConfig.hasRate(), bigDecimal5, bigDecimalI);
                                sg10 sg10VarF = ht90.f(!virtualTaxConfig.hasExciseTaxRate() ? null : bjb0.L(exciseTax, Locale.US), bigDecimalE, ht90.s(ft90Var, bigDecimal4, bigDecimalAdd, bigDecimal2, bigDecimal3, bigDecimalA));
                                String str5 = ad70Var.a;
                                String string = ad70Var.b.toString();
                                string.getClass();
                                xc30 xc30Var = new xc30(str5, i4, string, i5, R.drawable.ic__sports__football, i6, ad70Var.d, i7, new x280.b(str3, i10), dd30Var, resourceUiText2, new zrd0.b(str), asd0VarH, resourceUiTextP, dqkVarE, z4, usd0VarI, dg30VarG, sg10VarF, zA);
                                r2 = 0;
                                cVar = this;
                                mc30Var = xc30Var;
                            }
                        } else {
                            y5bVar = y5bVar;
                            myhVar = myhVar;
                            r2 = 0;
                            cVar = this;
                            mc30Var = null;
                        }
                    }
                    r2 = 0;
                }
                cVar.b = r2;
                cVar.c = r2;
                cVar.a = 1;
                y5b y5bVar2 = y5bVar;
                if (myhVar.emit(mc30Var, cVar) == y5bVar2) {
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

    public gf70(lyh[] lyhVarArr, ff70 ff70Var) {
        this.a = lyhVarArr;
        this.b = ff70Var;
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
