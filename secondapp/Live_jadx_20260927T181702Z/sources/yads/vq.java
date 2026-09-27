package yads;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class vq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f157058a;

    public static IBinder a(Bundle bundle, String str) {
        if (ib3.f150516a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f157058a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f157058a = method2;
                method2.setAccessible(true);
                method = f157058a;
            } catch (NoSuchMethodException e10) {
                ih1.c(eh.e.f80934a, ih1.a("Failed to retrieve getIBinder method", e10));
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            ih1.c(eh.e.f80934a, ih1.a("Failed to invoke getIBinder via reflection", e11));
            return null;
        }
    }
}
