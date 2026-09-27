package androidx.appcompat.widget;

import android.annotation.SuppressLint;
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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements f2.t1, androidx.core.widget.b, androidx.core.widget.v, g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f6766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f6767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public y f6768d;

    public AppCompatButton(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private y getEmojiTextViewHelper() {
        if (this.f6768d == null) {
            this.f6768d = new y(this);
        }
        return this.f6768d;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        i iVar = this.f6766b;
        if (iVar != null) {
            iVar.b();
        }
        q0 q0Var = this.f6767c;
        if (q0Var != null) {
            q0Var.b();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (z2.f7502d) {
            return super.getAutoSizeMaxTextSize();
        }
        q0 q0Var = this.f6767c;
        if (q0Var != null) {
            return q0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (z2.f7502d) {
            return super.getAutoSizeMinTextSize();
        }
        q0 q0Var = this.f6767c;
        if (q0Var != null) {
            return q0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (z2.f7502d) {
            return super.getAutoSizeStepGranularity();
        }
        q0 q0Var = this.f6767c;
        if (q0Var != null) {
            return q0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (z2.f7502d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        q0 q0Var = this.f6767c;
        return q0Var != null ? q0Var.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @SuppressLint({"WrongConstant"})
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (z2.f7502d) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        q0 q0Var = this.f6767c;
        if (q0Var != null) {
            return q0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.q.F(super.getCustomSelectionActionModeCallback());
    }

    @Override // f2.t1
    @Nullable
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        i iVar = this.f6766b;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    @Override // f2.t1
    @Nullable
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        i iVar = this.f6766b;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @Nullable
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6767c.j();
    }

    @Override // androidx.core.widget.v
    @Nullable
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6767c.k();
    }

    @Override // androidx.appcompat.widget.g1
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        q0 q0Var = this.f6767c;
        if (q0Var != null) {
            q0Var.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        q0 q0Var = this.f6767c;
        if (q0Var == null || z2.f7502d || !q0Var.l()) {
            return;
        }
        this.f6767c.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (z2.f7502d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        q0 q0Var = this.f6767c;
        if (q0Var != null) {
            q0Var.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i10) throws IllegalArgumentException {
        if (z2.f7502d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        q0 q0Var = this.f6767c;
        if (q0Var != null) {
            q0Var.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (z2.f7502d) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        q0 q0Var = this.f6767c;
        if (q0Var != null) {
            q0Var.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        i iVar = this.f6766b;
        if (iVar != null) {
            iVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@k.u int i10) {
        super.setBackgroundResource(i10);
        i iVar = this.f6766b;
        if (iVar != null) {
            iVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.q.G(this, callback));
    }

    @Override // androidx.appcompat.widget.g1
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        q0 q0Var = this.f6767c;
        if (q0Var != null) {
            q0Var.s(z10);
        }
    }

    @Override // f2.t1
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        i iVar = this.f6766b;
        if (iVar != null) {
            iVar.i(colorStateList);
        }
    }

    @Override // f2.t1
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        i iVar = this.f6766b;
        if (iVar != null) {
            iVar.j(mode);
        }
    }

    @Override // androidx.core.widget.v
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f6767c.w(colorStateList);
        this.f6767c.b();
    }

    @Override // androidx.core.widget.v
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f6767c.x(mode);
        this.f6767c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        q0 q0Var = this.f6767c;
        if (q0Var != null) {
            q0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (z2.f7502d) {
            super.setTextSize(i10, f10);
            return;
        }
        q0 q0Var = this.f6767c;
        if (q0Var != null) {
            q0Var.A(i10, f10);
        }
    }

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, m.a.b.f105473o0);
    }

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(i2.b(context), attributeSet, i10);
        g2.a(this, getContext());
        i iVar = new i(this);
        this.f6766b = iVar;
        iVar.e(attributeSet, i10);
        q0 q0Var = new q0(this);
        this.f6767c = q0Var;
        q0Var.m(attributeSet, i10);
        q0Var.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
