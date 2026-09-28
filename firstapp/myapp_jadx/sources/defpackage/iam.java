package defpackage;

import androidx.compose.ui.d;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class iam implements List<d.c>, dhp {
    public final etw<Object> a = new etw<>(16);
    public final usw b = new usw(16);
    public int c = -1;

    public final class b implements List<d.c>, dhp {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i, d.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends d.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return (obj instanceof d.c) && indexOf((d.c) obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((d.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final d.c get(int i) {
            Object objB = iam.this.a.b(i + this.a);
            objB.getClass();
            return (d.c) objB;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof d.c)) {
                return -1;
            }
            d.c cVar = (d.c) obj;
            int i = this.a;
            int i2 = this.b;
            if (i > i2) {
                return -1;
            }
            int i3 = i;
            while (!Intrinsics.g(iam.this.a.b(i3), cVar)) {
                if (i3 == i2) {
                    return -1;
                }
                i3++;
            }
            return i3 - i;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<d.c> iterator() {
            int i = this.a;
            return iam.this.new a(i, i, this.b);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof d.c)) {
                return -1;
            }
            d.c cVar = (d.c) obj;
            int i = this.b;
            int i2 = this.a;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.g(iam.this.a.b(i), cVar)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator<d.c> listIterator(int i) {
            int i2 = this.a;
            int i3 = this.b;
            return iam.this.new a(i + i2, i2, i3);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ d.c remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<d.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.b - this.a;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super d.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<d.c> subList(int i, int i2) {
            int i3 = this.a;
            return iam.this.new b(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return e48.a(this);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ d.c set(int i, d.c cVar) {
            throw new UnsupportedOperationException(siPCzPFw.Owmtn);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) e48.b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends d.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final ListIterator<d.c> listIterator() {
            int i = this.a;
            return iam.this.new a(i, i, this.b);
        }
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, d.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends d.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long jA = jam.a(false, Float.POSITIVE_INFINITY, false);
        int i = this.c + 1;
        int i2 = this.a.b - 1;
        if (i > i2) {
            return jA;
        }
        while (i >= 0) {
            usw uswVar = this.b;
            if (i >= uswVar.b) {
                break;
            }
            long j = uswVar.a[i];
            if (ite.a(j, jA) < 0) {
                jA = j;
            }
            if ((ite.b(jA) < 0.0f && ite.d(jA)) || i == i2) {
                return jA;
            }
            i++;
        }
        mae0.a("Index must be between 0 and size");
        return 0L;
    }

    public final void c(int i, int i2) {
        usw uswVar;
        int i3;
        if (i >= i2) {
            return;
        }
        this.a.l(i, i2);
        if (i < 0 || i > (i3 = (uswVar = this.b).b) || i2 < 0 || i2 > i3) {
            mae0.a("Index must be between 0 and size");
            return;
        }
        if (i2 < i) {
            hb5.a("The end index must be < start index");
        } else if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = uswVar.a;
                xx0.g(jArr, jArr, i, i2, i3);
            }
            uswVar.b -= i2 - i;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.c = -1;
        this.a.i();
        this.b.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof d.c) && indexOf((d.c) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((d.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final d.c get(int i) {
        Object objB = this.a.b(i);
        objB.getClass();
        return (d.c) objB;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof d.c)) {
            return -1;
        }
        d.c cVar = (d.c) obj;
        etw<Object> etwVar = this.a;
        int i = etwVar.b - 1;
        if (i < 0) {
            return -1;
        }
        int i2 = 0;
        while (!Intrinsics.g(etwVar.b(i2), cVar)) {
            if (i2 == i) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.d();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<d.c> iterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof d.c) {
            d.c cVar = (d.c) obj;
            etw<Object> etwVar = this.a;
            for (int i = etwVar.b - 1; -1 < i; i--) {
                if (Intrinsics.g(etwVar.b(i), cVar)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<d.c> listIterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ d.c remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<d.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ d.c set(int i, d.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super d.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<d.c> subList(int i, int i2) {
        return new b(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return e48.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) e48.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends d.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<d.c> listIterator(int i) {
        return new a(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final class a implements ListIterator<d.c>, dhp {
        public int a;
        public final int b;
        public final int c;

        public a(iam iamVar, int i, int i2) {
            this((i2 & 1) != 0 ? 0 : i, 0, iamVar.a.b);
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(d.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.a < this.c;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.a > this.b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            etw<Object> etwVar = iam.this.a;
            int i = this.a;
            this.a = i + 1;
            Object objB = etwVar.b(i);
            objB.getClass();
            return (d.c) objB;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.a - this.b;
        }

        @Override // java.util.ListIterator
        public final d.c previous() {
            etw<Object> etwVar = iam.this.a;
            int i = this.a - 1;
            this.a = i;
            Object objB = etwVar.b(i);
            objB.getClass();
            return (d.c) objB;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.a - this.b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(d.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }
}
