package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.CrashFragment$observeLiveData$13", f = "CrashFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class tgb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ fgb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgb(fgb fgbVar, v1b<? super tgb> v1bVar) {
        super(2, v1bVar);
        this.a = fgbVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tgb(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tgb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        fgb fgbVar = this.a;
        fgbVar.k1().J.f(fgbVar.getViewLifecycleOwner(), new fgb.v(new sgb(fgbVar, 0)));
        return Unit.a;
    }
}
