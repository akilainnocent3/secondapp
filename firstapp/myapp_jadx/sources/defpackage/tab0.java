package defpackage;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class tab0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ kab0 a;

    public tab0(kab0 kab0Var) {
        this.a = kab0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        vk2 binding;
        ViewTreeObserver viewTreeObserver;
        vk2 binding2;
        kab0 kab0Var = this.a;
        fo80 fo80Var = kab0Var.c;
        RecyclerView.d0 d0VarK = (fo80Var == null || (binding2 = fo80Var.c.getBinding()) == null) ? null : binding2.b.K(0);
        if (d0VarK instanceof tk2.a) {
            ((tk2.a) d0VarK).a.e.performClick();
        }
        if (!kab0Var.w.isEmpty()) {
            double dDoubleValue = ((Number) CollectionsKt.q0(kab0Var.w).get(0)).doubleValue();
            if (dDoubleValue <= kab0Var.v) {
                kab0Var.j0(dDoubleValue);
            }
        }
        fo80 fo80Var2 = kab0Var.c;
        if (fo80Var2 == null || (binding = fo80Var2.c.getBinding()) == null || (viewTreeObserver = binding.b.getViewTreeObserver()) == null) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        return true;
    }
}
