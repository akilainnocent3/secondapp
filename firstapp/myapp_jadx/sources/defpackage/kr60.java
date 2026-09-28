package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class kr60<T> extends x1b implements myh<T> {
    public final myh<T> a;
    public final CoroutineContext b;
    public final int c;
    public CoroutineContext d;
    public v1b<? super Unit> e;

    /* JADX WARN: Multi-variable type inference failed */
    public kr60(myh<? super T> myhVar, CoroutineContext coroutineContext) {
        super(cwx.a, e.a);
        this.a = myhVar;
        this.b = coroutineContext;
        this.c = ((Number) coroutineContext.fold(0, new jr60())).intValue();
    }

    @Override // defpackage.myh
    public final Object emit(T t, v1b<? super Unit> v1bVar) {
        try {
            Object objK = k(v1bVar, t);
            return objK == y5b.a ? objK : Unit.a;
        } catch (Throwable th) {
            this.d = new d7f(v1bVar.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.pz1, defpackage.z5b
    public final z5b getCallerFrame() {
        v1b<? super Unit> v1bVar = this.e;
        if (v1bVar instanceof z5b) {
            return (z5b) v1bVar;
        }
        return null;
    }

    @Override // defpackage.x1b, defpackage.v1b
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.d;
        return coroutineContext == null ? e.a : coroutineContext;
    }

    @Override // defpackage.pz1
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable thA = zi50.a(obj);
        if (thA != null) {
            this.d = new d7f(getContext(), thA);
        }
        v1b<? super Unit> v1bVar = this.e;
        if (v1bVar != null) {
            v1bVar.resumeWith(obj);
        }
        return y5b.a;
    }

    public final Object k(v1b<? super Unit> v1bVar, T t) {
        CoroutineContext context = v1bVar.getContext();
        i9p.e(context);
        CoroutineContext coroutineContext = this.d;
        if (coroutineContext != context) {
            if (coroutineContext instanceof d7f) {
                throw new IllegalStateException(qae0.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((d7f) coroutineContext).b + ", but then emission attempt of value '" + t + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new Function2() { // from class: mr60
                /* JADX WARN: Code duplicated, block: B:6:0x001d  */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj).intValue();
                    CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                    CoroutineContext.a<?> key = element.getKey();
                    CoroutineContext.Element element2 = this.a.b.get(key);
                    if (key == c9p.b.a) {
                        c9p c9pVar = (c9p) element2;
                        c9p parent = (c9p) element;
                        while (true) {
                            if (parent != null) {
                                if (parent == c9pVar || !(parent instanceof vn70)) {
                                    break;
                                }
                                parent = ((vn70) parent).getParent();
                            } else {
                                parent = null;
                                break;
                            }
                        }
                        if (parent != c9pVar) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + c9pVar + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                        if (c9pVar != null) {
                            iIntValue++;
                        }
                    } else if (element != element2) {
                        iIntValue = Integer.MIN_VALUE;
                    } else {
                        iIntValue++;
                    }
                    return Integer.valueOf(iIntValue);
                }
            })).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = v1bVar;
        gaj<myh<Object>, Object, v1b<? super Unit>, Object> gajVar = lr60.a;
        myh<T> myhVar = this.a;
        myhVar.getClass();
        Object objInvoke = gajVar.invoke(myhVar, t, this);
        if (!Intrinsics.g(objInvoke, y5b.a)) {
            this.e = null;
        }
        return objInvoke;
    }
}
