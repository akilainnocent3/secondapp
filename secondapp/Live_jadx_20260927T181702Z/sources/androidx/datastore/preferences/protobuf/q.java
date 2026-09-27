package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class q extends c<Boolean> implements t1.a, RandomAccess, n3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f10188f = new q(new boolean[0], 0, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean[] f10189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10190e;

    public q() {
        this(new boolean[10], 0, true);
    }

    public static q h() {
        return f10188f;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        d();
        t1.d(collection);
        if (!(collection instanceof q)) {
            return super.addAll(collection);
        }
        q qVar = (q) collection;
        int i10 = qVar.f10190e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10190e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f10189d;
        if (i12 > zArr.length) {
            this.f10189d = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(qVar.f10189d, 0, this.f10189d, this.f10190e, qVar.f10190e);
        this.f10190e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.a
    public void addBoolean(boolean element) {
        d();
        int i10 = this.f10190e;
        boolean[] zArr = this.f10189d;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f10189d = zArr2;
        }
        boolean[] zArr3 = this.f10189d;
        int i11 = this.f10190e;
        this.f10190e = i11 + 1;
        zArr3[i11] = element;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int index, Boolean element) {
        g(index, element.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof q)) {
            return super.equals(o10);
        }
        q qVar = (q) o10;
        if (this.f10190e != qVar.f10190e) {
            return false;
        }
        boolean[] zArr = qVar.f10189d;
        for (int i10 = 0; i10 < this.f10190e; i10++) {
            if (this.f10189d[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean element) {
        addBoolean(element.booleanValue());
        return true;
    }

    public final void g(int index, boolean element) {
        int i10;
        d();
        if (index < 0 || index > (i10 = this.f10190e)) {
            throw new IndexOutOfBoundsException(l(index));
        }
        boolean[] zArr = this.f10189d;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, index, zArr, index + 1, i10 - index);
        } else {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, index);
            System.arraycopy(this.f10189d, index, zArr2, index + 1, this.f10190e - index);
            this.f10189d = zArr2;
        }
        this.f10189d[index] = element;
        this.f10190e++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.a
    public boolean getBoolean(int index) {
        i(index);
        return this.f10189d[index];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iK = 1;
        for (int i10 = 0; i10 < this.f10190e; i10++) {
            iK = (iK * 31) + t1.k(this.f10189d[i10]);
        }
        return iK;
    }

    public final void i(int index) {
        if (index < 0 || index >= this.f10190e) {
            throw new IndexOutOfBoundsException(l(index));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) element).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10189d[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean get(int index) {
        return Boolean.valueOf(getBoolean(index));
    }

    public final String l(int index) {
        return "Index:" + index + ", Size:" + this.f10190e;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int index) {
        d();
        i(index);
        boolean[] zArr = this.f10189d;
        boolean z10 = zArr[index];
        int i10 = this.f10190e;
        if (index < i10 - 1) {
            System.arraycopy(zArr, index + 1, zArr, index, (i10 - index) - 1);
        }
        this.f10190e--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Boolean set(int index, Boolean element) {
        return Boolean.valueOf(setBoolean(index, element.booleanValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int fromIndex, int toIndex) {
        d();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f10189d;
        System.arraycopy(zArr, toIndex, zArr, fromIndex, this.f10190e - toIndex);
        this.f10190e -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.a
    public boolean setBoolean(int index, boolean element) {
        d();
        i(index);
        boolean[] zArr = this.f10189d;
        boolean z10 = zArr[index];
        zArr[index] = element;
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10190e;
    }

    public q(boolean[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f10189d = other;
        this.f10190e = size;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public t1.l<Boolean> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f10190e) {
            return new q(Arrays.copyOf(this.f10189d, capacity), this.f10190e, true);
        }
        throw new IllegalArgumentException();
    }
}
