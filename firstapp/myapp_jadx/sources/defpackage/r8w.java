package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class r8w<T> implements gk90<T> {
    public final AtomicReference<a<T>> a;
    public final AtomicReference<a<T>> b;

    public static final class a<E> extends AtomicReference<a<E>> {
        public E a;
    }

    public r8w() {
        AtomicReference<a<T>> atomicReference = new AtomicReference<>();
        this.a = atomicReference;
        AtomicReference<a<T>> atomicReference2 = new AtomicReference<>();
        this.b = atomicReference2;
        a<T> aVar = new a<>();
        atomicReference2.lazySet(aVar);
        atomicReference.getAndSet(aVar);
    }

    @Override // defpackage.lk90
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // defpackage.lk90
    public final boolean isEmpty() {
        return this.b.get() == this.a.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lk90
    public final boolean offer(T t) {
        if (t == 0) {
            bmy.a("Null is not a valid element");
            return false;
        }
        a<T> aVar = new a<>();
        aVar.a = t;
        this.a.getAndSet(aVar).lazySet(aVar);
        return true;
    }

    @Override // defpackage.lk90
    public final T poll() {
        a<T> aVar;
        AtomicReference<a<T>> atomicReference = this.b;
        a<T> aVar2 = atomicReference.get();
        a<T> aVar3 = (a) aVar2.get();
        if (aVar3 != null) {
            T t = aVar3.a;
            aVar3.a = null;
            atomicReference.lazySet(aVar3);
            return t;
        }
        if (aVar2 == this.a.get()) {
            return null;
        }
        do {
            aVar = (a) aVar2.get();
        } while (aVar == null);
        T t2 = aVar.a;
        aVar.a = null;
        atomicReference.lazySet(aVar);
        return t2;
    }
}
