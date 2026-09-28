package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {211, 127}, m = "invokeSuspend")
public final class muw extends tje0 implements Function2<v5b, v1b<Object>, Object> {
    public quw a;
    public Object b;
    public puw c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ huw f;
    public final /* synthetic */ puw i;
    public final /* synthetic */ Function1<v1b<Object>, Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public muw(huw huwVar, puw puwVar, Function1<? super v1b<Object>, ? extends Object> function1, v1b<? super muw> v1bVar) {
        super(2, v1bVar);
        this.f = huwVar;
        this.i = puwVar;
        this.v = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        muw muwVar = new muw(this.f, this.i, this.v, v1bVar);
        muwVar.e = obj;
        return muwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
        return ((muw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, quw] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        puw.a aVar;
        puw puwVar;
        quw quwVar;
        Function1<v1b<Object>, Object> function1;
        puw puwVar2;
        Throwable th;
        puw.a aVar2;
        quw quwVar2;
        AtomicReference<puw.a> atomicReference;
        AtomicReference<puw.a> atomicReference2;
        y5b y5bVar = y5b.a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 == 0) {
                    uj50.b(obj);
                    CoroutineContext.Element element = ((v5b) this.e).getCoroutineContext().get(c9p.b.a);
                    element.getClass();
                    aVar = new puw.a(this.f, (c9p) element);
                    puwVar = this.i;
                    puwVar.b(aVar);
                    quwVar = puwVar.b;
                    this.e = aVar;
                    this.a = quwVar;
                    Function1<v1b<Object>, Object> function2 = this.v;
                    this.b = function2;
                    this.c = puwVar;
                    this.d = 1;
                    if (quwVar.d(this) != y5bVar) {
                        function1 = function2;
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
                    aVar2 = (puw.a) this.e;
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
                puw puwVar3 = this.c;
                function1 = (Function1) this.b;
                quwVar = this.a;
                puw.a aVar3 = (puw.a) this.e;
                uj50.b(obj);
                puwVar = puwVar3;
                aVar = aVar3;
                this.e = aVar;
                this.a = quwVar;
                this.b = puwVar;
                this.c = null;
                this.d = 2;
                Object objInvoke = function1.invoke(this);
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
