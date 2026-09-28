package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntBase$setupCmsData$1", f = "FruitHuntBase.kt", l = {}, m = "invokeSuspend", v = 1)
public final class n3j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ n2j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3j(n2j n2jVar, v1b<? super n3j> v1bVar) {
        super(2, v1bVar);
        this.a = n2jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new n3j(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n3j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        n2j n2jVar = this.a;
        ((fq5) n2jVar.w.getValue()).c.f(n2jVar.getViewLifecycleOwner(), new n2j.c(new m3j(n2jVar, 0)));
        return Unit.a;
    }
}
