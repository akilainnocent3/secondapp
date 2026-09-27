package androidx.leanback.widget;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12522d = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12523e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12524a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12525b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f0.f1<String, SparseArray<Parcelable>> f12526c;

    public static String e(int i10) {
        return Integer.toString(i10);
    }

    public final void a() {
        int i10 = this.f12524a;
        if (i10 == 2) {
            if (this.f12525b <= 0) {
                throw new IllegalArgumentException();
            }
            f0.f1<String, SparseArray<Parcelable>> f1Var = this.f12526c;
            if (f1Var == null || f1Var.maxSize() != this.f12525b) {
                this.f12526c = new f0.f1<>(this.f12525b);
                return;
            }
            return;
        }
        if (i10 != 3 && i10 != 1) {
            this.f12526c = null;
            return;
        }
        f0.f1<String, SparseArray<Parcelable>> f1Var2 = this.f12526c;
        if (f1Var2 == null || f1Var2.maxSize() != Integer.MAX_VALUE) {
            this.f12526c = new f0.f1<>(Integer.MAX_VALUE);
        }
    }

    public void b() {
        f0.f1<String, SparseArray<Parcelable>> f1Var = this.f12526c;
        if (f1Var != null) {
            f1Var.evictAll();
        }
    }

    public int c() {
        return this.f12525b;
    }

    public int d() {
        return this.f12524a;
    }

    public void f(Bundle bundle) {
        f0.f1<String, SparseArray<Parcelable>> f1Var = this.f12526c;
        if (f1Var == null || bundle == null) {
            return;
        }
        f1Var.evictAll();
        for (String str : bundle.keySet()) {
            this.f12526c.put(str, bundle.getSparseParcelableArray(str));
        }
    }

    public void g(View view, int i10) {
        if (this.f12526c != null) {
            SparseArray<Parcelable> sparseArrayRemove = this.f12526c.remove(e(i10));
            if (sparseArrayRemove != null) {
                view.restoreHierarchyState(sparseArrayRemove);
            }
        }
    }

    public void h(int i10) {
        f0.f1<String, SparseArray<Parcelable>> f1Var = this.f12526c;
        if (f1Var == null || f1Var.size() == 0) {
            return;
        }
        this.f12526c.remove(e(i10));
    }

    public Bundle i() {
        f0.f1<String, SparseArray<Parcelable>> f1Var = this.f12526c;
        if (f1Var == null || f1Var.size() == 0) {
            return null;
        }
        Map<String, SparseArray<Parcelable>> mapSnapshot = this.f12526c.snapshot();
        Bundle bundle = new Bundle();
        for (Map.Entry<String, SparseArray<Parcelable>> entry : mapSnapshot.entrySet()) {
            bundle.putSparseParcelableArray(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public void j(View view, int i10) {
        int i11 = this.f12524a;
        if (i11 == 1) {
            h(i10);
        } else if (i11 == 2 || i11 == 3) {
            l(view, i10);
        }
    }

    public Bundle k(Bundle bundle, View view, int i10) {
        if (this.f12524a != 0) {
            String strE = e(i10);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(strE, sparseArray);
        }
        return bundle;
    }

    public final void l(View view, int i10) {
        if (this.f12526c != null) {
            String strE = e(i10);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            this.f12526c.put(strE, sparseArray);
        }
    }

    public void m(int i10) {
        this.f12525b = i10;
        a();
    }

    public void n(int i10) {
        this.f12524a = i10;
        a();
    }
}
