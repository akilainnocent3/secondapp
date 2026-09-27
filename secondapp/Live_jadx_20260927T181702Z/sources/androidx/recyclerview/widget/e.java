package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.g1;
import k.i1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e<T> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f18685s = "AsyncListUtil";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f18686t = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f18687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<T> f18689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f18690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j0<T> f18691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0.b<T> f18692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0.a<T> f18693g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18697k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0.b<T> f18703q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i0.a<T> f18704r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f18694h = new int[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f18695i = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f18696j = new int[2];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18698l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18699m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18700n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18701o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SparseIntArray f18702p = new SparseIntArray();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements i0.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void a(int i10, int i11) {
            if (d(i10)) {
                e eVar = e.this;
                eVar.f18699m = i11;
                eVar.f18690d.c();
                e eVar2 = e.this;
                eVar2.f18700n = eVar2.f18701o;
                e();
                e eVar3 = e.this;
                eVar3.f18697k = false;
                eVar3.g();
            }
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void b(int i10, int i11) {
            if (d(i10)) {
                j0.a<T> aVarE = e.this.f18691e.e(i11);
                if (aVarE != null) {
                    e.this.f18693g.d(aVarE);
                    return;
                }
                Log.e(e.f18685s, "tile not found @" + i11);
            }
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void c(int i10, j0.a<T> aVar) {
            if (!d(i10)) {
                e.this.f18693g.d(aVar);
                return;
            }
            j0.a<T> aVarA = e.this.f18691e.a(aVar);
            if (aVarA != null) {
                Log.e(e.f18685s, "duplicate tile @" + aVarA.f18844b);
                e.this.f18693g.d(aVarA);
            }
            int i11 = aVar.f18844b + aVar.f18845c;
            int i12 = 0;
            while (i12 < e.this.f18702p.size()) {
                int iKeyAt = e.this.f18702p.keyAt(i12);
                if (aVar.f18844b > iKeyAt || iKeyAt >= i11) {
                    i12++;
                } else {
                    e.this.f18702p.removeAt(i12);
                    e.this.f18690d.d(iKeyAt);
                }
            }
        }

        public final boolean d(int i10) {
            return i10 == e.this.f18701o;
        }

        public final void e() {
            for (int i10 = 0; i10 < e.this.f18691e.f(); i10++) {
                e eVar = e.this;
                eVar.f18693g.d(eVar.f18691e.c(i10));
            }
            e.this.f18691e.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements i0.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0.a<T> f18706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseBooleanArray f18707b = new SparseBooleanArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f18711f;

        public b() {
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void a(int i10, int i11, int i12, int i13, int i14) {
            if (i10 > i11) {
                return;
            }
            int iH = h(i10);
            int iH2 = h(i11);
            this.f18710e = h(i12);
            int iH3 = h(i13);
            this.f18711f = iH3;
            if (i14 == 1) {
                l(this.f18710e, iH2, i14, true);
                l(iH2 + e.this.f18688b, this.f18711f, i14, false);
            } else {
                l(iH, iH3, i14, false);
                l(this.f18710e, iH - e.this.f18688b, i14, true);
            }
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void b(int i10, int i11) {
            if (i(i10)) {
                return;
            }
            j0.a<T> aVarE = e();
            aVarE.f18844b = i10;
            int iMin = Math.min(e.this.f18688b, this.f18709d - i10);
            aVarE.f18845c = iMin;
            e.this.f18689c.a(aVarE.f18843a, aVarE.f18844b, iMin);
            g(i11);
            f(aVarE);
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void c(int i10) {
            this.f18708c = i10;
            this.f18707b.clear();
            int iD = e.this.f18689c.d();
            this.f18709d = iD;
            e.this.f18692f.a(this.f18708c, iD);
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void d(j0.a<T> aVar) {
            e.this.f18689c.c(aVar.f18843a, aVar.f18845c);
            aVar.f18846d = this.f18706a;
            this.f18706a = aVar;
        }

        public final j0.a<T> e() {
            j0.a<T> aVar = this.f18706a;
            if (aVar != null) {
                this.f18706a = aVar.f18846d;
                return aVar;
            }
            e eVar = e.this;
            return new j0.a<>(eVar.f18687a, eVar.f18688b);
        }

        public final void f(j0.a<T> aVar) {
            this.f18707b.put(aVar.f18844b, true);
            e.this.f18692f.c(this.f18708c, aVar);
        }

        public final void g(int i10) {
            int iB = e.this.f18689c.b();
            while (this.f18707b.size() >= iB) {
                int iKeyAt = this.f18707b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f18707b;
                int iKeyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i11 = this.f18710e - iKeyAt;
                int i12 = iKeyAt2 - this.f18711f;
                if (i11 > 0 && (i11 >= i12 || i10 == 2)) {
                    k(iKeyAt);
                } else {
                    if (i12 <= 0) {
                        return;
                    }
                    if (i11 >= i12 && i10 != 1) {
                        return;
                    } else {
                        k(iKeyAt2);
                    }
                }
            }
        }

        public final int h(int i10) {
            return i10 - (i10 % e.this.f18688b);
        }

        public final boolean i(int i10) {
            return this.f18707b.get(i10);
        }

        public final void j(String str, Object... objArr) {
            Log.d(e.f18685s, "[BKGR] " + String.format(str, objArr));
        }

        public final void k(int i10) {
            this.f18707b.delete(i10);
            e.this.f18692f.b(this.f18708c, i10);
        }

        public final void l(int i10, int i11, int i12, boolean z10) {
            int i13 = i10;
            while (i13 <= i11) {
                e.this.f18693g.b(z10 ? (i11 + i10) - i13 : i13, i12);
                i13 += e.this.f18688b;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f18713a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f18714b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f18715c = 2;

        @g1
        public void a(@NonNull int[] iArr, @NonNull int[] iArr2, int i10) {
            int i11 = iArr[1];
            int i12 = iArr[0];
            int i13 = (i11 - i12) + 1;
            int i14 = i13 / 2;
            iArr2[0] = i12 - (i10 == 1 ? i13 : i14);
            if (i10 != 2) {
                i13 = i14;
            }
            iArr2[1] = i11 + i13;
        }

        @g1
        public abstract void b(@NonNull int[] iArr);

        @g1
        public abstract void c();

        @g1
        public abstract void d(int i10);
    }

    public e(@NonNull Class<T> cls, int i10, @NonNull c<T> cVar, @NonNull d dVar) {
        a aVar = new a();
        this.f18703q = aVar;
        b bVar = new b();
        this.f18704r = bVar;
        this.f18687a = cls;
        this.f18688b = i10;
        this.f18689c = cVar;
        this.f18690d = dVar;
        this.f18691e = new j0<>(i10);
        w wVar = new w();
        this.f18692f = wVar.a(aVar);
        this.f18693g = wVar.b(bVar);
        f();
    }

    @Nullable
    public T a(int i10) {
        if (i10 < 0 || i10 >= this.f18699m) {
            throw new IndexOutOfBoundsException(i10 + " is not within 0 and " + this.f18699m);
        }
        T tD = this.f18691e.d(i10);
        if (tD == null && !c()) {
            this.f18702p.put(i10, 0);
        }
        return tD;
    }

    public int b() {
        return this.f18699m;
    }

    public final boolean c() {
        return this.f18701o != this.f18700n;
    }

    public void d(String str, Object... objArr) {
        Log.d(f18685s, "[MAIN] " + String.format(str, objArr));
    }

    public void e() {
        if (c()) {
            return;
        }
        g();
        this.f18697k = true;
    }

    public void f() {
        this.f18702p.clear();
        i0.a<T> aVar = this.f18693g;
        int i10 = this.f18701o + 1;
        this.f18701o = i10;
        aVar.c(i10);
    }

    public void g() {
        int i10;
        this.f18690d.b(this.f18694h);
        int[] iArr = this.f18694h;
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (i11 > i12 || i11 < 0 || i12 >= this.f18699m) {
            return;
        }
        if (this.f18697k) {
            int[] iArr2 = this.f18695i;
            if (i11 > iArr2[1] || (i10 = iArr2[0]) > i12) {
                this.f18698l = 0;
            } else if (i11 < i10) {
                this.f18698l = 1;
            } else if (i11 > i10) {
                this.f18698l = 2;
            }
        } else {
            this.f18698l = 0;
        }
        int[] iArr3 = this.f18695i;
        iArr3[0] = i11;
        iArr3[1] = i12;
        this.f18690d.a(iArr, this.f18696j, this.f18698l);
        int[] iArr4 = this.f18696j;
        iArr4[0] = Math.min(this.f18694h[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.f18696j;
        iArr5[1] = Math.max(this.f18694h[1], Math.min(iArr5[1], this.f18699m - 1));
        i0.a<T> aVar = this.f18693g;
        int[] iArr6 = this.f18694h;
        int i13 = iArr6[0];
        int i14 = iArr6[1];
        int[] iArr7 = this.f18696j;
        aVar.a(i13, i14, iArr7[0], iArr7[1], this.f18698l);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class c<T> {
        @i1
        public abstract void a(@NonNull T[] tArr, int i10, int i11);

        @i1
        public int b() {
            return 10;
        }

        @i1
        public abstract int d();

        @i1
        public void c(@NonNull T[] tArr, int i10) {
        }
    }
}
