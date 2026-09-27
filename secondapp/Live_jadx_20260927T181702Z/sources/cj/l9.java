package cj;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(emulated = true, serializable = true)
@j4
public class l9<K> extends k9<K> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f24117r = -2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @yi.e
    public transient long[] f24118o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public transient int f24119p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public transient int f24120q;

    public l9() {
        this(3);
    }

    public static <K> l9<K> F() {
        return new l9<>();
    }

    public static <K> l9<K> G(int expectedSize) {
        return new l9<>(expectedSize);
    }

    public final int H(int entry) {
        return (int) (this.f24118o[entry] >>> 32);
    }

    public final int I(int entry) {
        return (int) this.f24118o[entry];
    }

    public final void J(int entry, int pred) {
        long[] jArr = this.f24118o;
        jArr[entry] = (jArr[entry] & 4294967295L) | (((long) pred) << 32);
    }

    public final void K(int pred, int succ) {
        if (pred == -2) {
            this.f24119p = succ;
        } else {
            L(pred, succ);
        }
        if (succ == -2) {
            this.f24120q = pred;
        } else {
            J(succ, pred);
        }
    }

    public final void L(int entry, int succ) {
        long[] jArr = this.f24118o;
        jArr[entry] = (jArr[entry] & k9.f24054l) | (((long) succ) & 4294967295L);
    }

    @Override // cj.k9
    public void a() {
        super.a();
        this.f24119p = -2;
        this.f24120q = -2;
    }

    @Override // cj.k9
    public int f() {
        int i10 = this.f24119p;
        if (i10 == -2) {
            return -1;
        }
        return i10;
    }

    @Override // cj.k9
    public void o(int expectedSize, float loadFactor) {
        super.o(expectedSize, loadFactor);
        this.f24119p = -2;
        this.f24120q = -2;
        long[] jArr = new long[expectedSize];
        this.f24118o = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // cj.k9
    public void p(int entryIndex, @n9 K key, int value, int hash) {
        super.p(entryIndex, key, value, hash);
        K(this.f24120q, entryIndex);
        K(entryIndex, -2);
    }

    @Override // cj.k9
    public void q(int dstIndex) {
        int iD = D() - 1;
        K(H(dstIndex), I(dstIndex));
        if (dstIndex < iD) {
            K(H(iD), dstIndex);
            K(dstIndex, I(iD));
        }
        super.q(dstIndex);
    }

    @Override // cj.k9
    public int t(int index) {
        int I = I(index);
        if (I == -2) {
            return -1;
        }
        return I;
    }

    @Override // cj.k9
    public int u(int oldNextIndex, int removedIndex) {
        return oldNextIndex == D() ? removedIndex : oldNextIndex;
    }

    @Override // cj.k9
    public void z(int newCapacity) {
        super.z(newCapacity);
        long[] jArr = this.f24118o;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, newCapacity);
        this.f24118o = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, newCapacity, -1L);
    }

    public l9(int expectedSize) {
        this(expectedSize, 1.0f);
    }

    public l9(int expectedSize, float loadFactor) {
        super(expectedSize, loadFactor);
    }

    public l9(k9<K> map) {
        o(map.D(), 1.0f);
        int iF = map.f();
        while (iF != -1) {
            v(map.j(iF), map.l(iF));
            iF = map.t(iF);
        }
    }
}
