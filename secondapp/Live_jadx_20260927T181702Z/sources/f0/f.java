package f0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.s1({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,266:1\n59#2,5:267\n59#2,5:272\n24#3:277\n24#3:278\n24#3:279\n24#3:280\n24#3:281\n24#3:282\n24#3:283\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n38#1:267,5\n39#1:272,5\n104#1:277\n121#1:278\n148#1:279\n183#1:280\n217#1:281\n231#1:282\n245#1:283\n*E\n"})
public final class f<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public E[] f81889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f81890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f81892d;

    @cs.k
    public f() {
        this(0, 1, null);
    }

    public final void a(E e10) {
        int i10 = (this.f81890b - 1) & this.f81892d;
        this.f81890b = i10;
        this.f81889a[i10] = e10;
        if (i10 == this.f81891c) {
            d();
        }
    }

    public final void b(E e10) {
        E[] eArr = this.f81889a;
        int i10 = this.f81891c;
        eArr[i10] = e10;
        int i11 = this.f81892d & (i10 + 1);
        this.f81891c = i11;
        if (i11 == this.f81890b) {
            d();
        }
    }

    public final void c() {
        l(m());
    }

    public final void d() {
        E[] eArr = this.f81889a;
        int length = eArr.length;
        int i10 = this.f81890b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i12];
        fr.q.B0(eArr, eArr2, 0, i10, length);
        fr.q.B0(this.f81889a, eArr2, i11, 0, this.f81890b);
        this.f81889a = eArr2;
        this.f81890b = 0;
        this.f81891c = length;
        this.f81892d = i12 - 1;
    }

    public final E e(int i10) {
        if (i10 < 0 || i10 >= m()) {
            h hVar = h.f81919a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.f81889a[this.f81892d & (this.f81890b + i10)];
        kotlin.jvm.internal.m0.m(e10);
        return e10;
    }

    public final E f() {
        int i10 = this.f81890b;
        if (i10 == this.f81891c) {
            h hVar = h.f81919a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.f81889a[i10];
        kotlin.jvm.internal.m0.m(e10);
        return e10;
    }

    public final E g() {
        int i10 = this.f81890b;
        int i11 = this.f81891c;
        if (i10 == i11) {
            h hVar = h.f81919a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.f81889a[(i11 - 1) & this.f81892d];
        kotlin.jvm.internal.m0.m(e10);
        return e10;
    }

    public final boolean h() {
        return this.f81890b == this.f81891c;
    }

    public final E i() {
        int i10 = this.f81890b;
        if (i10 == this.f81891c) {
            h hVar = h.f81919a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.f81889a;
        E e10 = eArr[i10];
        eArr[i10] = null;
        this.f81890b = (i10 + 1) & this.f81892d;
        return e10;
    }

    public final E j() {
        int i10 = this.f81890b;
        int i11 = this.f81891c;
        if (i10 == i11) {
            h hVar = h.f81919a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f81892d & (i11 - 1);
        E[] eArr = this.f81889a;
        E e10 = eArr[i12];
        eArr[i12] = null;
        this.f81891c = i12;
        return e10;
    }

    public final void k(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > m()) {
            h hVar = h.f81919a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f81891c;
        int i12 = i10 < i11 ? i11 - i10 : 0;
        for (int i13 = i12; i13 < i11; i13++) {
            this.f81889a[i13] = null;
        }
        int i14 = this.f81891c;
        int i15 = i14 - i12;
        int i16 = i10 - i15;
        this.f81891c = i14 - i15;
        if (i16 > 0) {
            int length = this.f81889a.length;
            this.f81891c = length;
            int i17 = length - i16;
            for (int i18 = i17; i18 < length; i18++) {
                this.f81889a[i18] = null;
            }
            this.f81891c = i17;
        }
    }

    public final void l(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > m()) {
            h hVar = h.f81919a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f81889a.length;
        int i11 = this.f81890b;
        if (i10 < length - i11) {
            length = i11 + i10;
        }
        while (i11 < length) {
            this.f81889a[i11] = null;
            i11++;
        }
        int i12 = this.f81890b;
        int i13 = length - i12;
        int i14 = i10 - i13;
        this.f81890b = this.f81892d & (i12 + i13);
        if (i14 > 0) {
            for (int i15 = 0; i15 < i14; i15++) {
                this.f81889a[i15] = null;
            }
            this.f81890b = i14;
        }
    }

    public final int m() {
        return (this.f81891c - this.f81890b) & this.f81892d;
    }

    @cs.k
    public f(int i10) {
        if (!(i10 >= 1)) {
            g0.f.c("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824)) {
            g0.f.c("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f81892d = i10 - 1;
        this.f81889a = (E[]) new Object[i10];
    }

    public /* synthetic */ f(int i10, int i11, kotlin.jvm.internal.x xVar) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
