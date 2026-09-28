package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes8.dex */
public final class ep50<T> extends q3<T> {
    public final List<T> b;

    public static final class a implements ListIterator<T>, dhp {
        public final ListIterator<T> a;
        public final /* synthetic */ ep50<T> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ep50<? extends T> ep50Var, int i) {
            this.b = ep50Var;
            this.a = ep50Var.b.listIterator(q48.F(i, ep50Var));
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.a.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return (this.b.size() - 1) - this.a.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.a.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.b.size() - 1) - this.a.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ep50(List<? extends T> list) {
        list.getClass();
        this.b = list;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.b.size();
    }

    @Override // java.util.List
    public final T get(int i) {
        return this.b.get(q48.E(i, this));
    }

    @Override // defpackage.q3, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // defpackage.q3, java.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // defpackage.q3, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}
