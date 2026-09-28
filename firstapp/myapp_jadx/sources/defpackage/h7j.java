package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$initResponseListeners$3", f = "FruitHuntFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class h7j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ u6j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7j(u6j u6jVar, v1b<? super h7j> v1bVar) {
        super(2, v1bVar);
        this.a = u6jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h7j(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h7j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        u6j u6jVar = this.a;
        u6jVar.t0().U.f(u6jVar.getViewLifecycleOwner(), new u6j.h(new g7j(u6jVar, 0)));
        return Unit.a;
    }
}
