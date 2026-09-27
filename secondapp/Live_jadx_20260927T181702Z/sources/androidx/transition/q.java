package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.t0(21)
public class q implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f19629c = "GhostViewApi21";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class<?> f19630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f19631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f19632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f19633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Method f19634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f19635i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f19636b;

    public q(@NonNull View view) {
        this.f19636b = view;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static o b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = f19632f;
        if (method != null) {
            try {
                return new q((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
        return null;
    }

    public static void c() {
        if (f19633g) {
            return;
        }
        try {
            d();
            Method declaredMethod = f19630d.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f19632f = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            Log.i(f19629c, "Failed to retrieve addGhost method", e10);
        }
        f19633g = true;
    }

    public static void d() {
        if (f19631e) {
            return;
        }
        try {
            f19630d = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e10) {
            Log.i(f19629c, "Failed to retrieve GhostView class", e10);
        }
        f19631e = true;
    }

    public static void e() {
        if (f19635i) {
            return;
        }
        try {
            d();
            Method declaredMethod = f19630d.getDeclaredMethod("removeGhost", View.class);
            f19634h = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            Log.i(f19629c, "Failed to retrieve removeGhost method", e10);
        }
        f19635i = true;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static void f(View view) {
        e();
        Method method = f19634h;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    @Override // androidx.transition.o
    public void setVisibility(int i10) {
        this.f19636b.setVisibility(i10);
    }

    @Override // androidx.transition.o
    public void a(ViewGroup viewGroup, View view) {
    }
}
