package androidx.leanback.widget;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class u2 extends i1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray<Object> f13089e;

    public u2(b2 b2Var) {
        super(b2Var);
        this.f13089e = new SparseArray<>();
    }

    public void A(int i10, int i11) {
        j(i10, i11);
    }

    public void B(int i10, Object obj) {
        int iIndexOfKey = this.f13089e.indexOfKey(i10);
        if (iIndexOfKey < 0) {
            this.f13089e.append(i10, obj);
            l(this.f13089e.indexOfKey(i10), 1);
        } else if (this.f13089e.valueAt(iIndexOfKey) != obj) {
            this.f13089e.setValueAt(iIndexOfKey, obj);
            j(iIndexOfKey, 1);
        }
    }

    @Override // androidx.leanback.widget.i1
    public Object a(int i10) {
        return this.f13089e.valueAt(i10);
    }

    @Override // androidx.leanback.widget.i1
    public boolean g() {
        return true;
    }

    @Override // androidx.leanback.widget.i1
    public int s() {
        return this.f13089e.size();
    }

    public void v() {
        int size = this.f13089e.size();
        if (size == 0) {
            return;
        }
        this.f13089e.clear();
        m(0, size);
    }

    public void w(int i10) {
        int iIndexOfKey = this.f13089e.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            this.f13089e.removeAt(iIndexOfKey);
            m(iIndexOfKey, 1);
        }
    }

    public int x(int i10) {
        return this.f13089e.indexOfKey(i10);
    }

    public int y(Object obj) {
        return this.f13089e.indexOfValue(obj);
    }

    public Object z(int i10) {
        return this.f13089e.get(i10);
    }

    public u2(a2 a2Var) {
        super(a2Var);
        this.f13089e = new SparseArray<>();
    }

    public u2() {
        this.f13089e = new SparseArray<>();
    }
}
