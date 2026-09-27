package lj;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@f
@yi.b
@qj.j
public final class i implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f104598e = new i(new double[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double[] f104599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f104600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f104601d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends AbstractList<Double> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f104602b;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zq.a Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Double get(int index) {
            return Double.valueOf(this.f104602b.n(index));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@zq.a Object object) {
            if (object instanceof b) {
                return this.f104602b.equals(((b) object).f104602b);
            }
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (size() != list.size()) {
                return false;
            }
            int i10 = this.f104602b.f104600c;
            for (Object obj : list) {
                if (obj instanceof Double) {
                    int i11 = i10 + 1;
                    if (i.f(this.f104602b.f104599b[i10], ((Double) obj).doubleValue())) {
                        i10 = i11;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f104602b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zq.a Object target) {
            if (target instanceof Double) {
                return this.f104602b.o(((Double) target).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zq.a Object target) {
            if (target instanceof Double) {
                return this.f104602b.r(((Double) target).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f104602b.s();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int fromIndex, int toIndex) {
            return this.f104602b.C(fromIndex, toIndex).g();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f104602b.toString();
        }

        public b(i parent) {
            this.f104602b = parent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double[] f104603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f104604b = 0;

        public c(int initialCapacity) {
            this.f104603a = new double[initialCapacity];
        }

        public static int h(int oldCapacity, int minCapacity) {
            if (minCapacity < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = oldCapacity + (oldCapacity >> 1) + 1;
            if (iHighestOneBit < minCapacity) {
                iHighestOneBit = Integer.highestOneBit(minCapacity - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @qj.a
        public c a(double value) {
            g(1);
            double[] dArr = this.f104603a;
            int i10 = this.f104604b;
            dArr[i10] = value;
            this.f104604b = i10 + 1;
            return this;
        }

        @qj.a
        public c b(Iterable<Double> values) {
            if (values instanceof Collection) {
                return c((Collection) values);
            }
            Iterator<Double> it = values.iterator();
            while (it.hasNext()) {
                a(it.next().doubleValue());
            }
            return this;
        }

        @qj.a
        public c c(Collection<Double> values) {
            g(values.size());
            for (Double d10 : values) {
                double[] dArr = this.f104603a;
                int i10 = this.f104604b;
                this.f104604b = i10 + 1;
                dArr[i10] = d10.doubleValue();
            }
            return this;
        }

        @qj.a
        public c d(i values) {
            g(values.s());
            System.arraycopy(values.f104599b, values.f104600c, this.f104603a, this.f104604b, values.s());
            this.f104604b += values.s();
            return this;
        }

        @qj.a
        public c e(double[] values) {
            g(values.length);
            System.arraycopy(values, 0, this.f104603a, this.f104604b, values.length);
            this.f104604b += values.length;
            return this;
        }

        public i f() {
            if (this.f104604b == 0) {
                return i.f104598e;
            }
            return new i(this.f104603a, 0, this.f104604b);
        }

        public final void g(int numberToAdd) {
            int i10 = this.f104604b + numberToAdd;
            double[] dArr = this.f104603a;
            if (i10 > dArr.length) {
                this.f104603a = Arrays.copyOf(dArr, h(dArr.length, i10));
            }
        }
    }

    public static i A(double first, double... rest) {
        l0.e(rest.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr = new double[rest.length + 1];
        dArr[0] = first;
        System.arraycopy(rest, 0, dArr, 1, rest.length);
        return new i(dArr);
    }

    public static boolean f(double a10, double b10) {
        return Double.doubleToLongBits(a10) == Double.doubleToLongBits(b10);
    }

    public static c h() {
        return new c(10);
    }

    public static c i(int initialCapacity) {
        l0.k(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new c(initialCapacity);
    }

    public static i k(Iterable<Double> values) {
        return values instanceof Collection ? l((Collection) values) : h().b(values).f();
    }

    public static i l(Collection<Double> values) {
        return values.isEmpty() ? f104598e : new i(d.C(values));
    }

    public static i m(double[] values) {
        return values.length == 0 ? f104598e : new i(Arrays.copyOf(values, values.length));
    }

    public static i t() {
        return f104598e;
    }

    public static i u(double e10) {
        return new i(new double[]{e10});
    }

    public static i v(double e10, double e11) {
        return new i(new double[]{e10, e11});
    }

    public static i w(double e10, double e11, double e12) {
        return new i(new double[]{e10, e11, e12});
    }

    public static i x(double e10, double e11, double e12, double e13) {
        return new i(new double[]{e10, e11, e12, e13});
    }

    public static i y(double e10, double e11, double e12, double e13, double e14) {
        return new i(new double[]{e10, e11, e12, e13, e14});
    }

    public static i z(double e10, double e11, double e12, double e13, double e14, double e15) {
        return new i(new double[]{e10, e11, e12, e13, e14, e15});
    }

    public Object B() {
        return p() ? f104598e : this;
    }

    public i C(int startIndex, int endIndex) {
        l0.f0(startIndex, endIndex, s());
        if (startIndex == endIndex) {
            return f104598e;
        }
        double[] dArr = this.f104599b;
        int i10 = this.f104600c;
        return new i(dArr, startIndex + i10, i10 + endIndex);
    }

    public double[] D() {
        return Arrays.copyOfRange(this.f104599b, this.f104600c, this.f104601d);
    }

    public i E() {
        return q() ? new i(D()) : this;
    }

    public Object G() {
        return E();
    }

    public boolean equals(@zq.a Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof i)) {
            return false;
        }
        i iVar = (i) object;
        if (s() != iVar.s()) {
            return false;
        }
        for (int i10 = 0; i10 < s(); i10++) {
            if (!f(n(i10), iVar.n(i10))) {
                return false;
            }
        }
        return true;
    }

    public List<Double> g() {
        return new b();
    }

    public int hashCode() {
        int iK = 1;
        for (int i10 = this.f104600c; i10 < this.f104601d; i10++) {
            iK = (iK * 31) + d.k(this.f104599b[i10]);
        }
        return iK;
    }

    public boolean j(double target) {
        return o(target) >= 0;
    }

    public double n(int index) {
        l0.C(index, s());
        return this.f104599b[this.f104600c + index];
    }

    public int o(double target) {
        for (int i10 = this.f104600c; i10 < this.f104601d; i10++) {
            if (f(this.f104599b[i10], target)) {
                return i10 - this.f104600c;
            }
        }
        return -1;
    }

    public boolean p() {
        return this.f104601d == this.f104600c;
    }

    public final boolean q() {
        return this.f104600c > 0 || this.f104601d < this.f104599b.length;
    }

    public int r(double target) {
        int i10 = this.f104601d;
        do {
            i10--;
            if (i10 < this.f104600c) {
                return -1;
            }
        } while (!f(this.f104599b[i10], target));
        return i10 - this.f104600c;
    }

    public int s() {
        return this.f104601d - this.f104600c;
    }

    public String toString() {
        if (p()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(s() * 5);
        sb2.append(fw.b.f85384k);
        sb2.append(this.f104599b[this.f104600c]);
        int i10 = this.f104600c;
        while (true) {
            i10++;
            if (i10 >= this.f104601d) {
                sb2.append(fw.b.f85385l);
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f104599b[i10]);
        }
    }

    public i(double[] array) {
        this(array, 0, array.length);
    }

    public i(double[] array, int start, int end) {
        this.f104599b = array;
        this.f104600c = start;
        this.f104601d = end;
    }
}
