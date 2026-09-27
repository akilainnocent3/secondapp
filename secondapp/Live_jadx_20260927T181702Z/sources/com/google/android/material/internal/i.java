package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public class i extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f51077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f51078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f51079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f51080d;

    public i(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        this.f51077a = drawable.getConstantState().newDrawable().mutate();
        Drawable drawableMutate = drawable2.getConstantState().newDrawable().mutate();
        this.f51078b = drawableMutate;
        drawableMutate.setAlpha(0);
        this.f51079c = new float[2];
    }

    public void a(@k.w(from = 0.0d, to = 1.0d) float f10) {
        if (this.f51080d != f10) {
            this.f51080d = f10;
            k.a(f10, this.f51079c);
            this.f51077a.setAlpha((int) (this.f51079c[0] * 255.0f));
            this.f51078b.setAlpha((int) (this.f51079c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f51077a.draw(canvas);
        this.f51078b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f51077a.getIntrinsicHeight(), this.f51078b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f51077a.getIntrinsicWidth(), this.f51078b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f51077a.getMinimumHeight(), this.f51078b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f51077a.getMinimumWidth(), this.f51078b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f51077a.isStateful() || this.f51078b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f51080d <= 0.5f) {
            this.f51077a.setAlpha(i10);
            this.f51078b.setAlpha(0);
        } else {
            this.f51077a.setAlpha(0);
            this.f51078b.setAlpha(i10);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f51077a.setBounds(i10, i11, i12, i13);
        this.f51078b.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f51077a.setColorFilter(colorFilter);
        this.f51078b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f51077a.setState(iArr) || this.f51078b.setState(iArr);
    }
}
