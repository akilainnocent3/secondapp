package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import defpackage.ib5;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends RecyclerView.q {
    public RecyclerView a;
    public Scroller b;
    public final a c = new a();

    public class a extends RecyclerView.s {
        public boolean a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.a) {
                this.a = false;
                j0.this.f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.a = true;
        }
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a aVar = this.c;
        if (recyclerView2 != null) {
            recyclerView2.k0(aVar);
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                ib5.a("An instance of OnFlingListener already set.");
                return;
            }
            this.a.k(aVar);
            this.a.setOnFlingListener(this);
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    public abstract int[] b(RecyclerView.o oVar, View view);

    public RecyclerView.y c(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.y.b) {
            return new k0(this, this.a.getContext());
        }
        return null;
    }

    public abstract View d(RecyclerView.o oVar);

    public abstract int e(RecyclerView.o oVar, int i, int i2);

    public final void f() {
        RecyclerView.o layoutManager;
        View viewD;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewD = d(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewD);
        int i = iArrB[0];
        if (i == 0 && iArrB[1] == 0) {
            return;
        }
        this.a.q0(i, iArrB[1]);
    }
}
