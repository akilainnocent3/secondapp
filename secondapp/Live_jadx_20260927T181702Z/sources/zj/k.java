package zj;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class k<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f161946c = "ComponentDiscovery";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f161947d = "com.google.firebase.components.ComponentRegistrar";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f161948e = "com.google.firebase.components:";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f161949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<T> f161950b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements c<Context> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends Service> f161951a;

        public final Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(k.f161946c, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f161951a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w(k.f161946c, this.f161951a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(k.f161946c, "Application info not found.");
                return null;
            }
        }

        @Override // zj.k.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a(Context context) {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                Log.w(k.f161946c, "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if (k.f161947d.equals(bundleB.get(str)) && str.startsWith(k.f161948e)) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public b(Class<? extends Service> cls) {
            this.f161951a = cls;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h1
    public interface c<T> {
        List<String> a(T t10);
    }

    @h1
    public k(T t10, c<T> cVar) {
        this.f161949a = t10;
        this.f161950b = cVar;
    }

    public static k<Context> d(Context context, Class<? extends Service> cls) {
        return new k<>(context, new b(cls));
    }

    @Nullable
    public static ComponentRegistrar e(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new b0(String.format("Class %s is not an instance of %s", str, f161947d));
        } catch (ClassNotFoundException unused) {
            Log.w(f161946c, String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e10) {
            throw new b0(String.format("Could not instantiate %s.", str), e10);
        } catch (InstantiationException e11) {
            throw new b0(String.format("Could not instantiate %s.", str), e11);
        } catch (NoSuchMethodException e12) {
            throw new b0(String.format("Could not instantiate %s", str), e12);
        } catch (InvocationTargetException e13) {
            throw new b0(String.format("Could not instantiate %s", str), e13);
        }
    }

    @Deprecated
    public List<ComponentRegistrar> b() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f161950b.a(this.f161949a).iterator();
        while (it.hasNext()) {
            try {
                ComponentRegistrar componentRegistrarE = e(it.next());
                if (componentRegistrarE != null) {
                    arrayList.add(componentRegistrarE);
                }
            } catch (b0 e10) {
                Log.w(f161946c, "Invalid component registrar.", e10);
            }
        }
        return arrayList;
    }

    public List<dl.b<ComponentRegistrar>> c() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f161950b.a(this.f161949a)) {
            arrayList.add(new dl.b() { // from class: zj.j
                @Override // dl.b
                public final Object get() {
                    return k.e(str);
                }
            });
        }
        return arrayList;
    }
}
