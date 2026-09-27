package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends c<Integer> implements t1.g, RandomAccess, n3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r1 f10196f = new r1(new int[0], 0, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f10197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10198e;

    public r1() {
        this(new int[10], 0, true);
    }

    public static r1 h() {
        return f10196f;
    }

    private void i(int index) {
        if (index < 0 || index >= this.f10198e) {
            throw new IndexOutOfBoundsException(l(index));
        }
    }

    private String l(int index) {
        return "Index:" + index + ", Size:" + this.f10198e;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        d();
        t1.d(collection);
        if (!(collection instanceof r1)) {
            return super.addAll(collection);
        }
        r1 r1Var = (r1) collection;
        int i10 = r1Var.f10198e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10198e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f10197d;
        if (i12 > iArr.length) {
            this.f10197d = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(r1Var.f10197d, 0, this.f10197d, this.f10198e, r1Var.f10198e);
        this.f10198e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.g
    public void addInt(int element) {
        d();
        int i10 = this.f10198e;
        int[] iArr = this.f10197d;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f10197d = iArr2;
        }
        int[] iArr3 = this.f10197d;
        int i11 = this.f10198e;
        this.f10198e = i11 + 1;
        iArr3[i11] = element;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int index, Integer element) {
        g(index, element.intValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof r1)) {
            return super.equals(o10);
        }
        r1 r1Var = (r1) o10;
        if (this.f10198e != r1Var.f10198e) {
            return false;
        }
        int[] iArr = r1Var.f10197d;
        for (int i10 = 0; i10 < this.f10198e; i10++) {
            if (this.f10197d[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer element) {
        addInt(element.intValue());
        return true;
    }

    public final void g(int index, int element) {
        int i10;
        d();
        if (index < 0 || index > (i10 = this.f10198e)) {
            throw new IndexOutOfBoundsException(l(index));
        }
        int[] iArr = this.f10197d;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, index, iArr, index + 1, i10 - index);
        } else {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, index);
            System.arraycopy(this.f10197d, index, iArr2, index + 1, this.f10198e - index);
            this.f10197d = iArr2;
        }
        this.f10197d[index] = element;
        this.f10198e++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.g
    public int getInt(int index) {
        i(index);
        return this.f10197d[index];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f10198e; i11++) {
            i10 = (i10 * 31) + this.f10197d[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) element).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10197d[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Integer get(int index) {
        return Integer.valueOf(getInt(index));
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer remove(int index) {
        d();
        i(index);
        int[] iArr = this.f10197d;
        int i10 = iArr[index];
        int i11 = this.f10198e;
        if (index < i11 - 1) {
            System.arraycopy(iArr, index + 1, iArr, index, (i11 - index) - 1);
        }
        this.f10198e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer set(int index, Integer element) {
        return Integer.valueOf(setInt(index, element.intValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int fromIndex, int toIndex) {
        d();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f10197d;
        System.arraycopy(iArr, toIndex, iArr, fromIndex, this.f10198e - toIndex);
        this.f10198e -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.g
    public int setInt(int index, int element) {
        d();
        i(index);
        int[] iArr = this.f10197d;
        int i10 = iArr[index];
        iArr[index] = element;
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10198e;
    }

    public r1(int[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f10197d = other;
        this.f10198e = size;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public t1.l<Integer> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f10198e) {
            return new r1(Arrays.copyOf(this.f10197d, capacity), this.f10198e, true);
        }
        throw new IllegalArgumentException();
    }
}
