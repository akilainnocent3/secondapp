package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.material.slider.BaseSlider;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import defpackage.b78;
import defpackage.bbv;
import defpackage.c7;
import defpackage.cdv;
import defpackage.dj0;
import defpackage.dwi;
import defpackage.e42;
import defpackage.eai0;
import defpackage.ecv;
import defpackage.f0h;
import defpackage.f42;
import defpackage.f6w;
import defpackage.fcv;
import defpackage.g9i0;
import defpackage.gcv;
import defpackage.gof0;
import defpackage.gr0;
import defpackage.hb5;
import defpackage.hff0;
import defpackage.hxa;
import defpackage.ib5;
import defpackage.iyi;
import defpackage.j0g0;
import defpackage.ndv;
import defpackage.nlr;
import defpackage.o0b;
import defpackage.odf0;
import defpackage.pae;
import defpackage.pk30;
import defpackage.r6i0;
import defpackage.rh6;
import defpackage.rx80;
import defpackage.tcv;
import defpackage.th50;
import defpackage.wi1;
import defpackage.z4b;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends e42<S>, T extends f42<S>> extends View {
    public static final /* synthetic */ int j1 = 0;
    public final ArrayList A;
    public ArrayList<Float> A0;
    public final ArrayList B;
    public int B0;
    public final ArrayList C;
    public int C0;
    public boolean D;
    public float D0;
    public ValueAnimator E;
    public float[] E0;
    public ValueAnimator F;
    public int F0;
    public final int G;
    public int G0;
    public final int H;
    public int H0;
    public final int I;
    public int I0;
    public final int J;
    public boolean J0;
    public final int K;
    public boolean K0;
    public final int L;
    public ColorStateList L0;
    public final int M;
    public ColorStateList M0;
    public final int N;
    public ColorStateList N0;
    public int O;
    public ColorStateList O0;
    public final int P;
    public ColorStateList P0;
    public int Q;
    public final Path Q0;
    public int R;
    public final RectF R0;
    public int S;
    public final RectF S0;
    public int T;
    public final RectF T0;
    public int U;
    public final RectF U0;
    public int V;
    public final Rect V0;
    public int W;
    public final RectF W0;
    public final Rect X0;
    public final Matrix Y0;
    public final fcv Z0;
    public final Paint a;
    public int a0;
    public Drawable a1;
    public final Paint b;
    public int b0;
    public List<Drawable> b1;
    public final Paint c;
    public int c0;
    public float c1;
    public final Paint d;
    public int d0;
    public int d1;
    public final Paint e;
    public int e0;
    public final int e1;
    public final Paint f;
    public int f0;
    public final com.google.android.material.slider.b f1;
    public boolean g0;
    public final com.google.android.material.slider.c g1;
    public Drawable h0;
    public final com.google.android.material.slider.d h1;
    public final Paint i;
    public boolean i0;
    public boolean i1;
    public Drawable j0;
    public boolean k0;
    public ColorStateList l0;
    public Drawable m0;
    public boolean n0;
    public Drawable o0;
    public boolean p0;
    public ColorStateList q0;
    public int r0;
    public final int s0;
    public final int t0;
    public float u0;
    public final c v;
    public float v0;
    public final AccessibilityManager w;
    public MotionEvent w0;
    public boolean x0;
    public BaseSlider<S, L, T>.b y;
    public float y0;
    public final int z;
    public float z0;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();
        public float a;
        public float b;
        public ArrayList<Float> c;
        public float d;
        public boolean e;

        public class a implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            public final SliderState createFromParcel(Parcel parcel) {
                SliderState sliderState = new SliderState(parcel);
                sliderState.a = parcel.readFloat();
                sliderState.b = parcel.readFloat();
                ArrayList<Float> arrayList = new ArrayList<>();
                sliderState.c = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                sliderState.d = parcel.readFloat();
                sliderState.e = parcel.createBooleanArray()[0];
                return sliderState;
            }

            @Override // android.os.Parcelable.Creator
            public final SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.a);
            parcel.writeFloat(this.b);
            parcel.writeList(this.c);
            parcel.writeFloat(this.d);
            parcel.writeBooleanArray(new boolean[]{this.e});
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            BaseSlider baseSlider = BaseSlider.this;
            ViewOverlay contentViewOverlay = baseSlider.getContentViewOverlay();
            if (contentViewOverlay == null) {
                return;
            }
            ArrayList arrayList = baseSlider.A;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                contentViewOverlay.remove((j0g0) obj);
            }
        }
    }

    public class b implements Runnable {
        public int a = -1;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSlider.this.v.x(this.a, 4);
        }
    }

    public static class c extends f0h {
        public final BaseSlider<?, ?, ?> q;
        public final Rect r;

        public c(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.r = new Rect();
            this.q = baseSlider;
        }

        @Override // defpackage.f0h
        public final int n(float f, float f2) {
            int i = 0;
            while (true) {
                BaseSlider<?, ?, ?> baseSlider = this.q;
                if (i >= baseSlider.getValues().size()) {
                    return -1;
                }
                Rect rect = this.r;
                baseSlider.B(i, rect);
                if (rect.contains((int) f, (int) f2)) {
                    return i;
                }
                i++;
            }
        }

        @Override // defpackage.f0h
        public final void o(ArrayList arrayList) {
            int iA = 0;
            while (iA < this.q.getValues().size()) {
                iA = ndv.a(iA, iA, 1, arrayList);
            }
        }

        @Override // defpackage.f0h
        public final boolean s(int i, int i2, Bundle bundle) {
            BaseSlider<?, ?, ?> baseSlider = this.q;
            if (!baseSlider.isEnabled()) {
                return false;
            }
            if (i2 != 4096 && i2 != 8192) {
                if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    return false;
                }
                float f = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
                int i3 = BaseSlider.j1;
                if (!baseSlider.A(i, f)) {
                    return false;
                }
                baseSlider.C();
                baseSlider.postInvalidate();
                p(i);
                return true;
            }
            int i4 = BaseSlider.j1;
            float fRound = baseSlider.D0;
            if (fRound == 0.0f) {
                fRound = 1.0f;
            }
            float f2 = (baseSlider.z0 - baseSlider.y0) / fRound;
            if (f2 > 20.0f) {
                fRound *= Math.round(f2 / 20.0f);
            }
            if (i2 == 8192) {
                fRound = -fRound;
            }
            if (baseSlider.s()) {
                fRound = -fRound;
            }
            if (!baseSlider.A(i, cdv.a(baseSlider.getValues().get(i).floatValue() + fRound, baseSlider.getValueFrom(), baseSlider.getValueTo()))) {
                return false;
            }
            baseSlider.setActiveThumbIndex(i);
            com.google.android.material.slider.d dVar = baseSlider.h1;
            baseSlider.removeCallbacks(dVar);
            baseSlider.postDelayed(dVar, baseSlider.e1);
            baseSlider.C();
            baseSlider.postInvalidate();
            p(i);
            return true;
        }

        @Override // defpackage.f0h
        public final void u(int i, c7 c7Var) {
            Object tag;
            String string;
            AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
            c7Var.b(c7.a.t);
            BaseSlider<?, ?, ?> baseSlider = this.q;
            List<Float> values = baseSlider.getValues();
            Float f = values.get(i);
            float fFloatValue = f.floatValue();
            float valueFrom = baseSlider.getValueFrom();
            float valueTo = baseSlider.getValueTo();
            if (baseSlider.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    c7Var.a(8192);
                }
                if (fFloatValue < valueTo) {
                    c7Var.a(4096);
                }
            }
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            try {
                valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
                valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
                fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
            } catch (ParseException unused) {
                int i2 = BaseSlider.j1;
                Log.w("BaseSlider", "Error parsing value(" + f + "), valueFrom(" + valueFrom + "), and valueTo(" + valueTo + ") into a float.");
            }
            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
            c7Var.l(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (baseSlider.getContentDescription() != null) {
                sb.append(baseSlider.getContentDescription());
                sb.append(",");
            }
            String strM = baseSlider.m(fFloatValue);
            String string2 = baseSlider.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                if (i == baseSlider.getValues().size() - 1) {
                    string = baseSlider.getContext().getString(R.string.material_slider_range_end);
                } else {
                    string = i == 0 ? baseSlider.getContext().getString(R.string.material_slider_range_start) : "";
                }
                string2 = string;
            }
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            if (Build.VERSION.SDK_INT >= 30) {
                tag = r6i0.j.b(baseSlider);
            } else {
                tag = baseSlider.getTag(R.id.tag_state_description);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag;
            if (TextUtils.isEmpty(charSequence)) {
                Locale.getDefault();
                sb.append(string2 + ", " + strM);
            } else {
                c7Var.v(charSequence);
            }
            c7Var.o(sb.toString());
            Rect rect = this.r;
            baseSlider.B(i, rect);
            accessibilityNodeInfo.setBoundsInParent(rect);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final d b;
        public static final d c;
        public static final /* synthetic */ d[] d;

        /* JADX INFO: Fake field, exist only in values array */
        d EF0;

        static {
            d dVar = new d("BOTH", 0);
            d dVar2 = new d("LEFT", 1);
            a = dVar2;
            d dVar3 = new d("RIGHT", 2);
            b = dVar3;
            d dVar4 = new d("NONE", 3);
            c = dVar4;
            d = new d[]{dVar, dVar2, dVar3, dVar4};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) d.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.material.slider.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.material.slider.c] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.material.slider.d] */
    public BaseSlider(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(tcv.a(context, attributeSet, i, R.style.Widget_MaterialComponents_Slider), attributeSet, i);
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = false;
        this.b0 = -1;
        this.c0 = -1;
        this.g0 = false;
        this.i0 = false;
        this.k0 = false;
        this.n0 = false;
        this.p0 = false;
        this.x0 = false;
        this.A0 = new ArrayList<>();
        this.B0 = -1;
        this.C0 = -1;
        this.D0 = 0.0f;
        this.J0 = false;
        this.Q0 = new Path();
        this.R0 = new RectF();
        this.S0 = new RectF();
        this.T0 = new RectF();
        this.U0 = new RectF();
        this.V0 = new Rect();
        this.W0 = new RectF();
        this.X0 = new Rect();
        this.Y0 = new Matrix();
        fcv fcvVar = new fcv();
        this.Z0 = fcvVar;
        this.b1 = Collections.EMPTY_LIST;
        this.d1 = 0;
        this.f1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.b
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i3 = BaseSlider.j1;
                this.a.D();
            }
        };
        this.g1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.slider.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i3 = BaseSlider.j1;
                this.a.D();
            }
        };
        this.h1 = new Runnable() { // from class: com.google.android.material.slider.d
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = BaseSlider.j1;
                BaseSlider baseSlider = this.a;
                baseSlider.setActiveThumbIndex(-1);
                baseSlider.invalidate();
            }
        };
        Context context2 = getContext();
        this.i1 = isShown();
        this.a = new Paint();
        this.b = new Paint();
        Paint paint = new Paint(1);
        this.c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.i = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.P = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.H = dimensionPixelOffset;
        this.T = dimensionPixelOffset;
        this.I = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.J = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.K = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.L = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.M = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.t0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.s0 = resources.getDimensionPixelOffset(R.dimen.m3_slider_track_icon_padding);
        gof0.a(context2, attributeSet, i, R.style.Widget_MaterialComponents_Slider);
        int[] iArr = pk30.d0;
        gof0.b(context2, attributeSet, iArr, i, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_MaterialComponents_Slider);
        setOrientation(typedArrayObtainStyledAttributes.getInt(2, 0));
        this.z = typedArrayObtainStyledAttributes.getResourceId(10, R.style.Widget_MaterialComponents_Tooltip);
        this.y0 = typedArrayObtainStyledAttributes.getFloat(4, 0.0f);
        this.z0 = typedArrayObtainStyledAttributes.getFloat(5, 1.0f);
        setValues(Float.valueOf(this.y0));
        setCentered(typedArrayObtainStyledAttributes.getBoolean(6, false));
        this.D0 = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.N = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(11, bbv.d(context2)));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(27);
        int i3 = zHasValue ? 27 : 29;
        int i4 = zHasValue ? 27 : 28;
        ColorStateList colorStateListA = ecv.a(i3, context2, typedArrayObtainStyledAttributes);
        setTrackInactiveTintList(colorStateListA == null ? th50.a(R.color.material_slider_inactive_track_color, context2.getTheme(), context2.getResources()) : colorStateListA);
        ColorStateList colorStateListA2 = ecv.a(i4, context2, typedArrayObtainStyledAttributes);
        setTrackActiveTintList(colorStateListA2 == null ? th50.a(R.color.material_slider_active_track_color, context2.getTheme(), context2.getResources()) : colorStateListA2);
        fcvVar.s(ecv.a(12, context2, typedArrayObtainStyledAttributes));
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setThumbStrokeColor(ecv.a(16, context2, typedArrayObtainStyledAttributes));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(17, 0.0f));
        ColorStateList colorStateListA3 = ecv.a(7, context2, typedArrayObtainStyledAttributes);
        setHaloTintList(colorStateListA3 == null ? th50.a(R.color.material_slider_halo_color, context2.getTheme(), context2.getResources()) : colorStateListA3);
        if (typedArrayObtainStyledAttributes.hasValue(25)) {
            i2 = typedArrayObtainStyledAttributes.getInt(25, -1);
        } else {
            i2 = typedArrayObtainStyledAttributes.getBoolean(26, true) ? 0 : 2;
        }
        this.F0 = i2;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(20);
        int i5 = zHasValue2 ? 20 : 22;
        int i6 = zHasValue2 ? 20 : 21;
        ColorStateList colorStateListA4 = ecv.a(i5, context2, typedArrayObtainStyledAttributes);
        setTickInactiveTintList(colorStateListA4 == null ? th50.a(R.color.material_slider_inactive_tick_marks_color, context2.getTheme(), context2.getResources()) : colorStateListA4);
        ColorStateList colorStateListA5 = ecv.a(i6, context2, typedArrayObtainStyledAttributes);
        setTickActiveTintList(colorStateListA5 == null ? th50.a(R.color.material_slider_active_tick_marks_color, context2.getTheme(), context2.getResources()) : colorStateListA5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(18, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(40, 0));
        setTrackCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(30, -1));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(39, 0));
        setTrackIconActiveStart(ecv.d(34, context2, typedArrayObtainStyledAttributes));
        setTrackIconActiveEnd(ecv.d(33, context2, typedArrayObtainStyledAttributes));
        setTrackIconActiveColor(ecv.a(32, context2, typedArrayObtainStyledAttributes));
        setTrackIconInactiveStart(ecv.d(37, context2, typedArrayObtainStyledAttributes));
        setTrackIconInactiveEnd(ecv.d(36, context2, typedArrayObtainStyledAttributes));
        setTrackIconInactiveColor(ecv.a(35, context2, typedArrayObtainStyledAttributes));
        setTrackIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(38, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(13, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(31, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(23, this.d0 / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(24, this.d0 / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(9, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        fcvVar.w(2);
        this.G = ViewConfiguration.get(context2).getScaledTouchSlop();
        c cVar = new c(this);
        this.v = cVar;
        r6i0.p(this, cVar);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.w = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.e1 = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.e1 = 120000;
        }
    }

    private float[] getActiveRange() {
        float fFloatValue = this.A0.get(0).floatValue();
        float fFloatValue2 = ((Float) rh6.a(1, this.A0)).floatValue();
        if (this.A0.size() == 1) {
            fFloatValue = this.y0;
        }
        float fW = w(fFloatValue);
        float fW2 = w(fFloatValue2);
        if (o()) {
            float fMin = Math.min(0.5f, fW2);
            fW2 = Math.max(0.5f, fW2);
            fW = fMin;
        }
        return (o() || !(s() || t())) ? new float[]{fW, fW2} : new float[]{fW2, fW};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewOverlay getContentViewOverlay() {
        ViewGroup viewGroupD = eai0.d(this);
        if (viewGroupD == null) {
            return null;
        }
        return viewGroupD.getOverlay();
    }

    private int getDesiredTickCount() {
        return (int) (((this.z0 - this.y0) / this.D0) + 1.0f);
    }

    private int getMaxTickCount() {
        return (this.I0 / this.M) + 1;
    }

    private float getValueOfTouchPosition() {
        double dRound;
        float f = this.c1;
        float f2 = this.D0;
        if (f2 > 0.0f) {
            int i = (int) ((this.z0 - this.y0) / f2);
            dRound = ((double) Math.round(f * i)) / ((double) i);
        } else {
            dRound = f;
        }
        if (s() || t()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.z0;
        float f4 = this.y0;
        return (float) ((dRound * ((double) (f3 - f4))) + ((double) f4));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.c1;
        if (s() || t()) {
            f = 1.0f - f;
        }
        float f2 = this.z0;
        float f3 = this.y0;
        return hxa.a(f2, f3, f, f3);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        ViewGroup viewGroupD;
        int resourceId;
        ViewGroup viewGroupD2;
        if (arrayList.isEmpty()) {
            hb5.a("At least one value must be set");
            return;
        }
        Collections.sort(arrayList);
        if (this.A0.size() == arrayList.size() && this.A0.equals(arrayList)) {
            return;
        }
        this.A0 = arrayList;
        this.K0 = true;
        this.C0 = 0;
        C();
        ArrayList arrayList2 = this.A;
        if (arrayList2.size() > this.A0.size()) {
            List<j0g0> listSubList = arrayList2.subList(this.A0.size(), arrayList2.size());
            for (j0g0 j0g0Var : listSubList) {
                if (isAttachedToWindow() && (viewGroupD2 = eai0.d(this)) != null) {
                    viewGroupD2.getOverlay().remove(j0g0Var);
                    viewGroupD2.removeOnLayoutChangeListener(j0g0Var.a0);
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.A0.size()) {
            Context context = getContext();
            int i = this.z;
            j0g0 j0g0Var2 = new j0g0(context, i);
            TypedArray typedArrayD = gof0.d(j0g0Var2.X, null, pk30.m0, 0, i, new int[0]);
            Context context2 = j0g0Var2.X;
            j0g0Var2.h0 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z = typedArrayD.getBoolean(8, true);
            j0g0Var2.g0 = z;
            if (z) {
                rx80.a aVarH = j0g0Var2.b.a.h();
                aVarH.k = j0g0Var2.F();
                j0g0Var2.setShapeAppearanceModel(aVarH.a());
            } else {
                j0g0Var2.h0 = 0;
            }
            CharSequence text = typedArrayD.getText(6);
            boolean zEquals = TextUtils.equals(j0g0Var2.W, text);
            hff0 hff0Var = j0g0Var2.Z;
            if (!zEquals) {
                j0g0Var2.W = text;
                hff0Var.e = true;
                j0g0Var2.invalidateSelf();
            }
            odf0 odf0Var = (!typedArrayD.hasValue(0) || (resourceId = typedArrayD.getResourceId(0, 0)) == 0) ? null : new odf0(context2, resourceId);
            if (odf0Var != null && typedArrayD.hasValue(1)) {
                odf0Var.k = ecv.a(1, context2, typedArrayD);
            }
            hff0Var.c(odf0Var, context2);
            TypedValue typedValueE = bbv.e(R.attr.colorOnBackground, context2, j0g0.class.getCanonicalName());
            int i2 = typedValueE.resourceId;
            int color = i2 != 0 ? context2.getColor(i2) : typedValueE.data;
            TypedValue typedValueE2 = bbv.e(android.R.attr.colorBackground, context2, j0g0.class.getCanonicalName());
            int i3 = typedValueE2.resourceId;
            j0g0Var2.s(ColorStateList.valueOf(typedArrayD.getColor(7, b78.d(b78.f(color, 153), b78.f(i3 != 0 ? context2.getColor(i3) : typedValueE2.data, 229)))));
            TypedValue typedValueE3 = bbv.e(R.attr.colorSurface, context2, j0g0.class.getCanonicalName());
            int i4 = typedValueE3.resourceId;
            j0g0Var2.y(ColorStateList.valueOf(i4 != 0 ? context2.getColor(i4) : typedValueE3.data));
            j0g0Var2.c0 = typedArrayD.getDimensionPixelSize(2, 0);
            j0g0Var2.d0 = typedArrayD.getDimensionPixelSize(4, 0);
            j0g0Var2.e0 = typedArrayD.getDimensionPixelSize(5, 0);
            j0g0Var2.f0 = typedArrayD.getDimensionPixelSize(3, 0);
            typedArrayD.recycle();
            arrayList2.add(j0g0Var2);
            if (isAttachedToWindow() && (viewGroupD = eai0.d(this)) != null) {
                int[] iArr = new int[2];
                viewGroupD.getLocationOnScreen(iArr);
                j0g0Var2.i0 = iArr[0];
                viewGroupD.getWindowVisibleDisplayFrame(j0g0Var2.b0);
                viewGroupD.addOnLayoutChangeListener(j0g0Var2.a0);
            }
        }
        int i5 = arrayList2.size() == 1 ? 0 : 1;
        int size = arrayList2.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList2.get(i6);
            i6++;
            ((j0g0) obj).z(i5);
        }
        ArrayList arrayList3 = this.B;
        int size2 = arrayList3.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList3.get(i7);
            i7++;
            e42 e42Var = (e42) obj2;
            ArrayList<Float> arrayList4 = this.A0;
            int size3 = arrayList4.size();
            int i8 = 0;
            while (i8 < size3) {
                Float f = arrayList4.get(i8);
                i8++;
                e42Var.a(this, f.floatValue(), false);
            }
        }
        postInvalidate();
    }

    public final boolean A(int i, float f) {
        this.C0 = i;
        int i2 = 0;
        if (Math.abs(f - this.A0.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.d1 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = (minSeparation - this.T) / this.I0;
                float f3 = this.y0;
                minSeparation = hxa.a(f3, this.z0, f2, f3);
            }
        }
        if (s() || t()) {
            minSeparation = -minSeparation;
        }
        int i3 = i + 1;
        int i4 = i - 1;
        this.A0.set(i, Float.valueOf(cdv.a(f, i4 < 0 ? this.y0 : minSeparation + this.A0.get(i4).floatValue(), i3 >= this.A0.size() ? this.z0 : this.A0.get(i3).floatValue() - minSeparation)));
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((e42) obj).a(this, this.A0.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.w;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            BaseSlider<S, L, T>.b bVar = this.y;
            if (bVar == null) {
                this.y = new b();
            } else {
                removeCallbacks(bVar);
            }
            BaseSlider<S, L, T>.b bVar2 = this.y;
            bVar2.a = i;
            postDelayed(bVar2, 200L);
        }
        return true;
    }

    public final void B(int i, Rect rect) {
        int iW = this.T + ((int) (w(getValues().get(i).floatValue()) * this.I0));
        int iD = d();
        int iMax = Math.max(this.U / 2, this.N / 2);
        int iMax2 = Math.max(this.V / 2, this.N / 2);
        RectF rectF = new RectF(iW - iMax, iD - iMax2, iW + iMax, iD + iMax2);
        if (t()) {
            this.Y0.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void C() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            float fW = (w(this.A0.get(this.C0).floatValue()) * this.I0) + this.T;
            int iD = d();
            int i = this.W;
            float f = i;
            float[] fArr = {fW - f, iD - i, fW + f, iD + i};
            if (t()) {
                this.Y0.mapPoints(fArr);
            }
            background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
    }

    public final void D() {
        float f;
        boolean zT = t();
        boolean zS = s();
        float f2 = 0.5f;
        if (zT && zS) {
            f = 0.5f;
            f2 = -0.2f;
        } else {
            f = 1.2f;
            if (zT) {
                f2 = 1.2f;
                f = 0.5f;
            }
        }
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j0g0 j0g0Var = (j0g0) obj;
            j0g0Var.l0 = f2;
            j0g0Var.m0 = f;
            j0g0Var.invalidateSelf();
        }
        int i2 = this.R;
        if (i2 == 0 || i2 == 1) {
            if (this.B0 == -1 || !isEnabled()) {
                l();
                return;
            } else {
                k();
                return;
            }
        }
        if (i2 == 2) {
            l();
            return;
        }
        if (i2 != 3) {
            dwi.a(this.R, "Unexpected labelBehavior: ");
            return;
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            eai0.d(this).getHitRect(rect);
            if (getLocalVisibleRect(rect) && this.i1) {
                k();
                return;
            }
        }
        l();
    }

    public final void E() {
        int i = this.a0;
        if (i > 0) {
            int i2 = this.U;
            this.b0 = i2;
            this.c0 = i;
            int iRound = Math.round(i2 * 0.5f);
            int i3 = this.U - iRound;
            setThumbWidth(iRound);
            setThumbTrackGapSize(this.a0 - (i3 / 2));
        }
    }

    public final void F() {
        N();
        int iMin = 0;
        if (this.D0 <= 0.0f) {
            G(0);
            return;
        }
        int i = this.F0;
        if (i == 0) {
            iMin = Math.min(getDesiredTickCount(), getMaxTickCount());
        } else if (i == 1) {
            int desiredTickCount = getDesiredTickCount();
            if (desiredTickCount <= getMaxTickCount()) {
                iMin = desiredTickCount;
            }
        } else if (i != 2) {
            iyi.a(this.F0, "Unexpected tickVisibilityMode: ");
            return;
        }
        G(iMin);
    }

    public final void G(int i) {
        if (i == 0) {
            this.E0 = null;
            return;
        }
        float[] fArr = this.E0;
        if (fArr == null || fArr.length != i * 2) {
            this.E0 = new float[i * 2];
        }
        float f = this.I0 / (i - 1);
        float fD = d();
        for (int i2 = 0; i2 < i * 2; i2 += 2) {
            float[] fArr2 = this.E0;
            fArr2[i2] = ((i2 / 2.0f) * f) + this.T;
            fArr2[i2 + 1] = fD;
        }
        if (t()) {
            this.Y0.mapPoints(this.E0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    public final void H(Canvas canvas, Paint paint, RectF rectF, float f, d dVar) {
        float fMax;
        if (rectF.isEmpty()) {
            return;
        }
        if (this.A0.isEmpty() || this.a0 <= 0) {
            fMax = f;
        } else {
            float fP = P(this.A0.get((s() || t()) ? this.A0.size() - 1 : 0).floatValue()) - this.T;
            if (fP < f) {
                fMax = Math.max(fP, this.f0);
            } else {
                fMax = f;
            }
        }
        if (!this.A0.isEmpty() && this.a0 > 0) {
            float fP2 = P(this.A0.get((s() || t()) ? 0 : this.A0.size() - 1).floatValue()) - this.T;
            float f2 = this.I0;
            if (fP2 > f2 - f) {
                f = Math.max(f2 - fP2, this.f0);
            }
        }
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 1) {
            f = this.f0;
        } else if (iOrdinal == 2) {
            fMax = this.f0;
        } else if (iOrdinal == 3) {
            fMax = this.f0;
            f = fMax;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (this.a0 > 0) {
            paint.setAntiAlias(true);
        }
        RectF rectF2 = new RectF(rectF);
        boolean zT = t();
        Matrix matrix = this.Y0;
        if (zT) {
            matrix.mapRect(rectF2);
        }
        Path path = this.Q0;
        path.reset();
        if (rectF.width() >= fMax + f) {
            path.addRoundRect(rectF2, t() ? new float[]{fMax, fMax, fMax, fMax, f, f, f, f} : new float[]{fMax, fMax, f, f, f, f, fMax, fMax}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float fMin = Math.min(fMax, f);
        float fMax2 = Math.max(fMax, f);
        canvas.save();
        path.addRoundRect(rectF2, fMin, fMin, Path.Direction.CW);
        canvas.clipPath(path);
        int iOrdinal2 = dVar.ordinal();
        RectF rectF3 = this.U0;
        if (iOrdinal2 == 1) {
            float f3 = rectF.left;
            rectF3.set(f3, rectF.top, (2.0f * fMax2) + f3, rectF.bottom);
        } else if (iOrdinal2 != 2) {
            rectF3.set(rectF.centerX() - fMax2, rectF.top, rectF.centerX() + fMax2, rectF.bottom);
        } else {
            float f4 = rectF.right;
            rectF3.set(f4 - (2.0f * fMax2), rectF.top, f4, rectF.bottom);
        }
        if (t()) {
            matrix.mapRect(rectF3);
        }
        canvas.drawRoundRect(rectF3, fMax2, fMax2, paint);
        canvas.restore();
    }

    public final void I() {
        Drawable drawableMutate = this.j0;
        if (drawableMutate != null) {
            boolean z = this.k0;
            if (!z && this.l0 != null) {
                drawableMutate = drawableMutate.mutate();
                this.j0 = drawableMutate;
                z = true;
                this.k0 = true;
            }
            if (z) {
                drawableMutate.setTintList(this.l0);
            }
        }
    }

    public final void J() {
        Drawable drawableMutate = this.h0;
        if (drawableMutate != null) {
            boolean z = this.i0;
            if (!z && this.l0 != null) {
                drawableMutate = drawableMutate.mutate();
                this.h0 = drawableMutate;
                z = true;
                this.i0 = true;
            }
            if (z) {
                drawableMutate.setTintList(this.l0);
            }
        }
    }

    public final void K() {
        Drawable drawableMutate = this.o0;
        if (drawableMutate != null) {
            boolean z = this.p0;
            if (!z && this.q0 != null) {
                drawableMutate = drawableMutate.mutate();
                this.o0 = drawableMutate;
                z = true;
                this.p0 = true;
            }
            if (z) {
                drawableMutate.setTintList(this.q0);
            }
        }
    }

    public final void L() {
        Drawable drawableMutate = this.m0;
        if (drawableMutate != null) {
            boolean z = this.n0;
            if (!z && this.q0 != null) {
                drawableMutate = drawableMutate.mutate();
                this.m0 = drawableMutate;
                z = true;
                this.n0 = true;
            }
            if (z) {
                drawableMutate.setTintList(this.q0);
            }
        }
    }

    public final void M(boolean z) {
        int paddingTop;
        int paddingBottom;
        boolean z2;
        if (t()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingBottom + paddingTop;
        int iMax = Math.max(this.P, Math.max(this.S + i, this.V + i));
        boolean z3 = true;
        if (iMax == this.Q) {
            z2 = false;
        } else {
            this.Q = iMax;
            z2 = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.U / 2) - this.I, 0), Math.max((this.S - this.J) / 2, 0)), Math.max(Math.max(this.G0 - this.K, 0), Math.max(this.H0 - this.L, 0))) + this.H;
        if (this.T == iMax2) {
            z3 = false;
        } else {
            this.T = iMax2;
            if (isLaidOut()) {
                this.I0 = Math.max((t() ? getHeight() : getWidth()) - (this.T * 2), 0);
                F();
            }
        }
        if (t()) {
            float fD = d();
            Matrix matrix = this.Y0;
            matrix.reset();
            matrix.setRotate(90.0f, fD, fD);
        }
        if (z2 || z) {
            requestLayout();
        } else if (z3) {
            postInvalidate();
        }
    }

    public final void N() {
        if (this.K0) {
            float f = this.y0;
            float f2 = this.z0;
            if (f >= f2) {
                throw new IllegalStateException("valueFrom(" + f + ") must be smaller than valueTo(" + f2 + ")");
            }
            ArrayList<Float> arrayList = this.A0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Float f3 = arrayList.get(i);
                i++;
                Float f4 = f3;
                if (f4.floatValue() < this.y0 || f4.floatValue() > this.z0) {
                    float f5 = this.y0;
                    float f6 = this.z0;
                    StringBuilder sb = new StringBuilder("Slider value(");
                    sb.append(f4);
                    sb.append(") must be greater or equal to valueFrom(");
                    sb.append(f5);
                    sb.append("), and lower or equal to valueTo(");
                    ib5.a(wi1.a(f6, ")", sb));
                    return;
                }
                if (this.D0 > 0.0f && !O(f4.floatValue())) {
                    float f7 = this.y0;
                    float f8 = this.D0;
                    throw new IllegalStateException("Value(" + f4 + ") must be equal to valueFrom(" + f7 + ") plus a multiple of stepSize(" + f8 + ") when using stepSize(" + f8 + ")");
                }
            }
            if (this.D0 > 0.0f && !O(this.z0)) {
                float f9 = this.D0;
                float f10 = this.y0;
                float f11 = this.z0;
                StringBuilder sb2 = new StringBuilder("The stepSize(");
                sb2.append(f9);
                sb2.append(") must be 0, or a factor of the valueFrom(");
                sb2.append(f10);
                sb2.append(")-valueTo(");
                ib5.a(wi1.a(f11, ") range", sb2));
                return;
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f12 = this.D0;
            if (f12 > 0.0f && minSeparation > 0.0f) {
                if (this.d1 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + f12 + ")");
                }
                if (minSeparation < f12 || !p(minSeparation)) {
                    float f13 = this.D0;
                    StringBuilder sb3 = new StringBuilder("minSeparation(");
                    sb3.append(minSeparation);
                    sb3.append(") must be greater or equal and a multiple of stepSize(");
                    sb3.append(f13);
                    sb3.append(") when using stepSize(");
                    ib5.a(wi1.a(f13, ")", sb3));
                    return;
                }
            }
            float f14 = this.D0;
            if (f14 != 0.0f) {
                if (((int) f14) != f14) {
                    Log.w("BaseSlider", "Floating point value used for stepSize(" + f14 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f15 = this.y0;
                if (((int) f15) != f15) {
                    Log.w("BaseSlider", "Floating point value used for valueFrom(" + f15 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f16 = this.z0;
                if (((int) f16) != f16) {
                    Log.w("BaseSlider", "Floating point value used for valueTo(" + f16 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.K0 = false;
        }
    }

    public final boolean O(float f) {
        return p(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.y0)), MathContext.DECIMAL64).doubleValue());
    }

    public final float P(float f) {
        return (w(f) * this.I0) + this.T;
    }

    public final void b(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.U, this.V);
        } else {
            float fMax = Math.max(this.U, this.V) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final void c(Canvas canvas, RectF rectF, Drawable drawable, boolean z) {
        if (drawable != null) {
            int i = this.r0;
            float f = rectF.right - rectF.left;
            int i2 = this.s0;
            float f2 = (i2 * 2) + i;
            RectF rectF2 = this.W0;
            if (f >= f2) {
                float f3 = z ^ (s() || t()) ? rectF.left + i2 : (rectF.right - i2) - i;
                float f4 = i;
                float fD = d() - (f4 / 2.0f);
                rectF2.set(f3, fD, f3 + f4, f4 + fD);
            } else {
                rectF2.setEmpty();
            }
            if (rectF2.isEmpty()) {
                return;
            }
            if (t()) {
                this.Y0.mapRect(rectF2);
            }
            Rect rect = this.X0;
            rectF2.round(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    public final int d() {
        int i = this.Q / 2;
        int i2 = this.R;
        return i + ((i2 == 1 || i2 == 3) ? ((j0g0) this.A.get(0)).getIntrinsicHeight() : 0);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.v.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.setColor(n(this.P0));
        this.b.setColor(n(this.O0));
        this.e.setColor(n(this.N0));
        this.f.setColor(n(this.M0));
        this.i.setColor(n(this.N0));
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j0g0 j0g0Var = (j0g0) obj;
            if (j0g0Var.isStateful()) {
                j0g0Var.setState(getDrawableState());
            }
        }
        fcv fcvVar = this.Z0;
        if (fcvVar.isStateful()) {
            fcvVar.setState(getDrawableState());
        }
        int iN = n(this.L0);
        Paint paint = this.d;
        paint.setColor(iN);
        paint.setAlpha(63);
    }

    public final ValueAnimator e(boolean z) {
        int iC;
        TimeInterpolator timeInterpolatorC;
        float fFloatValue = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.F : this.E;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
        if (z) {
            iC = bbv.c(getContext(), R.attr.motionDurationMedium4, 83);
            timeInterpolatorC = f6w.c(getContext(), R.attr.motionEasingEmphasizedInterpolator, dj0.e);
        } else {
            iC = bbv.c(getContext(), R.attr.motionDurationShort3, 117);
            timeInterpolatorC = f6w.c(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, dj0.c);
        }
        valueAnimatorOfFloat.setDuration(iC);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorC);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = BaseSlider.j1;
                float fFloatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                BaseSlider baseSlider = this.a;
                ArrayList arrayList = baseSlider.A;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    j0g0 j0g0Var = (j0g0) obj;
                    j0g0Var.j0 = fFloatValue2;
                    j0g0Var.k0 = fFloatValue2;
                    j0g0Var.n0 = dj0.b(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue2);
                    j0g0Var.invalidateSelf();
                }
                baseSlider.postInvalidateOnAnimation();
            }
        });
        return valueAnimatorOfFloat;
    }

    public final void f(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF, d dVar) {
        if (f2 - f > getTrackCornerSize() - this.a0) {
            rectF.set(f, f3, f2, f4);
        } else {
            rectF.setEmpty();
        }
        H(canvas, this.a, rectF, getTrackCornerSize(), dVar);
    }

    public final void g(Canvas canvas, float f, float f2) {
        ArrayList<Float> arrayList = this.A0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Float f3 = arrayList.get(i);
            i++;
            float fP = P(f3.floatValue());
            float f4 = (this.U / 2.0f) + this.a0;
            if (f >= fP - f4 && f <= fP + f4) {
                return;
            }
        }
        boolean zT = t();
        Paint paint = this.i;
        if (zT) {
            canvas.drawPoint(f2, f, paint);
        } else {
            canvas.drawPoint(f, f2, paint);
        }
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.v.k;
    }

    public int getActiveThumbIndex() {
        return this.B0;
    }

    public int getFocusedThumbIndex() {
        return this.C0;
    }

    public int getHaloRadius() {
        return this.W;
    }

    public ColorStateList getHaloTintList() {
        return this.L0;
    }

    public int getLabelBehavior() {
        return this.R;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.D0;
    }

    public float getThumbElevation() {
        return this.Z0.b.n;
    }

    public int getThumbHeight() {
        return this.V;
    }

    public int getThumbRadius() {
        return this.U / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.Z0.b.e;
    }

    public float getThumbStrokeWidth() {
        return this.Z0.b.k;
    }

    public ColorStateList getThumbTintList() {
        return this.Z0.b.d;
    }

    public int getThumbTrackGapSize() {
        return this.a0;
    }

    public int getThumbWidth() {
        return this.U;
    }

    public int getTickActiveRadius() {
        return this.G0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.M0;
    }

    public int getTickInactiveRadius() {
        return this.H0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.N0;
    }

    public ColorStateList getTickTintList() {
        if (this.N0.equals(this.M0)) {
            return this.M0;
        }
        ib5.a("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        return null;
    }

    public int getTickVisibilityMode() {
        return this.F0;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.O0;
    }

    public int getTrackCornerSize() {
        int i = this.e0;
        return i == -1 ? this.S / 2 : i;
    }

    public int getTrackHeight() {
        return this.S;
    }

    public ColorStateList getTrackIconActiveColor() {
        return this.l0;
    }

    public Drawable getTrackIconActiveEnd() {
        return this.j0;
    }

    public Drawable getTrackIconActiveStart() {
        return this.h0;
    }

    public ColorStateList getTrackIconInactiveColor() {
        return this.q0;
    }

    public Drawable getTrackIconInactiveEnd() {
        return this.o0;
    }

    public Drawable getTrackIconInactiveStart() {
        return this.m0;
    }

    public int getTrackIconSize() {
        return this.r0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.P0;
    }

    public int getTrackInsideCornerSize() {
        return this.f0;
    }

    public int getTrackSidePadding() {
        return this.T;
    }

    public int getTrackStopIndicatorSize() {
        return this.d0;
    }

    public ColorStateList getTrackTintList() {
        if (this.P0.equals(this.O0)) {
            return this.O0;
        }
        ib5.a("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        return null;
    }

    public int getTrackWidth() {
        return this.I0;
    }

    public float getValueFrom() {
        return this.y0;
    }

    public float getValueTo() {
        return this.z0;
    }

    public List<Float> getValues() {
        return new ArrayList(this.A0);
    }

    public final void h(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        if (t()) {
            canvas.concat(this.Y0);
        }
        canvas.translate((this.T + ((int) (w(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    public final void i(int i, int i2, Canvas canvas, Paint paint) {
        float f;
        float f2;
        while (i < i2) {
            boolean zT = t();
            float[] fArr = this.E0;
            float f3 = zT ? fArr[i + 1] : fArr[i];
            float f4 = (this.U / 2.0f) + this.a0;
            Iterator<Float> it = this.A0.iterator();
            if (it.hasNext()) {
                float fP = P(it.next().floatValue());
                if (f3 < fP - f4 || f3 > fP + f4) {
                    if (o()) {
                        f = (this.U / 2.0f) + this.a0;
                        f2 = ((this.T * 2) + this.I0) / 2.0f;
                        if (f3 >= f2 - f || f3 > f2 + f) {
                            float[] fArr2 = this.E0;
                            canvas.drawPoint(fArr2[i], fArr2[i + 1], paint);
                        }
                    } else {
                        float[] fArr3 = this.E0;
                        canvas.drawPoint(fArr3[i], fArr3[i + 1], paint);
                    }
                }
            } else if (o()) {
                f = (this.U / 2.0f) + this.a0;
                f2 = ((this.T * 2) + this.I0) / 2.0f;
                if (f3 >= f2 - f) {
                    float[] fArr4 = this.E0;
                    canvas.drawPoint(fArr4[i], fArr4[i + 1], paint);
                } else {
                    float[] fArr5 = this.E0;
                    canvas.drawPoint(fArr5[i], fArr5[i + 1], paint);
                }
            } else {
                float[] fArr6 = this.E0;
                canvas.drawPoint(fArr6[i], fArr6[i + 1], paint);
            }
            i += 2;
        }
    }

    public final void j(Canvas canvas, RectF rectF, RectF rectF2) {
        if (this.h0 == null && this.j0 == null && this.m0 == null && this.o0 == null) {
            return;
        }
        if (this.A0.size() > 1) {
            Log.w("BaseSlider", "Track icons can only be used when only 1 thumb is present.");
        }
        c(canvas, rectF, this.h0, true);
        c(canvas, rectF2, this.m0, true);
        c(canvas, rectF, this.j0, false);
        c(canvas, rectF2, this.o0, false);
    }

    public final void k() {
        if (!this.D) {
            this.D = true;
            ValueAnimator valueAnimatorE = e(true);
            this.E = valueAnimatorE;
            this.F = null;
            valueAnimatorE.start();
        }
        ArrayList arrayList = this.A;
        Iterator it = arrayList.iterator();
        for (int i = 0; i < this.A0.size() && it.hasNext(); i++) {
            if (i != this.C0) {
                z((j0g0) it.next(), this.A0.get(i).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.A0.size())));
        }
        z((j0g0) it.next(), this.A0.get(this.C0).floatValue());
    }

    public final void l() {
        if (this.D) {
            this.D = false;
            ValueAnimator valueAnimatorE = e(false);
            this.F = valueAnimatorE;
            this.E = null;
            valueAnimatorE.addListener(new a());
            this.F.start();
        }
    }

    public final String m(float f) {
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    public final int n(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public boolean o() {
        return this.g0;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i1 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.f1);
        getViewTreeObserver().addOnGlobalLayoutListener(this.g1);
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j0g0 j0g0Var = (j0g0) obj;
            ViewGroup viewGroupD = eai0.d(this);
            if (viewGroupD == null) {
                j0g0Var.getClass();
            } else {
                j0g0Var.getClass();
                int[] iArr = new int[2];
                viewGroupD.getLocationOnScreen(iArr);
                j0g0Var.i0 = iArr[0];
                viewGroupD.getWindowVisibleDisplayFrame(j0g0Var.b0);
                viewGroupD.addOnLayoutChangeListener(j0g0Var.a0);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        BaseSlider<S, L, T>.b bVar = this.y;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        int i = 0;
        this.D = false;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j0g0 j0g0Var = (j0g0) obj;
            ViewGroup viewGroupD = eai0.d(this);
            if (viewGroupD != null) {
                viewGroupD.getOverlay().remove(j0g0Var);
                viewGroupD.removeOnLayoutChangeListener(j0g0Var.a0);
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f1);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.g1);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0139  */
    /* JADX WARN: Code duplicated, block: B:58:0x0144  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        d dVar;
        int i2;
        float f4;
        char c2;
        int i3;
        BaseSlider<S, L, T> baseSlider = this;
        if (baseSlider.K0) {
            baseSlider.N();
            baseSlider.F();
        }
        super.onDraw(canvas);
        int iD = baseSlider.d();
        int i4 = baseSlider.I0;
        float[] activeRange = baseSlider.getActiveRange();
        float f5 = iD;
        float f6 = 2.0f;
        float f7 = baseSlider.S / 2.0f;
        float f8 = f5 - f7;
        float f9 = f7 + f5;
        float trackCornerSize = baseSlider.T - baseSlider.getTrackCornerSize();
        int i5 = 0;
        float f10 = i4;
        float f11 = ((activeRange[0] * f10) + baseSlider.T) - baseSlider.a0;
        RectF rectF = baseSlider.S0;
        d dVar2 = d.a;
        baseSlider.f(trackCornerSize, f11, f8, f9, canvas, rectF, dVar2);
        int i6 = baseSlider.T;
        float f12 = (activeRange[1] * f10) + i6 + baseSlider.a0;
        float trackCornerSize2 = i6 + i4 + baseSlider.getTrackCornerSize();
        RectF rectF2 = baseSlider.T0;
        d dVar3 = d.b;
        int i7 = 1;
        baseSlider.f(f12, trackCornerSize2, f8, f9, canvas, rectF2, dVar3);
        int i8 = baseSlider.I0;
        float[] activeRange2 = baseSlider.getActiveRange();
        float f13 = baseSlider.T;
        float f14 = i8;
        float f15 = (activeRange2[1] * f14) + f13;
        float f16 = (activeRange2[0] * f14) + f13;
        int i9 = 2;
        float fP = f15;
        RectF rectF3 = baseSlider.R0;
        if (f16 >= f15) {
            rectF3.setEmpty();
        } else {
            if (baseSlider.A0.size() != 1 || baseSlider.o()) {
                dVar3 = d.c;
            } else if (!baseSlider.s() && !baseSlider.t()) {
                dVar3 = dVar2;
            }
            int i10 = 0;
            while (i10 < baseSlider.A0.size()) {
                if (baseSlider.A0.size() > i7) {
                    fP = i10 > 0 ? baseSlider.P(baseSlider.A0.get(i10 - 1).floatValue()) : f16;
                    float fP2 = baseSlider.P(baseSlider.A0.get(i10).floatValue());
                    if (baseSlider.s() || baseSlider.t()) {
                        f16 = fP2;
                    } else {
                        f16 = fP;
                        fP = fP2;
                    }
                }
                int trackCornerSize3 = baseSlider.getTrackCornerSize();
                float f17 = f6;
                int iOrdinal = dVar3.ordinal();
                if (iOrdinal != i7) {
                    if (iOrdinal == i9) {
                        f16 += baseSlider.a0;
                        fP += trackCornerSize3;
                    } else if (iOrdinal == 3) {
                        if (!baseSlider.o()) {
                            f4 = baseSlider.a0;
                            f16 += f4;
                            fP -= f4;
                        } else if (activeRange2[i7] == 0.5f) {
                            f16 += baseSlider.a0;
                        } else if (activeRange2[0] == 0.5f) {
                            i = baseSlider.a0;
                        }
                    }
                    f = f16;
                    f2 = fP;
                    if (f >= f2) {
                        rectF3.setEmpty();
                        dVar = dVar3;
                        i2 = 2;
                        f3 = f2;
                    } else {
                        float f18 = baseSlider.S / f17;
                        rectF3.set(f, f5 - f18, f2, f18 + f5);
                        float f19 = trackCornerSize3;
                        d dVar4 = dVar3;
                        f3 = f2;
                        dVar = dVar4;
                        i2 = 2;
                        baseSlider.H(canvas, baseSlider.b, rectF3, f19, dVar);
                    }
                    i10++;
                    float f20 = f3;
                    dVar3 = dVar;
                    fP = f20;
                    i9 = i2;
                    f16 = f;
                    f6 = f17;
                    i7 = i7;
                } else {
                    f16 -= trackCornerSize3;
                    i = baseSlider.a0;
                }
                f4 = i;
                fP -= f4;
                f = f16;
                f2 = fP;
                if (f >= f2) {
                    rectF3.setEmpty();
                    dVar = dVar3;
                    i2 = 2;
                    f3 = f2;
                } else {
                    float f110 = baseSlider.S / f17;
                    rectF3.set(f, f5 - f110, f2, f110 + f5);
                    float f111 = trackCornerSize3;
                    d dVar5 = dVar3;
                    f3 = f2;
                    dVar = dVar5;
                    i2 = 2;
                    baseSlider.H(canvas, baseSlider.b, rectF3, f111, dVar);
                }
                i10++;
                float f21 = f3;
                dVar3 = dVar;
                fP = f21;
                i9 = i2;
                f16 = f;
                f6 = f17;
                i7 = i7;
            }
        }
        Canvas canvas2 = canvas;
        int i11 = i7;
        float f22 = f6;
        int i12 = i9;
        if (baseSlider.s() || baseSlider.t()) {
            baseSlider.j(canvas2, rectF3, rectF);
        } else {
            baseSlider.j(canvas2, rectF3, rectF2);
        }
        float[] fArr = baseSlider.E0;
        if (fArr != null && fArr.length != 0) {
            float[] activeRange3 = baseSlider.getActiveRange();
            int iCeil = (int) Math.ceil(((baseSlider.E0.length / f22) - 1.0f) * activeRange3[0]);
            int iFloor = (int) Math.floor(((baseSlider.E0.length / f22) - 1.0f) * activeRange3[i11]);
            Paint paint = baseSlider.e;
            if (iCeil > 0) {
                baseSlider.i(0, iCeil * 2, canvas2, paint);
            }
            if (iCeil <= iFloor) {
                baseSlider.i(iCeil * i12, (iFloor + 1) * i12, canvas2, baseSlider.f);
            }
            int i13 = (iFloor + 1) * i12;
            float[] fArr2 = baseSlider.E0;
            if (i13 < fArr2.length) {
                baseSlider.i(i13, fArr2.length, canvas2, paint);
            }
        }
        if (baseSlider.d0 > 0 && !baseSlider.A0.isEmpty()) {
            float fFloatValue = ((Float) rh6.a(i11, baseSlider.A0)).floatValue();
            float f23 = baseSlider.z0;
            if (fFloatValue < f23) {
                baseSlider.g(canvas2, baseSlider.P(f23), f5);
            }
            if (baseSlider.o() || (baseSlider.A0.size() > 1 && baseSlider.A0.get(0).floatValue() > baseSlider.y0)) {
                baseSlider.g(canvas2, baseSlider.P(baseSlider.y0), f5);
            }
        }
        if ((baseSlider.x0 || baseSlider.isFocused()) && baseSlider.isEnabled()) {
            int i14 = baseSlider.I0;
            if (baseSlider.getBackground() instanceof RippleDrawable) {
                baseSlider = baseSlider;
            } else {
                float[] fArr3 = new float[i12];
                fArr3[0] = (baseSlider.w(baseSlider.A0.get(baseSlider.C0).floatValue()) * i14) + baseSlider.T;
                fArr3[1] = f5;
                if (baseSlider.t()) {
                    baseSlider.Y0.mapPoints(fArr3);
                }
                if (Build.VERSION.SDK_INT < 28) {
                    float f24 = fArr3[0];
                    float f25 = baseSlider.W;
                    c2 = 1;
                    float f26 = fArr3[1];
                    canvas.clipRect(f24 - f25, f26 - f25, f24 + f25, f26 + f25, Region.Op.UNION);
                    canvas2 = canvas;
                } else {
                    c2 = 1;
                }
                canvas2.drawCircle(fArr3[0], fArr3[c2], baseSlider.W, baseSlider.d);
            }
        } else {
            baseSlider = baseSlider;
        }
        baseSlider.D();
        int i15 = baseSlider.I0;
        while (i5 < baseSlider.A0.size()) {
            float fFloatValue2 = baseSlider.A0.get(i5).floatValue();
            Drawable drawable = baseSlider.a1;
            if (drawable != null) {
                i3 = iD;
                baseSlider.h(canvas2, i15, i3, fFloatValue2, drawable);
            } else {
                BaseSlider<S, L, T> baseSlider2 = baseSlider;
                i3 = iD;
                if (i5 < baseSlider2.b1.size()) {
                    baseSlider2.h(canvas, i15, i3, fFloatValue2, baseSlider2.b1.get(i5));
                } else {
                    if (!baseSlider2.isEnabled()) {
                        canvas.drawCircle((baseSlider2.w(fFloatValue2) * i15) + baseSlider2.T, f5, baseSlider2.getThumbRadius(), baseSlider2.c);
                    }
                    baseSlider2.h(canvas, i15, i3, fFloatValue2, baseSlider2.Z0);
                }
            }
            i5++;
            baseSlider = this;
            canvas2 = canvas;
            iD = i3;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        c cVar = this.v;
        if (!z) {
            this.B0 = -1;
            cVar.j(this.C0);
            return;
        }
        if (i == 1) {
            u(Reader.READ_DONE);
        } else if (i == 2) {
            u(Integer.MIN_VALUE);
        } else if (i == 17) {
            v(Reader.READ_DONE);
        } else if (i == 66) {
            v(Integer.MIN_VALUE);
        }
        cVar.w(this.C0);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.A0.size() == 1) {
            this.B0 = 0;
        }
        Float fValueOf = null;
        Boolean boolValueOf = null;
        fValueOf = null;
        fValueOf = null;
        if (this.B0 == -1) {
            if (i != 61) {
                if (i == 66) {
                    this.B0 = this.C0;
                    postInvalidate();
                    boolValueOf = Boolean.TRUE;
                } else if (i == 81) {
                    u(1);
                    boolValueOf = Boolean.TRUE;
                } else if (i == 69) {
                    u(-1);
                    boolValueOf = Boolean.TRUE;
                } else if (i != 70) {
                    switch (i) {
                        case 21:
                            v(-1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 22:
                            v(1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                            this.B0 = this.C0;
                            postInvalidate();
                            boolValueOf = Boolean.TRUE;
                            break;
                    }
                } else {
                    u(1);
                    boolValueOf = Boolean.TRUE;
                }
            } else if (keyEvent.hasNoModifiers()) {
                boolValueOf = Boolean.valueOf(u(1));
            } else {
                boolValueOf = keyEvent.isShiftPressed() ? Boolean.valueOf(u(-1)) : Boolean.FALSE;
            }
            return boolValueOf != null ? boolValueOf.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        boolean zIsLongPress = this.J0 | keyEvent.isLongPress();
        this.J0 = zIsLongPress;
        float fRound = this.D0;
        if (zIsLongPress) {
            if (fRound == 0.0f) {
                fRound = 1.0f;
            }
            float f = (this.z0 - this.y0) / fRound;
            if (f > 20.0f) {
                fRound *= Math.round(f / 20.0f);
            }
        } else if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        if (i == 69) {
            fValueOf = Float.valueOf(-fRound);
        } else if (i != 70 && i != 81) {
            switch (i) {
                case 19:
                    if (t()) {
                        fValueOf = Float.valueOf(fRound);
                    }
                    break;
                case 20:
                    if (t()) {
                        fValueOf = Float.valueOf(-fRound);
                    }
                    break;
                case 21:
                    if (!s()) {
                        fRound = -fRound;
                    }
                    fValueOf = Float.valueOf(fRound);
                    break;
                case 22:
                    if (s()) {
                        fRound = -fRound;
                    }
                    fValueOf = Float.valueOf(fRound);
                    break;
            }
        } else {
            fValueOf = Float.valueOf(fRound);
        }
        if (fValueOf != null) {
            if (A(this.B0, fValueOf.floatValue() + this.A0.get(this.B0).floatValue())) {
                C();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return u(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return u(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.B0 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.J0 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.R;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.Q + ((i3 == 1 || i3 == 3) ? ((j0g0) this.A.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (t()) {
            super.onMeasure(iMakeMeasureSpec, i2);
        } else {
            super.onMeasure(i, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.y0 = sliderState.a;
        this.z0 = sliderState.b;
        setValuesInternal(sliderState.c);
        this.D0 = sliderState.d;
        if (sliderState.e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.a = this.y0;
        sliderState.b = this.z0;
        sliderState.c = new ArrayList<>(this.A0);
        sliderState.d = this.D0;
        sliderState.e = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (t()) {
            i = i2;
        }
        this.I0 = Math.max(i - (this.T * 2), 0);
        F();
        C();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0121 A[LOOP:0: B:64:0x011f->B:65:0x0121, LOOP_END] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        ArrayList arrayList;
        int size;
        int i;
        float f;
        int i2 = 0;
        if (isEnabled()) {
            float y = t() ? motionEvent.getY() : motionEvent.getX();
            float x = t() ? motionEvent.getX() : motionEvent.getY();
            float f2 = (y - this.T) / this.I0;
            this.c1 = f2;
            float fMax = Math.max(0.0f, f2);
            this.c1 = fMax;
            this.c1 = Math.min(1.0f, fMax);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                int i3 = this.G;
                if (actionMasked == 1) {
                    this.x0 = false;
                    motionEvent2 = this.w0;
                    if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                        f = i3;
                        if (Math.abs(this.w0.getX() - motionEvent.getX()) <= f && Math.abs(this.w0.getY() - motionEvent.getY()) <= f && y()) {
                            x();
                        }
                    }
                    if (this.B0 != -1) {
                        A(this.B0, getValueOfTouchPosition());
                        C();
                        if (this.a0 > 0 && (i = this.b0) != -1 && this.c0 != -1) {
                            setThumbWidth(i);
                            setThumbTrackGapSize(this.c0);
                        }
                        this.B0 = -1;
                        arrayList = this.C;
                        size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            ((f42) obj).b(this);
                        }
                    }
                    invalidate();
                } else if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.x0 = false;
                        motionEvent2 = this.w0;
                        if (motionEvent2 != null) {
                            f = i3;
                            if (Math.abs(this.w0.getX() - motionEvent.getX()) <= f) {
                                x();
                            }
                        }
                        if (this.B0 != -1) {
                            A(this.B0, getValueOfTouchPosition());
                            C();
                            if (this.a0 > 0) {
                                setThumbWidth(i);
                                setThumbTrackGapSize(this.c0);
                            }
                            this.B0 = -1;
                            arrayList = this.C;
                            size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((f42) obj2).b(this);
                            }
                        }
                        invalidate();
                    }
                } else if (this.x0) {
                    A(this.B0, getValueOfTouchPosition());
                    C();
                    invalidate();
                } else if ((t() || !r(motionEvent) || Math.abs(y - this.u0) >= i3) && (!t() || !q(motionEvent) || Math.abs(x - this.v0) >= i3 * 0.8f)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (y()) {
                        this.x0 = true;
                        E();
                        x();
                        A(this.B0, getValueOfTouchPosition());
                        C();
                        invalidate();
                    }
                }
            } else {
                this.u0 = y;
                this.v0 = x;
                if ((t() || !r(motionEvent)) && (!t() || !q(motionEvent))) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (y()) {
                        requestFocus();
                        this.x0 = true;
                        E();
                        x();
                        A(this.B0, getValueOfTouchPosition());
                        C();
                        invalidate();
                    }
                }
            }
            setPressed(this.x0);
            this.w0 = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.i1 = z;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        ViewOverlay contentViewOverlay;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (contentViewOverlay = getContentViewOverlay()) == null) {
            return;
        }
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            contentViewOverlay.remove((j0g0) obj);
        }
    }

    public final boolean p(double d2) {
        double dDoubleValue = new BigDecimal(Double.toString(d2)).divide(new BigDecimal(Float.toString(this.D0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean q(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s() {
        return getLayoutDirection() == 1;
    }

    public void setActiveThumbIndex(int i) {
        this.B0 = i;
    }

    public void setCentered(boolean z) {
        if (this.g0 == z) {
            return;
        }
        this.g0 = z;
        float f = this.y0;
        if (z) {
            setValues(Float.valueOf((f + this.z0) / 2.0f));
        } else {
            setValues(Float.valueOf(f));
        }
        M(true);
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        b(drawableNewDrawable);
        this.a1 = drawableNewDrawable;
        this.b1.clear();
        postInvalidate();
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.a1 = null;
        this.b1 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List<Drawable> list = this.b1;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            b(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.A0.size()) {
            hb5.a("index out of range");
            return;
        }
        this.C0 = i;
        this.v.w(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i == this.W) {
            return;
        }
        this.W = i;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.W);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.L0)) {
            return;
        }
        this.L0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int iN = n(colorStateList);
        Paint paint = this.d;
        paint.setColor(iN);
        paint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.R != i) {
            this.R = i;
            M(true);
        }
    }

    public void setOrientation(int i) {
        if (this.O == i) {
            return;
        }
        this.O = i;
        M(true);
    }

    public void setSeparationUnit(int i) {
        this.d1 = i;
        this.K0 = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.D0 != f) {
                this.D0 = f;
                this.K0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        float f2 = this.y0;
        float f3 = this.z0;
        StringBuilder sb = new StringBuilder("The stepSize(");
        sb.append(f);
        sb.append(") must be 0, or a factor of the valueFrom(");
        sb.append(f2);
        sb.append(")-valueTo(");
        hb5.a(wi1.a(f3, ") range", sb));
    }

    public void setThumbElevation(float f) {
        this.Z0.r(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbHeight(int i) {
        if (i == this.V) {
            return;
        }
        this.V = i;
        this.Z0.setBounds(0, 0, this.U, i);
        Drawable drawable = this.a1;
        if (drawable != null) {
            b(drawable);
        }
        Iterator<Drawable> it = this.b1.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        M(false);
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.Z0.y(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(o0b.b(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.Z0.z(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        fcv fcvVar = this.Z0;
        if (colorStateList.equals(fcvVar.b.d)) {
            return;
        }
        fcvVar.s(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(int i) {
        if (this.a0 == i) {
            return;
        }
        this.a0 = i;
        invalidate();
    }

    public void setThumbWidth(int i) {
        if (i == this.U) {
            return;
        }
        this.U = i;
        rx80.a aVar = new rx80.a();
        float f = this.U / 2.0f;
        z4b z4bVarA = gcv.a(0);
        aVar.a = z4bVarA;
        aVar.b = z4bVarA;
        aVar.c = z4bVarA;
        aVar.d = z4bVarA;
        aVar.b(f);
        rx80 rx80VarA = aVar.a();
        fcv fcvVar = this.Z0;
        fcvVar.setShapeAppearanceModel(rx80VarA);
        fcvVar.setBounds(0, 0, this.U, this.V);
        Drawable drawable = this.a1;
        if (drawable != null) {
            b(drawable);
        }
        Iterator<Drawable> it = this.b1.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        M(false);
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    public void setTickActiveRadius(int i) {
        if (this.G0 != i) {
            this.G0 = i;
            this.f.setStrokeWidth(i * 2);
            M(false);
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.M0)) {
            return;
        }
        this.M0 = colorStateList;
        this.f.setColor(n(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i) {
        if (this.H0 != i) {
            this.H0 = i;
            this.e.setStrokeWidth(i * 2);
            M(false);
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.N0)) {
            return;
        }
        this.N0 = colorStateList;
        this.e.setColor(n(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i) {
        if (this.F0 != i) {
            this.F0 = i;
            postInvalidate();
        }
    }

    @Deprecated
    public void setTickVisible(boolean z) {
        setTickVisibilityMode(z ? 0 : 2);
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.O0)) {
            return;
        }
        this.O0 = colorStateList;
        this.b.setColor(n(colorStateList));
        invalidate();
    }

    public void setTrackCornerSize(int i) {
        if (this.e0 == i) {
            return;
        }
        this.e0 = i;
        invalidate();
    }

    public void setTrackHeight(int i) {
        if (this.S != i) {
            this.S = i;
            this.a.setStrokeWidth(i);
            this.b.setStrokeWidth(this.S);
            M(false);
        }
    }

    public void setTrackIconActiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.l0) {
            return;
        }
        this.l0 = colorStateList;
        J();
        I();
        invalidate();
    }

    public void setTrackIconActiveEnd(Drawable drawable) {
        if (drawable == this.j0) {
            return;
        }
        this.j0 = drawable;
        this.k0 = false;
        I();
        invalidate();
    }

    public void setTrackIconActiveStart(Drawable drawable) {
        if (drawable == this.h0) {
            return;
        }
        this.h0 = drawable;
        this.i0 = false;
        J();
        invalidate();
    }

    public void setTrackIconInactiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.q0) {
            return;
        }
        this.q0 = colorStateList;
        L();
        K();
        invalidate();
    }

    public void setTrackIconInactiveEnd(Drawable drawable) {
        if (drawable == this.o0) {
            return;
        }
        this.o0 = drawable;
        this.p0 = false;
        K();
        invalidate();
    }

    public void setTrackIconInactiveStart(Drawable drawable) {
        if (drawable == this.m0) {
            return;
        }
        this.m0 = drawable;
        this.n0 = false;
        L();
        invalidate();
    }

    public void setTrackIconSize(int i) {
        if (this.r0 == i) {
            return;
        }
        this.r0 = i;
        invalidate();
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.P0)) {
            return;
        }
        this.P0 = colorStateList;
        this.a.setColor(n(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(int i) {
        if (this.f0 == i) {
            return;
        }
        this.f0 = i;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        if (this.d0 == i) {
            return;
        }
        this.d0 = i;
        this.i.setStrokeWidth(i);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.y0 = f;
        this.K0 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.z0 = f;
        this.K0 = true;
        postInvalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public boolean t() {
        return this.O == 1;
    }

    public final boolean u(int i) {
        int i2 = this.C0;
        long j = ((long) i2) + ((long) i);
        long size = this.A0.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.C0 = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.B0 != -1) {
            this.B0 = i3;
        }
        C();
        postInvalidate();
        return true;
    }

    public final void v(int i) {
        if (s() || t()) {
            i = i == Integer.MIN_VALUE ? Reader.READ_DONE : -i;
        }
        u(i);
    }

    public final float w(float f) {
        float f2 = this.y0;
        float f3 = (f - f2) / (this.z0 - f2);
        return (s() || t()) ? 1.0f - f3 : f3;
    }

    public final void x() {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((f42) obj).a(this);
        }
    }

    public boolean y() {
        if (this.B0 == -1) {
            float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
            float fP = P(valueOfTouchPositionAbsolute);
            this.B0 = 0;
            float fAbs = Math.abs(this.A0.get(0).floatValue() - valueOfTouchPositionAbsolute);
            for (int i = 1; i < this.A0.size(); i++) {
                float fAbs2 = Math.abs(this.A0.get(i).floatValue() - valueOfTouchPositionAbsolute);
                float fP2 = P(this.A0.get(i).floatValue());
                if (Float.compare(fAbs2, fAbs) > 0) {
                    break;
                }
                boolean z = s() || t() ? fP2 - fP > 0.0f : fP2 - fP < 0.0f;
                if (Float.compare(fAbs2, fAbs) < 0) {
                    this.B0 = i;
                } else {
                    if (Float.compare(fAbs2, fAbs) != 0) {
                        continue;
                    } else {
                        if (Math.abs(fP2 - fP) < this.G) {
                            this.B0 = -1;
                            return false;
                        }
                        if (z) {
                            this.B0 = i;
                        }
                    }
                }
                fAbs = fAbs2;
            }
            if (this.B0 == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x008e  */
    /* JADX WARN: Code duplicated, block: B:18:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x00ac  */
    public final void z(j0g0 j0g0Var, float f) {
        int iW;
        int intrinsicWidth;
        int iD;
        int intrinsicHeight;
        int iD2;
        Rect rect;
        ViewOverlay contentViewOverlay;
        String strM = m(f);
        if (!TextUtils.equals(j0g0Var.W, strM)) {
            j0g0Var.W = strM;
            j0g0Var.Z.e = true;
            j0g0Var.invalidateSelf();
        }
        boolean zT = t();
        int i = this.T;
        int i2 = this.t0;
        if (zT) {
            iW = (i + ((int) (w(f) * this.I0))) - (j0g0Var.getIntrinsicHeight() / 2);
            intrinsicWidth = j0g0Var.getIntrinsicHeight() + iW;
            if (s()) {
                iD = d() - ((this.V / 2) + i2);
                intrinsicHeight = j0g0Var.getIntrinsicWidth();
            } else {
                iD2 = (this.V / 2) + i2 + d();
                iD = j0g0Var.getIntrinsicWidth() + iD2;
            }
            rect = this.V0;
            rect.set(iW, iD2, intrinsicWidth, iD);
            if (t()) {
                RectF rectF = new RectF(rect);
                this.Y0.mapRect(rectF);
                rectF.round(rect);
            }
            pae.c(eai0.d(this), this, rect);
            j0g0Var.setBounds(rect);
            contentViewOverlay = getContentViewOverlay();
            if (contentViewOverlay == null) {
                return;
            }
            contentViewOverlay.add(j0g0Var);
        }
        iW = (i + ((int) (w(f) * this.I0))) - (j0g0Var.getIntrinsicWidth() / 2);
        intrinsicWidth = j0g0Var.getIntrinsicWidth() + iW;
        iD = d() - ((this.V / 2) + i2);
        intrinsicHeight = j0g0Var.getIntrinsicHeight();
        iD2 = iD - intrinsicHeight;
        rect = this.V0;
        rect.set(iW, iD2, intrinsicWidth, iD);
        if (t()) {
            RectF rectF2 = new RectF(rect);
            this.Y0.mapRect(rectF2);
            rectF2.round(rect);
        }
        pae.c(eai0.d(this), this, rect);
        j0g0Var.setBounds(rect);
        contentViewOverlay = getContentViewOverlay();
        if (contentViewOverlay == null) {
            return;
        }
        contentViewOverlay.add(j0g0Var);
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setTrackIconActiveEnd(int i) {
        setTrackIconActiveEnd(i != 0 ? gr0.a(getContext(), i) : null);
    }

    public void setTrackIconActiveStart(int i) {
        setTrackIconActiveStart(i != 0 ? gr0.a(getContext(), i) : null);
    }

    public void setTrackIconInactiveEnd(int i) {
        setTrackIconInactiveEnd(i != 0 ? gr0.a(getContext(), i) : null);
    }

    public void setTrackIconInactiveStart(int i) {
        setTrackIconInactiveStart(i != 0 ? gr0.a(getContext(), i) : null);
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setLabelFormatter(nlr nlrVar) {
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public BaseSlider(Context context) {
        this(context, null);
    }
}
