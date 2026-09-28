package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0006B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lgx0;", "E", "Lg4;", "<init>", "()V", "d", "a", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gx0<E> extends g4<E> {
    public static final Object[] e = new Object[0];
    public int a;
    public Object[] b;
    public int c;

    public gx0(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = e;
        } else {
            if (i <= 0) {
                hb5.a(hce0.a(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e2) {
        q3.Companion companion = q3.INSTANCE;
        int i2 = this.c;
        companion.getClass();
        q3.Companion.c(i, i2);
        if (i == this.c) {
            addLast(e2);
            return;
        }
        if (i == 0) {
            addFirst(e2);
            return;
        }
        m();
        e(this.c + 1);
        int iL = l(this.a + i);
        int i3 = this.c;
        if (i < ((i3 + 1) >> 1)) {
            int iA = iL == 0 ? ay0.A(this.b) : iL - 1;
            int i4 = this.a;
            int iA2 = i4 == 0 ? ay0.A(this.b) : i4 - 1;
            int i5 = this.a;
            Object[] objArr = this.b;
            if (iA >= i5) {
                objArr[iA2] = objArr[i5];
                xx0.e(i5, i5 + 1, iA + 1, objArr, objArr);
            } else {
                xx0.e(i5 - 1, i5, objArr.length, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[objArr2.length - 1] = objArr2[0];
                xx0.e(0, 1, iA + 1, objArr2, objArr2);
            }
            this.b[iA] = e2;
            this.a = iA2;
        } else {
            int iL2 = l(i3 + this.a);
            Object[] objArr3 = this.b;
            if (iL < iL2) {
                xx0.e(iL + 1, iL, iL2, objArr3, objArr3);
            } else {
                xx0.e(1, 0, iL2, objArr3, objArr3);
                Object[] objArr4 = this.b;
                objArr4[0] = objArr4[objArr4.length - 1];
                xx0.e(iL + 1, iL, objArr4.length - 1, objArr4, objArr4);
            }
            this.b[iL] = e2;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        q3.Companion companion = q3.INSTANCE;
        int i2 = this.c;
        companion.getClass();
        q3.Companion.c(i, i2);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        m();
        e(collection.size() + this.c);
        int iL = l(this.c + this.a);
        int iL2 = l(this.a + i);
        int size = collection.size();
        if (i >= ((this.c + 1) >> 1)) {
            int i3 = iL2 + size;
            Object[] objArr = this.b;
            if (iL2 < iL) {
                int i4 = size + iL;
                if (i4 <= objArr.length) {
                    xx0.e(i3, iL2, iL, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    xx0.e(i3 - objArr.length, iL2, iL, objArr, objArr);
                } else {
                    int length = iL - (i4 - objArr.length);
                    xx0.e(0, length, iL, objArr, objArr);
                    Object[] objArr2 = this.b;
                    xx0.e(i3, iL2, length, objArr2, objArr2);
                }
            } else {
                xx0.e(size, 0, iL, objArr, objArr);
                Object[] objArr3 = this.b;
                if (i3 >= objArr3.length) {
                    xx0.e(i3 - objArr3.length, iL2, objArr3.length, objArr3, objArr3);
                } else {
                    xx0.e(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.b;
                    xx0.e(i3, iL2, objArr4.length - size, objArr4, objArr4);
                }
            }
            d(iL2, collection);
            return true;
        }
        int i5 = this.a;
        int length2 = i5 - size;
        Object[] objArr5 = this.b;
        if (iL2 < i5) {
            xx0.e(length2, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.b;
            if (size >= iL2) {
                xx0.e(objArr6.length - size, 0, iL2, objArr6, objArr6);
            } else {
                xx0.e(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.b;
                xx0.e(0, size, iL2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            xx0.e(length2, i5, iL2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i6 = iL2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                xx0.e(length2, i5, iL2, objArr5, objArr5);
            } else {
                xx0.e(length2, i5, i5 + length3, objArr5, objArr5);
                Object[] objArr8 = this.b;
                xx0.e(0, this.a + length3, iL2, objArr8, objArr8);
            }
        }
        this.a = length2;
        d(j(iL2 - size), collection);
        return true;
    }

    public final void addFirst(E e2) {
        m();
        e(this.c + 1);
        int i = this.a;
        int iA = i == 0 ? ay0.A(this.b) : i - 1;
        this.a = iA;
        this.b[iA] = e2;
        this.c++;
    }

    public final void addLast(E e2) {
        m();
        e(getB() + 1);
        this.b[l(getB() + this.a)] = e2;
        this.c = getB() + 1;
    }

    @Override // defpackage.g4
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getB() {
        return this.c;
    }

    @Override // defpackage.g4
    public final E c(int i) {
        q3.Companion companion = q3.INSTANCE;
        int i2 = this.c;
        companion.getClass();
        q3.Companion.b(i, i2);
        if (i == getB() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m();
        int iL = l(this.a + i);
        Object[] objArr = this.b;
        E e2 = (E) objArr[iL];
        int i3 = this.c >> 1;
        int i4 = this.a;
        if (i < i3) {
            if (iL >= i4) {
                xx0.e(i4 + 1, i4, iL, objArr, objArr);
            } else {
                xx0.e(1, 0, iL, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.a;
                xx0.e(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i6 = this.a;
            objArr3[i6] = null;
            this.a = h(i6);
        } else {
            int iL2 = l((getB() - 1) + i4);
            Object[] objArr4 = this.b;
            if (iL <= iL2) {
                xx0.e(iL, iL + 1, iL2 + 1, objArr4, objArr4);
            } else {
                xx0.e(iL, iL + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                xx0.e(0, 1, iL2 + 1, objArr5, objArr5);
            }
            this.b[iL2] = null;
        }
        this.c--;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m();
            k(this.a, l(getB() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    public final void e(int i) {
        if (i < 0) {
            ib5.a("Deque is too big.");
            return;
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == e) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        q3.Companion companion = q3.INSTANCE;
        int length = objArr.length;
        companion.getClass();
        Object[] objArr2 = new Object[q3.Companion.e(length, i)];
        Object[] objArr3 = this.b;
        xx0.e(0, this.a, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.b;
        int length2 = objArr4.length;
        int i2 = this.a;
        xx0.e(length2 - i2, 0, i2, objArr4, objArr2);
        this.a = 0;
        this.b = objArr2;
    }

    public final E f() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.b[this.a];
    }

    public final E first() {
        if (!isEmpty()) {
            return (E) this.b[this.a];
        }
        ibh0.a("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        q3.Companion companion = q3.INSTANCE;
        int i2 = this.c;
        companion.getClass();
        q3.Companion.b(i, i2);
        return (E) this.b[l(this.a + i)];
    }

    public final int h(int i) {
        if (i == ay0.A(this.b)) {
            return 0;
        }
        return i + 1;
    }

    public final E i() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.b[l((size() - 1) + this.a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iL = l(getB() + this.a);
        int length = this.a;
        if (length < iL) {
            while (length < iL) {
                if (Intrinsics.g(obj, this.b[length])) {
                    i = this.a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.a) < iL) {
            return -1;
        }
        int length2 = this.b.length;
        while (length < length2) {
            if (Intrinsics.g(obj, this.b[length])) {
                i = this.a;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iL; i2++) {
            if (Intrinsics.g(obj, this.b[i2])) {
                length = i2 + this.b.length;
                i = this.a;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return getB() == 0;
    }

    public final int j(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    public final void k(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            xx0.l(i, i2, null, objArr);
        } else {
            xx0.l(i, objArr.length, null, objArr);
            xx0.l(0, i2, null, this.b);
        }
    }

    public final int l(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final E last() {
        if (isEmpty()) {
            ibh0.a("ArrayDeque is empty.");
            return null;
        }
        return (E) this.b[l((size() - 1) + this.a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int iA;
        int i;
        int iL = l(getB() + this.a);
        int i2 = this.a;
        if (i2 < iL) {
            iA = iL - 1;
            if (i2 <= iA) {
                while (!Intrinsics.g(obj, this.b[iA])) {
                    if (iA != i2) {
                        iA--;
                    }
                }
                i = this.a;
                return iA - i;
            }
            return -1;
        }
        if (!isEmpty() && this.a >= iL) {
            do {
                iL--;
                objArr = this.b;
                if (-1 >= iL) {
                    iA = ay0.A(objArr);
                    int i3 = this.a;
                    if (i3 <= iA) {
                        while (!Intrinsics.g(obj, this.b[iA])) {
                            if (iA != i3) {
                                iA--;
                            }
                        }
                        i = this.a;
                    }
                }
                return iA - i;
            } while (!Intrinsics.g(obj, objArr[iL]));
            iA = iL + this.b.length;
            i = this.a;
            return iA - i;
        }
        return -1;
    }

    public final void m() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        int iL;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iL2 = l(getB() + this.a);
            int i = this.a;
            if (i < iL2) {
                iL = i;
                while (true) {
                    objArr = this.b;
                    if (i >= iL2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.b[iL] = obj;
                        iL++;
                    }
                    i++;
                }
                xx0.l(iL, iL2, null, objArr);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iL = l(i2);
                for (int i3 = 0; i3 < iL2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.b[iL] = obj3;
                        iL = h(iL);
                    }
                }
                z = z2;
            }
            if (z) {
                m();
                this.c = j(iL - this.a);
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            ibh0.a("ArrayDeque is empty.");
            return null;
        }
        m();
        Object[] objArr = this.b;
        int i = this.a;
        E e2 = (E) objArr[i];
        objArr[i] = null;
        this.a = h(i);
        this.c = getB() - 1;
        return e2;
    }

    public final E removeLast() {
        if (isEmpty()) {
            ibh0.a("ArrayDeque is empty.");
            return null;
        }
        m();
        int iL = l((size() - 1) + this.a);
        Object[] objArr = this.b;
        E e2 = (E) objArr[iL];
        objArr[iL] = null;
        this.c = getB() - 1;
        return e2;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        q3.Companion companion = q3.INSTANCE;
        int i3 = this.c;
        companion.getClass();
        q3.Companion.d(i, i2, i3);
        int i4 = i2 - i;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.c) {
            clear();
            return;
        }
        if (i4 == 1) {
            c(i);
            return;
        }
        m();
        int i5 = this.c - i2;
        int i6 = this.a;
        if (i < i5) {
            int iL = l((i - 1) + i6);
            int iL2 = l(this.a + (i2 - 1));
            while (i > 0) {
                int i7 = iL + 1;
                int iMin = Math.min(i, Math.min(i7, iL2 + 1));
                Object[] objArr = this.b;
                int i8 = iL2 - iMin;
                int i9 = iL - iMin;
                xx0.e(i8 + 1, i9 + 1, i7, objArr, objArr);
                iL = j(i9);
                iL2 = j(i8);
                i -= iMin;
            }
            int iL3 = l(this.a + i4);
            k(this.a, iL3);
            this.a = iL3;
        } else {
            int iL4 = l(i6 + i2);
            int iL5 = l(this.a + i);
            int i10 = this.c;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(i10, Math.min(objArr2.length - iL4, objArr2.length - iL5));
                Object[] objArr3 = this.b;
                int i11 = iL4 + i2;
                xx0.e(iL5, iL4, i11, objArr3, objArr3);
                iL4 = l(i11);
                iL5 = l(iL5 + i2);
            }
            int iL6 = l(this.c + this.a);
            k(j(iL6 - i4), iL6);
        }
        this.c -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        int iL;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iL2 = l(getB() + this.a);
            int i = this.a;
            if (i < iL2) {
                iL = i;
                while (true) {
                    objArr = this.b;
                    if (i >= iL2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.b[iL] = obj;
                        iL++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                xx0.l(iL, iL2, null, objArr);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iL = l(i2);
                for (int i3 = 0; i3 < iL2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[iL] = obj3;
                        iL = h(iL);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m();
                this.c = j(iL - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e2) {
        q3.Companion companion = q3.INSTANCE;
        int i2 = this.c;
        companion.getClass();
        q3.Companion.b(i, i2);
        int iL = l(this.a + i);
        Object[] objArr = this.b;
        E e3 = (E) objArr[iL];
        objArr[iL] = e2;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        int i = this.c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            tArr = (T[]) ((Object[]) objNewInstance);
        }
        int iL = l(this.c + this.a);
        int i2 = this.a;
        if (i2 < iL) {
            xx0.i(i2, iL, 2, this.b, tArr);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            xx0.e(0, this.a, objArr.length, objArr, tArr);
            Object[] objArr2 = this.b;
            xx0.e(objArr2.length - this.a, 0, iL, objArr2, tArr);
        }
        int i3 = this.c;
        if (i3 < tArr.length) {
            tArr[i3] = null;
        }
        return tArr;
    }

    public gx0() {
        this.b = e;
    }

    public gx0(ep50 ep50Var) {
        Object[] objArrB = e48.b(ep50Var, new Object[0]);
        this.b = objArrB;
        this.c = objArrB.length;
        if (objArrB.length == 0) {
            this.b = e;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[getB()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        addLast(e2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        m();
        e(collection.size() + getB());
        d(l(getB() + this.a), collection);
        return true;
    }
}
