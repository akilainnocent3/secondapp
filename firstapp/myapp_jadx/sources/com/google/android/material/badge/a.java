package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.dj0;
import defpackage.fcv;
import defpackage.gof0;
import defpackage.hff0;
import defpackage.odf0;
import defpackage.rx80;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Drawable implements hff0.b {
    public WeakReference<View> A;
    public WeakReference<FrameLayout> B;
    public final WeakReference<Context> a;
    public final fcv b;
    public final hff0 c;
    public final Rect d;
    public final BadgeState e;
    public float f;
    public float i;
    public final int v;
    public float w;
    public float y;
    public float z;

    public a(Context context, BadgeState.State state) {
        odf0 odf0Var;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.a = weakReference;
        gof0.c(context, gof0.b, "Theme.MaterialComponents");
        this.d = new Rect();
        hff0 hff0Var = new hff0(this);
        this.c = hff0Var;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = hff0Var.a;
        textPaint.setTextAlign(align);
        BadgeState badgeState = new BadgeState(context, state);
        this.e = badgeState;
        boolean zG = g();
        BadgeState.State state2 = badgeState.b;
        fcv fcvVar = new fcv(rx80.a(context, zG ? state2.i.intValue() : state2.e.intValue(), g() ? state2.v.intValue() : state2.f.intValue()).a());
        this.b = fcvVar;
        i();
        Context context2 = weakReference.get();
        if (context2 != null && hff0Var.g != (odf0Var = new odf0(context2, state2.d.intValue()))) {
            hff0Var.c(odf0Var, context2);
            textPaint.setColor(state2.c.intValue());
            invalidateSelf();
            k();
            invalidateSelf();
        }
        int i = state2.A;
        if (i != -2) {
            this.v = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.v = state2.B;
        }
        hff0Var.e = true;
        k();
        invalidateSelf();
        hff0Var.e = true;
        i();
        k();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(state2.b.intValue());
        if (fcvVar.b.d != colorStateListValueOf) {
            fcvVar.s(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(state2.c.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.A;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.A.get();
            WeakReference<FrameLayout> weakReference3 = this.B;
            j(view, weakReference3 != null ? weakReference3.get() : null);
        }
        k();
        setVisible(state2.I.booleanValue(), false);
    }

    @Override // hff0.b
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view, View view2) {
        float y;
        float x;
        ViewParent parent;
        boolean z;
        FrameLayout frameLayoutE = e();
        if (frameLayoutE == null) {
            float y2 = view.getY();
            x = view.getX();
            parent = view.getParent();
            y = y2;
        } else {
            y = 0.0f;
            x = 0.0f;
            parent = frameLayoutE;
        }
        while (true) {
            z = parent instanceof View;
            if (!z || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y += view3.getY();
            x += view3.getX();
            parent = parent.getParent();
        }
        if (z) {
            float f = (this.i - this.z) + y;
            float f2 = (this.f - this.y) + x;
            View view4 = (View) parent;
            float height = ((this.i + this.z) - view4.getHeight()) + y;
            float width = ((this.f + this.y) - view4.getWidth()) + x;
            if (f < 0.0f) {
                this.i = Math.abs(f) + this.i;
            }
            if (f2 < 0.0f) {
                this.f = Math.abs(f2) + this.f;
            }
            if (height > 0.0f) {
                this.i -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.f -= Math.abs(width);
            }
        }
    }

    public final String c() {
        BadgeState badgeState = this.e;
        BadgeState.State state = badgeState.b;
        BadgeState.State state2 = badgeState.b;
        String str = state.y;
        WeakReference<Context> weakReference = this.a;
        if (str == null) {
            if (!h()) {
                return null;
            }
            int i = this.v;
            if (i == -2 || f() <= i) {
                return NumberFormat.getInstance(state2.C).format(f());
            }
            Context context = weakReference.get();
            return context == null ? "" : String.format(state2.C, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        int i2 = state.A;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    public final CharSequence d() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        BadgeState badgeState = this.e;
        BadgeState.State state = badgeState.b;
        if (state.y != null) {
            CharSequence charSequence = state.D;
            return charSequence != null ? charSequence : badgeState.b.y;
        }
        boolean zH = h();
        BadgeState.State state2 = badgeState.b;
        if (!zH) {
            return state2.E;
        }
        if (state2.F == 0 || (context = this.a.get()) == null) {
            return null;
        }
        int i = this.v;
        return (i == -2 || f() <= i) ? context.getResources().getQuantityString(state2.F, f(), Integer.valueOf(f())) : context.getString(state2.G, Integer.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strC;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.b.draw(canvas);
        if (!g() || (strC = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        hff0 hff0Var = this.c;
        hff0Var.a.getTextBounds(strC, 0, strC.length(), rect);
        float fExactCenterY = this.i - rect.exactCenterY();
        canvas.drawText(strC, this.f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), hff0Var.a);
    }

    public final FrameLayout e() {
        WeakReference<FrameLayout> weakReference = this.B;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final int f() {
        int i = this.e.b.z;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean g() {
        return this.e.b.y != null || h();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e.b.w;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean h() {
        BadgeState.State state = this.e.b;
        return state.y == null && state.z != -1;
    }

    public final void i() {
        Context context = this.a.get();
        if (context == null) {
            return;
        }
        boolean zG = g();
        BadgeState badgeState = this.e;
        this.b.setShapeAppearanceModel(rx80.a(context, zG ? badgeState.b.i.intValue() : badgeState.b.e.intValue(), g() ? badgeState.b.v.intValue() : badgeState.b.f.intValue()).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j(View view, FrameLayout frameLayout) {
        this.A = new WeakReference<>(view);
        this.B = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        k();
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0110 A[PHI: r13
      0x0110: PHI (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:41:0x00dc, B:43:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    public final void k() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        WeakReference<Context> weakReference = this.a;
        Context context = weakReference.get();
        WeakReference<View> weakReference2 = this.A;
        View view = weakReference2 != null ? weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.d;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference<FrameLayout> weakReference3 = this.B;
        FrameLayout frameLayout = weakReference3 != null ? weakReference3.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zG = g();
        BadgeState badgeState = this.e;
        float f7 = zG ? badgeState.d : badgeState.c;
        this.w = f7;
        if (f7 != -1.0f) {
            this.y = f7;
            this.z = f7;
        } else {
            this.y = Math.round((g() ? badgeState.g : badgeState.e) / 2.0f);
            this.z = Math.round((g() ? badgeState.h : badgeState.f) / 2.0f);
        }
        if (g()) {
            String strC = c();
            float f8 = this.y;
            hff0 hff0Var = this.c;
            this.y = Math.max(f8, (hff0Var.a(strC) / 2.0f) + badgeState.b.J.intValue());
            float f9 = this.z;
            if (hff0Var.e) {
                hff0Var.b(strC);
            }
            float fMax = Math.max(f9, (hff0Var.d / 2.0f) + badgeState.b.K.intValue());
            this.z = fMax;
            this.y = Math.max(this.y, fMax);
        }
        BadgeState.State state = badgeState.b;
        BadgeState.State state2 = badgeState.b;
        int i = badgeState.k;
        int iIntValue = state.M.intValue();
        if (g()) {
            iIntValue = state.O.intValue();
            Context context2 = weakReference.get();
            if (context2 != null) {
                iIntValue = dj0.c(dj0.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue, iIntValue - state.R.intValue());
            }
        }
        if (i == 0) {
            iIntValue -= Math.round(this.z);
        }
        int iIntValue2 = state.Q.intValue() + iIntValue;
        int iIntValue3 = state2.H.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.i = rect3.bottom - iIntValue2;
        } else {
            this.i = rect3.top + iIntValue2;
        }
        int iIntValue4 = g() ? state.N.intValue() : state2.L.intValue();
        if (i == 1) {
            iIntValue4 += g() ? badgeState.j : badgeState.i;
        }
        int iIntValue5 = state.P.intValue() + iIntValue4;
        int iIntValue6 = state2.H.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            if (badgeState.l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f = rect3.left + this.y;
                    f2 = (this.z * 2.0f) - iIntValue5;
                    f3 = f - f2;
                } else {
                    f3 = (rect3.right - this.y) + ((this.z * 2.0f) - iIntValue5);
                }
            } else if (view.getLayoutDirection() == 0) {
                f3 = (rect3.left - this.y) + iIntValue5;
            } else {
                f = rect3.right + this.y;
                f2 = iIntValue5;
                f3 = f - f2;
            }
            this.f = f3;
        } else {
            if (badgeState.l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f4 = rect3.right + this.y;
                    f5 = iIntValue5;
                    f6 = f4 - f5;
                } else {
                    f6 = (rect3.left - this.y) + iIntValue5;
                }
            } else if (view.getLayoutDirection() == 0) {
                f6 = (rect3.right - this.y) + ((this.z * 2.0f) - iIntValue5);
            } else {
                f4 = rect3.left + this.y;
                f5 = (this.z * 2.0f) - iIntValue5;
                f6 = f4 - f5;
            }
            this.f = f6;
        }
        if (state.S.booleanValue()) {
            ViewParent viewParentE = e();
            if (viewParentE == null) {
                viewParentE = view.getParent();
            }
            if ((viewParentE instanceof View) && (viewParentE.getParent() instanceof View)) {
                b(view, (View) viewParentE.getParent());
            }
        } else {
            b(view, null);
        }
        float f10 = this.f;
        float f11 = this.i;
        float f12 = this.y;
        float f13 = this.z;
        rect2.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
        float f14 = this.w;
        fcv fcvVar = this.b;
        if (f14 != -1082130432) {
            rx80.a aVarH = fcvVar.b.a.h();
            aVarH.b(f14);
            fcvVar.setShapeAppearanceModel(aVarH.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        fcvVar.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, hff0.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        BadgeState badgeState = this.e;
        badgeState.a.w = i;
        badgeState.b.w = i;
        this.c.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
