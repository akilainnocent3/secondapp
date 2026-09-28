package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawActivity;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawActivity$initViewModel$1$12", f = "CommonMobileMoneyWithdrawActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class eg8 extends tje0 implements Function2<vw<BigDecimal>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ CommonMobileMoneyWithdrawActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg8(CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity, v1b<? super eg8> v1bVar) {
        super(2, v1bVar);
        this.b = commonMobileMoneyWithdrawActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        eg8 eg8Var = new eg8(this.b, v1bVar);
        eg8Var.a = obj;
        return eg8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vw<BigDecimal> vwVar, v1b<? super Unit> v1bVar) {
        return ((eg8) create(vwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        vw vwVar = (vw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity = this.b;
        qc qcVar = commonMobileMoneyWithdrawActivity.d;
        if (qcVar != null) {
            qcVar.b.setHint(commonMobileMoneyWithdrawActivity.getCMSString(R.string.page_payment__min_vnum, s5y.c((BigDecimal) vwVar.a)));
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
