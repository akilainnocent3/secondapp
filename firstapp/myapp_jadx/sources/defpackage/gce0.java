package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class gce0<T> implements List<T>, fhp {
    public final SnapshotStateList<T> a;
    public final int b;
    public int c;
    public int d;

    public static final class a implements ListIterator<T>, dhp {
        public final /* synthetic */ bq40 a;
        public final /* synthetic */ gce0<T> b;

        public a(bq40 bq40Var, gce0<T> gce0Var) {
            this.a = bq40Var;
            this.b = gce0Var;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.a.a < this.b.d - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.a.a >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            bq40 bq40Var = this.a;
            int i = bq40Var.a + 1;
            gce0<T> gce0Var = this.b;
            l6a0.f(i, gce0Var.d);
            bq40Var.a = i;
            return gce0Var.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.a.a + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            bq40 bq40Var = this.a;
            int i = bq40Var.a;
            gce0<T> gce0Var = this.b;
            l6a0.f(i, gce0Var.d);
            bq40Var.a = i - 1;
            return gce0Var.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.a.a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public gce0(SnapshotStateList<T> snapshotStateList, int i, int i2) {
        this.a = snapshotStateList;
        this.b = i;
        this.c = l6a0.c(snapshotStateList);
        this.d = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        b();
        int i = this.b + this.d;
        SnapshotStateList<T> snapshotStateList = this.a;
        snapshotStateList.add(i, t);
        this.d++;
        this.c = l6a0.c(snapshotStateList);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        b();
        int i2 = i + this.b;
        SnapshotStateList<T> snapshotStateList = this.a;
        boolean zAddAll = snapshotStateList.addAll(i2, collection);
        if (zAddAll) {
            this.d = collection.size() + this.d;
            this.c = l6a0.c(snapshotStateList);
        }
        return zAddAll;
    }

    public final void b() {
        if (l6a0.c(this.a) == this.c) {
            return;
        }
        sx0.a();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.d > 0) {
            b();
            int i = this.d;
            int i2 = this.b;
            SnapshotStateList<T> snapshotStateList = this.a;
            snapshotStateList.e(i2, i + i2);
            this.d = 0;
            this.c = l6a0.c(snapshotStateList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        b();
        l6a0.f(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.d;
        int i2 = this.b;
        Iterator<Integer> it = f.n(i2, i + i2).iterator();
        while (((mwo) it).c) {
            int iNextInt = ((zvo) it).nextInt();
            if (Intrinsics.g(obj, this.a.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i = this.d;
        int i2 = this.b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (Intrinsics.g(obj, this.a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        b();
        bq40 bq40Var = new bq40();
        bq40Var.a = i - 1;
        return new a(bq40Var, this);
    }

    @Override // java.util.List
    public final T remove(int i) {
        b();
        int i2 = this.b + i;
        SnapshotStateList<T> snapshotStateList = this.a;
        T tRemove = snapshotStateList.remove(i2);
        this.d--;
        this.c = l6a0.c(snapshotStateList);
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i;
        o4 o4Var;
        c5a0 c5a0VarG;
        boolean zA;
        b();
        SnapshotStateList<T> snapshotStateList = this.a;
        int i2 = this.b;
        int i3 = this.d + i2;
        int size = snapshotStateList.size();
        do {
            synchronized (l6a0.a) {
                gxd0 gxd0Var = snapshotStateList.a;
                gxd0Var.getClass();
                gxd0 gxd0Var2 = (gxd0) n5a0.e(gxd0Var);
                i = gxd0Var2.d;
                o4Var = gxd0Var2.c;
                Unit unit = Unit.a;
            }
            o4Var.getClass();
            fh00 fh00VarF = o4Var.f();
            fh00VarF.subList(i2, i3).retainAll(collection);
            o4 o4VarD = fh00VarF.d();
            if (Intrinsics.g(o4VarD, o4Var)) {
                break;
            }
            gxd0 gxd0Var3 = snapshotStateList.a;
            gxd0Var3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zA = l6a0.a((gxd0) n5a0.v(gxd0Var3, snapshotStateList, c5a0VarG), i, o4VarD, true);
            }
            n5a0.k(c5a0VarG, snapshotStateList);
        } while (!zA);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.c = l6a0.c(this.a);
            this.d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        l6a0.f(i, this.d);
        b();
        int i2 = i + this.b;
        SnapshotStateList<T> snapshotStateList = this.a;
        T t2 = snapshotStateList.set(i2, t);
        this.c = l6a0.c(snapshotStateList);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.d) {
            lm20.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i3 = this.b;
        return new gce0(this.a, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return e48.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) e48.b(this, tArr);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        b();
        int i2 = this.b + i;
        SnapshotStateList<T> snapshotStateList = this.a;
        snapshotStateList.add(i2, t);
        this.d++;
        this.c = l6a0.c(snapshotStateList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.d, collection);
    }
}
