package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f19546b = "ViewUtilsApi19";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f19547c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f19548d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f19549e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f19550f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f19551g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f19552h = 12;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f19553a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(29)
    public static class a {
        @k.t
        public static float a(View view) {
            return view.getTransitionAlpha();
        }

        @k.t
        public static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    public final void b() {
        if (f19549e) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f19548d = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            Log.i(f19546b, "Failed to retrieve setFrame method", e10);
        }
        f19549e = true;
    }

    @SuppressLint({"NewApi"})
    public float c(@NonNull View view) {
        if (f19547c) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f19547c = false;
            }
        }
        return view.getAlpha();
    }

    public void e(@NonNull View view, @Nullable Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f19553a;
        if (fArr == null) {
            fArr = new float[9];
            this.f19553a = fArr;
        }
        matrix.getValues(fArr);
        float f10 = fArr[3];
        float fSqrt = ((float) Math.sqrt(1.0f - (f10 * f10))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f10, fSqrt));
        float f11 = fArr[0] / fSqrt;
        float f12 = fArr[4] / fSqrt;
        float f13 = fArr[2];
        float f14 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f13);
        view.setTranslationY(f14);
        view.setRotation(degrees);
        view.setScaleX(f11);
        view.setScaleY(f12);
    }

    @SuppressLint({"BanUncheckedReflection"})
    public void f(@NonNull View view, int i10, int i11, int i12, int i13) {
        b();
        Method method = f19548d;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void g(@NonNull View view, float f10) {
        if (f19547c) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f19547c = false;
            }
        }
        view.setAlpha(f10);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void h(@NonNull View view, int i10) {
        if (!f19551g) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f19550f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(f19546b, "fetchViewFlagsField: ");
            }
            f19551g = true;
        }
        Field field = f19550f;
        if (field != null) {
            try {
                f19550f.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void i(@NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            i(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void j(@NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            j(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }

    public void a(@NonNull View view) {
    }

    public void d(@NonNull View view) {
    }
}
