package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalCheckHoldingDialogFragment$initViewModel$1$1", f = "TradeAdditionalCheckHoldingDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rkg0 extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ qkg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkg0(qkg0 qkg0Var, v1b<? super rkg0> v1bVar) {
        super(2, v1bVar);
        this.b = qkg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rkg0 rkg0Var = new rkg0(this.b, v1bVar);
        rkg0Var.a = obj;
        return rkg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
        return ((rkg0) create(uiText, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        UiText uiText = (UiText) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        qkg0 qkg0Var = this.b;
        cle cleVar = qkg0Var.f;
        if (cleVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        CharSequence text = cleVar.d.getText();
        String string = text != null ? text.toString() : null;
        Context contextRequireContext = qkg0Var.requireContext();
        contextRequireContext.getClass();
        if (!Intrinsics.g(string, uiText.e(contextRequireContext))) {
            cle cleVar2 = qkg0Var.f;
            if (cleVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView = cleVar2.d;
            Context contextRequireContext2 = qkg0Var.requireContext();
            contextRequireContext2.getClass();
            textView.setText(uiText.e(contextRequireContext2));
        }
        return Unit.a;
    }
}
