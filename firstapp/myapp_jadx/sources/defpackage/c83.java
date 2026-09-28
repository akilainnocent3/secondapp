package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$showRemoveAllSelectionsDialog$1", f = "BetSlipViewModel.kt", l = {1361}, m = "invokeSuspend", v = 2)
public final class c83 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ q73 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c83(q73 q73Var, v1b<? super c83> v1bVar) {
        super(2, v1bVar);
        this.b = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c83(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c83) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        q73 q73Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            ku90<a> ku90Var = q73Var.k1;
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.component_betslip__confirm_remove_all_title);
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.component_betslip__confirm_remove_all_content);
            ResourceUiText resourceUiText3 = new ResourceUiText(R.string.common_functions__ok);
            ResourceUiText resourceUiText4 = new ResourceUiText(R.string.common_functions__later);
            this.a = 1;
            obj = b.f(ku90Var, resourceUiText, null, resourceUiText2, resourceUiText3, resourceUiText4, null, null, this, 194);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
        alertDialogCallbackType.getClass();
        if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
            ku90<x53> ku90Var2 = q73Var.q1;
            ku90Var2.getClass();
            ku90Var2.a(x53.o.a);
        }
        return Unit.a;
    }
}
