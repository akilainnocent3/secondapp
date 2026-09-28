package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gcy<K, V> implements Iterable<b<K, V>> {
    public static final Object y = new Object();
    public int a;
    public K[] b;
    public V[] c;
    public final float d;
    public int e;
    public int f;
    public int i;
    public transient a v;
    public transient a w;

    public static class b<K, V> {
        public K a;
        public V b;

        public final String toString() {
            return this.a + "=" + this.b;
        }
    }

    public static abstract class c<K, V, I> implements Iterable<I>, Iterator<I> {
        public boolean a;
        public final gcy<K, V> b;
        public int c;
        public boolean e = true;
        public int d = -1;

        public c(gcy<K, V> gcyVar) {
            int i;
            this.b = gcyVar;
            this.c = -1;
            K[] kArr = gcyVar.b;
            int length = kArr.length;
            do {
                i = this.c + 1;
                this.c = i;
                if (i >= length) {
                    this.a = false;
                    return;
                }
            } while (kArr[i] == null);
            this.a = true;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.d;
            if (i < 0) {
                ib5.a("next must be called before remove.");
                return;
            }
            gcy<K, V> gcyVar = this.b;
            K[] kArr = gcyVar.b;
            V[] vArr = gcyVar.c;
            int i2 = gcyVar.i;
            int i3 = i + 1;
            while (true) {
                int i4 = i3 & i2;
                K k = kArr[i4];
                if (k == null) {
                    break;
                }
                int iHashCode = (int) ((((long) k.hashCode()) * (-7046029254386353131L)) >>> gcyVar.f);
                if (((i4 - iHashCode) & i2) > ((i - iHashCode) & i2)) {
                    kArr[i] = k;
                    vArr[i] = vArr[i4];
                    i = i4;
                }
                i3 = i4 + 1;
            }
            kArr[i] = null;
            vArr[i] = null;
            gcyVar.a--;
            if (i != this.d) {
                this.c--;
            }
            this.d = -1;
        }
    }

    public gcy(int i, float f) {
        if (f <= 0.0f || f >= 1.0f) {
            fcy.a(f, "loadFactor must be > 0 and < 1: ");
            throw null;
        }
        this.d = f;
        int i2 = ncy.i(i, f);
        this.e = (int) (i2 * f);
        int i3 = i2 - 1;
        this.i = i3;
        this.f = Long.numberOfLeadingZeros(i3);
        this.b = (K[]) new Object[i2];
        this.c = (V[]) new Object[i2];
    }

    public final int a(K k) {
        if (k == null) {
            hb5.a("key cannot be null.");
            return 0;
        }
        K[] kArr = this.b;
        int iHashCode = (int) ((((long) k.hashCode()) * (-7046029254386353131L)) >>> this.f);
        while (true) {
            K k2 = kArr[iHashCode];
            if (k2 == null) {
                return -(iHashCode + 1);
            }
            if (k2.equals(k)) {
                return iHashCode;
            }
            iHashCode = (iHashCode + 1) & this.i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Object obj, Object obj2) {
        int iA = a(obj);
        if (iA >= 0) {
            V[] vArr = this.c;
            Object obj3 = vArr[iA];
            vArr[iA] = obj2;
            return;
        }
        int i = -(iA + 1);
        K[] kArr = this.b;
        kArr[i] = obj;
        ((V[]) this.c)[i] = obj2;
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 >= this.e) {
            int length = kArr.length << 1;
            int length2 = kArr.length;
            this.e = (int) (length * this.d);
            int i3 = length - 1;
            this.i = i3;
            this.f = Long.numberOfLeadingZeros(i3);
            K[] kArr2 = this.b;
            V[] vArr2 = this.c;
            this.b = (K[]) new Object[length];
            this.c = (V[]) new Object[length];
            if (this.a > 0) {
                for (int i4 = 0; i4 < length2; i4++) {
                    K k = kArr2[i4];
                    if (k != null) {
                        V v = vArr2[i4];
                        K[] kArr3 = this.b;
                        int iHashCode = (int) ((((long) k.hashCode()) * (-7046029254386353131L)) >>> this.f);
                        while (kArr3[iHashCode] != null) {
                            iHashCode = (iHashCode + 1) & this.i;
                        }
                        kArr3[iHashCode] = k;
                        this.c[iHashCode] = v;
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gcy) {
            gcy gcyVar = (gcy) obj;
            if (gcyVar.a == this.a) {
                K[] kArr = this.b;
                V[] vArr = this.c;
                int length = kArr.length;
                for (int i = 0; i < length; i++) {
                    K k = kArr[i];
                    if (k != null) {
                        V v = vArr[i];
                        if (v == null) {
                            int iA = gcyVar.a(k);
                            if ((iA < 0 ? y : gcyVar.c[iA]) != null) {
                            }
                        } else {
                            int iA2 = gcyVar.a(k);
                            if (!v.equals(iA2 < 0 ? null : gcyVar.c[iA2])) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a;
        K[] kArr = this.b;
        V[] vArr = this.c;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                int iHashCode2 = k.hashCode() + iHashCode;
                V v = vArr[i];
                iHashCode = v != null ? v.hashCode() + iHashCode2 : iHashCode2;
            }
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i;
        int i2;
        if (this.v == null) {
            this.v = new a(this);
            this.w = new a(this);
        }
        a aVar = this.v;
        if (!aVar.e) {
            aVar.d = -1;
            aVar.c = -1;
            K[] kArr = aVar.b.b;
            int length = kArr.length;
            do {
                i2 = aVar.c + 1;
                aVar.c = i2;
                if (i2 >= length) {
                    aVar.a = false;
                }
                a aVar2 = this.v;
                aVar2.e = true;
                this.w.e = false;
                return aVar2;
            } while (kArr[i2] == null);
            aVar.a = true;
            a aVar3 = this.v;
            aVar3.e = true;
            this.w.e = false;
            return aVar3;
        }
        a aVar4 = this.w;
        aVar4.d = -1;
        aVar4.c = -1;
        K[] kArr2 = aVar4.b.b;
        int length2 = kArr2.length;
        do {
            i = aVar4.c + 1;
            aVar4.c = i;
            if (i >= length2) {
                aVar4.a = false;
            }
            a aVar5 = this.w;
            aVar5.e = true;
            this.v.e = false;
            return aVar5;
        } while (kArr2[i] == null);
        aVar4.a = true;
        a aVar6 = this.w;
        aVar6.e = true;
        this.v.e = false;
        return aVar6;
    }

    public final String toString() {
        int i;
        if (this.a == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('{');
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        int length = objArr.length;
        while (true) {
            i = length - 1;
            if (length > 0) {
                Object obj = objArr[i];
                if (obj != null) {
                    if (obj == this) {
                        obj = "(this)";
                    }
                    sb.append(obj);
                    sb.append('=');
                    Object obj2 = objArr2[i];
                    if (obj2 == this) {
                        obj2 = "(this)";
                    }
                    sb.append(obj2);
                    break;
                }
                length = i;
            } else {
                break;
            }
        }
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                sb.append('}');
                return sb.toString();
            }
            Object obj3 = objArr[i2];
            if (obj3 != null) {
                sb.append(", ");
                if (obj3 == this) {
                    obj3 = "(this)";
                }
                sb.append(obj3);
                sb.append('=');
                Object obj4 = objArr2[i2];
                if (obj4 == this) {
                    obj4 = "(this)";
                }
                sb.append(obj4);
            }
            i = i2;
        }
    }

    public static class a<K, V> extends c<K, V, b<K, V>> {
        public final b<K, V> f;

        public a(gcy<K, V> gcyVar) {
            super(gcyVar);
            this.f = new b<>();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.e) {
                return this.a;
            }
            throw new qyj("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i;
            if (!this.a) {
                lrh0.a();
                return null;
            }
            if (!this.e) {
                throw new qyj("#iterator() cannot be used nested.");
            }
            gcy<K, V> gcyVar = this.b;
            K[] kArr = gcyVar.b;
            int i2 = this.c;
            K k = kArr[i2];
            b<K, V> bVar = this.f;
            bVar.a = k;
            bVar.b = gcyVar.c[i2];
            this.d = i2;
            int length = kArr.length;
            do {
                i = this.c + 1;
                this.c = i;
                if (i >= length) {
                    this.a = false;
                    return bVar;
                }
            } while (kArr[i] == null);
            this.a = true;
            return bVar;
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            return this;
        }
    }
}
