package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.sportybet.android.gp.tz.R;
import defpackage.br0;
import defpackage.cyf0;
import defpackage.eg1;
import defpackage.gai0;
import defpackage.gq0;
import defpackage.jr0;
import defpackage.lr0;
import defpackage.nof0;
import defpackage.qmf0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements eg1 {
    public final gq0 a;
    public final jr0 b;
    public br0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        cyf0.a(context);
        nof0.a(this, getContext());
        gq0 gq0Var = new gq0(this);
        this.a = gq0Var;
        gq0Var.d(attributeSet, i);
        jr0 jr0Var = new jr0(this);
        this.b = jr0Var;
        jr0Var.f(attributeSet, i);
        jr0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private br0 getEmojiTextViewHelper() {
        br0 br0Var = this.c;
        if (br0Var != null) {
            return br0Var;
        }
        br0 br0Var2 = new br0(this);
        this.c = br0Var2;
        return br0Var2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.a();
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (gai0.c) {
            return super.getAutoSizeMaxTextSize();
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            return Math.round(jr0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (gai0.c) {
            return super.getAutoSizeMinTextSize();
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            return Math.round(jr0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (gai0.c) {
            return super.getAutoSizeStepGranularity();
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            return Math.round(jr0Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (gai0.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        jr0 jr0Var = this.b;
        return jr0Var != null ? jr0Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (gai0.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            return jr0Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return qmf0.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            return gq0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            return gq0Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        jr0 jr0Var = this.b;
        if (jr0Var == null || gai0.c) {
            return;
        }
        jr0Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            lr0 lr0Var = jr0Var.i;
            if (gai0.c || !lr0Var.f()) {
                return;
            }
            lr0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView, defpackage.eg1
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (gai0.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (gai0.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (gai0.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(qmf0.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        jr0 jr0Var = this.b;
        jr0Var.k(colorStateList);
        jr0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        jr0 jr0Var = this.b;
        jr0Var.l(mode);
        jr0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = gai0.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            lr0 lr0Var = jr0Var.i;
            if (z || lr0Var.f()) {
                return;
            }
            lr0Var.g(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(Context context) {
        this(context, null);
    }
}
