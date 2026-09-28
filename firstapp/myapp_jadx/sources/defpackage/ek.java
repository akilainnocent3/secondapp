package defpackage;

import com.sporty.android.common.uievent.CustomAlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.payment.deposit.presentation.viewmodel.AddNewMobileNumberViewModel$checkBindNewPhoneResult$1", f = "AddNewMobileNumberViewModel.kt", l = {229}, m = "invokeSuspend", v = 2)
public final class ek extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ dk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(dk dkVar, v1b<? super ek> v1bVar) {
        super(2, v1bVar);
        this.b = dkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ek(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ek) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objG;
        y5b y5bVar = y5b.a;
        int i = this.a;
        dk dkVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = dkVar.C;
            String number = ((bk) wwd0Var.getValue()).getNumber();
            StringUiText stringUiText = vch0.a;
            bk.d dVar = new bk.d(new ResourceUiText(R.string.page_payment__please_try_again_in_a_few_minutes), number);
            wwd0Var.getClass();
            wwd0Var.k(null, dVar);
            ku90<a> ku90Var = dkVar.v;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__unable_to_add_number);
            ConcatUiText concatUiText = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.page_payment__unable_to_add_mobile_number_with_provider_tip), new ResourceUiText(R.string.app_common__blank_space), new ResourceUiText(R.string.common_functions__customer_service), new StringUiText(".")});
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.common_functions__customer_service);
            this.a = 1;
            objG = b.g(ku90Var, resourceUiText, concatUiText, resourceUiText2, null, null, null, this, 500);
            if (objG == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objG = obj;
        }
        if (Intrinsics.g((CustomAlertDialogCallbackType) objG, CustomAlertDialogCallbackType.HyperlinkInMessage.a)) {
            b.c(dkVar.v, snb0.HELP);
        }
        return Unit.a;
    }
}
