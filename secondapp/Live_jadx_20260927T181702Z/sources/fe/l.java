package fe;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@cr.f
public class l implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f83922d = "BackendRegistry";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f83923e = "backend:";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f83924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f83925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, n> f83926c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f83927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, String> f83928b = null;

        public a(Context context) {
            this.f83927a = context;
        }

        public static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(l.f83922d, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w(l.f83922d, "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(l.f83922d, "Application info not found.");
                return null;
            }
        }

        public final Map<String, String> a(Context context) {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                Log.w(l.f83922d, "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith(l.f83923e)) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        @Nullable
        public d b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e10) {
                Log.w(l.f83922d, String.format("Class %s is not found.", str2), e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w(l.f83922d, String.format("Could not instantiate %s.", str2), e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w(l.f83922d, String.format("Could not instantiate %s.", str2), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w(l.f83922d, String.format("Could not instantiate %s", str2), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w(l.f83922d, String.format("Could not instantiate %s", str2), e14);
                return null;
            }
        }

        public final Map<String, String> c() {
            if (this.f83928b == null) {
                this.f83928b = a(this.f83927a);
            }
            return this.f83928b;
        }
    }

    @cr.a
    public l(Context context, j jVar) {
        this(new a(context), jVar);
    }

    @Override // fe.e
    @Nullable
    public synchronized n get(String str) {
        if (this.f83926c.containsKey(str)) {
            return this.f83926c.get(str);
        }
        d dVarB = this.f83924a.b(str);
        if (dVarB == null) {
            return null;
        }
        n nVarCreate = dVarB.create(this.f83925b.a(str));
        this.f83926c.put(str, nVarCreate);
        return nVarCreate;
    }

    public l(a aVar, j jVar) {
        this.f83926c = new HashMap();
        this.f83924a = aVar;
        this.f83925b = jVar;
    }
}
