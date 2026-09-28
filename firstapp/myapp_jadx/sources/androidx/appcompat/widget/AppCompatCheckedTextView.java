package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.sportybet.android.gp.tz.R;
import defpackage.br0;
import defpackage.cr0;
import defpackage.cyf0;
import defpackage.dl30;
import defpackage.fyf0;
import defpackage.gq0;
import defpackage.gr0;
import defpackage.iq0;
import defpackage.jr0;
import defpackage.nof0;
import defpackage.qmf0;
import defpackage.r6i0;
import defpackage.sdf;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {
    public final iq0 a;
    public final gq0 b;
    public final jr0 c;
    public br0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, i);
        cyf0.a(context);
        nof0.a(this, getContext());
        jr0 jr0Var = new jr0(this);
        this.c = jr0Var;
        jr0Var.f(attributeSet, i);
        jr0Var.b();
        gq0 gq0Var = new gq0(this);
        this.b = gq0Var;
        gq0Var.d(attributeSet, i);
        this.a = new iq0(this);
        Context context2 = getContext();
        int[] iArr = dl30.m;
        fyf0 fyf0VarF = fyf0.f(context2, attributeSet, iArr, i);
        TypedArray typedArray = fyf0VarF.b;
        r6i0.o(this, getContext(), iArr, attributeSet, fyf0VarF.b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(gr0.a(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(gr0.a(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(gr0.a(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(fyf0VarF.a(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(sdf.c(typedArray.getInt(3, -1), null));
            }
            fyf0VarF.g();
            getEmojiTextViewHelper().b(attributeSet, i);
        } catch (Throwable th) {
            fyf0VarF.g();
            throw th;
        }
    }

    private br0 getEmojiTextViewHelper() {
        br0 br0Var = this.d;
        if (br0Var != null) {
            return br0Var;
        }
        br0 br0Var2 = new br0(this);
        this.d = br0Var2;
        return br0Var2;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        jr0 jr0Var = this.c;
        if (jr0Var != null) {
            jr0Var.b();
        }
        gq0 gq0Var = this.b;
        if (gq0Var != null) {
            gq0Var.a();
        }
        iq0 iq0Var = this.a;
        if (iq0Var != null) {
            iq0Var.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return qmf0.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        gq0 gq0Var = this.b;
        if (gq0Var != null) {
            return gq0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        gq0 gq0Var = this.b;
        if (gq0Var != null) {
            return gq0Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        iq0 iq0Var = this.a;
        if (iq0Var != null) {
            return iq0Var.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        iq0 iq0Var = this.a;
        if (iq0Var != null) {
            return iq0Var.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        cr0.d(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        gq0 gq0Var = this.b;
        if (gq0Var != null) {
            gq0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        gq0 gq0Var = this.b;
        if (gq0Var != null) {
            gq0Var.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        iq0 iq0Var = this.a;
        if (iq0Var != null) {
            if (iq0Var.f) {
                iq0Var.f = false;
            } else {
                iq0Var.f = true;
                iq0Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jr0 jr0Var = this.c;
        if (jr0Var != null) {
            jr0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jr0 jr0Var = this.c;
        if (jr0Var != null) {
            jr0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(qmf0.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        gq0 gq0Var = this.b;
        if (gq0Var != null) {
            gq0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        gq0 gq0Var = this.b;
        if (gq0Var != null) {
            gq0Var.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        iq0 iq0Var = this.a;
        if (iq0Var != null) {
            iq0Var.b = colorStateList;
            iq0Var.d = true;
            iq0Var.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        iq0 iq0Var = this.a;
        if (iq0Var != null) {
            iq0Var.c = mode;
            iq0Var.e = true;
            iq0Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        jr0 jr0Var = this.c;
        jr0Var.k(colorStateList);
        jr0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        jr0 jr0Var = this.c;
        jr0Var.l(mode);
        jr0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jr0 jr0Var = this.c;
        if (jr0Var != null) {
            jr0Var.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(gr0.a(getContext(), i));
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }
}
