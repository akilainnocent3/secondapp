package androidx.leanback.widget;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class o0 extends v<j0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f12820a = new o0();

    public static o0 f() {
        return f12820a;
    }

    @Override // androidx.leanback.widget.v
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(j0 j0Var, j0 j0Var2) {
        if (j0Var == null) {
            return j0Var2 == null;
        }
        return j0Var2 != null && j0Var.m() == j0Var2.m() && j0Var.f12684g == j0Var2.f12684g && TextUtils.equals(j0Var.w(), j0Var2.w()) && TextUtils.equals(j0Var.n(), j0Var2.n()) && j0Var.t() == j0Var2.t() && TextUtils.equals(j0Var.s(), j0Var2.s()) && TextUtils.equals(j0Var.q(), j0Var2.q()) && j0Var.r() == j0Var2.r() && j0Var.o() == j0Var2.o();
    }

    @Override // androidx.leanback.widget.v
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(j0 j0Var, j0 j0Var2) {
        if (j0Var == null) {
            return j0Var2 == null;
        }
        return j0Var2 != null && j0Var.c() == j0Var2.c();
    }
}
