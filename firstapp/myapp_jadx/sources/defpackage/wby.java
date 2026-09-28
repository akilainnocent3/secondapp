package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wby<K> implements Iterable<b<K>> {
    public int a;
    public final K[] b;
    public final float[] c;
    public final int d;
    public final int e;
    public transient a f;
    public transient a i;

    public static class b<K> {
        public K a;
        public float b;

        public final String toString() {
            return this.a + "=" + this.b;
        }
    }

    public static class c<K> {
        public boolean a;
        public final wby<K> b;
        public int c;
        public boolean e = true;
        public int d = -1;

        public c(wby<K> wbyVar) {
            int i;
            this.b = wbyVar;
            this.c = -1;
            K[] kArr = wbyVar.b;
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

        public final void remove() {
            int i = this.d;
            if (i < 0) {
                ib5.a("next must be called before remove.");
                return;
            }
            wby<K> wbyVar = this.b;
            K[] kArr = wbyVar.b;
            float[] fArr = wbyVar.c;
            int i2 = wbyVar.e;
            int i3 = i + 1;
            while (true) {
                int i4 = i3 & i2;
                K k = kArr[i4];
                if (k == null) {
                    break;
                }
                int iHashCode = (int) ((((long) k.hashCode()) * (-7046029254386353131L)) >>> wbyVar.d);
                if (((i4 - iHashCode) & i2) > ((i - iHashCode) & i2)) {
                    kArr[i] = k;
                    fArr[i] = fArr[i4];
                    i = i4;
                }
                i3 = i4 + 1;
            }
            kArr[i] = null;
            wbyVar.a--;
            if (i != this.d) {
                this.c--;
            }
            this.d = -1;
        }
    }

    public wby(int i) {
        int i2 = ncy.i(51, 0.8f);
        int i3 = i2 - 1;
        this.e = i3;
        this.d = Long.numberOfLeadingZeros(i3);
        this.b = (K[]) new Object[i2];
        this.c = new float[i2];
    }

    public final int a(K k) {
        int iHashCode = (int) ((((long) k.hashCode()) * (-7046029254386353131L)) >>> this.d);
        while (true) {
            K k2 = this.b[iHashCode];
            if (k2 == null) {
                return -(iHashCode + 1);
            }
            if (k2.equals(k)) {
                return iHashCode;
            }
            iHashCode = (iHashCode + 1) & this.e;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wby) {
            wby wbyVar = (wby) obj;
            if (wbyVar.a == this.a) {
                K[] kArr = this.b;
                int length = kArr.length;
                for (int i = 0; i < length; i++) {
                    K k = kArr[i];
                    if (k != null) {
                        int iA = wbyVar.a(k);
                        float f = iA < 0 ? 0.0f : wbyVar.c[iA];
                        if ((f != 0.0f || wbyVar.a(k) >= 0) && f == this.c[i]) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToRawIntBits = this.a;
        K[] kArr = this.b;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                iFloatToRawIntBits = Float.floatToRawIntBits(this.c[i]) + k.hashCode() + iFloatToRawIntBits;
            }
        }
        return iFloatToRawIntBits;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i;
        int i2;
        if (this.f == null) {
            this.f = new a(this);
            this.i = new a(this);
        }
        a aVar = this.f;
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
                a aVar2 = this.f;
                aVar2.e = true;
                this.i.e = false;
                return aVar2;
            } while (kArr[i2] == null);
            aVar.a = true;
            a aVar3 = this.f;
            aVar3.e = true;
            this.i.e = false;
            return aVar3;
        }
        a aVar4 = this.i;
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
            a aVar5 = this.i;
            aVar5.e = true;
            this.f.e = false;
            return aVar5;
        } while (kArr2[i] == null);
        aVar4.a = true;
        a aVar6 = this.i;
        aVar6.e = true;
        this.f.e = false;
        return aVar6;
    }

    public final String toString() {
        int i;
        float[] fArr;
        if (this.a == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('{');
        K[] kArr = this.b;
        int length = kArr.length;
        while (true) {
            i = length - 1;
            fArr = this.c;
            if (length > 0) {
                K k = kArr[i];
                if (k != null) {
                    sb.append(k);
                    sb.append('=');
                    sb.append(fArr[i]);
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
            K k2 = kArr[i2];
            if (k2 != null) {
                sb.append(", ");
                sb.append(k2);
                sb.append('=');
                sb.append(fArr[i2]);
            }
            i = i2;
        }
    }

    public static class a<K> extends c<K> implements Iterable<b<K>>, Iterator<b<K>> {
        public final b<K> f;

        public a(wby<K> wbyVar) {
            super(wbyVar);
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
            wby<K> wbyVar = this.b;
            K[] kArr = wbyVar.b;
            int i2 = this.c;
            K k = kArr[i2];
            b<K> bVar = this.f;
            bVar.a = k;
            bVar.b = wbyVar.c[i2];
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
