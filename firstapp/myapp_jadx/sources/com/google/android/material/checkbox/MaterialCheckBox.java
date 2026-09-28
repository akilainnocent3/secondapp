package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import defpackage.bbv;
import defpackage.eai0;
import defpackage.ecv;
import defpackage.fyf0;
import defpackage.gof0;
import defpackage.gr0;
import defpackage.m40;
import defpackage.n40;
import defpackage.pk30;
import defpackage.rg0;
import defpackage.sg0;
import defpackage.tcv;
import defpackage.th50;
import defpackage.udf;
import defpackage.uf80;
import defpackage.vbv;
import defpackage.yd0;
import defpackage.zd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int[] N = {R.attr.state_indeterminate};
    public static final int[] O = {R.attr.state_error};
    public static final int[][] P = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int Q = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public Drawable A;
    public Drawable B;
    public boolean C;
    public ColorStateList D;
    public ColorStateList E;
    public PorterDuff.Mode F;
    public int G;
    public int[] H;
    public boolean I;
    public CharSequence J;
    public CompoundButton.OnCheckedChangeListener K;
    public final rg0 L;
    public final a M;
    public final LinkedHashSet<c> e;
    public final LinkedHashSet<b> f;
    public ColorStateList i;
    public boolean v;
    public boolean w;
    public boolean y;
    public CharSequence z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.a = ((Integer) parcel.readValue(SavedState.class.getClassLoader())).intValue();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i = this.a;
            if (i != 1) {
                str = i != 2 ? AnalyticsParam.EVENT_STATUS_UNCHECKED : "indeterminate";
            } else {
                str = AnalyticsParam.EVENT_STATUS_CHECKED;
            }
            return uf80.a(sb, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.a));
        }
    }

    public class a extends zd0 {
        public a() {
        }

        @Override // defpackage.zd0
        public final void a(Drawable drawable) {
            ColorStateList colorStateList = MaterialCheckBox.this.D;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // defpackage.zd0
        public final void b(Drawable drawable) {
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.D;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(materialCheckBox.H, colorStateList.getDefaultColor()));
            }
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(tcv.a(context, attributeSet, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, i);
        this.e = new LinkedHashSet<>();
        this.f = new LinkedHashSet<>();
        Context context2 = getContext();
        rg0 rg0Var = new rg0(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal<TypedValue> threadLocal = th50.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        drawable.setCallback(rg0Var.f);
        new rg0.c(drawable.getConstantState());
        rg0Var.a = drawable;
        this.L = rg0Var;
        this.M = new a();
        Context context3 = getContext();
        this.A = getButtonDrawable();
        this.D = getSuperButtonTintList();
        setSupportButtonTintList(null);
        fyf0 fyf0VarE = gof0.e(context3, attributeSet, pk30.H, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = fyf0VarE.b;
        this.B = fyf0VarE.b(2);
        if (this.A != null && bbv.b(R.attr.isMaterial3Theme, context3, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == Q && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.A = gr0.a(context3, R.drawable.mtrl_checkbox_button);
                this.C = true;
                if (this.B == null) {
                    this.B = gr0.a(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.E = ecv.b(context3, fyf0VarE, 3);
        this.F = eai0.f(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.v = typedArray.getBoolean(10, false);
        this.w = typedArray.getBoolean(6, true);
        this.y = typedArray.getBoolean(9, false);
        this.z = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        fyf0VarE.g();
        b();
    }

    private String getButtonStateDescription() {
        int i = this.G;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.i;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iB = vbv.b(R.attr.colorControlActivated, this);
        int iB2 = vbv.b(R.attr.colorError, this);
        int iB3 = vbv.b(R.attr.colorSurface, this);
        int iB4 = vbv.b(R.attr.colorOnSurface, this);
        ColorStateList colorStateList2 = new ColorStateList(P, new int[]{vbv.g(1.0f, iB3, iB2), vbv.g(1.0f, iB3, iB), vbv.g(0.54f, iB3, iB4), vbv.g(0.38f, iB3, iB4), vbv.g(0.38f, iB3, iB4)});
        this.i = colorStateList2;
        return colorStateList2;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.D;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        sg0 sg0Var;
        this.A = udf.b(this.A, this.D, getButtonTintMode());
        this.B = udf.b(this.B, this.E, this.F);
        if (this.C) {
            rg0 rg0Var = this.L;
            if (rg0Var != null) {
                rg0.b bVar = rg0Var.b;
                a aVar = this.M;
                if (aVar != null) {
                    Drawable drawable = rg0Var.a;
                    if (drawable != null) {
                        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                        yd0 yd0Var = aVar.a;
                        if (yd0Var == null) {
                            yd0Var = new yd0(aVar);
                            aVar.a = yd0Var;
                        }
                        rg0.d.c(animatedVectorDrawable, yd0Var);
                    }
                    ArrayList<zd0> arrayList = rg0Var.e;
                    if (arrayList != null) {
                        arrayList.remove(aVar);
                        if (rg0Var.e.size() == 0 && (sg0Var = rg0Var.d) != null) {
                            bVar.b.removeListener(sg0Var);
                            rg0Var.d = null;
                        }
                    }
                }
                if (aVar != null) {
                    Drawable drawable2 = rg0Var.a;
                    if (drawable2 != null) {
                        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                        yd0 yd0Var2 = aVar.a;
                        if (yd0Var2 == null) {
                            yd0Var2 = new yd0(aVar);
                            aVar.a = yd0Var2;
                        }
                        rg0.d.b(animatedVectorDrawable2, yd0Var2);
                    } else {
                        ArrayList<zd0> arrayList2 = rg0Var.e;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<>();
                            rg0Var.e = arrayList2;
                        }
                        if (!arrayList2.contains(aVar)) {
                            rg0Var.e.add(aVar);
                            sg0 sg0Var2 = rg0Var.d;
                            if (sg0Var2 == null) {
                                sg0Var2 = new sg0(rg0Var);
                                rg0Var.d = sg0Var2;
                            }
                            bVar.b.addListener(sg0Var2);
                        }
                    }
                }
            }
            Drawable drawable3 = this.A;
            if ((drawable3 instanceof AnimatedStateListDrawable) && rg0Var != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, rg0Var, false);
                ((AnimatedStateListDrawable) this.A).addTransition(R.id.indeterminate, R.id.unchecked, rg0Var, false);
            }
        }
        Drawable drawable4 = this.A;
        if (drawable4 != null && (colorStateList2 = this.D) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.B;
        if (drawable5 != null && (colorStateList = this.E) != null) {
            drawable5.setTintList(colorStateList);
        }
        super.setButtonDrawable(udf.a(this.A, this.B, -1, -1));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.A;
    }

    public Drawable getButtonIconDrawable() {
        return this.B;
    }

    public ColorStateList getButtonIconTintList() {
        return this.E;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.F;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.D;
    }

    public int getCheckedState() {
        return this.G;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.G == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.v && this.D == null && this.E == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, N);
        }
        if (this.y) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, O);
        }
        this.H = udf.c(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.w || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.y) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.z));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(gr0.a(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.B = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(gr0.a(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.E == colorStateList) {
            return;
        }
        this.E = colorStateList;
        b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.F == mode) {
            return;
        }
        this.F = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.D == colorStateList) {
            return;
        }
        this.D = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManagerA;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.G != i) {
            this.G = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.J == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.I) {
                return;
            }
            this.I = true;
            LinkedHashSet<b> linkedHashSet = this.f;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.G != 2 && (onCheckedChangeListener = this.K) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerA = n40.a(getContext().getSystemService(m40.a()))) != null) {
                autofillManagerA.notifyValueChanged(this);
            }
            this.I = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.z = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.y == z) {
            return;
        }
        this.y = z;
        refreshDrawableState();
        Iterator<c> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.K = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.J = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.v = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.A = drawable;
        this.C = false;
        b();
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }
}
