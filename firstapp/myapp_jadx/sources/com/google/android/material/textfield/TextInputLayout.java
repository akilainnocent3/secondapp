package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.a2;
import defpackage.b78;
import defpackage.bbv;
import defpackage.bwd0;
import defpackage.c7;
import defpackage.d6n;
import defpackage.dj0;
import defpackage.e6;
import defpackage.ecv;
import defpackage.eff0;
import defpackage.f6w;
import defpackage.fcv;
import defpackage.fm20;
import defpackage.fyf0;
import defpackage.gcv;
import defpackage.gof0;
import defpackage.gr0;
import defpackage.hb5;
import defpackage.hyd0;
import defpackage.ilc;
import defpackage.jff;
import defpackage.k060;
import defpackage.o54;
import defpackage.pae;
import defpackage.pk30;
import defpackage.q38;
import defpackage.r6i0;
import defpackage.rjf0;
import defpackage.rx80;
import defpackage.sdf;
import defpackage.sfn;
import defpackage.sjf0;
import defpackage.tcv;
import defpackage.tfn;
import defpackage.th50;
import defpackage.tjf0;
import defpackage.vbv;
import defpackage.vlf;
import defpackage.x4b;
import defpackage.z4b;
import defpackage.zk1;
import defpackage.zq0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] S0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public boolean A;
    public int A0;
    public int B;
    public int B0;
    public boolean C;
    public int C0;
    public f D;
    public ColorStateList D0;
    public AppCompatTextView E;
    public int E0;
    public int F;
    public int F0;
    public int G;
    public int G0;
    public CharSequence H;
    public int H0;
    public boolean I;
    public int I0;
    public AppCompatTextView J;
    public int J0;
    public ColorStateList K;
    public boolean K0;
    public int L;
    public final q38 L0;
    public Fade M;
    public boolean M0;
    public Fade N;
    public boolean N0;
    public ColorStateList O;
    public ValueAnimator O0;
    public ColorStateList P;
    public boolean P0;
    public ColorStateList Q;
    public boolean Q0;
    public ColorStateList R;
    public boolean R0;
    public boolean S;
    public CharSequence T;
    public boolean U;
    public fcv V;
    public fcv W;
    public final FrameLayout a;
    public StateListDrawable a0;
    public final bwd0 b;
    public boolean b0;
    public final com.google.android.material.textfield.a c;
    public fcv c0;
    public final int d;
    public fcv d0;
    public EditText e;
    public rx80 e0;
    public CharSequence f;
    public boolean f0;
    public final int g0;
    public int h0;
    public int i;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public final Rect o0;
    public final Rect p0;
    public final RectF q0;
    public Typeface r0;
    public ColorDrawable s0;
    public int t0;
    public final LinkedHashSet<g> u0;
    public int v;
    public ColorDrawable v0;
    public int w;
    public int w0;
    public Drawable x0;
    public int y;
    public ColorStateList y0;
    public final sfn z;
    public ColorStateList z0;

    public class a implements TextWatcher {
        public int a;
        public final /* synthetic */ EditText b;

        public a(EditText editText) {
            this.b = editText;
            this.a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.w(!textInputLayout.Q0, false);
            if (textInputLayout.A) {
                textInputLayout.p(editable);
            }
            if (textInputLayout.I) {
                textInputLayout.x(editable);
            }
            EditText editText = this.b;
            int lineCount = editText.getLineCount();
            int i = this.a;
            if (lineCount != i) {
                if (lineCount < i) {
                    int minimumHeight = editText.getMinimumHeight();
                    int i2 = textInputLayout.J0;
                    if (minimumHeight != i2) {
                        editText.setMinimumHeight(i2);
                    }
                }
                this.a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class b extends e6 {
        @Override // defpackage.e6
        public final void d(View view, c7 c7Var) {
            AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
            this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setVisibleToUser(false);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.c.i;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.L0.A(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends e6 {
        public final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // defpackage.e6
        public final void d(View view, c7 c7Var) {
            AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
            this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.d;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean z = textInputLayout.K0;
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            bwd0 bwd0Var = textInputLayout.b;
            AppCompatTextView appCompatTextView = bwd0Var.b;
            if (appCompatTextView.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView);
                accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
            } else {
                accessibilityNodeInfo.setTraversalAfter(bwd0Var.d);
            }
            if (!zIsEmpty) {
                c7Var.w(text);
            } else if (!TextUtils.isEmpty(string)) {
                c7Var.w(string);
                if (!z && placeholderText != null) {
                    c7Var.w(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c7Var.w(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    c7Var.q(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    c7Var.w(string);
                }
                c7Var.u(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z2) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            AppCompatTextView appCompatTextView2 = textInputLayout.z.y;
            if (appCompatTextView2 != null) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView2);
            }
            textInputLayout.c.b().m(c7Var);
        }

        @Override // defpackage.e6
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.d.c.b().n(accessibilityEvent);
        }
    }

    public interface f {
    }

    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    public interface h {
        void a();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(tcv.a(context, attributeSet, i, com.sportybet.android.gp.tz.R.style.Widget_Design_TextInputLayout), attributeSet, i);
        this.i = -1;
        this.v = -1;
        this.w = -1;
        this.y = -1;
        this.z = new sfn(this);
        this.D = new sjf0();
        this.o0 = new Rect();
        this.p0 = new Rect();
        this.q0 = new RectF();
        this.u0 = new LinkedHashSet<>();
        q38 q38Var = new q38(this);
        this.L0 = q38Var;
        this.R0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = dj0.a;
        q38Var.X = linearInterpolator;
        q38Var.l(false);
        q38Var.W = linearInterpolator;
        q38Var.l(false);
        q38Var.s(8388659);
        fyf0 fyf0VarE = gof0.e(context2, attributeSet, pk30.k0, i, com.sportybet.android.gp.tz.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        bwd0 bwd0Var = new bwd0(this, fyf0VarE);
        this.b = bwd0Var;
        TypedArray typedArray = fyf0VarE.b;
        this.S = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.N0 = typedArray.getBoolean(47, true);
        this.M0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.e0 = rx80.d(context2, attributeSet, i, com.sportybet.android.gp.tz.R.style.Widget_Design_TextInputLayout).a();
        this.g0 = context2.getResources().getDimensionPixelOffset(com.sportybet.android.gp.tz.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.i0 = typedArray.getDimensionPixelOffset(9, 0);
        this.d = getResources().getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.k0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.l0 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.j0 = this.k0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        rx80.a aVarH = this.e0.h();
        if (dimension >= 0.0f) {
            aVarH.f(dimension);
        }
        if (dimension2 >= 0.0f) {
            aVarH.g(dimension2);
        }
        if (dimension3 >= 0.0f) {
            aVarH.e(dimension3);
        }
        if (dimension4 >= 0.0f) {
            aVarH.d(dimension4);
        }
        this.e0 = aVarH.a();
        ColorStateList colorStateListB = ecv.b(context2, fyf0VarE, 7);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.E0 = defaultColor;
            this.n0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.F0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.G0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.H0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.G0 = this.E0;
                ColorStateList colorStateListA = th50.a(com.sportybet.android.gp.tz.R.color.mtrl_filled_background_color, context2.getTheme(), context2.getResources());
                this.F0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.H0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.n0 = 0;
            this.E0 = 0;
            this.F0 = 0;
            this.G0 = 0;
            this.H0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListA2 = fyf0VarE.a(1);
            this.z0 = colorStateListA2;
            this.y0 = colorStateListA2;
        }
        ColorStateList colorStateListB2 = ecv.b(context2, fyf0VarE, 14);
        this.C0 = typedArray.getColor(14, 0);
        this.A0 = context2.getColor(com.sportybet.android.gp.tz.R.color.mtrl_textinput_default_box_stroke_color);
        this.I0 = context2.getColor(com.sportybet.android.gp.tz.R.color.mtrl_textinput_disabled_color);
        this.B0 = context2.getColor(com.sportybet.android.gp.tz.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(ecv.b(context2, fyf0VarE, 15));
        }
        if (typedArray.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(50, 0));
        }
        this.Q = fyf0VarE.a(24);
        this.R = fyf0VarE.a(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i2 = typedArray.getInt(34, 1);
        boolean z = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z2 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(58, 0);
        CharSequence text3 = typedArray.getText(57);
        boolean z3 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.G = typedArray.getResourceId(22, 0);
        this.F = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.F);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.G);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(fyf0VarE.a(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(fyf0VarE.a(46));
        }
        if (typedArray.hasValue(51)) {
            setHintTextColor(fyf0VarE.a(51));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(fyf0VarE.a(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(fyf0VarE.a(21));
        }
        if (typedArray.hasValue(59)) {
            setPlaceholderTextColor(fyf0VarE.a(59));
        }
        com.google.android.material.textfield.a aVar = new com.google.android.material.textfield.a(this, fyf0VarE);
        this.c = aVar;
        boolean z4 = typedArray.getBoolean(0, true);
        setHintMaxLines(typedArray.getInt(49, 1));
        fyf0VarE.g();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(bwd0Var);
        frameLayout.addView(aVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.e;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.V;
        }
        int iB = vbv.b(com.sportybet.android.gp.tz.R.attr.colorControlHighlight, this.e);
        int i = this.h0;
        int[][] iArr = S0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            fcv fcvVar = this.V;
            int i2 = this.n0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{vbv.g(0.1f, iB, i2), i2}), fcvVar, fcvVar);
        }
        Context context = getContext();
        fcv fcvVar2 = this.V;
        TypedValue typedValueE = bbv.e(com.sportybet.android.gp.tz.R.attr.colorSurface, context, "TextInputLayout");
        int i3 = typedValueE.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : typedValueE.data;
        fcv fcvVar3 = new fcv(fcvVar2.b.a);
        int iG = vbv.g(0.1f, iB, color);
        fcvVar3.s(new ColorStateList(iArr, new int[]{iG, 0}));
        fcvVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iG, color});
        fcv fcvVar4 = new fcv(fcvVar2.b.a);
        fcvVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fcvVar3, fcvVar4), fcvVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.a0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.a0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.a0.addState(new int[0], h(false));
        }
        return this.a0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        fcv fcvVar = this.W;
        if (fcvVar != null) {
            return fcvVar;
        }
        fcv fcvVarH = h(true);
        this.W = fcvVarH;
        return fcvVarH;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.e != null) {
            hb5.a("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.e = editText;
        int i = this.i;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.w);
        }
        int i2 = this.v;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.y);
        }
        this.b0 = false;
        k();
        setTextInputAccessibilityDelegate(new e(this));
        Typeface typeface = this.e.getTypeface();
        q38 q38Var = this.L0;
        boolean zT = q38Var.t(typeface);
        boolean z = q38Var.z(typeface);
        if (zT || z) {
            q38Var.l(false);
        }
        q38Var.y(this.e.getTextSize());
        float letterSpacing = this.e.getLetterSpacing();
        if (q38Var.h0 != letterSpacing) {
            q38Var.h0 = letterSpacing;
            q38Var.l(false);
        }
        int gravity = this.e.getGravity();
        q38Var.s((gravity & (-113)) | 48);
        q38Var.x(gravity);
        this.J0 = editText.getMinimumHeight();
        this.e.addTextChangedListener(new a(editText));
        if (this.y0 == null) {
            this.y0 = this.e.getHintTextColors();
        }
        if (this.S) {
            if (TextUtils.isEmpty(this.T)) {
                CharSequence hint = this.e.getHint();
                this.f = hint;
                setHint(hint);
                this.e.setHint((CharSequence) null);
            }
            this.U = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.E != null) {
            p(this.e.getText());
        }
        t();
        this.z.b();
        this.b.bringToFront();
        com.google.android.material.textfield.a aVar = this.c;
        aVar.bringToFront();
        Iterator<g> it = this.u0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        aVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.T)) {
            return;
        }
        this.T = charSequence;
        this.L0.B(charSequence);
        if (this.K0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.I == z) {
            return;
        }
        AppCompatTextView appCompatTextView = this.J;
        if (!z) {
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(8);
            }
            this.J = null;
        } else if (appCompatTextView != null) {
            this.a.addView(appCompatTextView);
            this.J.setVisibility(0);
        }
        this.I = z;
    }

    public final void a() {
        if (this.e == null || this.h0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.L0.g() + this.d), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.material_filled_edittext_font_2_0_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (ecv.f(getContext())) {
            EditText editText3 = this.e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.material_filled_edittext_font_1_3_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f2) {
        q38 q38Var = this.L0;
        if (q38Var.b == f2) {
            return;
        }
        if (this.O0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.O0 = valueAnimator;
            valueAnimator.setInterpolator(f6w.c(getContext(), com.sportybet.android.gp.tz.R.attr.motionEasingEmphasizedInterpolator, dj0.b));
            this.O0.setDuration(bbv.c(getContext(), com.sportybet.android.gp.tz.R.attr.motionDurationMedium4, 167));
            this.O0.addUpdateListener(new d());
        }
        this.O0.setFloatValues(q38Var.b, f2);
        this.O0.start();
    }

    public final void c() {
        int i;
        int i2;
        fcv fcvVar = this.V;
        if (fcvVar == null) {
            return;
        }
        rx80 rx80Var = fcvVar.b.a;
        rx80 rx80Var2 = this.e0;
        if (rx80Var != rx80Var2) {
            fcvVar.setShapeAppearanceModel(rx80Var2);
        }
        if (this.h0 == 2 && (i = this.j0) > -1 && (i2 = this.m0) != 0) {
            fcv fcvVar2 = this.V;
            fcvVar2.z(i);
            fcvVar2.y(ColorStateList.valueOf(i2));
        }
        int iD = this.n0;
        if (this.h0 == 1) {
            iD = b78.d(this.n0, vbv.c(getContext(), com.sportybet.android.gp.tz.R.attr.colorSurface, 0));
        }
        this.n0 = iD;
        this.V.s(ColorStateList.valueOf(iD));
        fcv fcvVar3 = this.c0;
        if (fcvVar3 != null && this.d0 != null) {
            if (this.j0 > -1 && this.m0 != 0) {
                fcvVar3.s(this.e.isFocused() ? ColorStateList.valueOf(this.A0) : ColorStateList.valueOf(this.m0));
                this.d0.s(ColorStateList.valueOf(this.m0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.e == null) {
            fm20.a();
            return null;
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.p0;
        rect2.bottom = i;
        int i2 = this.h0;
        if (i2 == 1) {
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.i0;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        int i3 = rect.left;
        if (i2 != 2) {
            rect2.left = i(i3, z);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z);
            return rect2;
        }
        rect2.left = this.e.getPaddingLeft() + i3;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.e.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f != null) {
            boolean z = this.U;
            this.U = false;
            CharSequence hint = editText.getHint();
            this.e.setHint(this.f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.e.setHint(hint);
                this.U = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.Q0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.Q0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        fcv fcvVar;
        super.draw(canvas);
        boolean z = this.S;
        q38 q38Var = this.L0;
        if (z) {
            q38Var.f(canvas);
        }
        if (this.d0 == null || (fcvVar = this.c0) == null) {
            return;
        }
        fcvVar.draw(canvas);
        if (this.e.isFocused()) {
            Rect bounds = this.d0.getBounds();
            Rect bounds2 = this.c0.getBounds();
            float f2 = q38Var.b;
            int iCenterX = bounds2.centerX();
            bounds.left = dj0.c(f2, iCenterX, bounds2.left);
            bounds.right = dj0.c(f2, iCenterX, bounds2.right);
            this.d0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.P0) {
            return;
        }
        this.P0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        q38 q38Var = this.L0;
        if (q38Var != null) {
            q38Var.S = drawableState;
            ColorStateList colorStateList2 = q38Var.p;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = q38Var.o) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                q38Var.l(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.e != null) {
            w(isLaidOut() && isEnabled(), false);
        }
        t();
        z();
        if (z) {
            invalidate();
        }
        this.P0 = false;
    }

    public final int e() {
        if (this.S) {
            int i = this.h0;
            q38 q38Var = this.L0;
            if (i == 0) {
                return (int) q38Var.g();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (q38Var.g() / 2.0f);
                }
                float fG = q38Var.g();
                TextPaint textPaint = q38Var.V;
                textPaint.setTextSize(q38Var.n);
                textPaint.setTypeface(q38Var.x);
                textPaint.setLetterSpacing(q38Var.g0);
                return Math.max(0, (int) (fG - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final Fade f() {
        Fade fade = new Fade();
        fade.c = bbv.c(getContext(), com.sportybet.android.gp.tz.R.attr.motionDurationShort2, 87);
        fade.d = f6w.c(getContext(), com.sportybet.android.gp.tz.R.attr.motionEasingLinearInterpolator, dj0.a);
        return fade;
    }

    public final boolean g() {
        return this.S && !TextUtils.isEmpty(this.T) && (this.V instanceof ilc);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public fcv getBoxBackground() {
        int i = this.h0;
        if (i == 1 || i == 2) {
            return this.V;
        }
        fm20.a();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.n0;
    }

    public int getBoxBackgroundMode() {
        return this.h0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.i0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        rx80 rx80Var = this.e0;
        RectF rectF = this.q0;
        return layoutDirection == 1 ? rx80Var.h.a(rectF) : rx80Var.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        rx80 rx80Var = this.e0;
        RectF rectF = this.q0;
        return layoutDirection == 1 ? rx80Var.g.a(rectF) : rx80Var.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        rx80 rx80Var = this.e0;
        RectF rectF = this.q0;
        return layoutDirection == 1 ? rx80Var.e.a(rectF) : rx80Var.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        rx80 rx80Var = this.e0;
        RectF rectF = this.q0;
        return layoutDirection == 1 ? rx80Var.f.a(rectF) : rx80Var.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.C0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.D0;
    }

    public int getBoxStrokeWidth() {
        return this.k0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.l0;
    }

    public int getCounterMaxLength() {
        return this.B;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.A && this.C && (appCompatTextView = this.E) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.P;
    }

    public ColorStateList getCounterTextColor() {
        return this.O;
    }

    public ColorStateList getCursorColor() {
        return this.Q;
    }

    public ColorStateList getCursorErrorColor() {
        return this.R;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.y0;
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.i.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.i.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.B;
    }

    public int getEndIconMode() {
        return this.c.w;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.C;
    }

    public CheckableImageButton getEndIconView() {
        return this.c.i;
    }

    public CharSequence getError() {
        sfn sfnVar = this.z;
        if (sfnVar.q) {
            return sfnVar.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.z.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.z.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.z.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        sfn sfnVar = this.z;
        if (sfnVar.x) {
            return sfnVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.z.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.S) {
            return this.T;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.L0.g();
    }

    public final int getHintCurrentCollapsedTextColor() {
        q38 q38Var = this.L0;
        return q38Var.h(q38Var.p);
    }

    public int getHintMaxLines() {
        return this.L0.o0;
    }

    public ColorStateList getHintTextColor() {
        return this.z0;
    }

    public f getLengthCounter() {
        return this.D;
    }

    public int getMaxEms() {
        return this.v;
    }

    public int getMaxWidth() {
        return this.y;
    }

    public int getMinEms() {
        return this.i;
    }

    public int getMinWidth() {
        return this.w;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.i.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.i.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.I) {
            return this.H;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.L;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.K;
    }

    public CharSequence getPrefixText() {
        return this.b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.b.b;
    }

    public rx80 getShapeAppearanceModel() {
        return this.e0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.b.i;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.v;
    }

    public CharSequence getSuffixText() {
        return this.c.E;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.F.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.c.F;
    }

    public Typeface getTypeface() {
        return this.r0;
    }

    public final fcv h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.sportybet.android.gp.tz.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.e;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.sportybet.android.gp.tz.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.sportybet.android.gp.tz.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        k060 k060Var = new k060();
        k060 k060Var2 = new k060();
        k060 k060Var3 = new k060();
        k060 k060Var4 = new k060();
        vlf vlfVar = new vlf();
        vlf vlfVar2 = new vlf();
        vlf vlfVar3 = new vlf();
        vlf vlfVar4 = new vlf();
        a2 a2Var = new a2(f2);
        a2 a2Var2 = new a2(f2);
        a2 a2Var3 = new a2(dimensionPixelOffset);
        a2 a2Var4 = new a2(dimensionPixelOffset);
        rx80 rx80Var = new rx80();
        rx80Var.a = k060Var;
        rx80Var.b = k060Var2;
        rx80Var.c = k060Var3;
        rx80Var.d = k060Var4;
        rx80Var.e = a2Var;
        rx80Var.f = a2Var2;
        rx80Var.g = a2Var4;
        rx80Var.h = a2Var3;
        rx80Var.i = vlfVar;
        rx80Var.j = vlfVar2;
        rx80Var.k = vlfVar3;
        rx80Var.l = vlfVar4;
        EditText editText2 = this.e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = fcv.U;
            TypedValue typedValueE = bbv.e(com.sportybet.android.gp.tz.R.attr.colorSurface, context, fcv.class.getSimpleName());
            int i = typedValueE.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i != 0 ? context.getColor(i) : typedValueE.data);
        }
        fcv fcvVar = new fcv();
        fcvVar.o(context);
        fcvVar.s(dropDownBackgroundTintList);
        fcvVar.r(popupElevation);
        fcvVar.setShapeAppearanceModel(rx80Var);
        fcv.c cVar = fcvVar.b;
        if (cVar.h == null) {
            cVar.h = new Rect();
        }
        fcvVar.b.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        fcvVar.invalidateSelf();
        return fcvVar;
    }

    public final int i(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.e.getCompoundPaddingLeft() : this.c.c();
        } else {
            compoundPaddingLeft = this.b.a();
        }
        return compoundPaddingLeft + i;
    }

    public final int j(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.e.getCompoundPaddingRight() : this.b.a();
        } else {
            compoundPaddingRight = this.c.c();
        }
        return i - compoundPaddingRight;
    }

    public final void k() {
        int i = this.h0;
        if (i == 0) {
            this.V = null;
            this.c0 = null;
            this.d0 = null;
        } else if (i == 1) {
            this.V = new fcv(this.e0);
            this.c0 = new fcv();
            this.d0 = new fcv();
        } else {
            if (i != 2) {
                hb5.a(zk1.a(this.h0, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
                return;
            }
            if (!this.S || (this.V instanceof ilc)) {
                this.V = new fcv(this.e0);
            } else {
                rx80 rx80Var = this.e0;
                int i2 = ilc.X;
                if (rx80Var == null) {
                    rx80Var = new rx80();
                }
                ilc.a aVar = new ilc.a(rx80Var, new RectF());
                ilc.b bVar = new ilc.b(aVar);
                bVar.W = aVar;
                this.V = bVar;
            }
            this.c0 = null;
            this.d0 = null;
        }
        u();
        z();
        if (this.h0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.i0 = getResources().getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (ecv.f(getContext())) {
                this.i0 = getResources().getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.h0 != 0) {
            v();
        }
        EditText editText = this.e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.h0;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    public final void l() {
        float f2;
        float f3;
        float f4;
        RectF rectF;
        float f5;
        float lineWidth;
        int i;
        float f6;
        int i2;
        if (g()) {
            int width = this.e.getWidth();
            int gravity = this.e.getGravity();
            q38 q38Var = this.L0;
            boolean zC = q38Var.c(q38Var.H);
            q38Var.J = zC;
            Rect rect = q38Var.h;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zC) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = q38Var.k0;
                    }
                } else if (zC) {
                    f2 = rect.right;
                    f3 = q38Var.k0;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float fMax = Math.max(f4, rect.left);
                rectF = this.q0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (q38Var.k0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (q38Var.J) {
                        f6 = q38Var.k0;
                        f5 = f6 + fMax;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (q38Var.J) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f6 = q38Var.k0;
                    f5 = f6 + fMax;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = q38Var.g() + rect.top;
                if (q38Var.j0 != null && !q38Var.C()) {
                    StaticLayout staticLayout = q38Var.j0;
                    lineWidth = (q38Var.n / q38Var.m) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (q38Var.J) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f7 = rectF.left;
                float f8 = this.g0;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.j0);
                rectF.top = 0.0f;
                ilc ilcVar = (ilc) this.V;
                ilcVar.getClass();
                ilcVar.E(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = q38Var.k0 / 2.0f;
            f4 = f2 - f3;
            float fMax2 = Math.max(f4, rect.left);
            rectF = this.q0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f5 = (width / 2.0f) + (q38Var.k0 / 2.0f);
            } else {
                f5 = (width / 2.0f) + (q38Var.k0 / 2.0f);
            }
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = q38Var.g() + rect.top;
            if (q38Var.j0 != null) {
                StaticLayout staticLayout2 = q38Var.j0;
                lineWidth = (q38Var.n / q38Var.m) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (q38Var.J) {
                    rectF.left = rectF.right - lineWidth;
                } else {
                    rectF.right = rectF.left + lineWidth;
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(com.sportybet.android.gp.tz.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(com.sportybet.android.gp.tz.R.color.design_error));
    }

    public final boolean o() {
        sfn sfnVar = this.z;
        return (sfnVar.o != 1 || sfnVar.r == null || TextUtils.isEmpty(sfnVar.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.L0.k(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        boolean z;
        com.google.android.material.textfield.a aVar = this.c;
        aVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int i = 0;
        this.R0 = false;
        if (this.e != null && this.e.getMeasuredHeight() < (iMax = Math.max(aVar.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.e.setMinimumHeight(iMax);
            z = true;
        } else {
            z = false;
        }
        boolean zS = s();
        if (z || zS) {
            this.e.post(new rjf0(this, i));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fI;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.o0;
            pae.a(this, editText, rect);
            fcv fcvVar = this.c0;
            if (fcvVar != null) {
                int i6 = rect.bottom;
                fcvVar.setBounds(rect.left, i6 - this.k0, rect.right, i6);
            }
            fcv fcvVar2 = this.d0;
            if (fcvVar2 != null) {
                int i7 = rect.bottom;
                fcvVar2.setBounds(rect.left, i7 - this.l0, rect.right, i7);
            }
            if (this.S) {
                float textSize = this.e.getTextSize();
                q38 q38Var = this.L0;
                q38Var.y(textSize);
                TextPaint textPaint = q38Var.V;
                int gravity = this.e.getGravity();
                q38Var.s((gravity & (-113)) | 48);
                q38Var.x(gravity);
                Rect rectD = d(rect);
                q38Var.o(rectD.left, rectD.top, rectD.right, rectD.bottom);
                if (this.e == null) {
                    fm20.a();
                    return;
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(q38Var.m);
                    textPaint.setTypeface(q38Var.A);
                    textPaint.setLetterSpacing(q38Var.h0);
                    fI = -textPaint.ascent();
                } else {
                    fI = q38Var.i() * q38Var.q;
                }
                int compoundPaddingLeft = this.e.getCompoundPaddingLeft() + rect.left;
                Rect rect2 = this.p0;
                rect2.left = compoundPaddingLeft;
                if (this.h0 != 1 || this.e.getMinLines() > 1) {
                    if (this.h0 != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(q38Var.m);
                        textPaint.setTypeface(q38Var.A);
                        textPaint.setLetterSpacing(q38Var.h0);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.e.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fI / 2.0f));
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.h0 != 1 || this.e.getMinLines() > 1) ? rect.bottom - this.e.getCompoundPaddingBottom() : (int) (rect2.top + fI);
                rect2.bottom = compoundPaddingBottom;
                q38Var.u(true, rect2.left, rect2.top, rect2.right, compoundPaddingBottom);
                q38Var.l(false);
                if (!g() || this.K0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f2;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.R0;
        com.google.android.material.textfield.a aVar = this.c;
        if (!z) {
            aVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.R0 = true;
        }
        if (this.J != null && (editText = this.e) != null) {
            this.J.setGravity(editText.getGravity());
            this.J.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
        aVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.e.getMeasuredWidth() - this.e.getCompoundPaddingLeft()) - this.e.getCompoundPaddingRight();
        q38 q38Var = this.L0;
        TextPaint textPaint = q38Var.V;
        textPaint.setTextSize(q38Var.n);
        textPaint.setTypeface(q38Var.x);
        textPaint.setLetterSpacing(q38Var.g0);
        float f3 = measuredWidth;
        q38Var.t0 = q38Var.e(q38Var.p0, textPaint, q38Var.H, (q38Var.n / q38Var.m) * f3, q38Var.J).getHeight();
        textPaint.setTextSize(q38Var.m);
        textPaint.setTypeface(q38Var.A);
        textPaint.setLetterSpacing(q38Var.h0);
        q38Var.u0 = q38Var.e(q38Var.o0, textPaint, q38Var.H, f3, q38Var.J).getHeight();
        EditText editText2 = this.e;
        Rect rect = this.o0;
        pae.a(this, editText2, rect);
        Rect rectD = d(rect);
        q38Var.o(rectD.left, rectD.top, rectD.right, rectD.bottom);
        v();
        a();
        if (this.e == null) {
            return;
        }
        int i3 = q38Var.u0;
        if (i3 != -1) {
            f2 = i3;
        } else {
            TextPaint textPaint2 = q38Var.V;
            textPaint2.setTextSize(q38Var.m);
            textPaint2.setTypeface(q38Var.A);
            textPaint2.setLetterSpacing(q38Var.h0);
            f2 = -textPaint2.ascent();
        }
        float fG = 0.0f;
        if (this.H != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.J.getPaint());
            textPaint3.setTextSize(this.J.getTextSize());
            textPaint3.setTypeface(this.J.getTypeface());
            textPaint3.setLetterSpacing(this.J.getLetterSpacing());
            hyd0 hyd0Var = new hyd0(this.H, textPaint3, measuredWidth);
            hyd0Var.k = getLayoutDirection() == 1;
            hyd0Var.j = true;
            float lineSpacingExtra = this.J.getLineSpacingExtra();
            float lineSpacingMultiplier = this.J.getLineSpacingMultiplier();
            hyd0Var.g = lineSpacingExtra;
            hyd0Var.h = lineSpacingMultiplier;
            hyd0Var.m = new tjf0(this);
            fG = (this.h0 == 1 ? q38Var.g() + this.i0 + this.d : 0.0f) + hyd0Var.a().getHeight();
        }
        float fMax = Math.max(f2, fG);
        if (this.e.getMeasuredHeight() < fMax) {
            this.e.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        setError(savedState.c);
        if (savedState.d) {
            post(new c());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f0) {
            x4b x4bVar = this.e0.e;
            RectF rectF = this.q0;
            float fA = x4bVar.a(rectF);
            float fA2 = this.e0.f.a(rectF);
            float fA3 = this.e0.h.a(rectF);
            float fA4 = this.e0.g.a(rectF);
            rx80 rx80Var = this.e0;
            z4b z4bVar = rx80Var.a;
            z4b z4bVar2 = rx80Var.b;
            z4b z4bVar3 = rx80Var.d;
            z4b z4bVar4 = rx80Var.c;
            new k060();
            new k060();
            new k060();
            new k060();
            vlf vlfVar = new vlf();
            vlf vlfVar2 = new vlf();
            vlf vlfVar3 = new vlf();
            vlf vlfVar4 = new vlf();
            a2 a2Var = new a2(fA2);
            a2 a2Var2 = new a2(fA);
            a2 a2Var3 = new a2(fA4);
            a2 a2Var4 = new a2(fA3);
            rx80 rx80Var2 = new rx80();
            rx80Var2.a = z4bVar2;
            rx80Var2.b = z4bVar;
            rx80Var2.c = z4bVar3;
            rx80Var2.d = z4bVar4;
            rx80Var2.e = a2Var;
            rx80Var2.f = a2Var2;
            rx80Var2.g = a2Var4;
            rx80Var2.h = a2Var3;
            rx80Var2.i = vlfVar;
            rx80Var2.j = vlfVar2;
            rx80Var2.k = vlfVar3;
            rx80Var2.l = vlfVar4;
            this.f0 = z;
            setShapeAppearanceModel(rx80Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (o()) {
            savedState.c = getError();
        }
        com.google.android.material.textfield.a aVar = this.c;
        savedState.d = aVar.w != 0 && aVar.i.d;
        return savedState;
    }

    public final void p(Editable editable) {
        ((sjf0) this.D).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.C;
        int i = this.B;
        if (i == -1) {
            this.E.setText(String.valueOf(length));
            this.E.setContentDescription(null);
            this.C = false;
        } else {
            this.C = length > i;
            Context context = getContext();
            this.E.setContentDescription(context.getString(this.C ? com.sportybet.android.gp.tz.R.string.character_counter_overflowed_content_description : com.sportybet.android.gp.tz.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.B)));
            if (z != this.C) {
                q();
            }
            String str = o54.b;
            o54 o54Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? o54.e : o54.d;
            AppCompatTextView appCompatTextView = this.E;
            String string = getContext().getString(com.sportybet.android.gp.tz.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.B));
            o54Var.getClass();
            eff0.d dVar = eff0.a;
            appCompatTextView.setText(string != null ? o54Var.c(string).toString() : null);
        }
        if (this.e == null || z == this.C) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.E;
        if (appCompatTextView != null) {
            n(appCompatTextView, this.C ? this.F : this.G);
            if (!this.C && (colorStateList2 = this.O) != null) {
                this.E.setTextColor(colorStateList2);
            }
            if (!this.C || (colorStateList = this.P) == null) {
                return;
            }
            this.E.setTextColor(colorStateList);
        }
    }

    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateListE = this.Q;
        if (colorStateListE == null) {
            colorStateListE = vbv.e(getContext(), com.sportybet.android.gp.tz.R.attr.colorControlActivated);
        }
        EditText editText = this.e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.e.getTextCursorDrawable().mutate();
        if ((o() || (this.E != null && this.C)) && (colorStateList = this.R) != null) {
            colorStateListE = colorStateList;
        }
        drawableMutate.setTintList(colorStateListE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean s() {
        boolean z;
        if (this.e == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            bwd0 bwd0Var = this.b;
            if (bwd0Var.getMeasuredWidth() > 0) {
                int measuredWidth = bwd0Var.getMeasuredWidth() - this.e.getPaddingLeft();
                if (this.s0 == null || this.t0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.s0 = colorDrawable;
                    this.t0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.s0;
                if (drawable != colorDrawable2) {
                    this.e.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.s0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.e.getCompoundDrawablesRelative();
                this.e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.s0 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.s0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.e.getCompoundDrawablesRelative();
            this.e.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.s0 = null;
            z = true;
        } else {
            z = false;
        }
        com.google.android.material.textfield.a aVar = this.c;
        if ((aVar.e() || ((aVar.w != 0 && aVar.d()) || aVar.E != null)) && aVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = aVar.F.getMeasuredWidth() - this.e.getPaddingRight();
            if (aVar.e()) {
                checkableImageButton = aVar.c;
            } else if (aVar.w != 0 && aVar.d()) {
                checkableImageButton = aVar.i;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.e.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.v0;
            if (colorDrawable3 != null && this.w0 != measuredWidth2) {
                this.w0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.v0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.v0 = colorDrawable4;
                this.w0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.v0;
            if (drawable2 != colorDrawable5) {
                this.x0 = drawable2;
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.v0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.v0) {
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.x0, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.v0 = null;
            return z2;
        }
        return z;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.n0 != i) {
            this.n0 = i;
            this.E0 = i;
            this.G0 = i;
            this.H0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.E0 = defaultColor;
        this.n0 = defaultColor;
        this.F0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.G0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.H0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.h0) {
            return;
        }
        this.h0 = i;
        if (this.e != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.i0 = i;
    }

    public void setBoxCornerFamily(int i) {
        rx80.a aVarH = this.e0.h();
        x4b x4bVar = this.e0.e;
        aVarH.a = gcv.a(i);
        aVarH.e = x4bVar;
        x4b x4bVar2 = this.e0.f;
        aVarH.b = gcv.a(i);
        aVarH.f = x4bVar2;
        x4b x4bVar3 = this.e0.h;
        aVarH.d = gcv.a(i);
        aVarH.h = x4bVar3;
        x4b x4bVar4 = this.e0.g;
        aVarH.c = gcv.a(i);
        aVarH.g = x4bVar4;
        this.e0 = aVarH.a();
        c();
    }

    public void setBoxCornerRadii(float f2, float f3, float f4, float f5) {
        boolean z = getLayoutDirection() == 1;
        this.f0 = z;
        float f6 = z ? f3 : f2;
        if (!z) {
            f2 = f3;
        }
        float f7 = z ? f5 : f4;
        if (!z) {
            f4 = f5;
        }
        fcv fcvVar = this.V;
        if (fcvVar != null && fcvVar.l() == f6 && this.V.m() == f2) {
            fcv fcvVar2 = this.V;
            float[] fArr = fcvVar2.R;
            if ((fArr != null ? fArr[2] : fcvVar2.b.a.h.a(fcvVar2.h())) == f7) {
                fcv fcvVar3 = this.V;
                float[] fArr2 = fcvVar3.R;
                if ((fArr2 != null ? fArr2[1] : fcvVar3.b.a.g.a(fcvVar3.h())) == f4) {
                    return;
                }
            }
        }
        rx80.a aVarH = this.e0.h();
        aVarH.f(f6);
        aVarH.g(f2);
        aVarH.d(f7);
        aVarH.e(f4);
        this.e0 = aVarH.a();
        c();
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(int i) {
        if (this.C0 != i) {
            this.C0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.A0 = colorStateList.getDefaultColor();
            this.I0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.B0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.C0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.C0 != colorStateList.getDefaultColor()) {
            this.C0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            this.D0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.k0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.l0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.A != z) {
            sfn sfnVar = this.z;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.E = appCompatTextView;
                appCompatTextView.setId(com.sportybet.android.gp.tz.R.id.textinput_counter);
                Typeface typeface = this.r0;
                if (typeface != null) {
                    this.E.setTypeface(typeface);
                }
                this.E.setMaxLines(1);
                sfnVar.a(this.E, 2);
                ((ViewGroup.MarginLayoutParams) this.E.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.sportybet.android.gp.tz.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.E != null) {
                    EditText editText = this.e;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                sfnVar.g(this.E, 2);
                this.E = null;
            }
            this.A = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.B != i) {
            if (i > 0) {
                this.B = i;
            } else {
                this.B = -1;
            }
            if (!this.A || this.E == null) {
                return;
            }
            EditText editText = this.e;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.F != i) {
            this.F = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.G != i) {
            this.G = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (o() || (this.E != null && this.C)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.y0 = colorStateList;
        this.z0 = colorStateList;
        if (this.e != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.i.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.i.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        com.google.android.material.textfield.a aVar = this.c;
        CharSequence text = i != 0 ? aVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = aVar.i;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        com.google.android.material.textfield.a aVar = this.c;
        Drawable drawableA = i != 0 ? gr0.a(aVar.getContext(), i) : null;
        TextInputLayout textInputLayout = aVar.a;
        CheckableImageButton checkableImageButton = aVar.i;
        checkableImageButton.setImageDrawable(drawableA);
        if (drawableA != null) {
            d6n.a(textInputLayout, checkableImageButton, aVar.z, aVar.A);
            d6n.c(textInputLayout, checkableImageButton, aVar.z);
        }
    }

    public void setEndIconMinSize(int i) {
        com.google.android.material.textfield.a aVar = this.c;
        if (i < 0) {
            aVar.getClass();
            hb5.a("endIconSize cannot be less than 0");
        } else if (i != aVar.B) {
            aVar.B = i;
            CheckableImageButton checkableImageButton = aVar.i;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = aVar.c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.c;
        CheckableImageButton checkableImageButton = aVar.i;
        View.OnLongClickListener onLongClickListener = aVar.D;
        checkableImageButton.setOnClickListener(onClickListener);
        d6n.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.D = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d6n.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.C = scaleType;
        aVar.i.setScaleType(scaleType);
        aVar.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.c;
        if (aVar.z != colorStateList) {
            aVar.z = colorStateList;
            d6n.a(aVar.a, aVar.i, colorStateList, aVar.A);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.c;
        if (aVar.A != mode) {
            aVar.A = mode;
            d6n.a(aVar.a, aVar.i, aVar.z, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.c.h(z);
    }

    public void setError(CharSequence charSequence) {
        sfn sfnVar = this.z;
        if (!sfnVar.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            sfnVar.f();
            return;
        }
        sfnVar.c();
        sfnVar.p = charSequence;
        sfnVar.r.setText(charSequence);
        int i = sfnVar.n;
        if (i != 1) {
            sfnVar.o = 1;
        }
        sfnVar.i(i, sfnVar.o, sfnVar.h(sfnVar.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        sfn sfnVar = this.z;
        sfnVar.t = i;
        AppCompatTextView appCompatTextView = sfnVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        sfn sfnVar = this.z;
        sfnVar.s = charSequence;
        AppCompatTextView appCompatTextView = sfnVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        sfn sfnVar = this.z;
        TextInputLayout textInputLayout = sfnVar.h;
        if (sfnVar.q == z) {
            return;
        }
        sfnVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(sfnVar.g);
            sfnVar.r = appCompatTextView;
            appCompatTextView.setId(com.sportybet.android.gp.tz.R.id.textinput_error);
            sfnVar.r.setTextAlignment(5);
            Typeface typeface = sfnVar.B;
            if (typeface != null) {
                sfnVar.r.setTypeface(typeface);
            }
            int i = sfnVar.u;
            sfnVar.u = i;
            AppCompatTextView appCompatTextView2 = sfnVar.r;
            if (appCompatTextView2 != null) {
                sfnVar.h.n(appCompatTextView2, i);
            }
            ColorStateList colorStateList = sfnVar.v;
            sfnVar.v = colorStateList;
            AppCompatTextView appCompatTextView3 = sfnVar.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = sfnVar.s;
            sfnVar.s = charSequence;
            AppCompatTextView appCompatTextView4 = sfnVar.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = sfnVar.t;
            sfnVar.t = i2;
            AppCompatTextView appCompatTextView5 = sfnVar.r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            sfnVar.r.setVisibility(4);
            sfnVar.a(sfnVar.r, 0);
        } else {
            sfnVar.f();
            sfnVar.g(sfnVar.r, 0);
            sfnVar.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        sfnVar.q = z;
    }

    public void setErrorIconDrawable(int i) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.i(i != 0 ? gr0.a(aVar.getContext(), i) : null);
        d6n.c(aVar.a, aVar.c, aVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.c;
        CheckableImageButton checkableImageButton = aVar.c;
        View.OnLongClickListener onLongClickListener = aVar.f;
        checkableImageButton.setOnClickListener(onClickListener);
        d6n.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.f = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d6n.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.c;
        if (aVar.d != colorStateList) {
            aVar.d = colorStateList;
            d6n.a(aVar.a, aVar.c, colorStateList, aVar.e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.c;
        if (aVar.e != mode) {
            aVar.e = mode;
            d6n.a(aVar.a, aVar.c, aVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        sfn sfnVar = this.z;
        sfnVar.u = i;
        AppCompatTextView appCompatTextView = sfnVar.r;
        if (appCompatTextView != null) {
            sfnVar.h.n(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        sfn sfnVar = this.z;
        sfnVar.v = colorStateList;
        AppCompatTextView appCompatTextView = sfnVar.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.M0 != z) {
            this.M0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        sfn sfnVar = this.z;
        if (zIsEmpty) {
            if (sfnVar.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!sfnVar.x) {
            setHelperTextEnabled(true);
        }
        sfnVar.c();
        sfnVar.w = charSequence;
        sfnVar.y.setText(charSequence);
        int i = sfnVar.n;
        if (i != 2) {
            sfnVar.o = 2;
        }
        sfnVar.i(i, sfnVar.o, sfnVar.h(sfnVar.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        sfn sfnVar = this.z;
        sfnVar.A = colorStateList;
        AppCompatTextView appCompatTextView = sfnVar.y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        sfn sfnVar = this.z;
        TextInputLayout textInputLayout = sfnVar.h;
        if (sfnVar.x == z) {
            return;
        }
        sfnVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(sfnVar.g);
            sfnVar.y = appCompatTextView;
            appCompatTextView.setId(com.sportybet.android.gp.tz.R.id.textinput_helper_text);
            sfnVar.y.setTextAlignment(5);
            Typeface typeface = sfnVar.B;
            if (typeface != null) {
                sfnVar.y.setTypeface(typeface);
            }
            sfnVar.y.setVisibility(4);
            sfnVar.y.setAccessibilityLiveRegion(1);
            int i = sfnVar.z;
            sfnVar.z = i;
            AppCompatTextView appCompatTextView2 = sfnVar.y;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i);
            }
            ColorStateList colorStateList = sfnVar.A;
            sfnVar.A = colorStateList;
            AppCompatTextView appCompatTextView3 = sfnVar.y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            sfnVar.a(sfnVar.y, 1);
            sfnVar.y.setAccessibilityDelegate(new tfn(sfnVar));
        } else {
            sfnVar.c();
            int i2 = sfnVar.n;
            if (i2 == 2) {
                sfnVar.o = 0;
            }
            sfnVar.i(i2, sfnVar.o, sfnVar.h(sfnVar.y, ""));
            sfnVar.g(sfnVar.y, 1);
            sfnVar.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        sfnVar.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        sfn sfnVar = this.z;
        sfnVar.z = i;
        AppCompatTextView appCompatTextView = sfnVar.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.N0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.S) {
            this.S = z;
            if (z) {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.T)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.U = true;
            } else {
                this.U = false;
                if (!TextUtils.isEmpty(this.T) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.T);
                }
                setHintInternal(null);
            }
            if (this.e != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        q38 q38Var = this.L0;
        if (i != q38Var.p0) {
            q38Var.p0 = i;
            q38Var.l(false);
        }
        q38Var.v(i);
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        q38 q38Var = this.L0;
        q38Var.q(i);
        this.z0 = q38Var.p;
        if (this.e != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            if (this.y0 == null) {
                this.L0.r(colorStateList);
            }
            this.z0 = colorStateList;
            if (this.e != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.D = fVar;
    }

    public void setMaxEms(int i) {
        this.v = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.y = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.i = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.w = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.i.setContentDescription(i != 0 ? aVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.i.setImageDrawable(i != 0 ? gr0.a(aVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        com.google.android.material.textfield.a aVar = this.c;
        if (z && aVar.w != 1) {
            aVar.g(1);
        } else if (z) {
            aVar.getClass();
        } else {
            aVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.z = colorStateList;
        d6n.a(aVar.a, aVar.i, colorStateList, aVar.A);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.A = mode;
        d6n.a(aVar.a, aVar.i, aVar.z, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.J == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.J = appCompatTextView;
            appCompatTextView.setId(com.sportybet.android.gp.tz.R.id.textinput_placeholder);
            this.J.setImportantForAccessibility(1);
            this.J.setAccessibilityLiveRegion(1);
            Fade fadeF = f();
            this.M = fadeF;
            fadeF.b = 67L;
            this.N = f();
            setPlaceholderTextAppearance(this.L);
            setPlaceholderTextColor(this.K);
            r6i0.p(this.J, new b());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.I) {
                setPlaceholderTextEnabled(true);
            }
            this.H = charSequence;
        }
        EditText editText = this.e;
        x(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(int i) {
        this.L = i;
        AppCompatTextView appCompatTextView = this.J;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            AppCompatTextView appCompatTextView = this.J;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        bwd0 bwd0Var = this.b;
        bwd0Var.getClass();
        bwd0Var.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        bwd0Var.b.setText(charSequence);
        bwd0Var.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.b.b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(rx80 rx80Var) {
        fcv fcvVar = this.V;
        if (fcvVar == null || fcvVar.b.a == rx80Var) {
            return;
        }
        this.e0 = rx80Var;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.b.d.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? gr0.a(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        bwd0 bwd0Var = this.b;
        if (i < 0) {
            bwd0Var.getClass();
            hb5.a("startIconSize cannot be less than 0");
        } else if (i != bwd0Var.i) {
            bwd0Var.i = i;
            CheckableImageButton checkableImageButton = bwd0Var.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        bwd0 bwd0Var = this.b;
        CheckableImageButton checkableImageButton = bwd0Var.d;
        View.OnLongClickListener onLongClickListener = bwd0Var.w;
        checkableImageButton.setOnClickListener(onClickListener);
        d6n.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        bwd0 bwd0Var = this.b;
        bwd0Var.w = onLongClickListener;
        CheckableImageButton checkableImageButton = bwd0Var.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d6n.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        bwd0 bwd0Var = this.b;
        bwd0Var.v = scaleType;
        bwd0Var.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        bwd0 bwd0Var = this.b;
        if (bwd0Var.e != colorStateList) {
            bwd0Var.e = colorStateList;
            d6n.a(bwd0Var.a, bwd0Var.d, colorStateList, bwd0Var.f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        bwd0 bwd0Var = this.b;
        if (bwd0Var.f != mode) {
            bwd0Var.f = mode;
            d6n.a(bwd0Var.a, bwd0Var.d, bwd0Var.e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.b.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.getClass();
        aVar.E = TextUtils.isEmpty(charSequence) ? null : charSequence;
        aVar.F.setText(charSequence);
        aVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.c.F.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.F.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.e;
        if (editText != null) {
            r6i0.p(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.r0) {
            this.r0 = typeface;
            q38 q38Var = this.L0;
            boolean zT = q38Var.t(typeface);
            boolean z = q38Var.z(typeface);
            if (zT || z) {
                q38Var.l(false);
            }
            sfn sfnVar = this.z;
            if (typeface != sfnVar.B) {
                sfnVar.B = typeface;
                AppCompatTextView appCompatTextView = sfnVar.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = sfnVar.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.E;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.e;
        if (editText == null || this.h0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = sdf.a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(zq0.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.C && (appCompatTextView = this.E) != null) {
            drawableMutate.setColorFilter(zq0.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.e.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.e;
        if (editText == null || this.V == null) {
            return;
        }
        if ((this.b0 || editText.getBackground() == null) && this.h0 != 0) {
            this.e.setBackground(getEditTextBoxBackground());
            this.b0 = true;
        }
    }

    public final void v() {
        if (this.h0 != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.y0;
        q38 q38Var = this.L0;
        if (colorStateList2 != null) {
            q38Var.n(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.y0;
            int colorForState = this.I0;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            q38Var.n(ColorStateList.valueOf(colorForState));
        } else if (o()) {
            AppCompatTextView appCompatTextView2 = this.z.r;
            q38Var.n(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.C && (appCompatTextView = this.E) != null) {
            q38Var.n(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.z0) != null) {
            q38Var.r(colorStateList);
        }
        com.google.android.material.textfield.a aVar = this.c;
        bwd0 bwd0Var = this.b;
        if (z3 || !this.M0 || (isEnabled() && z4)) {
            if (z2 || this.K0) {
                ValueAnimator valueAnimator = this.O0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.O0.cancel();
                }
                if (z && this.N0) {
                    b(1.0f);
                } else {
                    q38Var.A(1.0f);
                }
                this.K0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.e;
                x(editText3 != null ? editText3.getText() : null);
                bwd0Var.y = false;
                bwd0Var.e();
                aVar.G = false;
                aVar.n();
                return;
            }
            return;
        }
        if (z2 || !this.K0) {
            ValueAnimator valueAnimator2 = this.O0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.O0.cancel();
            }
            if (z && this.N0) {
                b(0.0f);
            } else {
                q38Var.A(0.0f);
            }
            if (g() && !((ilc) this.V).W.s.isEmpty() && g()) {
                ((ilc) this.V).E(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.K0 = true;
            AppCompatTextView appCompatTextView3 = this.J;
            if (appCompatTextView3 != null && this.I) {
                appCompatTextView3.setText((CharSequence) null);
                androidx.transition.e.a(this.a, this.N);
                this.J.setVisibility(4);
            }
            bwd0Var.y = true;
            bwd0Var.e();
            aVar.G = true;
            aVar.n();
        }
    }

    public final void x(Editable editable) {
        ((sjf0) this.D).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.a;
        if (length != 0 || this.K0) {
            AppCompatTextView appCompatTextView = this.J;
            if (appCompatTextView == null || !this.I) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            androidx.transition.e.a(frameLayout, this.N);
            this.J.setVisibility(4);
            return;
        }
        if (this.J == null || !this.I || TextUtils.isEmpty(this.H)) {
            return;
        }
        this.J.setText(this.H);
        androidx.transition.e.a(frameLayout, this.M);
        this.J.setVisibility(0);
        this.J.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.D0.getDefaultColor();
        int colorForState = this.D0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.D0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.m0 = colorForState2;
        } else if (z2) {
            this.m0 = colorForState;
        } else {
            this.m0 = defaultColor;
        }
    }

    public final void z() {
        AppCompatTextView appCompatTextView;
        int i;
        EditText editText;
        EditText editText2;
        if (this.V == null || this.h0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.e) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.m0 = this.I0;
        } else if (o()) {
            if (this.D0 != null) {
                y(z2, z);
            } else {
                this.m0 = getErrorCurrentTextColors();
            }
        } else if (!this.C || (appCompatTextView = this.E) == null) {
            if (z2) {
                this.m0 = this.C0;
            } else if (z) {
                this.m0 = this.B0;
            } else {
                this.m0 = this.A0;
            }
        } else if (this.D0 != null) {
            y(z2, z);
        } else {
            this.m0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        com.google.android.material.textfield.a aVar = this.c;
        TextInputLayout textInputLayout = aVar.a;
        CheckableImageButton checkableImageButton = aVar.i;
        TextInputLayout textInputLayout2 = aVar.a;
        aVar.l();
        d6n.c(textInputLayout2, aVar.c, aVar.d);
        d6n.c(textInputLayout2, checkableImageButton, aVar.z);
        if (aVar.b() instanceof jff) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                d6n.a(textInputLayout, checkableImageButton, aVar.z, aVar.A);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        bwd0 bwd0Var = this.b;
        d6n.c(bwd0Var.a, bwd0Var.d, bwd0Var.e);
        if (this.h0 == 2) {
            int i2 = this.j0;
            if (z2 && isEnabled()) {
                i = this.l0;
                this.j0 = i;
            } else {
                i = this.k0;
                this.j0 = i;
            }
            if (i != i2 && g() && !this.K0) {
                if (g()) {
                    ((ilc) this.V).E(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.h0 == 1) {
            if (!isEnabled()) {
                this.n0 = this.F0;
            } else if (z && !z2) {
                this.n0 = this.H0;
            } else if (z2) {
                this.n0 = this.G0;
            } else {
                this.n0 = this.E0;
            }
        }
        c();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public CharSequence c;
        public boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.d = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.S) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.b(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.i.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.i.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.i(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        com.google.android.material.textfield.a aVar = this.c;
        TextInputLayout textInputLayout = aVar.a;
        CheckableImageButton checkableImageButton = aVar.i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            d6n.a(textInputLayout, checkableImageButton, aVar.z, aVar.A);
            d6n.c(textInputLayout, checkableImageButton, aVar.z);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.sportybet.android.gp.tz.R.attr.textInputStyle);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
