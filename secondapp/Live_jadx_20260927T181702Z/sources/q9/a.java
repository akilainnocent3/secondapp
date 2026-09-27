package q9;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f122039d = "Startup";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile a f122040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f122041f = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Context f122044c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Set<Class<? extends b<?>>> f122043b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Map<Class<?>, Object> f122042a = new HashMap();

    public a(@NonNull Context context) {
        this.f122044c = context.getApplicationContext();
    }

    @NonNull
    public static a e(@NonNull Context context) {
        if (f122040e == null) {
            synchronized (f122041f) {
                try {
                    if (f122040e == null) {
                        f122040e = new a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f122040e;
    }

    public static void h(@NonNull a aVar) {
        synchronized (f122041f) {
            f122040e = aVar;
        }
    }

    public void a(@Nullable Bundle bundle) {
        String string = this.f122044c.getString(c.a.f122045a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f122043b.add((Class<? extends b<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends b<?>>> it = this.f122043b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new d(e10);
            }
        }
    }

    public void b(@NonNull Class<? extends InitializationProvider> cls) {
        try {
            try {
                s9.c.c(f122039d);
                a(this.f122044c.getPackageManager().getProviderInfo(new ComponentName(this.f122044c, cls), 128).metaData);
                s9.c.f();
            } catch (PackageManager.NameNotFoundException e10) {
                throw new d(e10);
            }
        } catch (Throwable th2) {
            s9.c.f();
            throw th2;
        }
    }

    @NonNull
    public <T> T c(@NonNull Class<? extends b<?>> cls) {
        T t10;
        synchronized (f122041f) {
            try {
                t10 = (T) this.f122042a.get(cls);
                if (t10 == null) {
                    t10 = (T) d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    @NonNull
    public final <T> T d(@NonNull Class<? extends b<?>> cls, @NonNull Set<Class<?>> set) {
        T t10;
        if (s9.c.h()) {
            try {
                s9.c.c(cls.getSimpleName());
            } catch (Throwable th2) {
                s9.c.f();
                throw th2;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f122042a.containsKey(cls)) {
            t10 = (T) this.f122042a.get(cls);
        } else {
            set.add(cls);
            try {
                b<?> bVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends b<?>>> listDependencies = bVarNewInstance.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : listDependencies) {
                        if (!this.f122042a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t10 = (T) bVarNewInstance.create(this.f122044c);
                set.remove(cls);
                this.f122042a.put(cls, t10);
            } catch (Throwable th3) {
                throw new d(th3);
            }
        }
        s9.c.f();
        return t10;
    }

    @NonNull
    public <T> T f(@NonNull Class<? extends b<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(@NonNull Class<? extends b<?>> cls) {
        return this.f122043b.contains(cls);
    }
}
