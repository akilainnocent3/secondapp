package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
public final class t4f0<T> implements Sequence<T> {
    public final Sequence<T> a;
    public final Function1<T, Boolean> b;

    public static final class a implements Iterator<T>, dhp {
        public final Iterator<T> a;
        public int b = -1;
        public T c;
        public final /* synthetic */ t4f0<T> d;

        public a(t4f0<T> t4f0Var) {
            this.d = t4f0Var;
            this.a = t4f0Var.a.iterator();
        }

        public final void b() {
            Iterator<T> it = this.a;
            if (it.hasNext()) {
                T next = it.next();
                if (this.d.b.invoke(next).booleanValue()) {
                    this.b = 1;
                    this.c = next;
                    return;
                }
            }
            this.b = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b == -1) {
                b();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.b == -1) {
                b();
            }
            if (this.b == 0) {
                lrh0.a();
                return null;
            }
            T t = this.c;
            this.c = null;
            this.b = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t4f0(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        sequence.getClass();
        this.a = sequence;
        this.b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
