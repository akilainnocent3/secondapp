package defpackage;

import android.text.Editable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalPinDialogFragment$initViewModel$1$1", f = "TradeAdditionalPinDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nmg0 extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ mmg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmg0(mmg0 mmg0Var, v1b<? super nmg0> v1bVar) {
        super(2, v1bVar);
        this.b = mmg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nmg0 nmg0Var = new nmg0(this.b, v1bVar);
        nmg0Var.a = obj;
        return nmg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((nmg0) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        mmg0 mmg0Var = this.b;
        h9h h9hVar = mmg0Var.f;
        if (h9hVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Editable text = h9hVar.c.getText();
        if (!Intrinsics.g(text != null ? text.toString() : null, str)) {
            h9h h9hVar2 = mmg0Var.f;
            if (h9hVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            h9hVar2.c.setText(str);
        }
        return Unit.a;
    }
}
