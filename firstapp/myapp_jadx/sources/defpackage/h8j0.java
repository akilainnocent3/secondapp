package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h8j0 {
    public e a;

    public static class c extends e {
        public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        public static final v9h f = new v9h();
        public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
        public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

        public static class a implements View.OnApplyWindowInsetsListener {
            public final b a;
            public l8j0 b;

            /* JADX INFO: renamed from: h8j0$c$a$a, reason: collision with other inner class name */
            public class C0627a implements ValueAnimator.AnimatorUpdateListener {
                public final /* synthetic */ h8j0 a;
                public final /* synthetic */ l8j0 b;
                public final /* synthetic */ l8j0 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ View e;

                public C0627a(h8j0 h8j0Var, l8j0 l8j0Var, l8j0 l8j0Var2, int i, View view) {
                    this.a = h8j0Var;
                    this.b = l8j0Var;
                    this.c = l8j0Var2;
                    this.d = i;
                    this.e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    l8j0.e bVar;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    h8j0 h8j0Var = this.a;
                    e eVar = h8j0Var.a;
                    eVar.e(animatedFraction);
                    float fC = eVar.c();
                    PathInterpolator pathInterpolator = c.e;
                    int i = Build.VERSION.SDK_INT;
                    l8j0 l8j0Var = this.b;
                    if (i >= 34) {
                        bVar = new l8j0.d(l8j0Var);
                    } else if (i >= 30) {
                        bVar = new l8j0.c(l8j0Var);
                    } else {
                        bVar = i >= 29 ? new l8j0.b(l8j0Var) : new l8j0.a(l8j0Var);
                    }
                    for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                        int i3 = this.d & i2;
                        l8j0.l lVar = l8j0Var.a;
                        if (i3 == 0) {
                            bVar.c(i2, lVar.g(i2));
                        } else {
                            ymn ymnVarG = lVar.g(i2);
                            ymn ymnVarG2 = this.c.a.g(i2);
                            float f = 1.0f - fC;
                            bVar.c(i2, l8j0.e(ymnVarG, (int) (((double) ((ymnVarG.a - ymnVarG2.a) * f)) + 0.5d), (int) (((double) ((ymnVarG.b - ymnVarG2.b) * f)) + 0.5d), (int) (((double) ((ymnVarG.c - ymnVarG2.c) * f)) + 0.5d), (int) (((double) ((ymnVarG.d - ymnVarG2.d) * f)) + 0.5d)));
                        }
                    }
                    c.h(this.e, bVar.b(), Collections.singletonList(h8j0Var));
                }
            }

            public class b extends AnimatorListenerAdapter {
                public final /* synthetic */ h8j0 a;
                public final /* synthetic */ View b;

                public b(h8j0 h8j0Var, View view) {
                    this.a = h8j0Var;
                    this.b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    h8j0 h8j0Var = this.a;
                    h8j0Var.a.e(1.0f);
                    c.f(h8j0Var, this.b);
                }
            }

            /* JADX INFO: renamed from: h8j0$c$a$c, reason: collision with other inner class name */
            public class RunnableC0628c implements Runnable {
                public final /* synthetic */ View a;
                public final /* synthetic */ h8j0 b;
                public final /* synthetic */ a c;
                public final /* synthetic */ ValueAnimator d;

                public RunnableC0628c(View view, h8j0 h8j0Var, a aVar, ValueAnimator valueAnimator) {
                    this.a = view;
                    this.b = h8j0Var;
                    this.c = aVar;
                    this.d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.i(this.a, this.b, this.c);
                    this.d.start();
                }
            }

            public a(View view, b bVar) {
                l8j0 l8j0VarB;
                this.a = bVar;
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                l8j0 l8j0VarA = r6i0.e.a(view);
                if (l8j0VarA != null) {
                    int i = Build.VERSION.SDK_INT;
                    l8j0VarB = (i >= 34 ? new l8j0.d(l8j0VarA) : i >= 30 ? new l8j0.c(l8j0VarA) : i >= 29 ? new l8j0.b(l8j0VarA) : new l8j0.a(l8j0VarA)).b();
                } else {
                    l8j0VarB = null;
                }
                this.b = l8j0VarB;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                Interpolator interpolator;
                if (!view.isLaidOut()) {
                    this.b = l8j0.h(view, windowInsets);
                    return c.j(view, windowInsets);
                }
                l8j0 l8j0VarH = l8j0.h(view, windowInsets);
                l8j0.l lVar = l8j0VarH.a;
                l8j0 l8j0VarA = this.b;
                if (l8j0VarA == null) {
                    WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                    l8j0VarA = r6i0.e.a(view);
                    this.b = l8j0VarA;
                }
                if (l8j0VarA == null) {
                    this.b = l8j0VarH;
                    return c.j(view, windowInsets);
                }
                b bVarK = c.k(view);
                if (bVarK != null && Objects.equals(bVarK.a, l8j0VarH)) {
                    return c.j(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                l8j0 l8j0Var = this.b;
                int i = 1;
                while (i <= 512) {
                    ymn ymnVarG = lVar.g(i);
                    ymn ymnVarG2 = l8j0Var.a.g(i);
                    int i2 = ymnVarG.a;
                    int i3 = ymnVarG.d;
                    int i4 = ymnVarG.c;
                    int i5 = ymnVarG.b;
                    int i6 = ymnVarG2.a;
                    int i7 = ymnVarG2.d;
                    int i8 = ymnVarG2.c;
                    int i9 = ymnVarG2.b;
                    boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr[0] = iArr[0] | i;
                        } else {
                            iArr2[0] = iArr2[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr = iArr;
                }
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = l8j0VarH;
                    return c.j(view, windowInsets);
                }
                l8j0 l8j0Var2 = this.b;
                if ((i10 & 8) != 0) {
                    interpolator = c.e;
                } else if ((i11 & 8) != 0) {
                    interpolator = c.f;
                } else if ((i10 & 519) != 0) {
                    interpolator = c.g;
                } else {
                    interpolator = (i11 & 519) != 0 ? c.h : null;
                }
                h8j0 h8j0Var = new h8j0(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
                h8j0Var.a.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(h8j0Var.a.b());
                ymn ymnVarG3 = lVar.g(i12);
                ymn ymnVarG4 = l8j0Var2.a.g(i12);
                int iMin = Math.min(ymnVarG3.a, ymnVarG4.a);
                int i13 = ymnVarG3.b;
                int i14 = ymnVarG4.b;
                int iMin2 = Math.min(i13, i14);
                int i15 = ymnVarG3.c;
                int i16 = ymnVarG4.c;
                int iMin3 = Math.min(i15, i16);
                int i17 = ymnVarG3.d;
                int i18 = ymnVarG4.d;
                a aVar = new a(ymn.c(iMin, iMin2, iMin3, Math.min(i17, i18)), ymn.c(Math.max(ymnVarG3.a, ymnVarG4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
                c.g(view, h8j0Var, l8j0VarH, false);
                duration.addUpdateListener(new C0627a(h8j0Var, l8j0VarH, l8j0Var2, i12, view));
                duration.addListener(new b(h8j0Var, view));
                qry.a(view, new RunnableC0628c(view, h8j0Var, aVar, duration));
                this.b = l8j0VarH;
                return c.j(view, windowInsets);
            }
        }

        public static void f(h8j0 h8j0Var, View view) {
            b bVarK = k(view);
            if (bVarK != null) {
                bVarK.a(h8j0Var);
                if (bVarK.b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(h8j0Var, viewGroup.getChildAt(i));
                }
            }
        }

        public static void g(View view, h8j0 h8j0Var, l8j0 l8j0Var, boolean z) {
            b bVarK = k(view);
            if (bVarK != null) {
                bVarK.a = l8j0Var;
                if (!z) {
                    bVarK.c(h8j0Var);
                    z = bVarK.b == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    g(viewGroup.getChildAt(i), h8j0Var, l8j0Var, z);
                }
            }
        }

        public static void h(View view, l8j0 l8j0Var, List<h8j0> list) {
            b bVarK = k(view);
            if (bVarK != null) {
                l8j0Var = bVarK.d(l8j0Var, list);
                if (bVarK.b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    h(viewGroup.getChildAt(i), l8j0Var, list);
                }
            }
        }

        public static void i(View view, h8j0 h8j0Var, a aVar) {
            b bVarK = k(view);
            if (bVarK != null) {
                bVarK.e(h8j0Var, aVar);
                if (bVarK.b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    i(viewGroup.getChildAt(i), h8j0Var, aVar);
                }
            }
        }

        public static WindowInsets j(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b k(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).a;
            }
            return null;
        }
    }

    public static class d extends e {
        public final WindowInsetsAnimation e;

        public static class a extends WindowInsetsAnimation$Callback {
            public final b a;
            public List<h8j0> b;
            public ArrayList<h8j0> c;
            public final HashMap<WindowInsetsAnimation, h8j0> d;

            public a(b bVar) {
                super(bVar.b);
                this.d = new HashMap<>();
                this.a = bVar;
            }

            public final h8j0 a(WindowInsetsAnimation windowInsetsAnimation) {
                HashMap<WindowInsetsAnimation, h8j0> map = this.d;
                h8j0 h8j0Var = map.get(windowInsetsAnimation);
                if (h8j0Var == null) {
                    h8j0Var = new h8j0(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        h8j0Var.a = new d(windowInsetsAnimation);
                    }
                    map.put(windowInsetsAnimation, h8j0Var);
                }
                return h8j0Var;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.a(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(a(windowInsetsAnimation));
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<h8j0> arrayList = this.c;
                if (arrayList == null) {
                    ArrayList<h8j0> arrayList2 = new ArrayList<>(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    h8j0 h8j0VarA = a(windowInsetsAnimation);
                    h8j0VarA.a.e(windowInsetsAnimation.getFraction());
                    this.c.add(h8j0VarA);
                }
                return this.a.d(l8j0.h(null, windowInsets), this.b).g();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                a aVarE = this.a.e(a(windowInsetsAnimation), new a(bounds));
                aVarE.getClass();
                k8j0.a();
                return j8j0.a(aVarE.a.e(), aVarE.b.e());
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        public static ymn f(WindowInsetsAnimation.Bounds bounds) {
            return ymn.d(bounds.getUpperBound());
        }

        public static ymn g(WindowInsetsAnimation.Bounds bounds) {
            return ymn.d(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // h8j0.e
        public final float a() {
            return this.e.getAlpha();
        }

        @Override // h8j0.e
        public final long b() {
            return this.e.getDurationMillis();
        }

        @Override // h8j0.e
        public final float c() {
            return this.e.getInterpolatedFraction();
        }

        @Override // h8j0.e
        public final int d() {
            return this.e.getTypeMask();
        }

        @Override // h8j0.e
        public final void e(float f) {
            this.e.setFraction(f);
        }
    }

    public static class e {
        public final int a;
        public float b;
        public final Interpolator c;
        public final long d;

        public e(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public float a() {
            return 1.0f;
        }

        public long b() {
            return this.d;
        }

        public float c() {
            float f = this.b;
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(f) : f;
        }

        public int d() {
            return this.a;
        }

        public void e(float f) {
            this.b = f;
        }
    }

    public h8j0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(i8j0.a(i, interpolator, j));
        } else {
            this.a = new c(i, interpolator, j);
        }
    }

    public static void a(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
            return;
        }
        PathInterpolator pathInterpolator = c.e;
        View.OnApplyWindowInsetsListener aVar = bVar != null ? new c.a(view, bVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, aVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(aVar);
        }
    }

    public static final class a {
        public final ymn a;
        public final ymn b;

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.a = d.g(bounds);
            this.b = d.f(bounds);
        }

        public final String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }

        public a(ymn ymnVar, ymn ymnVar2) {
            this.a = ymnVar;
            this.b = ymnVar2;
        }
    }

    public static abstract class b {
        public l8j0 a;
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public abstract l8j0 d(l8j0 l8j0Var, List<h8j0> list);

        public abstract a e(h8j0 h8j0Var, a aVar);

        public void a(h8j0 h8j0Var) {
        }

        public void c(h8j0 h8j0Var) {
        }
    }
}
