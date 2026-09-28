package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvc80;", "T", "Lwc80;", "", "Lv1b;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vc80<T> extends wc80<T> implements Iterator<T>, v1b<Unit>, dhp {
    public int a;
    public T b;
    public Iterator<? extends T> c;
    public v1b<? super Unit> d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wc80
    public final void b(v1b v1bVar, Object obj) {
        this.b = obj;
        this.a = 3;
        this.d = v1bVar;
        y5b y5bVar = y5b.a;
        v1bVar.getClass();
    }

    @Override // defpackage.wc80
    public final Object c(Iterator it, z7i0 z7i0Var) {
        if (!it.hasNext()) {
            return Unit.a;
        }
        this.c = it;
        this.a = 2;
        this.d = z7i0Var;
        return y5b.a;
    }

    public final RuntimeException d() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    @Override // defpackage.v1b
    public final CoroutineContext getContext() {
        return e.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw d();
                }
                Iterator<? extends T> it = this.c;
                it.getClass();
                if (it.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.c = null;
            }
            this.a = 5;
            v1b<? super Unit> v1bVar = this.d;
            v1bVar.getClass();
            this.d = null;
            Unit unit = Unit.a;
            zi50.a aVar = zi50.b;
            v1bVar.resumeWith(unit);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            lrh0.a();
            return null;
        }
        if (i == 2) {
            this.a = 1;
            Iterator<? extends T> it = this.c;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw d();
        }
        this.a = 0;
        T t = this.b;
        this.b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.v1b
    public final void resumeWith(Object obj) {
        uj50.b(obj);
        this.a = 4;
    }
}
