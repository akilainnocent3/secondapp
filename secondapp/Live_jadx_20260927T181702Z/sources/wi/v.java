package wi;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.g0;
import androidx.transition.w0;
import androidx.transition.y;
import k.c0;
import k1.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f143374a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k.f
    public static final int f143375b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f143376c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f143377d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RectF f143378e = new RectF();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RectF f143379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RectF f143380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f143381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f143382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f143383e;

        public a(RectF rectF, RectF rectF2, float f10, float f11, float f12) {
            this.f143379a = rectF;
            this.f143380b = rectF2;
            this.f143381c = f10;
            this.f143382d = f11;
            this.f143383e = f12;
        }

        @Override // wi.v.b
        @NonNull
        public ni.e a(@NonNull ni.e eVar, @NonNull ni.e eVar2) {
            return new ni.a(v.m(eVar.a(this.f143379a), eVar2.a(this.f143380b), this.f143381c, this.f143382d, this.f143383e));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        @NonNull
        ni.e a(@NonNull ni.e eVar, @NonNull ni.e eVar2);
    }

    public static float b(@NonNull RectF rectF) {
        return rectF.width() * rectF.height();
    }

    public static ni.p c(ni.p pVar, final RectF rectF) {
        return pVar.y(new ni.p.c() { // from class: wi.u
            @Override // ni.p.c
            public final ni.e a(ni.e eVar) {
                return ni.n.b(rectF, eVar);
            }
        });
    }

    public static Shader d(@k.k int i10) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i10, i10, Shader.TileMode.CLAMP);
    }

    @NonNull
    public static <T> T e(@Nullable T t10, @NonNull T t11) {
        return t10 != null ? t10 : t11;
    }

    public static View f(View view, @c0 int i10) {
        String resourceName = view.getResources().getResourceName(i10);
        while (view != null) {
            if (view.getId() != i10) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    public static View g(View view, @c0 int i10) {
        View viewFindViewById = view.findViewById(i10);
        return viewFindViewById != null ? viewFindViewById : f(view, i10);
    }

    public static RectF h(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        return new RectF(i10, i11, view.getWidth() + i10, view.getHeight() + i11);
    }

    public static RectF i(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static Rect j(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static boolean k(ni.p pVar, RectF rectF) {
        return (pVar.r().a(rectF) == 0.0f && pVar.t().a(rectF) == 0.0f && pVar.l().a(rectF) == 0.0f && pVar.j().a(rectF) == 0.0f) ? false : true;
    }

    public static float l(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static float m(float f10, float f11, @k.w(from = 0.0d, to = 1.0d) float f12, @k.w(from = 0.0d, to = 1.0d) float f13, @k.w(from = 0.0d, to = 1.0d) float f14) {
        return n(f10, f11, f12, f13, f14, false);
    }

    public static float n(float f10, float f11, @k.w(from = 0.0d, to = 1.0d) float f12, @k.w(from = 0.0d, to = 1.0d) float f13, @k.w(from = 0.0d) float f14, boolean z10) {
        if (z10 && (f14 < 0.0f || f14 > 1.0f)) {
            return l(f10, f11, f14);
        }
        if (f14 < f12) {
            return f10;
        }
        return f14 > f13 ? f11 : l(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int o(int i10, int i11, @k.w(from = 0.0d, to = 1.0d) float f10, @k.w(from = 0.0d, to = 1.0d) float f11, @k.w(from = 0.0d, to = 1.0d) float f12) {
        if (f12 < f10) {
            return i10;
        }
        return f12 > f11 ? i11 : (int) l(i10, i11, (f12 - f10) / (f11 - f10));
    }

    public static ni.p p(ni.p pVar, ni.p pVar2, RectF rectF, RectF rectF2, @k.w(from = 0.0d, to = 1.0d) float f10, @k.w(from = 0.0d, to = 1.0d) float f11, @k.w(from = 0.0d, to = 1.0d) float f12) {
        if (f12 < f10) {
            return pVar;
        }
        return f12 > f11 ? pVar2 : y(pVar, pVar2, rectF, new a(rectF, rectF2, f10, f11, f12));
    }

    public static void q(w0 w0Var, @Nullable g0 g0Var) {
        if (g0Var != null) {
            w0Var.z(g0Var);
        }
    }

    public static boolean r(g0 g0Var, Context context, @k.f int i10) {
        int iF;
        if (i10 == 0 || g0Var.getDuration() != -1 || (iF = gi.j.f(context, i10, -1)) == -1) {
            return false;
        }
        g0Var.setDuration(iF);
        return true;
    }

    public static boolean s(g0 g0Var, Context context, @k.f int i10, TimeInterpolator timeInterpolator) {
        if (i10 == 0 || g0Var.getInterpolator() != null) {
            return false;
        }
        g0Var.setInterpolator(gi.j.g(context, i10, timeInterpolator));
        return true;
    }

    public static boolean t(g0 g0Var, Context context, @k.f int i10) {
        androidx.transition.w wVarV;
        if (i10 == 0 || (wVarV = v(context, i10)) == null) {
            return false;
        }
        g0Var.setPathMotion(wVarV);
        return true;
    }

    public static void u(w0 w0Var, @Nullable g0 g0Var) {
        if (g0Var != null) {
            w0Var.K(g0Var);
        }
    }

    @Nullable
    public static androidx.transition.w v(Context context, @k.f int i10) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.type;
        if (i11 != 16) {
            if (i11 == 3) {
                return new y(l0.e(String.valueOf(typedValue.string)));
            }
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
        int i12 = typedValue.data;
        if (i12 == 0) {
            return null;
        }
        if (i12 == 1) {
            return new k();
        }
        throw new IllegalArgumentException("Invalid motion path type: " + i12);
    }

    public static int w(Canvas canvas, Rect rect, int i10) {
        RectF rectF = f143378e;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i10);
    }

    public static void x(Canvas canvas, Rect rect, float f10, float f11, float f12, int i10, oh.a.InterfaceC1115a interfaceC1115a) {
        if (i10 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        if (i10 < 255) {
            w(canvas, rect, i10);
        }
        interfaceC1115a.a(canvas);
        canvas.restoreToCount(iSave);
    }

    public static ni.p y(ni.p pVar, ni.p pVar2, RectF rectF, b bVar) {
        return (k(pVar, rectF) ? pVar : pVar2).v().L(bVar.a(pVar.r(), pVar2.r())).Q(bVar.a(pVar.t(), pVar2.t())).y(bVar.a(pVar.j(), pVar2.j())).D(bVar.a(pVar.l(), pVar2.l())).m();
    }
}
