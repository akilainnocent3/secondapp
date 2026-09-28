package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b4h {
    public static del a(Activity activity, FoldingFeature foldingFeature) {
        del.a aVar;
        y5i.b bVar;
        Rect rectA;
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type == 2) {
                aVar = del.a.c;
            }
            return null;
        }
        aVar = del.a.b;
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state == 2) {
                bVar = y5i.b.c;
            }
            return null;
        }
        bVar = y5i.b.b;
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        int i = bounds.left;
        int i2 = bounds.top;
        int i3 = bounds.right;
        int i4 = bounds.bottom;
        d9j0.a.getClass();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            rectA = tc.a(activity);
        } else if (i5 >= 29) {
            String str = d9j0.b;
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rectA = new Rect((Rect) objInvoke);
            } catch (IllegalAccessException e) {
                Log.w(str, e);
                rectA = d9j0.a(activity);
            } catch (NoSuchFieldException e2) {
                Log.w(str, e2);
                rectA = d9j0.a(activity);
            } catch (NoSuchMethodException e3) {
                Log.w(str, e3);
                rectA = d9j0.a(activity);
            } catch (InvocationTargetException e4) {
                Log.w(str, e4);
                rectA = d9j0.a(activity);
            }
        } else if (i5 >= 28) {
            rectA = d9j0.a(activity);
        } else {
            Rect rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i6 = rect.bottom + dimensionPixelSize;
                if (i6 == point.y) {
                    rect.bottom = i6;
                } else {
                    int i7 = rect.right + dimensionPixelSize;
                    if (i7 == point.x) {
                        rect.right = i7;
                    }
                }
            }
            rectA = rect;
        }
        Rect rect2 = new Rect(rectA.left, rectA.top, rectA.right, rectA.bottom);
        int i8 = i4 - i2;
        if (i8 == 0 && i3 - i == 0) {
            return null;
        }
        int i9 = i3 - i;
        if (i9 != rect2.width() && i8 != rect2.height()) {
            return null;
        }
        if (i9 < rect2.width() && i8 < rect2.height()) {
            return null;
        }
        if (i9 == rect2.width() && i8 == rect2.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new del(new q65(bounds2), aVar, bVar);
    }

    public static b9j0 b(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        del delVarA;
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayListA = kw5.a(displayFeatures);
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                foldingFeature.getClass();
                delVarA = a(activity, foldingFeature);
            } else {
                delVarA = null;
            }
            if (delVarA != null) {
                arrayListA.add(delVarA);
            }
        }
        return new b9j0(arrayListA);
    }
}
