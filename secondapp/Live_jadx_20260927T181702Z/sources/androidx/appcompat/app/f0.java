package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.util.Map;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f6349a = "ResourcesFlusher";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f6350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f6351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class<?> f6352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f6353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f6354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f6355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Field f6356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f6357i;

    public static void a(@NonNull Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        if (i10 >= 24) {
            d(resources);
        } else {
            c(resources);
        }
    }

    @t0(21)
    public static void b(@NonNull Resources resources) {
        Map map;
        if (!f6351c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f6350b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e(f6349a, "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f6351c = true;
        }
        Field field = f6350b;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e(f6349a, "Could not retrieve value from Resources#mDrawableCache", e11);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @t0(23)
    public static void c(@NonNull Resources resources) {
        Object obj;
        if (!f6351c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f6350b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e(f6349a, "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f6351c = true;
        }
        Field field = f6350b;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e(f6349a, "Could not retrieve value from Resources#mDrawableCache", e11);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    @t0(24)
    public static void d(@NonNull Resources resources) {
        Object obj;
        if (!f6357i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f6356h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e(f6349a, "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f6357i = true;
        }
        Field field = f6356h;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e(f6349a, "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f6351c) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f6350b = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e(f6349a, "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f6351c = true;
        }
        Field field2 = f6350b;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e(f6349a, "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    public static void e(@NonNull Object obj) {
        LongSparseArray longSparseArray;
        if (!f6353e) {
            try {
                f6352d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e(f6349a, "Could not find ThemedResourceCache class", e10);
            }
            f6353e = true;
        }
        Class<?> cls = f6352d;
        if (cls == null) {
            return;
        }
        if (!f6355g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f6354f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e(f6349a, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f6355g = true;
        }
        Field field = f6354f;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e(f6349a, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
