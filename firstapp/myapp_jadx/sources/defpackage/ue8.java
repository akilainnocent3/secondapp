package defpackage;

import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.deposit.momo.CommonMobileMoneyDepositFragment$initViewModel$1$13", f = "CommonMobileMoneyDepositFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ue8 extends tje0 implements Function2<lk50<? extends BigDecimal>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ re8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue8(re8 re8Var, v1b<? super ue8> v1bVar) {
        super(2, v1bVar);
        this.b = re8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ue8 ue8Var = new ue8(this.b, v1bVar);
        ue8Var.a = obj;
        return ue8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends BigDecimal> lk50Var, v1b<? super Unit> v1bVar) {
        return ((ue8) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        re8.a aVar = re8.P;
        re8 re8Var = this.b;
        re8Var.n0().f.setText(lk50Var instanceof lk50.c ? n4d.a((BigDecimal) ((lk50.c) lk50Var).a) : sn5.d(re8Var, R.string.app_common__no_cash, new Object[0]));
        return Unit.a;
    }
}
