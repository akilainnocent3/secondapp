package lj;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@f
@yi.b
public final class a {

    /* JADX INFO: renamed from: lj.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.b
    public static class C0988a extends AbstractList<Boolean> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f104557e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f104558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f104559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f104560d;

        public C0988a(boolean[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zq.a Object target) {
            return (target instanceof Boolean) && a.m(this.f104558b, ((Boolean) target).booleanValue(), this.f104559c, this.f104560d) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean get(int index) {
            l0.C(index, size());
            return Boolean.valueOf(this.f104558b[this.f104559c + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean set(int index, Boolean element) {
            l0.C(index, size());
            boolean[] zArr = this.f104558b;
            int i10 = this.f104559c;
            boolean z10 = zArr[i10 + index];
            zArr[i10 + index] = ((Boolean) l0.E(element)).booleanValue();
            return Boolean.valueOf(z10);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@zq.a Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof C0988a)) {
                return super.equals(object);
            }
            C0988a c0988a = (C0988a) object;
            int size = size();
            if (c0988a.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f104558b[this.f104559c + i10] != c0988a.f104558b[c0988a.f104559c + i10]) {
                    return false;
                }
            }
            return true;
        }

        public boolean[] g() {
            return Arrays.copyOfRange(this.f104558b, this.f104559c, this.f104560d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iK = 1;
            for (int i10 = this.f104559c; i10 < this.f104560d; i10++) {
                iK = (iK * 31) + a.k(this.f104558b[i10]);
            }
            return iK;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zq.a Object target) {
            int iM;
            if (!(target instanceof Boolean) || (iM = a.m(this.f104558b, ((Boolean) target).booleanValue(), this.f104559c, this.f104560d)) < 0) {
                return -1;
            }
            return iM - this.f104559c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zq.a Object target) {
            int iQ;
            if (!(target instanceof Boolean) || (iQ = a.q(this.f104558b, ((Boolean) target).booleanValue(), this.f104559c, this.f104560d)) < 0) {
                return -1;
            }
            return iQ - this.f104559c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f104560d - this.f104559c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int fromIndex, int toIndex) {
            l0.f0(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            boolean[] zArr = this.f104558b;
            int i10 = this.f104559c;
            return new C0988a(zArr, fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 7);
            sb2.append(this.f104558b[this.f104559c] ? "[true" : "[false");
            int i10 = this.f104559c;
            while (true) {
                i10++;
                if (i10 >= this.f104560d) {
                    sb2.append(fw.b.f85385l);
                    return sb2.toString();
                }
                sb2.append(this.f104558b[i10] ? ", true" : ", false");
            }
        }

        public C0988a(boolean[] array, int start, int end) {
            this.f104558b = array;
            this.f104559c = start;
            this.f104560d = end;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f104564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f104565c;

        b(int trueValue, String toString) {
            this.f104564b = trueValue;
            this.f104565c = toString;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compare(Boolean a10, Boolean b10) {
            return (b10.booleanValue() ? this.f104564b : 0) - (a10.booleanValue() ? this.f104564b : 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f104565c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compare(boolean[] left, boolean[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Boolean.compare(left[i10], right[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }

    public static List<Boolean> c(boolean... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new C0988a(backingArray);
    }

    public static int d(long result) {
        int i10 = (int) result;
        l0.p(result == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i10;
    }

    @qj.m(replacement = "Boolean.compare(a, b)")
    public static int e(boolean a10, boolean b10) {
        return Boolean.compare(a10, b10);
    }

    public static boolean[] f(boolean[]... arrays) {
        long length = 0;
        for (boolean[] zArr : arrays) {
            length += (long) zArr.length;
        }
        boolean[] zArr2 = new boolean[d(length)];
        int length2 = 0;
        for (boolean[] zArr3 : arrays) {
            System.arraycopy(zArr3, 0, zArr2, length2, zArr3.length);
            length2 += zArr3.length;
        }
        return zArr2;
    }

    public static boolean g(boolean[] array, boolean target) {
        for (boolean z10 : array) {
            if (z10 == target) {
                return true;
            }
        }
        return false;
    }

    public static int h(boolean... values) {
        int i10 = 0;
        for (boolean z10 : values) {
            if (z10) {
                i10++;
            }
        }
        return i10;
    }

    public static boolean[] i(boolean[] array, int minLength, int padding) {
        l0.k(minLength >= 0, "Invalid minLength: %s", minLength);
        l0.k(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static Comparator<Boolean> j() {
        return b.FALSE_FIRST;
    }

    public static int k(boolean value) {
        return value ? 1231 : 1237;
    }

    public static int l(boolean[] array, boolean target) {
        return m(array, target, 0, array.length);
    }

    public static int m(boolean[] array, boolean target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int n(boolean[] array, boolean[] target) {
        l0.F(array, "array");
        l0.F(target, "target");
        if (target.length == 0) {
            return 0;
        }
        for (int i10 = 0; i10 < (array.length - target.length) + 1; i10++) {
            for (int i11 = 0; i11 < target.length; i11++) {
                if (array[i10 + i11] != target[i11]) {
                }
            }
            return i10;
        }
        return -1;
    }

    public static String o(String separator, boolean... array) {
        l0.E(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 7);
        sb2.append(array[0]);
        for (int i10 = 1; i10 < array.length; i10++) {
            sb2.append(separator);
            sb2.append(array[i10]);
        }
        return sb2.toString();
    }

    public static int p(boolean[] array, boolean target) {
        return q(array, target, 0, array.length);
    }

    public static int q(boolean[] array, boolean target, int start, int end) {
        for (int i10 = end - 1; i10 >= start; i10--) {
            if (array[i10] == target) {
                return i10;
            }
        }
        return -1;
    }

    public static Comparator<boolean[]> r() {
        return c.INSTANCE;
    }

    public static void s(boolean[] array) {
        l0.E(array);
        t(array, 0, array.length);
    }

    public static void t(boolean[] array, int fromIndex, int toIndex) {
        l0.E(array);
        l0.f0(fromIndex, toIndex, array.length);
        for (int i10 = toIndex - 1; fromIndex < i10; i10--) {
            boolean z10 = array[fromIndex];
            array[fromIndex] = array[i10];
            array[i10] = z10;
            fromIndex++;
        }
    }

    public static void u(boolean[] array, int distance) {
        v(array, distance, 0, array.length);
    }

    public static void v(boolean[] array, int distance, int fromIndex, int toIndex) {
        l0.E(array);
        l0.f0(fromIndex, toIndex, array.length);
        if (array.length <= 1) {
            return;
        }
        int i10 = toIndex - fromIndex;
        int i11 = (-distance) % i10;
        if (i11 < 0) {
            i11 += i10;
        }
        int i12 = i11 + fromIndex;
        if (i12 == fromIndex) {
            return;
        }
        t(array, fromIndex, i12);
        t(array, i12, toIndex);
        t(array, fromIndex, toIndex);
    }

    public static boolean[] w(Collection<Boolean> collection) {
        if (collection instanceof C0988a) {
            return ((C0988a) collection).g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = ((Boolean) l0.E(array[i10])).booleanValue();
        }
        return zArr;
    }

    public static Comparator<Boolean> x() {
        return b.TRUE_FIRST;
    }
}
