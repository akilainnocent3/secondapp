package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class gi8 {
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object a(vtw vtwVar, UiText uiText, vtw vtwVar2, x1b x1bVar) {
        ai8 ai8Var;
        UiText uiText2;
        if (x1bVar instanceof ai8) {
            ai8Var = (ai8) x1bVar;
            int i = ai8Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ai8Var.d = i - Integer.MIN_VALUE;
            } else {
                ai8Var = new ai8(x1bVar);
            }
        } else {
            ai8Var = new ai8(x1bVar);
        }
        ai8 ai8Var2 = ai8Var;
        Object objF = ai8Var2.c;
        y5b y5bVar = y5b.a;
        int i2 = ai8Var2.d;
        if (i2 == 0) {
            uj50.b(objF);
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.common_functions__cancel);
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.common_functions__call);
            Integer num = new Integer(R.style.Widget_Payment_PendingRequest_AlertDialog);
            ai8Var2.a = uiText;
            ai8Var2.b = vtwVar2;
            ai8Var2.d = 1;
            objF = b.f(vtwVar, uiText, null, null, resourceUiText2, resourceUiText, num, null, ai8Var2, 166);
            if (objF == y5bVar) {
                return y5bVar;
            }
            uiText2 = uiText;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vtwVar2 = ai8Var2.b;
            uiText2 = ai8Var2.a;
            uj50.b(objF);
        }
        AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) objF;
        alertDialogCallbackType.getClass();
        if (((AlertDialogCallbackType) (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive ? objF : null)) != null) {
            int i3 = vpg0.a;
            vtwVar2.getClass();
            uiText2.getClass();
            vtwVar2.a(new spg0.h(uiText2));
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object b(vtw vtwVar, UiText uiText, vtw vtwVar2, x1b x1bVar) {
        bi8 bi8Var;
        if (x1bVar instanceof bi8) {
            bi8Var = (bi8) x1bVar;
            int i = bi8Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bi8Var.d = i - Integer.MIN_VALUE;
            } else {
                bi8Var = new bi8(x1bVar);
            }
        } else {
            bi8Var = new bi8(x1bVar);
        }
        bi8 bi8Var2 = bi8Var;
        Object objF = bi8Var2.c;
        y5b y5bVar = y5b.a;
        int i2 = bi8Var2.d;
        if (i2 == 0) {
            uj50.b(objF);
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__cta_link_warning);
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.common_functions__cancel);
            ResourceUiText resourceUiText3 = new ResourceUiText(R.string.common_functions__proceed);
            Integer num = new Integer(R.style.Widget_Payment_PendingRequest_AlertDialog);
            bi8Var2.a = uiText;
            bi8Var2.b = vtwVar2;
            bi8Var2.d = 1;
            objF = b.f(vtwVar, null, null, resourceUiText, resourceUiText3, resourceUiText2, num, null, bi8Var2, 163);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vtwVar2 = bi8Var2.b;
            uiText = bi8Var2.a;
            uj50.b(objF);
        }
        AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) objF;
        alertDialogCallbackType.getClass();
        if (((AlertDialogCallbackType) (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive ? objF : null)) != null) {
            int i3 = vpg0.a;
            vtwVar2.getClass();
            uiText.getClass();
            vtwVar2.a(new spg0.i(uiText));
        }
        return Unit.a;
    }

    public static void c(vtw vtwVar, ResourceUiText resourceUiText, ResourceUiText resourceUiText2, ResourceUiText resourceUiText3, ResourceUiText resourceUiText4, Function1 function1, int i) {
        if ((i & 1) != 0) {
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_payment__pending_request);
        }
        ResourceUiText resourceUiText5 = resourceUiText;
        ResourceUiText resourceUiText6 = (i & 2) != 0 ? null : resourceUiText2;
        ResourceUiText resourceUiText7 = (i & 4) != 0 ? null : resourceUiText3;
        StringUiText stringUiText2 = vch0.a;
        ResourceUiText resourceUiText8 = new ResourceUiText(R.string.common_functions__home);
        ResourceUiText resourceUiText9 = (i & 16) != 0 ? new ResourceUiText(R.string.common_functions__transactions) : resourceUiText4;
        String str = (i & 32) == 0 ? "WAITING_FOR_BANK_PENDING_REQUEST" : null;
        vtwVar.getClass();
        vtwVar.a(new a.h(resourceUiText5, resourceUiText7, resourceUiText6, resourceUiText8, resourceUiText9, false, Integer.valueOf(R.style.Widget_Payment_PendingRequest_AlertDialog), str, new yh8(function1, 0)));
    }
}
