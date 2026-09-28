package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {211, 167}, m = "invokeSuspend")
public final class ouw extends tje0 implements Function2<v5b, v1b<Object>, Object> {
    public quw a;
    public Object b;
    public Object c;
    public puw d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ huw i;
    public final /* synthetic */ puw v;
    public final /* synthetic */ Function2<Object, v1b<Object>, Object> w;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ouw(huw huwVar, puw puwVar, Function2<Object, ? super v1b<Object>, ? extends Object> function2, Object obj, v1b<? super ouw> v1bVar) {
        super(2, v1bVar);
        this.i = huwVar;
        this.v = puwVar;
        this.w = function2;
        this.y = obj;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ouw ouwVar = new ouw(this.i, this.v, this.w, this.y, v1bVar);
        ouwVar.f = obj;
        return ouwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
        return ((ouw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, quw] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        puw.a aVar;
        puw puwVar;
        quw quwVar;
        Function2<Object, v1b<Object>, Object> function2;
        Object obj2;
        puw puwVar2;
        Throwable th;
        puw.a aVar2;
        quw quwVar2;
        AtomicReference<puw.a> atomicReference;
        AtomicReference<puw.a> atomicReference2;
        y5b y5bVar = y5b.a;
        ?? r1 = this.e;
        try {
            try {
                if (r1 == 0) {
                    uj50.b(obj);
                    CoroutineContext.Element element = ((v5b) this.f).getCoroutineContext().get(c9p.b.a);
                    element.getClass();
                    aVar = new puw.a(this.i, (c9p) element);
                    puwVar = this.v;
                    puwVar.b(aVar);
                    quwVar = puwVar.b;
                    this.f = aVar;
                    this.a = quwVar;
                    function2 = this.w;
                    this.b = function2;
                    Object obj3 = this.y;
                    this.c = obj3;
                    this.d = puwVar;
                    this.e = 1;
                    if (quwVar.d(this) != y5bVar) {
                        obj2 = obj3;
                    }
                    return y5bVar;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    puwVar2 = (puw) this.b;
                    quwVar2 = this.a;
                    aVar2 = (puw.a) this.f;
                    try {
                        uj50.b(obj);
                        atomicReference2 = puwVar2.a;
                        while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                        }
                        quwVar2.f(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = puwVar2.a;
                        while (!atomicReference.compareAndSet(aVar2, null)) {
                        }
                        throw th;
                    }
                }
                puw puwVar3 = this.d;
                obj2 = this.c;
                Function2<Object, v1b<Object>, Object> function3 = (Function2) this.b;
                quw quwVar3 = this.a;
                puw.a aVar3 = (puw.a) this.f;
                uj50.b(obj);
                function2 = function3;
                quwVar = quwVar3;
                puwVar = puwVar3;
                aVar = aVar3;
                this.f = aVar;
                this.a = quwVar;
                this.b = puwVar;
                this.c = null;
                this.d = null;
                this.e = 2;
                Object objInvoke = function2.invoke(obj2, this);
                if (objInvoke != y5bVar) {
                    puwVar2 = puwVar;
                    obj = objInvoke;
                    aVar2 = aVar;
                    quwVar2 = quwVar;
                    atomicReference2 = puwVar2.a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    quwVar2.f(null);
                    return obj;
                }
                return y5bVar;
            } catch (Throwable th3) {
                puwVar2 = puwVar;
                th = th3;
                aVar2 = aVar;
                atomicReference = puwVar2.a;
                while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.f(null);
            throw th4;
        }
    }
}
