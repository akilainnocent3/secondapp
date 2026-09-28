package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.fragment.SwitchPaymentItemV2DialogFragment$initViewModel$1$3", f = "SwitchPaymentItemV2DialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qoe0 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ loe0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoe0(loe0 loe0Var, v1b<? super qoe0> v1bVar) {
        super(2, v1bVar);
        this.b = loe0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qoe0 qoe0Var = new qoe0(this.b, v1bVar);
        qoe0Var.a = ((Boolean) obj).booleanValue();
        return qoe0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((qoe0) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        bme bmeVar = this.b.y;
        if (z) {
            if (bmeVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            bmeVar.z.setVisibility(0);
        } else {
            if (bmeVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            bmeVar.z.setVisibility(8);
        }
        return Unit.a;
    }
}
