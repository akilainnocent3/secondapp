package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class f0<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18728j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f18729k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f18730l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f18731m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f18732n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f18733o = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T[] f18734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T[] f18735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f18739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f18740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class<T> f18742i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a<T2> extends b<T2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b<T2> f18743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f18744c;

        @SuppressLint({"UnknownNullness"})
        public a(b<T2> bVar) {
            this.f18743b = bVar;
            this.f18744c = new f(bVar);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public boolean b(T2 t10, T2 t11) {
            return this.f18743b.b(t10, t11);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public boolean c(T2 t10, T2 t11) {
            return this.f18743b.c(t10, t11);
        }

        @Override // androidx.recyclerview.widget.f0.b, java.util.Comparator
        public int compare(T2 t10, T2 t11) {
            return this.f18743b.compare(t10, t11);
        }

        @Override // androidx.recyclerview.widget.f0.b
        @Nullable
        public Object d(T2 t10, T2 t11) {
            return this.f18743b.d(t10, t11);
        }

        @Override // androidx.recyclerview.widget.f0.b
        public void e(int i10, int i11) {
            this.f18744c.onChanged(i10, i11, null);
        }

        public void f() {
            this.f18744c.a();
        }

        @Override // androidx.recyclerview.widget.f0.b, androidx.recyclerview.widget.v
        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i10, int i11, Object obj) {
            this.f18744c.onChanged(i10, i11, obj);
        }

        @Override // androidx.recyclerview.widget.v
        public void onInserted(int i10, int i11) {
            this.f18744c.onInserted(i10, i11);
        }

        @Override // androidx.recyclerview.widget.v
        public void onMoved(int i10, int i11) {
            this.f18744c.onMoved(i10, i11);
        }

        @Override // androidx.recyclerview.widget.v
        public void onRemoved(int i10, int i11) {
            this.f18744c.onRemoved(i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b<T2> implements Comparator<T2>, v {
        public abstract boolean b(T2 t10, T2 t11);

        public abstract boolean c(T2 t10, T2 t11);

        @Override // java.util.Comparator
        public abstract int compare(T2 t10, T2 t11);

        @Nullable
        public Object d(T2 t10, T2 t11) {
            return null;
        }

        public abstract void e(int i10, int i11);

        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i10, int i11, Object obj) {
            e(i10, i11);
        }
    }

    public f0(@NonNull Class<T> cls, @NonNull b<T> bVar) {
        this(cls, bVar, 10);
    }

    public final void A(@NonNull T[] tArr) {
        boolean z10 = this.f18739f instanceof a;
        if (!z10) {
            h();
        }
        this.f18736c = 0;
        this.f18737d = this.f18741h;
        this.f18735b = this.f18734a;
        this.f18738e = 0;
        int iD = D(tArr);
        this.f18734a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f18742i, iD));
        while (true) {
            int i10 = this.f18738e;
            if (i10 >= iD && this.f18736c >= this.f18737d) {
                break;
            }
            int i11 = this.f18736c;
            int i12 = this.f18737d;
            if (i11 >= i12) {
                int i13 = iD - i10;
                System.arraycopy(tArr, i10, this.f18734a, i10, i13);
                this.f18738e += i13;
                this.f18741h += i13;
                this.f18739f.onInserted(i10, i13);
                break;
            }
            if (i10 >= iD) {
                int i14 = i12 - i11;
                this.f18741h -= i14;
                this.f18739f.onRemoved(i10, i14);
                break;
            }
            T t10 = this.f18735b[i11];
            T t11 = tArr[i10];
            int iCompare = this.f18739f.compare(t10, t11);
            if (iCompare < 0) {
                B();
            } else if (iCompare > 0) {
                z(t11);
            } else if (this.f18739f.c(t10, t11)) {
                T[] tArr2 = this.f18734a;
                int i15 = this.f18738e;
                tArr2[i15] = t11;
                this.f18736c++;
                this.f18738e = i15 + 1;
                if (!this.f18739f.b(t10, t11)) {
                    b bVar = this.f18739f;
                    bVar.onChanged(this.f18738e - 1, 1, bVar.d(t10, t11));
                }
            } else {
                B();
                z(t11);
            }
        }
        this.f18735b = null;
        if (z10) {
            return;
        }
        k();
    }

    public final void B() {
        this.f18741h--;
        this.f18736c++;
        this.f18739f.onRemoved(this.f18738e, 1);
    }

    public int C() {
        return this.f18741h;
    }

    public final int D(@NonNull T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f18739f);
        int i10 = 0;
        int i11 = 1;
        for (int i12 = 1; i12 < tArr.length; i12++) {
            T t10 = tArr[i12];
            if (this.f18739f.compare(tArr[i10], t10) == 0) {
                int iM = m(t10, tArr, i10, i11);
                if (iM != -1) {
                    tArr[iM] = t10;
                } else {
                    if (i11 != i12) {
                        tArr[i11] = t10;
                    }
                    i11++;
                }
            } else {
                if (i11 != i12) {
                    tArr[i11] = t10;
                }
                i10 = i11;
                i11++;
            }
        }
        return i11;
    }

    public final void E() {
        if (this.f18735b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public void F(int i10, T t10) {
        E();
        T tN = n(i10);
        boolean z10 = tN == t10 || !this.f18739f.b(tN, t10);
        if (tN != t10 && this.f18739f.compare(tN, t10) == 0) {
            this.f18734a[i10] = t10;
            if (z10) {
                b bVar = this.f18739f;
                bVar.onChanged(i10, 1, bVar.d(tN, t10));
                return;
            }
            return;
        }
        if (z10) {
            b bVar2 = this.f18739f;
            bVar2.onChanged(i10, 1, bVar2.d(tN, t10));
        }
        v(i10, false);
        int iB = b(t10, false);
        if (i10 != iB) {
            this.f18739f.onMoved(i10, iB);
        }
    }

    public int a(T t10) {
        E();
        return b(t10, true);
    }

    public final int b(T t10, boolean z10) {
        int iL = l(t10, this.f18734a, 0, this.f18741h, 1);
        if (iL == -1) {
            iL = 0;
        } else if (iL < this.f18741h) {
            T t11 = this.f18734a[iL];
            if (this.f18739f.c(t11, t10)) {
                if (this.f18739f.b(t11, t10)) {
                    this.f18734a[iL] = t10;
                    return iL;
                }
                this.f18734a[iL] = t10;
                b bVar = this.f18739f;
                bVar.onChanged(iL, 1, bVar.d(t11, t10));
                return iL;
            }
        }
        g(iL, t10);
        if (z10) {
            this.f18739f.onInserted(iL, 1);
        }
        return iL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(@NonNull Collection<T> collection) {
        e(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f18742i, collection.size())), true);
    }

    public void d(@NonNull T... tArr) {
        e(tArr, false);
    }

    public void e(@NonNull T[] tArr, boolean z10) {
        E();
        if (tArr.length == 0) {
            return;
        }
        if (z10) {
            f(tArr);
        } else {
            f(j(tArr));
        }
    }

    public final void f(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int iD = D(tArr);
        if (this.f18741h != 0) {
            q(tArr, iD);
            return;
        }
        this.f18734a = tArr;
        this.f18741h = iD;
        this.f18739f.onInserted(0, iD);
    }

    public final void g(int i10, T t10) {
        int i11 = this.f18741h;
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("cannot add item to " + i10 + " because size is " + this.f18741h);
        }
        T[] tArr = this.f18734a;
        if (i11 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f18742i, tArr.length + 10));
            System.arraycopy(this.f18734a, 0, tArr2, 0, i10);
            tArr2[i10] = t10;
            System.arraycopy(this.f18734a, i10, tArr2, i10 + 1, this.f18741h - i10);
            this.f18734a = tArr2;
        } else {
            System.arraycopy(tArr, i10, tArr, i10 + 1, i11 - i10);
            this.f18734a[i10] = t10;
        }
        this.f18741h++;
    }

    public void h() {
        E();
        b bVar = this.f18739f;
        if (bVar instanceof a) {
            return;
        }
        if (this.f18740g == null) {
            this.f18740g = new a(bVar);
        }
        this.f18739f = this.f18740g;
    }

    public void i() {
        E();
        int i10 = this.f18741h;
        if (i10 == 0) {
            return;
        }
        Arrays.fill(this.f18734a, 0, i10, (Object) null);
        this.f18741h = 0;
        this.f18739f.onRemoved(0, i10);
    }

    public final T[] j(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f18742i, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    public void k() {
        E();
        b bVar = this.f18739f;
        if (bVar instanceof a) {
            ((a) bVar).f();
        }
        b bVar2 = this.f18739f;
        a aVar = this.f18740g;
        if (bVar2 == aVar) {
            this.f18739f = aVar.f18743b;
        }
    }

    public final int l(T t10, T[] tArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int i13 = (i10 + i11) / 2;
            T t11 = tArr[i13];
            int iCompare = this.f18739f.compare(t11, t10);
            if (iCompare < 0) {
                i10 = i13 + 1;
            } else {
                if (iCompare == 0) {
                    if (!this.f18739f.c(t11, t10)) {
                        int iP = p(t10, i13, i10, i11);
                        if (i12 != 1 || iP != -1) {
                            return iP;
                        }
                    }
                    return i13;
                }
                i11 = i13;
            }
        }
        if (i12 == 1) {
            return i10;
        }
        return -1;
    }

    public final int m(T t10, T[] tArr, int i10, int i11) {
        while (i10 < i11) {
            if (this.f18739f.c(tArr[i10], t10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public T n(int i10) throws IndexOutOfBoundsException {
        int i11;
        if (i10 < this.f18741h && i10 >= 0) {
            T[] tArr = this.f18735b;
            return (tArr == null || i10 < (i11 = this.f18738e)) ? this.f18734a[i10] : tArr[(i10 - i11) + this.f18736c];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i10 + " but size is " + this.f18741h);
    }

    public int o(T t10) {
        if (this.f18735b == null) {
            return l(t10, this.f18734a, 0, this.f18741h, 4);
        }
        int iL = l(t10, this.f18734a, 0, this.f18738e, 4);
        if (iL != -1) {
            return iL;
        }
        int iL2 = l(t10, this.f18735b, this.f18736c, this.f18737d, 4);
        if (iL2 != -1) {
            return (iL2 - this.f18736c) + this.f18738e;
        }
        return -1;
    }

    public final int p(T t10, int i10, int i11, int i12) {
        T t11;
        for (int i13 = i10 - 1; i13 >= i11; i13--) {
            T t12 = this.f18734a[i13];
            if (this.f18739f.compare(t12, t10) != 0) {
                break;
            }
            if (this.f18739f.c(t12, t10)) {
                return i13;
            }
        }
        do {
            i10++;
            if (i10 >= i12) {
                return -1;
            }
            t11 = this.f18734a[i10];
            if (this.f18739f.compare(t11, t10) != 0) {
                return -1;
            }
        } while (!this.f18739f.c(t11, t10));
        return i10;
    }

    public final void q(T[] tArr, int i10) {
        boolean z10 = this.f18739f instanceof a;
        if (!z10) {
            h();
        }
        this.f18735b = this.f18734a;
        int i11 = 0;
        this.f18736c = 0;
        int i12 = this.f18741h;
        this.f18737d = i12;
        this.f18734a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f18742i, i12 + i10 + 10));
        this.f18738e = 0;
        while (true) {
            int i13 = this.f18736c;
            int i14 = this.f18737d;
            if (i13 >= i14 && i11 >= i10) {
                break;
            }
            if (i13 == i14) {
                int i15 = i10 - i11;
                System.arraycopy(tArr, i11, this.f18734a, this.f18738e, i15);
                int i16 = this.f18738e + i15;
                this.f18738e = i16;
                this.f18741h += i15;
                this.f18739f.onInserted(i16 - i15, i15);
                break;
            }
            if (i11 == i10) {
                int i17 = i14 - i13;
                System.arraycopy(this.f18735b, i13, this.f18734a, this.f18738e, i17);
                this.f18738e += i17;
                break;
            }
            T t10 = this.f18735b[i13];
            T t11 = tArr[i11];
            int iCompare = this.f18739f.compare(t10, t11);
            if (iCompare > 0) {
                T[] tArr2 = this.f18734a;
                int i18 = this.f18738e;
                this.f18738e = i18 + 1;
                tArr2[i18] = t11;
                this.f18741h++;
                i11++;
                this.f18739f.onInserted(i18, 1);
            } else if (iCompare == 0 && this.f18739f.c(t10, t11)) {
                T[] tArr3 = this.f18734a;
                int i19 = this.f18738e;
                this.f18738e = i19 + 1;
                tArr3[i19] = t11;
                i11++;
                this.f18736c++;
                if (!this.f18739f.b(t10, t11)) {
                    b bVar = this.f18739f;
                    bVar.onChanged(this.f18738e - 1, 1, bVar.d(t10, t11));
                }
            } else {
                T[] tArr4 = this.f18734a;
                int i20 = this.f18738e;
                this.f18738e = i20 + 1;
                tArr4[i20] = t10;
                this.f18736c++;
            }
        }
        this.f18735b = null;
        if (z10) {
            return;
        }
        k();
    }

    public void r(int i10) {
        E();
        T tN = n(i10);
        v(i10, false);
        int iB = b(tN, false);
        if (i10 != iB) {
            this.f18739f.onMoved(i10, iB);
        }
    }

    public boolean s(T t10) {
        E();
        return t(t10, true);
    }

    public final boolean t(T t10, boolean z10) {
        int iL = l(t10, this.f18734a, 0, this.f18741h, 2);
        if (iL == -1) {
            return false;
        }
        v(iL, z10);
        return true;
    }

    public T u(int i10) {
        E();
        T tN = n(i10);
        v(i10, true);
        return tN;
    }

    public final void v(int i10, boolean z10) {
        T[] tArr = this.f18734a;
        System.arraycopy(tArr, i10 + 1, tArr, i10, (this.f18741h - i10) - 1);
        int i11 = this.f18741h - 1;
        this.f18741h = i11;
        this.f18734a[i11] = null;
        if (z10) {
            this.f18739f.onRemoved(i10, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w(@NonNull Collection<T> collection) {
        y(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f18742i, collection.size())), true);
    }

    public void x(@NonNull T... tArr) {
        y(tArr, false);
    }

    public void y(@NonNull T[] tArr, boolean z10) {
        E();
        if (z10) {
            A(tArr);
        } else {
            A(j(tArr));
        }
    }

    public final void z(T t10) {
        T[] tArr = this.f18734a;
        int i10 = this.f18738e;
        tArr[i10] = t10;
        this.f18738e = i10 + 1;
        this.f18741h++;
        this.f18739f.onInserted(i10, 1);
    }

    public f0(@NonNull Class<T> cls, @NonNull b<T> bVar, int i10) {
        this.f18742i = cls;
        this.f18734a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i10));
        this.f18739f = bVar;
        this.f18741h = 0;
    }
}
