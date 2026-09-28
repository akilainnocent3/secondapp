package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$initUnlockRewardLabelState$1", f = "MeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zgv extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ rhv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgv(rhv rhvVar, v1b<? super zgv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zgv zgvVar = new zgv(this.b, v1bVar);
        zgvVar.a = ((Boolean) obj).booleanValue();
        return zgvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((zgv) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.O;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, cgv.a((cgv) value, false, null, null, null, null, null, 0, 0, null, null, null, z, false, null, 114687)));
        return Unit.a;
    }
}
