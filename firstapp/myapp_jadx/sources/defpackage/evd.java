package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositConfirmCompletedDialogFragment$initViewModel$1$3", f = "DepositConfirmCompletedDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class evd extends tje0 implements Function2<spg0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ gvd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evd(gvd gvdVar, v1b<? super evd> v1bVar) {
        super(2, v1bVar);
        this.b = gvdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        evd evdVar = new evd(this.b, v1bVar);
        evdVar.a = obj;
        return evdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(spg0 spg0Var, v1b<? super Unit> v1bVar) {
        return ((evd) create(spg0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        spg0 spg0Var = (spg0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (spg0Var instanceof spg0.h) {
            gvd gvdVar = this.b;
            Context contextRequireContext = gvdVar.requireContext();
            contextRequireContext.getClass();
            UiText uiText = ((spg0.h) spg0Var).a;
            Context contextRequireContext2 = gvdVar.requireContext();
            contextRequireContext2.getClass();
            vxo.b(contextRequireContext, uiText.e(contextRequireContext2).toString());
        }
        return Unit.a;
    }
}
