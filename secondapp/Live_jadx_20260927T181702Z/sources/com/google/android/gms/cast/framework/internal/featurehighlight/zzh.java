package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.internal.cast.zzeg;
import com.google.android.gms.internal.cast.zzep;
import f2.e0;
import k.h1;
import k.k;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzh extends ViewGroup {

    @Nullable
    @h1
    Animator zza;
    private final int[] zzb;
    private final Rect zzc;
    private final Rect zzd;
    private final OuterHighlightDrawable zze;
    private final InnerZoneDrawable zzf;
    private View zzg;
    private final zzi zzh;
    private final e0 zzi;

    @Nullable
    private e0 zzj;
    private zzg zzk;
    private boolean zzl;
    private HelpTextView zzm;

    public zzh(Context context) {
        super(context);
        this.zzb = new int[2];
        this.zzc = new Rect();
        this.zzd = new Rect();
        setId(R.id.cast_featurehighlight_view);
        setWillNotDraw(false);
        InnerZoneDrawable innerZoneDrawable = new InnerZoneDrawable(context);
        this.zzf = innerZoneDrawable;
        innerZoneDrawable.setCallback(this);
        OuterHighlightDrawable outerHighlightDrawable = new OuterHighlightDrawable(context);
        this.zze = outerHighlightDrawable;
        outerHighlightDrawable.setCallback(this);
        this.zzh = new zzi(this);
        e0 e0Var = new e0(context, new zza(this));
        this.zzi = e0Var;
        e0Var.c(false);
        setVisibility(8);
    }

    public static /* synthetic */ Animator zza(zzh zzhVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        InnerZoneDrawable innerZoneDrawable = zzhVar.zzf;
        ObjectAnimator duration = ObjectAnimator.ofFloat(innerZoneDrawable, "scale", 1.0f, 1.1f).setDuration(500L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(innerZoneDrawable, "scale", 1.1f, 1.0f).setDuration(500L);
        ObjectAnimator duration3 = ObjectAnimator.ofPropertyValuesHolder(innerZoneDrawable, PropertyValuesHolder.ofFloat("pulseScale", 1.1f, 2.0f), PropertyValuesHolder.ofFloat("pulseAlpha", 1.0f, 0.0f)).setDuration(500L);
        animatorSet.play(duration);
        animatorSet.play(duration2).with(duration3).after(duration);
        animatorSet.setInterpolator(zzep.zzb());
        animatorSet.setStartDelay(500L);
        zzeg.zzd(animatorSet, -1, null);
        return animatorSet;
    }

    private final void zzo(Animator animator) {
        Animator animator2 = this.zza;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.zza = animator;
        animator.start();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        this.zze.draw(canvas);
        this.zzf.draw(canvas);
        View view = this.zzg;
        if (view == null) {
            throw new IllegalStateException("Neither target view nor drawable was set");
        }
        if (view.getParent() != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.zzg.getWidth(), this.zzg.getHeight(), Bitmap.Config.ARGB_8888);
            this.zzg.draw(new Canvas(bitmapCreateBitmap));
            int iZzc = this.zze.zzc();
            int iRed = Color.red(iZzc);
            int iGreen = Color.green(iZzc);
            int iBlue = Color.blue(iZzc);
            for (int i10 = 0; i10 < bitmapCreateBitmap.getHeight(); i10++) {
                for (int i11 = 0; i11 < bitmapCreateBitmap.getWidth(); i11++) {
                    int pixel = bitmapCreateBitmap.getPixel(i11, i10);
                    if (Color.alpha(pixel) != 0) {
                        bitmapCreateBitmap.setPixel(i11, i10, Color.argb(Color.alpha(pixel), iRed, iGreen, iBlue));
                    }
                }
            }
            Rect rect = this.zzc;
            canvas.drawBitmap(bitmapCreateBitmap, rect.left, rect.top, (Paint) null);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.zzg;
        if (view == null) {
            throw new IllegalStateException("Target view must be set before layout");
        }
        if (view.getParent() != null) {
            int[] iArr = this.zzb;
            View view2 = this.zzg;
            getLocationInWindow(iArr);
            int i14 = iArr[0];
            int i15 = iArr[1];
            view2.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i14;
            iArr[1] = iArr[1] - i15;
        }
        Rect rect = this.zzc;
        int[] iArr2 = this.zzb;
        int i16 = iArr2[0];
        rect.set(i16, iArr2[1], this.zzg.getWidth() + i16, this.zzb[1] + this.zzg.getHeight());
        this.zzd.set(i10, i11, i12, i13);
        this.zze.setBounds(this.zzd);
        this.zzf.setBounds(this.zzd);
        this.zzh.zza(this.zzc, this.zzd);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.resolveSize(View.MeasureSpec.getSize(i10), i10), View.resolveSize(View.MeasureSpec.getSize(i11), i11));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.zzl = this.zzc.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            actionMasked = 0;
        }
        if (this.zzl) {
            e0 e0Var = this.zzj;
            if (e0Var != null) {
                e0Var.b(motionEvent);
                if (actionMasked == 1) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.setAction(3);
                }
            }
            if (this.zzg.getParent() != null) {
                this.zzg.onTouchEvent(motionEvent);
            }
        } else {
            this.zzi.b(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.zze || drawable == this.zzf || drawable == null;
    }

    public final View zzb() {
        return this.zzm.asView();
    }

    public final InnerZoneDrawable zzd() {
        return this.zzf;
    }

    public final OuterHighlightDrawable zzf() {
        return this.zze;
    }

    public final void zzg(@Nullable Runnable runnable) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zzm.asView(), "alpha", 0.0f).setDuration(200L);
        duration.setInterpolator(zzep.zza());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.zze, PropertyValuesHolder.ofFloat("scale", 1.125f), PropertyValuesHolder.ofInt("alpha", 0));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(zzep.zza());
        Animator duration2 = objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        Animator animatorZza = this.zzf.zza();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, animatorZza);
        animatorSet.addListener(new zze(this, runnable));
        zzo(animatorSet);
    }

    public final void zzh(@Nullable Runnable runnable) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zzm.asView(), "alpha", 0.0f).setDuration(200L);
        duration.setInterpolator(zzep.zza());
        float fExactCenterX = this.zzc.exactCenterX() - this.zze.zza();
        float fExactCenterY = this.zzc.exactCenterY() - this.zze.zzb();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.zze, PropertyValuesHolder.ofFloat("scale", 0.0f), PropertyValuesHolder.ofFloat("translationX", 0.0f, fExactCenterX), PropertyValuesHolder.ofFloat("translationY", 0.0f, fExactCenterY), PropertyValuesHolder.ofInt("alpha", 0));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(zzep.zza());
        Animator duration2 = objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        Animator animatorZza = this.zzf.zza();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, animatorZza);
        animatorSet.addListener(new zzf(this, runnable));
        zzo(animatorSet);
    }

    public final void zzi(View view, @Nullable View view2, boolean z10, zzg zzgVar) {
        this.zzg = view;
        this.zzk = zzgVar;
        e0 e0Var = new e0(getContext(), new zzb(this, view, true, zzgVar));
        this.zzj = e0Var;
        e0Var.c(false);
        setVisibility(4);
    }

    public final void zzj(@k int i10) {
        this.zze.zze(i10);
    }

    public final void zzk() {
        if (this.zzg == null) {
            throw new IllegalStateException("Target view must be set before animation");
        }
        setVisibility(0);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zzm.asView(), "alpha", 0.0f, 1.0f).setDuration(350L);
        duration.setInterpolator(zzep.zzc());
        float fExactCenterX = this.zzc.exactCenterX() - this.zze.zza();
        float fExactCenterY = this.zzc.exactCenterY() - this.zze.zzb();
        OuterHighlightDrawable outerHighlightDrawable = this.zze;
        InnerZoneDrawable innerZoneDrawable = this.zzf;
        Animator animatorZzd = outerHighlightDrawable.zzd(fExactCenterX, fExactCenterY);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(innerZoneDrawable, PropertyValuesHolder.ofFloat("scale", 0.0f, 1.0f), PropertyValuesHolder.ofInt("alpha", 0, 255));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(zzep.zzc());
        Animator duration2 = objectAnimatorOfPropertyValuesHolder.setDuration(350L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, animatorZzd, duration2);
        animatorSet.addListener(new zzd(this));
        zzo(animatorSet);
    }

    public final void zzl(@Nullable Runnable runnable) {
        addOnLayoutChangeListener(new zzc(this, null));
    }

    public final void zzn(HelpTextView helpTextView) {
        helpTextView.getClass();
        this.zzm = helpTextView;
        addView(helpTextView.asView(), 0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
