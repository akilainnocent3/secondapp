package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class q3<E> extends c<E> implements RandomAccess {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q3<Object> f10192f = new q3<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E[] f10193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10194e;

    public q3() {
        this(new Object[10], 0, true);
    }

    public static <E> E[] e(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> q3<E> f() {
        return (q3<E>) f10192f;
    }

    private void g(int index) {
        if (index < 0 || index >= this.f10194e) {
            throw new IndexOutOfBoundsException(h(index));
        }
    }

    private String h(int index) {
        return "Index:" + index + ", Size:" + this.f10194e;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        d();
        int i10 = this.f10194e;
        E[] eArr = this.f10193d;
        if (i10 == eArr.length) {
            this.f10193d = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f10193d;
        int i11 = this.f10194e;
        this.f10194e = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        g(index);
        return this.f10193d[index];
    }

    @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public q3<E> mutableCopyWithCapacity(int capacity) {
        if (capacity >= this.f10194e) {
            return new q3<>(Arrays.copyOf(this.f10193d, capacity), this.f10194e, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int index) {
        d();
        g(index);
        E[] eArr = this.f10193d;
        E e10 = eArr[index];
        int i10 = this.f10194e;
        if (index < i10 - 1) {
            System.arraycopy(eArr, index + 1, eArr, index, (i10 - index) - 1);
        }
        this.f10194e--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        d();
        g(index);
        E[] eArr = this.f10193d;
        E e10 = eArr[index];
        eArr[index] = element;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10194e;
    }

    public q3(E[] array, int size, boolean isMutable) {
        super(isMutable);
        this.f10193d = array;
        this.f10194e = size;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f10194e)) {
            E[] eArr = this.f10193d;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) e(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f10193d, 0, eArr2, 0, i10);
                System.arraycopy(this.f10193d, i10, eArr2, i10 + 1, this.f10194e - i10);
                this.f10193d = eArr2;
            }
            this.f10193d[i10] = e10;
            this.f10194e++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(h(i10));
    }
}
