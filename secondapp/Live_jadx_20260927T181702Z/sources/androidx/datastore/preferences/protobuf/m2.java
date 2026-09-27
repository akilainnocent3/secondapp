package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class m2 extends c<Long> implements t1.j, RandomAccess, n3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m2 f10127f = new m2(new long[0], 0, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f10128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10129e;

    public m2() {
        this(new long[10], 0, true);
    }

    public static m2 h() {
        return f10127f;
    }

    private void i(int index) {
        if (index < 0 || index >= this.f10129e) {
            throw new IndexOutOfBoundsException(l(index));
        }
    }

    private String l(int index) {
        return "Index:" + index + ", Size:" + this.f10129e;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        d();
        t1.d(collection);
        if (!(collection instanceof m2)) {
            return super.addAll(collection);
        }
        m2 m2Var = (m2) collection;
        int i10 = m2Var.f10129e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10129e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f10128d;
        if (i12 > jArr.length) {
            this.f10128d = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(m2Var.f10128d, 0, this.f10128d, this.f10129e, m2Var.f10129e);
        this.f10129e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.j
    public void addLong(long element) {
        d();
        int i10 = this.f10129e;
        long[] jArr = this.f10128d;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f10128d = jArr2;
        }
        long[] jArr3 = this.f10128d;
        int i11 = this.f10129e;
        this.f10129e = i11 + 1;
        jArr3[i11] = element;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int index, Long element) {
        g(index, element.longValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof m2)) {
            return super.equals(o10);
        }
        m2 m2Var = (m2) o10;
        if (this.f10129e != m2Var.f10129e) {
            return false;
        }
        long[] jArr = m2Var.f10128d;
        for (int i10 = 0; i10 < this.f10129e; i10++) {
            if (this.f10128d[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Long element) {
        addLong(element.longValue());
        return true;
    }

    public final void g(int index, long element) {
        int i10;
        d();
        if (index < 0 || index > (i10 = this.f10129e)) {
            throw new IndexOutOfBoundsException(l(index));
        }
        long[] jArr = this.f10128d;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, index, jArr, index + 1, i10 - index);
        } else {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, index);
            System.arraycopy(this.f10128d, index, jArr2, index + 1, this.f10129e - index);
            this.f10128d = jArr2;
        }
        this.f10128d[index] = element;
        this.f10129e++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.j
    public long getLong(int index) {
        i(index);
        return this.f10128d[index];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iS = 1;
        for (int i10 = 0; i10 < this.f10129e; i10++) {
            iS = (iS * 31) + t1.s(this.f10128d[i10]);
        }
        return iS;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) element).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10128d[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Long get(int index) {
        return Long.valueOf(getLong(index));
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long remove(int index) {
        d();
        i(index);
        long[] jArr = this.f10128d;
        long j10 = jArr[index];
        int i10 = this.f10129e;
        if (index < i10 - 1) {
            System.arraycopy(jArr, index + 1, jArr, index, (i10 - index) - 1);
        }
        this.f10129e--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Long set(int index, Long element) {
        return Long.valueOf(setLong(index, element.longValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int fromIndex, int toIndex) {
        d();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f10128d;
        System.arraycopy(jArr, toIndex, jArr, fromIndex, this.f10129e - toIndex);
        this.f10129e -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.j
    public long setLong(int index, long element) {
        d();
        i(index);
        long[] jArr = this.f10128d;
        long j10 = jArr[index];
        jArr[index] = element;
        return j10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10129e;
    }

    public m2(long[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f10128d = other;
        this.f10129e = size;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public t1.l<Long> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f10129e) {
            return new m2(Arrays.copyOf(this.f10128d, capacity), this.f10129e, true);
        }
        throw new IllegalArgumentException();
    }
}
