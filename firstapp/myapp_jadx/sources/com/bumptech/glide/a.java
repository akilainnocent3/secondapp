package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.google.protobuf.Reader;
import defpackage.a0l;
import defpackage.a150;
import defpackage.bmv;
import defpackage.erh0;
import defpackage.gm20;
import defpackage.hb5;
import defpackage.hva;
import defpackage.j4d;
import defpackage.lbd;
import defpackage.n6g;
import defpackage.o4u;
import defpackage.ox0;
import defpackage.oyo;
import defpackage.p4u;
import defpackage.px0;
import defpackage.rzk;
import defpackage.u4u;
import defpackage.ue4;
import defpackage.unu;
import defpackage.ur0;
import defpackage.ve4;
import defpackage.vzk;
import defpackage.wa50;
import defpackage.wzk;
import defpackage.xa50;
import defpackage.ya50;
import defpackage.yzk;
import defpackage.zzk;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a v;
    public static volatile boolean w;
    public final ue4 a;
    public final u4u b;
    public final wzk c;
    public final px0 d;
    public final ya50 e;
    public final hva f;
    public final ArrayList i = new ArrayList();

    public a(Context context, n6g n6gVar, u4u u4uVar, ue4 ue4Var, px0 px0Var, ya50 ya50Var, hva hvaVar, vzk.a aVar, ox0 ox0Var, List list, List list2, ur0 ur0Var, zzk zzkVar) {
        this.a = ue4Var;
        this.d = px0Var;
        this.b = u4uVar;
        this.e = ya50Var;
        this.f = hvaVar;
        this.c = new wzk(context, px0Var, new a150(this, list2, ur0Var), new j4d(), aVar, ox0Var, list, n6gVar, zzkVar);
    }

    public static a a(Context context) {
        if (v == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e) {
                rzk.b("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
                return null;
            } catch (InstantiationException e2) {
                rzk.b("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                rzk.b("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
                return null;
            } catch (InvocationTargetException e4) {
                rzk.b("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
                return null;
            }
            synchronized (a.class) {
                if (v == null) {
                    if (w) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    w = true;
                    try {
                        c(context, generatedAppGlideModule);
                        w = false;
                    } catch (Throwable th) {
                        w = false;
                        throw th;
                    }
                }
            }
        }
        return v;
    }

    public static ya50 b(Context context) {
        gm20.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).e;
    }

    public static void c(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        List list;
        vzk vzkVar = new vzk();
        Context applicationContext = context.getApplicationContext();
        List list2 = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || !(generatedAppGlideModule instanceof GeneratedAppGlideModuleImpl)) {
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(unu.a(str));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + str);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
            } catch (PackageManager.NameNotFoundException e) {
                if (Log.isLoggable("ManifestParser", 6)) {
                    Log.e("ManifestParser", "Failed to parse glide modules", e);
                }
            }
            list = arrayList;
        } else {
            list = list2;
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a0l a0lVar = (a0l) it.next();
                if (hashSet.contains(a0lVar.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + a0lVar);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((a0l) it2.next()).getClass());
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((a0l) it3.next()).getClass();
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, vzkVar);
        }
        if (vzkVar.g == null) {
            yzk.a aVar = new yzk.a();
            if (yzk.b == 0) {
                yzk.b = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i = yzk.b;
            if (TextUtils.isEmpty("source")) {
                hb5.a("Name must be non-null and non-empty, but given: source");
                return;
            }
            vzkVar.g = new yzk(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new yzk.b(aVar, "source", false)));
        }
        if (vzkVar.h == null) {
            yzk.a aVar2 = new yzk.a();
            if (TextUtils.isEmpty("disk-cache")) {
                hb5.a("Name must be non-null and non-empty, but given: disk-cache");
                return;
            }
            vzkVar.h = new yzk(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new yzk.b(aVar2, "disk-cache", true)));
        }
        if (vzkVar.m == null) {
            if (yzk.b == 0) {
                yzk.b = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i2 = yzk.b >= 4 ? 2 : 1;
            yzk.a aVar3 = new yzk.a();
            if (TextUtils.isEmpty("animation")) {
                hb5.a("Name must be non-null and non-empty, but given: animation");
                return;
            }
            vzkVar.m = new yzk(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new yzk.b(aVar3, "animation", true)));
        }
        bmv bmvVar = vzkVar.j;
        if (bmvVar == null) {
            bmv bmvVar2 = new bmv(new bmv.a(applicationContext));
            vzkVar.j = bmvVar2;
            bmvVar = bmvVar2;
        }
        if (vzkVar.k == null) {
            vzkVar.k = new lbd();
        }
        if (vzkVar.d == null) {
            int i3 = bmvVar.a;
            if (i3 > 0) {
                vzkVar.d = new p4u(i3);
            } else {
                vzkVar.d = new ve4();
            }
        }
        if (vzkVar.e == null) {
            vzkVar.e = new o4u(vzkVar.j.c);
        }
        if (vzkVar.f == null) {
            vzkVar.f = new u4u(vzkVar.j.b);
        }
        if (vzkVar.i == null) {
            vzkVar.i = new oyo(applicationContext, 262144000L);
        }
        if (vzkVar.c == null) {
            vzkVar.c = new n6g(vzkVar.f, vzkVar.i, vzkVar.h, vzkVar.g, new yzk(new ThreadPoolExecutor(0, Reader.READ_DONE, 10000L, TimeUnit.MILLISECONDS, new SynchronousQueue(), new yzk.b(new yzk.a(), "source-unlimited", false))), vzkVar.m);
        }
        List<wa50<Object>> list3 = vzkVar.n;
        if (list3 == null) {
            vzkVar.n = Collections.EMPTY_LIST;
        } else {
            vzkVar.n = Collections.unmodifiableList(list3);
        }
        a aVar4 = new a(applicationContext, vzkVar.c, vzkVar.f, vzkVar.d, vzkVar.e, new ya50(), vzkVar.k, vzkVar.l, vzkVar.a, vzkVar.n, list, generatedAppGlideModule, new zzk(vzkVar.b));
        applicationContext.registerComponentCallbacks(aVar4);
        v = aVar4;
    }

    public static xa50 d(Context context) {
        return b(context).c(context);
    }

    public static xa50 e(View view) {
        ya50 ya50VarB = b(view.getContext());
        ya50VarB.getClass();
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return ya50VarB.c(view.getContext().getApplicationContext());
        }
        gm20.c(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = ya50.a(view.getContext());
        if (activityA == null) {
            return ya50VarB.c(view.getContext().getApplicationContext());
        }
        if (!(activityA instanceof e)) {
            return ya50VarB.c(view.getContext().getApplicationContext());
        }
        e eVar = (e) activityA;
        ox0<View, Fragment> ox0Var = ya50VarB.b;
        ox0Var.clear();
        ya50.b(eVar.getSupportFragmentManager().c.f(), ox0Var);
        View viewFindViewById = eVar.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = ox0Var.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        ox0Var.clear();
        return fragment != null ? ya50VarB.d(fragment) : ya50VarB.e(eVar);
    }

    public static xa50 f(e eVar) {
        return b(eVar).e(eVar);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        erh0.a();
        this.b.e(0L);
        this.a.b();
        this.d.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        erh0.a();
        synchronized (this.i) {
            try {
                ArrayList arrayList = this.i;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((xa50) obj).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        u4u u4uVar = this.b;
        u4uVar.getClass();
        if (i >= 40) {
            u4uVar.e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (u4uVar) {
                j = u4uVar.b;
            }
            u4uVar.e(j / 2);
        }
        this.a.a(i);
        this.d.a(i);
    }
}
