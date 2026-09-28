package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class mai0 extends lai0 {
    public static boolean h = true;

    public static class a {
        public static void a(View view, int i) {
            view.setTransitionVisibility(i);
        }
    }

    public void g(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (h) {
                try {
                    a.a(view, i);
                    return;
                } catch (NoSuchMethodError unused) {
                    h = false;
                    return;
                }
            }
            return;
        }
        if (!jai0.c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                jai0.b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            jai0.c = true;
        }
        Field field = jai0.b;
        if (field != null) {
            try {
                jai0.b.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }
}
