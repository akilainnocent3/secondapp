package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileViewModel$initializeProfileData$4", f = "ProfileViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u130 extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public final /* synthetic */ a230 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u130(a230 a230Var, v1b<? super u130> v1bVar) {
        super(2, v1bVar);
        this.a = a230Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u130(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((u130) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.z;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, j130.a((j130) value, null, null, null, false, null, false, false, false, null, 319)));
        return Unit.a;
    }
}
