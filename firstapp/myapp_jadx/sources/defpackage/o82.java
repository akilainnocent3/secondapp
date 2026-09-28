package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.pocket.common.WhTaxData;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import com.sporty.android.core.model.pocket.withdraw.WithdrawNoticeData;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o82.c;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o82 extends k72 {
    public final juh0 Z;
    public final sr10 a0;
    public final shj0 b0;
    public final log0 c0;
    public final ku90<kqj0> d0;
    public final ku90 e0;
    public final v340 f0;
    public final mpe0 g0;

    public static final class a implements lyh<BigDecimal> {
        public final /* synthetic */ f1i a;

        /* JADX INFO: renamed from: o82$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.BaseWithdrawViewModel$special$$inlined$map$1", f = "BaseWithdrawViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0916a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0916a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: o82$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.BaseWithdrawViewModel$special$$inlined$map$1$2", f = "BaseWithdrawViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0917a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0917a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0917a c0917a;
                if (v1bVar instanceof C0917a) {
                    c0917a = (C0917a) v1bVar;
                    int i = c0917a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0917a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0917a = new C0917a(v1bVar);
                    }
                } else {
                    c0917a = new C0917a(v1bVar);
                }
                Object obj2 = c0917a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0917a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    T t = ((vw) obj).a;
                    c0917a.b = 1;
                    if (this.a.emit(t, c0917a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(f1i f1iVar) {
            this.a = f1iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super BigDecimal> myhVar, v1b v1bVar) {
            C0916a c0916a;
            if (v1bVar instanceof C0916a) {
                c0916a = (C0916a) v1bVar;
                int i = c0916a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0916a.b = i - Integer.MIN_VALUE;
                } else {
                    c0916a = new C0916a(v1bVar);
                }
            } else {
                c0916a = new C0916a(v1bVar);
            }
            Object obj = c0916a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0916a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0916a.b = 1;
                if (this.a.collect(bVar, c0916a) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.BaseWithdrawViewModel$whTaxStateFlow$1", f = "BaseWithdrawViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<xyx, WithDrawInfo, v1b<? super BigDecimal>, Object> {
        public /* synthetic */ xyx a;
        public /* synthetic */ WithDrawInfo b;

        @Override // defpackage.gaj
        public final Object invoke(xyx xyxVar, WithDrawInfo withDrawInfo, v1b<? super BigDecimal> v1bVar) {
            b bVar = new b(3, v1bVar);
            bVar.a = xyxVar;
            bVar.b = withDrawInfo;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            xyx xyxVar = this.a;
            WithDrawInfo withDrawInfo = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            WhTaxData whTaxData = withDrawInfo.whTaxData;
            if (whTaxData != null) {
                String string = xyxVar.c.toString();
                string.getClass();
                BigDecimal bigDecimalCalculateWhTax = whTaxData.calculateWhTax(string);
                if (bigDecimalCalculateWhTax != null) {
                    return bigDecimalCalculateWhTax;
                }
            }
            return BigDecimal.ZERO;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.BaseWithdrawViewModel$withdrawAmountValidationFlow$2$1", f = "BaseWithdrawViewModel.kt", l = {87}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<xyx, Integer, v1b<? super xhj0>, Object> {
        public int a;
        public /* synthetic */ xyx b;
        public /* synthetic */ int c;

        public c(v1b<? super c> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(xyx xyxVar, Integer num, v1b<? super xhj0> v1bVar) {
            int iIntValue = num.intValue();
            c cVar = o82.this.new c(v1bVar);
            cVar.b = xyxVar;
            cVar.c = iIntValue;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            xyx xyxVar = this.b;
            int i = this.c;
            y5b y5bVar = y5b.a;
            int i2 = this.a;
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            BigDecimal bigDecimal = xyxVar.c;
            o82 o82Var = o82.this;
            y200 y200VarB1 = o82Var.B1();
            y200VarB1.getClass();
            this.b = null;
            this.c = i;
            this.a = 1;
            Object objK1 = o82Var.K1(bigDecimal, i, (y300) y200VarB1, this);
            return objK1 == y5bVar ? y5bVar : objK1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o82(uyx uyxVar, juh0 juh0Var, uy0 uy0Var, sr10 sr10Var, d100 d100Var, lyz lyzVar, wl wlVar, psm psmVar, mgb0 mgb0Var, shj0 shj0Var) {
        super(uyxVar, uy0Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var);
        uy0Var.getClass();
        sr10Var.getClass();
        d100Var.getClass();
        lyzVar.getClass();
        wlVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        this.Z = juh0Var;
        this.a0 = sr10Var;
        this.b0 = shj0Var;
        this.c0 = log0.b;
        ku90<kqj0> ku90Var = new ku90<>();
        this.d0 = ku90Var;
        this.e0 = ku90Var;
        vl50 vl50VarF = bm50.f(sr10Var.j0(pu0.b.a));
        et7 et7VarD = o8i0.d(this);
        WithDrawInfo withDrawInfo = WithDrawInfo.getDefault();
        kwd0 kwd0Var = q490.a.a;
        this.f0 = e1i.e(new n1i(this.T, e1i.e(vl50VarF, et7VarD, kwd0Var, withDrawInfo), new b(3, null)), o8i0.d(this), kwd0Var, BigDecimal.ZERO);
        this.g0 = hwr.b(new Function0() { // from class: l82
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                o82 o82Var = this.a;
                return new n1i(o82Var.T, o82Var.G1(), o82Var.new c(null));
            }
        });
    }

    @Override // defpackage.k72
    /* JADX INFO: renamed from: C1 */
    public final log0 getT0() {
        return this.c0;
    }

    public abstract uwd0<Integer> G1();

    public lyh<xhj0> H1() {
        return (lyh) this.g0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object I1(x1b x1bVar) {
        n82 n82Var;
        WithdrawNoticeData withdrawNoticeData;
        if (x1bVar instanceof n82) {
            n82Var = (n82) x1bVar;
            int i = n82Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                n82Var.d = i - Integer.MIN_VALUE;
            } else {
                n82Var = new n82(this, x1bVar);
            }
        } else {
            n82Var = new n82(this, x1bVar);
        }
        Object objQ = n82Var.b;
        y5b y5bVar = y5b.a;
        int i2 = n82Var.d;
        boolean z = true;
        if (i2 == 0) {
            uj50.b(objQ);
            yzh yzhVarA = bm50.a(new m82(this.a0.K()));
            n82Var.d = 1;
            objQ = bm50.q(yzhVarA, n82Var);
            if (objQ != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(objQ);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            withdrawNoticeData = n82Var.a;
            uj50.b(objQ);
        }
        if (Intrinsics.g((AlertDialogCallbackType) objQ, AlertDialogCallbackType.Positive.a) || (withdrawNoticeData.getAbleToWithdraw() != null && !Intrinsics.g(withdrawNoticeData.getAbleToWithdraw(), Boolean.TRUE))) {
            z = false;
        }
        return Boolean.valueOf(z);
        WithdrawNoticeData withdrawNoticeData2 = (WithdrawNoticeData) objQ;
        if (withdrawNoticeData2 != null && withdrawNoticeData2.getNeedNotice()) {
            f00 f00Var = vgb0.a;
            vgb0.a(AnalyticsEvent.EVENT_WITHDRAW_NOTICE_VIEW);
            StringUiText stringUiTextE = vch0.e(withdrawNoticeData2.getTitle());
            StringUiText stringUiTextE2 = vch0.e(withdrawNoticeData2.getMessage());
            n82Var.a = withdrawNoticeData2;
            n82Var.d = 2;
            int i3 = vpg0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.common_functions__ok);
            bc6 bc6Var = new bc6(1, yzo.b(n82Var));
            bc6Var.q();
            this.v.a(new spg0.l(stringUiTextE, stringUiTextE2, resourceUiText, null, R.color.brand_quaternary, R.color.text_type1_primary, false, new upg0(bc6Var)));
            Object objO = bc6Var.o();
            if (objO != y5bVar) {
                objQ = objO;
                withdrawNoticeData = withdrawNoticeData2;
                if (Intrinsics.g((AlertDialogCallbackType) objQ, AlertDialogCallbackType.Positive.a)) {
                    z = false;
                } else {
                    z = false;
                }
            }
            return y5bVar;
        }
        return Boolean.valueOf(z);
    }

    public abstract jvd0 J1();

    public Object K1(BigDecimal bigDecimal, int i, y300 y300Var, c cVar) {
        return this.Z.b(bigDecimal, new Integer(i), y300Var, cVar);
    }

    @Override // defpackage.k72
    public final lyh<BigDecimal> y1() {
        y200 y200VarB1 = B1();
        y200VarB1.getClass();
        return new a(new f1i(this.b0.a((y300) y200VarB1)));
    }
}
