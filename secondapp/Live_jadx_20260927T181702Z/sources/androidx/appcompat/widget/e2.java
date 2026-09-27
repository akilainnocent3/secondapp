package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class e2 extends CompoundButton implements g1 {
    public static final int T = 250;
    public static final int U = 0;
    public static final int V = 1;
    public static final int W = 2;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f7050a0 = "android.widget.Switch";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f7051b0 = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f7052c0 = 2;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f7053d0 = 3;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Property<e2, Float> f7054e0 = new a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int[] f7055f0 = {R.attr.state_checked};
    public float A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public final TextPaint J;
    public ColorStateList K;
    public Layout L;
    public Layout M;

    @Nullable
    public TransformationMethod N;
    public ObjectAnimator O;
    public final q0 P;

    @NonNull
    public y Q;

    @Nullable
    public b R;
    public final Rect S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f7056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f7057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f7058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f7061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f7062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f7063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7067m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7068n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7069o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f7070p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f7071q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f7072r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f7073s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7074t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7075u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7076v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f7077w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f7078x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public VelocityTracker f7079y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7080z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends Property<e2, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(e2 e2Var) {
            return Float.valueOf(e2Var.A);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e2 e2Var, Float f10) {
            e2Var.setThumbPosition(f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends androidx.emoji2.text.g.AbstractC0065g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference<e2> f7081a;

        public b(e2 e2Var) {
            this.f7081a = new WeakReference(e2Var);
        }

        @Override // androidx.emoji2.text.g.AbstractC0065g
        public void a(@Nullable Throwable th2) {
            e2 e2Var = this.f7081a.get();
            if (e2Var != null) {
                e2Var.j();
            }
        }

        @Override // androidx.emoji2.text.g.AbstractC0065g
        public void b() {
            e2 e2Var = this.f7081a.get();
            if (e2Var != null) {
                e2Var.j();
            }
        }
    }

    public e2(@NonNull Context context) {
        this(context, null);
    }

    public static float f(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    @NonNull
    private y getEmojiTextViewHelper() {
        if (this.Q == null) {
            this.Q = new y(this);
        }
        return this.Q;
    }

    private boolean getTargetCheckedState() {
        return this.A > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((z2.b(this) ? 1.0f - this.A : this.A) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f7061g;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.S;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f7056b;
        Rect rectD = drawable2 != null ? e1.d(drawable2) : e1.f7043c;
        return ((((this.B - this.D) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f7072r = charSequence;
        this.f7073s = g(charSequence);
        this.M = null;
        if (this.f7074t) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f7070p = charSequence;
        this.f7071q = g(charSequence);
        this.L = null;
        if (this.f7074t) {
            p();
        }
    }

    public final void a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f7054e0, z10 ? 1.0f : 0.0f);
        this.O = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.O.setAutoCancel(true);
        this.O.start();
    }

    public final void b() {
        Drawable drawable = this.f7056b;
        if (drawable != null) {
            if (this.f7059e || this.f7060f) {
                Drawable drawableMutate = l1.d.r(drawable).mutate();
                this.f7056b = drawableMutate;
                if (this.f7059e) {
                    l1.d.o(drawableMutate, this.f7057c);
                }
                if (this.f7060f) {
                    l1.d.p(this.f7056b, this.f7058d);
                }
                if (this.f7056b.isStateful()) {
                    this.f7056b.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.f7061g;
        if (drawable != null) {
            if (this.f7064j || this.f7065k) {
                Drawable drawableMutate = l1.d.r(drawable).mutate();
                this.f7061g = drawableMutate;
                if (this.f7064j) {
                    l1.d.o(drawableMutate, this.f7062h);
                }
                if (this.f7065k) {
                    l1.d.p(this.f7061g, this.f7063i);
                }
                if (this.f7061g.isStateful()) {
                    this.f7061g.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.O;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.S;
        int i12 = this.E;
        int i13 = this.F;
        int i14 = this.G;
        int i15 = this.H;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f7056b;
        Rect rectD = drawable != null ? e1.d(drawable) : e1.f7043c;
        Drawable drawable2 = this.f7061g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectD != null) {
                int i17 = rectD.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectD.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectD.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectD.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f7061g.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f7061g.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f7056b;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.D + rect.right;
            this.f7056b.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                l1.d.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f7056b;
        if (drawable != null) {
            l1.d.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f7061g;
        if (drawable2 != null) {
            l1.d.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7056b;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f7061g;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Nullable
    public final CharSequence g(@Nullable CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.N);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!z2.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f7068n : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (z2.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f7068n : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.q.F(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f7074t;
    }

    public boolean getSplitTrack() {
        return this.f7069o;
    }

    public int getSwitchMinWidth() {
        return this.f7067m;
    }

    public int getSwitchPadding() {
        return this.f7068n;
    }

    public CharSequence getTextOff() {
        return this.f7072r;
    }

    public CharSequence getTextOn() {
        return this.f7070p;
    }

    public Drawable getThumbDrawable() {
        return this.f7056b;
    }

    @k.w(from = 0.0d, to = 1.0d)
    public final float getThumbPosition() {
        return this.A;
    }

    public int getThumbTextPadding() {
        return this.f7066l;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f7057c;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.f7058d;
    }

    public Drawable getTrackDrawable() {
        return this.f7061g;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f7062h;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.f7063i;
    }

    public final boolean h(float f10, float f11) {
        if (this.f7056b == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f7056b.getPadding(this.S);
        int i10 = this.F;
        int i11 = this.f7076v;
        int i12 = i10 - i11;
        int i13 = (this.E + thumbOffset) - i11;
        int i14 = this.D + i13;
        Rect rect = this.S;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.H + i11));
    }

    public final Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.J;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // androidx.appcompat.widget.g1
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    public void j() {
        setTextOnInternal(this.f7070p);
        setTextOffInternal(this.f7072r);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7056b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f7061g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.O;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.O.end();
        this.O = null;
    }

    public final void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f7072r;
            if (string == null) {
                string = getResources().getString(m.a.k.f105785g);
            }
            f2.z1.z2(this, string);
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f7070p;
            if (string == null) {
                string = getResources().getString(m.a.k.f105786h);
            }
            f2.z1.z2(this, string);
        }
    }

    public void m(Context context, int i10) {
        l2 l2VarE = l2.E(context, i10, m.a.m.f105994a6);
        ColorStateList colorStateListD = l2VarE.d(m.a.m.f106030e6);
        if (colorStateListD != null) {
            this.K = colorStateListD;
        } else {
            this.K = getTextColors();
        }
        int iG = l2VarE.g(m.a.m.f106003b6, 0);
        if (iG != 0) {
            float f10 = iG;
            if (f10 != this.J.getTextSize()) {
                this.J.setTextSize(f10);
                requestLayout();
            }
        }
        o(l2VarE.o(m.a.m.f106012c6, -1), l2VarE.o(m.a.m.f106021d6, -1));
        if (l2VarE.a(m.a.m.f106124p6, false)) {
            this.N = new q.a(getContext());
        } else {
            this.N = null;
        }
        setTextOnInternal(this.f7070p);
        setTextOffInternal(this.f7072r);
        l2VarE.I();
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.J.setFakeBoldText(false);
            this.J.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.J.setFakeBoldText((i11 & 1) != 0);
            this.J.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public final void o(int i10, int i11) {
        Typeface typeface;
        if (i10 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i10 != 2) {
            typeface = i10 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        n(typeface, i11);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7055f0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.S;
        Drawable drawable = this.f7061g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.F;
        int i11 = this.H;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f7056b;
        if (drawable != null) {
            if (!this.f7069o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = e1.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.L : this.M;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.K;
            if (colorStateList != null) {
                this.J.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.J.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f7050a0);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f7050a0);
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f7070p : this.f7072r;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int i14;
        int paddingTop;
        int height;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f7056b != null) {
            Rect rect = this.S;
            Drawable drawable = this.f7061g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = e1.d(this.f7056b);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (z2.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.B + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.B) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i14 = this.C;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.C;
            }
            this.E = paddingLeft;
            this.F = paddingTop;
            this.H = height;
            this.G = width;
        }
        int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
        i14 = this.C;
        paddingTop = paddingTop2 - (i14 / 2);
        height = i14 + paddingTop;
        this.E = paddingLeft;
        this.F = paddingTop;
        this.H = height;
        this.G = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f7074t) {
            if (this.L == null) {
                this.L = i(this.f7071q);
            }
            if (this.M == null) {
                this.M = i(this.f7073s);
            }
        }
        Rect rect = this.S;
        Drawable drawable = this.f7056b;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f7056b.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f7056b.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.D = Math.max(this.f7074t ? Math.max(this.L.getWidth(), this.M.getWidth()) + (this.f7066l * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f7061g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f7061g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f7056b;
        if (drawable3 != null) {
            Rect rectD = e1.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.I ? Math.max(this.f7067m, (this.D * 2) + iMax + iMax2) : this.f7067m;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.B = iMax3;
        this.C = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f7070p : this.f7072r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        this.f7079y.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (isEnabled() && h(x10, y10)) {
                this.f7075u = 1;
                this.f7077w = x10;
                this.f7078x = y10;
            }
        } else if (actionMasked == 1) {
            if (this.f7075u == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f7075u = 0;
            this.f7079y.clear();
        } else if (actionMasked == 2) {
            int i10 = this.f7075u;
            if (i10 == 1) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                if (Math.abs(x11 - this.f7077w) > this.f7076v || Math.abs(y11 - this.f7078x) > this.f7076v) {
                    this.f7075u = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f7077w = x11;
                    this.f7078x = y11;
                    return true;
                }
            } else if (i10 == 2) {
                float x12 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f11 = x12 - this.f7077w;
                if (thumbScrollRange != 0) {
                    f10 = f11 / thumbScrollRange;
                } else {
                    f10 = f11 > 0.0f ? 1.0f : -1.0f;
                }
                if (z2.b(this)) {
                    f10 = -f10;
                }
                float f12 = f(this.A + f10, 0.0f, 1.0f);
                if (f12 != this.A) {
                    this.f7077w = x12;
                    setThumbPosition(f12);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f7075u == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f7075u = 0;
            this.f7079y.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (this.R == null && this.Q.b() && androidx.emoji2.text.g.q()) {
            androidx.emoji2.text.g gVarC = androidx.emoji2.text.g.c();
            int i10 = gVarC.i();
            if (i10 == 3 || i10 == 0) {
                b bVar = new b(this);
                this.R = bVar;
                gVarC.B(bVar);
            }
        }
    }

    public final void q(MotionEvent motionEvent) {
        this.f7075u = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f7079y.computeCurrentVelocity(1000);
            float xVelocity = this.f7079y.getXVelocity();
            if (Math.abs(xVelocity) <= this.f7080z) {
                targetCheckedState = getTargetCheckedState();
            } else if (!z2.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.q.G(this, callback));
    }

    @Override // androidx.appcompat.widget.g1
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f7070p);
        setTextOffInternal(this.f7072r);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.I = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f7074t != z10) {
            this.f7074t = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f7069o = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f7067m = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f7068n = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.J.getTypeface() == null || this.J.getTypeface().equals(typeface)) && (this.J.getTypeface() != null || typeface == null)) {
            return;
        }
        this.J.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7056b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f7056b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.A = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(n.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f7066l = i10;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f7057c = colorStateList;
        this.f7059e = true;
        b();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.f7058d = mode;
        this.f7060f = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7061g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f7061g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(n.a.b(getContext(), i10));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f7062h = colorStateList;
        this.f7064j = true;
        c();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.f7063i = mode;
        this.f7065k = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7056b || drawable == this.f7061g;
    }

    public e2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, m.a.b.f105459l3);
    }

    public e2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7057c = null;
        this.f7058d = null;
        this.f7059e = false;
        this.f7060f = false;
        this.f7062h = null;
        this.f7063i = null;
        this.f7064j = false;
        this.f7065k = false;
        this.f7079y = VelocityTracker.obtain();
        this.I = true;
        this.S = new Rect();
        g2.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.J = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        l2 l2VarG = l2.G(context, attributeSet, m.a.m.L5, i10, 0);
        f2.z1.E1(this, context, m.a.m.L5, attributeSet, l2VarG.B(), i10, 0);
        Drawable drawableH = l2VarG.h(m.a.m.O5);
        this.f7056b = drawableH;
        if (drawableH != null) {
            drawableH.setCallback(this);
        }
        Drawable drawableH2 = l2VarG.h(m.a.m.X5);
        this.f7061g = drawableH2;
        if (drawableH2 != null) {
            drawableH2.setCallback(this);
        }
        setTextOnInternal(l2VarG.x(m.a.m.M5));
        setTextOffInternal(l2VarG.x(m.a.m.N5));
        this.f7074t = l2VarG.a(m.a.m.P5, true);
        this.f7066l = l2VarG.g(m.a.m.U5, 0);
        this.f7067m = l2VarG.g(m.a.m.R5, 0);
        this.f7068n = l2VarG.g(m.a.m.S5, 0);
        this.f7069o = l2VarG.a(m.a.m.Q5, false);
        ColorStateList colorStateListD = l2VarG.d(m.a.m.V5);
        if (colorStateListD != null) {
            this.f7057c = colorStateListD;
            this.f7059e = true;
        }
        PorterDuff.Mode modeE = e1.e(l2VarG.o(m.a.m.W5, -1), null);
        if (this.f7058d != modeE) {
            this.f7058d = modeE;
            this.f7060f = true;
        }
        if (this.f7059e || this.f7060f) {
            b();
        }
        ColorStateList colorStateListD2 = l2VarG.d(m.a.m.Y5);
        if (colorStateListD2 != null) {
            this.f7062h = colorStateListD2;
            this.f7064j = true;
        }
        PorterDuff.Mode modeE2 = e1.e(l2VarG.o(m.a.m.Z5, -1), null);
        if (this.f7063i != modeE2) {
            this.f7063i = modeE2;
            this.f7065k = true;
        }
        if (this.f7064j || this.f7065k) {
            c();
        }
        int iU = l2VarG.u(m.a.m.T5, 0);
        if (iU != 0) {
            m(context, iU);
        }
        q0 q0Var = new q0(this);
        this.P = q0Var;
        q0Var.m(attributeSet, i10);
        l2VarG.I();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7076v = viewConfiguration.getScaledTouchSlop();
        this.f7080z = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
