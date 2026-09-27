package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(21)
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class FadeAndShortSlide extends Visibility {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f11950g = "android:fadeAndShortSlideTransition:screenPosition";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f11956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Visibility f11957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f11958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f11959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeInterpolator f11949f = new DecelerateInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f11951h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f11952i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f11953j = new c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f11954k = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g f11955l = new e();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + fadeAndShortSlide.c(viewGroup) : view.getTranslationX() - fadeAndShortSlide.c(viewGroup);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - fadeAndShortSlide.c(viewGroup) : view.getTranslationX() + fadeAndShortSlide.c(viewGroup);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int width = iArr[0] + (view.getWidth() / 2);
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = fadeAndShortSlide.getEpicenter();
            return width < (epicenter == null ? iArr[0] + (viewGroup.getWidth() / 2) : epicenter.centerX()) ? view.getTranslationX() - fadeAndShortSlide.c(viewGroup) : view.getTranslationX() + fadeAndShortSlide.c(viewGroup);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY() + fadeAndShortSlide.d(viewGroup);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY() - fadeAndShortSlide.d(viewGroup);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f extends g {
        public f() {
        }

        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int height = iArr[1] + (view.getHeight() / 2);
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = FadeAndShortSlide.this.getEpicenter();
            return height < (epicenter == null ? iArr[1] + (viewGroup.getHeight() / 2) : epicenter.centerY()) ? view.getTranslationY() - fadeAndShortSlide.d(viewGroup) : view.getTranslationY() + fadeAndShortSlide.d(viewGroup);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class g {
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationX();
        }

        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY();
        }
    }

    public FadeAndShortSlide() {
        this(8388611);
    }

    public final void a(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put(f11950g, iArr);
    }

    @Override // android.transition.Transition
    public Transition addListener(Transition.TransitionListener transitionListener) {
        this.f11957c.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    public float b() {
        return this.f11958d;
    }

    public float c(ViewGroup viewGroup) {
        float f10 = this.f11958d;
        return f10 >= 0.0f ? f10 : viewGroup.getWidth() / 4;
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        this.f11957c.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        a(transitionValues);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        this.f11957c.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        a(transitionValues);
    }

    public float d(ViewGroup viewGroup) {
        float f10 = this.f11958d;
        return f10 >= 0.0f ? f10 : viewGroup.getHeight() / 4;
    }

    public void e(float f10) {
        this.f11958d = f10;
    }

    public void f(int i10) {
        if (i10 == 48) {
            this.f11956b = f11955l;
            return;
        }
        if (i10 == 80) {
            this.f11956b = f11954k;
            return;
        }
        if (i10 == 112) {
            this.f11956b = this.f11959e;
            return;
        }
        if (i10 == 8388611) {
            this.f11956b = f11951h;
        } else if (i10 == 8388613) {
            this.f11956b = f11952i;
        } else {
            if (i10 != 8388615) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f11956b = f11953j;
        }
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get(f11950g);
        int i10 = iArr[0];
        int i11 = iArr[1];
        float translationX = view.getTranslationX();
        Animator animatorA = androidx.leanback.transition.g.a(view, transitionValues2, i10, i11, this.f11956b.a(this, viewGroup, view, iArr), this.f11956b.b(this, viewGroup, view, iArr), translationX, view.getTranslationY(), f11949f, this);
        Animator animatorOnAppear = this.f11957c.onAppear(viewGroup, view, transitionValues, transitionValues2);
        if (animatorA == null) {
            return animatorOnAppear;
        }
        if (animatorOnAppear == null) {
            return animatorA;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorA).with(animatorOnAppear);
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get(f11950g);
        Animator animatorA = androidx.leanback.transition.g.a(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f11956b.a(this, viewGroup, view, iArr), this.f11956b.b(this, viewGroup, view, iArr), f11949f, this);
        Animator animatorOnDisappear = this.f11957c.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        if (animatorA == null) {
            return animatorOnDisappear;
        }
        if (animatorOnDisappear == null) {
            return animatorA;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorA).with(animatorOnDisappear);
        return animatorSet;
    }

    @Override // android.transition.Transition
    public Transition removeListener(Transition.TransitionListener transitionListener) {
        this.f11957c.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    @Override // android.transition.Transition
    public void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.f11957c.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }

    public FadeAndShortSlide(int i10) {
        this.f11957c = new Fade();
        this.f11958d = -1.0f;
        this.f11959e = new f();
        f(i10);
    }

    @Override // android.transition.Transition
    public Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.f11957c = (Visibility) this.f11957c.clone();
        return fadeAndShortSlide;
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11957c = new Fade();
        this.f11958d = -1.0f;
        this.f11959e = new f();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s3.a.n.Q2);
        f(typedArrayObtainStyledAttributes.getInt(s3.a.n.U2, 8388611));
        typedArrayObtainStyledAttributes.recycle();
    }
}
