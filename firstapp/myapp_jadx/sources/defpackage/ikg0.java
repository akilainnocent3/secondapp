package defpackage;

import android.text.Editable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalBirthdayDialogFragment$initViewModel$1$1", f = "TradeAdditionalBirthdayDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ikg0 extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hkg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikg0(hkg0 hkg0Var, v1b<? super ikg0> v1bVar) {
        super(2, v1bVar);
        this.b = hkg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ikg0 ikg0Var = new ikg0(this.b, v1bVar);
        ikg0Var.a = obj;
        return ikg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((ikg0) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        hkg0 hkg0Var = this.b;
        b9h b9hVar = hkg0Var.f;
        if (b9hVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Editable text = b9hVar.c.getText();
        if (!Intrinsics.g(text != null ? text.toString() : null, str)) {
            b9h b9hVar2 = hkg0Var.f;
            if (b9hVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            b9hVar2.c.setText(str);
        }
        return Unit.a;
    }
}
