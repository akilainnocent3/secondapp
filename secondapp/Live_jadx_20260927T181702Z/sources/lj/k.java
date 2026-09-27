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
public final class k implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f104612e = new k(new long[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f104613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f104614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f104615d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends AbstractList<Long> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f104616b;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zq.a Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Long get(int index) {
            return Long.valueOf(this.f104616b.n(index));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@zq.a Object object) {
            if (object instanceof b) {
                return this.f104616b.equals(((b) object).f104616b);
            }
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (size() != list.size()) {
                return false;
            }
            int i10 = this.f104616b.f104614c;
            for (Object obj : list) {
                if (obj instanceof Long) {
                    int i11 = i10 + 1;
                    if (this.f104616b.f104613b[i10] == ((Long) obj).longValue()) {
                        i10 = i11;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f104616b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zq.a Object target) {
            if (target instanceof Long) {
                return this.f104616b.o(((Long) target).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zq.a Object target) {
            if (target instanceof Long) {
                return this.f104616b.r(((Long) target).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f104616b.s();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int fromIndex, int toIndex) {
            return this.f104616b.C(fromIndex, toIndex).g();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f104616b.toString();
        }

        public b(k parent) {
            this.f104616b = parent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long[] f104617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f104618b = 0;

        public c(int initialCapacity) {
            this.f104617a = new long[initialCapacity];
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
        public c a(long value) {
            g(1);
            long[] jArr = this.f104617a;
            int i10 = this.f104618b;
            jArr[i10] = value;
            this.f104618b = i10 + 1;
            return this;
        }

        @qj.a
        public c b(Iterable<Long> values) {
            if (values instanceof Collection) {
                return c((Collection) values);
            }
            Iterator<Long> it = values.iterator();
            while (it.hasNext()) {
                a(it.next().longValue());
            }
            return this;
        }

        @qj.a
        public c c(Collection<Long> values) {
            g(values.size());
            for (Long l10 : values) {
                long[] jArr = this.f104617a;
                int i10 = this.f104618b;
                this.f104618b = i10 + 1;
                jArr[i10] = l10.longValue();
            }
            return this;
        }

        @qj.a
        public c d(k values) {
            g(values.s());
            System.arraycopy(values.f104613b, values.f104614c, this.f104617a, this.f104618b, values.s());
            this.f104618b += values.s();
            return this;
        }

        @qj.a
        public c e(long[] values) {
            g(values.length);
            System.arraycopy(values, 0, this.f104617a, this.f104618b, values.length);
            this.f104618b += values.length;
            return this;
        }

        public k f() {
            if (this.f104618b == 0) {
                return k.f104612e;
            }
            return new k(this.f104617a, 0, this.f104618b);
        }

        public final void g(int numberToAdd) {
            int i10 = this.f104618b + numberToAdd;
            long[] jArr = this.f104617a;
            if (i10 > jArr.length) {
                this.f104617a = Arrays.copyOf(jArr, h(jArr.length, i10));
            }
        }
    }

    public static k A(long first, long... rest) {
        l0.e(rest.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr = new long[rest.length + 1];
        jArr[0] = first;
        System.arraycopy(rest, 0, jArr, 1, rest.length);
        return new k(jArr);
    }

    public static c h() {
        return new c(10);
    }

    public static c i(int initialCapacity) {
        l0.k(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new c(initialCapacity);
    }

    public static k k(Iterable<Long> values) {
        return values instanceof Collection ? l((Collection) values) : h().b(values).f();
    }

    public static k l(Collection<Long> values) {
        return values.isEmpty() ? f104612e : new k(n.C(values));
    }

    public static k m(long[] values) {
        return values.length == 0 ? f104612e : new k(Arrays.copyOf(values, values.length));
    }

    public static k t() {
        return f104612e;
    }

    public static k u(long e10) {
        return new k(new long[]{e10});
    }

    public static k v(long e10, long e11) {
        return new k(new long[]{e10, e11});
    }

    public static k w(long e10, long e11, long e12) {
        return new k(new long[]{e10, e11, e12});
    }

    public static k x(long e10, long e11, long e12, long e13) {
        return new k(new long[]{e10, e11, e12, e13});
    }

    public static k y(long e10, long e11, long e12, long e13, long e14) {
        return new k(new long[]{e10, e11, e12, e13, e14});
    }

    public static k z(long e10, long e11, long e12, long e13, long e14, long e15) {
        return new k(new long[]{e10, e11, e12, e13, e14, e15});
    }

    public Object B() {
        return p() ? f104612e : this;
    }

    public k C(int startIndex, int endIndex) {
        l0.f0(startIndex, endIndex, s());
        if (startIndex == endIndex) {
            return f104612e;
        }
        long[] jArr = this.f104613b;
        int i10 = this.f104614c;
        return new k(jArr, startIndex + i10, i10 + endIndex);
    }

    public long[] D() {
        return Arrays.copyOfRange(this.f104613b, this.f104614c, this.f104615d);
    }

    public k E() {
        return q() ? new k(D()) : this;
    }

    public Object G() {
        return E();
    }

    public boolean equals(@zq.a Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof k)) {
            return false;
        }
        k kVar = (k) object;
        if (s() != kVar.s()) {
            return false;
        }
        for (int i10 = 0; i10 < s(); i10++) {
            if (n(i10) != kVar.n(i10)) {
                return false;
            }
        }
        return true;
    }

    public List<Long> g() {
        return new b();
    }

    public int hashCode() {
        int iL = 1;
        for (int i10 = this.f104614c; i10 < this.f104615d; i10++) {
            iL = (iL * 31) + n.l(this.f104613b[i10]);
        }
        return iL;
    }

    public boolean j(long target) {
        return o(target) >= 0;
    }

    public long n(int index) {
        l0.C(index, s());
        return this.f104613b[this.f104614c + index];
    }

    public int o(long target) {
        for (int i10 = this.f104614c; i10 < this.f104615d; i10++) {
            if (this.f104613b[i10] == target) {
                return i10 - this.f104614c;
            }
        }
        return -1;
    }

    public boolean p() {
        return this.f104615d == this.f104614c;
    }

    public final boolean q() {
        return this.f104614c > 0 || this.f104615d < this.f104613b.length;
    }

    public int r(long target) {
        int i10;
        int i11 = this.f104615d;
        do {
            i11--;
            i10 = this.f104614c;
            if (i11 < i10) {
                return -1;
            }
        } while (this.f104613b[i11] != target);
        return i11 - i10;
    }

    public int s() {
        return this.f104615d - this.f104614c;
    }

    public String toString() {
        if (p()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(s() * 5);
        sb2.append(fw.b.f85384k);
        sb2.append(this.f104613b[this.f104614c]);
        int i10 = this.f104614c;
        while (true) {
            i10++;
            if (i10 >= this.f104615d) {
                sb2.append(fw.b.f85385l);
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f104613b[i10]);
        }
    }

    public k(long[] array) {
        this(array, 0, array.length);
    }

    public k(long[] array, int start, int end) {
        this.f104613b = array;
        this.f104614c = start;
        this.f104615d = end;
    }
}
