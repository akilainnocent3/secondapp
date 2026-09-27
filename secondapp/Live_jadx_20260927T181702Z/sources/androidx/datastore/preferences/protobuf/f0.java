package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends c<Double> implements t1.b, RandomAccess, n3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f0 f9909f = new f0(new double[0], 0, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double[] f9910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9911e;

    public f0() {
        this(new double[10], 0, true);
    }

    public static f0 h() {
        return f9909f;
    }

    private void i(int index) {
        if (index < 0 || index >= this.f9911e) {
            throw new IndexOutOfBoundsException(l(index));
        }
    }

    private String l(int index) {
        return "Index:" + index + ", Size:" + this.f9911e;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        d();
        t1.d(collection);
        if (!(collection instanceof f0)) {
            return super.addAll(collection);
        }
        f0 f0Var = (f0) collection;
        int i10 = f0Var.f9911e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f9911e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f9910d;
        if (i12 > dArr.length) {
            this.f9910d = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(f0Var.f9910d, 0, this.f9910d, this.f9911e, f0Var.f9911e);
        this.f9911e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.b
    public void addDouble(double element) {
        d();
        int i10 = this.f9911e;
        double[] dArr = this.f9910d;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f9910d = dArr2;
        }
        double[] dArr3 = this.f9910d;
        int i11 = this.f9911e;
        this.f9911e = i11 + 1;
        dArr3[i11] = element;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int index, Double element) {
        g(index, element.doubleValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof f0)) {
            return super.equals(o10);
        }
        f0 f0Var = (f0) o10;
        if (this.f9911e != f0Var.f9911e) {
            return false;
        }
        double[] dArr = f0Var.f9910d;
        for (int i10 = 0; i10 < this.f9911e; i10++) {
            if (Double.doubleToLongBits(this.f9910d[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Double element) {
        addDouble(element.doubleValue());
        return true;
    }

    public final void g(int index, double element) {
        int i10;
        d();
        if (index < 0 || index > (i10 = this.f9911e)) {
            throw new IndexOutOfBoundsException(l(index));
        }
        double[] dArr = this.f9910d;
        if (i10 < dArr.length) {
            System.arraycopy(dArr, index, dArr, index + 1, i10 - index);
        } else {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, index);
            System.arraycopy(this.f9910d, index, dArr2, index + 1, this.f9911e - index);
            this.f9910d = dArr2;
        }
        this.f9910d[index] = element;
        this.f9911e++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.b
    public double getDouble(int index) {
        i(index);
        return this.f9910d[index];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iS = 1;
        for (int i10 = 0; i10 < this.f9911e; i10++) {
            iS = (iS * 31) + t1.s(Double.doubleToLongBits(this.f9910d[i10]));
        }
        return iS;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) element).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f9910d[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Double get(int index) {
        return Double.valueOf(getDouble(index));
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Double remove(int index) {
        d();
        i(index);
        double[] dArr = this.f9910d;
        double d10 = dArr[index];
        int i10 = this.f9911e;
        if (index < i10 - 1) {
            System.arraycopy(dArr, index + 1, dArr, index, (i10 - index) - 1);
        }
        this.f9911e--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Double set(int index, Double element) {
        return Double.valueOf(setDouble(index, element.doubleValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int fromIndex, int toIndex) {
        d();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f9910d;
        System.arraycopy(dArr, toIndex, dArr, fromIndex, this.f9911e - toIndex);
        this.f9911e -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.b
    public double setDouble(int index, double element) {
        d();
        i(index);
        double[] dArr = this.f9910d;
        double d10 = dArr[index];
        dArr[index] = element;
        return d10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9911e;
    }

    public f0(double[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f9910d = other;
        this.f9911e = size;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
    /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: merged with bridge method [inline-methods] */
    public t1.l<Double> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f9911e) {
            return new f0(Arrays.copyOf(this.f9910d, capacity), this.f9911e, true);
        }
        throw new IllegalArgumentException();
    }
}
