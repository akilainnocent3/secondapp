package com.sigma.niceswitch;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.sigma.niceswitch.NiceSwitchRound;
import k.k;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public class NiceSwitchRound extends View {
    private AnimatorSet animatorSet;
    private boolean checked;

    @k
    private int currentColor;
    private float defHeight;
    private float defWidth;
    private Paint iconClipPaint;
    private float iconClipRadius;
    private RectF iconClipRect;
    private float iconCollapsedWidth;

    @k
    private int iconColor;
    private float iconHeight;
    private Paint iconPaint;
    private float iconProgress;
    private float iconRadius;
    private RectF iconRect;

    @k
    private int offColor;
    private b onCheckedChangedListener;
    private float onClickRadiusOffset;

    @k
    private int onColor;
    private float switchElevation;
    private Paint switcherPaint;
    private float switcherRadius;
    private RectF switcherRect;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @TargetApi(21)
    public class c extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f72126b;

        public c(int i10, int i11) {
            this.f72125a = i10;
            this.f72126b = i11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, this.f72125a, this.f72126b, NiceSwitchRound.this.switcherRadius);
        }
    }

    public NiceSwitchRound(Context context) {
        super(context);
        this.iconRadius = 0.0f;
        this.iconClipRadius = 0.0f;
        this.iconCollapsedWidth = 0.0f;
        this.defHeight = 0.0f;
        this.defWidth = 0.0f;
        this.checked = true;
        this.onColor = 0;
        this.offColor = 0;
        this.iconColor = 0;
        this.switcherRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.switcherPaint = new Paint(1);
        this.iconRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.iconClipRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.iconPaint = new Paint(1);
        this.iconClipPaint = new Paint(1);
        this.animatorSet = new AnimatorSet();
        this.onClickRadiusOffset = 0.0f;
        this.currentColor = 0;
        this.switcherRadius = 0.0f;
        this.switchElevation = 0.0f;
        this.iconHeight = 0.0f;
        this.iconProgress = 0.0f;
        init(context, null, 0);
    }

    public static /* synthetic */ void a(NiceSwitchRound niceSwitchRound, ValueAnimator valueAnimator) {
        niceSwitchRound.getClass();
        niceSwitchRound.setCurrentColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateSwitch() {
        float f10;
        float f11;
        float f12;
        this.animatorSet.cancel();
        this.animatorSet = new AnimatorSet();
        setOnClickRadiusOffset(2.0f);
        if (this.checked) {
            f10 = 0.2f;
            f11 = 14.5f;
            f12 = 1.0f;
        } else {
            f10 = 0.15f;
            f11 = 12.0f;
            f12 = 0.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.iconProgress, f12);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tn.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NiceSwitchRound.b(this.f137056b, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(new BounceInterpolator(f10, f11));
        valueAnimatorOfFloat.setDuration(800L);
        int i10 = !this.checked ? this.onColor : this.offColor;
        this.iconClipPaint.setColor(i10);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tn.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NiceSwitchRound.a(this.f137057b, valueAnimator2);
            }
        });
        valueAnimator.setIntValues(this.currentColor, i10);
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.setDuration(300L);
        this.animatorSet.addListener(new a());
        this.animatorSet.playTogether(valueAnimatorOfFloat, valueAnimator);
        this.animatorSet.start();
    }

    public static /* synthetic */ void b(NiceSwitchRound niceSwitchRound, ValueAnimator valueAnimator) {
        niceSwitchRound.getClass();
        niceSwitchRound.setIconProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void forceCheck() {
        this.currentColor = this.offColor;
        this.iconProgress = 1.0f;
    }

    private void init(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.sigma.niceswitch.a.m.f72976s7, i10, com.sigma.niceswitch.a.l.H2);
        this.switchElevation = typedArrayObtainStyledAttributes.getDimension(com.sigma.niceswitch.a.m.f72996u7, 0.0f);
        this.onColor = typedArrayObtainStyledAttributes.getColor(com.sigma.niceswitch.a.m.f73036y7, 0);
        this.offColor = typedArrayObtainStyledAttributes.getColor(com.sigma.niceswitch.a.m.f73026x7, 0);
        this.iconColor = typedArrayObtainStyledAttributes.getColor(com.sigma.niceswitch.a.m.f73016w7, 0);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(com.sigma.niceswitch.a.m.f72986t7, true);
        this.checked = z10;
        if (!z10) {
            setIconProgress(1.0f);
        }
        if (this.checked) {
            setCurrentColor(this.onColor);
        } else {
            setCurrentColor(this.offColor);
        }
        this.iconPaint.setColor(this.iconColor);
        this.defHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.sigma.niceswitch.a.m.f73006v7, 0);
        this.defWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.sigma.niceswitch.a.m.f73046z7, 0);
        typedArrayObtainStyledAttributes.recycle();
        setOnClickListener(new View.OnClickListener() { // from class: tn.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137055b.animateSwitch();
            }
        });
    }

    private float lerp(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public b getOnCheckedChangedListener() {
        return this.onCheckedChangedListener;
    }

    public float getOnClickRadiusOffset() {
        return this.onClickRadiusOffset;
    }

    @Override // android.view.View
    public ViewOutlineProvider getOutlineProvider() {
        return new c(getWidth(), getHeight());
    }

    public boolean isChecked() {
        return this.checked;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.switcherRect;
        float f10 = this.switcherRadius;
        canvas.drawRoundRect(rectF, f10, f10, this.switcherPaint);
        RectF rectF2 = this.iconRect;
        float f11 = this.switcherRadius;
        canvas.drawRoundRect(rectF2, f11, f11, this.iconPaint);
        if (this.iconClipRect.width() > this.iconCollapsedWidth) {
            RectF rectF3 = this.iconClipRect;
            float f12 = this.iconRadius;
            canvas.drawRoundRect(rectF3, f12, f12, this.iconClipPaint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            size = (int) Math.min(this.defWidth, this.defHeight);
            size2 = size;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable(Constants.STATE));
            boolean z10 = bundle.getBoolean(Constants.KEY_CHECKED);
            this.checked = z10;
            if (z10) {
                return;
            }
            forceCheck();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putBoolean(Constants.KEY_CHECKED, this.checked);
        bundle.putParcelable(Constants.STATE, super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.switcherRect.right = getWidth();
        this.switcherRect.bottom = getHeight();
        float fMin = Math.min(i10, i11) / 2.0f;
        this.switcherRadius = fMin;
        float f10 = 0.5f * fMin;
        this.iconRadius = f10;
        float f11 = f10 / 2.25f;
        this.iconClipRadius = f11;
        float f12 = (f10 - f11) * 1.1f;
        this.iconCollapsedWidth = f12;
        float f13 = f10 * 2.0f;
        this.iconHeight = f13;
        this.iconRect.set(fMin - (f12 / 2.0f), ((fMin * 2.0f) - f13) / 2.0f, (f12 / 2.0f) + fMin, (fMin * 2.0f) - (((fMin * 2.0f) - f13) / 2.0f));
        if (!this.checked) {
            RectF rectF = this.iconRect;
            float f14 = this.switcherRadius;
            float f15 = this.iconCollapsedWidth;
            float f16 = this.iconRadius;
            rectF.left = (f14 - (f15 / 2.0f)) - (f16 - (f15 / 2.0f));
            rectF.right = f14 + (f15 / 2.0f) + (f16 - (f15 / 2.0f));
            this.iconClipRect.set(rectF.centerX() - this.iconClipRadius, this.iconRect.centerY() - this.iconClipRadius, this.iconRect.centerX() + this.iconClipRadius, this.iconRect.centerY() + this.iconClipRadius);
        }
        setOutlineProvider(new c(i10, i11));
        setElevation(this.switchElevation);
    }

    public void setChecked(boolean z10) {
        if (this.checked != z10) {
            this.checked = z10;
            animateSwitch();
        }
    }

    public void setCurrentColor(@k int i10) {
        this.currentColor = i10;
        this.switcherPaint.setColor(i10);
        this.iconClipPaint.setColor(i10);
    }

    public void setIconProgress(float f10) {
        this.iconProgress = f10;
        float fLerp = lerp(0.0f, this.iconRadius - (this.iconCollapsedWidth / 2.0f), f10);
        this.iconRect.left = ((getWidth() - this.switcherRadius) - (this.iconCollapsedWidth / 2.0f)) - fLerp;
        this.iconRect.right = (getWidth() - this.switcherRadius) + (this.iconCollapsedWidth / 2.0f) + fLerp;
        float fLerp2 = lerp(0.0f, this.iconClipRadius, f10);
        this.iconClipRect.set(this.iconRect.centerX() - fLerp2, this.iconRect.centerY() - fLerp2, this.iconRect.centerX() + fLerp2, this.iconRect.centerY() + fLerp2);
        postInvalidateOnAnimation();
    }

    public void setOnCheckedChangedListener(b bVar) {
        this.onCheckedChangedListener = bVar;
    }

    public void setOnClickRadiusOffset(float f10) {
        this.onClickRadiusOffset = f10;
        RectF rectF = this.switcherRect;
        rectF.left = f10;
        rectF.top = f10;
        rectF.right = getWidth() - f10;
        this.switcherRect.bottom = getHeight() - f10;
        invalidate();
    }

    public NiceSwitchRound(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.iconRadius = 0.0f;
        this.iconClipRadius = 0.0f;
        this.iconCollapsedWidth = 0.0f;
        this.defHeight = 0.0f;
        this.defWidth = 0.0f;
        this.checked = true;
        this.onColor = 0;
        this.offColor = 0;
        this.iconColor = 0;
        this.switcherRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.switcherPaint = new Paint(1);
        this.iconRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.iconClipRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.iconPaint = new Paint(1);
        this.iconClipPaint = new Paint(1);
        this.animatorSet = new AnimatorSet();
        this.onClickRadiusOffset = 0.0f;
        this.currentColor = 0;
        this.switcherRadius = 0.0f;
        this.switchElevation = 0.0f;
        this.iconHeight = 0.0f;
        this.iconProgress = 0.0f;
        init(context, attributeSet, 0);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            NiceSwitchRound niceSwitchRound = NiceSwitchRound.this;
            niceSwitchRound.checked = !niceSwitchRound.checked;
            if (NiceSwitchRound.this.onCheckedChangedListener != null) {
                NiceSwitchRound.this.onCheckedChangedListener.a(NiceSwitchRound.this.checked);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    public NiceSwitchRound(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.iconRadius = 0.0f;
        this.iconClipRadius = 0.0f;
        this.iconCollapsedWidth = 0.0f;
        this.defHeight = 0.0f;
        this.defWidth = 0.0f;
        this.checked = true;
        this.onColor = 0;
        this.offColor = 0;
        this.iconColor = 0;
        this.switcherRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.switcherPaint = new Paint(1);
        this.iconRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.iconClipRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.iconPaint = new Paint(1);
        this.iconClipPaint = new Paint(1);
        this.animatorSet = new AnimatorSet();
        this.onClickRadiusOffset = 0.0f;
        this.currentColor = 0;
        this.switcherRadius = 0.0f;
        this.switchElevation = 0.0f;
        this.iconHeight = 0.0f;
        this.iconProgress = 0.0f;
        init(context, attributeSet, i10);
    }

    @t0(api = 21)
    public NiceSwitchRound(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.iconRadius = 0.0f;
        this.iconClipRadius = 0.0f;
        this.iconCollapsedWidth = 0.0f;
        this.defHeight = 0.0f;
        this.defWidth = 0.0f;
        this.checked = true;
        this.onColor = 0;
        this.offColor = 0;
        this.iconColor = 0;
        this.switcherRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.switcherPaint = new Paint(1);
        this.iconRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.iconClipRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.iconPaint = new Paint(1);
        this.iconClipPaint = new Paint(1);
        this.animatorSet = new AnimatorSet();
        this.onClickRadiusOffset = 0.0f;
        this.currentColor = 0;
        this.switcherRadius = 0.0f;
        this.switchElevation = 0.0f;
        this.iconHeight = 0.0f;
        this.iconProgress = 0.0f;
        init(context, attributeSet, i10);
    }
}
