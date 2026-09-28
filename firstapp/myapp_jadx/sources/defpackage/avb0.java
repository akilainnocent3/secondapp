package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$showOnboarding$1$1$1$1", f = "SportyHeroCompose.kt", l = {}, m = "invokeSuspend", v = 1)
public final class avb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ int a;
    public final /* synthetic */ qub0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avb0(int i, qub0 qub0Var, v1b<? super avb0> v1bVar) {
        super(2, v1bVar);
        this.a = i;
        this.b = qub0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new avb0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((avb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = this.a;
        if (i == 0 || i == 1) {
            this.b.z4();
        }
        return Unit.a;
    }
}
