package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f19422a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f19423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f19424c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(29)
    public static class a {
        @k.t
        public static int a(ViewGroup viewGroup, int i10) {
            return viewGroup.getChildDrawingOrder(i10);
        }

        @k.t
        public static void b(ViewGroup viewGroup, boolean z10) {
            viewGroup.suppressLayout(z10);
        }
    }

    public static int a(@NonNull ViewGroup viewGroup, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.a(viewGroup, i10);
        }
        if (!f19424c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f19423b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f19424c = true;
        }
        Method method = f19423b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i10))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i10;
    }

    @SuppressLint({"NewApi"})
    public static void b(@NonNull ViewGroup viewGroup, boolean z10) {
        if (f19422a) {
            try {
                a.b(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f19422a = false;
            }
        }
    }

    public static void c(@NonNull ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup, z10);
        } else {
            b(viewGroup, z10);
        }
    }
}
