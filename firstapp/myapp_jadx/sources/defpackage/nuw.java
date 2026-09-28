package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {177, WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend")
public final class nuw extends tje0 implements Function2<v5b, v1b<Object>, Object> {
    public quw a;
    public Object b;
    public luw c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ luw f;
    public final /* synthetic */ Function1<v1b<Object>, Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nuw(luw luwVar, Function1 function1, v1b v1bVar) {
        super(2, v1bVar);
        iuw iuwVar = iuw.a;
        this.f = luwVar;
        this.i = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        iuw iuwVar = iuw.a;
        nuw nuwVar = new nuw(this.f, this.i, v1bVar);
        nuwVar.e = obj;
        return nuwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
        return ((nuw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, quw] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        luw.a aVar;
        luw luwVar;
        quw quwVar;
        Function1<v1b<Object>, Object> function1;
        luw luwVar2;
        Throwable th;
        luw.a aVar2;
        quw quwVar2;
        AtomicReference<luw.a> atomicReference;
        AtomicReference<luw.a> atomicReference2;
        y5b y5bVar = y5b.a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 == 0) {
                    uj50.b(obj);
                    v5b v5bVar = (v5b) this.e;
                    iuw iuwVar = iuw.a;
                    CoroutineContext.Element element = v5bVar.getCoroutineContext().get(c9p.b.a);
                    element.getClass();
                    aVar = new luw.a((c9p) element);
                    luwVar = this.f;
                    AtomicReference<luw.a> atomicReference3 = luwVar.a;
                    loop2: while (true) {
                        luw.a aVar3 = atomicReference3.get();
                        if (aVar3 != null) {
                            iuw iuwVar2 = iuw.a;
                            if (iuwVar2.compareTo(iuwVar2) < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        do {
                            if (atomicReference3.compareAndSet(aVar3, aVar)) {
                                if (aVar3 != null) {
                                    aVar3.a.cancel((CancellationException) new kuw("Mutation interrupted"));
                                }
                                quwVar = luwVar.b;
                                this.e = aVar;
                                this.a = quwVar;
                                Function1<v1b<Object>, Object> function2 = this.i;
                                this.b = function2;
                                this.c = luwVar;
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
                        luwVar2 = (luw) this.b;
                        quwVar2 = this.a;
                        aVar2 = (luw.a) this.e;
                        try {
                            uj50.b(obj);
                            atomicReference2 = luwVar2.a;
                            while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                            }
                            quwVar2.f(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = luwVar2.a;
                            while (!atomicReference.compareAndSet(aVar2, null)) {
                            }
                            throw th;
                        }
                    }
                    luw luwVar3 = this.c;
                    function1 = (Function1) this.b;
                    quwVar = this.a;
                    luw.a aVar4 = (luw.a) this.e;
                    uj50.b(obj);
                    luwVar = luwVar3;
                    aVar = aVar4;
                }
                this.e = aVar;
                this.a = quwVar;
                this.b = luwVar;
                this.c = null;
                this.d = 2;
                Object objInvoke = function1.invoke(this);
                if (objInvoke != y5bVar) {
                    luwVar2 = luwVar;
                    obj = objInvoke;
                    aVar2 = aVar;
                    quwVar2 = quwVar;
                    atomicReference2 = luwVar2.a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    quwVar2.f(null);
                    return obj;
                }
                return y5bVar;
            } catch (Throwable th3) {
                luwVar2 = luwVar;
                th = th3;
                aVar2 = aVar;
                atomicReference = luwVar2.a;
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
