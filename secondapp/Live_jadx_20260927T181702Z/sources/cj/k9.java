package cj;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(emulated = true, serializable = true)
@j4
public class k9<K> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f24051i = 1073741824;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f24052j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f24053k = 4294967295L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f24054l = -4294967296L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f24055m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f24056n = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object[] f24057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f24058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f24059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f24060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int[] f24061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @yi.e
    public transient long[] f24062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient float f24063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int f24064h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends d9.f<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n9
        public final K f24065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24066c;

        public a(int i10) {
            this.f24065b = (K) k9.this.f24057a[i10];
            this.f24066c = i10;
        }

        @qj.a
        public int a(int count) {
            d();
            int i10 = this.f24066c;
            if (i10 == -1) {
                k9.this.v(this.f24065b, count);
                return 0;
            }
            int[] iArr = k9.this.f24058b;
            int i11 = iArr[i10];
            iArr[i10] = count;
            return i11;
        }

        public void d() {
            int i10 = this.f24066c;
            if (i10 == -1 || i10 >= k9.this.D() || !zi.f0.a(this.f24065b, k9.this.f24057a[this.f24066c])) {
                this.f24066c = k9.this.n(this.f24065b);
            }
        }

        @Override // cj.c9.a
        public int getCount() {
            d();
            int i10 = this.f24066c;
            if (i10 == -1) {
                return 0;
            }
            return k9.this.f24058b[i10];
        }

        @Override // cj.c9.a
        @n9
        public K k() {
            return this.f24065b;
        }
    }

    public k9() {
        o(3, 1.0f);
    }

    public static long E(long entry, int newNext) {
        return (entry & f24054l) | (4294967295L & ((long) newNext));
    }

    public static <K> k9<K> c() {
        return new k9<>();
    }

    public static <K> k9<K> d(int expectedSize) {
        return new k9<>(expectedSize);
    }

    public static int i(long entry) {
        return (int) (entry >>> 32);
    }

    public static int k(long entry) {
        return (int) entry;
    }

    public static long[] r(int size) {
        long[] jArr = new long[size];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    public static int[] s(int size) {
        int[] iArr = new int[size];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final void A(int newSize) {
        int length = this.f24062f.length;
        if (newSize > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                z(iMax);
            }
        }
    }

    public final void B(int newCapacity) {
        if (this.f24061e.length >= 1073741824) {
            this.f24064h = Integer.MAX_VALUE;
            return;
        }
        int i10 = ((int) (newCapacity * this.f24063g)) + 1;
        int[] iArrS = s(newCapacity);
        long[] jArr = this.f24062f;
        int length = iArrS.length - 1;
        for (int i11 = 0; i11 < this.f24059c; i11++) {
            int i12 = i(jArr[i11]);
            int i13 = i12 & length;
            int i14 = iArrS[i13];
            iArrS[i13] = i11;
            jArr[i11] = (((long) i12) << 32) | (4294967295L & ((long) i14));
        }
        this.f24064h = i10;
        this.f24061e = iArrS;
    }

    public void C(int index, int newValue) {
        zi.l0.C(index, this.f24059c);
        this.f24058b[index] = newValue;
    }

    public int D() {
        return this.f24059c;
    }

    public void a() {
        this.f24060d++;
        Arrays.fill(this.f24057a, 0, this.f24059c, (Object) null);
        Arrays.fill(this.f24058b, 0, this.f24059c, 0);
        Arrays.fill(this.f24061e, -1);
        Arrays.fill(this.f24062f, -1L);
        this.f24059c = 0;
    }

    public boolean b(@zq.a Object key) {
        return n(key) != -1;
    }

    public void e(int minCapacity) {
        if (minCapacity > this.f24062f.length) {
            z(minCapacity);
        }
        if (minCapacity >= this.f24064h) {
            B(Math.max(2, Integer.highestOneBit(minCapacity - 1) << 1));
        }
    }

    public int f() {
        return this.f24059c == 0 ? -1 : 0;
    }

    public int g(@zq.a Object key) {
        int iN = n(key);
        if (iN == -1) {
            return 0;
        }
        return this.f24058b[iN];
    }

    public c9.a<K> h(int index) {
        zi.l0.C(index, this.f24059c);
        return new a(index);
    }

    @n9
    public K j(int i10) {
        zi.l0.C(i10, this.f24059c);
        return (K) this.f24057a[i10];
    }

    public int l(int index) {
        zi.l0.C(index, this.f24059c);
        return this.f24058b[index];
    }

    public final int m() {
        return this.f24061e.length - 1;
    }

    public int n(@zq.a Object key) {
        int iD = m6.d(key);
        int iK = this.f24061e[m() & iD];
        while (iK != -1) {
            long j10 = this.f24062f[iK];
            if (i(j10) == iD && zi.f0.a(key, this.f24057a[iK])) {
                return iK;
            }
            iK = k(j10);
        }
        return -1;
    }

    public void o(int expectedSize, float loadFactor) {
        zi.l0.e(expectedSize >= 0, "Initial capacity must be non-negative");
        zi.l0.e(loadFactor > 0.0f, "Illegal load factor");
        int iA = m6.a(expectedSize, loadFactor);
        this.f24061e = s(iA);
        this.f24063g = loadFactor;
        this.f24057a = new Object[expectedSize];
        this.f24058b = new int[expectedSize];
        this.f24062f = r(expectedSize);
        this.f24064h = Math.max(1, (int) (iA * loadFactor));
    }

    public void p(int entryIndex, @n9 K key, int value, int hash) {
        this.f24062f[entryIndex] = (((long) hash) << 32) | 4294967295L;
        this.f24057a[entryIndex] = key;
        this.f24058b[entryIndex] = value;
    }

    public void q(int dstIndex) {
        int iD = D() - 1;
        if (dstIndex >= iD) {
            this.f24057a[dstIndex] = null;
            this.f24058b[dstIndex] = 0;
            this.f24062f[dstIndex] = -1;
            return;
        }
        Object[] objArr = this.f24057a;
        objArr[dstIndex] = objArr[iD];
        int[] iArr = this.f24058b;
        iArr[dstIndex] = iArr[iD];
        objArr[iD] = null;
        iArr[iD] = 0;
        long[] jArr = this.f24062f;
        long j10 = jArr[iD];
        jArr[dstIndex] = j10;
        jArr[iD] = -1;
        int i10 = i(j10) & m();
        int[] iArr2 = this.f24061e;
        int i11 = iArr2[i10];
        if (i11 == iD) {
            iArr2[i10] = dstIndex;
            return;
        }
        while (true) {
            long j11 = this.f24062f[i11];
            int iK = k(j11);
            if (iK == iD) {
                this.f24062f[i11] = E(j11, dstIndex);
                return;
            }
            i11 = iK;
        }
    }

    public int t(int index) {
        int i10 = index + 1;
        if (i10 < this.f24059c) {
            return i10;
        }
        return -1;
    }

    public int u(int oldNextIndex, int removedIndex) {
        return oldNextIndex - 1;
    }

    @qj.a
    public int v(@n9 K key, int value) {
        j3.d(value, "count");
        long[] jArr = this.f24062f;
        Object[] objArr = this.f24057a;
        int[] iArr = this.f24058b;
        int iD = m6.d(key);
        int iM = m() & iD;
        int i10 = this.f24059c;
        int[] iArr2 = this.f24061e;
        int i11 = iArr2[iM];
        if (i11 == -1) {
            iArr2[iM] = i10;
        } else {
            while (true) {
                long j10 = jArr[i11];
                if (i(j10) == iD && zi.f0.a(key, objArr[i11])) {
                    int i12 = iArr[i11];
                    iArr[i11] = value;
                    return i12;
                }
                int iK = k(j10);
                if (iK == -1) {
                    jArr[i11] = E(j10, i10);
                    break;
                }
                i11 = iK;
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i13 = i10 + 1;
        A(i13);
        p(i10, key, value, iD);
        this.f24059c = i13;
        if (i10 >= this.f24064h) {
            B(this.f24061e.length * 2);
        }
        this.f24060d++;
        return 0;
    }

    @qj.a
    public int w(@zq.a Object key) {
        return x(key, m6.d(key));
    }

    public final int x(@zq.a Object key, int hash) {
        int iM = m() & hash;
        int i10 = this.f24061e[iM];
        if (i10 == -1) {
            return 0;
        }
        int i11 = -1;
        while (true) {
            if (i(this.f24062f[i10]) == hash && zi.f0.a(key, this.f24057a[i10])) {
                int i12 = this.f24058b[i10];
                if (i11 == -1) {
                    this.f24061e[iM] = k(this.f24062f[i10]);
                } else {
                    long[] jArr = this.f24062f;
                    jArr[i11] = E(jArr[i11], k(jArr[i10]));
                }
                q(i10);
                this.f24059c--;
                this.f24060d++;
                return i12;
            }
            int iK = k(this.f24062f[i10]);
            if (iK == -1) {
                return 0;
            }
            i11 = i10;
            i10 = iK;
        }
    }

    @qj.a
    public int y(int entryIndex) {
        return x(this.f24057a[entryIndex], i(this.f24062f[entryIndex]));
    }

    public void z(int newCapacity) {
        this.f24057a = Arrays.copyOf(this.f24057a, newCapacity);
        this.f24058b = Arrays.copyOf(this.f24058b, newCapacity);
        long[] jArr = this.f24062f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, newCapacity);
        if (newCapacity > length) {
            Arrays.fill(jArrCopyOf, length, newCapacity, -1L);
        }
        this.f24062f = jArrCopyOf;
    }

    public k9(k9<? extends K> map) {
        o(map.D(), 1.0f);
        int iF = map.f();
        while (iF != -1) {
            v(map.j(iF), map.l(iF));
            iF = map.t(iF);
        }
    }

    public k9(int capacity) {
        this(capacity, 1.0f);
    }

    public k9(int expectedSize, float loadFactor) {
        o(expectedSize, loadFactor);
    }
}
