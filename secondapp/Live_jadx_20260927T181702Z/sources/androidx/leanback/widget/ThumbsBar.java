package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public class ThumbsBar extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray<Bitmap> f12260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12261i;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int e(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public final int a(int i10) {
        int iE = e(i10 - this.f12257e, this.f12255c + this.f12259g);
        if (iE < 2) {
            iE = 2;
        } else if ((iE & 1) != 0) {
            iE++;
        }
        return iE + 1;
    }

    public void b() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            h(i10, null);
        }
        this.f12260h.clear();
    }

    public View c(ViewGroup viewGroup) {
        return new ImageView(viewGroup.getContext());
    }

    public Bitmap d(int i10) {
        return this.f12260h.get(i10);
    }

    public void f(int i10, int i11) {
        boolean z10;
        this.f12258f = i11;
        this.f12257e = i10;
        int heroIndex = getHeroIndex();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (heroIndex == i12) {
                View childAt = getChildAt(i12);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                boolean z11 = true;
                if (layoutParams.height != i11) {
                    layoutParams.height = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (layoutParams.width != i10) {
                    layoutParams.width = i10;
                } else {
                    z11 = z10;
                }
                if (z11) {
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public final void g() {
        while (getChildCount() > this.f12254b) {
            removeView(getChildAt(getChildCount() - 1));
        }
        while (getChildCount() < this.f12254b) {
            addView(c(this), new LinearLayout.LayoutParams(this.f12255c, this.f12256d));
        }
        int heroIndex = getHeroIndex();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (heroIndex == i10) {
                layoutParams.width = this.f12257e;
                layoutParams.height = this.f12258f;
            } else {
                layoutParams.width = this.f12255c;
                layoutParams.height = this.f12256d;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    public void h(int i10, Bitmap bitmap) {
        this.f12260h.put(i10, bitmap);
        ((ImageView) getChildAt(i10)).setImageBitmap(bitmap);
    }

    public void i(int i10, int i11) {
        boolean z10;
        this.f12256d = i11;
        this.f12255c = i10;
        int heroIndex = getHeroIndex();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (heroIndex != i12) {
                View childAt = getChildAt(i12);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                boolean z11 = true;
                if (layoutParams.height != i11) {
                    layoutParams.height = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (layoutParams.width != i10) {
                    layoutParams.width = i10;
                } else {
                    z11 = z10;
                }
                if (z11) {
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int heroIndex = getHeroIndex();
        View childAt = getChildAt(heroIndex);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int width2 = (getWidth() / 2) + (childAt.getMeasuredWidth() / 2);
        childAt.layout(width, getPaddingTop(), width2, getPaddingTop() + childAt.getMeasuredHeight());
        int paddingTop = getPaddingTop() + (childAt.getMeasuredHeight() / 2);
        for (int i14 = heroIndex - 1; i14 >= 0; i14--) {
            int i15 = width - this.f12259g;
            View childAt2 = getChildAt(i14);
            childAt2.layout(i15 - childAt2.getMeasuredWidth(), paddingTop - (childAt2.getMeasuredHeight() / 2), i15, (childAt2.getMeasuredHeight() / 2) + paddingTop);
            width = i15 - childAt2.getMeasuredWidth();
        }
        while (true) {
            heroIndex++;
            if (heroIndex >= this.f12254b) {
                return;
            }
            int i16 = width2 + this.f12259g;
            View childAt3 = getChildAt(heroIndex);
            childAt3.layout(i16, paddingTop - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i16, (childAt3.getMeasuredHeight() / 2) + paddingTop);
            width2 = i16 + childAt3.getMeasuredWidth();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iA;
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        if (this.f12261i || this.f12254b == (iA = a(measuredWidth))) {
            return;
        }
        this.f12254b = iA;
        g();
    }

    public void setNumberOfThumbs(int i10) {
        this.f12261i = true;
        this.f12254b = i10;
        g();
    }

    public void setThumbSpace(int i10) {
        this.f12259g = i10;
        requestLayout();
    }

    public ThumbsBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12254b = -1;
        this.f12260h = new SparseArray<>();
        this.f12261i = false;
        this.f12255c = context.getResources().getDimensionPixelSize(s3.a.e.Y2);
        this.f12256d = context.getResources().getDimensionPixelSize(s3.a.e.W2);
        this.f12258f = context.getResources().getDimensionPixelSize(s3.a.e.O2);
        this.f12257e = context.getResources().getDimensionPixelSize(s3.a.e.N2);
        this.f12259g = context.getResources().getDimensionPixelSize(s3.a.e.X2);
    }
}
