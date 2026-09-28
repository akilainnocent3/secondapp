package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$initResponseListeners$2", f = "FruitHuntFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class f7j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ u6j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7j(u6j u6jVar, v1b<? super f7j> v1bVar) {
        super(2, v1bVar);
        this.a = u6jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f7j(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f7j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        u6j u6jVar = this.a;
        ((n8j) u6jVar.j0.getValue()).e.f(u6jVar.getViewLifecycleOwner(), new u6j.h(new xee(u6jVar, 1)));
        return Unit.a;
    }
}
