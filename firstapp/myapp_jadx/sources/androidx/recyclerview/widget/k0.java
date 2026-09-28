package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends v {
    public final /* synthetic */ j0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j0 j0Var, Context context) {
        super(context);
        this.q = j0Var;
    }

    @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.y
    public final void f(View view, RecyclerView.y.a aVar) {
        j0 j0Var = this.q;
        RecyclerView recyclerView = j0Var.a;
        if (recyclerView == null) {
            return;
        }
        int[] iArrB = j0Var.b(recyclerView.getLayoutManager(), view);
        int i = iArrB[0];
        int i2 = iArrB[1];
        int iCeil = (int) Math.ceil(((double) l(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            aVar.b(i, i2, iCeil, this.j);
        }
    }

    @Override // androidx.recyclerview.widget.v
    public final float k(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
