package defpackage;

import com.sportybet.android.widget.ProgressButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalPhoneDialogFragment$initViewModel$1$3", f = "TradeAdditionalPhoneDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dmg0 extends tje0 implements Function2<c330, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ amg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmg0(amg0 amg0Var, v1b<? super dmg0> v1bVar) {
        super(2, v1bVar);
        this.b = amg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dmg0 dmg0Var = new dmg0(this.b, v1bVar);
        dmg0Var.a = obj;
        return dmg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c330 c330Var, v1b<? super Unit> v1bVar) {
        return ((dmg0) create(c330Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        c330 c330Var = (c330) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        g9h g9hVar = this.b.f;
        if (g9hVar != null) {
            b330.a((ProgressButton) g9hVar.i, c330Var);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
