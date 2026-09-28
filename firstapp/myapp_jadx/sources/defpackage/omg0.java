package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalPinDialogFragment$initViewModel$1$2", f = "TradeAdditionalPinDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class omg0 extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ mmg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omg0(mmg0 mmg0Var, v1b<? super omg0> v1bVar) {
        super(2, v1bVar);
        this.b = mmg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        omg0 omg0Var = new omg0(this.b, v1bVar);
        omg0Var.a = obj;
        return omg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
        return ((omg0) create(uiText, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        UiText uiText = (UiText) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        mmg0 mmg0Var = this.b;
        h9h h9hVar = mmg0Var.f;
        CharSequence charSequenceE = null;
        if (h9hVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ClearEditText clearEditText = h9hVar.c;
        if (uiText != null) {
            Context contextRequireContext = mmg0Var.requireContext();
            contextRequireContext.getClass();
            charSequenceE = uiText.e(contextRequireContext);
        }
        clearEditText.setError(charSequenceE);
        return Unit.a;
    }
}
