package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.vip.presentation.VipOnboardingKt$VipOnboarding$6$1", f = "VipOnboarding.kt", l = {}, m = "invokeSuspend", v = 1)
public final class pdi0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ int a;
    public final /* synthetic */ osw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdi0(int i, osw oswVar, v1b<? super pdi0> v1bVar) {
        super(2, v1bVar);
        this.a = i;
        this.b = oswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pdi0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pdi0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.k(this.a);
        return Unit.a;
    }
}
