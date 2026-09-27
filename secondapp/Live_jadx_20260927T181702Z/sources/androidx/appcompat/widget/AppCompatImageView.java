package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements f2.t1, androidx.core.widget.w {
    private final i mBackgroundTintHelper;
    private boolean mHasLevel;
    private final c0 mImageHelper;

    public AppCompatImageView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        i iVar = this.mBackgroundTintHelper;
        if (iVar != null) {
            iVar.b();
        }
        c0 c0Var = this.mImageHelper;
        if (c0Var != null) {
            c0Var.c();
        }
    }

    @Override // f2.t1
    @Nullable
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        i iVar = this.mBackgroundTintHelper;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    @Override // f2.t1
    @Nullable
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        i iVar = this.mBackgroundTintHelper;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @Nullable
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        c0 c0Var = this.mImageHelper;
        if (c0Var != null) {
            return c0Var.d();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @Nullable
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        c0 c0Var = this.mImageHelper;
        if (c0Var != null) {
            return c0Var.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        i iVar = this.mBackgroundTintHelper;
        if (iVar != null) {
            iVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@k.u int i10) {
        super.setBackgroundResource(i10);
        i iVar = this.mBackgroundTintHelper;
        if (iVar != null) {
            iVar.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        c0 c0Var = this.mImageHelper;
        if (c0Var != null) {
            c0Var.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        c0 c0Var = this.mImageHelper;
        if (c0Var != null && drawable != null && !this.mHasLevel) {
            c0Var.h(drawable);
        }
        super.setImageDrawable(drawable);
        c0 c0Var2 = this.mImageHelper;
        if (c0Var2 != null) {
            c0Var2.c();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@k.u int i10) {
        c0 c0Var = this.mImageHelper;
        if (c0Var != null) {
            c0Var.i(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        c0 c0Var = this.mImageHelper;
        if (c0Var != null) {
            c0Var.c();
        }
    }

    @Override // f2.t1
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        i iVar = this.mBackgroundTintHelper;
        if (iVar != null) {
            iVar.i(colorStateList);
        }
    }

    @Override // f2.t1
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        i iVar = this.mBackgroundTintHelper;
        if (iVar != null) {
            iVar.j(mode);
        }
    }

    @Override // androidx.core.widget.w
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        c0 c0Var = this.mImageHelper;
        if (c0Var != null) {
            c0Var.k(colorStateList);
        }
    }

    @Override // androidx.core.widget.w
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        c0 c0Var = this.mImageHelper;
        if (c0Var != null) {
            c0Var.l(mode);
        }
    }

    public AppCompatImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(i2.b(context), attributeSet, i10);
        this.mHasLevel = false;
        g2.a(this, getContext());
        i iVar = new i(this);
        this.mBackgroundTintHelper = iVar;
        iVar.e(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.mImageHelper = c0Var;
        c0Var.g(attributeSet, i10);
    }
}
