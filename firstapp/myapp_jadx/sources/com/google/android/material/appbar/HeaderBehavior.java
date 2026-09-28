package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.protobuf.Reader;
import defpackage.cdv;

/* JADX INFO: loaded from: classes4.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    public a c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int i;
    public int v;
    public VelocityTracker w;

    public class a implements Runnable {
        public final CoordinatorLayout a;
        public final V b;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.a = coordinatorLayout;
            this.b = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HeaderBehavior headerBehavior;
            OverScroller overScroller;
            V v = this.b;
            if (v == null || (overScroller = (headerBehavior = HeaderBehavior.this).d) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.a;
            if (!zComputeScrollOffset) {
                headerBehavior.D(coordinatorLayout, v);
            } else {
                headerBehavior.F(coordinatorLayout, v, headerBehavior.d.getCurrY());
                v.postOnAnimation(this);
            }
        }
    }

    public HeaderBehavior() {
        this.f = -1;
        this.v = -1;
    }

    public boolean A(V v) {
        return false;
    }

    public int B(V v) {
        return -v.getHeight();
    }

    public int C(V v) {
        return v.getHeight();
    }

    public void D(CoordinatorLayout coordinatorLayout, V v) {
    }

    public int E(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int iB;
        int iW = w();
        if (i2 == 0 || iW < i2 || iW > i3 || iW == (iB = cdv.b(i, i2, i3))) {
            return 0;
        }
        z(iB);
        return iW - iB;
    }

    public final void F(CoordinatorLayout coordinatorLayout, View view, int i) {
        E(coordinatorLayout, view, i, Integer.MIN_VALUE, Reader.READ_DONE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y;
        boolean z;
        OverScroller overScroller;
        int iFindPointerIndex;
        if (this.v < 0) {
            this.v = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.e) {
            int i = this.f;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.i) > this.v) {
                    this.i = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.f = -1;
                    int x = (int) motionEvent.getX();
                    y = (int) motionEvent.getY();
                    if (A(v)) {
                        z = false;
                    } else {
                        z = false;
                    }
                    this.e = z;
                    if (z) {
                        this.i = y;
                        this.f = motionEvent.getPointerId(0);
                        if (this.w == null) {
                            this.w = VelocityTracker.obtain();
                        }
                        overScroller = this.d;
                        if (overScroller != null) {
                            this.d.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.w;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.f = -1;
                int x2 = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (A(v) || !coordinatorLayout.s(v, x2, y)) {
                    z = false;
                } else {
                    z = true;
                }
                this.e = z;
                if (z) {
                    this.i = y;
                    this.f = motionEvent.getPointerId(0);
                    if (this.w == null) {
                        this.w = VelocityTracker.obtain();
                    }
                    overScroller = this.d;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.d.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.w;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6 A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean v(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i = this.i - y;
                    this.i = y;
                    E(coordinatorLayout, v, x() - i, B(v), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f = motionEvent.getPointerId(i2);
                    this.i = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.w;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.e || z;
        }
        VelocityTracker velocityTracker3 = this.w;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.w.computeCurrentVelocity(1000);
            float yVelocity = this.w.getYVelocity(this.f);
            int i3 = -C(v);
            Runnable runnable = this.c;
            if (runnable != null) {
                v.removeCallbacks(runnable);
                this.c = null;
            }
            OverScroller overScroller = this.d;
            if (overScroller == null) {
                overScroller = new OverScroller(v.getContext());
                this.d = overScroller;
            }
            overScroller.fling(0, w(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (this.d.computeScrollOffset()) {
                a aVar = new a(coordinatorLayout, v);
                this.c = aVar;
                v.postOnAnimation(aVar);
            } else {
                D(coordinatorLayout, v);
            }
            z = true;
        }
        this.e = false;
        this.f = -1;
        velocityTracker = this.w;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.w = null;
        }
        velocityTracker2 = this.w;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.e) {
        }
        z = false;
        this.e = false;
        this.f = -1;
        velocityTracker = this.w;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.w = null;
        }
        velocityTracker2 = this.w;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.e) {
        }
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1;
        this.v = -1;
    }
}
