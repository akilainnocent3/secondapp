package com.startapp.sdk.ads.banner.bannerstandard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import com.startapp.sdk.internal.f3;
import com.startapp.sdk.internal.k2;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class CloseableLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f74008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f3 f74009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BitmapDrawable f74010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ClosePosition f74011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f74012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f74013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f74014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f74015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f74016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f74017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f74018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Rect f74019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f74020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private f f74021n;

    public CloseableLayout(@NonNull Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f74015h) {
            this.f74015h = false;
            this.f74016i.set(0, 0, getWidth(), getHeight());
            ClosePosition closePosition = this.f74011d;
            Rect rect = this.f74016i;
            Rect rect2 = this.f74017j;
            int i10 = this.f74012e;
            Gravity.apply(closePosition.a(), i10, i10, rect, rect2);
            this.f74019l.set(this.f74017j);
            Rect rect3 = this.f74019l;
            int i11 = this.f74014g;
            rect3.inset(i11, i11);
            ClosePosition closePosition2 = this.f74011d;
            Rect rect4 = this.f74019l;
            Rect rect5 = this.f74018k;
            int i12 = this.f74013f;
            Gravity.apply(closePosition2.a(), i12, i12, rect4, rect5);
            this.f74010c.setBounds(this.f74018k);
        }
        if (this.f74010c.isVisible()) {
            this.f74010c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        Rect rect = this.f74017j;
        return x10 >= rect.left && y10 >= rect.top && x10 < rect.right && y10 < rect.bottom;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f74015h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int i10 = this.f74008a;
        Rect rect = this.f74017j;
        if (x10 < rect.left - i10 || y10 < rect.top - i10 || x10 >= rect.right + i10 || y10 >= rect.bottom + i10 || !(this.f74020m || this.f74010c.isVisible())) {
            a(false);
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            a(true);
        } else if (action != 1) {
            if (action == 3) {
                a(false);
            }
        } else if (this.f74010c.getState() == FrameLayout.SELECTED_STATE_SET) {
            if (this.f74021n == null) {
                this.f74021n = new f(this);
            }
            postDelayed(this.f74021n, ViewConfiguration.getPressedStateDuration());
            playSoundEffect(0);
            f3 f3Var = this.f74009b;
            if (f3Var != null) {
                f3Var.a();
            }
        }
        return true;
    }

    public void setCloseAlwaysInteractable(boolean z10) {
        this.f74020m = z10;
    }

    @h1
    public void setCloseBoundChanged(boolean z10) {
        this.f74015h = z10;
    }

    @h1
    public void setCloseBounds(Rect rect) {
        this.f74017j.set(rect);
    }

    public void setClosePosition(@NonNull ClosePosition closePosition) {
        this.f74011d = closePosition;
        this.f74015h = true;
        invalidate();
    }

    public void setCloseVisible(boolean z10) {
        if (this.f74010c.setVisible(z10, false)) {
            invalidate(this.f74017j);
        }
    }

    public void setOnCloseListener(@Nullable f3 f3Var) {
        this.f74009b = f3Var;
    }

    public CloseableLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(ClosePosition closePosition, Rect rect, Rect rect2) {
        int i10 = this.f74012e;
        Gravity.apply(closePosition.a(), i10, i10, rect, rect2);
    }

    public CloseableLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f74016i = new Rect();
        this.f74017j = new Rect();
        this.f74018k = new Rect();
        this.f74019l = new Rect();
        BitmapDrawable bitmapDrawableA = k2.a(context.getResources());
        this.f74010c = bitmapDrawableA;
        this.f74011d = ClosePosition.TOP_RIGHT;
        bitmapDrawableA.setState(FrameLayout.EMPTY_STATE_SET);
        bitmapDrawableA.setCallback(this);
        this.f74008a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f74012e = Math.round(TypedValue.applyDimension(1, 50, context.getResources().getDisplayMetrics()));
        this.f74013f = Math.round(TypedValue.applyDimension(1, 30, context.getResources().getDisplayMetrics()));
        this.f74014g = Math.round(TypedValue.applyDimension(1, 8, context.getResources().getDisplayMetrics()));
        setWillNotDraw(false);
        this.f74020m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        int[] state = this.f74010c.getState();
        int[] iArr = FrameLayout.SELECTED_STATE_SET;
        if (z10 == (state == iArr)) {
            return;
        }
        BitmapDrawable bitmapDrawable = this.f74010c;
        if (!z10) {
            iArr = FrameLayout.EMPTY_STATE_SET;
        }
        bitmapDrawable.setState(iArr);
        invalidate(this.f74017j);
    }

    public final boolean a() {
        return this.f74010c.isVisible();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @SuppressLint({"RtlHardcoded"})
    public enum ClosePosition {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);

        private final int mGravity;

        ClosePosition(int i10) {
            this.mGravity = i10;
        }

        public static ClosePosition a(String str) {
            ClosePosition closePosition = TOP_RIGHT;
            if (!TextUtils.isEmpty(str)) {
                if (str.equals(C4235d4.e.f61351c)) {
                    return TOP_LEFT;
                }
                if (!str.equals(C4235d4.e.f61350b)) {
                    if (str.equals("center")) {
                        return CENTER;
                    }
                    if (str.equals(C4235d4.e.f61353e)) {
                        return BOTTOM_LEFT;
                    }
                    if (str.equals(C4235d4.e.f61352d)) {
                        return BOTTOM_RIGHT;
                    }
                    if (str.equals("top-center")) {
                        return TOP_CENTER;
                    }
                    if (str.equals("bottom-center")) {
                        return BOTTOM_CENTER;
                    }
                    throw new IllegalArgumentException(str);
                }
            }
            return closePosition;
        }

        public final int a() {
            return this.mGravity;
        }
    }
}
