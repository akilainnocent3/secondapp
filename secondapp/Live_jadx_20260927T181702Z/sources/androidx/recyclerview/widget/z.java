package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f19104d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f19105e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f19106f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.p f19107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f19109c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends z {
        public a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.z
        public int d(View view) {
            return this.f19107a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f19107a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f19107a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int g(View view) {
            return this.f19107a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int h() {
            return this.f19107a.getWidth();
        }

        @Override // androidx.recyclerview.widget.z
        public int i() {
            return this.f19107a.getWidth() - this.f19107a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.z
        public int j() {
            return this.f19107a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.z
        public int l() {
            return this.f19107a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.z
        public int m() {
            return this.f19107a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.z
        public int n() {
            return this.f19107a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.z
        public int o() {
            return (this.f19107a.getWidth() - this.f19107a.getPaddingLeft()) - this.f19107a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.z
        public int q(View view) {
            this.f19107a.getTransformedBoundingBox(view, true, this.f19109c);
            return this.f19109c.right;
        }

        @Override // androidx.recyclerview.widget.z
        public int r(View view) {
            this.f19107a.getTransformedBoundingBox(view, true, this.f19109c);
            return this.f19109c.left;
        }

        @Override // androidx.recyclerview.widget.z
        public void s(View view, int i10) {
            view.offsetLeftAndRight(i10);
        }

        @Override // androidx.recyclerview.widget.z
        public void t(int i10) {
            this.f19107a.offsetChildrenHorizontal(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends z {
        public b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.z
        public int d(View view) {
            return this.f19107a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f19107a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f19107a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int g(View view) {
            return this.f19107a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int h() {
            return this.f19107a.getHeight();
        }

        @Override // androidx.recyclerview.widget.z
        public int i() {
            return this.f19107a.getHeight() - this.f19107a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.z
        public int j() {
            return this.f19107a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.z
        public int l() {
            return this.f19107a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.z
        public int m() {
            return this.f19107a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.z
        public int n() {
            return this.f19107a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.z
        public int o() {
            return (this.f19107a.getHeight() - this.f19107a.getPaddingTop()) - this.f19107a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.z
        public int q(View view) {
            this.f19107a.getTransformedBoundingBox(view, true, this.f19109c);
            return this.f19109c.bottom;
        }

        @Override // androidx.recyclerview.widget.z
        public int r(View view) {
            this.f19107a.getTransformedBoundingBox(view, true, this.f19109c);
            return this.f19109c.top;
        }

        @Override // androidx.recyclerview.widget.z
        public void s(View view, int i10) {
            view.offsetTopAndBottom(i10);
        }

        @Override // androidx.recyclerview.widget.z
        public void t(int i10) {
            this.f19107a.offsetChildrenVertical(i10);
        }
    }

    public /* synthetic */ z(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static z a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static z b(RecyclerView.p pVar, int i10) {
        if (i10 == 0) {
            return a(pVar);
        }
        if (i10 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static z c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.p k() {
        return this.f19107a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.f19108b) {
            return 0;
        }
        return o() - this.f19108b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(View view, int i10);

    public abstract void t(int i10);

    public void u() {
        this.f19108b = o();
    }

    public z(RecyclerView.p pVar) {
        this.f19108b = Integer.MIN_VALUE;
        this.f19109c = new Rect();
        this.f19107a = pVar;
    }
}
