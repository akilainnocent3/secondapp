package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public static int a(RecyclerView.z zVar, c0 c0Var, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.K() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(RecyclerView.o.U(view) - RecyclerView.o.U(view2)) + 1;
        }
        return Math.min(c0Var.l(), c0Var.b(view2) - c0Var.e(view));
    }

    public static int b(RecyclerView.z zVar, c0 c0Var, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.K() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (zVar.b() - Math.max(RecyclerView.o.U(view), RecyclerView.o.U(view2))) - 1) : Math.max(0, Math.min(RecyclerView.o.U(view), RecyclerView.o.U(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(c0Var.b(view2) - c0Var.e(view)) / (Math.abs(RecyclerView.o.U(view) - RecyclerView.o.U(view2)) + 1))) + (c0Var.k() - c0Var.e(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.z zVar, c0 c0Var, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.K() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zVar.b();
        }
        return (int) (((c0Var.b(view2) - c0Var.e(view)) / (Math.abs(RecyclerView.o.U(view) - RecyclerView.o.U(view2)) + 1)) * zVar.b());
    }
}
