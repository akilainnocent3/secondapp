package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class pf {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f75375k = {"getSupportFragmentManager", "getFragmentManager"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib f75377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib f75378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m4 f75379d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f75383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f75384i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f75381f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f75382g = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Cif f75385j = new Cif(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kf f75380e = new kf(this);

    public pf(Context context, ib ibVar, m4 m4Var) {
        this.f75376a = context;
        this.f75377b = ibVar;
        this.f75378c = new ib(new jf(ibVar));
        this.f75379d = m4Var;
    }

    public final boolean a() {
        Boolean boolValueOf = this.f75383h;
        if (boolValueOf == null) {
            this.f75379d.getClass();
            RcdMetadata rcdMetadataR = MetaData.E().R();
            if (rcdMetadataR == null || !rcdMetadataR.c()) {
                rcdMetadataR = null;
            }
            boolValueOf = Boolean.valueOf(rcdMetadataR == null || ((Random) si.f75517d.a()).nextDouble() >= rcdMetadataR.a());
            this.f75383h = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public final void b(Activity activity) {
        this.f75379d.getClass();
        RcdMetadata rcdMetadataR = MetaData.E().R();
        if (rcdMetadataR == null || !rcdMetadataR.c()) {
            rcdMetadataR = null;
        }
        RcdTargets rcdTargetsB = rcdMetadataR != null ? rcdMetadataR.b() : null;
        if (rcdTargetsB == null) {
            return;
        }
        try {
            Collection collectionA = rcdTargetsB.a(8);
            String name = activity.getClass().getName();
            if (collectionA.contains(name)) {
                a(name, 8);
                return;
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
        try {
            a(rcdTargetsB, activity, 16, 32);
        } catch (Throwable th3) {
            d9.a(th3);
        }
        String[] strArr = f75375k;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                Object objInvoke = activity.getClass().getMethod(strArr[i10], null).invoke(activity, null);
                if (objInvoke != null) {
                    Object objInvoke2 = objInvoke.getClass().getMethod("getFragments", null).invoke(objInvoke, null);
                    if (objInvoke2 instanceof Collection) {
                        for (Object obj : (Collection) objInvoke2) {
                            if (obj != null) {
                                a(rcdTargetsB, obj, 64, 128);
                            }
                        }
                    }
                }
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th4) {
                d9.a(th4);
            }
        }
        ((Executor) this.f75378c.a()).execute(this.f75385j);
    }

    public final void c() {
        HashMap map;
        this.f75379d.getClass();
        RcdMetadata rcdMetadataR = MetaData.E().R();
        if (rcdMetadataR == null || !rcdMetadataR.c()) {
            rcdMetadataR = null;
        }
        RcdTargets rcdTargetsB = rcdMetadataR != null ? rcdMetadataR.b() : null;
        if (rcdTargetsB == null) {
            return;
        }
        synchronized (this.f75381f) {
            map = new HashMap(this.f75381f);
        }
        String strA = rcdTargetsB.a(map);
        if (strA.equals(this.f75384i)) {
            return;
        }
        this.f75384i = strA;
        d9 d9Var = new d9(e9.f74721d);
        d9Var.f74675d = "RCD.results";
        d9Var.f74676e = strA;
        d9Var.a();
    }

    public final void a(Activity activity) {
        Window window;
        View decorView;
        if (a()) {
            return;
        }
        String name = activity.getClass().getName();
        WeakHashMap weakHashMap = si.f75514a;
        if (name.startsWith("com.startapp.")) {
            return;
        }
        List arrayList = (List) this.f75382g.get(name);
        if (arrayList == null) {
            arrayList = new ArrayList(2);
            this.f75382g.put(name, arrayList);
            ((Executor) this.f75377b.a()).execute(new lf(this, activity));
        }
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                it.remove();
            } else if (weakReference.get() == activity) {
                z10 = true;
            }
        }
        if (z10 || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        arrayList.add(new WeakReference(activity));
        ((Executor) this.f75377b.a()).execute(new mf(this, activity, decorView));
    }

    public final void b() {
        this.f75379d.getClass();
        RcdMetadata rcdMetadataR = MetaData.E().R();
        if (rcdMetadataR == null || !rcdMetadataR.c()) {
            rcdMetadataR = null;
        }
        RcdTargets rcdTargetsB = rcdMetadataR != null ? rcdMetadataR.b() : null;
        if (rcdTargetsB == null) {
            return;
        }
        for (String str : rcdTargetsB.a(1)) {
            try {
                Class.forName(str, false, pf.class.getClassLoader());
                a(str, 1);
            } catch (ClassNotFoundException unused) {
            } catch (Throwable th2) {
                d9.a(th2);
            }
        }
        try {
            String packageName = this.f75376a.getPackageName();
            PackageInfo packageInfo = this.f75376a.getPackageManager().getPackageInfo(packageName, 15);
            if (packageInfo != null) {
                a(rcdTargetsB, packageName, packageInfo.activities);
                a(rcdTargetsB, packageName, packageInfo.receivers);
                a(rcdTargetsB, packageName, packageInfo.services);
                a(rcdTargetsB, packageName, packageInfo.providers);
            }
        } catch (Throwable th3) {
            d9.a(th3);
        }
        ((Executor) this.f75378c.a()).execute(this.f75385j);
    }

    public final void a(RcdTargets rcdTargets, String str, ComponentInfo[] componentInfoArr) {
        if (componentInfoArr == null) {
            return;
        }
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (componentInfo != null) {
                String str2 = componentInfo.name;
                if (str2.startsWith(androidx.media3.session.fe.F)) {
                    a(rcdTargets, str + str2, 2);
                } else {
                    a(rcdTargets, str2, 2);
                }
            }
        }
    }

    public final void a(int i10) {
        try {
            if (a()) {
                return;
            }
            ((Executor) this.f75377b.a()).execute(new of(this, Thread.currentThread().getStackTrace(), i10));
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }

    public final void a(RcdTargets rcdTargets, View view) {
        if (view == null) {
            return;
        }
        a(rcdTargets, view.getClass().getName(), 4);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                a(rcdTargets, viewGroup.getChildAt(i10));
            }
        }
    }

    public final void a(RcdTargets rcdTargets, Object obj, int i10, int i11) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            String name = superclass.getName();
            if (name.startsWith("android") || name.startsWith("java.")) {
                return;
            }
            for (Field field : superclass.getDeclaredFields()) {
                if (i10 != 0) {
                    a(rcdTargets, field.getType().getName(), i10);
                }
                try {
                    field.setAccessible(true);
                    if (field.get(obj) != null && i11 != 0) {
                        a(rcdTargets, field.getType().getName(), i11);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void a(String str, int i10) {
        synchronized (this.f75381f) {
            try {
                Integer num = (Integer) this.f75381f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f75381f.put(str, Integer.valueOf(i10 | num.intValue()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(RcdTargets rcdTargets, String str, int i10) {
        if (str.startsWith("android") || str.startsWith("java.")) {
            return;
        }
        WeakHashMap weakHashMap = si.f75514a;
        if (str.startsWith("com.startapp.")) {
            return;
        }
        for (String str2 : rcdTargets.a(i10)) {
            if (str2.length() > 0 && str.startsWith(str2)) {
                if (str2.charAt(str2.length() - 1) == '.') {
                    a(str2, i10);
                } else if (str.length() > str2.length()) {
                    if (str.charAt(str2.length()) == '$') {
                        a(str2, i10);
                    }
                } else {
                    a(str2, i10);
                    return;
                }
            }
        }
    }
}
