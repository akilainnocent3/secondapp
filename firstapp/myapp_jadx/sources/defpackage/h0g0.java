package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.sportybet.android.gp.tz.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h0g0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static h0g0 A;
    public static h0g0 z;
    public final View a;
    public final CharSequence b;
    public final int c;
    public final f0g0 d = new Runnable() { // from class: f0g0
        @Override // java.lang.Runnable
        public final void run() {
            this.a.c(false);
        }
    };
    public final g0g0 e = new Runnable() { // from class: g0g0
        @Override // java.lang.Runnable
        public final void run() {
            this.a.a();
        }
    };
    public int f;
    public int i;
    public s0g0 v;
    public boolean w;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v0, types: [f0g0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [g0g0] */
    public h0g0(View view, CharSequence charSequence) {
        this.a = view;
        this.b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = b7i0.a;
        this.c = Build.VERSION.SDK_INT >= 28 ? b7i0.b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.y = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(h0g0 h0g0Var) {
        h0g0 h0g0Var2 = z;
        if (h0g0Var2 != null) {
            h0g0Var2.a.removeCallbacks(h0g0Var2.d);
        }
        z = h0g0Var;
        if (h0g0Var != null) {
            h0g0Var.a.postDelayed(h0g0Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        h0g0 h0g0Var = A;
        View view = this.a;
        if (h0g0Var == this) {
            A = null;
            s0g0 s0g0Var = this.v;
            if (s0g0Var != null) {
                View view2 = s0g0Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) s0g0Var.a.getSystemService("window")).removeView(view2);
                }
                this.v = null;
                this.y = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (z == this) {
            b(null);
        }
        view.removeCallbacks(this.e);
    }

    public final void c(boolean z2) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.a;
        if (view.isAttachedToWindow()) {
            b(null);
            h0g0 h0g0Var = A;
            if (h0g0Var != null) {
                h0g0Var.a();
            }
            A = this;
            this.w = z2;
            s0g0 s0g0Var = new s0g0(view.getContext());
            this.v = s0g0Var;
            int width = this.f;
            int i4 = this.i;
            boolean z3 = this.w;
            View view2 = s0g0Var.b;
            ViewParent parent = view2.getParent();
            Context context = s0g0Var.a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            s0g0Var.c.setText(this.b);
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            WindowManager.LayoutParams layoutParams = s0g0Var.d;
            layoutParams.token = applicationWindowToken;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i3 = 1;
            } else {
                Rect rect = s0g0Var.e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    Resources resources = context.getResources();
                    i3 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = s0g0Var.g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = s0g0Var.f;
                view.getLocationOnScreen(iArr2);
                int i5 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i5;
                iArr2[i3] = iArr2[i3] - iArr[i3];
                layoutParams.x = (i5 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i6 = iArr2[i3];
                int i7 = ((i6 + i) - dimensionPixelOffset3) - measuredHeight;
                int i8 = i6 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i7 >= 0) {
                        layoutParams.y = i7;
                    } else {
                        layoutParams.y = i8;
                    }
                } else if (measuredHeight + i8 <= rect.height()) {
                    layoutParams.y = i8;
                } else {
                    layoutParams.y = i7;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.w) {
                j2 = 2500;
            } else {
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i3) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            g0g0 g0g0Var = this.e;
            view.removeCallbacks(g0g0Var);
            view.postDelayed(g0g0Var, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.v == null || !this.w) {
            View view2 = this.a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.y = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.v == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.y) {
                        this.f = x;
                        this.i = y;
                        this.y = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x - this.f);
                        int i = this.c;
                        if (iAbs > i || Math.abs(y - this.i) > i) {
                            this.f = x;
                            this.i = y;
                            this.y = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
