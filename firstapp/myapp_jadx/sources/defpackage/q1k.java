package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
public final class q1k<T> implements Sequence<T> {
    public final Function0<T> a;
    public final Function1<T, T> b;

    public static final class a implements Iterator<T>, dhp {
        public T a;
        public int b = -2;
        public final /* synthetic */ q1k<T> c;

        public a(q1k<T> q1kVar) {
            this.c = q1kVar;
        }

        public final void b() {
            T tInvoke;
            int i = this.b;
            q1k<T> q1kVar = this.c;
            if (i == -2) {
                tInvoke = q1kVar.a.invoke();
            } else {
                Function1<T, T> function1 = q1kVar.b;
                T t = this.a;
                t.getClass();
                tInvoke = function1.invoke(t);
            }
            this.a = tInvoke;
            this.b = tInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b < 0) {
                b();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.b < 0) {
                b();
            }
            if (this.b == 0) {
                lrh0.a();
                return null;
            }
            T t = this.a;
            t.getClass();
            this.b = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q1k(Function0<? extends T> function0, Function1<? super T, ? extends T> function1) {
        function1.getClass();
        this.a = function0;
        this.b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
