package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
public final class ruh<T, R, E> implements Sequence<E> {
    public final Sequence<T> a;
    public final Function1<T, R> b;
    public final Function1<R, Iterator<E>> c;

    public static final class a implements Iterator<E>, dhp {
        public final Iterator<T> a;
        public Iterator<? extends E> b;
        public int c;
        public final /* synthetic */ ruh<T, R, E> d;

        public a(ruh<T, R, E> ruhVar) {
            this.d = ruhVar;
            this.a = ruhVar.a.iterator();
        }

        public final boolean b() {
            Iterator<? extends E> it;
            Iterator<? extends E> it2 = this.b;
            if (it2 != null && it2.hasNext()) {
                this.c = 1;
                return true;
            }
            do {
                Iterator<T> it3 = this.a;
                if (!it3.hasNext()) {
                    this.c = 2;
                    this.b = null;
                    return false;
                }
                T next = it3.next();
                ruh<T, R, E> ruhVar = this.d;
                it = (Iterator) ruhVar.c.invoke(ruhVar.b.invoke(next));
            } while (!it.hasNext());
            this.b = it;
            this.c = 1;
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.c;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return b();
        }

        @Override // java.util.Iterator
        public final E next() {
            int i = this.c;
            if (i == 2) {
                lrh0.a();
                return null;
            }
            if (i == 0 && !b()) {
                lrh0.a();
                return null;
            }
            this.c = 0;
            Iterator<? extends E> it = this.b;
            it.getClass();
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ruh(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1, Function1<? super R, ? extends Iterator<? extends E>> function2) {
        sequence.getClass();
        function2.getClass();
        this.a = sequence;
        this.b = function1;
        this.c = function2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<E> iterator() {
        return new a(this);
    }
}
