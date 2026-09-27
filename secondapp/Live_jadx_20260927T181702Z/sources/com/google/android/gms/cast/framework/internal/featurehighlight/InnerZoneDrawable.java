package com.google.android.gms.cast.framework.internal.featurehighlight;

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
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.internal.cast.zzep;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
class InnerZoneDrawable extends Drawable {
    private final Paint zza;
    private final Paint zzb;
    private final Rect zzc;
    private final int zzd;
    private final int zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private float zzk;

    public InnerZoneDrawable(Context context) {
        Paint paint = new Paint();
        this.zza = paint;
        Paint paint2 = new Paint();
        this.zzb = paint2;
        this.zzc = new Rect();
        this.zzg = 1.0f;
        Resources resources = context.getResources();
        this.zzd = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_inner_radius);
        this.zze = resources.getInteger(R.integer.cast_libraries_material_featurehighlight_pulse_base_alpha);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setColor(-1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10 = this.zzk;
        if (f10 > 0.0f) {
            float f11 = this.zzf * this.zzj;
            this.zzb.setAlpha((int) (this.zze * f10));
            canvas.drawCircle(this.zzh, this.zzi, f11, this.zzb);
        }
        canvas.drawCircle(this.zzh, this.zzi, this.zzf * this.zzg, this.zza);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.zza.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.zza.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setPulseAlpha(float f10) {
        this.zzk = f10;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f10) {
        this.zzj = f10;
        invalidateSelf();
    }

    @Keep
    public void setScale(float f10) {
        this.zzg = f10;
        invalidateSelf();
    }

    public final Animator zza() {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", 0.0f), PropertyValuesHolder.ofInt("alpha", 0), PropertyValuesHolder.ofFloat("pulseScale", 0.0f), PropertyValuesHolder.ofFloat("pulseAlpha", 0.0f));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(zzep.zza());
        return objectAnimatorOfPropertyValuesHolder.setDuration(200L);
    }

    public final void zzb(Rect rect) {
        this.zzc.set(rect);
        this.zzh = this.zzc.exactCenterX();
        this.zzi = this.zzc.exactCenterY();
        this.zzf = Math.max(this.zzd, Math.max(this.zzc.width() / 2.0f, this.zzc.height() / 2.0f));
        invalidateSelf();
    }
}
