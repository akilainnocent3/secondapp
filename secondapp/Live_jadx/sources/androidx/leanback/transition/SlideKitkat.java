package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
class SlideKitkat extends Visibility {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f11964d = "SlideKitkat";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f11965e = new DecelerateInterpolator();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeInterpolator f11966f = new AccelerateInterpolator();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f11967g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f11968h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f11969i = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f11970j = new d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f11971k = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g f11972l = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f11974c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float b(View view) {
            return view.getTranslationX() - view.getWidth();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends i {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float b(View view) {
            return view.getTranslationY() - view.getHeight();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float b(View view) {
            return view.getTranslationX() + view.getWidth();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends i {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float b(View view) {
            return view.getTranslationY() + view.getHeight();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float b(View view) {
            return view.getLayoutDirection() == 1 ? view.getTranslationX() + view.getWidth() : view.getTranslationX() - view.getWidth();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float b(View view) {
            return view.getLayoutDirection() == 1 ? view.getTranslationX() - view.getWidth() : view.getTranslationX() + view.getWidth();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g {
        Property<View, Float> a();

        float b(View view);

        float c(View view);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class h implements g {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public Property<View, Float> a() {
            return View.TRANSLATION_X;
        }

        @Override // androidx.leanback.transition.SlideKitkat.g
        public float c(View view) {
            return view.getTranslationX();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class i implements g {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public Property<View, Float> a() {
            return View.TRANSLATION_Y;
        }

        @Override // androidx.leanback.transition.SlideKitkat.g
        public float c(View view) {
            return view.getTranslationY();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class j extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f11975b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f11976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final View f11977d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f11978e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f11979f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f11980g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Property<View, Float> f11981h;

        public j(View view, Property<View, Float> property, float f10, float f11, int i10) {
            this.f11981h = property;
            this.f11977d = view;
            this.f11979f = f10;
            this.f11978e = f11;
            this.f11980g = i10;
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11977d.setTag(s3.a.h.f128777v1, new float[]{this.f11977d.getTranslationX(), this.f11977d.getTranslationY()});
            this.f11981h.set(this.f11977d, Float.valueOf(this.f11979f));
            this.f11975b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f11975b) {
                this.f11981h.set(this.f11977d, Float.valueOf(this.f11979f));
            }
            this.f11977d.setVisibility(this.f11980g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f11976c = this.f11981h.get(this.f11977d).floatValue();
            this.f11981h.set(this.f11977d, Float.valueOf(this.f11978e));
            this.f11977d.setVisibility(this.f11980g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f11981h.set(this.f11977d, Float.valueOf(this.f11976c));
            this.f11977d.setVisibility(0);
        }
    }

    public SlideKitkat() {
        c(80);
    }

    public final Animator a(View view, Property<View, Float> property, float f10, float f11, float f12, TimeInterpolator timeInterpolator, int i10) {
        float[] fArr = (float[]) view.getTag(s3.a.h.f128777v1);
        if (fArr != null) {
            f10 = View.TRANSLATION_Y == property ? fArr[1] : fArr[0];
            view.setTag(s3.a.h.f128777v1, null);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, property, f10, f11);
        j jVar = new j(view, property, f12, f11, i10);
        objectAnimatorOfFloat.addListener(jVar);
        objectAnimatorOfFloat.addPauseListener(jVar);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        return objectAnimatorOfFloat;
    }

    public int b() {
        return this.f11973b;
    }

    public void c(int i10) {
        if (i10 == 3) {
            this.f11974c = f11967g;
        } else if (i10 == 5) {
            this.f11974c = f11969i;
        } else if (i10 == 48) {
            this.f11974c = f11968h;
        } else if (i10 == 80) {
            this.f11974c = f11970j;
        } else if (i10 == 8388611) {
            this.f11974c = f11971k;
        } else {
            if (i10 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f11974c = f11972l;
        }
        this.f11973b = i10;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i10, TransitionValues transitionValues2, int i11) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        float fC = this.f11974c.c(view);
        return a(view, this.f11974c.a(), this.f11974c.b(view), fC, fC, f11965e, 0);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i10, TransitionValues transitionValues2, int i11) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        float fC = this.f11974c.c(view);
        return a(view, this.f11974c.a(), fC, this.f11974c.b(view), fC, f11966f, 4);
    }

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s3.a.n.Q2);
        c(typedArrayObtainStyledAttributes.getInt(s3.a.n.U2, 80));
        long j10 = typedArrayObtainStyledAttributes.getInt(s3.a.n.S2, -1);
        if (j10 >= 0) {
            setDuration(j10);
        }
        long j11 = typedArrayObtainStyledAttributes.getInt(s3.a.n.T2, -1);
        if (j11 > 0) {
            setStartDelay(j11);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(s3.a.n.R2, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
