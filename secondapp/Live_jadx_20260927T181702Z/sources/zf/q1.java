package zf;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class q1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<V> f161422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eh.l<V> f161423c;

    public q1() {
        this(new eh.l() { // from class: zf.p1
            @Override // eh.l
            public final void accept(Object obj) {
                q1.a(obj);
            }
        });
    }

    public void b(int i10, V v10) {
        if (this.f161421a == -1) {
            eh.a.i(this.f161422b.size() == 0);
            this.f161421a = 0;
        }
        if (this.f161422b.size() > 0) {
            SparseArray<V> sparseArray = this.f161422b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            eh.a.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                eh.l<V> lVar = this.f161423c;
                SparseArray<V> sparseArray2 = this.f161422b;
                lVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f161422b.append(i10, v10);
    }

    public void c() {
        for (int i10 = 0; i10 < this.f161422b.size(); i10++) {
            this.f161423c.accept(this.f161422b.valueAt(i10));
        }
        this.f161421a = -1;
        this.f161422b.clear();
    }

    public void d(int i10) {
        for (int size = this.f161422b.size() - 1; size >= 0 && i10 < this.f161422b.keyAt(size); size--) {
            this.f161423c.accept(this.f161422b.valueAt(size));
            this.f161422b.removeAt(size);
        }
        this.f161421a = this.f161422b.size() > 0 ? Math.min(this.f161421a, this.f161422b.size() - 1) : -1;
    }

    public void e(int i10) {
        int i11 = 0;
        while (i11 < this.f161422b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f161422b.keyAt(i12)) {
                return;
            }
            this.f161423c.accept(this.f161422b.valueAt(i11));
            this.f161422b.removeAt(i11);
            int i13 = this.f161421a;
            if (i13 > 0) {
                this.f161421a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public V f(int i10) {
        if (this.f161421a == -1) {
            this.f161421a = 0;
        }
        while (true) {
            int i11 = this.f161421a;
            if (i11 <= 0 || i10 >= this.f161422b.keyAt(i11)) {
                break;
            }
            this.f161421a--;
        }
        while (this.f161421a < this.f161422b.size() - 1 && i10 >= this.f161422b.keyAt(this.f161421a + 1)) {
            this.f161421a++;
        }
        return this.f161422b.valueAt(this.f161421a);
    }

    public V g() {
        SparseArray<V> sparseArray = this.f161422b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean h() {
        return this.f161422b.size() == 0;
    }

    public q1(eh.l<V> lVar) {
        this.f161422b = new SparseArray<>();
        this.f161423c = lVar;
        this.f161421a = -1;
    }

    public static /* synthetic */ void a(Object obj) {
    }
}
