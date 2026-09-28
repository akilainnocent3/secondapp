package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class vb5 extends saj implements gaj<Throwable, h77<Object>, CoroutineContext, Unit> {
    public vb5(tb5 tb5Var) {
        super(3, tb5Var, tb5.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // defpackage.gaj
    public final Unit invoke(Throwable th, h77<Object> h77Var, CoroutineContext coroutineContext) {
        Object obj = h77Var.a;
        Function1<E, Unit> function1 = ((tb5) this.receiver).b;
        function1.getClass();
        Object objB = h77.b(obj);
        objB.getClass();
        lpy.a(function1, objB, coroutineContext);
        return Unit.a;
    }
}
