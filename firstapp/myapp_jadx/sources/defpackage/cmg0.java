package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalPhoneDialogFragment$initViewModel$1$2", f = "TradeAdditionalPhoneDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cmg0 extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ amg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmg0(amg0 amg0Var, v1b<? super cmg0> v1bVar) {
        super(2, v1bVar);
        this.b = amg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cmg0 cmg0Var = new cmg0(this.b, v1bVar);
        cmg0Var.a = obj;
        return cmg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
        return ((cmg0) create(uiText, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        UiText uiText = (UiText) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        amg0 amg0Var = this.b;
        g9h g9hVar = amg0Var.f;
        CharSequence charSequenceE = null;
        if (g9hVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ClearEditText clearEditText = (ClearEditText) g9hVar.f;
        if (uiText != null) {
            Context contextRequireContext = amg0Var.requireContext();
            contextRequireContext.getClass();
            charSequenceE = uiText.e(contextRequireContext);
        }
        clearEditText.setError(charSequenceE);
        return Unit.a;
    }
}
