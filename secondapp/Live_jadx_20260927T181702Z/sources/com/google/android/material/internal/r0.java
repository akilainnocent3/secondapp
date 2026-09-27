package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f51115a = "r0";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {
        @NonNull
        public static Rect a(@NonNull WindowManager windowManager) {
            int i10;
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point pointB = b(defaultDisplay);
            Rect rect = new Rect();
            int i11 = pointB.x;
            if (i11 == 0 || (i10 = pointB.y) == 0) {
                defaultDisplay.getRectSize(rect);
                return rect;
            }
            rect.right = i11;
            rect.bottom = i10;
            return rect;
        }

        public static Point b(Display display) {
            Point point = new Point();
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", Point.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
                return point;
            } catch (IllegalAccessException e10) {
                Log.w(r0.f51115a, e10);
                return point;
            } catch (NoSuchMethodException e11) {
                Log.w(r0.f51115a, e11);
                return point;
            } catch (InvocationTargetException e12) {
                Log.w(r0.f51115a, e12);
                return point;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(api = 17)
    public static class b {
        @NonNull
        public static Rect a(@NonNull WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(api = 30)
    public static class c {
        @NonNull
        public static Rect a(@NonNull WindowManager windowManager) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
    }

    @NonNull
    public static Rect b(@NonNull Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return Build.VERSION.SDK_INT >= 30 ? c.a(windowManager) : b.a(windowManager);
    }
}
