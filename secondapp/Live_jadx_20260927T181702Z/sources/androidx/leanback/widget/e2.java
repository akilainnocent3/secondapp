package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class e2 extends q1<c> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f12464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView.OnScrollListener f12466h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View.OnLayoutChangeListener f12467i = new b();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends RecyclerView.OnScrollListener {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            e2.this.m();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            e2.this.m();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends q1.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f12473g;

        public c(String str, int i10) {
            super(str, i10);
        }

        public c k(int i10) {
            this.f12470d = i10;
            return this;
        }

        public c l(float f10) {
            this.f12473g = f10;
            return this;
        }

        public int m() {
            return this.f12470d;
        }

        public float n() {
            return this.f12473g;
        }

        public int o() {
            return this.f12472f;
        }

        public int p() {
            return this.f12471e;
        }

        public c q(int i10) {
            this.f12472f = i10;
            return this;
        }

        public void r(e2 e2Var) {
            RecyclerView recyclerView = e2Var.f12464f;
            RecyclerView.f0 f0VarFindViewHolderForAdapterPosition = recyclerView == null ? null : recyclerView.findViewHolderForAdapterPosition(this.f12470d);
            if (f0VarFindViewHolderForAdapterPosition == null) {
                if (recyclerView == null || recyclerView.getLayoutManager().getChildCount() == 0) {
                    e2Var.l(g(), Integer.MAX_VALUE);
                    return;
                } else if (recyclerView.findContainingViewHolder(recyclerView.getLayoutManager().getChildAt(0)).getAbsoluteAdapterPosition() < this.f12470d) {
                    e2Var.l(g(), Integer.MAX_VALUE);
                    return;
                } else {
                    e2Var.l(g(), Integer.MIN_VALUE);
                    return;
                }
            }
            View viewFindViewById = f0VarFindViewHolderForAdapterPosition.itemView.findViewById(this.f12471e);
            if (viewFindViewById == null) {
                return;
            }
            Rect rect = new Rect(0, 0, viewFindViewById.getWidth(), viewFindViewById.getHeight());
            recyclerView.offsetDescendantRectToMyCoords(viewFindViewById, rect);
            float translationX = 0.0f;
            float translationY = 0.0f;
            while (viewFindViewById != recyclerView && viewFindViewById != null) {
                if (viewFindViewById.getParent() != recyclerView || !recyclerView.isAnimating()) {
                    translationX += viewFindViewById.getTranslationX();
                    translationY += viewFindViewById.getTranslationY();
                }
                viewFindViewById = (View) viewFindViewById.getParent();
            }
            rect.offset((int) translationX, (int) translationY);
            if (e2Var.f12465g) {
                e2Var.l(g(), rect.top + this.f12472f + ((int) (this.f12473g * rect.height())));
            } else {
                e2Var.l(g(), rect.left + this.f12472f + ((int) (this.f12473g * rect.width())));
            }
        }

        public c s(int i10) {
            this.f12471e = i10;
            return this;
        }
    }

    @Override // androidx.leanback.widget.q1
    public float g() {
        RecyclerView recyclerView = this.f12464f;
        if (recyclerView == null) {
            return 0.0f;
        }
        return this.f12465g ? recyclerView.getHeight() : recyclerView.getWidth();
    }

    @Override // androidx.leanback.widget.q1
    public void m() {
        Iterator<c> it = h().iterator();
        while (it.hasNext()) {
            it.next().r(this);
        }
        super.m();
    }

    @Override // androidx.leanback.widget.q1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public c c(String str, int i10) {
        return new c(str, i10);
    }

    public RecyclerView q() {
        return this.f12464f;
    }

    public void r(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f12464f;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.f12466h);
            this.f12464f.removeOnLayoutChangeListener(this.f12467i);
        }
        this.f12464f = recyclerView;
        if (recyclerView != null) {
            recyclerView.getLayoutManager();
            this.f12465g = RecyclerView.p.getProperties(this.f12464f.getContext(), null, 0, 0).f18576a == 1;
            this.f12464f.addOnScrollListener(this.f12466h);
            this.f12464f.addOnLayoutChangeListener(this.f12467i);
        }
    }
}
