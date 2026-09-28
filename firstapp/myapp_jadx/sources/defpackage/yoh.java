package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class yoh {
    public static final Object k = new Object();
    public static final ox0 l = new ox0();
    public final Context a;
    public final String b;
    public final iqh c;
    public final hp8 d;
    public final utr<uoc> g;
    public final n730<zcd> h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z);
    }

    public static class b implements ks1.a {
        public static final AtomicReference<b> a = new AtomicReference<>();

        @Override // ks1.a
        public final void a(boolean z) {
            synchronized (yoh.k) {
                try {
                    ArrayList arrayList = new ArrayList(yoh.l.values());
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        yoh yohVar = (yoh) obj;
                        if (yohVar.e.get()) {
                            Log.d("FirebaseApp", "Notifying background state change listeners.");
                            Iterator it = yohVar.i.iterator();
                            while (it.hasNext()) {
                                ((a) it.next()).a(z);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class c extends BroadcastReceiver {
        public static final AtomicReference<c> b = new AtomicReference<>();
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (yoh.k) {
                try {
                    Iterator it = ((ox0.e) yoh.l.values()).iterator();
                    while (it.hasNext()) {
                        ((yoh) it.next()).e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public yoh(final Context context, String str, iqh iqhVar) {
        ?? arrayList;
        this.a = context;
        hm20.e(str);
        this.b = str;
        this.c = iqhVar;
        sk1 sk1Var = kph.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (final String str3 : arrayList) {
            arrayList2.add(new n730() { // from class: co8
                @Override // defpackage.n730
                public final Object get() {
                    String str4 = str3;
                    try {
                        Class<?> cls = Class.forName(str4);
                        if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                            return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                        }
                        throw new g0p("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                    } catch (ClassNotFoundException unused2) {
                        Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                        return null;
                    } catch (IllegalAccessException e) {
                        throw new g0p(tug.a("Could not instantiate ", str4, "."), e);
                    } catch (InstantiationException e2) {
                        throw new g0p(tug.a("Could not instantiate ", str4, "."), e2);
                    } catch (NoSuchMethodException e3) {
                        throw new g0p(inm.a("Could not instantiate ", str4), e3);
                    } catch (InvocationTargetException e4) {
                        throw new g0p(inm.a("Could not instantiate ", str4), e4);
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        ich0 ich0Var = ich0.a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        arrayList3.add(new n730() { // from class: gp8
            @Override // defpackage.n730
            public final Object get() {
                return firebaseCommonRegistrar;
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        arrayList3.add(new n730() { // from class: gp8
            @Override // defpackage.n730
            public final Object get() {
                return executorsRegistrar;
            }
        });
        arrayList4.add(kn8.c(context, Context.class, new Class[0]));
        arrayList4.add(kn8.c(this, yoh.class, new Class[0]));
        arrayList4.add(kn8.c(iqhVar, iqh.class, new Class[0]));
        lo8 lo8Var = new lo8();
        if (fww.a(context) && kph.b.get()) {
            arrayList4.add(kn8.c(sk1Var, owd0.class, new Class[0]));
        }
        hp8 hp8Var = new hp8(arrayList3, arrayList4, lo8Var);
        this.d = hp8Var;
        Trace.endSection();
        this.g = new utr<>(new n730() { // from class: woh
            @Override // defpackage.n730
            public final Object get() {
                yoh yohVar = this.a;
                return new uoc(context, yohVar.d(), (n830) yohVar.d.a(n830.class));
            }
        });
        this.h = hp8Var.f(zcd.class);
        a aVar = new a() { // from class: xoh
            @Override // yoh.a
            public final void a(boolean z) {
                if (z) {
                    return;
                }
                this.a.h.get().c();
            }
        };
        a();
        if (this.e.get()) {
            ks1.e.a.get();
        }
        this.i.add(aVar);
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yoh c() {
        yoh yohVar;
        synchronized (k) {
            try {
                yohVar = (yoh) l.get("[DEFAULT]");
                if (yohVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + zx20.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                yohVar.h.get().c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return yohVar;
    }

    public static yoh f(Context context, iqh iqhVar) {
        yoh yohVar;
        AtomicReference<b> atomicReference = b.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                do {
                    if (atomicReference2.compareAndSet(null, bVar)) {
                        ks1.b(application);
                        ks1.e.a(bVar);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            ox0 ox0Var = l;
            hm20.j("FirebaseApp name [DEFAULT] already exists!", !ox0Var.containsKey("[DEFAULT]"));
            hm20.i(context, "Application context cannot be null.");
            yohVar = new yoh(context, "[DEFAULT]", iqhVar);
            ox0Var.put("[DEFAULT]", yohVar);
        }
        yohVar.e();
        return yohVar;
    }

    public final void a() {
        hm20.j("FirebaseApp was deleted", !this.f.get());
    }

    public final <T> T b(Class<T> cls) {
        a();
        return (T) this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap map;
        if (!fww.a(this.a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            AtomicReference<c> atomicReference = c.b;
            if (atomicReference.get() == null) {
                c cVar = new c(context);
                while (!atomicReference.compareAndSet(null, cVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        hp8 hp8Var = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference<Boolean> atomicReference2 = hp8Var.f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                this.h.get().c();
            }
        }
        synchronized (hp8Var) {
            map = new HashMap(hp8Var.a);
        }
        hp8Var.h(map, zEquals);
        this.h.get().c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yoh)) {
            return false;
        }
        yoh yohVar = (yoh) obj;
        yohVar.a();
        return this.b.equals(yohVar.b);
    }

    public final boolean g() {
        boolean z;
        a();
        uoc uocVar = this.g.get();
        synchronized (uocVar) {
            z = uocVar.b;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        scy.a aVar = new scy.a(this);
        aVar.a(this.b, "name");
        aVar.a(this.c, "options");
        return aVar.toString();
    }
}
