package androidx.compose.ui.layout;

import defpackage.b3z;
import defpackage.dhp;
import defpackage.e48;
import defpackage.gtw;
import defpackage.htw;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public interface h0 {

    public static final class a implements Collection<Object>, dhp {
        public final gtw<Object> a;

        public a(int i) {
            int i2 = b3z.a;
            this.a = new gtw<>(6);
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.a.b(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.a.c();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.a.a(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.a.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.a.g == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            gtw<Object> gtwVar = this.a;
            gtwVar.getClass();
            return new htw.a(new htw(gtwVar));
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.a.g(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return this.a.g(collection);
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return this.a.i(collection);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.a.g;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return e48.a(this);
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) e48.b(this, tArr);
        }
    }

    void a(a aVar);

    boolean b(Object obj, Object obj2);
}
