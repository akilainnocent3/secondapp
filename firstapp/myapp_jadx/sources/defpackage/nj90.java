package defpackage;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class nj90<K, V> {
    public int[] a;
    public Object[] b;
    public int c;

    public nj90(int i) {
        this.a = i == 0 ? bza.a : new int[i];
        this.b = i == 0 ? bza.c : new Object[i << 1];
    }

    public final int b(V v) {
        int i = this.c * 2;
        Object[] objArr = this.b;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (v.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void c(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, i);
            this.b = Arrays.copyOf(this.b, i * 2);
        }
        if (this.c == i2) {
            return;
        }
        sx0.a();
    }

    public void clear() {
        int i = this.c;
        if (i > 0) {
            this.a = bza.a;
            this.b = bza.c;
            i = 0;
            this.c = 0;
        }
        if (i <= 0) {
            return;
        }
        sx0.a();
    }

    public boolean containsKey(K k) {
        return e(k) >= 0;
    }

    public boolean containsValue(V v) {
        return b(v) >= 0;
    }

    public final int d(int i, Object obj) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int iA = bza.a(i2, i, this.a);
        if (iA < 0 || Intrinsics.g(obj, this.b[iA << 1])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (Intrinsics.g(obj, this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (Intrinsics.g(obj, this.b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int e(K k) {
        return k == null ? f() : d(k.hashCode(), k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof nj90) {
                int i = this.c;
                if (i != ((nj90) obj).c) {
                    return false;
                }
                nj90 nj90Var = (nj90) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    K kG = g(i2);
                    V vK = k(i2);
                    Object obj2 = nj90Var.get(kG);
                    if (vK == null) {
                        if (obj2 != null || !nj90Var.containsKey(kG)) {
                            return false;
                        }
                    } else if (!vK.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.c;
            for (int i4 = 0; i4 < i3; i4++) {
                K kG2 = g(i4);
                V vK2 = k(i4);
                Object obj3 = ((Map) obj).get(kG2);
                if (vK2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kG2)) {
                        return false;
                    }
                } else if (!vK2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int iA = bza.a(i, 0, this.a);
        if (iA < 0 || this.b[iA << 1] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final K g(int i) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (z) {
            return (K) this.b[i << 1];
        }
        hb5.a(hce0.a(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public V get(K k) {
        int iE = e(k);
        if (iE >= 0) {
            return (V) this.b[(iE << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V getOrDefault(Object obj, V v) {
        int iE = e(obj);
        return iE >= 0 ? (V) this.b[(iE << 1) + 1] : v;
    }

    public void h(nj90<? extends K, ? extends V> nj90Var) {
        nj90Var.getClass();
        int i = nj90Var.c;
        c(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(nj90Var.g(i2), nj90Var.k(i2));
            }
        } else if (i > 0) {
            xx0.d(0, 0, i, nj90Var.a, this.a);
            xx0.e(0, 0, i << 1, nj90Var.b, this.b);
            this.c = i;
        }
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public V i(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.c)) {
            hb5.a(hce0.a(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.b;
        int i3 = i << 1;
        V v = (V) objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return v;
        }
        int i4 = i2 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                xx0.d(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.b;
                xx0.e(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.a = Arrays.copyOf(iArr, i7);
            this.b = Arrays.copyOf(this.b, i7 << 1);
            if (i2 != this.c) {
                sx0.a();
                return null;
            }
            if (i > 0) {
                xx0.d(0, 0, i, iArr, this.a);
                xx0.e(0, 0, i3, objArr, this.b);
            }
            if (i < i4) {
                int i8 = i + 1;
                xx0.d(i, i8, i2, iArr, this.a);
                xx0.e(i3, i8 << 1, i2 << 1, objArr, this.b);
            }
        }
        if (i2 == this.c) {
            this.c = i4;
            return v;
        }
        sx0.a();
        return null;
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public V j(int i, V v) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (!z) {
            hb5.a(hce0.a(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.b;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public final V k(int i) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (z) {
            return (V) this.b[(i << 1) + 1];
        }
        hb5.a(hce0.a(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public V put(K k, V v) {
        int i = this.c;
        int iHashCode = k != null ? k.hashCode() : 0;
        int iD = k != null ? d(iHashCode, k) : f();
        if (iD >= 0) {
            int i2 = (iD << 1) + 1;
            Object[] objArr = this.b;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~iD;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.a = Arrays.copyOf(iArr, i4);
            this.b = Arrays.copyOf(this.b, i4 << 1);
            if (i != this.c) {
                sx0.a();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            xx0.d(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.b;
            xx0.e(i5 << 1, i3 << 1, this.c << 1, objArr2, objArr2);
        }
        int i6 = this.c;
        if (i == i6) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.b;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this.c = i6 + 1;
                return null;
            }
        }
        sx0.a();
        return null;
    }

    public final V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public final boolean remove(K k, V v) {
        int iE = e(k);
        if (iE < 0 || !Intrinsics.g(v, k(iE))) {
            return false;
        }
        i(iE);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int iE = e(k);
        if (iE < 0 || !Intrinsics.g(v, k(iE))) {
            return false;
        }
        j(iE, v2);
        return true;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kG = g(i2);
            if (kG != sb) {
                sb.append(kG);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vK = k(i2);
            if (vK != sb) {
                sb.append(vK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public V remove(K k) {
        int iE = e(k);
        if (iE >= 0) {
            return i(iE);
        }
        return null;
    }

    public final V replace(K k, V v) {
        int iE = e(k);
        if (iE >= 0) {
            return j(iE, v);
        }
        return null;
    }

    public nj90() {
        this(0);
    }

    public nj90(ox0 ox0Var) {
        this(0);
        h(ox0Var);
    }
}
