package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.sportybet.android.gp.tz.R;
import defpackage.br0;
import defpackage.cyf0;
import defpackage.gq0;
import defpackage.gr0;
import defpackage.gyf0;
import defpackage.jq0;
import defpackage.jr0;
import defpackage.nof0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements gyf0 {
    public final jq0 a;
    public final gq0 b;
    public final jr0 c;
    public br0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        cyf0.a(context);
        nof0.a(this, getContext());
        jq0 jq0Var = new jq0(this);
        this.a = jq0Var;
        jq0Var.b(attributeSet, i);
        gq0 gq0Var = new gq0(this);
        this.b = gq0Var;
        gq0Var.d(attributeSet, i);
        jr0 jr0Var = new jr0(this);
        this.c = jr0Var;
        jr0Var.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
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

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        gq0 gq0Var = this.b;
        if (gq0Var != null) {
            gq0Var.a();
        }
        jr0 jr0Var = this.c;
        if (jr0Var != null) {
            jr0Var.b();
        }
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

    @Override // defpackage.gyf0
    public ColorStateList getSupportButtonTintList() {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            return jq0Var.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            return jq0Var.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            if (jq0Var.f) {
                jq0Var.f = false;
            } else {
                jq0Var.f = true;
                jq0Var.a();
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

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
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

    @Override // defpackage.gyf0
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.b = colorStateList;
            jq0Var.d = true;
            jq0Var.a();
        }
    }

    @Override // defpackage.gyf0
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.c = mode;
            jq0Var.e = true;
            jq0Var.a();
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(gr0.a(getContext(), i));
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }
}
