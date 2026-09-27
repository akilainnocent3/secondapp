package com.startapp.sdk.adsbase;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.rf;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.sg;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.tg;
import com.startapp.sdk.internal.ug;
import com.startapp.sdk.internal.vg;
import com.startapp.sdk.internal.w0;
import com.startapp.simple.bloomfilter.api.BloomFilterCreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f74337a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List f74338b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f74339c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Pair f74340d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Pair f74341e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f74342f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f74343g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static SimpleTokenUtils$TokenType f74344h = SimpleTokenUtils$TokenType.UNDEFINED;

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair a() {
        return f74340d != null ? new Pair(((SimpleTokenUtils$TokenType) f74340d.first).toString(), (String) f74340d.second) : new Pair(SimpleTokenUtils$TokenType.T1.toString(), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair b() {
        return f74341e != null ? new Pair(((SimpleTokenUtils$TokenType) f74341e.first).toString(), (String) f74341e.second) : new Pair(SimpleTokenUtils$TokenType.T2.toString(), "");
    }

    public static void c(Context context) {
        Context contextA = w0.a(context);
        if (contextA != null) {
            context = contextA;
        }
        f(context);
        f74342f = true;
        f74343g = false;
        f74344h = SimpleTokenUtils$TokenType.UNDEFINED;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        context.registerReceiver(new sg(), intentFilter);
        MetaData.E().a(new tg(context));
    }

    public static void d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Set setD = MetaData.E().D();
        Set setP = MetaData.E().P();
        f74337a = new CopyOnWriteArrayList();
        f74338b = new CopyOnWriteArrayList();
        try {
            int i10 = p0.f75355a;
            List<PackageInfo> list = (List) packageManager.getClass().getMethod(new String(new byte[]{103, 101, 116, 73, 110, 115, 116, 97, 108, 108, 101, f6.q.f83619w, 80, 97, 99, 107, 97, 103, 101, 115}), Integer.TYPE).invoke(packageManager, 8192);
            f74339c = System.currentTimeMillis();
            PackageInfo packageInfo = null;
            for (PackageInfo packageInfo2 : list) {
                int i11 = packageInfo2.applicationInfo.flags;
                if ((i11 & 1) == 0 && (i11 & 128) == 0) {
                    long j10 = packageInfo2.firstInstallTime;
                    if (j10 < f74339c && j10 >= 1291593600000L) {
                        f74339c = j10;
                    }
                    f74337a.add(packageInfo2);
                    try {
                        String strB = si.b(context);
                        if (setD != null && setD.contains(strB)) {
                            f74338b.add(packageInfo2);
                        }
                    } catch (Throwable th2) {
                        d9.a(th2);
                    }
                } else if (setP.contains(packageInfo2.packageName)) {
                    f74337a.add(packageInfo2);
                } else if (packageInfo2.packageName.equals(h6.f74943a)) {
                    packageInfo = packageInfo2;
                }
            }
            List listSubList = f74337a;
            if (listSubList.size() > 100) {
                ArrayList arrayList = new ArrayList(listSubList);
                Collections.sort(arrayList, new vg());
                listSubList = arrayList.subList(0, 100);
            }
            f74337a = listSubList;
            List listSubList2 = f74338b;
            if (listSubList2.size() > 100) {
                ArrayList arrayList2 = new ArrayList(listSubList2);
                Collections.sort(arrayList2, new vg());
                listSubList2 = arrayList2.subList(0, 100);
            }
            f74338b = listSubList2;
            if (packageInfo != null) {
                f74337a.add(0, packageInfo);
            }
        } catch (Throwable th3) {
            if (si.a(th3, RemoteException.class)) {
                return;
            }
            d9.a(th3);
        }
    }

    public static void e(Context context) {
        boolean zA = MetaData.E().W().a(context);
        synchronized (g.class) {
            if ((f74340d == null || f74341e == null) && zA) {
                try {
                    d(context);
                    SimpleTokenUtils$TokenType simpleTokenUtils$TokenType = SimpleTokenUtils$TokenType.T1;
                    List list = f74337a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PackageInfo) it.next()).packageName);
                    }
                    f74340d = new Pair(simpleTokenUtils$TokenType, new BloomFilterCreator().fromKeys(arrayList));
                    SimpleTokenUtils$TokenType simpleTokenUtils$TokenType2 = SimpleTokenUtils$TokenType.T2;
                    List list2 = f74338b;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PackageInfo) it2.next()).packageName);
                    }
                    f74341e = new Pair(simpleTokenUtils$TokenType2, new BloomFilterCreator().fromKeys(arrayList2));
                } catch (Throwable th2) {
                    d9.a(th2);
                }
            }
        }
    }

    public static void f(Context context) {
        Context contextA = w0.a(context);
        if (contextA != null) {
            context = contextA;
        }
        try {
            if ((f74340d == null || f74341e == null) && MetaData.E().W().a(context)) {
                ((Executor) com.startapp.sdk.components.a.a(context).D.a()).execute(new ug(context));
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair a(Context context) {
        if (f74340d == null) {
            e(context);
        }
        rf rfVarEdit = ((sf) com.startapp.sdk.components.a.a(context).G.a()).edit();
        String str = (String) f74340d.second;
        rfVarEdit.a("shared_prefs_simple_token", str);
        rfVarEdit.f75462a.putString("shared_prefs_simple_token", str);
        rfVarEdit.apply();
        f74342f = false;
        f74344h = SimpleTokenUtils$TokenType.UNDEFINED;
        return new Pair(SimpleTokenUtils$TokenType.T1, (String) f74340d.second);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair b(Context context) {
        if (f74341e == null) {
            e(context);
        }
        rf rfVarEdit = ((sf) com.startapp.sdk.components.a.a(context).G.a()).edit();
        String str = (String) f74341e.second;
        rfVarEdit.a("shared_prefs_simple_token2", str);
        rfVarEdit.f75462a.putString("shared_prefs_simple_token2", str);
        rfVarEdit.apply();
        f74342f = false;
        f74344h = SimpleTokenUtils$TokenType.UNDEFINED;
        return new Pair(SimpleTokenUtils$TokenType.T2, (String) f74341e.second);
    }
}
