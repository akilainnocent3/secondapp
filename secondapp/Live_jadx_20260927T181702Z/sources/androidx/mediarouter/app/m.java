package androidx.mediarouter.app;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ProgressBar;
import k1.b0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f17981a = 3.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17982b = -570425344;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17983c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f17984d = q7.a.c.f121789o;

    public static Context a(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, l(context));
        int iQ = q(contextThemeWrapper, q7.a.C1175a.f121771q);
        return iQ != 0 ? new ContextThemeWrapper(contextThemeWrapper, iQ) : contextThemeWrapper;
    }

    public static Context b(Context context, int i10, boolean z10) {
        if (i10 == 0) {
            i10 = q(context, !z10 ? m.a.b.Z0 : m.a.b.N);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        return q(contextThemeWrapper, q7.a.C1175a.f121771q) != 0 ? new ContextThemeWrapper(contextThemeWrapper, l(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static int c(Context context) {
        int iQ = q(context, q7.a.C1175a.f121771q);
        return iQ == 0 ? l(context) : iQ;
    }

    public static int d(Context context) {
        int iP = p(context, 0, m.a.b.J0);
        return b0.m(iP, p(context, 0, R.attr.colorBackground)) < 3.0d ? p(context, 0, m.a.b.C0) : iP;
    }

    public static Drawable e(Context context) {
        return j(context, q7.a.e.J2);
    }

    public static int f(Context context, int i10) {
        if (b0.m(-1, p(context, i10, m.a.b.J0)) >= 3.0d) {
            return -1;
        }
        return f17982b;
    }

    public static Drawable g(Context context) {
        return i(context, q7.a.C1175a.f121763i);
    }

    public static float h(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable i(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        Drawable drawableR = l1.d.r(n.a.b(context, typedArrayObtainStyledAttributes.getResourceId(0, 0)));
        if (s(context)) {
            l1.d.n(drawableR, f1.d.getColor(context, f17984d));
        }
        typedArrayObtainStyledAttributes.recycle();
        return drawableR;
    }

    public static Drawable j(Context context, int i10) {
        Drawable drawableR = l1.d.r(n.a.b(context, i10));
        if (s(context)) {
            l1.d.n(drawableR, f1.d.getColor(context, f17984d));
        }
        return drawableR;
    }

    public static Drawable k(Context context) {
        return j(context, q7.a.e.L2);
    }

    public static int l(Context context) {
        if (s(context)) {
            return f(context, 0) == -570425344 ? q7.a.k.f122017m : q7.a.k.f122019o;
        }
        return f(context, 0) == -570425344 ? q7.a.k.f122018n : q7.a.k.f122016l;
    }

    public static Drawable m(Context context) {
        return i(context, q7.a.C1175a.f121769o);
    }

    public static Drawable n(Context context) {
        return i(context, q7.a.C1175a.f121768n);
    }

    public static TypedArray o(Context context) {
        return context.obtainStyledAttributes(new int[]{q7.a.C1175a.f121763i, q7.a.C1175a.f121772r, q7.a.C1175a.f121769o, q7.a.C1175a.f121768n});
    }

    public static int p(Context context, int i10, int i11) {
        if (i10 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int q(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static Drawable r(Context context) {
        return i(context, q7.a.C1175a.f121772r);
    }

    public static boolean s(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(m.a.b.N1, typedValue, true) && typedValue.data != 0;
    }

    public static void t(Context context, Dialog dialog) {
        dialog.getWindow().getDecorView().setBackgroundColor(f1.d.getColor(context, s(context) ? q7.a.c.f121785k : q7.a.c.f121784j));
    }

    public static void u(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(f1.d.getColor(context, s(context) ? q7.a.c.f121781g : q7.a.c.f121780f), PorterDuff.Mode.SRC_IN);
        }
    }

    public static void v(Context context, View view, View view2, boolean z10) {
        int iP = p(context, 0, m.a.b.J0);
        int iP2 = p(context, 0, m.a.b.K0);
        if (z10 && f(context, 0) == -570425344) {
            iP2 = iP;
            iP = -1;
        }
        view.setBackgroundColor(iP);
        view2.setBackgroundColor(iP2);
        view.setTag(Integer.valueOf(iP));
        view2.setTag(Integer.valueOf(iP2));
    }

    public static void w(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int color;
        int color2;
        if (s(context)) {
            color = f1.d.getColor(context, q7.a.c.f121781g);
            color2 = f1.d.getColor(context, q7.a.c.f121779e);
        } else {
            color = f1.d.getColor(context, q7.a.c.f121780f);
            color2 = f1.d.getColor(context, q7.a.c.f121778d);
        }
        mediaRouteVolumeSlider.b(color, color2);
    }

    public static void x(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int iF = f(context, 0);
        if (Color.alpha(iF) != 255) {
            iF = b0.v(iF, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(iF);
    }
}
