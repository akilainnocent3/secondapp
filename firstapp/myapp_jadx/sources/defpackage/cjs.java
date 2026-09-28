package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class cjs {

    public static class a<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        public final List<F> a;
        public final baj<? super F, ? extends T> b;

        /* JADX INFO: renamed from: cjs$a$a, reason: collision with other inner class name */
        public class C0171a extends vsg0<F, T> {
            public C0171a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // defpackage.usg0
            public final T a(F f) {
                return a.this.b.apply(f);
            }
        }

        public a(List<F> list, baj<? super F, ? extends T> bajVar) {
            list.getClass();
            this.a = list;
            this.b = bajVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i) {
            return this.b.apply(this.a.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new C0171a(this.a.listIterator(i));
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i) {
            return this.b.apply(this.a.remove(i));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            this.a.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.a.size();
        }
    }

    public static class b<F, T> extends AbstractSequentialList<T> implements Serializable {
        public final List<F> a;
        public final baj<? super F, ? extends T> b;

        public class a extends vsg0<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // defpackage.usg0
            public final T a(F f) {
                return b.this.b.apply(f);
            }
        }

        public b(List<F> list, baj<? super F, ? extends T> bajVar) {
            list.getClass();
            this.a = list;
            this.b = bajVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new a(this.a.listIterator(i));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            this.a.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.a.size();
        }
    }

    public static AbstractList a(List list, baj bajVar) {
        return list != null ? new a(list, bajVar) : new b(list, bajVar);
    }
}
