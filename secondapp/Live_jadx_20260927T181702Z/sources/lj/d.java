package lj;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;
import zi.l0;
import zi.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@f
@yi.b(emulated = true)
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f104579a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @yi.c
    public static final Pattern f104580b = j();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.b
    public static class a extends AbstractList<Double> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f104581e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double[] f104582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f104583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f104584d;

        public a(double[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zq.a Object target) {
            return (target instanceof Double) && d.m(this.f104582b, ((Double) target).doubleValue(), this.f104583c, this.f104584d) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Double get(int index) {
            l0.C(index, size());
            return Double.valueOf(this.f104582b[this.f104583c + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double set(int index, Double element) {
            l0.C(index, size());
            double[] dArr = this.f104582b;
            int i10 = this.f104583c;
            double d10 = dArr[i10 + index];
            dArr[i10 + index] = ((Double) l0.E(element)).doubleValue();
            return Double.valueOf(d10);
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
                if (this.f104582b[this.f104583c + i10] != aVar.f104582b[aVar.f104583c + i10]) {
                    return false;
                }
            }
            return true;
        }

        public double[] g() {
            return Arrays.copyOfRange(this.f104582b, this.f104583c, this.f104584d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iK = 1;
            for (int i10 = this.f104583c; i10 < this.f104584d; i10++) {
                iK = (iK * 31) + d.k(this.f104582b[i10]);
            }
            return iK;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zq.a Object target) {
            int iM;
            if (!(target instanceof Double) || (iM = d.m(this.f104582b, ((Double) target).doubleValue(), this.f104583c, this.f104584d)) < 0) {
                return -1;
            }
            return iM - this.f104583c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zq.a Object target) {
            int iR;
            if (!(target instanceof Double) || (iR = d.r(this.f104582b, ((Double) target).doubleValue(), this.f104583c, this.f104584d)) < 0) {
                return -1;
            }
            return iR - this.f104583c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f104584d - this.f104583c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int fromIndex, int toIndex) {
            l0.f0(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            double[] dArr = this.f104582b;
            int i10 = this.f104583c;
            return new a(dArr, fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 12);
            sb2.append(fw.b.f85384k);
            sb2.append(this.f104582b[this.f104583c]);
            int i10 = this.f104583c;
            while (true) {
                i10++;
                if (i10 >= this.f104584d) {
                    sb2.append(fw.b.f85385l);
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f104582b[i10]);
            }
        }

        public a(double[] array, int start, int end) {
            this.f104582b = array;
            this.f104583c = start;
            this.f104584d = end;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends zi.i<String, Double> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zi.i<String, Double> f104585d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f104586e = 1;

        private Object q() {
            return f104585d;
        }

        @Override // zi.i
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String h(Double value) {
            return value.toString();
        }

        @Override // zi.i
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Double i(String value) {
            return Double.valueOf(value);
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c implements Comparator<double[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compare(double[] left, double[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Double.compare(left[i10], right[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    public static void A(double[] array, int fromIndex, int toIndex) {
        l0.E(array);
        l0.f0(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        w(array, fromIndex, toIndex);
    }

    public static zi.i<String, Double> B() {
        return b.f104585d;
    }

    public static double[] C(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = ((Number) l0.E(array[i10])).doubleValue();
        }
        return dArr;
    }

    @zq.a
    @yi.c
    public static Double D(String string) {
        if (!f104580b.matcher(string).matches()) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(string));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static List<Double> c(double... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new a(backingArray);
    }

    public static int d(long result) {
        int i10 = (int) result;
        l0.p(result == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i10;
    }

    @qj.m(replacement = "Double.compare(a, b)")
    public static int e(double a10, double b10) {
        return Double.compare(a10, b10);
    }

    public static double[] f(double[]... arrays) {
        long length = 0;
        for (double[] dArr : arrays) {
            length += (long) dArr.length;
        }
        double[] dArr2 = new double[d(length)];
        int length2 = 0;
        for (double[] dArr3 : arrays) {
            System.arraycopy(dArr3, 0, dArr2, length2, dArr3.length);
            length2 += dArr3.length;
        }
        return dArr2;
    }

    public static double g(double value, double min, double max) {
        if (min <= max) {
            return Math.min(Math.max(value, min), max);
        }
        throw new IllegalArgumentException(t0.e("min (%s) must be less than or equal to max (%s)", Double.valueOf(min), Double.valueOf(max)));
    }

    public static boolean h(double[] array, double target) {
        for (double d10 : array) {
            if (d10 == target) {
                return true;
            }
        }
        return false;
    }

    public static double[] i(double[] array, int minLength, int padding) {
        l0.k(minLength >= 0, "Invalid minLength: %s", minLength);
        l0.k(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    @yi.c
    public static Pattern j() {
        return Pattern.compile(("[+-]?(?:NaN|Infinity|" + ("(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?") + il.b.f94863g + ("0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?") + gi.j.f86771d).replace("#", com.google.android.material.badge.a.f50153v));
    }

    public static int k(double value) {
        return Double.valueOf(value).hashCode();
    }

    public static int l(double[] array, double target) {
        return m(array, target, 0, array.length);
    }

    public static int m(double[] array, double target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int n(double[] array, double[] target) {
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

    public static boolean o(double value) {
        return Double.NEGATIVE_INFINITY < value && value < Double.POSITIVE_INFINITY;
    }

    public static String p(String separator, double... array) {
        l0.E(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 12);
        sb2.append(array[0]);
        for (int i10 = 1; i10 < array.length; i10++) {
            sb2.append(separator);
            sb2.append(array[i10]);
        }
        return sb2.toString();
    }

    public static int q(double[] array, double target) {
        return r(array, target, 0, array.length);
    }

    public static int r(double[] array, double target, int start, int end) {
        for (int i10 = end - 1; i10 >= start; i10--) {
            if (array[i10] == target) {
                return i10;
            }
        }
        return -1;
    }

    public static Comparator<double[]> s() {
        return c.INSTANCE;
    }

    @yi.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double t(double... array) {
        l0.d(array.length > 0);
        double dMax = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            dMax = Math.max(dMax, array[i10]);
        }
        return dMax;
    }

    @yi.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double u(double... array) {
        l0.d(array.length > 0);
        double dMin = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            dMin = Math.min(dMin, array[i10]);
        }
        return dMin;
    }

    public static void v(double[] array) {
        l0.E(array);
        w(array, 0, array.length);
    }

    public static void w(double[] array, int fromIndex, int toIndex) {
        l0.E(array);
        l0.f0(fromIndex, toIndex, array.length);
        for (int i10 = toIndex - 1; fromIndex < i10; i10--) {
            double d10 = array[fromIndex];
            array[fromIndex] = array[i10];
            array[i10] = d10;
            fromIndex++;
        }
    }

    public static void x(double[] array, int distance) {
        y(array, distance, 0, array.length);
    }

    public static void y(double[] array, int distance, int fromIndex, int toIndex) {
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
        w(array, fromIndex, i12);
        w(array, i12, toIndex);
        w(array, fromIndex, toIndex);
    }

    public static void z(double[] array) {
        l0.E(array);
        A(array, 0, array.length);
    }
}
