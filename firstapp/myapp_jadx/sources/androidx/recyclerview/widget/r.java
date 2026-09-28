package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import com.sportybet.android.gp.tz.R;
import defpackage.g9i0;
import defpackage.hb5;
import defpackage.hxa;
import defpackage.j3p;
import defpackage.k3p;
import defpackage.r6i0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r extends RecyclerView.n implements RecyclerView.p {
    public Rect A;
    public long B;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final d m;
    public int o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public GestureDetector x;
    public e y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public RecyclerView.d0 c = null;
    public int l = -1;
    public int n = 0;
    public final ArrayList p = new ArrayList();
    public final a s = new a();
    public View w = null;
    public final b z = new b();

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0079  */
        /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
        @Override // java.lang.Runnable
        public final void run() {
            int iInterpolateOutOfBoundsScroll;
            int iInterpolateOutOfBoundsScroll2;
            r rVar = r.this;
            if (rVar.c != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = rVar.B;
                long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
                RecyclerView.o layoutManager = rVar.r.getLayoutManager();
                Rect rect = rVar.A;
                if (rect == null) {
                    rect = new Rect();
                    rVar.A = rect;
                }
                layoutManager.r(rect, rVar.c.itemView);
                if (layoutManager.s()) {
                    int i = (int) (rVar.j + rVar.h);
                    int paddingLeft = (i - rVar.A.left) - rVar.r.getPaddingLeft();
                    float f = rVar.h;
                    if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((rVar.c.itemView.getWidth() + i) + rVar.A.right) - (rVar.r.getWidth() - rVar.r.getPaddingRight())) <= 0)) {
                        iInterpolateOutOfBoundsScroll = 0;
                    } else {
                        iInterpolateOutOfBoundsScroll = paddingLeft;
                    }
                } else {
                    iInterpolateOutOfBoundsScroll = 0;
                }
                if (layoutManager.t()) {
                    int i2 = (int) (rVar.k + rVar.i);
                    iInterpolateOutOfBoundsScroll2 = (i2 - rVar.A.top) - rVar.r.getPaddingTop();
                    float f2 = rVar.i;
                    if ((f2 >= 0.0f || iInterpolateOutOfBoundsScroll2 >= 0) && (f2 <= 0.0f || (iInterpolateOutOfBoundsScroll2 = ((rVar.c.itemView.getHeight() + i2) + rVar.A.bottom) - (rVar.r.getHeight() - rVar.r.getPaddingBottom())) <= 0)) {
                        iInterpolateOutOfBoundsScroll2 = 0;
                    }
                } else {
                    iInterpolateOutOfBoundsScroll2 = 0;
                }
                if (iInterpolateOutOfBoundsScroll != 0) {
                    iInterpolateOutOfBoundsScroll = rVar.m.interpolateOutOfBoundsScroll(rVar.r, rVar.c.itemView.getWidth(), iInterpolateOutOfBoundsScroll, rVar.r.getWidth(), j2);
                }
                int i3 = iInterpolateOutOfBoundsScroll;
                if (iInterpolateOutOfBoundsScroll2 != 0) {
                    iInterpolateOutOfBoundsScroll2 = rVar.m.interpolateOutOfBoundsScroll(rVar.r, rVar.c.itemView.getHeight(), iInterpolateOutOfBoundsScroll2, rVar.r.getHeight(), j2);
                }
                if (i3 == 0 && iInterpolateOutOfBoundsScroll2 == 0) {
                    rVar.B = Long.MIN_VALUE;
                    return;
                }
                if (rVar.B == Long.MIN_VALUE) {
                    rVar.B = jCurrentTimeMillis;
                }
                rVar.r.scrollBy(i3, iInterpolateOutOfBoundsScroll2);
                RecyclerView.d0 d0Var = rVar.c;
                if (d0Var != null) {
                    rVar.r(d0Var);
                }
                rVar.r.removeCallbacks(rVar.s);
                RecyclerView recyclerView = rVar.r;
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    public class b implements RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            r rVar = r.this;
            a aVar = rVar.s;
            rVar.x.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = rVar.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (rVar.l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(rVar.l);
            if (iFindPointerIndex >= 0) {
                rVar.l(actionMasked, iFindPointerIndex, motionEvent);
            }
            RecyclerView.d0 d0Var = rVar.c;
            if (d0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        rVar.u(rVar.o, iFindPointerIndex, motionEvent);
                        rVar.r(d0Var);
                        rVar.r.removeCallbacks(aVar);
                        aVar.run();
                        rVar.r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == rVar.l) {
                        rVar.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        rVar.u(rVar.o, actionIndex, motionEvent);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = rVar.t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            rVar.s(null, 0);
            rVar.l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            r rVar = r.this;
            rVar.x.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                rVar.l = motionEvent.getPointerId(0);
                rVar.d = motionEvent.getX();
                rVar.e = motionEvent.getY();
                VelocityTracker velocityTracker = rVar.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                rVar.t = VelocityTracker.obtain();
                if (rVar.c == null) {
                    ArrayList arrayList = rVar.p;
                    if (!arrayList.isEmpty()) {
                        View viewO = rVar.o(motionEvent);
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            f fVar2 = (f) arrayList.get(size);
                            if (fVar2.e.itemView == viewO) {
                                fVar = fVar2;
                                break;
                            }
                        }
                    }
                    if (fVar != null) {
                        RecyclerView.d0 d0Var = fVar.e;
                        rVar.d -= fVar.w;
                        rVar.e -= fVar.y;
                        rVar.n(d0Var, true);
                        if (rVar.a.remove(d0Var.itemView)) {
                            rVar.m.clearView(rVar.r, d0Var);
                        }
                        rVar.s(d0Var, fVar.f);
                        rVar.u(rVar.o, 0, motionEvent);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                rVar.l = -1;
                rVar.s(null, 0);
            } else {
                int i = rVar.l;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    rVar.l(actionMasked, iFindPointerIndex, motionEvent);
                }
            }
            VelocityTracker velocityTracker2 = rVar.t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return rVar.c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void e(boolean z) {
            if (z) {
                r.this.s(null, 0);
            }
        }
    }

    public class c extends f {
        public final /* synthetic */ int C;
        public final /* synthetic */ RecyclerView.d0 D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.d0 d0Var, int i, float f, float f2, float f3, float f4, int i2, RecyclerView.d0 d0Var2) {
            super(d0Var, i, f, f2, f3, f4);
            this.C = i2;
            this.D = d0Var2;
        }

        @Override // androidx.recyclerview.widget.r.f, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.z) {
                return;
            }
            int i = this.C;
            RecyclerView.d0 d0Var = this.D;
            r rVar = r.this;
            if (i <= 0) {
                rVar.m.clearView(rVar.r, d0Var);
            } else {
                rVar.a.add(d0Var.itemView);
                this.v = true;
                if (i > 0) {
                    rVar.r.post(new s(rVar, this, i));
                }
            }
            View view = rVar.w;
            View view2 = d0Var.itemView;
            if (view == view2 && view2 == view) {
                rVar.w = null;
            }
        }
    }

    public static abstract class d {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new a();
        private static final Interpolator sDragViewScrollCapInterpolator = new b();
        private int mCachedMaxScrollSpeed = -1;

        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & ABS_HORIZONTAL_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i5 | i3;
        }

        public static j3p getDefaultUIUtil() {
            return k3p.a;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            int i = this.mCachedMaxScrollSpeed;
            if (i != -1) {
                return i;
            }
            int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.mCachedMaxScrollSpeed = dimensionPixelSize;
            return dimensionPixelSize;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag(0, i2 | i);
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            return true;
        }

        public RecyclerView.d0 chooseDropTarget(RecyclerView.d0 d0Var, List<RecyclerView.d0> list, int i, int i2) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = d0Var.itemView.getWidth() + i;
            int height = d0Var.itemView.getHeight() + i2;
            int left2 = i - d0Var.itemView.getLeft();
            int top2 = i2 - d0Var.itemView.getTop();
            int size = list.size();
            RecyclerView.d0 d0Var2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.d0 d0Var3 = list.get(i4);
                if (left2 > 0 && (right = d0Var3.itemView.getRight() - width) < 0 && d0Var3.itemView.getRight() > d0Var.itemView.getRight() && (iAbs4 = Math.abs(right)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = iAbs4;
                }
                if (left2 < 0 && (left = d0Var3.itemView.getLeft() - i) > 0 && d0Var3.itemView.getLeft() < d0Var.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = iAbs3;
                }
                if (top2 < 0 && (top = d0Var3.itemView.getTop() - i2) > 0 && d0Var3.itemView.getTop() < d0Var.itemView.getTop() && (iAbs2 = Math.abs(top)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = iAbs2;
                }
                if (top2 > 0 && (bottom = d0Var3.itemView.getBottom() - height) < 0 && d0Var3.itemView.getBottom() > d0Var.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = iAbs;
                }
            }
            return d0Var2;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            View view = d0Var.itemView;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float fFloatValue = ((Float) tag).floatValue();
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                r6i0.d.l(view, fFloatValue);
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & RELATIVE_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (RELATIVE_DIR_FLAGS & i6) >> 2;
            }
            return i3 | i5;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, d0Var), recyclerView.getLayoutDirection());
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200L : 250L;
            }
            return i == 8 ? itemAnimator.e : itemAnimator.d;
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.d0 d0Var) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.d0 d0Var);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(RecyclerView.d0 d0Var) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return (getAbsoluteMovementFlags(recyclerView, d0Var) & 16711680) != 0;
        }

        public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return (getAbsoluteMovementFlags(recyclerView, d0Var) & 65280) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int interpolation = (int) (sDragScrollInterpolator.getInterpolation(j <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS ? j / 2000.0f : 1.0f) * ((int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * getMaxDragScroll(recyclerView))));
            if (interpolation == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return interpolation;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
            View view = d0Var.itemView;
            if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                Float fValueOf = Float.valueOf(r6i0.d.e(view));
                int childCount = recyclerView.getChildCount();
                float f3 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                        float fE = r6i0.d.e(childAt);
                        if (fE > f3) {
                            f3 = fE;
                        }
                    }
                }
                r6i0.d.l(view, f3 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
            View view = d0Var.itemView;
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, List<f> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = list.get(i2);
                RecyclerView.d0 d0Var2 = fVar.e;
                float f3 = fVar.a;
                float f4 = fVar.c;
                if (f3 == f4) {
                    fVar.w = d0Var2.itemView.getTranslationX();
                } else {
                    fVar.w = hxa.a(f4, f3, fVar.B, f3);
                }
                float f5 = fVar.b;
                float f6 = fVar.d;
                if (f5 == f6) {
                    fVar.y = d0Var2.itemView.getTranslationY();
                } else {
                    fVar.y = hxa.a(f6, f5, fVar.B, f5);
                }
                int iSave = canvas.save();
                onChildDraw(canvas, recyclerView, fVar.e, fVar.w, fVar.y, fVar.f, false);
                canvas.restoreToCount(iSave);
            }
            if (d0Var != null) {
                int iSave2 = canvas.save();
                onChildDraw(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, List<f> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = list.get(i2);
                int iSave = canvas.save();
                onChildDrawOver(canvas, recyclerView, fVar.e, fVar.w, fVar.y, fVar.f, false);
                canvas.restoreToCount(iSave);
            }
            if (d0Var != null) {
                int iSave2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                f fVar2 = list.get(i3);
                boolean z2 = fVar2.A;
                if (z2 && !fVar2.v) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(RecyclerView recyclerView, RecyclerView.d0 d0Var, int i, RecyclerView.d0 d0Var2, int i2, int i3, int i4) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).h(d0Var.itemView, d0Var2.itemView);
                return;
            }
            if (layoutManager.s()) {
                if (RecyclerView.o.P(d0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.o0(i2);
                }
                if (RecyclerView.o.S(d0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.o0(i2);
                }
            }
            if (layoutManager.t()) {
                if (RecyclerView.o.T(d0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.o0(i2);
                }
                if (RecyclerView.o.N(d0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.o0(i2);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.d0 d0Var, int i) {
        }

        public abstract void onSwiped(RecyclerView.d0 d0Var, int i);
    }

    public class e extends GestureDetector.SimpleOnGestureListener {
        public boolean a = true;

        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            View viewO;
            RecyclerView.d0 d0VarQ;
            r rVar = r.this;
            d dVar = rVar.m;
            if (this.a && (viewO = rVar.o(motionEvent)) != null && (d0VarQ = rVar.r.Q(viewO)) != null && dVar.hasDragFlag(rVar.r, d0VarQ)) {
                int pointerId = motionEvent.getPointerId(0);
                int i = rVar.l;
                if (pointerId == i) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    rVar.d = x;
                    rVar.e = y;
                    rVar.i = 0.0f;
                    rVar.h = 0.0f;
                    if (dVar.isLongPressDragEnabled()) {
                        rVar.s(d0VarQ, 2);
                    }
                }
            }
        }
    }

    public static class f implements Animator.AnimatorListener {
        public float B;
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final RecyclerView.d0 e;
        public final int f;
        public final ValueAnimator i;
        public boolean v;
        public float w;
        public float y;
        public boolean z = false;
        public boolean A = false;

        public f(RecyclerView.d0 d0Var, int i, float f, float f2, float f3, float f4) {
            this.f = i;
            this.e = d0Var;
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.i = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new t(this));
            valueAnimatorOfFloat.setTarget(d0Var.itemView);
            valueAnimatorOfFloat.addListener(this);
            this.B = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.B = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.A) {
                this.e.setIsRecyclable(true);
            }
            this.A = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static abstract class g extends d {
        public final int a;
        public final int b;

        public g(int i, int i2) {
            this.a = i2;
            this.b = i;
        }

        @Override // androidx.recyclerview.widget.r.d
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return d.makeMovementFlags(this.b, this.a);
        }
    }

    public interface h {
        void h(View view, View view2);
    }

    public r(d dVar) {
        this.m = dVar;
    }

    public static boolean q(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void b(View view) {
        if (view == this.w) {
            this.w = null;
        }
        RecyclerView.d0 d0VarQ = this.r.Q(view);
        if (d0VarQ == null) {
            return;
        }
        RecyclerView.d0 d0Var = this.c;
        if (d0Var != null && d0VarQ == d0Var) {
            s(null, 0);
            return;
        }
        n(d0VarQ, false);
        if (this.a.remove(d0VarQ.itemView)) {
            this.m.clearView(this.r, d0VarQ);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        float f2;
        float f3;
        if (this.c != null) {
            float[] fArr = this.b;
            p(fArr);
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.m.onDraw(canvas, recyclerView, this.c, this.p, this.n, f2, f3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        float f2;
        float f3;
        if (this.c != null) {
            float[] fArr = this.b;
            p(fArr);
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.m.onDrawOver(canvas, recyclerView, this.c, this.p, this.n, f2, f3);
    }

    public final void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        b bVar = this.z;
        if (recyclerView2 != null) {
            recyclerView2.j0(this);
            RecyclerView recyclerView3 = this.r;
            recyclerView3.G.remove(bVar);
            if (recyclerView3.H == bVar) {
                recyclerView3.H = null;
            }
            ArrayList arrayList = this.r.S;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                f fVar = (f) arrayList2.get(0);
                fVar.i.cancel();
                this.m.clearView(this.r, fVar.e);
            }
            arrayList2.clear();
            this.w = null;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.t = null;
            }
            e eVar = this.y;
            if (eVar != null) {
                eVar.a = false;
                this.y = null;
            }
            if (this.x != null) {
                this.x = null;
            }
        }
        this.r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
            this.r.i(this);
            this.r.j(bVar);
            RecyclerView recyclerView4 = this.r;
            ArrayList arrayList3 = recyclerView4.S;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                recyclerView4.S = arrayList3;
            }
            arrayList3.add(this);
            this.y = new e();
            this.x = new GestureDetector(this.r.getContext(), this.y);
        }
    }

    public final int k(RecyclerView.d0 d0Var, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        d dVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            velocityTracker.computeCurrentVelocity(1000, dVar.getSwipeVelocityThreshold(this.g));
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= dVar.getSwipeEscapeVelocity(this.f) && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float swipeThreshold = dVar.getSwipeThreshold(d0Var) * this.r.getWidth();
        if ((i & i2) == 0 || Math.abs(this.h) <= swipeThreshold) {
            return 0;
        }
        return i2;
    }

    public final void l(int i, int i2, MotionEvent motionEvent) {
        int absoluteMovementFlags;
        View viewO;
        if (this.c == null && i == 2 && this.n != 2) {
            d dVar = this.m;
            if (dVar.isItemViewSwipeEnabled() && this.r.getScrollState() != 1) {
                RecyclerView.o layoutManager = this.r.getLayoutManager();
                int i3 = this.l;
                RecyclerView.d0 d0VarQ = null;
                if (i3 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(iFindPointerIndex) - this.d;
                    float y = motionEvent.getY(iFindPointerIndex) - this.e;
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f2 = this.q;
                    if ((fAbs >= f2 || fAbs2 >= f2) && ((fAbs <= fAbs2 || !layoutManager.s()) && ((fAbs2 <= fAbs || !layoutManager.t()) && (viewO = o(motionEvent)) != null))) {
                        d0VarQ = this.r.Q(viewO);
                    }
                }
                if (d0VarQ == null || (absoluteMovementFlags = (dVar.getAbsoluteMovementFlags(this.r, d0VarQ) & 65280) >> 8) == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f3 = x2 - this.d;
                float f4 = y2 - this.e;
                float fAbs3 = Math.abs(f3);
                float fAbs4 = Math.abs(f4);
                float f5 = this.q;
                if (fAbs3 >= f5 || fAbs4 >= f5) {
                    if (fAbs3 > fAbs4) {
                        if (f3 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f4 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                            return;
                        }
                        if (f4 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                            return;
                        }
                    }
                    this.i = 0.0f;
                    this.h = 0.0f;
                    this.l = motionEvent.getPointerId(0);
                    s(d0VarQ, 1);
                }
            }
        }
    }

    public final int m(RecyclerView.d0 d0Var, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        d dVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            velocityTracker.computeCurrentVelocity(1000, dVar.getSwipeVelocityThreshold(this.g));
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= dVar.getSwipeEscapeVelocity(this.f) && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float swipeThreshold = dVar.getSwipeThreshold(d0Var) * this.r.getHeight();
        if ((i & i2) == 0 || Math.abs(this.i) <= swipeThreshold) {
            return 0;
        }
        return i2;
    }

    public final void n(RecyclerView.d0 d0Var, boolean z) {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            if (fVar.e == d0Var) {
                fVar.z |= z;
                if (!fVar.A) {
                    fVar.i.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View o(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.d0 d0Var = this.c;
        if (d0Var != null) {
            View view = d0Var.itemView;
            if (q(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            View view2 = fVar.e.itemView;
            if (q(view2, x, y, fVar.w, fVar.y)) {
                return view2;
            }
        }
        return this.r.F(x, y);
    }

    public final void p(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.itemView.getLeft();
        } else {
            fArr[0] = this.c.itemView.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.itemView.getTop();
        } else {
            fArr[1] = this.c.itemView.getTranslationY();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r(RecyclerView.d0 d0Var) {
        int i;
        if (this.r.isLayoutRequested()) {
            return;
        }
        char c2 = 2;
        if (this.n != 2) {
            return;
        }
        d dVar = this.m;
        float moveThreshold = dVar.getMoveThreshold(d0Var);
        int i2 = (int) (this.j + this.h);
        int i3 = (int) (this.k + this.i);
        if (Math.abs(i3 - d0Var.itemView.getTop()) >= d0Var.itemView.getHeight() * moveThreshold || Math.abs(i2 - d0Var.itemView.getLeft()) >= d0Var.itemView.getWidth() * moveThreshold) {
            ArrayList arrayList = this.u;
            if (arrayList == null) {
                this.u = new ArrayList();
                this.v = new ArrayList();
            } else {
                arrayList.clear();
                this.v.clear();
            }
            int boundingBoxMargin = dVar.getBoundingBoxMargin();
            int iRound = Math.round(this.j + this.h) - boundingBoxMargin;
            int iRound2 = Math.round(this.k + this.i) - boundingBoxMargin;
            int i4 = boundingBoxMargin * 2;
            int width = d0Var.itemView.getWidth() + iRound + i4;
            int height = d0Var.itemView.getHeight() + iRound2 + i4;
            int i5 = (iRound + width) / 2;
            int i6 = (iRound2 + height) / 2;
            RecyclerView.o layoutManager = this.r.getLayoutManager();
            int iK = layoutManager.K();
            int i7 = 0;
            while (i7 < iK) {
                char c3 = c2;
                View viewJ = layoutManager.J(i7);
                if (viewJ != d0Var.itemView && viewJ.getBottom() >= iRound2 && viewJ.getTop() <= height && viewJ.getRight() >= iRound && viewJ.getLeft() <= width) {
                    RecyclerView.d0 d0VarQ = this.r.Q(viewJ);
                    i = i5;
                    if (dVar.canDropOver(this.r, this.c, d0VarQ)) {
                        int iAbs = Math.abs(i - ((viewJ.getRight() + viewJ.getLeft()) / 2));
                        int iAbs2 = Math.abs(i6 - ((viewJ.getBottom() + viewJ.getTop()) / 2));
                        int i8 = (iAbs2 * iAbs2) + (iAbs * iAbs);
                        int size = this.u.size();
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < size) {
                            int i11 = size;
                            if (i8 <= ((Integer) this.v.get(i9)).intValue()) {
                                break;
                            }
                            i10++;
                            i9++;
                            size = i11;
                        }
                        this.u.add(i10, d0VarQ);
                        this.v.add(i10, Integer.valueOf(i8));
                    }
                    i7++;
                    c2 = c3;
                    iRound = iRound;
                    i5 = i;
                    iRound2 = iRound2;
                } else {
                    i = i5;
                }
                i7++;
                c2 = c3;
                iRound = iRound;
                i5 = i;
                iRound2 = iRound2;
            }
            ArrayList arrayList2 = this.u;
            if (arrayList2.size() == 0) {
                return;
            }
            RecyclerView.d0 d0VarChooseDropTarget = dVar.chooseDropTarget(d0Var, arrayList2, i2, i3);
            if (d0VarChooseDropTarget == null) {
                this.u.clear();
                this.v.clear();
                return;
            }
            int absoluteAdapterPosition = d0VarChooseDropTarget.getAbsoluteAdapterPosition();
            int absoluteAdapterPosition2 = d0Var.getAbsoluteAdapterPosition();
            if (dVar.onMove(this.r, d0Var, d0VarChooseDropTarget)) {
                this.m.onMoved(this.r, d0Var, absoluteAdapterPosition2, d0VarChooseDropTarget, absoluteAdapterPosition, i2, i3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.recyclerview.widget.r$d] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [androidx.recyclerview.widget.r$d] */
    /* JADX WARN: Type inference failed for: r13v3, types: [androidx.recyclerview.widget.r$d] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [androidx.recyclerview.widget.r$d] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [androidx.recyclerview.widget.r] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.recyclerview.widget.RecyclerView$d0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void s(RecyclerView.d0 d0Var, int i) {
        ?? r13;
        ?? r14;
        boolean z;
        ?? r15;
        ?? r16;
        RecyclerView.d0 d0Var2;
        ?? r17;
        int iM;
        char c2;
        float fSignum;
        if (d0Var == this.c && i == this.n) {
            return;
        }
        this.B = Long.MIN_VALUE;
        int i2 = this.n;
        n(d0Var, true);
        this.n = i;
        if (i == 2) {
            if (d0Var == null) {
                hb5.a("Must pass a ViewHolder when dragging");
                return;
            }
            this.w = d0Var.itemView;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.c;
        ?? r0 = this.m;
        if (r2 != 0) {
            if (r2.itemView.getParent() != null) {
                if (i2 == 2 || this.n == 2) {
                    iM = 0;
                } else {
                    int movementFlags = r0.getMovementFlags(this.r, r2);
                    int iConvertToAbsoluteDirection = (r0.convertToAbsoluteDirection(movementFlags, this.r.getLayoutDirection()) & 65280) >> 8;
                    if (iConvertToAbsoluteDirection == 0) {
                        iM = 0;
                    } else {
                        int i4 = (movementFlags & 65280) >> 8;
                        if (Math.abs(this.h) > Math.abs(this.i)) {
                            iM = k(r2, iConvertToAbsoluteDirection);
                            if (iM <= 0) {
                                iM = m(r2, iConvertToAbsoluteDirection);
                                if (iM <= 0) {
                                    iM = 0;
                                }
                            } else if ((i4 & iM) == 0) {
                                iM = d.convertToRelativeDirection(iM, this.r.getLayoutDirection());
                            }
                        } else {
                            iM = m(r2, iConvertToAbsoluteDirection);
                            if (iM <= 0) {
                                iM = k(r2, iConvertToAbsoluteDirection);
                                if (iM <= 0) {
                                    iM = 0;
                                } else if ((i4 & iM) == 0) {
                                    iM = d.convertToRelativeDirection(iM, this.r.getLayoutDirection());
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.t = null;
                }
                int i5 = 4;
                float fSignum2 = 0.0f;
                if (iM == 1 || iM == 2) {
                    c2 = 0;
                    fSignum = Math.signum(this.i) * this.r.getHeight();
                } else if (iM == 4 || iM == 8 || iM == 16 || iM == 32) {
                    c2 = 0;
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.h) * this.r.getWidth();
                } else {
                    fSignum = 0.0f;
                    c2 = 0;
                }
                if (i2 == 2) {
                    i5 = 8;
                } else if (iM > 0) {
                    i5 = 2;
                }
                float[] fArr = this.b;
                p(fArr);
                float f2 = fSignum2;
                float f3 = fSignum;
                float f4 = fArr[c2];
                float f5 = fArr[1];
                ?? r18 = c2;
                ?? r19 = r0;
                c cVar = new c(r2, i2, f4, f5, f2, f3, iM, r2);
                long animationDuration = r19.getAnimationDuration(this.r, i5, f2 - f4, f3 - f5);
                ValueAnimator valueAnimator = cVar.i;
                valueAnimator.setDuration(animationDuration);
                this.p.add(cVar);
                r2.setIsRecyclable(r18);
                valueAnimator.start();
                d0Var2 = null;
                z = true;
                r17 = r19;
                r16 = r18;
            } else {
                ?? r110 = r0;
                r16 = 0;
                if (r2.itemView == this.w) {
                    d0Var2 = null;
                    this.w = null;
                } else {
                    d0Var2 = null;
                }
                r110.clearView(this.r, r2);
                z = false;
                r17 = r110;
            }
            this.c = d0Var2;
            r13 = r17;
            r14 = r16;
        } else {
            r13 = r0;
            r14 = 0;
            z = false;
        }
        if (d0Var != null) {
            this.o = (r13.getAbsoluteMovementFlags(this.r, d0Var) & i3) >> (this.n * 8);
            this.j = d0Var.itemView.getLeft();
            this.k = d0Var.itemView.getTop();
            this.c = d0Var;
            if (i == 2) {
                d0Var.itemView.performHapticFeedback(r14 == true ? 1 : 0);
            }
        }
        ?? parent = this.r.getParent();
        if (parent != 0) {
            if (this.c != null) {
                r15 = r14;
                r15 = 1;
            }
            r15 = r14;
            parent.requestDisallowInterceptTouchEvent(r15);
        }
        if (!z) {
            this.r.getLayoutManager().f = true;
        }
        r13.onSelectedChanged(this.c, this.n);
        this.r.invalidate();
    }

    public final void t(RecyclerView.d0 d0Var) {
        if (!this.m.hasDragFlag(this.r, d0Var)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (d0Var.itemView.getParent() != this.r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.t = VelocityTracker.obtain();
        this.i = 0.0f;
        this.h = 0.0f;
        s(d0Var, 2);
    }

    public final void u(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float fMax = x - this.d;
        this.h = fMax;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            fMax = Math.max(0.0f, fMax);
            this.h = fMax;
        }
        if ((i & 8) == 0) {
            this.h = Math.min(0.0f, fMax);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }
}
