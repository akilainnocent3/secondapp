package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \b*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006\t\n\u000b\f\r\u000eB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lxnu;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "C", "a", "d", "e", "f", "b", "c", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xnu<K, V> implements Map<K, V>, Serializable, ghp {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final xnu D;
    public ynu<K, V> A;
    public boolean B;
    public K[] a;
    public V[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int i;
    public int v;
    public int w;
    public znu<K> y;
    public aou<V> z;

    /* JADX INFO: renamed from: xnu$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, dhp {
        @Override // java.util.Iterator
        public final Object next() {
            b();
            int i = this.b;
            xnu<K, V> xnuVar = this.a;
            if (i >= xnuVar.f) {
                lrh0.a();
                return null;
            }
            this.b = i + 1;
            this.c = i;
            c cVar = new c(xnuVar, i);
            c();
            return cVar;
        }
    }

    public static final class c<K, V> implements Map.Entry<K, V>, ghp.a {
        public final xnu<K, V> a;
        public final int b;
        public final int c;

        public c(xnu<K, V> xnuVar, int i) {
            xnuVar.getClass();
            this.a = xnuVar;
            this.b = i;
            this.c = xnuVar.v;
        }

        public final void b() {
            if (this.a.v != this.c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Intrinsics.g(entry.getKey(), getKey()) && Intrinsics.g(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            b();
            return this.a.a[this.b];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            b();
            V[] vArr = this.a.b;
            vArr.getClass();
            return vArr[this.b];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            b();
            xnu<K, V> xnuVar = this.a;
            xnuVar.d();
            V[] vArr = xnuVar.b;
            if (vArr == null) {
                int length = xnuVar.a.length;
                if (length < 0) {
                    hb5.a("capacity must be non-negative.");
                    return null;
                }
                vArr = (V[]) new Object[length];
                xnuVar.b = vArr;
            }
            int i = this.b;
            V v2 = vArr[i];
            vArr[i] = v;
            return v2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    public static class d<K, V> {
        public final xnu<K, V> a;
        public int b;
        public int c;
        public int d;

        public d(xnu<K, V> xnuVar) {
            xnuVar.getClass();
            this.a = xnuVar;
            this.c = -1;
            this.d = xnuVar.v;
            c();
        }

        public final void b() {
            if (this.a.v == this.d) {
                return;
            }
            sx0.a();
        }

        public final void c() {
            while (true) {
                int i = this.b;
                xnu<K, V> xnuVar = this.a;
                if (i >= xnuVar.f || xnuVar.c[i] >= 0) {
                    return;
                } else {
                    this.b = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.b < this.a.f;
        }

        public final void remove() {
            b();
            if (this.c == -1) {
                ib5.a("Call next() before removing element from the iterator.");
                return;
            }
            xnu<K, V> xnuVar = this.a;
            xnuVar.d();
            xnuVar.m(this.c);
            this.c = -1;
            this.d = xnuVar.v;
        }
    }

    public static final class e<K, V> extends d<K, V> implements Iterator<K>, dhp {
        @Override // java.util.Iterator
        public final K next() {
            b();
            int i = this.b;
            xnu<K, V> xnuVar = this.a;
            if (i >= xnuVar.f) {
                lrh0.a();
                return null;
            }
            this.b = i + 1;
            this.c = i;
            K k = xnuVar.a[i];
            c();
            return k;
        }
    }

    public static final class f<K, V> extends d<K, V> implements Iterator<V>, dhp {
        @Override // java.util.Iterator
        public final V next() {
            b();
            int i = this.b;
            xnu<K, V> xnuVar = this.a;
            if (i >= xnuVar.f) {
                lrh0.a();
                return null;
            }
            this.b = i + 1;
            this.c = i;
            V[] vArr = xnuVar.b;
            vArr.getClass();
            V v = vArr[this.c];
            c();
            return v;
        }
    }

    static {
        xnu xnuVar = new xnu(0);
        xnuVar.B = true;
        D = xnuVar;
    }

    public xnu(int i) {
        if (i < 0) {
            hb5.a("capacity must be non-negative.");
            throw null;
        }
        K[] kArr = (K[]) new Object[i];
        int[] iArr = new int[i];
        INSTANCE.getClass();
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.a = kArr;
        this.b = null;
        this.c = iArr;
        this.d = new int[iHighestOneBit];
        this.e = 2;
        this.f = 0;
        this.i = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int b(K k) {
        d();
        while (true) {
            int iK = k(k);
            int i = this.e * 2;
            int length = this.d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[iK];
                if (i3 == 0) {
                    int i4 = this.f;
                    K[] kArr = this.a;
                    if (i4 >= kArr.length) {
                        h(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f = i5;
                    kArr[i4] = k;
                    this.c[i4] = iK;
                    iArr[iK] = i5;
                    this.w++;
                    this.v++;
                    if (i2 > this.e) {
                        this.e = i2;
                    }
                    return i4;
                }
                if (Intrinsics.g(this.a[i3 - 1], k)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    l(this.d.length * 2);
                    break;
                }
                iK = iK == 0 ? this.d.length - 1 : iK - 1;
            }
        }
    }

    public final xnu c() {
        d();
        this.B = true;
        if (this.w > 0) {
            return this;
        }
        xnu xnuVar = D;
        xnuVar.getClass();
        return xnuVar;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ogs.a(0, this.f, this.a);
        V[] vArr = this.b;
        if (vArr != null) {
            ogs.a(0, this.f, vArr);
        }
        this.w = 0;
        this.f = 0;
        this.v++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return i(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    public final void d() {
        if (this.B) {
            bl0.a();
        }
    }

    public final void e(boolean z) {
        int i;
        V[] vArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.a;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        ogs.a(i3, i, this.a);
        if (vArr != null) {
            ogs.a(i3, this.f, vArr);
        }
        this.f = i3;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        ynu<K, V> ynuVar = this.A;
        if (ynuVar != null) {
            return ynuVar;
        }
        ynu<K, V> ynuVar2 = new ynu<>(this);
        this.A = ynuVar2;
        return ynuVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.w == map.size() && f(map.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(Collection<?> collection) {
        boolean zG;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int i = i(entry.getKey());
                    if (i < 0) {
                        zG = false;
                    } else {
                        V[] vArr = this.b;
                        vArr.getClass();
                        zG = Intrinsics.g(vArr[i], entry.getValue());
                    }
                    if (!zG) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return null;
        }
        V[] vArr = this.b;
        vArr.getClass();
        return vArr[i];
    }

    public final void h(int i) {
        K[] kArr = this.a;
        int length = kArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.w;
        if (i3 < i && i3 + i4 >= i && i4 >= kArr.length / 4) {
            e(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > kArr.length) {
            q3.Companion companion = q3.INSTANCE;
            int length2 = kArr.length;
            companion.getClass();
            int iE = q3.Companion.e(length2, i5);
            K[] kArr2 = this.a;
            kArr2.getClass();
            this.a = (K[]) Arrays.copyOf(kArr2, iE);
            V[] vArr = this.b;
            this.b = vArr != null ? (V[]) Arrays.copyOf(vArr, iE) : null;
            this.c = Arrays.copyOf(this.c, iE);
            INSTANCE.getClass();
            int iHighestOneBit = Integer.highestOneBit((iE >= 1 ? iE : 1) * 3);
            if (iHighestOneBit > this.d.length) {
                l(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            int i2 = bVar.b;
            xnu<K, V> xnuVar = bVar.a;
            if (i2 >= xnuVar.f) {
                lrh0.a();
                return 0;
            }
            bVar.b = i2 + 1;
            bVar.c = i2;
            K k = xnuVar.a[i2];
            int iHashCode = k != null ? k.hashCode() : 0;
            V[] vArr = xnuVar.b;
            vArr.getClass();
            V v = vArr[bVar.c];
            int iHashCode2 = v != null ? v.hashCode() : 0;
            bVar.c();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(K k) {
        int iK = k(k);
        int i = this.e;
        while (true) {
            int i2 = this.d[iK];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (Intrinsics.g(this.a[i3], k)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iK = iK == 0 ? this.d.length - 1 : iK - 1;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.w == 0;
    }

    public final int j(V v) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                V[] vArr = this.b;
                vArr.getClass();
                if (Intrinsics.g(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    public final int k(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.i;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        znu<K> znuVar = this.y;
        if (znuVar != null) {
            return znuVar;
        }
        znu<K> znuVar2 = new znu<>(this);
        this.y = znuVar2;
        return znuVar2;
    }

    public final void l(int i) {
        int[] iArr;
        this.v++;
        int i2 = 0;
        if (this.f > this.w) {
            e(false);
        }
        this.d = new int[i];
        INSTANCE.getClass();
        this.i = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f) {
            int i3 = i2 + 1;
            int iK = k(this.a[i2]);
            int i4 = this.e;
            while (true) {
                iArr = this.d;
                if (iArr[iK] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    ib5.a("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iK = iK == 0 ? iArr.length - 1 : iK - 1;
            }
            iArr[iK] = i3;
            this.c[i2] = iK;
            i2 = i3;
        }
    }

    public final void m(int i) {
        int i2;
        int i3;
        int iK;
        int[] iArr;
        K[] kArr = this.a;
        kArr.getClass();
        kArr[i] = null;
        V[] vArr = this.b;
        if (vArr != null) {
            vArr[i] = null;
        }
        int length = this.c[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.d.length - 1 : length - 1;
                int[] iArr2 = this.d;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.e) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iK = k(this.a[i3]) - length;
                    iArr = this.d;
                }
            } while ((iK & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.c[i3] = i4;
        }
        this.c[i] = -1;
        this.w--;
        this.v++;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        d();
        int iB = b(k);
        V[] vArr = this.b;
        if (vArr == null) {
            int length = this.a.length;
            if (length < 0) {
                hb5.a("capacity must be non-negative.");
                return null;
            }
            vArr = (V[]) new Object[length];
            this.b = vArr;
        }
        if (iB >= 0) {
            vArr[iB] = v;
            return null;
        }
        int i = (-iB) - 1;
        V v2 = vArr[i];
        vArr[i] = v;
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        map.getClass();
        d();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        h(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iB = b(entry.getKey());
            V[] vArr = this.b;
            if (vArr == null) {
                int length = this.a.length;
                if (length < 0) {
                    hb5.a("capacity must be non-negative.");
                    return;
                } else {
                    vArr = (V[]) new Object[length];
                    this.b = vArr;
                }
            }
            if (iB >= 0) {
                vArr[iB] = entry.getValue();
            } else {
                int i = (-iB) - 1;
                if (!Intrinsics.g(entry.getValue(), vArr[i])) {
                    vArr[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        d();
        int i = i(obj);
        if (i < 0) {
            return null;
        }
        V[] vArr = this.b;
        vArr.getClass();
        V v = vArr[i];
        m(i);
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.w;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.w * 3) + 2);
        sb.append("{");
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = bVar.b;
            xnu<K, V> xnuVar = bVar.a;
            if (i2 >= xnuVar.f) {
                lrh0.a();
                return null;
            }
            bVar.b = i2 + 1;
            bVar.c = i2;
            K k = xnuVar.a[i2];
            if (k == xnuVar) {
                sb.append("(this Map)");
            } else {
                sb.append(k);
            }
            sb.append('=');
            V[] vArr = xnuVar.b;
            vArr.getClass();
            V v = vArr[bVar.c];
            if (v == xnuVar) {
                sb.append("(this Map)");
            } else {
                sb.append(v);
            }
            bVar.c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        aou<V> aouVar = this.z;
        if (aouVar != null) {
            return aouVar;
        }
        aou<V> aouVar2 = new aou<>(this);
        this.z = aouVar2;
        return aouVar2;
    }

    public xnu() {
        this(8);
    }
}
