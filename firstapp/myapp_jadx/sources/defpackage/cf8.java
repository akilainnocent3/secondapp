package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import com.sporty.android.core.model.pocket.deposit.PaymentNetworkItem;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.deposit.momo.CommonMobileMoneyDepositViewModel$deposit$1", f = "CommonMobileMoneyDepositViewModel.kt", l = {213}, m = "invokeSuspend", v = 2)
public final class cf8 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ df8 b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.UGANDA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf8(df8 df8Var, v1b<? super cf8> v1bVar) {
        super(2, v1bVar);
        this.b = df8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cf8(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cf8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objF;
        v8 v8Var;
        String str;
        String str2;
        jvd0 jvd0Var;
        df8 df8Var = this.b;
        ssw<cx> sswVar = df8Var.H;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            BigDecimal bigDecimal = df8Var.M;
            BigDecimal bigDecimal2 = df8Var.z;
            if (bigDecimal2 == null) {
                Intrinsics.n("maxDepositAmount");
                throw null;
            }
            if (bigDecimal.compareTo(bigDecimal2) > 0) {
                cx cxVarD = sswVar.d();
                if (cxVarD != null) {
                    String str3 = df8Var.B;
                    if (str3 == null) {
                        Intrinsics.n("displayMaxDepositAmount");
                        throw null;
                    }
                    sswVar.m(cx.a(cxVarD, new kcg.b(str3)));
                }
                return Unit.a;
            }
            BigDecimal bigDecimal3 = df8Var.M;
            BigDecimal bigDecimal4 = df8Var.y;
            if (bigDecimal4 == null) {
                Intrinsics.n("minDepositAmount");
                throw null;
            }
            if (bigDecimal3.compareTo(bigDecimal4) < 0) {
                cx cxVarD2 = sswVar.d();
                if (cxVarD2 != null) {
                    String str4 = df8Var.A;
                    if (str4 == null) {
                        Intrinsics.n("displayMinDepositAmount");
                        throw null;
                    }
                    sswVar.m(cx.a(cxVarD2, new kcg.f(str4)));
                }
                return Unit.a;
            }
            PaymentNetworkItem paymentNetworkItem = (PaymentNetworkItem) df8Var.Y.a.getValue();
            if (paymentNetworkItem != null ? Intrinsics.g(paymentNetworkItem.getDisplayAlert(), Boolean.TRUE) : false) {
                ku90<com.sporty.android.common.uievent.a> ku90Var = df8Var.Z;
                StringUiText stringUiText = vch0.a;
                ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__channel_issue_detected__NG);
                ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_payment__channel_issue_content__NG);
                ResourceUiText resourceUiText3 = new ResourceUiText(R.string.page_payment__use_alternative__NG);
                ResourceUiText resourceUiText4 = new ResourceUiText(R.string.common_functions__continue);
                this.a = 1;
                objF = b.f(ku90Var, resourceUiText, resourceUiText2, null, resourceUiText3, resourceUiText4, null, null, this, 228);
                if (objF == y5bVar) {
                    return y5bVar;
                }
            }
            BigDecimal bigDecimal5 = df8Var.M;
            v8Var = df8Var.J;
            if (v8Var != null) {
                str = v8Var.a;
            } else {
                str = null;
            }
            BigDecimal bigDecimalC = p54.c(bigDecimal5);
            PaymentChannel paymentChannel = df8Var.C;
            paymentChannel.getClass();
            int payChId = paymentChannel.getPayChId();
            if (df8Var.f.getCountryCode() == CountryCodeName.UGANDA) {
                str2 = "UGX";
            } else {
                str2 = null;
            }
            p6e p6eVar = new p6e(payChId, str, str2, bigDecimalC);
            ha00 ha00Var = df8Var.b;
            et7 et7VarD = o8i0.d(df8Var);
            bf8 bf8Var = new bf8(0, df8Var, p6eVar);
            ha00Var.getClass();
            jvd0Var = ha00Var.b;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            ha00Var.b = kzh.d(new g1i(new yzh(new xzh(new ma00(ha00Var.a.a(new eal().j(p6eVar))), new na00(2, null)), new oa00(3, null)), new pa00(bf8Var, null)), et7VarD);
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        objF = obj;
        if (!Intrinsics.g((AlertDialogCallbackType) objF, AlertDialogCallbackType.Negative.a)) {
            return Unit.a;
        }
        BigDecimal bigDecimal6 = df8Var.M;
        v8Var = df8Var.J;
        if (v8Var != null) {
            str = v8Var.a;
        } else {
            str = null;
        }
        BigDecimal bigDecimalC2 = p54.c(bigDecimal6);
        PaymentChannel paymentChannel2 = df8Var.C;
        paymentChannel2.getClass();
        int payChId2 = paymentChannel2.getPayChId();
        if (df8Var.f.getCountryCode() == CountryCodeName.UGANDA) {
            str2 = "UGX";
        } else {
            str2 = null;
        }
        p6e p6eVar2 = new p6e(payChId2, str, str2, bigDecimalC2);
        ha00 ha00Var2 = df8Var.b;
        et7 et7VarD2 = o8i0.d(df8Var);
        bf8 bf8Var2 = new bf8(0, df8Var, p6eVar2);
        ha00Var2.getClass();
        jvd0Var = ha00Var2.b;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        ha00Var2.b = kzh.d(new g1i(new yzh(new xzh(new ma00(ha00Var2.a.a(new eal().j(p6eVar2))), new na00(2, null)), new oa00(3, null)), new pa00(bf8Var2, null)), et7VarD2);
        return Unit.a;
    }
}
