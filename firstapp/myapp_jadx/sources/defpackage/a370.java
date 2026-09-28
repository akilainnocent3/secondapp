package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class a370 implements lyh<ysa> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ z270 b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballConfirmDialogHandlerImpl$init$$inlined$combine$1", f = "ScheduledFootballConfirmDialogHandlerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return a370.this.collect(null, this);
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballConfirmDialogHandlerImpl$init$$inlined$combine$1$3", f = "ScheduledFootballConfirmDialogHandlerImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super ysa>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ z270 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, z270 z270Var) {
            super(3, v1bVar);
            this.d = z270Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super ysa> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ysa ysaVar;
            ResourceUiText resourceUiText;
            psm psmVar = this.d.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                Object obj2 = objArr[0];
                obj2.getClass();
                et90 et90Var = (et90) obj2;
                Object obj3 = objArr[1];
                obj3.getClass();
                lmw lmwVar = (lmw) obj3;
                Object obj4 = objArr[2];
                obj4.getClass();
                z270.a aVar = (z270.a) obj4;
                Object obj5 = objArr[3];
                obj5.getClass();
                TaxConfigs taxConfigs = (TaxConfigs) obj5;
                Object obj6 = objArr[4];
                obj6.getClass();
                List list = (List) obj6;
                Object obj7 = objArr[5];
                m780 m780Var = obj7 instanceof m780 ? (m780) obj7 : null;
                Object obj8 = objArr[6];
                m780 m780Var2 = obj8 instanceof m780 ? (m780) obj8 : null;
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    String strB = psmVar.B();
                    TaxConfig virtualTaxConfig = taxConfigs.getVirtualTaxConfig();
                    BigDecimal bigDecimal = et90Var.e;
                    BigDecimal bigDecimalE = hn9.e(bigDecimal, m780Var);
                    virtualTaxConfig.getClass();
                    BigDecimal exciseTax = virtualTaxConfig.getExciseTax(bigDecimalE);
                    BigDecimal bigDecimalAdd = bigDecimalE.add(exciseTax);
                    bigDecimalAdd.getClass();
                    ysaVar = new ysa(ht90.n(bigDecimalAdd, strB), ht90.m(strB, bigDecimalE, exciseTax, virtualTaxConfig.hasExciseTaxRate()), ht90.e(list, m780Var, bigDecimal, strB));
                } else if (iOrdinal == 1) {
                    String strB2 = psmVar.B();
                    TaxConfig virtualTaxConfig2 = taxConfigs.getVirtualTaxConfig();
                    BigDecimal bigDecimal2 = lmwVar.e;
                    BigDecimal bigDecimalA = rmw.a(bigDecimal2, m780Var2);
                    virtualTaxConfig2.getClass();
                    BigDecimal exciseTax2 = virtualTaxConfig2.getExciseTax(bigDecimalA);
                    BigDecimal bigDecimalAdd2 = bigDecimalA.add(exciseTax2);
                    bigDecimalAdd2.getClass();
                    strB2.getClass();
                    StringBuilder sbB = mq0.b(strB2, " ");
                    Locale locale = Locale.US;
                    sbB.append(bjb0.L(bigDecimalAdd2, locale));
                    String string = sbB.toString();
                    boolean zHasExciseTaxRate = virtualTaxConfig2.hasExciseTaxRate();
                    exciseTax2.getClass();
                    if (zHasExciseTaxRate) {
                        StringBuilder sbB2 = mq0.b(strB2, " ");
                        sbB2.append(bjb0.L(bigDecimalA, locale));
                        String string2 = sbB2.toString();
                        StringBuilder sbB3 = mq0.b(strB2, " ");
                        sbB3.append(bjb0.L(exciseTax2, locale));
                        Object[] objArr2 = {string2, sbB3.toString()};
                        StringUiText stringUiText = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.component_betslip__excise_tax_confirm_dialog_bracket, ay0.S(objArr2));
                    } else {
                        resourceUiText = null;
                    }
                    ysaVar = new ysa(string, resourceUiText, omw.a(list, m780Var2, bigDecimal2, strB2));
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return null;
                    }
                    ysaVar = null;
                }
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(ysaVar, this) == y5bVar) {
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

    public a370(lyh[] lyhVarArr, z270 z270Var) {
        this.a = lyhVarArr;
        this.b = z270Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super ysa> myhVar, v1b v1bVar) {
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
