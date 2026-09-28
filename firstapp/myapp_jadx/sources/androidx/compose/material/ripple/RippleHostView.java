package androidx.compose.material.ripple;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import defpackage.j58;
import defpackage.mp20;
import defpackage.nbh0;
import defpackage.ogh0;
import defpackage.r58;
import defpackage.st50;
import defpackage.ta0;
import defpackage.ycv;
import defpackage.yw90;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "pressed", "", "setRippleState", "(Z)V", "Lyw90;", "size", "", "radius", "Lj58;", "color", "", "alpha", "setRippleProperties-biQXAtU", "(JIJF)V", "setRippleProperties", "material-ripple"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RippleHostView extends View {
    public static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] i = new int[0];
    public ogh0 a;
    public Boolean b;
    public Long c;
    public st50 d;
    public ta0 e;

    public RippleHostView(Context context) {
        super(context);
    }

    private final void setRippleState(boolean pressed) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.c;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (pressed || jLongValue >= 5) {
            int[] iArr = pressed ? f : i;
            ogh0 ogh0Var = this.a;
            if (ogh0Var != null) {
                ogh0Var.setState(iArr);
            }
        } else {
            st50 st50Var = new st50(this);
            this.d = st50Var;
            postDelayed(st50Var, 50L);
        }
        this.c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        ogh0 ogh0Var = rippleHostView.a;
        if (ogh0Var != null) {
            ogh0Var.setState(i);
        }
        rippleHostView.d = null;
    }

    public final void b(mp20.b bVar, boolean z, long j, int i2, long j2, float f2, ta0 ta0Var) {
        long j3 = bVar.a;
        if (this.a == null || !Boolean.valueOf(z).equals(this.b)) {
            ogh0 ogh0Var = new ogh0(z);
            setBackground(ogh0Var);
            this.a = ogh0Var;
            this.b = Boolean.valueOf(z);
        }
        ogh0 ogh0Var2 = this.a;
        ogh0Var2.getClass();
        this.e = ta0Var;
        m0setRipplePropertiesbiQXAtU(j, i2, j2, f2);
        if (z) {
            ogh0Var2.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)));
        } else {
            ogh0Var2.setHotspot(ogh0Var2.getBounds().centerX(), ogh0Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.e = null;
        st50 st50Var = this.d;
        if (st50Var != null) {
            removeCallbacks(st50Var);
            st50 st50Var2 = this.d;
            st50Var2.getClass();
            st50Var2.run();
        } else {
            ogh0 ogh0Var = this.a;
            if (ogh0Var != null) {
                ogh0Var.setState(i);
            }
        }
        ogh0 ogh0Var2 = this.a;
        if (ogh0Var2 == null) {
            return;
        }
        ogh0Var2.setVisible(false, false);
        unscheduleDrawable(ogh0Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ta0 ta0Var = this.e;
        if (ta0Var != null) {
            ta0Var.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    /* JADX INFO: renamed from: setRippleProperties-biQXAtU, reason: not valid java name */
    public final void m0setRipplePropertiesbiQXAtU(long size, int radius, long color, float alpha) {
        ogh0 ogh0Var = this.a;
        if (ogh0Var == null) {
            return;
        }
        Integer num = ogh0Var.c;
        if (num == null || num.intValue() != radius) {
            ogh0Var.c = Integer.valueOf(radius);
            ogh0Var.setRadius(radius);
        }
        if (Build.VERSION.SDK_INT < 28) {
            alpha *= 2.0f;
        }
        if (alpha > 1.0f) {
            alpha = 1.0f;
        }
        long jC = j58.c(alpha, color);
        j58 j58Var = ogh0Var.b;
        if (!(j58Var == null ? false : nbh0.a(j58Var.a, jC))) {
            ogh0Var.b = new j58(jC);
            ogh0Var.setColor(ColorStateList.valueOf(r58.l(jC)));
        }
        Rect rect = new Rect(0, 0, ycv.b(yw90.d(size)), ycv.b(yw90.b(size)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        ogh0Var.setBounds(rect);
    }
}
