package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", l = {}, m = "invokeSuspend")
public final class lkw extends tje0 implements Function2<v5b, v1b<? super Integer>, Object> {
    public final /* synthetic */ jkw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkw(jkw jkwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = jkwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lkw(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Integer> v1bVar) {
        return ((lkw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Integer(s290.b.nativeIncrementAndGetCounterValue(((s290) this.a.i.getValue()).a));
    }
}
