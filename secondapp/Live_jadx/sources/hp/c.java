package hp;

import android.view.View;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class c {
    public static void a(WeakReference<View> v10, a clickListener) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("getListenerInfo", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(v10.get(), null);
            Field declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            declaredField.setAccessible(true);
            View.OnTouchListener onTouchListener = (View.OnTouchListener) declaredField.get(objInvoke);
            b bVar = new b(clickListener, onTouchListener);
            if (onTouchListener instanceof b) {
                return;
            }
            declaredField.set(objInvoke, bVar);
        } catch (Throwable unused) {
        }
    }
}
