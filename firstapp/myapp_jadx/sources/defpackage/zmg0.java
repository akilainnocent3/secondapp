package defpackage;

import android.text.Editable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalSecondOtpDialogFragment$initViewModel$1$1", f = "TradeAdditionalSecondOtpDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zmg0 extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ymg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmg0(ymg0 ymg0Var, v1b<? super zmg0> v1bVar) {
        super(2, v1bVar);
        this.b = ymg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zmg0 zmg0Var = new zmg0(this.b, v1bVar);
        zmg0Var.a = obj;
        return zmg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((zmg0) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ymg0 ymg0Var = this.b;
        i9h i9hVar = ymg0Var.i;
        if (i9hVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Editable text = i9hVar.c.getText();
        if (!Intrinsics.g(text != null ? text.toString() : null, str)) {
            i9h i9hVar2 = ymg0Var.i;
            if (i9hVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            i9hVar2.c.setText(str);
        }
        return Unit.a;
    }
}
