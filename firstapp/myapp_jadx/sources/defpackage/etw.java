package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class etw<E> extends ccy<E> {
    public b<E> c;

    public static final class a<T> implements ListIterator<T>, dhp {
        public final List<T> a;
        public int b;

        public a(List<T> list, int i) {
            this.a = list;
            this.b = i - 1;
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            int i = this.b + 1;
            this.b = i;
            this.a.add(i, t);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.b < this.a.size() - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.b >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i = this.b + 1;
            this.b = i;
            return this.a.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.b + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.b;
            this.b = i - 1;
            return this.a.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.a.remove(this.b);
            this.b--;
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            this.a.set(this.b, t);
        }
    }

    public etw(int i) {
        this.a = i == 0 ? dcy.a : new Object[i];
    }

    public final void g(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void h(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void i() {
        xx0.l(0, this.b, null, this.a);
        this.b = 0;
    }

    public final boolean j(E e) {
        int iC = c(e);
        if (iC < 0) {
            return false;
        }
        k(iC);
        return true;
    }

    public final E k(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            f(i);
            throw null;
        }
        Object[] objArr = this.a;
        E e = (E) objArr[i];
        if (i != i2 - 1) {
            xx0.e(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return e;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            ks40.a(this.b, dy5.a("Start (", i, i2, ") and end (", ") must be in 0.."));
            return;
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                xx0.e(i, i2, i3, objArr, objArr);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            xx0.l(i5, i4, null, this.a);
            this.b = i5;
        }
    }

    public final void m(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        xx0.e(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public final void n(int i) {
        StringBuilder sbA = efe0.a(i, "Index ", " must be in 0..");
        sbA.append(this.b);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    public static final class b<T> implements List<T>, fhp {
        public final etw<T> a;

        public b(etw<T> etwVar) {
            this.a = etwVar;
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            int i2;
            etw<T> etwVar = this.a;
            if (i < 0 || i > (i2 = etwVar.b)) {
                etwVar.n(i);
                throw null;
            }
            int i3 = i2 + 1;
            Object[] objArr = etwVar.a;
            if (objArr.length < i3) {
                etwVar.m(i3, objArr);
            }
            Object[] objArr2 = etwVar.a;
            int i4 = etwVar.b;
            if (i != i4) {
                xx0.e(i + 1, i, i4, objArr2, objArr2);
            }
            objArr2[i] = t;
            etwVar.b++;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            collection.getClass();
            etw<T> etwVar = this.a;
            if (i < 0 || i > etwVar.b) {
                etwVar.n(i);
                throw null;
            }
            int i2 = 0;
            if (collection.isEmpty()) {
                return false;
            }
            int size = collection.size() + etwVar.b;
            Object[] objArr = etwVar.a;
            if (objArr.length < size) {
                etwVar.m(size, objArr);
            }
            Object[] objArr2 = etwVar.a;
            if (i != etwVar.b) {
                xx0.e(collection.size() + i, i, etwVar.b, objArr2, objArr2);
            }
            for (T t : collection) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                objArr2[i2 + i] = t;
                i2 = i3;
            }
            etwVar.b = collection.size() + etwVar.b;
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.a.i();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.a.c(obj) >= 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            collection.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (this.a.c(it.next()) < 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            dcy.a(i, this);
            return this.a.b(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.a.c(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.a.d();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            etw<T> etwVar = this.a;
            Object[] objArr = etwVar.a;
            int i = etwVar.b;
            if (obj == null) {
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (objArr[i2] == null) {
                        return i2;
                    }
                }
            } else {
                for (int i3 = i - 1; -1 < i3; i3--) {
                    if (obj.equals(objArr[i3])) {
                        return i3;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final T remove(int i) {
            dcy.a(i, this);
            return this.a.k(i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            collection.getClass();
            etw<T> etwVar = this.a;
            int i = etwVar.b;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                etwVar.j(it.next());
            }
            return i != etwVar.b;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            collection.getClass();
            etw<T> etwVar = this.a;
            int i = etwVar.b;
            Object[] objArr = etwVar.a;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(objArr[i2])) {
                    etwVar.k(i2);
                }
            }
            return i != etwVar.b;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            dcy.a(i, this);
            etw<T> etwVar = this.a;
            if (i < 0 || i >= etwVar.b) {
                etwVar.f(i);
                throw null;
            }
            Object[] objArr = etwVar.a;
            T t2 = (T) objArr[i];
            objArr[i] = t;
            return t2;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.a.b;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            dcy.b(i, i2, this);
            return new c(i, i2, this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            tArr.getClass();
            return (T[]) e48.b(this, tArr);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new a(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return e48.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.a.j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            this.a.g(t);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            collection.getClass();
            etw<T> etwVar = this.a;
            int i = etwVar.b;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                etwVar.g(it.next());
            }
            return i != etwVar.b;
        }
    }

    public static final class c<T> implements List<T>, fhp {
        public final List<T> a;
        public final int b;
        public int c;

        public c(int i, int i2, List list) {
            this.a = list;
            this.b = i;
            this.c = i2;
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            this.a.add(i + this.b, t);
            this.c++;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            collection.getClass();
            this.a.addAll(i + this.b, collection);
            this.c = collection.size() + this.c;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.c - 1;
            int i2 = this.b;
            if (i2 <= i) {
                while (true) {
                    this.a.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.c = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                if (Intrinsics.g(this.a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            collection.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            dcy.a(i, this);
            return this.a.get(i + this.b);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.c;
            int i2 = this.b;
            for (int i3 = i2; i3 < i; i3++) {
                if (Intrinsics.g(this.a.get(i3), obj)) {
                    return i3 - i2;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.c == this.b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.c - 1;
            int i2 = this.b;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.g(this.a.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                List<T> list = this.a;
                if (Intrinsics.g(list.get(i2), obj)) {
                    list.remove(i2);
                    this.c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            collection.getClass();
            int i = this.c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.c;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            collection.getClass();
            int i = this.c;
            int i2 = i - 1;
            int i3 = this.b;
            if (i3 <= i2) {
                while (true) {
                    List<T> list = this.a;
                    if (!collection.contains(list.get(i2))) {
                        list.remove(i2);
                        this.c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.c;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            dcy.a(i, this);
            return this.a.set(i + this.b, t);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.c - this.b;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            dcy.b(i, i2, this);
            return new c(i, i2, this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            tArr.getClass();
            return (T[]) e48.b(this, tArr);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new a(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return e48.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            int i = this.c;
            this.c = i + 1;
            this.a.add(i, t);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            collection.getClass();
            this.a.addAll(this.c, collection);
            this.c = collection.size() + this.c;
            return collection.size() > 0;
        }

        @Override // java.util.List
        public final T remove(int i) {
            dcy.a(i, this);
            T tRemove = this.a.remove(i + this.b);
            this.c--;
            return tRemove;
        }
    }

    public etw() {
        this((Object) null);
    }

    public /* synthetic */ etw(Object obj) {
        this(16);
    }
}
