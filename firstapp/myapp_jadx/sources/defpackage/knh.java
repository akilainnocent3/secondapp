package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
public final class knh<T> implements Sequence<T> {
    public final Sequence<T> a;
    public final boolean b;
    public final Function1<T, Boolean> c;

    public static final class a implements Iterator<T>, dhp {
        public final Iterator<T> a;
        public int b = -1;
        public T c;
        public final /* synthetic */ knh<T> d;

        public a(knh<T> knhVar) {
            this.d = knhVar;
            this.a = knhVar.a.iterator();
        }

        public final void b() {
            T next;
            knh<T> knhVar;
            do {
                Iterator<T> it = this.a;
                if (!it.hasNext()) {
                    this.b = 0;
                    return;
                } else {
                    next = it.next();
                    knhVar = this.d;
                }
            } while (knhVar.c.invoke(next).booleanValue() != knhVar.b);
            this.c = next;
            this.b = 1;
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
    public knh(Sequence<? extends T> sequence, boolean z, Function1<? super T, Boolean> function1) {
        sequence.getClass();
        function1.getClass();
        this.a = sequence;
        this.b = z;
        this.c = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
