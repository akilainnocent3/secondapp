package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public class mw0<T> implements Iterable<T> {
    public T[] a;
    public int b;
    public boolean c;
    public transient a<T> d;

    public static class a<T> implements Iterable<T> {
        public final mw0<T> a;
        public final boolean b = true;
        public transient b<T> c;
        public transient b<T> d;

        public a(mw0<T> mw0Var) {
            this.a = mw0Var;
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b<T> iterator() {
            b<T> bVar = this.c;
            if (bVar == null) {
                mw0<T> mw0Var = this.a;
                boolean z = this.b;
                bVar = new b<>(mw0Var, z);
                this.c = bVar;
                this.d = new b<>(mw0Var, z);
            }
            if (!bVar.d) {
                bVar.c = 0;
                bVar.d = true;
                this.d.d = false;
                return bVar;
            }
            b<T> bVar2 = this.d;
            bVar2.c = 0;
            bVar2.d = true;
            bVar.d = false;
            return bVar2;
        }
    }

    public mw0(int i, boolean z) {
        this.c = z;
        this.a = (T[]) new Object[i];
    }

    public final void a(T t) {
        T[] tArr = this.a;
        int i = this.b;
        if (i == tArr.length) {
            tArr = (T[]) Arrays.copyOf(this.a, Math.max(8, (int) (i * 1.75f)));
            this.a = tArr;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        tArr[i2] = t;
    }

    public final void b(int i) {
        if (i < 0) {
            hb5.a(hce0.a(i, "additionalCapacity must be >= 0: "));
            return;
        }
        int i2 = this.b + i;
        if (i2 > this.a.length) {
            this.a = (T[]) Arrays.copyOf(this.a, Math.max(Math.max(8, i2), (int) (this.b * 1.75f)));
        }
    }

    public final int c(gwa gwaVar) {
        T[] tArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (tArr[i2] == gwaVar) {
                return i2;
            }
        }
        return -1;
    }

    public void clear() {
        Arrays.fill(this.a, 0, this.b, (Object) null);
        this.b = 0;
    }

    public final boolean contains(Object obj) {
        T[] tArr = this.a;
        int i = this.b - 1;
        while (i >= 0) {
            int i2 = i - 1;
            if (tArr[i] == obj) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final b<T> iterator() {
        a<T> aVar = this.d;
        if (aVar == null) {
            aVar = new a<>(this);
            this.d = aVar;
        }
        return aVar.iterator();
    }

    public T e(int i) {
        int i2 = this.b;
        if (i >= i2) {
            ks40.a(this.b, efe0.a(i, "index can't be >= size: ", " >= "));
            return null;
        }
        T[] tArr = this.a;
        T t = tArr[i];
        int i3 = i2 - 1;
        this.b = i3;
        if (this.c) {
            System.arraycopy(tArr, i + 1, tArr, i, i3 - i);
        } else {
            tArr[i] = tArr[i3];
        }
        tArr[this.b] = null;
        return t;
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (this.c && (obj instanceof mw0)) {
            mw0 mw0Var = (mw0) obj;
            if (mw0Var.c && (i = this.b) == mw0Var.b) {
                T[] tArr = this.a;
                T[] tArr2 = mw0Var.a;
                for (int i2 = 0; i2 < i; i2++) {
                    T t = tArr[i2];
                    T t2 = tArr2[i2];
                    if (t == null) {
                        if (t2 == null) {
                        }
                    } else if (t.equals(t2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void f(int i, T t) {
        if (i < this.b) {
            this.a[i] = t;
        } else {
            ks40.a(this.b, efe0.a(i, "index can't be >= size: ", " >= "));
        }
    }

    public final T get(int i) {
        if (i < this.b) {
            return this.a[i];
        }
        ks40.a(this.b, efe0.a(i, "index can't be >= size: ", " >= "));
        return null;
    }

    public T[] h(int i) {
        j(i);
        T[] tArr = this.a;
        if (i > tArr.length) {
            tArr = (T[]) Arrays.copyOf(this.a, Math.max(8, i));
            this.a = tArr;
        }
        this.b = i;
        return tArr;
    }

    public final int hashCode() {
        if (!this.c) {
            return super.hashCode();
        }
        T[] tArr = this.a;
        int i = this.b;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode *= 31;
            T t = tArr[i2];
            if (t != null) {
                iHashCode = t.hashCode() + iHashCode;
            }
        }
        return iHashCode;
    }

    public final void i() {
        T[] tArr = this.a;
        int length = tArr.length;
        int i = this.b;
        if (length != i) {
            this.a = (T[]) Arrays.copyOf(tArr, i);
        }
    }

    public void j(int i) {
        if (i < 0) {
            hb5.a(hce0.a(i, "newSize must be >= 0: "));
            return;
        }
        if (this.b <= i) {
            return;
        }
        for (int i2 = i; i2 < this.b; i2++) {
            this.a[i2] = null;
        }
        this.b = i;
    }

    public final T peek() {
        int i = this.b;
        if (i != 0) {
            return this.a[i - 1];
        }
        ib5.a("Array is empty.");
        return null;
    }

    public T pop() {
        int i = this.b;
        if (i == 0) {
            ib5.a("Array is empty.");
            return null;
        }
        int i2 = i - 1;
        this.b = i2;
        T[] tArr = this.a;
        T t = tArr[i2];
        tArr[i2] = null;
        return t;
    }

    public final String toString() {
        if (this.b == 0) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        T[] tArr = this.a;
        j9e0 j9e0Var = new j9e0(32);
        j9e0Var.b('[');
        T t = tArr[0];
        if (t == null) {
            j9e0Var.d();
        } else {
            j9e0Var.c(t.toString());
        }
        for (int i = 1; i < this.b; i++) {
            j9e0Var.c(", ");
            T t2 = tArr[i];
            if (t2 == null) {
                j9e0Var.d();
            } else {
                j9e0Var.c(t2.toString());
            }
        }
        j9e0Var.b(']');
        return j9e0Var.toString();
    }

    public mw0() {
        this(16, true);
    }

    public static class b<T> implements Iterator<T>, Iterable<T> {
        public final mw0<T> a;
        public final boolean b;
        public int c;
        public boolean d = true;

        public b(mw0<T> mw0Var, boolean z) {
            this.a = mw0Var;
            this.b = z;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.d) {
                return this.c < this.a.b;
            }
            throw new qyj("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public final T next() {
            int i = this.c;
            mw0<T> mw0Var = this.a;
            if (i >= mw0Var.b) {
                ibh0.a(String.valueOf(i));
                return null;
            }
            if (!this.d) {
                throw new qyj("#iterator() cannot be used nested.");
            }
            T[] tArr = mw0Var.a;
            this.c = i + 1;
            return tArr[i];
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.b) {
                throw new qyj("Remove not allowed.");
            }
            int i = this.c - 1;
            this.c = i;
            this.a.e(i);
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            return this;
        }
    }
}
