package com.sporty.android.common_ui.widgets;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.GiftGrabPowerBar;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.d38;
import defpackage.f92;
import defpackage.glk;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.mpe0;
import defpackage.qry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR)\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/common_ui/widgets/GiftGrabPowerBar;", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "targetProgress", "", "setProgressWithAnimate", "(F)V", "", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "a1", "Lttr;", "getDefaultAnimationList", "()Ljava/util/List;", "defaultAnimationList", "getCurrentProgress", "()F", "currentProgress", "a", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GiftGrabPowerBar extends MotionLayout {
    public static final /* synthetic */ int b1 = 0;
    public final glk V0;
    public boolean W0;
    public ObjectAnimator X0;
    public a Y0;
    public float Z0;
    public final mpe0 a1;

    public static final class a {
        public final float a;
        public final ValueAnimator b;

        public a(float f, ValueAnimator valueAnimator) {
            this.a = f;
            this.b = valueAnimator;
        }
    }

    public static final class b implements Animator.AnimatorListener {
        public final /* synthetic */ ValueAnimator b;

        public b(ValueAnimator valueAnimator) {
            this.b = valueAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            GiftGrabPowerBar giftGrabPowerBar = GiftGrabPowerBar.this;
            giftGrabPowerBar.Y0 = null;
            Object animatedValue = this.b.getAnimatedValue();
            animatedValue.getClass();
            giftGrabPowerBar.a0(((Float) animatedValue).floatValue());
            float f = giftGrabPowerBar.Z0;
            if (f == -1.0f) {
                return;
            }
            giftGrabPowerBar.setProgressWithAnimate(f);
            giftGrabPowerBar.Z0 = -1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class c implements Runnable {
        public final /* synthetic */ GiftGrabPowerBar a;

        public c(GiftGrabPowerBar giftGrabPowerBar, GiftGrabPowerBar giftGrabPowerBar2) {
            this.a = giftGrabPowerBar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.constraintlayout.motion.widget.b.C0051b c0051b;
            GiftGrabPowerBar giftGrabPowerBar = this.a;
            try {
                androidx.constraintlayout.motion.widget.b bVar = new androidx.constraintlayout.motion.widget.b(giftGrabPowerBar.getContext(), giftGrabPowerBar, R.xml.gift_grab_power_bar_layout_scene);
                giftGrabPowerBar.F = bVar;
                int i = -1;
                if (giftGrabPowerBar.K == -1) {
                    giftGrabPowerBar.K = bVar.h();
                    giftGrabPowerBar.J = giftGrabPowerBar.F.h();
                    androidx.constraintlayout.motion.widget.b.C0051b c0051b2 = giftGrabPowerBar.F.c;
                    if (c0051b2 != null) {
                        i = c0051b2.c;
                    }
                    giftGrabPowerBar.L = i;
                }
                if (!giftGrabPowerBar.isAttachedToWindow()) {
                    giftGrabPowerBar.F = null;
                    return;
                }
                try {
                    Display display = giftGrabPowerBar.getDisplay();
                    if (display != null) {
                        display.getRotation();
                    }
                    androidx.constraintlayout.motion.widget.b bVar2 = giftGrabPowerBar.F;
                    if (bVar2 != null) {
                        androidx.constraintlayout.widget.b bVarB = bVar2.b(giftGrabPowerBar.K);
                        giftGrabPowerBar.F.n(giftGrabPowerBar);
                        ArrayList<MotionHelper> arrayList = giftGrabPowerBar.s0;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                MotionHelper motionHelper = arrayList.get(i2);
                                i2++;
                                motionHelper.getClass();
                            }
                        }
                        if (bVarB != null) {
                            bVarB.b(giftGrabPowerBar);
                        }
                        giftGrabPowerBar.J = giftGrabPowerBar.K;
                    }
                    giftGrabPowerBar.O();
                    MotionLayout.g gVar = giftGrabPowerBar.J0;
                    if (gVar != null) {
                        if (giftGrabPowerBar.M0) {
                            giftGrabPowerBar.post(new androidx.constraintlayout.motion.widget.a(giftGrabPowerBar));
                            return;
                        } else {
                            gVar.a();
                            return;
                        }
                    }
                    androidx.constraintlayout.motion.widget.b bVar3 = giftGrabPowerBar.F;
                    if (bVar3 == null || (c0051b = bVar3.c) == null || c0051b.n != 4) {
                        return;
                    }
                    giftGrabPowerBar.T();
                    giftGrabPowerBar.setState(MotionLayout.i.b);
                    giftGrabPowerBar.setState(MotionLayout.i.c);
                } catch (Exception e) {
                    throw new IllegalArgumentException("unable to parse MotionScene file", e);
                }
            } catch (Exception e2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGrabPowerBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.gift_grab_power_bar_layout, this);
        int i2 = R.id.bar_frame;
        if (((ImageView) h5e.a(R.id.bar_frame, this)) != null) {
            i2 = R.id.bar_mask;
            View viewA = h5e.a(R.id.bar_mask, this);
            if (viewA != null) {
                i2 = R.id.bar_mask_start;
                if (((Space) h5e.a(R.id.bar_mask_start, this)) != null) {
                    i2 = R.id.coin_center;
                    if (((Space) h5e.a(R.id.coin_center, this)) != null) {
                        i2 = R.id.coin_end_space;
                        if (((Space) h5e.a(R.id.coin_end_space, this)) != null) {
                            i2 = R.id.coin_layout;
                            View viewA2 = h5e.a(R.id.coin_layout, this);
                            if (viewA2 != null) {
                                int i3 = R.id.coin;
                                if (((ImageView) h5e.a(R.id.coin, viewA2)) != null) {
                                    i3 = R.id.coin_mask;
                                    ImageView imageView = (ImageView) h5e.a(R.id.coin_mask, viewA2);
                                    if (imageView != null) {
                                        i3 = R.id.coin_mask_layout;
                                        FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.coin_mask_layout, viewA2);
                                        if (frameLayout != null) {
                                            d38 d38Var = new d38((ConstraintLayout) viewA2, imageView, frameLayout);
                                            int i4 = R.id.coin_start_space;
                                            if (((Space) h5e.a(R.id.coin_start_space, this)) != null) {
                                                i4 = R.id.default_bar;
                                                if (((ImageView) h5e.a(R.id.default_bar, this)) != null) {
                                                    i4 = R.id.default_bar_mask;
                                                    View viewA3 = h5e.a(R.id.default_bar_mask, this);
                                                    if (viewA3 != null) {
                                                        i4 = R.id.default_bar_mask_end_space;
                                                        if (((Space) h5e.a(R.id.default_bar_mask_end_space, this)) != null) {
                                                            this.V0 = new glk(this, viewA, d38Var, viewA3);
                                                            this.Z0 = -1.0f;
                                                            this.a1 = hwr.b(new f92(this, 2));
                                                            qry.a(this, new c(this, this));
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                            i2 = i4;
                                        }
                                    }
                                }
                                bmy.a("Missing required view with ID: ".concat(viewA2.getResources().getResourceName(i3)));
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static boolean Z(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-4f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getCurrentProgress() {
        Float fValueOf = Float.valueOf(getProgress());
        float fFloatValue = fValueOf.floatValue();
        if (0.0f > fFloatValue || fFloatValue > 100.0f) {
            fValueOf = null;
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ObjectAnimator> getDefaultAnimationList() {
        return (List) this.a1.getValue();
    }

    public final void a0(float f) {
        ObjectAnimator objectAnimator = this.X0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.X0 = null;
        boolean Z = Z(f, 1.0f);
        Property property = View.ALPHA;
        glk glkVar = this.V0;
        if (Z) {
            if (!Z(glkVar.c.b.getAlpha(), 1.0f)) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(glkVar.c.b, (Property<ImageView, Float>) property, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(500L);
                this.X0 = objectAnimatorOfFloat;
            }
        } else if (!Z(glkVar.c.b.getAlpha(), 0.0f)) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(glkVar.c.b, (Property<ImageView, Float>) property, 1.0f, 0.0f);
            objectAnimatorOfFloat2.setDuration(500L);
            this.X0 = objectAnimatorOfFloat2;
        }
        ObjectAnimator objectAnimator2 = this.X0;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
    }

    public final void setProgressWithAnimate(float targetProgress) {
        a aVar = this.Y0;
        if (aVar == null || !Z(aVar.a, targetProgress)) {
            a aVar2 = this.Y0;
            if (aVar2 != null && Z(aVar2.a, 0.0f)) {
                this.Z0 = targetProgress;
                return;
            }
            a aVar3 = this.Y0;
            if (aVar3 != null) {
                aVar3.b.cancel();
            }
            if (!Z(targetProgress, 1.0f)) {
                a0(targetProgress);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getCurrentProgress(), targetProgress);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(((double) Math.abs(targetProgress - getCurrentProgress())) > 0.1d ? 1500L : 1000L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: elk
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i = GiftGrabPowerBar.b1;
                    this.a.setProgress(((Float) flk.a(valueAnimator)).floatValue());
                }
            });
            valueAnimatorOfFloat.addListener(new b(valueAnimatorOfFloat));
            Unit unit = Unit.a;
            this.Y0 = new a(targetProgress, valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftGrabPowerBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftGrabPowerBar(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ GiftGrabPowerBar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
