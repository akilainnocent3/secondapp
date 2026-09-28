package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class eug0 extends h8j0.b {
    public final View c;
    public final NestedScrollView d;

    public eug0(View view, NestedScrollView nestedScrollView) {
        super(1);
        this.c = view;
        this.d = nestedScrollView;
    }

    @Override // h8j0.b
    public final l8j0 d(l8j0 l8j0Var, List<h8j0> list) {
        l8j0Var.getClass();
        list.getClass();
        l8j0.l lVar = l8j0Var.a;
        int iMax = Math.max(lVar.g(8).d - lVar.g(2).d, 0);
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = iMax;
        }
        this.d.scrollTo(0, iMax);
        return l8j0Var;
    }

    @Override // h8j0.b
    public final h8j0.a e(h8j0 h8j0Var, h8j0.a aVar) {
        return aVar;
    }

    @Override // h8j0.b
    public final void a(h8j0 h8j0Var) {
    }

    @Override // h8j0.b
    public final void c(h8j0 h8j0Var) {
    }
}
