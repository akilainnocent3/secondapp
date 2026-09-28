package defpackage;

import android.text.Editable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalSmsDialogFragment$initViewModel$1$1", f = "TradeAdditionalSmsDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jng0 extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ing0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jng0(ing0 ing0Var, v1b<? super jng0> v1bVar) {
        super(2, v1bVar);
        this.b = ing0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jng0 jng0Var = new jng0(this.b, v1bVar);
        jng0Var.a = obj;
        return jng0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((jng0) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ing0 ing0Var = this.b;
        l9h l9hVar = ing0Var.f;
        if (l9hVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Editable text = l9hVar.d.getText();
        if (!Intrinsics.g(text != null ? text.toString() : null, str)) {
            l9h l9hVar2 = ing0Var.f;
            if (l9hVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            l9hVar2.d.setText(str);
        }
        return Unit.a;
    }
}
