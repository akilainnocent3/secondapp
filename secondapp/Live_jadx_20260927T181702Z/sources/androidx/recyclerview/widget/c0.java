package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c0 {
    public static int a(RecyclerView.b0 b0Var, z zVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.getChildCount() == 0 || b0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1;
        }
        return Math.min(zVar.o(), zVar.d(view2) - zVar.g(view));
    }

    public static int b(RecyclerView.b0 b0Var, z zVar, View view, View view2, RecyclerView.p pVar, boolean z10, boolean z11) {
        if (pVar.getChildCount() == 0 || b0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (b0Var.d() - Math.max(pVar.getPosition(view), pVar.getPosition(view2))) - 1) : Math.max(0, Math.min(pVar.getPosition(view), pVar.getPosition(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(zVar.d(view2) - zVar.g(view)) / (Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1))) + (zVar.n() - zVar.g(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.b0 b0Var, z zVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.getChildCount() == 0 || b0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return b0Var.d();
        }
        return (int) (((zVar.d(view2) - zVar.g(view)) / (Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1)) * b0Var.d());
    }
}
