package com.startapp.sdk.ads.list3d;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.startapp.sdk.internal.nb;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.t6;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"ViewConstructor"})
public class List3DView extends AdapterView<Adapter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Adapter f74105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f74106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f74107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f74108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f74109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f74110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f74111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f74112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f74113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f74114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private VelocityTracker f74115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected t6 f74116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f74117m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinkedList f74118n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d f74119o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Rect f74120p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Camera f74121q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Matrix f74122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Paint f74123s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f74124t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f74125u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f74126v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f74127w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f74128x;

    public List3DView(List3DActivity list3DActivity) {
        super(list3DActivity, null);
        this.f74106b = 0;
        this.f74118n = new LinkedList();
        this.f74124t = Integer.MIN_VALUE;
        this.f74125u = false;
        this.f74126v = false;
        this.f74127w = false;
        this.f74128x = false;
    }

    private void a(Canvas canvas, Bitmap bitmap, int i10, int i11, int i12, int i13, float f10, float f11) {
        if (this.f74121q == null) {
            this.f74121q = new Camera();
        }
        this.f74121q.save();
        this.f74121q.translate(0.0f, 0.0f, i13);
        this.f74121q.rotateX(f11);
        float f12 = -i13;
        this.f74121q.translate(0.0f, 0.0f, f12);
        if (this.f74122r == null) {
            this.f74122r = new Matrix();
        }
        this.f74121q.getMatrix(this.f74122r);
        this.f74121q.restore();
        this.f74122r.preTranslate(-i12, f12);
        this.f74122r.postScale(f10, f10);
        this.f74122r.postTranslate(i11 + i12, i10 + i13);
        if (this.f74123s == null) {
            Paint paint = new Paint();
            this.f74123s = paint;
            paint.setAntiAlias(true);
            this.f74123s.setFilterBitmap(true);
        }
        Paint paint2 = this.f74123s;
        double dCos = Math.cos((((double) f11) * 3.141592653589793d) / 180.0d);
        int i14 = ((int) (dCos * 200.0d)) + 55;
        int iPow = (int) (Math.pow(dCos, 200.0d) * 70.0d);
        if (i14 > 255) {
            i14 = 255;
        }
        if (iPow > 255) {
            iPow = 255;
        }
        paint2.setColorFilter(new LightingColorFilter(Color.rgb(i14, i14, i14), Color.rgb(iPow, iPow, iPow)));
        canvas.drawBitmap(bitmap, this.f74122r, this.f74123s);
    }

    public final void b(int i10) {
        int height;
        int i11 = this.f74109e + i10;
        this.f74110f = i11;
        int height2 = (-(i11 * com.google.android.material.bottomappbar.d.f50281j)) / getHeight();
        this.f74112h = height2;
        int i12 = height2 % 90;
        if (i12 < 45) {
            height = (getHeight() * (-(height2 - i12))) / com.google.android.material.bottomappbar.d.f50281j;
        } else {
            height = (getHeight() * (-((height2 + 90) - i12))) / com.google.android.material.bottomappbar.d.f50281j;
        }
        if (this.f74124t == Integer.MIN_VALUE && this.f74114j == this.f74105a.getCount() - 1) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt.getBottom() + ((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) < getHeight()) {
                this.f74124t = height;
            }
        }
        if (height > 0) {
            height = 0;
        } else {
            int i13 = this.f74124t;
            if (height < i13) {
                height = i13;
            }
        }
        t6 t6Var = this.f74116l;
        float f10 = height;
        t6Var.f75535c = f10;
        t6Var.f75536d = f10;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return super.drawChild(canvas, view, j10);
        }
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float height2 = getHeight() / 2;
        float f10 = ((top + height) - height2) / height2;
        float fCos = (float) (1.0d - ((1.0d - Math.cos(f10)) * 0.15000000596046448d));
        float f11 = (this.f74112h - (f10 * 20.0f)) % 90.0f;
        if (f11 < 0.0f) {
            f11 += 90.0f;
        }
        if (f11 < 45.0f) {
            a(canvas, drawingCache, top, left, width, height, fCos, f11 - 90.0f);
            a(canvas, drawingCache, top, left, width, height, fCos, f11);
            return false;
        }
        float f12 = f11;
        a(canvas, drawingCache, top, left, width, height, fCos, f12);
        a(canvas, drawingCache, top, left, width, height, fCos, f12 - 90.0f);
        return false;
    }

    @Override // android.widget.AdapterView
    public final Adapter getAdapter() {
        return this.f74105a;
    }

    @Override // android.widget.AdapterView
    public final View getSelectedView() {
        return null;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f74117m);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f74125u || this.f74105a == null) {
            return;
        }
        if (getChildCount() == 0) {
            if (this.f74127w) {
                this.f74110f = getHeight() / 3;
            }
            this.f74114j = -1;
            int measuredHeight = this.f74110f;
            while (measuredHeight < getHeight() && this.f74114j < this.f74105a.getCount() - 1) {
                int i15 = this.f74114j + 1;
                this.f74114j = i15;
                View view = this.f74105a.getView(i15, this.f74118n.size() != 0 ? (View) this.f74118n.removeFirst() : null, this);
                a(view, 0);
                measuredHeight += (((int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view.getMeasuredHeight();
            }
        } else {
            int iA = (this.f74110f + this.f74111g) - a(getChildAt(0));
            int childCount = getChildCount();
            if (this.f74114j != this.f74105a.getCount() - 1 && childCount > 1) {
                View childAt = getChildAt(0);
                while (childAt != null && childAt.getBottom() + ((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) + iA < 0) {
                    removeViewInLayout(childAt);
                    childCount--;
                    this.f74118n.addLast(childAt);
                    this.f74113i++;
                    this.f74111g = (((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + childAt.getMeasuredHeight() + this.f74111g;
                    childAt = childCount > 1 ? getChildAt(0) : null;
                }
            }
            if (this.f74113i != 0 && childCount > 1) {
                View childAt2 = getChildAt(childCount - 1);
                while (childAt2 != null && a(childAt2) + iA > getHeight()) {
                    removeViewInLayout(childAt2);
                    int i16 = childCount - 1;
                    this.f74118n.addLast(childAt2);
                    this.f74114j--;
                    childAt2 = i16 > 1 ? getChildAt(childCount - 2) : null;
                    childCount = i16;
                }
            }
            View childAt3 = getChildAt(getChildCount() - 1);
            int bottom = childAt3.getBottom();
            int measuredHeight2 = (int) ((childAt3.getMeasuredHeight() * 0.35000002f) / 2.0f);
            while (true) {
                bottom += measuredHeight2;
                if (bottom + iA >= getHeight() || this.f74114j >= this.f74105a.getCount() - 1) {
                    break;
                }
                int i17 = this.f74114j + 1;
                this.f74114j = i17;
                View view2 = this.f74105a.getView(i17, this.f74118n.size() != 0 ? (View) this.f74118n.removeFirst() : null, this);
                a(view2, 0);
                measuredHeight2 = (((int) ((view2.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view2.getMeasuredHeight();
            }
            int iA2 = a(getChildAt(0));
            while (iA2 + iA > 0 && (i14 = this.f74113i) > 0) {
                int i18 = i14 - 1;
                this.f74113i = i18;
                View view3 = this.f74105a.getView(i18, this.f74118n.size() != 0 ? (View) this.f74118n.removeFirst() : null, this);
                a(view3, 1);
                int measuredHeight3 = (((int) ((view3.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view3.getMeasuredHeight();
                iA2 -= measuredHeight3;
                this.f74111g -= measuredHeight3;
            }
        }
        int i19 = this.f74110f + this.f74111g;
        float width = getWidth() * 0.0f;
        float height = 1.0f / (getHeight() * 0.9f);
        for (int i20 = 0; i20 < getChildCount(); i20++) {
            View childAt4 = getChildAt(i20);
            int iSin = (int) (Math.sin(((double) height) * 6.283185307179586d * ((double) i19)) * ((double) width));
            int measuredWidth = childAt4.getMeasuredWidth();
            int measuredHeight4 = childAt4.getMeasuredHeight();
            int width2 = ((getWidth() - measuredWidth) / 2) + iSin;
            int measuredHeight5 = (int) ((childAt4.getMeasuredHeight() * 0.35000002f) / 2.0f);
            int i21 = i19 + measuredHeight5;
            childAt4.layout(width2, i21, measuredWidth + width2, i21 + measuredHeight4);
            i19 += (measuredHeight5 * 2) + measuredHeight4;
        }
        if (this.f74127w && !this.f74128x) {
            this.f74128x = true;
            dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, 0.0f, 0.0f, 0));
            postDelayed(new nb(this), 5L);
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            float yVelocity = 0.0f;
            if (action == 1) {
                int i10 = this.f74106b;
                if (i10 == 1) {
                    int iA = a((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (iA != -1) {
                        View childAt = getChildAt(iA);
                        int i11 = this.f74113i + iA;
                        performItemClick(childAt, i11, this.f74105a.getItemId(i11));
                    }
                } else if (i10 == 2) {
                    this.f74115k.addMovement(motionEvent);
                    this.f74115k.computeCurrentVelocity(1000);
                    yVelocity = this.f74115k.getYVelocity();
                }
                a(yVelocity);
            } else if (action != 2) {
                a(0.0f);
            } else {
                if (this.f74106b == 1) {
                    int x10 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    int i12 = this.f74107c;
                    if (x10 < i12 - 10 || x10 > i12 + 10) {
                        removeCallbacks(this.f74119o);
                        this.f74106b = 2;
                    } else {
                        int i13 = this.f74108d;
                        if (y10 < i13 - 10 || y10 > i13 + 10) {
                            removeCallbacks(this.f74119o);
                            this.f74106b = 2;
                        }
                    }
                }
                if (this.f74106b == 2) {
                    this.f74115k.addMovement(motionEvent);
                    b(((int) motionEvent.getY()) - this.f74108d);
                }
            }
        } else {
            p0.a(this);
            removeCallbacks(this.f74117m);
            this.f74107c = (int) motionEvent.getX();
            this.f74108d = (int) motionEvent.getY();
            this.f74109e = a(getChildAt(0)) - this.f74111g;
            if (this.f74119o == null) {
                this.f74119o = new d(this);
            }
            postDelayed(this.f74119o, ViewConfiguration.getLongPressTimeout());
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f74115k = velocityTrackerObtain;
            velocityTrackerObtain.addMovement(motionEvent);
            this.f74106b = 1;
        }
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(Adapter adapter) {
        if (this.f74126v) {
            setAlpha(0.0f);
        }
        this.f74105a = adapter;
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setDynamics(t6 t6Var) {
        t6 t6Var2 = this.f74116l;
        if (t6Var2 != null) {
            float f10 = t6Var2.f75533a;
            float f11 = t6Var2.f75534b;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            t6Var.f75534b = f11;
            t6Var.f75533a = f10;
            t6Var.f75537e = jCurrentAnimationTimeMillis;
        }
        this.f74116l = t6Var;
    }

    public void setFade(boolean z10) {
        this.f74126v = z10;
    }

    public void setHint(boolean z10) {
        this.f74127w = z10;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i10) {
        throw new UnsupportedOperationException();
    }

    public void setStarted() {
        this.f74125u = true;
    }

    private void a(float f10) {
        VelocityTracker velocityTracker = this.f74115k;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.f74115k = null;
        removeCallbacks(this.f74119o);
        if (this.f74117m == null) {
            this.f74117m = new c(this);
        }
        t6 t6Var = this.f74116l;
        if (t6Var != null) {
            float f11 = this.f74110f;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            t6Var.f75534b = f10;
            t6Var.f75533a = f11;
            t6Var.f75537e = jCurrentAnimationTimeMillis;
            post(this.f74117m);
        }
        this.f74106b = 0;
    }

    public final int a(int i10, int i11) {
        if (this.f74120p == null) {
            this.f74120p = new Rect();
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).getHitRect(this.f74120p);
            if (this.f74120p.contains(i10, i11)) {
                return i12;
            }
        }
        return -1;
    }

    public final void a(int i10) {
        View childAt = getChildAt(i10);
        int i11 = this.f74113i + i10;
        long itemId = this.f74105a.getItemId(i11);
        AdapterView.OnItemLongClickListener onItemLongClickListener = getOnItemLongClickListener();
        if (onItemLongClickListener != null) {
            onItemLongClickListener.onItemLongClick(this, childAt, i11, itemId);
        }
    }

    private void a(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i11 = i10 == 1 ? 0 : -1;
        view.setDrawingCacheEnabled(true);
        addViewInLayout(view, i11, layoutParams, true);
        view.measure(((int) (getWidth() * 0.85f)) | 1073741824, 0);
    }

    public static int a(View view) {
        return view.getTop() - ((int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f));
    }
}
