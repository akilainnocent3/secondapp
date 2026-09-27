package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f6647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f6648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f6649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f6650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f6651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f6652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6655k;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(21)
    public static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6650f;
        if (drawable != null && drawable.isStateful()) {
            this.f6650f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f6651g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f6651g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f6652h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f6652h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f6647c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6650f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f6651g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f6652h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f6648d = findViewById(m.a.g.f105690a);
        this.f6649e = findViewById(m.a.g.f105704h);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f6646b || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f6647c;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f6653i) {
            Drawable drawable2 = this.f6652h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = z12;
            }
        } else {
            if (this.f6650f != null) {
                if (this.f6648d.getVisibility() == 0) {
                    this.f6650f.setBounds(this.f6648d.getLeft(), this.f6648d.getTop(), this.f6648d.getRight(), this.f6648d.getBottom());
                } else {
                    View view2 = this.f6649e;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f6650f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f6650f.setBounds(this.f6649e.getLeft(), this.f6649e.getTop(), this.f6649e.getRight(), this.f6649e.getBottom());
                    }
                }
                z12 = true;
            }
            this.f6654j = z13;
            if (!z13 || (drawable = this.f6651g) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iA;
        int i12;
        if (this.f6648d == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f6655k) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f6648d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f6647c;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f6648d)) {
            iA = !b(this.f6649e) ? a(this.f6649e) : 0;
        } else {
            iA = a(this.f6648d);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f6647c), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f6650f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f6650f);
        }
        this.f6650f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f6648d;
            if (view != null) {
                this.f6650f.setBounds(view.getLeft(), this.f6648d.getTop(), this.f6648d.getRight(), this.f6648d.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f6653i ? !(this.f6650f != null || this.f6651g != null) : this.f6652h == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f6652h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f6652h);
        }
        this.f6652h = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f6653i && (drawable2 = this.f6652h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f6653i ? !(this.f6650f != null || this.f6651g != null) : this.f6652h == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f6651g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f6651g);
        }
        this.f6651g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f6654j && (drawable2 = this.f6651g) != null) {
                drawable2.setBounds(this.f6647c.getLeft(), this.f6647c.getTop(), this.f6647c.getRight(), this.f6647c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f6653i ? !(this.f6650f != null || this.f6651g != null) : this.f6652h == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(a2 a2Var) {
        View view = this.f6647c;
        if (view != null) {
            removeView(view);
        }
        this.f6647c = a2Var;
        if (a2Var != null) {
            addView(a2Var);
            ViewGroup.LayoutParams layoutParams = a2Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            a2Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f6646b = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f6650f;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f6651g;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f6652h;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        if (drawable == this.f6650f && !this.f6653i) {
            return true;
        }
        if (drawable == this.f6651g && this.f6654j) {
            return true;
        }
        return (drawable == this.f6652h && this.f6653i) || super.verifyDrawable(drawable);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.a.m.f105987a);
        this.f6650f = typedArrayObtainStyledAttributes.getDrawable(m.a.m.f105996b);
        this.f6651g = typedArrayObtainStyledAttributes.getDrawable(m.a.m.f106014d);
        this.f6655k = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.a.m.f106109o, -1);
        boolean z10 = true;
        if (getId() == m.a.g.f105709j0) {
            this.f6653i = true;
            this.f6652h = typedArrayObtainStyledAttributes.getDrawable(m.a.m.f106005c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f6653i ? this.f6650f != null || this.f6651g != null : this.f6652h != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
