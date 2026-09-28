package defpackage;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.snackbar.Snackbar;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.SwitchPaymentItemV2DialogFragment$initViewModel$1$2", f = "SwitchPaymentItemV2DialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class poe0 extends tje0 implements Function2<vne0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ loe0 b;
    public final /* synthetic */ xne0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public poe0(loe0 loe0Var, xne0 xne0Var, v1b<? super poe0> v1bVar) {
        super(2, v1bVar);
        this.b = loe0Var;
        this.c = xne0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        poe0 poe0Var = new poe0(this.b, this.c, v1bVar);
        poe0Var.a = obj;
        return poe0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vne0 vne0Var, v1b<? super Unit> v1bVar) {
        return ((poe0) create(vne0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        vne0 vne0Var = (vne0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zG = Intrinsics.g(vne0Var, vne0.b.a);
        loe0 loe0Var = this.b;
        if (zG) {
            loe0Var.dismissAllowingStateLoss();
        } else if (vne0Var instanceof vne0.e) {
            if (!((wne0) this.c.c.getValue()).d) {
                loe0Var.dismissAllowingStateLoss();
            }
        } else if (vne0Var instanceof vne0.f) {
            UiText uiText = ((vne0.f) vne0Var).a;
            Snackbar snackbar = loe0Var.C;
            if (snackbar != null) {
                snackbar.b(3);
            }
            bme bmeVar = loe0Var.y;
            Snackbar snackbar2 = null;
            if (bmeVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ConstraintLayout constraintLayout = bmeVar.a;
            constraintLayout.getClass();
            h3a0 h3a0Var = new h3a0(constraintLayout);
            Context contextRequireContext = loe0Var.requireContext();
            contextRequireContext.getClass();
            String string = uiText.e(contextRequireContext).toString();
            string.getClass();
            h3a0Var.b = string;
            Snackbar snackbarA = h3a0Var.a();
            if (snackbarA != null) {
                snackbarA.j();
                snackbar2 = snackbarA;
            }
            loe0Var.C = snackbar2;
        }
        return Unit.a;
    }
}
