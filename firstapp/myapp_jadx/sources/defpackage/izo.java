package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
public final class izo extends tje0 implements Function2<v5b, v1b<Object>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ Function0<Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izo(Function0<Object> function0, v1b<? super izo> v1bVar) {
        super(2, v1bVar);
        this.b = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        izo izoVar = new izo(this.b, v1bVar);
        izoVar.a = obj;
        return izoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
        return ((izo) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Unsafe unsafe;
        long j;
        int intVolatile;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        CoroutineContext coroutineContext = ((v5b) this.a).getCoroutineContext();
        Function0<Object> function0 = this.b;
        try {
            epf0 epf0Var = new epf0();
            epf0Var.f = i9p.g(i9p.f(coroutineContext), epf0Var);
            do {
                unsafe = s0o.a;
                j = epf0.i;
                intVolatile = unsafe.getIntVolatile(epf0Var, j);
                if (intVolatile != 0) {
                    if (intVolatile == 2 || intVolatile == 3) {
                        break;
                        break;
                    }
                    epf0.n(intVolatile);
                    throw null;
                }
            } while (!unsafe.compareAndSwapInt(epf0Var, j, intVolatile, 0));
            try {
                return function0.invoke();
            } finally {
                epf0Var.m();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
