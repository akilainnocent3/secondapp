package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class pp10 {
    public boolean A;
    public boolean B;
    public final PlayerControlView a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final View j;
    public final View k;
    public final AnimatorSet l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final ValueAnimator q;
    public final ValueAnimator r;
    public final cp10 s = new Runnable() { // from class: cp10
        @Override // java.lang.Runnable
        public final void run() {
            this.a.k();
        }
    };
    public final ip10 t = new Runnable() { // from class: ip10
        @Override // java.lang.Runnable
        public final void run() {
            this.a.n.start();
        }
    };
    public final jp10 u = new Runnable() { // from class: jp10
        @Override // java.lang.Runnable
        public final void run() {
            this.a.m.start();
        }
    };
    public final kp10 v = new Runnable() { // from class: kp10
        @Override // java.lang.Runnable
        public final void run() {
            pp10 pp10Var = this.a;
            pp10Var.l.start();
            pp10Var.e(2000L, pp10Var.u);
        }
    };
    public final lp10 w = new Runnable() { // from class: lp10
        @Override // java.lang.Runnable
        public final void run() {
            this.a.i(2);
        }
    };
    public final mp10 x = new View.OnLayoutChangeListener() { // from class: mp10
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int paddingRight;
            int height;
            int paddingBottom;
            int height2;
            final pp10 pp10Var = this.a;
            PlayerControlView playerControlView = pp10Var.a;
            int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
            int height3 = (playerControlView.getHeight() - playerControlView.getPaddingBottom()) - playerControlView.getPaddingTop();
            ViewGroup viewGroup = pp10Var.c;
            int iC = pp10.c(viewGroup);
            if (viewGroup != null) {
                paddingRight = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
            } else {
                paddingRight = 0;
            }
            int i10 = iC - paddingRight;
            if (viewGroup == null) {
                height = 0;
            } else {
                height = viewGroup.getHeight();
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                }
            }
            if (viewGroup != null) {
                paddingBottom = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop();
            } else {
                paddingBottom = 0;
            }
            int i11 = height - paddingBottom;
            int iMax = Math.max(i10, pp10.c(pp10Var.k) + pp10.c(pp10Var.i));
            ViewGroup viewGroup2 = pp10Var.d;
            if (viewGroup2 == null) {
                height2 = 0;
            } else {
                height2 = viewGroup2.getHeight();
                ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                }
            }
            boolean z = width <= iMax || height3 <= (height2 * 2) + i11;
            if (pp10Var.A != z) {
                pp10Var.A = z;
                view.post(new Runnable() { // from class: ep10
                    @Override // java.lang.Runnable
                    public final void run() {
                        pp10 pp10Var2 = pp10Var;
                        View view2 = pp10Var2.j;
                        ViewGroup viewGroup3 = pp10Var2.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(pp10Var2.A ? 0 : 4);
                        }
                        if (view2 != null) {
                            int dimensionPixelSize = pp10Var2.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                            if (marginLayoutParams3 != null) {
                                if (pp10Var2.A) {
                                    dimensionPixelSize = 0;
                                }
                                marginLayoutParams3.bottomMargin = dimensionPixelSize;
                                view2.setLayoutParams(marginLayoutParams3);
                            }
                            if (view2 instanceof DefaultTimeBar) {
                                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
                                Rect rect = defaultTimeBar.a;
                                ValueAnimator valueAnimator = defaultTimeBar.T;
                                if (pp10Var2.A) {
                                    if (valueAnimator.isStarted()) {
                                        valueAnimator.cancel();
                                    }
                                    defaultTimeBar.V = true;
                                    defaultTimeBar.U = 0.0f;
                                    defaultTimeBar.invalidate(rect);
                                } else {
                                    int i12 = pp10Var2.z;
                                    if (i12 == 1) {
                                        if (valueAnimator.isStarted()) {
                                            valueAnimator.cancel();
                                        }
                                        defaultTimeBar.V = false;
                                        defaultTimeBar.U = 0.0f;
                                        defaultTimeBar.invalidate(rect);
                                    } else if (i12 != 3) {
                                        if (valueAnimator.isStarted()) {
                                            valueAnimator.cancel();
                                        }
                                        defaultTimeBar.V = false;
                                        defaultTimeBar.U = 1.0f;
                                        defaultTimeBar.invalidate(rect);
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = pp10Var2.y;
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList.get(i13);
                            i13++;
                            View view3 = (View) obj;
                            view3.setVisibility((pp10Var2.A && pp10.j(view3)) ? 4 : 0);
                        }
                    }
                });
            }
            boolean z2 = i4 - i2 != i8 - i6;
            if (pp10Var.A || !z2) {
                return;
            }
            view.post(new Runnable() { // from class: fp10
                @Override // java.lang.Runnable
                public final void run() {
                    int i12;
                    pp10 pp10Var2 = pp10Var;
                    ValueAnimator valueAnimator = pp10Var2.r;
                    View view2 = pp10Var2.k;
                    PlayerControlView playerControlView2 = pp10Var2.a;
                    ViewGroup viewGroup3 = pp10Var2.g;
                    ViewGroup viewGroup4 = pp10Var2.f;
                    if (viewGroup4 == null || viewGroup3 == null) {
                        return;
                    }
                    int width2 = (playerControlView2.getWidth() - playerControlView2.getPaddingLeft()) - playerControlView2.getPaddingRight();
                    while (true) {
                        if (viewGroup3.getChildCount() <= 1) {
                            break;
                        }
                        int childCount = viewGroup3.getChildCount() - 2;
                        View childAt = viewGroup3.getChildAt(childCount);
                        viewGroup3.removeViewAt(childCount);
                        viewGroup4.addView(childAt, 0);
                    }
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    int iC2 = pp10.c(pp10Var2.i);
                    int childCount2 = viewGroup4.getChildCount() - 1;
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        iC2 += pp10.c(viewGroup4.getChildAt(i13));
                    }
                    if (iC2 <= width2) {
                        ViewGroup viewGroup5 = pp10Var2.h;
                        if (viewGroup5 == null || viewGroup5.getVisibility() != 0 || valueAnimator.isStarted()) {
                            return;
                        }
                        pp10Var2.q.cancel();
                        valueAnimator.start();
                        return;
                    }
                    if (view2 != null) {
                        view2.setVisibility(0);
                        iC2 += pp10.c(view2);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        View childAt2 = viewGroup4.getChildAt(i14);
                        iC2 -= pp10.c(childAt2);
                        arrayList.add(childAt2);
                        if (iC2 <= width2) {
                            break;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    viewGroup4.removeViews(0, arrayList.size());
                    for (i12 = 0; i12 < arrayList.size(); i12++) {
                        viewGroup3.addView((View) arrayList.get(i12), viewGroup3.getChildCount() - 1);
                    }
                }
            });
        }
    };
    public boolean C = true;
    public int z = 0;
    public final ArrayList y = new ArrayList();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            pp10 pp10Var = pp10.this;
            View view = pp10Var.b;
            if (view != null) {
                view.setVisibility(4);
            }
            ViewGroup viewGroup = pp10Var.c;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = pp10Var.e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            pp10 pp10Var = pp10.this;
            View view = pp10Var.j;
            if (!(view instanceof DefaultTimeBar) || pp10Var.A) {
                return;
            }
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
            ValueAnimator valueAnimator = defaultTimeBar.T;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            valueAnimator.setFloatValues(defaultTimeBar.U, 0.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            pp10 pp10Var = pp10.this;
            View view = pp10Var.b;
            if (view != null) {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = pp10Var.c;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = pp10Var.e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(pp10Var.A ? 0 : 4);
            }
            View view2 = pp10Var.j;
            if (!(view2 instanceof DefaultTimeBar) || pp10Var.A) {
                return;
            }
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
            ValueAnimator valueAnimator = defaultTimeBar.T;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            defaultTimeBar.V = false;
            valueAnimator.setFloatValues(defaultTimeBar.U, 1.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ PlayerControlView a;

        public c(PlayerControlView playerControlView) {
            this.a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            pp10 pp10Var = pp10.this;
            pp10Var.i(1);
            if (pp10Var.B) {
                this.a.post(pp10Var.s);
                pp10Var.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            pp10.this.i(3);
        }
    }

    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ PlayerControlView a;

        public d(PlayerControlView playerControlView) {
            this.a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            pp10 pp10Var = pp10.this;
            pp10Var.i(2);
            if (pp10Var.B) {
                this.a.post(pp10Var.s);
                pp10Var.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            pp10.this.i(3);
        }
    }

    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ PlayerControlView a;

        public e(PlayerControlView playerControlView) {
            this.a = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            pp10 pp10Var = pp10.this;
            pp10Var.i(2);
            if (pp10Var.B) {
                this.a.post(pp10Var.s);
                pp10Var.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            pp10.this.i(3);
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            pp10.this.i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            pp10.this.i(4);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            pp10.this.i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            pp10.this.i(4);
        }
    }

    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = pp10.this.f;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = pp10.this.h;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                viewGroup.setTranslationX(viewGroup.getWidth());
                viewGroup.scrollTo(viewGroup.getWidth(), 0);
            }
        }
    }

    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = pp10.this.h;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = pp10.this.f;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cp10] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ip10] */
    /* JADX WARN: Type inference failed for: r0v2, types: [jp10] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kp10] */
    /* JADX WARN: Type inference failed for: r0v4, types: [lp10] */
    /* JADX WARN: Type inference failed for: r0v5, types: [mp10] */
    public pp10(PlayerControlView playerControlView) {
        this.a = playerControlView;
        this.b = playerControlView.findViewById(R.id.exo_controls_background);
        this.c = (ViewGroup) playerControlView.findViewById(R.id.exo_center_controls);
        this.e = (ViewGroup) playerControlView.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(R.id.exo_bottom_bar);
        this.d = viewGroup;
        this.i = (ViewGroup) playerControlView.findViewById(R.id.exo_time);
        View viewFindViewById = playerControlView.findViewById(R.id.exo_progress);
        this.j = viewFindViewById;
        this.f = (ViewGroup) playerControlView.findViewById(R.id.exo_basic_controls);
        this.g = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls);
        this.h = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = playerControlView.findViewById(R.id.exo_overflow_show);
        this.k = viewFindViewById2;
        View viewFindViewById3 = playerControlView.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new np10(this, 0));
            viewFindViewById3.setOnClickListener(new np10(this, 0));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: op10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pp10 pp10Var = this.a;
                View view = pp10Var.b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = pp10Var.c;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup3 = pp10Var.e;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dp10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pp10 pp10Var = this.a;
                View view = pp10Var.b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = pp10Var.c;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup3 = pp10Var.e;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(playerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension)).with(d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(playerControlView));
        animatorSet2.play(d(viewFindViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(playerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension2)).with(d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension, 0.0f)).with(d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension2, 0.0f)).with(d(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gp10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hp10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator d(View view, float f2, float f3) {
        return ObjectAnimator.ofFloat(view, "translationY", f2, f3);
    }

    public static boolean j(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f2) {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f2) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f2);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f2);
        }
    }

    public final boolean b(View view) {
        return view != null && this.y.contains(view);
    }

    public final void e(long j, Runnable runnable) {
        if (j >= 0) {
            this.a.postDelayed(runnable, j);
        }
    }

    public final void f() {
        lp10 lp10Var = this.w;
        PlayerControlView playerControlView = this.a;
        playerControlView.removeCallbacks(lp10Var);
        playerControlView.removeCallbacks(this.t);
        playerControlView.removeCallbacks(this.v);
        playerControlView.removeCallbacks(this.u);
    }

    public final void g() {
        if (this.z == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                e(showTimeoutMs, this.w);
            } else if (this.z == 1) {
                e(2000L, this.u);
            } else {
                e(showTimeoutMs, this.v);
            }
        }
    }

    public final void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.y;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i2) {
        int i3 = this.z;
        this.z = i2;
        PlayerControlView playerControlView = this.a;
        if (i2 == 2) {
            playerControlView.setVisibility(8);
        } else if (i3 == 2) {
            playerControlView.setVisibility(0);
        }
        if (i3 != i2) {
            Iterator<PlayerControlView.l> it = playerControlView.y.iterator();
            while (it.hasNext()) {
                it.next().n(playerControlView.getVisibility());
            }
        }
    }

    public final void k() {
        if (!this.C) {
            i(0);
            g();
            return;
        }
        int i2 = this.z;
        if (i2 == 1) {
            this.o.start();
        } else if (i2 == 2) {
            this.p.start();
        } else if (i2 == 3) {
            this.B = true;
        } else if (i2 == 4) {
            return;
        }
        g();
    }
}
