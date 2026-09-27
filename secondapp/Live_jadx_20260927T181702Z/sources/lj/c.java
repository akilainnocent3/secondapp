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
@yi.b(emulated = true)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f104572a = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.b
    public static class a extends AbstractList<Character> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f104573e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final char[] f104574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f104575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f104576d;

        public a(char[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zq.a Object target) {
            return (target instanceof Character) && c.o(this.f104574b, ((Character) target).charValue(), this.f104575c, this.f104576d) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Character get(int index) {
            l0.C(index, size());
            return Character.valueOf(this.f104574b[this.f104575c + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character set(int index, Character element) {
            l0.C(index, size());
            char[] cArr = this.f104574b;
            int i10 = this.f104575c;
            char c10 = cArr[i10 + index];
            cArr[i10 + index] = ((Character) l0.E(element)).charValue();
            return Character.valueOf(c10);
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
                if (this.f104574b[this.f104575c + i10] != aVar.f104574b[aVar.f104575c + i10]) {
                    return false;
                }
            }
            return true;
        }

        public char[] g() {
            return Arrays.copyOfRange(this.f104574b, this.f104575c, this.f104576d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iM = 1;
            for (int i10 = this.f104575c; i10 < this.f104576d; i10++) {
                iM = (iM * 31) + c.m(this.f104574b[i10]);
            }
            return iM;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zq.a Object target) {
            int iO;
            if (!(target instanceof Character) || (iO = c.o(this.f104574b, ((Character) target).charValue(), this.f104575c, this.f104576d)) < 0) {
                return -1;
            }
            return iO - this.f104575c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zq.a Object target) {
            int iS;
            if (!(target instanceof Character) || (iS = c.s(this.f104574b, ((Character) target).charValue(), this.f104575c, this.f104576d)) < 0) {
                return -1;
            }
            return iS - this.f104575c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f104576d - this.f104575c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int fromIndex, int toIndex) {
            l0.f0(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            char[] cArr = this.f104574b;
            int i10 = this.f104575c;
            return new a(cArr, fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 3);
            sb2.append(fw.b.f85384k);
            sb2.append(this.f104574b[this.f104575c]);
            int i10 = this.f104575c;
            while (true) {
                i10++;
                if (i10 >= this.f104576d) {
                    sb2.append(fw.b.f85385l);
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f104574b[i10]);
            }
        }

        public a(char[] array, int start, int end) {
            this.f104574b = array;
            this.f104575c = start;
            this.f104576d = end;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b implements Comparator<char[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compare(char[] left, char[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Character.compare(left[i10], right[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }

    public static char A(long value) {
        if (value > 65535) {
            return kotlin.jvm.internal.s.f102777c;
        }
        if (value < 0) {
            return (char) 0;
        }
        return (char) value;
    }

    public static void B(char[] array) {
        l0.E(array);
        C(array, 0, array.length);
    }

    public static void C(char[] array, int fromIndex, int toIndex) {
        l0.E(array);
        l0.f0(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        x(array, fromIndex, toIndex);
    }

    public static char[] D(Collection<Character> collection) {
        if (collection instanceof a) {
            return ((a) collection).g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = ((Character) l0.E(array[i10])).charValue();
        }
        return cArr;
    }

    @yi.c
    public static byte[] E(char value) {
        return new byte[]{(byte) (value >> '\b'), (byte) value};
    }

    public static List<Character> c(char... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new a(backingArray);
    }

    public static int d(long result) {
        int i10 = (int) result;
        l0.p(result == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i10;
    }

    public static char e(long value) {
        char c10 = (char) value;
        l0.p(((long) c10) == value, "Out of range: %s", value);
        return c10;
    }

    @qj.m(replacement = "Character.compare(a, b)")
    public static int f(char a10, char b10) {
        return Character.compare(a10, b10);
    }

    public static char[] g(char[]... arrays) {
        long length = 0;
        for (char[] cArr : arrays) {
            length += (long) cArr.length;
        }
        char[] cArr2 = new char[d(length)];
        int length2 = 0;
        for (char[] cArr3 : arrays) {
            System.arraycopy(cArr3, 0, cArr2, length2, cArr3.length);
            length2 += cArr3.length;
        }
        return cArr2;
    }

    public static char h(char value, char min, char max) {
        l0.g(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        if (value < min) {
            return min;
        }
        return value < max ? value : max;
    }

    public static boolean i(char[] array, char target) {
        for (char c10 : array) {
            if (c10 == target) {
                return true;
            }
        }
        return false;
    }

    public static char[] j(char[] array, int minLength, int padding) {
        l0.k(minLength >= 0, "Invalid minLength: %s", minLength);
        l0.k(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    @yi.c
    public static char k(byte[] bytes) {
        l0.m(bytes.length >= 2, "array too small: %s < %s", bytes.length, 2);
        return l(bytes[0], bytes[1]);
    }

    @yi.c
    public static char l(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }

    public static int n(char[] array, char target) {
        return o(array, target, 0, array.length);
    }

    public static int o(char[] array, char target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int p(char[] array, char[] target) {
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

    public static String q(String separator, char... array) {
        l0.E(separator);
        int length = array.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder((separator.length() * (length - 1)) + length);
        sb2.append(array[0]);
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(separator);
            sb2.append(array[i10]);
        }
        return sb2.toString();
    }

    public static int r(char[] array, char target) {
        return s(array, target, 0, array.length);
    }

    public static int s(char[] array, char target, int start, int end) {
        for (int i10 = end - 1; i10 >= start; i10--) {
            if (array[i10] == target) {
                return i10;
            }
        }
        return -1;
    }

    public static Comparator<char[]> t() {
        return b.INSTANCE;
    }

    public static char u(char... array) {
        l0.d(array.length > 0);
        char c10 = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            char c11 = array[i10];
            if (c11 > c10) {
                c10 = c11;
            }
        }
        return c10;
    }

    public static char v(char... array) {
        l0.d(array.length > 0);
        char c10 = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            char c11 = array[i10];
            if (c11 < c10) {
                c10 = c11;
            }
        }
        return c10;
    }

    public static void w(char[] array) {
        l0.E(array);
        x(array, 0, array.length);
    }

    public static void x(char[] array, int fromIndex, int toIndex) {
        l0.E(array);
        l0.f0(fromIndex, toIndex, array.length);
        for (int i10 = toIndex - 1; fromIndex < i10; i10--) {
            char c10 = array[fromIndex];
            array[fromIndex] = array[i10];
            array[i10] = c10;
            fromIndex++;
        }
    }

    public static void y(char[] array, int distance) {
        z(array, distance, 0, array.length);
    }

    public static void z(char[] array, int distance, int fromIndex, int toIndex) {
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

    public static int m(char value) {
        return value;
    }
}
