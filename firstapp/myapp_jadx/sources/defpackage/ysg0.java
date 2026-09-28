package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
public final class ysg0<T, R> implements Sequence<R> {
    public final Sequence<T> a;
    public final Function1<T, R> b;

    public static final class a implements Iterator<R>, dhp {
        public final Iterator<T> a;
        public final /* synthetic */ ysg0<T, R> b;

        public a(ysg0<T, R> ysg0Var) {
            this.b = ysg0Var;
            this.a = ysg0Var.a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.b.b.invoke(this.a.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ysg0(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        sequence.getClass();
        this.a = sequence;
        this.b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
