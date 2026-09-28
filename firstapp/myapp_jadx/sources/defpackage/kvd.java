package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositConfirmCompletedViewModel$confirmAndDialUssd$1", f = "DepositConfirmCompletedViewModel.kt", l = {138}, m = "invokeSuspend", v = 2)
public final class kvd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ jvd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvd(jvd jvdVar, v1b<? super kvd> v1bVar) {
        super(2, v1bVar);
        this.b = jvdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kvd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kvd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        UiText uiText;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            jvd jvdVar = this.b;
            ld00 ld00Var = (ld00) jvdVar.D.getValue();
            if (ld00Var == null || (uiText = ld00Var.g) == null) {
                return Unit.a;
            }
            ku90<a> ku90Var = jvdVar.i;
            ku90<spg0> ku90Var2 = jvdVar.z;
            this.a = 1;
            if (gi8.a(ku90Var, uiText, ku90Var2, this) == y5bVar) {
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
