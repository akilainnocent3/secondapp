package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.c7;
import defpackage.e6;
import defpackage.ecv;
import defpackage.pk30;
import defpackage.r6i0;
import defpackage.th50;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.a {
    public final ClockHandView I;
    public final Rect J;
    public final RectF K;
    public final Rect L;
    public final SparseArray<TextView> M;
    public final b N;
    public final int[] O;
    public final float[] P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final String[] U;
    public float V;
    public final ColorStateList W;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ClockFaceView clockFaceView = ClockFaceView.this;
            ClockHandView clockHandView = clockFaceView.I;
            if (clockFaceView.isShown()) {
                clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
                int height = ((clockFaceView.getHeight() / 2) - clockHandView.d) - clockFaceView.Q;
                if (height != clockFaceView.G) {
                    clockFaceView.G = height;
                    clockFaceView.E();
                    clockHandView.A = clockFaceView.G;
                    clockHandView.invalidate();
                }
            }
            return true;
        }
    }

    public class b extends e6 {
        public b() {
        }

        @Override // defpackage.e6
        public final void d(View view, c7 c7Var) {
            AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
            this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
            if (iIntValue > 0) {
                accessibilityNodeInfo.setTraversalAfter(ClockFaceView.this.M.get(iIntValue - 1));
            }
            c7Var.n(c7.f.a(0, 1, iIntValue, 1, false, view.isSelected()));
            accessibilityNodeInfo.setClickable(true);
            c7Var.b(c7.a.g);
        }

        @Override // defpackage.e6
        public final boolean g(View view, int i, Bundle bundle) {
            ClockFaceView clockFaceView = ClockFaceView.this;
            ClockHandView clockHandView = clockFaceView.I;
            Rect rect = clockFaceView.J;
            if (i != 16) {
                return super.g(view, i, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(rect);
            float fCenterX = rect.centerX();
            float fCenterY = rect.centerY();
            clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.J = new Rect();
        this.K = new RectF();
        this.L = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.M = sparseArray;
        this.P = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pk30.l, i, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListA = ecv.a(1, context, typedArrayObtainStyledAttributes);
        this.W = colorStateListA;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.I = clockHandView;
        this.Q = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListA.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.O = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.c.add(this);
        int defaultColor = th50.a(R.color.material_timepicker_clockface, context.getTheme(), context.getResources()).getDefaultColor();
        ColorStateList colorStateListA2 = ecv.a(0, context, typedArrayObtainStyledAttributes);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.N = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.U = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.U.length, size); i2++) {
            TextView textView = sparseArray.get(i2);
            if (i2 >= this.U.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.U[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                r6i0.p(textView, this.N);
                textView.setTextColor(this.W);
            }
        }
        ClockHandView clockHandView2 = this.I;
        if (clockHandView2.b && !z) {
            clockHandView2.B = 1;
        }
        clockHandView2.b = z;
        clockHandView2.invalidate();
        this.R = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.S = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.T = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public final void E() {
        super.E();
        int i = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.M;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i).setVisibility(0);
            i++;
        }
    }

    public final void F() {
        SparseArray<TextView> sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.I.i;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.M;
            int size = sparseArray.size();
            rect = this.J;
            rectF = this.K;
            if (i >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.L;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.O, this.P, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void n(float f) {
        if (Math.abs(this.V - f) > 0.001f) {
            this.V = f;
            F();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) c7.e.a(1, this.U.length, 1).a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        F();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.T / Math.max(Math.max(this.R / displayMetrics.heightPixels, this.S / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }
}
