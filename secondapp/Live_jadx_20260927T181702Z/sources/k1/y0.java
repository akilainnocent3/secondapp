package k1;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.t0(28)
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public class y0 extends x0 {
    public static final String B = "createFromFamiliesWithDefault";
    public static final int C = -1;
    public static final String D = "sans-serif";

    @Override // k1.x0
    public Method B(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // k1.x0, k1.v0, k1.a1
    @NonNull
    public Typeface g(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        return Typeface.create(typeface, i10, z10);
    }

    @Override // k1.x0
    public Typeface p(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f101739m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f101745s.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
