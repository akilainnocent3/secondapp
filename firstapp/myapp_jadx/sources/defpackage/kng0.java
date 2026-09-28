package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalSmsDialogFragment$initViewModel$1$2", f = "TradeAdditionalSmsDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kng0 extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ing0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kng0(ing0 ing0Var, v1b<? super kng0> v1bVar) {
        super(2, v1bVar);
        this.b = ing0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kng0 kng0Var = new kng0(this.b, v1bVar);
        kng0Var.a = obj;
        return kng0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
        return ((kng0) create(uiText, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        UiText uiText = (UiText) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ing0 ing0Var = this.b;
        l9h l9hVar = ing0Var.f;
        CharSequence charSequenceE = null;
        if (l9hVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ClearEditText clearEditText = l9hVar.d;
        if (uiText != null) {
            Context contextRequireContext = ing0Var.requireContext();
            contextRequireContext.getClass();
            charSequenceE = uiText.e(contextRequireContext);
        }
        clearEditText.setError(charSequenceE);
        return Unit.a;
    }
}
