package defpackage;

import android.text.Editable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalOtpDialogFragment$initViewModel$1$1", f = "TradeAdditionalOtpDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class plg0 extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ olg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plg0(olg0 olg0Var, v1b<? super plg0> v1bVar) {
        super(2, v1bVar);
        this.b = olg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        plg0 plg0Var = new plg0(this.b, v1bVar);
        plg0Var.a = obj;
        return plg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((plg0) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        olg0 olg0Var = this.b;
        f9h f9hVar = olg0Var.f;
        if (f9hVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Editable text = f9hVar.d.getText();
        if (!Intrinsics.g(text != null ? text.toString() : null, str)) {
            f9h f9hVar2 = olg0Var.f;
            if (f9hVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            f9hVar2.d.setText(str);
        }
        return Unit.a;
    }
}
