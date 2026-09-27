package yads;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class f23 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iz f148948c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f148947b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f148946a = -1;

    public f23(iz izVar) {
        this.f148948c = izVar;
    }

    public final void a(int i10) {
        for (int size = this.f148947b.size() - 1; size >= 0 && i10 < this.f148947b.keyAt(size); size--) {
            this.f148948c.accept(this.f148947b.valueAt(size));
            this.f148947b.removeAt(size);
        }
        this.f148946a = this.f148947b.size() > 0 ? Math.min(this.f148946a, this.f148947b.size() - 1) : -1;
    }

    public final void b(int i10) {
        int i11 = 0;
        while (i11 < this.f148947b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f148947b.keyAt(i12)) {
                return;
            }
            this.f148948c.accept(this.f148947b.valueAt(i11));
            this.f148947b.removeAt(i11);
            int i13 = this.f148946a;
            if (i13 > 0) {
                this.f148946a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public final Object c(int i10) {
        if (this.f148946a == -1) {
            this.f148946a = 0;
        }
        while (true) {
            int i11 = this.f148946a;
            if (i11 <= 0 || i10 >= this.f148947b.keyAt(i11)) {
                break;
            }
            this.f148946a--;
        }
        while (this.f148946a < this.f148947b.size() - 1 && i10 >= this.f148947b.keyAt(this.f148946a + 1)) {
            this.f148946a++;
        }
        return this.f148947b.valueAt(this.f148946a);
    }
}
