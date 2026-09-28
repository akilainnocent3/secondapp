package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lngs;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lg4;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "d", "b", "c", "a", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ngs<E> extends g4<E> implements List<E>, RandomAccess, Serializable {
    private static final b d = new b(null);
    public static final ngs e;
    public E[] a;
    public int b;
    public boolean c;

    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class c<E> implements ListIterator<E>, dhp {
        public final ngs<E> a;
        public int b;
        public int c = -1;
        public int d;

        public c(ngs<E> ngsVar, int i) {
            this.a = ngsVar;
            this.b = i;
            this.d = ((AbstractList) ngsVar).modCount;
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            b();
            int i = this.b;
            this.b = i + 1;
            ngs<E> ngsVar = this.a;
            ngsVar.add(i, e);
            this.c = -1;
            this.d = ((AbstractList) ngsVar).modCount;
        }

        public final void b() {
            if (((AbstractList) this.a).modCount == this.d) {
                return;
            }
            sx0.a();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.b < this.a.b;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            b();
            int i = this.b;
            ngs<E> ngsVar = this.a;
            if (i >= ngsVar.b) {
                lrh0.a();
                return null;
            }
            this.b = i + 1;
            this.c = i;
            return ngsVar.a[i];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            b();
            int i = this.b;
            if (i <= 0) {
                lrh0.a();
                return null;
            }
            int i2 = i - 1;
            this.b = i2;
            this.c = i2;
            return this.a.a[i2];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            b();
            int i = this.c;
            if (i == -1) {
                ib5.a("Call next() or previous() before removing element from the iterator.");
                return;
            }
            ngs<E> ngsVar = this.a;
            ngsVar.c(i);
            this.b = this.c;
            this.c = -1;
            this.d = ((AbstractList) ngsVar).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            b();
            int i = this.c;
            if (i != -1) {
                this.a.set(i, e);
            } else {
                ib5.a("Call next() or previous() before replacing element from the iterator.");
            }
        }
    }

    static {
        ngs ngsVar = new ngs(0);
        ngsVar.c = true;
        e = ngsVar;
    }

    public ngs(int i) {
        if (i >= 0) {
            this.a = (E[]) new Object[i];
        } else {
            hb5.a("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e2) {
        h();
        q3.Companion companion = q3.INSTANCE;
        int i2 = this.b;
        companion.getClass();
        q3.Companion.c(i, i2);
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.a[i] = e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        h();
        q3.Companion companion = q3.INSTANCE;
        int i2 = this.b;
        companion.getClass();
        q3.Companion.c(i, i2);
        int size = collection.size();
        e(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.g4
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getC() {
        return this.b;
    }

    @Override // defpackage.g4
    public final E c(int i) {
        h();
        q3.Companion companion = q3.INSTANCE;
        int i2 = this.b;
        companion.getClass();
        q3.Companion.b(i, i2);
        return j(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        k(0, this.b);
    }

    public final void e(int i, Collection<? extends E> collection, int i2) {
        ((AbstractList) this).modCount++;
        i(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            E[] eArr = this.a;
            int i = this.b;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.g(eArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, E e2) {
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.a[i] = e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        q3.Companion companion = q3.INSTANCE;
        int i2 = this.b;
        companion.getClass();
        q3.Companion.b(i, i2);
        return this.a[i];
    }

    public final void h() {
        if (this.c) {
            bl0.a();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.a;
        int i = this.b;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            E e2 = eArr[i2];
            iHashCode = (iHashCode * 31) + (e2 != null ? e2.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, int i2) {
        int i3 = this.b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.a;
        if (i3 > eArr.length) {
            q3.Companion companion = q3.INSTANCE;
            int length = eArr.length;
            companion.getClass();
            int iE = q3.Companion.e(length, i3);
            E[] eArr2 = this.a;
            eArr2.getClass();
            eArr = (E[]) Arrays.copyOf(eArr2, iE);
            this.a = eArr;
        }
        xx0.e(i + i2, i, this.b, eArr, eArr);
        this.b += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (Intrinsics.g(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final E j(int i) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.a;
        E e2 = eArr[i];
        xx0.e(i, i + 1, this.b, eArr, eArr);
        E[] eArr2 = this.a;
        int i2 = this.b - 1;
        eArr2.getClass();
        eArr2[i2] = null;
        this.b--;
        return e2;
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.a;
        xx0.e(i, i + i2, this.b, eArr, eArr);
        E[] eArr2 = this.a;
        int i3 = this.b;
        ogs.a(i3 - i2, i3, eArr2);
        this.b -= i2;
    }

    public final int l(int i, int i2, Collection<? extends E> collection, boolean z) {
        E[] eArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            eArr = this.a;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(eArr[i5]) == z) {
                E[] eArr2 = this.a;
                i3++;
                eArr2[i4 + i] = eArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        xx0.e(i + i4, i2 + i, this.b, eArr, eArr);
        E[] eArr3 = this.a;
        int i7 = this.b;
        ogs.a(i7 - i6, i7, eArr3);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.b -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (Intrinsics.g(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        q3.Companion companion = q3.INSTANCE;
        int i2 = this.b;
        companion.getClass();
        q3.Companion.c(i, i2);
        return new c(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        h();
        return l(0, this.b, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        h();
        return l(0, this.b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e2) {
        h();
        q3.Companion companion = q3.INSTANCE;
        int i2 = this.b;
        companion.getClass();
        q3.Companion.b(i, i2);
        E[] eArr = this.a;
        E e3 = eArr[i];
        eArr[i] = e2;
        return e3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i, int i2) {
        q3.Companion companion = q3.INSTANCE;
        int i3 = this.b;
        companion.getClass();
        q3.Companion.d(i, i2, i3);
        return new a(this.a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        int i = this.b;
        E[] eArr = this.a;
        if (length < i) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, 0, i, tArr.getClass());
            tArr2.getClass();
            return tArr2;
        }
        xx0.e(0, 0, i, eArr, tArr);
        int i2 = this.b;
        if (i2 < tArr.length) {
            tArr[i2] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ogs.b(this.a, 0, this.b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public /* synthetic */ ngs(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    public static final class a<E> extends g4<E> implements RandomAccess, Serializable {
        public E[] a;
        public final int b;
        public int c;
        public final a<E> d;
        public final ngs<E> e;

        /* JADX INFO: renamed from: ngs$a$a, reason: collision with other inner class name */
        public static final class C0898a<E> implements ListIterator<E>, dhp {
            public final a<E> a;
            public int b;
            public int c = -1;
            public int d;

            public C0898a(a<E> aVar, int i) {
                this.a = aVar;
                this.b = i;
                this.d = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator
            public final void add(E e) {
                b();
                int i = this.b;
                this.b = i + 1;
                a<E> aVar = this.a;
                aVar.add(i, e);
                this.c = -1;
                this.d = ((AbstractList) aVar).modCount;
            }

            public final void b() {
                if (((AbstractList) this.a.e).modCount == this.d) {
                    return;
                }
                sx0.a();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.b < this.a.c;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                b();
                int i = this.b;
                a<E> aVar = this.a;
                if (i >= aVar.c) {
                    lrh0.a();
                    return null;
                }
                this.b = i + 1;
                this.c = i;
                return aVar.a[aVar.b + i];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.b;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                b();
                int i = this.b;
                if (i <= 0) {
                    lrh0.a();
                    return null;
                }
                int i2 = i - 1;
                this.b = i2;
                this.c = i2;
                a<E> aVar = this.a;
                return aVar.a[aVar.b + i2];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                b();
                int i = this.c;
                if (i == -1) {
                    ib5.a("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                a<E> aVar = this.a;
                aVar.c(i);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(E e) {
                b();
                int i = this.c;
                if (i != -1) {
                    this.a.set(i, e);
                } else {
                    ib5.a("Call next() or previous() before replacing element from the iterator.");
                }
            }
        }

        public a(E[] eArr, int i, int i2, a<E> aVar, ngs<E> ngsVar) {
            eArr.getClass();
            this.a = eArr;
            this.b = i;
            this.c = i2;
            this.d = aVar;
            this.e = ngsVar;
            ((AbstractList) this).modCount = ((AbstractList) ngsVar).modCount;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, E e) {
            i();
            h();
            q3.Companion companion = q3.INSTANCE;
            int i2 = this.c;
            companion.getClass();
            q3.Companion.c(i, i2);
            f(this.b + i, e);
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection<? extends E> collection) {
            collection.getClass();
            i();
            h();
            q3.Companion companion = q3.INSTANCE;
            int i2 = this.c;
            companion.getClass();
            q3.Companion.c(i, i2);
            int size = collection.size();
            e(this.b + i, collection, size);
            return size > 0;
        }

        @Override // defpackage.g4
        /* JADX INFO: renamed from: b */
        public final int getC() {
            h();
            return this.c;
        }

        @Override // defpackage.g4
        public final E c(int i) {
            i();
            h();
            q3.Companion companion = q3.INSTANCE;
            int i2 = this.c;
            companion.getClass();
            q3.Companion.b(i, i2);
            return j(this.b + i);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            i();
            h();
            k(this.b, this.c);
        }

        public final void e(int i, Collection<? extends E> collection, int i2) {
            ((AbstractList) this).modCount++;
            ngs<E> ngsVar = this.e;
            a<E> aVar = this.d;
            if (aVar != null) {
                aVar.e(i, collection, i2);
            } else {
                ngs ngsVar2 = ngs.e;
                ngsVar.e(i, collection, i2);
            }
            this.a = ngsVar.a;
            this.c += i2;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            h();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                E[] eArr = this.a;
                int i = this.c;
                if (i == list.size()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (Intrinsics.g(eArr[this.b + i2], list.get(i2))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final void f(int i, E e) {
            ((AbstractList) this).modCount++;
            ngs<E> ngsVar = this.e;
            a<E> aVar = this.d;
            if (aVar != null) {
                aVar.f(i, e);
            } else {
                ngs ngsVar2 = ngs.e;
                ngsVar.f(i, e);
            }
            this.a = ngsVar.a;
            this.c++;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i) {
            h();
            q3.Companion companion = q3.INSTANCE;
            int i2 = this.c;
            companion.getClass();
            q3.Companion.b(i, i2);
            return this.a[this.b + i];
        }

        public final void h() {
            if (((AbstractList) this.e).modCount == ((AbstractList) this).modCount) {
                return;
            }
            sx0.a();
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            h();
            E[] eArr = this.a;
            int i = this.c;
            int iHashCode = 1;
            for (int i2 = 0; i2 < i; i2++) {
                E e = eArr[this.b + i2];
                iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
            }
            return iHashCode;
        }

        public final void i() {
            if (this.e.c) {
                bl0.a();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            h();
            for (int i = 0; i < this.c; i++) {
                if (Intrinsics.g(this.a[this.b + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            h();
            return this.c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        public final E j(int i) {
            E eJ;
            ((AbstractList) this).modCount++;
            a<E> aVar = this.d;
            if (aVar != null) {
                eJ = aVar.j(i);
            } else {
                ngs ngsVar = ngs.e;
                eJ = this.e.j(i);
            }
            this.c--;
            return eJ;
        }

        public final void k(int i, int i2) {
            if (i2 > 0) {
                ((AbstractList) this).modCount++;
            }
            a<E> aVar = this.d;
            if (aVar != null) {
                aVar.k(i, i2);
            } else {
                ngs ngsVar = ngs.e;
                this.e.k(i, i2);
            }
            this.c -= i2;
        }

        public final int l(int i, int i2, Collection<? extends E> collection, boolean z) {
            int iL;
            a<E> aVar = this.d;
            if (aVar != null) {
                iL = aVar.l(i, i2, collection, z);
            } else {
                ngs ngsVar = ngs.e;
                iL = this.e.l(i, i2, collection, z);
            }
            if (iL > 0) {
                ((AbstractList) this).modCount++;
            }
            this.c -= iL;
            return iL;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            h();
            for (int i = this.c - 1; i >= 0; i--) {
                if (Intrinsics.g(this.a[this.b + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator(int i) {
            h();
            q3.Companion companion = q3.INSTANCE;
            int i2 = this.c;
            companion.getClass();
            q3.Companion.c(i, i2);
            return new C0898a(this, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            i();
            h();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                c(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection<?> collection) {
            collection.getClass();
            i();
            h();
            return l(this.b, this.c, collection, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            i();
            h();
            return l(this.b, this.c, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E set(int i, E e) {
            i();
            h();
            q3.Companion companion = q3.INSTANCE;
            int i2 = this.c;
            companion.getClass();
            q3.Companion.b(i, i2);
            E[] eArr = this.a;
            int i3 = this.b + i;
            E e2 = eArr[i3];
            eArr[i3] = e;
            return e2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<E> subList(int i, int i2) {
            q3.Companion companion = q3.INSTANCE;
            int i3 = this.c;
            companion.getClass();
            q3.Companion.d(i, i2, i3);
            return new a(this.a, this.b + i, i2 - i, this, this.e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final <T> T[] toArray(T[] tArr) {
            tArr.getClass();
            h();
            int length = tArr.length;
            int i = this.c;
            E[] eArr = this.a;
            int i2 = this.b;
            if (length < i) {
                T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
                tArr2.getClass();
                return tArr2;
            }
            xx0.e(0, i2, i + i2, eArr, tArr);
            int i3 = this.c;
            if (i3 < tArr.length) {
                tArr[i3] = null;
            }
            return tArr;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            h();
            return ogs.b(this.a, this.b, this.c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e) {
            i();
            h();
            f(this.b + this.c, e);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends E> collection) {
            collection.getClass();
            i();
            h();
            int size = collection.size();
            e(this.b + this.c, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            h();
            E[] eArr = this.a;
            int i = this.c;
            int i2 = this.b;
            return xx0.k(i2, i + i2, eArr);
        }
    }

    public ngs() {
        this(0, 1, null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        h();
        int i = this.b;
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.a[i] = e2;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        h();
        int size = collection.size();
        e(this.b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return xx0.k(0, this.b, this.a);
    }
}
