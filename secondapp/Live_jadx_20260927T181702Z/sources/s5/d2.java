package s5;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d2<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f129131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<V> f129132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4.q<V> f129133c;

    public d2() {
        this(new x4.q() { // from class: s5.c2
            @Override // x4.q
            public final void accept(Object obj) {
                d2.a(obj);
            }
        });
    }

    public void b(int i10, V v10) {
        if (this.f129131a == -1) {
            zi.l0.g0(this.f129132b.size() == 0);
            this.f129131a = 0;
        }
        if (this.f129132b.size() > 0) {
            SparseArray<V> sparseArray = this.f129132b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zi.l0.d(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                x4.q<V> qVar = this.f129133c;
                SparseArray<V> sparseArray2 = this.f129132b;
                qVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f129132b.append(i10, v10);
    }

    public void c() {
        for (int i10 = 0; i10 < this.f129132b.size(); i10++) {
            this.f129133c.accept(this.f129132b.valueAt(i10));
        }
        this.f129131a = -1;
        this.f129132b.clear();
    }

    public void d(int i10) {
        for (int size = this.f129132b.size() - 1; size >= 0 && i10 < this.f129132b.keyAt(size); size--) {
            this.f129133c.accept(this.f129132b.valueAt(size));
            this.f129132b.removeAt(size);
        }
        this.f129131a = this.f129132b.size() > 0 ? Math.min(this.f129131a, this.f129132b.size() - 1) : -1;
    }

    public void e(int i10) {
        int i11 = 0;
        while (i11 < this.f129132b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f129132b.keyAt(i12)) {
                return;
            }
            this.f129133c.accept(this.f129132b.valueAt(i11));
            this.f129132b.removeAt(i11);
            int i13 = this.f129131a;
            if (i13 > 0) {
                this.f129131a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public V f(int i10) {
        if (this.f129131a == -1) {
            this.f129131a = 0;
        }
        while (true) {
            int i11 = this.f129131a;
            if (i11 <= 0 || i10 >= this.f129132b.keyAt(i11)) {
                break;
            }
            this.f129131a--;
        }
        while (this.f129131a < this.f129132b.size() - 1 && i10 >= this.f129132b.keyAt(this.f129131a + 1)) {
            this.f129131a++;
        }
        return this.f129132b.valueAt(this.f129131a);
    }

    public V g() {
        SparseArray<V> sparseArray = this.f129132b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean h() {
        return this.f129132b.size() == 0;
    }

    public d2(x4.q<V> qVar) {
        this.f129132b = new SparseArray<>();
        this.f129133c = qVar;
        this.f129131a = -1;
    }

    public static /* synthetic */ void a(Object obj) {
    }
}
