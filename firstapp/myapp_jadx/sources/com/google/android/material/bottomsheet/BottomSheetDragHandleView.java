package com.google.android.material.bottomsheet;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.sportybet.android.gp.tz.R;
import defpackage.c7;
import defpackage.e6;
import defpackage.l7;
import defpackage.r6i0;
import defpackage.tcv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    public static final /* synthetic */ int B = 0;
    public final a A;
    public final AccessibilityManager d;
    public BottomSheetBehavior<?> e;
    public final GestureDetector f;
    public boolean i;
    public boolean v;
    public boolean w;
    public final String y;
    public final String z;

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            BottomSheetBehavior<?> bottomSheetBehavior = BottomSheetDragHandleView.this.e;
            if (bottomSheetBehavior == null || !bottomSheetBehavior.X) {
                return super.onDoubleTap(motionEvent);
            }
            bottomSheetBehavior.L(5);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return BottomSheetDragHandleView.this.isClickable();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            int i = BottomSheetDragHandleView.B;
            return BottomSheetDragHandleView.this.c();
        }
    }

    public class c extends e6 {
        public c() {
        }

        @Override // defpackage.e6
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                int i = BottomSheetDragHandleView.B;
                BottomSheetDragHandleView.this.c();
            }
        }
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i) {
        super(tcv.a(context, attributeSet, i, R.style.Widget_Material3_BottomSheet_DragHandle), attributeSet, i);
        this.v = false;
        this.w = false;
        this.y = getResources().getString(R.string.bottomsheet_action_expand);
        this.z = getResources().getString(R.string.bottomsheet_action_collapse);
        this.A = new a();
        b bVar = new b();
        Context context2 = getContext();
        this.f = new GestureDetector(context2, bVar, new Handler(Looper.getMainLooper()));
        this.d = (AccessibilityManager) context2.getSystemService("accessibility");
        r6i0.p(this, new c());
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.e;
        a aVar = this.A;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.p0.remove(aVar);
            this.e.H(null);
            this.e.n0 = null;
        }
        this.e = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.H(this);
            BottomSheetBehavior<?> bottomSheetBehavior3 = this.e;
            bottomSheetBehavior3.getClass();
            bottomSheetBehavior3.n0 = new WeakReference<>(this);
            d(this.e.c0);
            ArrayList<BottomSheetBehavior.d> arrayList = this.e.p0;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
        }
        setClickable(this.e != null);
    }

    public final boolean c() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.e;
        if (bottomSheetBehavior == null) {
            return false;
        }
        boolean z = bottomSheetBehavior.b;
        int i = bottomSheetBehavior.c0;
        int i2 = 6;
        int i3 = 3;
        if (i == 4) {
            if (z) {
                i2 = i3;
            }
        } else if (i != 3) {
            if (!this.i) {
                i3 = 4;
            }
            i2 = i3;
        } else if (z) {
            i2 = 4;
        }
        bottomSheetBehavior.L(i2);
        return true;
    }

    public final void d(int i) {
        if (i == 4) {
            this.i = true;
        } else if (i == 3) {
            this.i = false;
        }
        r6i0.n(this, c7.a.g, this.i ? this.y : this.z, new l7() { // from class: g55
            @Override // defpackage.l7
            public final boolean a(View view) {
                int i2 = BottomSheetDragHandleView.B;
                return this.a.c();
            }
        });
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.e) layoutParams).a;
                if (behavior instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.d;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            accessibilityManager.isEnabled();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.d;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.w || this.v) ? super.onTouchEvent(motionEvent) : this.f.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.w = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.v = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    public class a extends BottomSheetBehavior.d {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, View view) {
            int i2 = BottomSheetDragHandleView.B;
            BottomSheetDragHandleView.this.d(i);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(View view) {
        }
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }
}
