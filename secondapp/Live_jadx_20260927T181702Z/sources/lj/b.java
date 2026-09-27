package lj;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@f
@yi.b
public final class b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.b
    public static class a extends AbstractList<Byte> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f104568e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f104569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f104570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f104571d;

        public a(byte[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zq.a Object target) {
            return (target instanceof Byte) && b.j(this.f104569b, ((Byte) target).byteValue(), this.f104570c, this.f104571d) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Byte get(int index) {
            l0.C(index, size());
            return Byte.valueOf(this.f104569b[this.f104570c + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Byte set(int index, Byte element) {
            l0.C(index, size());
            byte[] bArr = this.f104569b;
            int i10 = this.f104570c;
            byte b10 = bArr[i10 + index];
            bArr[i10 + index] = ((Byte) l0.E(element)).byteValue();
            return Byte.valueOf(b10);
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
                if (this.f104569b[this.f104570c + i10] != aVar.f104569b[aVar.f104570c + i10]) {
                    return false;
                }
            }
            return true;
        }

        public byte[] g() {
            return Arrays.copyOfRange(this.f104569b, this.f104570c, this.f104571d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iH = 1;
            for (int i10 = this.f104570c; i10 < this.f104571d; i10++) {
                iH = (iH * 31) + b.h(this.f104569b[i10]);
            }
            return iH;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zq.a Object target) {
            int iJ;
            if (!(target instanceof Byte) || (iJ = b.j(this.f104569b, ((Byte) target).byteValue(), this.f104570c, this.f104571d)) < 0) {
                return -1;
            }
            return iJ - this.f104570c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zq.a Object target) {
            int iM;
            if (!(target instanceof Byte) || (iM = b.m(this.f104569b, ((Byte) target).byteValue(), this.f104570c, this.f104571d)) < 0) {
                return -1;
            }
            return iM - this.f104570c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f104571d - this.f104570c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int fromIndex, int toIndex) {
            l0.f0(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            byte[] bArr = this.f104569b;
            int i10 = this.f104570c;
            return new a(bArr, fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append(fw.b.f85384k);
            sb2.append((int) this.f104569b[this.f104570c]);
            int i10 = this.f104570c;
            while (true) {
                i10++;
                if (i10 >= this.f104571d) {
                    sb2.append(fw.b.f85385l);
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append((int) this.f104569b[i10]);
            }
        }

        public a(byte[] array, int start, int end) {
            this.f104569b = array;
            this.f104570c = start;
            this.f104571d = end;
        }
    }

    public static List<Byte> c(byte... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new a(backingArray);
    }

    public static int d(long result) {
        int i10 = (int) result;
        l0.p(result == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i10;
    }

    public static byte[] e(byte[]... arrays) {
        long length = 0;
        for (byte[] bArr : arrays) {
            length += (long) bArr.length;
        }
        byte[] bArr2 = new byte[d(length)];
        int length2 = 0;
        for (byte[] bArr3 : arrays) {
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        return bArr2;
    }

    public static boolean f(byte[] array, byte target) {
        for (byte b10 : array) {
            if (b10 == target) {
                return true;
            }
        }
        return false;
    }

    public static byte[] g(byte[] array, int minLength, int padding) {
        l0.k(minLength >= 0, "Invalid minLength: %s", minLength);
        l0.k(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static int i(byte[] array, byte target) {
        return j(array, target, 0, array.length);
    }

    public static int j(byte[] array, byte target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int k(byte[] array, byte[] target) {
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

    public static int l(byte[] array, byte target) {
        return m(array, target, 0, array.length);
    }

    public static int m(byte[] array, byte target, int start, int end) {
        for (int i10 = end - 1; i10 >= start; i10--) {
            if (array[i10] == target) {
                return i10;
            }
        }
        return -1;
    }

    public static void n(byte[] array) {
        l0.E(array);
        o(array, 0, array.length);
    }

    public static void o(byte[] array, int fromIndex, int toIndex) {
        l0.E(array);
        l0.f0(fromIndex, toIndex, array.length);
        for (int i10 = toIndex - 1; fromIndex < i10; i10--) {
            byte b10 = array[fromIndex];
            array[fromIndex] = array[i10];
            array[i10] = b10;
            fromIndex++;
        }
    }

    public static void p(byte[] array, int distance) {
        q(array, distance, 0, array.length);
    }

    public static void q(byte[] array, int distance, int fromIndex, int toIndex) {
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
        o(array, fromIndex, i12);
        o(array, i12, toIndex);
        o(array, fromIndex, toIndex);
    }

    public static byte[] r(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = ((Number) l0.E(array[i10])).byteValue();
        }
        return bArr;
    }

    public static int h(byte value) {
        return value;
    }
}
