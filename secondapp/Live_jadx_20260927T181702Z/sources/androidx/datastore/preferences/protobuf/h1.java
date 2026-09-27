package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends c<Float> implements t1.f, RandomAccess, n3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h1 f10028f = new h1(new float[0], 0, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f10029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10030e;

    public h1() {
        this(new float[10], 0, true);
    }

    public static h1 h() {
        return f10028f;
    }

    private void i(int index) {
        if (index < 0 || index >= this.f10030e) {
            throw new IndexOutOfBoundsException(l(index));
        }
    }

    private String l(int index) {
        return "Index:" + index + ", Size:" + this.f10030e;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        d();
        t1.d(collection);
        if (!(collection instanceof h1)) {
            return super.addAll(collection);
        }
        h1 h1Var = (h1) collection;
        int i10 = h1Var.f10030e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10030e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f10029d;
        if (i12 > fArr.length) {
            this.f10029d = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(h1Var.f10029d, 0, this.f10029d, this.f10030e, h1Var.f10030e);
        this.f10030e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.f
    public void addFloat(float element) {
        d();
        int i10 = this.f10030e;
        float[] fArr = this.f10029d;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f10029d = fArr2;
        }
        float[] fArr3 = this.f10029d;
        int i11 = this.f10030e;
        this.f10030e = i11 + 1;
        fArr3[i11] = element;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int index, Float element) {
        g(index, element.floatValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof h1)) {
            return super.equals(o10);
        }
        h1 h1Var = (h1) o10;
        if (this.f10030e != h1Var.f10030e) {
            return false;
        }
        float[] fArr = h1Var.f10029d;
        for (int i10 = 0; i10 < this.f10030e; i10++) {
            if (Float.floatToIntBits(this.f10029d[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Float element) {
        addFloat(element.floatValue());
        return true;
    }

    public final void g(int index, float element) {
        int i10;
        d();
        if (index < 0 || index > (i10 = this.f10030e)) {
            throw new IndexOutOfBoundsException(l(index));
        }
        float[] fArr = this.f10029d;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, index, fArr, index + 1, i10 - index);
        } else {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, index);
            System.arraycopy(this.f10029d, index, fArr2, index + 1, this.f10030e - index);
            this.f10029d = fArr2;
        }
        this.f10029d[index] = element;
        this.f10030e++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.f
    public float getFloat(int index) {
        i(index);
        return this.f10029d[index];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f10030e; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f10029d[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) element).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10029d[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Float get(int index) {
        return Float.valueOf(getFloat(index));
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Float remove(int index) {
        d();
        i(index);
        float[] fArr = this.f10029d;
        float f10 = fArr[index];
        int i10 = this.f10030e;
        if (index < i10 - 1) {
            System.arraycopy(fArr, index + 1, fArr, index, (i10 - index) - 1);
        }
        this.f10030e--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Float set(int index, Float element) {
        return Float.valueOf(setFloat(index, element.floatValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int fromIndex, int toIndex) {
        d();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f10029d;
        System.arraycopy(fArr, toIndex, fArr, fromIndex, this.f10030e - toIndex);
        this.f10030e -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.f
    public float setFloat(int index, float element) {
        d();
        i(index);
        float[] fArr = this.f10029d;
        float f10 = fArr[index];
        fArr[index] = element;
        return f10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10030e;
    }

    public h1(float[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f10029d = other;
        this.f10030e = size;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.l, androidx.datastore.preferences.protobuf.t1.b
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public t1.l<Float> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f10030e) {
            return new h1(Arrays.copyOf(this.f10029d, capacity), this.f10030e, true);
        }
        throw new IllegalArgumentException();
    }
}
