package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.zzep;
import com.google.android.gms.internal.cast.zzeq;
import k.k;
import k1.b0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
class OuterHighlightDrawable extends Drawable {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final Rect zzd = new Rect();
    private final Rect zze = new Rect();
    private final Paint zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    public OuterHighlightDrawable(Context context) {
        int color;
        Paint paint = new Paint();
        this.zzf = paint;
        this.zzh = 1.0f;
        this.zzk = 0.0f;
        this.zzl = 0.0f;
        this.zzm = 244;
        if (PlatformVersion.isAtLeastLollipop()) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
            color = b0.D(typedValue.data, 244);
        } else {
            color = context.getResources().getColor(com.google.android.gms.cast.framework.R.color.cast_libraries_material_featurehighlight_outer_highlight_default_color);
        }
        paint.setColor(color);
        this.zzm = paint.getAlpha();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Resources resources = context.getResources();
        this.zza = resources.getDimensionPixelSize(com.google.android.gms.cast.framework.R.dimen.cast_libraries_material_featurehighlight_center_threshold);
        this.zzb = resources.getDimensionPixelSize(com.google.android.gms.cast.framework.R.dimen.cast_libraries_material_featurehighlight_center_horizontal_offset);
        this.zzc = resources.getDimensionPixelSize(com.google.android.gms.cast.framework.R.dimen.cast_libraries_material_featurehighlight_outer_padding);
    }

    private static final float zzh(float f10, float f11, Rect rect) {
        float f12 = rect.left;
        float f13 = rect.top;
        float f14 = rect.right;
        float f15 = rect.bottom;
        float fZza = zzeq.zza(f10, f11, f12, f13);
        float fZza2 = zzeq.zza(f10, f11, f14, f13);
        float fZza3 = zzeq.zza(f10, f11, f14, f15);
        float fZza4 = zzeq.zza(f10, f11, f12, f15);
        if (fZza <= fZza2 || fZza <= fZza3 || fZza <= fZza4) {
            if (fZza2 <= fZza3 || fZza2 <= fZza4) {
                fZza = fZza3 <= fZza4 ? fZza4 : fZza3;
            } else {
                fZza = fZza2;
            }
        }
        return (float) Math.ceil(fZza);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawCircle(this.zzi + this.zzk, this.zzj + this.zzl, this.zzg * this.zzh, this.zzf);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.zzf.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.zzf.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.zzf.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setScale(float f10) {
        this.zzh = f10;
        invalidateSelf();
    }

    @Keep
    public void setTranslationX(float f10) {
        this.zzk = f10;
        invalidateSelf();
    }

    @Keep
    public void setTranslationY(float f10) {
        this.zzl = f10;
        invalidateSelf();
    }

    public final float zza() {
        return this.zzi;
    }

    public final float zzb() {
        return this.zzj;
    }

    @k
    public final int zzc() {
        return this.zzf.getColor();
    }

    public final Animator zzd(float f10, float f11) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationX", f10, 0.0f), PropertyValuesHolder.ofFloat("translationY", f11, 0.0f), PropertyValuesHolder.ofInt("alpha", 0, this.zzm));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(zzep.zzc());
        return objectAnimatorOfPropertyValuesHolder.setDuration(350L);
    }

    public final void zze(@k int i10) {
        this.zzf.setColor(i10);
        this.zzm = this.zzf.getAlpha();
        invalidateSelf();
    }

    public final void zzf(Rect rect, Rect rect2) {
        this.zzd.set(rect);
        this.zze.set(rect2);
        float fExactCenterX = rect.exactCenterX();
        float fExactCenterY = rect.exactCenterY();
        Rect bounds = getBounds();
        if (Math.min(fExactCenterY - bounds.top, bounds.bottom - fExactCenterY) < this.zza) {
            this.zzi = fExactCenterX;
            this.zzj = fExactCenterY;
        } else {
            this.zzi = fExactCenterX <= bounds.exactCenterX() ? rect2.exactCenterX() + this.zzb : rect2.exactCenterX() - this.zzb;
            fExactCenterY = rect2.exactCenterY();
            this.zzj = fExactCenterY;
        }
        this.zzg = this.zzc + Math.max(zzh(this.zzi, fExactCenterY, rect), zzh(this.zzi, this.zzj, rect2));
        invalidateSelf();
    }

    public final boolean zzg(float f10, float f11) {
        return zzeq.zza(f10, f11, this.zzi, this.zzj) < this.zzg;
    }
}
