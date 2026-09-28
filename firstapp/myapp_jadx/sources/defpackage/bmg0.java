package defpackage;

import android.text.Editable;
import com.sporty.android.common_ui.widgets.ClearEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalPhoneDialogFragment$initViewModel$1$1", f = "TradeAdditionalPhoneDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bmg0 extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ amg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmg0(amg0 amg0Var, v1b<? super bmg0> v1bVar) {
        super(2, v1bVar);
        this.b = amg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bmg0 bmg0Var = new bmg0(this.b, v1bVar);
        bmg0Var.a = obj;
        return bmg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((bmg0) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        amg0 amg0Var = this.b;
        g9h g9hVar = amg0Var.f;
        if (g9hVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Editable text = ((ClearEditText) g9hVar.f).getText();
        if (!Intrinsics.g(text != null ? text.toString() : null, str)) {
            g9h g9hVar2 = amg0Var.f;
            if (g9hVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ((ClearEditText) g9hVar2.f).setText(str);
        }
        return Unit.a;
    }
}
