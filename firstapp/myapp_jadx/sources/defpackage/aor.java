package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.vip.presentation.LastHeroStandingTimerKt$LastHeroStandingTimer$3$1$1$1$1$1", f = "LastHeroStandingTimer.kt", l = {}, m = "invokeSuspend", v = 1)
public final class aor extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aor(Function0<Unit> function0, v1b<? super aor> v1bVar) {
        super(2, v1bVar);
        this.a = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new aor(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((aor) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.invoke();
        return Unit.a;
    }
}
