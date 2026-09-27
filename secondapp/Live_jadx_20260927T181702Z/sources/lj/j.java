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
public final class j implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f104605e = new j(new int[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f104606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f104607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f104608d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f104609b;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zq.a Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Integer get(int index) {
            return Integer.valueOf(this.f104609b.n(index));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@zq.a Object object) {
            if (object instanceof b) {
                return this.f104609b.equals(((b) object).f104609b);
            }
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (size() != list.size()) {
                return false;
            }
            int i10 = this.f104609b.f104607c;
            for (Object obj : list) {
                if (obj instanceof Integer) {
                    int i11 = i10 + 1;
                    if (this.f104609b.f104606b[i10] == ((Integer) obj).intValue()) {
                        i10 = i11;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f104609b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zq.a Object target) {
            if (target instanceof Integer) {
                return this.f104609b.o(((Integer) target).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zq.a Object target) {
            if (target instanceof Integer) {
                return this.f104609b.r(((Integer) target).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f104609b.s();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int fromIndex, int toIndex) {
            return this.f104609b.C(fromIndex, toIndex).g();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f104609b.toString();
        }

        public b(j parent) {
            this.f104609b = parent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f104610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f104611b = 0;

        public c(int initialCapacity) {
            this.f104610a = new int[initialCapacity];
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
        public c a(int value) {
            g(1);
            int[] iArr = this.f104610a;
            int i10 = this.f104611b;
            iArr[i10] = value;
            this.f104611b = i10 + 1;
            return this;
        }

        @qj.a
        public c b(Iterable<Integer> values) {
            if (values instanceof Collection) {
                return c((Collection) values);
            }
            Iterator<Integer> it = values.iterator();
            while (it.hasNext()) {
                a(it.next().intValue());
            }
            return this;
        }

        @qj.a
        public c c(Collection<Integer> values) {
            g(values.size());
            for (Integer num : values) {
                int[] iArr = this.f104610a;
                int i10 = this.f104611b;
                this.f104611b = i10 + 1;
                iArr[i10] = num.intValue();
            }
            return this;
        }

        @qj.a
        public c d(j values) {
            g(values.s());
            System.arraycopy(values.f104606b, values.f104607c, this.f104610a, this.f104611b, values.s());
            this.f104611b += values.s();
            return this;
        }

        @qj.a
        public c e(int[] values) {
            g(values.length);
            System.arraycopy(values, 0, this.f104610a, this.f104611b, values.length);
            this.f104611b += values.length;
            return this;
        }

        public j f() {
            if (this.f104611b == 0) {
                return j.f104605e;
            }
            return new j(this.f104610a, 0, this.f104611b);
        }

        public final void g(int numberToAdd) {
            int i10 = this.f104611b + numberToAdd;
            int[] iArr = this.f104610a;
            if (i10 > iArr.length) {
                this.f104610a = Arrays.copyOf(iArr, h(iArr.length, i10));
            }
        }
    }

    public static j A(int first, int... rest) {
        l0.e(rest.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr = new int[rest.length + 1];
        iArr[0] = first;
        System.arraycopy(rest, 0, iArr, 1, rest.length);
        return new j(iArr);
    }

    public static c h() {
        return new c(10);
    }

    public static c i(int initialCapacity) {
        l0.k(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new c(initialCapacity);
    }

    public static j k(Iterable<Integer> values) {
        return values instanceof Collection ? l((Collection) values) : h().b(values).f();
    }

    public static j l(Collection<Integer> values) {
        return values.isEmpty() ? f104605e : new j(l.E(values));
    }

    public static j m(int[] values) {
        return values.length == 0 ? f104605e : new j(Arrays.copyOf(values, values.length));
    }

    public static j t() {
        return f104605e;
    }

    public static j u(int e10) {
        return new j(new int[]{e10});
    }

    public static j v(int e10, int e11) {
        return new j(new int[]{e10, e11});
    }

    public static j w(int e10, int e11, int e12) {
        return new j(new int[]{e10, e11, e12});
    }

    public static j x(int e10, int e11, int e12, int e13) {
        return new j(new int[]{e10, e11, e12, e13});
    }

    public static j y(int e10, int e11, int e12, int e13, int e14) {
        return new j(new int[]{e10, e11, e12, e13, e14});
    }

    public static j z(int e10, int e11, int e12, int e13, int e14, int e15) {
        return new j(new int[]{e10, e11, e12, e13, e14, e15});
    }

    public Object B() {
        return p() ? f104605e : this;
    }

    public j C(int startIndex, int endIndex) {
        l0.f0(startIndex, endIndex, s());
        if (startIndex == endIndex) {
            return f104605e;
        }
        int[] iArr = this.f104606b;
        int i10 = this.f104607c;
        return new j(iArr, startIndex + i10, i10 + endIndex);
    }

    public int[] D() {
        return Arrays.copyOfRange(this.f104606b, this.f104607c, this.f104608d);
    }

    public j E() {
        return q() ? new j(D()) : this;
    }

    public Object G() {
        return E();
    }

    public boolean equals(@zq.a Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof j)) {
            return false;
        }
        j jVar = (j) object;
        if (s() != jVar.s()) {
            return false;
        }
        for (int i10 = 0; i10 < s(); i10++) {
            if (n(i10) != jVar.n(i10)) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> g() {
        return new b();
    }

    public int hashCode() {
        int iM = 1;
        for (int i10 = this.f104607c; i10 < this.f104608d; i10++) {
            iM = (iM * 31) + l.m(this.f104606b[i10]);
        }
        return iM;
    }

    public boolean j(int target) {
        return o(target) >= 0;
    }

    public int n(int index) {
        l0.C(index, s());
        return this.f104606b[this.f104607c + index];
    }

    public int o(int target) {
        for (int i10 = this.f104607c; i10 < this.f104608d; i10++) {
            if (this.f104606b[i10] == target) {
                return i10 - this.f104607c;
            }
        }
        return -1;
    }

    public boolean p() {
        return this.f104608d == this.f104607c;
    }

    public final boolean q() {
        return this.f104607c > 0 || this.f104608d < this.f104606b.length;
    }

    public int r(int target) {
        int i10;
        int i11 = this.f104608d;
        do {
            i11--;
            i10 = this.f104607c;
            if (i11 < i10) {
                return -1;
            }
        } while (this.f104606b[i11] != target);
        return i11 - i10;
    }

    public int s() {
        return this.f104608d - this.f104607c;
    }

    public String toString() {
        if (p()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(s() * 5);
        sb2.append(fw.b.f85384k);
        sb2.append(this.f104606b[this.f104607c]);
        int i10 = this.f104607c;
        while (true) {
            i10++;
            if (i10 >= this.f104608d) {
                sb2.append(fw.b.f85385l);
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f104606b[i10]);
        }
    }

    public j(int[] array) {
        this(array, 0, array.length);
    }

    public j(int[] array, int start, int end) {
        this.f104606b = array;
        this.f104607c = start;
        this.f104608d = end;
    }
}
