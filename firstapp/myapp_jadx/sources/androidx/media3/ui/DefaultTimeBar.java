package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.DefaultTimeBar;
import com.google.protobuf.DescriptorProtos;
import defpackage.cl30;
import defpackage.jrh0;
import defpackage.ly0;
import defpackage.xhd;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTimeBar extends View implements b {
    public static final /* synthetic */ int h0 = 0;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final StringBuilder J;
    public final Formatter K;
    public final xhd L;
    public final CopyOnWriteArraySet<b.a> M;
    public final Point N;
    public final float O;
    public int P;
    public long Q;
    public int R;
    public Rect S;
    public final ValueAnimator T;
    public float U;
    public boolean V;
    public boolean W;
    public final Rect a;
    public long a0;
    public final Rect b;
    public long b0;
    public final Rect c;
    public long c0;
    public final Rect d;
    public long d0;
    public final Paint e;
    public int e0;
    public final Paint f;
    public long[] f0;
    public boolean[] g0;
    public final Paint i;
    public final Paint v;
    public final Paint w;
    public final Paint y;
    public final Drawable z;

    /* JADX WARN: Type inference failed for: r1v5, types: [xhd] */
    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        Paint paint3 = new Paint();
        this.i = paint3;
        Paint paint4 = new Paint();
        this.v = paint4;
        Paint paint5 = new Paint();
        this.w = paint5;
        Paint paint6 = new Paint();
        this.y = paint6;
        paint6.setAntiAlias(true);
        this.M = new CopyOnWriteArraySet<>();
        this.N = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.O = f;
        this.I = b(-50, f);
        int iB = b(4, f);
        int iB2 = b(26, f);
        int iB3 = b(4, f);
        int iB4 = b(12, f);
        int iB5 = b(0, f);
        int iB6 = b(16, f);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, cl30.b, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.z = drawable;
                if (drawable != null) {
                    drawable.setLayoutDirection(getLayoutDirection());
                    iB2 = Math.max(drawable.getMinimumHeight(), iB2);
                }
                this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iB);
                this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iB2);
                this.C = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iB3);
                iB4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iB4);
                this.E = iB4;
                iB5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iB5);
                this.F = iB5;
                iB6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iB6);
                this.G = iB6;
                int i3 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i6 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i7 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i8 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.A = iB;
            this.B = iB2;
            this.C = 0;
            this.D = iB3;
            this.E = iB4;
            this.F = iB5;
            this.G = iB6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.z = null;
        }
        StringBuilder sb = new StringBuilder();
        this.J = sb;
        this.K = new Formatter(sb, Locale.getDefault());
        this.L = new Runnable() { // from class: xhd
            @Override // java.lang.Runnable
            public final void run() {
                int i9 = DefaultTimeBar.h0;
                this.a.e(false);
            }
        };
        Drawable drawable2 = this.z;
        if (drawable2 != null) {
            this.H = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.H = (Math.max(iB5, Math.max(iB4, iB6)) + 1) / 2;
        }
        this.U = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.T = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yhd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i9 = DefaultTimeBar.h0;
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                DefaultTimeBar defaultTimeBar = this.a;
                defaultTimeBar.U = fFloatValue;
                defaultTimeBar.invalidate(defaultTimeBar.a);
            }
        });
        this.b0 = -9223372036854775807L;
        this.Q = -9223372036854775807L;
        this.P = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int b(int i, float f) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.Q;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.b0;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.P);
    }

    private String getProgressText() {
        return jrh0.C(this.J, this.K, this.c0);
    }

    private long getScrubberPosition() {
        Rect rect = this.b;
        if (rect.width() <= 0 || this.b0 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.d.width()) * this.b0) / ((long) rect.width());
    }

    @Override // androidx.media3.ui.b
    public final void a(b.a aVar) {
        aVar.getClass();
        this.M.add(aVar);
    }

    public final boolean c(long j) {
        long j2 = this.b0;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.W ? this.a0 : this.c0;
        long j4 = jrh0.j(j3 + j, 0L, j2);
        if (j4 == j3) {
            return false;
        }
        if (this.W) {
            g(j4);
        } else {
            d(j4);
        }
        f();
        return true;
    }

    public final void d(long j) {
        this.a0 = j;
        this.W = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<b.a> it = this.M.iterator();
        while (it.hasNext()) {
            it.next().n(j);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.z;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e(boolean z) {
        removeCallbacks(this.L);
        this.W = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<b.a> it = this.M.iterator();
        while (it.hasNext()) {
            it.next().v(this.a0, z);
        }
    }

    public final void f() {
        Rect rect = this.c;
        Rect rect2 = this.b;
        rect.set(rect2);
        Rect rect3 = this.d;
        rect3.set(rect2);
        long j = this.W ? this.a0 : this.c0;
        if (this.b0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.d0) / this.b0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.b0)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.a);
    }

    public final void g(long j) {
        if (this.a0 == j) {
            return;
        }
        this.a0 = j;
        Iterator<b.a> it = this.M.iterator();
        while (it.hasNext()) {
            it.next().r(j);
        }
    }

    @Override // androidx.media3.ui.b
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.b.width() / this.O);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.b0;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iWidth);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.z;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        canvas.save();
        Rect rect = this.b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iCenterY + iHeight;
        long j = this.b0;
        Paint paint = this.i;
        Rect rect2 = this.d;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.c;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.e);
            }
            if (this.e0 != 0) {
                long[] jArr = this.f0;
                jArr.getClass();
                boolean[] zArr = this.g0;
                zArr.getClass();
                int i6 = this.D;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.e0) {
                    int iMin = Math.min(rect.width() - i6, Math.max(i8, ((int) ((((long) rect.width()) * jrh0.j(jArr[i9], 0L, this.b0)) / this.b0)) - i7)) + rect.left;
                    int i10 = i9;
                    canvas.drawRect(iMin, iCenterY, iMin + i6, i2, zArr[i9] ? this.w : this.v);
                    i9 = i10 + 1;
                    i8 = i8;
                }
            }
            canvas2 = canvas;
        }
        if (this.b0 > 0) {
            int i11 = jrh0.i(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.z;
            if (drawable == null) {
                if (this.W || isFocused()) {
                    i = this.G;
                } else {
                    i = isEnabled() ? this.E : this.F;
                }
                canvas2.drawCircle(i11, iCenterY2, (int) ((i * this.U) / 2.0f), this.y);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.U)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.U)) / 2;
                drawable.setBounds(i11 - intrinsicWidth, iCenterY2 - intrinsicHeight, i11 + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.W || z) {
            return;
        }
        e(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.b0 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (c(positionIncrement)) {
                            xhd xhdVar = this.L;
                            removeCallbacks(xhdVar);
                            postDelayed(xhdVar, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (c(positionIncrement)) {
                            xhd xhdVar2 = this.L;
                            removeCallbacks(xhdVar2);
                            postDelayed(xhdVar2, 1000L);
                            return true;
                        }
                        break;
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        if (this.W) {
                            e(false);
                            return true;
                        }
                        break;
                }
            } else if (this.W) {
                e(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.V ? 0 : this.H;
        int i8 = this.C;
        int i9 = this.A;
        int i10 = this.B;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.b.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.S) == null || rect.width() != i5 || this.S.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.S = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        f();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.B;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.z;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.z;
        if (drawable == null || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.b0 > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.N;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.b;
            Rect rect2 = this.d;
            if (action == 0) {
                int i3 = i;
                if (this.a.contains(i3, i2)) {
                    rect2.right = jrh0.i(i3, rect.left, rect.right);
                    d(getScrubberPosition());
                    f();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.W) {
                    e(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.W) {
                        e(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.W) {
                if (i2 < this.I) {
                    int i4 = this.R;
                    rect2.right = jrh0.i(((i - i4) / 3) + i4, rect.left, rect.right);
                } else {
                    this.R = i;
                    rect2.right = jrh0.i(i, rect.left, rect.right);
                }
                g(getScrubberPosition());
                f();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.b0 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (c(-getPositionIncrement())) {
                e(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (c(getPositionIncrement())) {
                e(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // androidx.media3.ui.b
    public void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i) {
        ly0.b(i == 0 || !(jArr == null || zArr == null));
        this.e0 = i;
        this.f0 = jArr;
        this.g0 = zArr;
        f();
    }

    public void setAdMarkerColor(int i) {
        this.v.setColor(i);
        invalidate(this.a);
    }

    public void setBufferedColor(int i) {
        this.f.setColor(i);
        invalidate(this.a);
    }

    @Override // androidx.media3.ui.b
    public void setBufferedPosition(long j) {
        if (this.d0 == j) {
            return;
        }
        this.d0 = j;
        f();
    }

    @Override // androidx.media3.ui.b
    public void setDuration(long j) {
        if (this.b0 == j) {
            return;
        }
        this.b0 = j;
        if (this.W && j == -9223372036854775807L) {
            e(true);
        }
        f();
    }

    @Override // android.view.View, androidx.media3.ui.b
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.W || z) {
            return;
        }
        e(true);
    }

    public void setKeyCountIncrement(int i) {
        ly0.b(i > 0);
        this.P = i;
        this.Q = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        ly0.b(j > 0);
        this.P = -1;
        this.Q = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.w.setColor(i);
        invalidate(this.a);
    }

    public void setPlayedColor(int i) {
        this.e.setColor(i);
        invalidate(this.a);
    }

    @Override // androidx.media3.ui.b
    public void setPosition(long j) {
        if (this.c0 == j) {
            return;
        }
        this.c0 = j;
        setContentDescription(getProgressText());
        f();
    }

    public void setScrubberColor(int i) {
        this.y.setColor(i);
        invalidate(this.a);
    }

    public void setUnplayedColor(int i) {
        this.i.setColor(i);
        invalidate(this.a);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet, 0);
    }

    public DefaultTimeBar(Context context) {
        this(context, null);
    }
}
