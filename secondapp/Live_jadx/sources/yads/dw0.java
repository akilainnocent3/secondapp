package yads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f148382a;

    public dw0(SparseBooleanArray sparseBooleanArray) {
        this.f148382a = sparseBooleanArray;
    }

    public final int a(int i10) {
        ni.a(i10, this.f148382a.size());
        return this.f148382a.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw0)) {
            return false;
        }
        dw0 dw0Var = (dw0) obj;
        if (ib3.f150516a >= 24) {
            return this.f148382a.equals(dw0Var.f148382a);
        }
        if (this.f148382a.size() != dw0Var.f148382a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f148382a.size(); i10++) {
            if (a(i10) != dw0Var.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (ib3.f150516a >= 24) {
            return this.f148382a.hashCode();
        }
        int size = this.f148382a.size();
        for (int i10 = 0; i10 < this.f148382a.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }

    public final int a() {
        return this.f148382a.size();
    }
}
