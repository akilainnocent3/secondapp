package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.cyf0;
import defpackage.dr0;
import defpackage.dyf0;
import defpackage.gq0;
import defpackage.nof0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    public final gq0 a;
    public final dr0 b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        cyf0.a(context);
        this.c = false;
        nof0.a(this, getContext());
        gq0 gq0Var = new gq0(this);
        this.a = gq0Var;
        gq0Var.d(attributeSet, i);
        dr0 dr0Var = new dr0(this);
        this.b = dr0Var;
        dr0Var.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.a();
        }
        dr0 dr0Var = this.b;
        if (dr0Var != null) {
            dr0Var.a();
        }
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

    public ColorStateList getSupportImageTintList() {
        dyf0 dyf0Var;
        dr0 dr0Var = this.b;
        if (dr0Var == null || (dyf0Var = dr0Var.b) == null) {
            return null;
        }
        return dyf0Var.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        dyf0 dyf0Var;
        dr0 dr0Var = this.b;
        if (dr0Var == null || (dyf0Var = dr0Var.b) == null) {
            return null;
        }
        return dyf0Var.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.b.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
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

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        dr0 dr0Var = this.b;
        if (dr0Var != null) {
            dr0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        dr0 dr0Var = this.b;
        if (dr0Var != null && drawable != null && !this.c) {
            dr0Var.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dr0Var != null) {
            dr0Var.a();
            if (this.c) {
                return;
            }
            ImageView imageView = dr0Var.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dr0Var.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        dr0 dr0Var = this.b;
        if (dr0Var != null) {
            dr0Var.c(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        dr0 dr0Var = this.b;
        if (dr0Var != null) {
            dr0Var.a();
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

    public void setSupportImageTintList(ColorStateList colorStateList) {
        dr0 dr0Var = this.b;
        if (dr0Var != null) {
            dyf0 dyf0Var = dr0Var.b;
            if (dyf0Var == null) {
                dyf0Var = new dyf0();
                dr0Var.b = dyf0Var;
            }
            dyf0Var.a = colorStateList;
            dyf0Var.d = true;
            dr0Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        dr0 dr0Var = this.b;
        if (dr0Var != null) {
            dyf0 dyf0Var = dr0Var.b;
            if (dyf0Var == null) {
                dyf0Var = new dyf0();
                dr0Var.b = dyf0Var;
            }
            dyf0Var.b = mode;
            dyf0Var.c = true;
            dr0Var.a();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }
}
