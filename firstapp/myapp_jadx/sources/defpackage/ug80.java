package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, 63}, m = "invokeSuspend")
public final class ug80 extends tje0 implements Function2<v5b, v1b<Object>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function1<v5b, Object> c;
    public final /* synthetic */ AtomicReference<tg80<Object>> d;
    public final /* synthetic */ Function2<Object, v1b<Object>, Object> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ug80(Function1<? super v5b, Object> function1, AtomicReference<tg80<Object>> atomicReference, Function2<Object, ? super v1b<Object>, ? extends Object> function2, v1b<? super ug80> v1bVar) {
        super(2, v1bVar);
        this.c = function1;
        this.d = atomicReference;
        this.e = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ug80 ug80Var = new ug80(this.c, this.d, this.e, v1bVar);
        ug80Var.b = obj;
        return ug80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
        return ((ug80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        tg80<Object> tg80Var;
        tg80<Object> tg80Var2;
        y5b y5bVar = y5b.a;
        int i = this.a;
        AtomicReference<tg80<Object>> atomicReference = this.d;
        try {
            if (i == 0) {
                uj50.b(obj);
                v5b v5bVar = (v5b) this.b;
                tg80Var = new tg80<>(i9p.f(v5bVar.getCoroutineContext()), this.c.invoke(v5bVar));
                tg80<Object> andSet = atomicReference.getAndSet(tg80Var);
                if (andSet != null) {
                    c9p c9pVar = andSet.a;
                    this.b = tg80Var;
                    this.a = 1;
                    if (i9p.c(c9pVar, this) != y5bVar) {
                    }
                }
                return y5bVar;
            }
            if (i != 1) {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tg80Var2 = (tg80) this.b;
                try {
                    uj50.b(obj);
                    while (!atomicReference.compareAndSet(tg80Var2, null) && atomicReference.get() == tg80Var2) {
                    }
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    while (!atomicReference.compareAndSet(tg80Var2, null)) {
                    }
                    throw th;
                }
            }
            tg80Var = (tg80) this.b;
            uj50.b(obj);
            Function2<Object, v1b<Object>, Object> function2 = this.e;
            Object obj2 = tg80Var.b;
            this.b = tg80Var;
            this.a = 2;
            obj = function2.invoke(obj2, this);
            if (obj != y5bVar) {
                tg80Var2 = tg80Var;
                while (!atomicReference.compareAndSet(tg80Var2, null)) {
                }
                return obj;
            }
            return y5bVar;
        } catch (Throwable th2) {
            th = th2;
            tg80Var2 = tg80Var;
            while (!atomicReference.compareAndSet(tg80Var2, null) && atomicReference.get() == tg80Var2) {
            }
            throw th;
        }
    }
}
