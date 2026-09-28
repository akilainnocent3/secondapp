package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.uiprocess.RealtimeInsufficientFundsUiProcess$invoke$onSecondaryActionClicked$1", f = "RealtimeInsufficientFundsUiProcess.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class ub40 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vb40 b;
    public final /* synthetic */ vtw<a> c;
    public final /* synthetic */ a2g0 d;
    public final /* synthetic */ vtw<spg0> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub40(vb40 vb40Var, vtw<a> vtwVar, a2g0 a2g0Var, vtw<spg0> vtwVar2, v1b<? super ub40> v1bVar) {
        super(1, v1bVar);
        this.b = vb40Var;
        this.c = vtwVar;
        this.d = a2g0Var;
        this.e = vtwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new ub40(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((ub40) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b.a.a(new jnd("real_time_insufficient_fund", "secondary", "common_functions__check_balance_with_network"), k00.d);
            UiText uiText = this.d.b;
            this.a = 1;
            if (gi8.b(this.c, uiText, this.e, this) == y5bVar) {
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
