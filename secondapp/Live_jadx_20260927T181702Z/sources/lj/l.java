package lj;

import f0.j3;
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
@yi.b(emulated = true)
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f104619a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f104620b = 1073741824;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.b
    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f104621e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f104622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f104623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f104624d;

        public a(int[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zq.a Object target) {
            return (target instanceof Integer) && l.o(this.f104622b, ((Integer) target).intValue(), this.f104623c, this.f104624d) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Integer get(int index) {
            l0.C(index, size());
            return Integer.valueOf(this.f104622b[this.f104623c + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer set(int index, Integer element) {
            l0.C(index, size());
            int[] iArr = this.f104622b;
            int i10 = this.f104623c;
            int i11 = iArr[i10 + index];
            iArr[i10 + index] = ((Integer) l0.E(element)).intValue();
            return Integer.valueOf(i11);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@zq.a Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof a)) {
                return super.equals(object);
            }
            a aVar = (a) object;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f104622b[this.f104623c + i10] != aVar.f104622b[aVar.f104623c + i10]) {
                    return false;
                }
            }
            return true;
        }

        public int[] g() {
            return Arrays.copyOfRange(this.f104622b, this.f104623c, this.f104624d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iM = 1;
            for (int i10 = this.f104623c; i10 < this.f104624d; i10++) {
                iM = (iM * 31) + l.m(this.f104622b[i10]);
            }
            return iM;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zq.a Object target) {
            int iO;
            if (!(target instanceof Integer) || (iO = l.o(this.f104622b, ((Integer) target).intValue(), this.f104623c, this.f104624d)) < 0) {
                return -1;
            }
            return iO - this.f104623c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zq.a Object target) {
            int iS;
            if (!(target instanceof Integer) || (iS = l.s(this.f104622b, ((Integer) target).intValue(), this.f104623c, this.f104624d)) < 0) {
                return -1;
            }
            return iS - this.f104623c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f104624d - this.f104623c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int fromIndex, int toIndex) {
            l0.f0(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.f104622b;
            int i10 = this.f104623c;
            return new a(iArr, fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append(fw.b.f85384k);
            sb2.append(this.f104622b[this.f104623c]);
            int i10 = this.f104623c;
            while (true) {
                i10++;
                if (i10 >= this.f104624d) {
                    sb2.append(fw.b.f85385l);
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f104622b[i10]);
            }
        }

        public a(int[] array, int start, int end) {
            this.f104622b = array;
            this.f104623c = start;
            this.f104624d = end;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends zi.i<String, Integer> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zi.i<String, Integer> f104625d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f104626e = 1;

        private Object q() {
            return f104625d;
        }

        @Override // zi.i
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String h(Integer value) {
            return value.toString();
        }

        @Override // zi.i
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Integer i(String value) {
            return Integer.decode(value);
        }

        public String toString() {
            return "Ints.stringConverter()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compare(int[] left, int[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Integer.compare(left[i10], right[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    public static int A(long value) {
        if (value > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (value < j3.f81979h) {
            return Integer.MIN_VALUE;
        }
        return (int) value;
    }

    public static void B(int[] array) {
        l0.E(array);
        C(array, 0, array.length);
    }

    public static void C(int[] array, int fromIndex, int toIndex) {
        l0.E(array);
        l0.f0(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        x(array, fromIndex, toIndex);
    }

    public static zi.i<String, Integer> D() {
        return b.f104625d;
    }

    public static int[] E(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) l0.E(array[i10])).intValue();
        }
        return iArr;
    }

    public static byte[] F(int value) {
        return new byte[]{(byte) (value >> 24), (byte) (value >> 16), (byte) (value >> 8), (byte) value};
    }

    @zq.a
    public static Integer G(String string) {
        return H(string, 10);
    }

    @zq.a
    public static Integer H(String string, int radix) {
        Long lF = n.F(string, radix);
        if (lF == null || lF.longValue() != lF.intValue()) {
            return null;
        }
        return Integer.valueOf(lF.intValue());
    }

    public static List<Integer> c(int... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new a(backingArray);
    }

    public static int d(long result) {
        int i10 = (int) result;
        l0.p(result == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i10;
    }

    public static int e(long value) {
        int i10 = (int) value;
        l0.p(((long) i10) == value, "Out of range: %s", value);
        return i10;
    }

    @qj.m(replacement = "Integer.compare(a, b)")
    public static int f(int a10, int b10) {
        return Integer.compare(a10, b10);
    }

    public static int[] g(int[]... arrays) {
        long length = 0;
        for (int[] iArr : arrays) {
            length += (long) iArr.length;
        }
        int[] iArr2 = new int[d(length)];
        int length2 = 0;
        for (int[] iArr3 : arrays) {
            System.arraycopy(iArr3, 0, iArr2, length2, iArr3.length);
            length2 += iArr3.length;
        }
        return iArr2;
    }

    public static int h(int value, int min, int max) {
        l0.m(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        return Math.min(Math.max(value, min), max);
    }

    public static boolean i(int[] array, int target) {
        for (int i10 : array) {
            if (i10 == target) {
                return true;
            }
        }
        return false;
    }

    public static int[] j(int[] array, int minLength, int padding) {
        l0.k(minLength >= 0, "Invalid minLength: %s", minLength);
        l0.k(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static int k(byte[] bytes) {
        l0.m(bytes.length >= 4, "array too small: %s < %s", bytes.length, 4);
        return l(bytes[0], bytes[1], bytes[2], bytes[3]);
    }

    public static int l(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << zi.c.B) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int n(int[] array, int target) {
        return o(array, target, 0, array.length);
    }

    public static int o(int[] array, int target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int p(int[] array, int[] target) {
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

    public static String q(String separator, int... array) {
        l0.E(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 5);
        sb2.append(array[0]);
        for (int i10 = 1; i10 < array.length; i10++) {
            sb2.append(separator);
            sb2.append(array[i10]);
        }
        return sb2.toString();
    }

    public static int r(int[] array, int target) {
        return s(array, target, 0, array.length);
    }

    public static int s(int[] array, int target, int start, int end) {
        for (int i10 = end - 1; i10 >= start; i10--) {
            if (array[i10] == target) {
                return i10;
            }
        }
        return -1;
    }

    public static Comparator<int[]> t() {
        return c.INSTANCE;
    }

    @yi.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int u(int... array) {
        l0.d(array.length > 0);
        int i10 = array[0];
        for (int i11 = 1; i11 < array.length; i11++) {
            int i12 = array[i11];
            if (i12 > i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    @yi.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int v(int... array) {
        l0.d(array.length > 0);
        int i10 = array[0];
        for (int i11 = 1; i11 < array.length; i11++) {
            int i12 = array[i11];
            if (i12 < i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    public static void w(int[] array) {
        l0.E(array);
        x(array, 0, array.length);
    }

    public static void x(int[] array, int fromIndex, int toIndex) {
        l0.E(array);
        l0.f0(fromIndex, toIndex, array.length);
        for (int i10 = toIndex - 1; fromIndex < i10; i10--) {
            int i11 = array[fromIndex];
            array[fromIndex] = array[i10];
            array[i10] = i11;
            fromIndex++;
        }
    }

    public static void y(int[] array, int distance) {
        z(array, distance, 0, array.length);
    }

    public static void z(int[] array, int distance, int fromIndex, int toIndex) {
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
        x(array, fromIndex, i12);
        x(array, i12, toIndex);
        x(array, fromIndex, toIndex);
    }

    public static int m(int value) {
        return value;
    }
}
