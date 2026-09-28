package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ub5 extends saj implements gaj<Throwable, Object, CoroutineContext, Unit> {
    public ub5(tb5 tb5Var) {
        super(3, tb5Var, tb5.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // defpackage.gaj
    public final Unit invoke(Throwable th, Object obj, CoroutineContext coroutineContext) {
        Function1<E, Unit> function1 = ((tb5) this.receiver).b;
        function1.getClass();
        lpy.a(function1, obj, coroutineContext);
        return Unit.a;
    }
}
