package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {179, HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend")
public final class azo extends tje0 implements Function2<v5b, v1b<Object>, Object> {
    public quw a;
    public Object b;
    public zyo c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ huw f;
    public final /* synthetic */ zyo i;
    public final /* synthetic */ Function1<v1b<Object>, Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public azo(huw huwVar, zyo zyoVar, Function1<? super v1b<Object>, ? extends Object> function1, v1b<? super azo> v1bVar) {
        super(2, v1bVar);
        this.f = huwVar;
        this.i = zyoVar;
        this.v = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        azo azoVar = new azo(this.f, this.i, this.v, v1bVar);
        azoVar.e = obj;
        return azoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
        return ((azo) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, quw] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        zyo.a aVar;
        zyo zyoVar;
        quw quwVar;
        Function1<v1b<Object>, Object> function1;
        zyo zyoVar2;
        Throwable th;
        zyo.a aVar2;
        quw quwVar2;
        AtomicReference<zyo.a> atomicReference;
        AtomicReference<zyo.a> atomicReference2;
        y5b y5bVar = y5b.a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 == 0) {
                    uj50.b(obj);
                    CoroutineContext.Element element = ((v5b) this.e).getCoroutineContext().get(c9p.b.a);
                    element.getClass();
                    aVar = new zyo.a(this.f, (c9p) element);
                    zyoVar = this.i;
                    AtomicReference<zyo.a> atomicReference3 = zyoVar.a;
                    loop2: while (true) {
                        zyo.a aVar3 = atomicReference3.get();
                        if (aVar3 != null && aVar.a.compareTo(aVar3.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        do {
                            if (atomicReference3.compareAndSet(aVar3, aVar)) {
                                if (aVar3 != null) {
                                    aVar3.b.cancel((CancellationException) null);
                                }
                                quwVar = zyoVar.b;
                                this.e = aVar;
                                this.a = quwVar;
                                Function1<v1b<Object>, Object> function2 = this.v;
                                this.b = function2;
                                this.c = zyoVar;
                                this.d = 1;
                                if (quwVar.d(this) != y5bVar) {
                                    function1 = function2;
                                    break loop2;
                                }
                                return y5bVar;
                            }
                        } while (atomicReference3.get() == aVar3);
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zyoVar2 = (zyo) this.b;
                        quwVar2 = this.a;
                        aVar2 = (zyo.a) this.e;
                        try {
                            uj50.b(obj);
                            atomicReference2 = zyoVar2.a;
                            while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                            }
                            quwVar2.f(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = zyoVar2.a;
                            while (!atomicReference.compareAndSet(aVar2, null)) {
                            }
                            throw th;
                        }
                    }
                    zyo zyoVar3 = this.c;
                    function1 = (Function1) this.b;
                    quwVar = this.a;
                    zyo.a aVar4 = (zyo.a) this.e;
                    uj50.b(obj);
                    zyoVar = zyoVar3;
                    aVar = aVar4;
                }
                this.e = aVar;
                this.a = quwVar;
                this.b = zyoVar;
                this.c = null;
                this.d = 2;
                Object objInvoke = function1.invoke(this);
                if (objInvoke != y5bVar) {
                    zyoVar2 = zyoVar;
                    obj = objInvoke;
                    aVar2 = aVar;
                    quwVar2 = quwVar;
                    atomicReference2 = zyoVar2.a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    quwVar2.f(null);
                    return obj;
                }
                return y5bVar;
            } catch (Throwable th3) {
                zyoVar2 = zyoVar;
                th = th3;
                aVar2 = aVar;
                atomicReference = zyoVar2.a;
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
