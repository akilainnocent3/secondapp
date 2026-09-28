package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.Chip;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Reader;
import com.sportygames.crash.models.header.snc.OdQr;
import defpackage.b6w;
import defpackage.bbv;
import defpackage.bdf;
import defpackage.bjb0;
import defpackage.c7;
import defpackage.ecv;
import defpackage.eff0;
import defpackage.f0h;
import defpackage.gcv;
import defpackage.gof0;
import defpackage.gr0;
import defpackage.hff0;
import defpackage.lk7;
import defpackage.o0b;
import defpackage.o54;
import defpackage.odf0;
import defpackage.pk30;
import defpackage.qy80;
import defpackage.r6i0;
import defpackage.rx80;
import defpackage.tcv;
import defpackage.ubv;
import defpackage.yt50;
import defpackage.zkh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class Chip extends AppCompatCheckBox implements com.google.android.material.chip.a.InterfaceC0193a, qy80, ubv<Chip> {
    public static final Rect M = new Rect();
    public static final int[] N = {R.attr.state_selected};
    public static final int[] O = {R.attr.state_checkable};
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public CharSequence G;
    public final b H;
    public boolean I;
    public final Rect J;
    public final RectF K;
    public final a L;
    public com.google.android.material.chip.a e;
    public InsetDrawable f;
    public RippleDrawable i;
    public View.OnClickListener v;
    public CompoundButton.OnCheckedChangeListener w;
    public ubv.a<Chip> y;
    public boolean z;

    public class a extends bjb0 {
        public a() {
        }

        @Override // defpackage.bjb0
        public final void b0(int i) {
        }

        @Override // defpackage.bjb0
        public final void c0(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.e;
            chip.setText(aVar.b1 ? aVar.d0 : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }
    }

    public class b extends f0h {
        public b(Chip chip) {
            super(chip);
        }

        @Override // defpackage.f0h
        public final int n(float f, float f2) {
            Rect rect = Chip.M;
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.e;
            if (aVar == null) {
                return 0;
            }
            Drawable drawable = aVar.k0;
            return ((drawable != null ? bdf.a(drawable) : null) == null || !chip.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        @Override // defpackage.f0h
        public final void o(ArrayList arrayList) {
            com.google.android.material.chip.a aVar;
            arrayList.add(0);
            Rect rect = Chip.M;
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar2 = chip.e;
            if (aVar2 != null) {
                Drawable drawable = aVar2.k0;
                if ((drawable != null ? bdf.a(drawable) : null) == null || (aVar = chip.e) == null || !aVar.j0 || chip.v == null) {
                    return;
                }
                arrayList.add(1);
            }
        }

        @Override // defpackage.f0h
        public final boolean s(int i, int i2, Bundle bundle) {
            boolean z = false;
            if (i2 == 16) {
                Chip chip = Chip.this;
                if (i == 0) {
                    return chip.performClick();
                }
                if (i == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.v;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    if (chip.I) {
                        chip.H.x(1, 1);
                    }
                }
            }
            return z;
        }

        @Override // defpackage.f0h
        public final void t(c7 c7Var) {
            AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.e;
            accessibilityNodeInfo.setCheckable(aVar != null && aVar.p0);
            accessibilityNodeInfo.setClickable(chip.isClickable());
            c7Var.l(chip.getAccessibilityClassName());
            c7Var.w(chip.getText());
        }

        @Override // defpackage.f0h
        public final void u(int i, c7 c7Var) {
            AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
            if (i != 1) {
                c7Var.o("");
                accessibilityNodeInfo.setBoundsInParent(Chip.M);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                c7Var.o(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                c7Var.o(chip.getContext().getString(com.sportybet.android.gp.tz.R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            c7Var.b(c7.a.g);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            c7Var.l(Button.class.getName());
        }

        @Override // defpackage.f0h
        public final void v(int i, boolean z) {
            Chip chip = Chip.this;
            if (i == 1) {
                chip.C = z;
            }
            com.google.android.material.chip.a aVar = chip.e;
            boolean z2 = chip.C;
            boolean zC0 = false;
            if (aVar.k0 != null) {
                zC0 = aVar.c0(z2 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : com.google.android.material.chip.a.e1);
            }
            if (zC0) {
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(tcv.a(context, attributeSet, i, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, i);
        this.J = new Rect();
        this.K = new RectF();
        this.L = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                zkh.a("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                zkh.a("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                zkh.a("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                zkh.a("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                zkh.a("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context2, attributeSet, i);
        Context context3 = aVar.D0;
        int[] iArr = pk30.i;
        TypedArray typedArrayD = gof0.d(context3, attributeSet, iArr, i, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        aVar.d1 = typedArrayD.hasValue(37);
        Context context4 = aVar.D0;
        ColorStateList colorStateListA = ecv.a(24, context4, typedArrayD);
        if (aVar.W != colorStateListA) {
            aVar.W = colorStateListA;
            aVar.onStateChange(aVar.getState());
        }
        ColorStateList colorStateListA2 = ecv.a(11, context4, typedArrayD);
        if (aVar.X != colorStateListA2) {
            aVar.X = colorStateListA2;
            aVar.onStateChange(aVar.getState());
        }
        float dimension = typedArrayD.getDimension(19, 0.0f);
        if (aVar.Y != dimension) {
            aVar.Y = dimension;
            aVar.invalidateSelf();
            aVar.L();
        }
        if (typedArrayD.hasValue(12)) {
            aVar.R(typedArrayD.getDimension(12, 0.0f));
        }
        aVar.W(ecv.a(22, context4, typedArrayD));
        aVar.X(typedArrayD.getDimension(23, 0.0f));
        aVar.h0(ecv.a(36, context4, typedArrayD));
        String text = typedArrayD.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(aVar.d0, text);
        hff0 hff0Var = aVar.J0;
        if (!zEquals) {
            aVar.d0 = text;
            hff0Var.e = true;
            aVar.invalidateSelf();
            aVar.L();
        }
        odf0 odf0Var = (!typedArrayD.hasValue(0) || (resourceId = typedArrayD.getResourceId(0, 0)) == 0) ? null : new odf0(context4, resourceId);
        odf0Var.l = typedArrayD.getDimension(1, odf0Var.l);
        hff0Var.c(odf0Var, context4);
        int i2 = typedArrayD.getInt(3, 0);
        if (i2 == 1) {
            aVar.a1 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            aVar.a1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            aVar.a1 = TextUtils.TruncateAt.END;
        }
        aVar.V(typedArrayD.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            aVar.V(typedArrayD.getBoolean(15, false));
        }
        aVar.S(ecv.d(14, context4, typedArrayD));
        if (typedArrayD.hasValue(17)) {
            aVar.U(ecv.a(17, context4, typedArrayD));
        }
        aVar.T(typedArrayD.getDimension(16, -1.0f));
        aVar.e0(typedArrayD.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            aVar.e0(typedArrayD.getBoolean(26, false));
        }
        aVar.Y(ecv.d(25, context4, typedArrayD));
        aVar.d0(ecv.a(30, context4, typedArrayD));
        aVar.a0(typedArrayD.getDimension(28, 0.0f));
        aVar.N(typedArrayD.getBoolean(6, false));
        aVar.Q(typedArrayD.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            aVar.Q(typedArrayD.getBoolean(8, false));
        }
        aVar.O(ecv.d(7, context4, typedArrayD));
        if (typedArrayD.hasValue(9)) {
            aVar.P(ecv.a(9, context4, typedArrayD));
        }
        aVar.t0 = b6w.a(39, context4, typedArrayD);
        aVar.u0 = b6w.a(33, context4, typedArrayD);
        float dimension2 = typedArrayD.getDimension(21, 0.0f);
        if (aVar.v0 != dimension2) {
            aVar.v0 = dimension2;
            aVar.invalidateSelf();
            aVar.L();
        }
        aVar.g0(typedArrayD.getDimension(35, 0.0f));
        aVar.f0(typedArrayD.getDimension(34, 0.0f));
        float dimension3 = typedArrayD.getDimension(41, 0.0f);
        if (aVar.y0 != dimension3) {
            aVar.y0 = dimension3;
            aVar.invalidateSelf();
            aVar.L();
        }
        float dimension4 = typedArrayD.getDimension(40, 0.0f);
        if (aVar.z0 != dimension4) {
            aVar.z0 = dimension4;
            aVar.invalidateSelf();
            aVar.L();
        }
        aVar.b0(typedArrayD.getDimension(29, 0.0f));
        aVar.Z(typedArrayD.getDimension(27, 0.0f));
        float dimension5 = typedArrayD.getDimension(13, 0.0f);
        if (aVar.C0 != dimension5) {
            aVar.C0 = dimension5;
            aVar.invalidateSelf();
            aVar.L();
        }
        aVar.c1 = typedArrayD.getDimensionPixelSize(4, Reader.READ_DONE);
        typedArrayD.recycle();
        gof0.a(context2, attributeSet, i, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_Chip_Action);
        gof0.b(context2, attributeSet, iArr, i, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_Chip_Action);
        this.D = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.F = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, bbv.d(context2)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(aVar);
        aVar.r(getElevation());
        gof0.a(context2, attributeSet, i, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_Chip_Action);
        gof0.b(context2, attributeSet, iArr, i, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, i, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.H = new b(this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new lk7(this));
        }
        setChecked(this.z);
        setText(aVar.d0);
        setEllipsize(aVar.a1);
        h();
        if (!this.e.b1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.D) {
            setMinHeight(this.F);
        }
        this.E = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kk7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Rect rect = Chip.M;
                Chip chip = this.a;
                ubv.a<Chip> aVar2 = chip.y;
                if (aVar2 != null) {
                    nj7 nj7Var = ((mj7) aVar2).a;
                    if (!z ? nj7Var.e(chip, nj7Var.e) : nj7Var.a(chip)) {
                        nj7Var.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.w;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.K;
        rectF.setEmpty();
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            Drawable drawable = aVar.k0;
            if ((drawable != null ? bdf.a(drawable) : null) != null && this.v != null) {
                com.google.android.material.chip.a aVar2 = this.e;
                Rect bounds = aVar2.getBounds();
                rectF.setEmpty();
                if (aVar2.k0()) {
                    float f = aVar2.C0 + aVar2.B0 + aVar2.n0 + aVar2.A0 + aVar2.z0;
                    if (aVar2.getLayoutDirection() == 0) {
                        float f2 = bounds.right;
                        rectF.right = f2;
                        rectF.left = f2 - f;
                    } else {
                        float f3 = bounds.left;
                        rectF.left = f3;
                        rectF.right = f3 + f;
                    }
                    rectF.top = bounds.top;
                    rectF.bottom = bounds.bottom;
                }
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.J;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private odf0 getTextAppearance() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.J0.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.B != z) {
            this.B = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.A != z) {
            this.A = z;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0193a
    public final void a() {
        d(this.F);
        requestLayout();
        invalidateOutline();
    }

    public final void d(int i) {
        this.F = i;
        if (!this.D) {
            InsetDrawable insetDrawable = this.f;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.e.Y));
        int iMax2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        f();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.I) {
            return this.H.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        if (!this.I) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.H;
        bVar.getClass();
        boolean zQ = false;
        int i2 = 0;
        zQ = false;
        zQ = false;
        zQ = false;
        zQ = false;
        zQ = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && bVar.q(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zQ = z;
                            }
                            break;
                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = bVar.l;
                                if (i != Integer.MIN_VALUE) {
                                    bVar.s(i, 16, null);
                                }
                                zQ = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = bVar.l;
                    if (i != Integer.MIN_VALUE) {
                        bVar.s(i, 16, null);
                    }
                    zQ = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zQ = bVar.q(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zQ = bVar.q(1, null);
            }
        }
        if (!zQ || bVar.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.e;
        boolean zC0 = false;
        int i2 = 0;
        zC0 = false;
        if (aVar != null && com.google.android.material.chip.a.K(aVar.k0)) {
            com.google.android.material.chip.a aVar2 = this.e;
            ?? IsEnabled = isEnabled();
            if (this.C) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.B) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.A) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.C) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.B) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.A) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            zC0 = aVar2.c0(iArr);
        }
        if (zC0) {
            invalidate();
        }
    }

    public final void e() {
        com.google.android.material.chip.a aVar;
        com.google.android.material.chip.a aVar2 = this.e;
        if (aVar2 != null) {
            Drawable drawable = aVar2.k0;
            if ((drawable != null ? bdf.a(drawable) : null) != null && (aVar = this.e) != null && aVar.j0 && this.v != null) {
                r6i0.p(this, this.H);
                this.I = true;
                return;
            }
        }
        r6i0.p(this, null);
        this.I = false;
    }

    public final void f() {
        this.i = new RippleDrawable(yt50.c(this.e.c0), getBackgroundDrawable(), null);
        this.e.getClass();
        setBackground(this.i);
        g();
    }

    public final void g() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.e) == null) {
            return;
        }
        int iH = (int) (aVar.H() + aVar.C0 + aVar.z0);
        com.google.android.material.chip.a aVar2 = this.e;
        int iG = (int) (aVar2.G() + aVar2.v0 + aVar2.y0);
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            iG += rect.left;
            iH += rect.right;
        }
        setPaddingRelative(iG, getPaddingTop(), iH, getPaddingBottom());
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.G)) {
            return this.G;
        }
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || !aVar.p0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).v.d) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.r0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.s0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.X;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.I());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.C0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || (drawable = aVar.f0) == null) {
            return null;
        }
        return bdf.a(drawable);
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.h0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.g0;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.Y;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.v0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.a0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.b0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || (drawable = aVar.k0) == null) {
            return null;
        }
        return bdf.a(drawable);
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.o0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.B0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.n0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.A0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.m0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.a1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.I) {
            b bVar = this.H;
            if (bVar.l == 1 || bVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public b6w getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.u0;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.x0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.w0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.c0;
        }
        return null;
    }

    public rx80 getShapeAppearanceModel() {
        return this.e.b.a;
    }

    public b6w getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.t0;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.z0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            return aVar.y0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        odf0 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.L);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gcv.c(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, N);
        }
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null && aVar.p0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, O);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.I) {
            b bVar = this.H;
            int i2 = bVar.l;
            if (i2 != Integer.MIN_VALUE) {
                bVar.j(i2);
            }
            if (z) {
                bVar.q(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        com.google.android.material.chip.a aVar = this.e;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(aVar != null && aVar.p0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.c) {
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i2);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i2).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(com.sportybet.android.gp.tz.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c7.f.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, false, isChecked()).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.E != i) {
            this.E = i;
            g();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.A) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.A) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.v;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.I) {
                        this.H.x(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.G = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.i) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.i) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.N(z);
        }
    }

    public void setCheckableResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.N(aVar.D0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null) {
            this.z = z;
        } else if (aVar.p0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.O(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.O(gr0.a(aVar.D0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.P(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.P(o0b.b(aVar.D0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.Q(aVar.D0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.X == colorStateList) {
            return;
        }
        aVar.X = colorStateList;
        aVar.onStateChange(aVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListB;
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.X == (colorStateListB = o0b.b(aVar.D0, i))) {
            return;
        }
        aVar.X = colorStateListB;
        aVar.onStateChange(aVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.R(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.R(aVar.D0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.e;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.Z0 = new WeakReference<>(null);
            }
            this.e = aVar;
            aVar.b1 = false;
            aVar.Z0 = new WeakReference<>(this);
            d(this.F);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.C0 == f) {
            return;
        }
        aVar.C0 = f;
        aVar.invalidateSelf();
        aVar.L();
    }

    public void setChipEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            float dimension = aVar.D0.getResources().getDimension(i);
            if (aVar.C0 != dimension) {
                aVar.C0 = dimension;
                aVar.invalidateSelf();
                aVar.L();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.S(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.S(gr0.a(aVar.D0, i));
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.T(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.T(aVar.D0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.U(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.U(o0b.b(aVar.D0, i));
        }
    }

    public void setChipIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.V(aVar.D0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.Y == f) {
            return;
        }
        aVar.Y = f;
        aVar.invalidateSelf();
        aVar.L();
    }

    public void setChipMinHeightResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            float dimension = aVar.D0.getResources().getDimension(i);
            if (aVar.Y != dimension) {
                aVar.Y = dimension;
                aVar.invalidateSelf();
                aVar.L();
            }
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.v0 == f) {
            return;
        }
        aVar.v0 = f;
        aVar.invalidateSelf();
        aVar.L();
    }

    public void setChipStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            float dimension = aVar.D0.getResources().getDimension(i);
            if (aVar.v0 != dimension) {
                aVar.v0 = dimension;
                aVar.invalidateSelf();
                aVar.L();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.W(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.W(o0b.b(aVar.D0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.X(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.X(aVar.D0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.Y(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.o0 == charSequence) {
            return;
        }
        String str = o54.b;
        o54 o54Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? o54.e : o54.d;
        o54Var.getClass();
        eff0.d dVar = eff0.a;
        aVar.o0 = o54Var.c(charSequence);
        aVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.Z(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.Z(aVar.D0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.Y(gr0.a(aVar.D0, i));
        }
        e();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.a0(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.a0(aVar.D0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.b0(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.b0(aVar.D0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.d0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.d0(o0b.b(aVar.D0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            zkh.a("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            zkh.a("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            zkh.a("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            zkh.a("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            zkh.a("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            zkh.a("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            zkh.a("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            zkh.a("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.r(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            zkh.a("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.a1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.D = z;
        d(this.F);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(b6w b6wVar) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.u0 = b6wVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.u0 = b6w.b(aVar.D0, i);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.f0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.f0(aVar.D0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.g0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.g0(aVar.D0.getResources().getDimension(i));
        }
    }

    @Override // defpackage.ubv
    public void setInternalOnCheckedChangeListener(ubv.a<Chip> aVar) {
        this.y = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            zkh.a("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            zkh.a("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.c1 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            zkh.a("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.v = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.h0(colorStateList);
        }
        this.e.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.h0(o0b.b(aVar.D0, i));
            this.e.getClass();
            f();
        }
    }

    @Override // defpackage.qy80
    public void setShapeAppearanceModel(rx80 rx80Var) {
        this.e.setShapeAppearanceModel(rx80Var);
    }

    public void setShowMotionSpec(b6w b6wVar) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.t0 = b6wVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.t0 = b6w.b(aVar.D0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            zkh.a("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.b1 ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.e;
        if (aVar2 == null || TextUtils.equals(aVar2.d0, charSequence)) {
            return;
        }
        aVar2.d0 = charSequence;
        aVar2.J0.e = true;
        aVar2.invalidateSelf();
        aVar2.L();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            Context context2 = aVar.D0;
            aVar.J0.c(new odf0(context2, i), context2);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.z0 == f) {
            return;
        }
        aVar.z0 = f;
        aVar.invalidateSelf();
        aVar.L();
    }

    public void setTextEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            float dimension = aVar.D0.getResources().getDimension(i);
            if (aVar.z0 != dimension) {
                aVar.z0 = dimension;
                aVar.invalidateSelf();
                aVar.L();
            }
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            hff0 hff0Var = aVar.J0;
            odf0 odf0Var = hff0Var.g;
            if (odf0Var != null) {
                odf0Var.l = fApplyDimension;
                hff0Var.a.setTextSize(fApplyDimension);
                aVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar == null || aVar.y0 == f) {
            return;
        }
        aVar.y0 = f;
        aVar.invalidateSelf();
        aVar.L();
    }

    public void setTextStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            float dimension = aVar.D0.getResources().getDimension(i);
            if (aVar.y0 != dimension) {
                aVar.y0 = dimension;
                aVar.invalidateSelf();
                aVar.L();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w(OdQr.sqjUgCPXgiOH, "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCloseIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.e0(z);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.Q(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.V(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            zkh.a("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            zkh.a("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            zkh.a("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            zkh.a("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(odf0 odf0Var) {
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            aVar.J0.c(odf0Var, aVar.D0);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.a aVar = this.e;
        if (aVar != null) {
            Context context = aVar.D0;
            aVar.J0.c(new odf0(context, i), context);
        }
        h();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.sportybet.android.gp.tz.R.attr.chipStyle);
    }

    public Chip(Context context) {
        this(context, null);
    }
}
