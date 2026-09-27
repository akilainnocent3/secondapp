package cj;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@j4
@yi.b(emulated = true)
@qj.f("Use ImmutableList.of or another implementation")
public abstract class r6<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f24463b = 1296;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f24464c = new Object[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f24465d = 912559;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a<E> extends b<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object[] f24466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24468d;

        public a(int initialCapacity) {
            j3.b(initialCapacity, "initialCapacity");
            this.f24466b = new Object[initialCapacity];
            this.f24467c = 0;
        }

        @Override // cj.r6.b
        @qj.a
        public b<E> b(E... elements) {
            h(elements, elements.length);
            return this;
        }

        @Override // cj.r6.b
        @qj.a
        public b<E> c(Iterable<? extends E> elements) {
            if (elements instanceof Collection) {
                Collection collection = (Collection) elements;
                i(collection.size());
                if (collection instanceof r6) {
                    this.f24467c = ((r6) collection).e(this.f24466b, this.f24467c);
                    return this;
                }
            }
            super.c(elements);
            return this;
        }

        @Override // cj.r6.b
        @qj.a
        public a<E> g(E element) {
            zi.l0.E(element);
            i(1);
            Object[] objArr = this.f24466b;
            int i10 = this.f24467c;
            this.f24467c = i10 + 1;
            objArr[i10] = element;
            return this;
        }

        public final void h(Object[] elements, int n10) {
            j9.c(elements, n10);
            i(n10);
            System.arraycopy(elements, 0, this.f24466b, this.f24467c, n10);
            this.f24467c += n10;
        }

        public final void i(int newElements) {
            Object[] objArr = this.f24466b;
            int iF = b.f(objArr.length, this.f24467c + newElements);
            if (iF > objArr.length || this.f24468d) {
                this.f24466b = Arrays.copyOf(this.f24466b, iF);
                this.f24468d = false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @qj.f
    public static abstract class b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f24469a = 4;

        public static int f(int oldCapacity, int minCapacity) {
            if (minCapacity < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (minCapacity <= oldCapacity) {
                return oldCapacity;
            }
            int iHighestOneBit = oldCapacity + (oldCapacity >> 1) + 1;
            if (iHighestOneBit < minCapacity) {
                iHighestOneBit = Integer.highestOneBit(minCapacity - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @qj.a
        /* JADX INFO: renamed from: a */
        public abstract b<E> g(E element);

        @qj.a
        public b<E> b(E... elements) {
            for (E e10 : elements) {
                g(e10);
            }
            return this;
        }

        @qj.a
        public b<E> c(Iterable<? extends E> elements) {
            Iterator<? extends E> it = elements.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        @qj.a
        public b<E> d(Iterator<? extends E> elements) {
            while (elements.hasNext()) {
                g(elements.next());
            }
            return this;
        }

        public abstract r6<E> e();
    }

    @yi.d
    private void m(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    @qj.a
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    @qj.a
    public final boolean addAll(Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@zq.a Object object);

    public v6<E> d() {
        return isEmpty() ? v6.z() : v6.o(toArray());
    }

    @qj.a
    public int e(Object[] dst, int offset) {
        gc<E> it = iterator();
        while (it.hasNext()) {
            dst[offset] = it.next();
            offset++;
        }
        return offset;
    }

    @zq.a
    public Object[] g() {
        return null;
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean j();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: l */
    public abstract gc<E> iterator();

    @yi.c
    @yi.d
    public Object n() {
        return new v6.d(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @qj.a
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@zq.a Object object) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    @qj.a
    public final boolean removeAll(Collection<?> oldElements) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    @qj.a
    public final boolean retainAll(Collection<?> elementsToKeep) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @n6
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, f24463b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @yi.d
    public final Object[] toArray() {
        return toArray(f24464c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @qj.a
    public final <T> T[] toArray(T[] tArr) {
        zi.l0.E(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrG = g();
            if (objArrG != null) {
                return (T[]) p9.a(objArrG, i(), h(), tArr);
            }
            tArr = (T[]) j9.j(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        e(tArr, 0);
        return tArr;
    }
}
