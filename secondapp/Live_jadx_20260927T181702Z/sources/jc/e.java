package jc;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f99781b = "ManifestParser";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f99782c = "GlideModule";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f99783a;

    public e(Context context) {
        this.f99783a = context;
    }

    public static c c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e10) {
                d(cls, e10);
            } catch (InstantiationException e11) {
                d(cls, e11);
            } catch (NoSuchMethodException e12) {
                d(cls, e12);
            } catch (InvocationTargetException e13) {
                d(cls, e13);
            }
            if (objNewInstance instanceof c) {
                return (c) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    public static void d(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    @Nullable
    public final ApplicationInfo a() throws PackageManager.NameNotFoundException {
        return this.f99783a.getPackageManager().getApplicationInfo(this.f99783a.getPackageName(), 128);
    }

    public List<c> b() {
        if (Log.isLoggable(f99781b, 3)) {
            Log.d(f99781b, "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoA = a();
            if (applicationInfoA != null && applicationInfoA.metaData != null) {
                if (Log.isLoggable(f99781b, 2)) {
                    Log.v(f99781b, "Got app info metadata: " + applicationInfoA.metaData);
                }
                for (String str : applicationInfoA.metaData.keySet()) {
                    if (f99782c.equals(applicationInfoA.metaData.get(str))) {
                        arrayList.add(c(str));
                        if (Log.isLoggable(f99781b, 3)) {
                            Log.d(f99781b, "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable(f99781b, 3)) {
                    Log.d(f99781b, "Finished loading Glide modules");
                    return arrayList;
                }
            } else if (Log.isLoggable(f99781b, 3)) {
                Log.d(f99781b, "Got null app info metadata");
                return arrayList;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            if (Log.isLoggable(f99781b, 6)) {
                Log.e(f99781b, "Failed to parse glide modules", e10);
            }
        }
        return arrayList;
    }
}
