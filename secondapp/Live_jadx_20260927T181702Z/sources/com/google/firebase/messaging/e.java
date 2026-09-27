package com.google.firebase.messaging;

import ae.k;
import ae.m;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Tasks;
import el.j;
import java.util.concurrent.ExecutionException;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f52305a = "Firebase";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52306b = "notification";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52307c = "com.google.firebase.messaging";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52308d = "export_to_big_query";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52309e = "delivery_metrics_exported_to_big_query_enabled";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f52310f = 111881503;

    @h1
    public static void A(String str, Bundle bundle) {
        try {
            sj.h.p();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String strD = d(bundle);
            if (strD != null) {
                bundle2.putString(b.f.f52298r, strD);
            }
            String strE = e(bundle);
            if (strE != null) {
                bundle2.putString(b.f.f52287g, strE);
            }
            String strI = i(bundle);
            if (!TextUtils.isEmpty(strI)) {
                bundle2.putString("label", strI);
            }
            String strG = g(bundle);
            if (!TextUtils.isEmpty(strG)) {
                bundle2.putString(b.f.f52290j, strG);
            }
            String strR = r(bundle);
            if (strR != null) {
                bundle2.putString(b.f.f52285e, strR);
            }
            String strL = l(bundle);
            if (strL != null) {
                try {
                    bundle2.putInt(b.f.f52288h, Integer.parseInt(strL));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String strT = t(bundle);
            if (strT != null) {
                try {
                    bundle2.putInt(b.f.f52289i, Integer.parseInt(strT));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String strN = n(bundle);
            if (b.f.f52293m.equals(str) || b.f.f52296p.equals(str)) {
                bundle2.putString(b.f.f52291k, strN);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            uj.a aVar = (uj.a) sj.h.p().l(uj.a.class);
            if (aVar != null) {
                aVar.a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void B(boolean z10) {
        sj.h.p().n().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean(f52308d, z10).apply();
    }

    public static void C(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString(b.a.f52229g))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        uj.a aVar = (uj.a) sj.h.p().l(uj.a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (aVar == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString(b.a.f52225c);
        aVar.c("fcm", b.f.f52297q, string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", f52305a);
        bundle2.putString("medium", f52306b);
        bundle2.putString("campaign", string);
        aVar.a("fcm", b.f.f52292l, bundle2);
    }

    public static boolean D(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return a();
    }

    public static boolean E(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return F(intent.getExtras());
    }

    public static boolean F(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString(b.a.f52224b));
    }

    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            sj.h.p();
            Context contextN = sj.h.p().n();
            SharedPreferences sharedPreferences = contextN.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(f52308d)) {
                return sharedPreferences.getBoolean(f52308d, false);
            }
            try {
                PackageManager packageManager = contextN.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextN.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(f52309e)) {
                    return applicationInfo.metaData.getBoolean(f52309e, false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static sl.a b(sl.a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        sl.a.C1387a c1387aJ = sl.a.q().p(s(extras)).g(bVar).h(f(extras)).k(o()).n(sl.a.d.ANDROID).j(m(extras));
        String strH = h(extras);
        if (strH != null) {
            c1387aJ.i(strH);
        }
        String strR = r(extras);
        if (strR != null) {
            c1387aJ.o(strR);
        }
        String strC = c(extras);
        if (strC != null) {
            c1387aJ.e(strC);
        }
        String strI = i(extras);
        if (strI != null) {
            c1387aJ.b(strI);
        }
        String strE = e(extras);
        if (strE != null) {
            c1387aJ.f(strE);
        }
        long jQ = q(extras);
        if (jQ > 0) {
            c1387aJ.m(jQ);
        }
        return c1387aJ.a();
    }

    @Nullable
    public static String c(Bundle bundle) {
        return bundle.getString(b.d.f52264e);
    }

    @Nullable
    public static String d(Bundle bundle) {
        return bundle.getString(b.a.f52225c);
    }

    @Nullable
    public static String e(Bundle bundle) {
        return bundle.getString(b.a.f52226d);
    }

    @NonNull
    public static String f(Bundle bundle) {
        String string = bundle.getString(b.d.f52266g);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(j.u(sj.h.p()).getId());
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Nullable
    public static String g(Bundle bundle) {
        return bundle.getString(b.a.f52232j);
    }

    @Nullable
    public static String h(Bundle bundle) {
        String string = bundle.getString(b.d.f52267h);
        return string == null ? bundle.getString(b.d.f52265f) : string;
    }

    @Nullable
    public static String i(Bundle bundle) {
        return bundle.getString(b.a.f52231i);
    }

    @NonNull
    public static int j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public static int k(Bundle bundle) {
        int iP = p(bundle);
        if (iP == 2) {
            return 5;
        }
        return iP == 1 ? 10 : 0;
    }

    @Nullable
    public static String l(Bundle bundle) {
        return bundle.getString(b.a.f52227e);
    }

    @NonNull
    public static sl.a.c m(Bundle bundle) {
        return (bundle == null || !g.v(bundle)) ? sl.a.c.DATA_MESSAGE : sl.a.c.DISPLAY_NOTIFICATION;
    }

    @NonNull
    public static String n(Bundle bundle) {
        return (bundle == null || !g.v(bundle)) ? "data" : "display";
    }

    @NonNull
    public static String o() {
        return sj.h.p().n().getPackageName();
    }

    @NonNull
    public static int p(Bundle bundle) {
        String string = bundle.getString(b.d.f52271l);
        if (string == null) {
            if ("1".equals(bundle.getString(b.d.f52273n))) {
                return 2;
            }
            string = bundle.getString(b.d.f52272m);
        }
        return j(string);
    }

    @Nullable
    public static long q(Bundle bundle) {
        if (bundle.containsKey(b.d.f52276q)) {
            try {
                return Long.parseLong(bundle.getString(b.d.f52276q));
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing project number", e10);
            }
        }
        sj.h hVarP = sj.h.p();
        String strM = hVarP.s().m();
        if (strM != null) {
            try {
                return Long.parseLong(strM);
            } catch (NumberFormatException e11) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e11);
            }
        }
        String strJ = hVarP.s().j();
        if (strJ.startsWith("1:")) {
            String[] strArrSplit = strJ.split(":");
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e12) {
                Log.w("FirebaseMessaging", "error parsing app ID", e12);
            }
        } else {
            try {
                return Long.parseLong(strJ);
            } catch (NumberFormatException e13) {
                Log.w("FirebaseMessaging", "error parsing app ID", e13);
            }
        }
        return 0L;
    }

    @Nullable
    public static String r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    @NonNull
    public static int s(Bundle bundle) {
        Object obj = bundle.get(b.d.f52268i);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    @Nullable
    public static String t(Bundle bundle) {
        if (bundle.containsKey(b.a.f52228f)) {
            return bundle.getString(b.a.f52228f);
        }
        return null;
    }

    public static boolean u(Intent intent) {
        return FirebaseMessagingService.f52167k.equals(intent.getAction());
    }

    public static void v(Intent intent) {
        A(b.f.f52295o, intent.getExtras());
    }

    public static void w(Intent intent) {
        A(b.f.f52296p, intent.getExtras());
    }

    public static void x(Bundle bundle) {
        C(bundle);
        A(b.f.f52294n, bundle);
    }

    public static void y(Intent intent) {
        if (E(intent)) {
            A(b.f.f52293m, intent.getExtras());
        }
        if (D(intent)) {
            z(sl.a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.E());
        }
    }

    public static void z(sl.a.b bVar, Intent intent, @Nullable m mVar) {
        if (mVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        sl.a aVarB = b(bVar, intent);
        if (aVarB == null) {
            return;
        }
        try {
            mVar.a(b.C0478b.f52233a, sl.b.class, ae.e.b("proto"), new k() { // from class: ql.j0
                @Override // ae.k
                public final Object apply(Object obj) {
                    return ((sl.b) obj).e();
                }
            }).b(ae.f.l(sl.b.d().b(aVarB).a(), ae.i.b(Integer.valueOf(intent.getIntExtra(b.d.f52274o, f52310f)))));
        } catch (RuntimeException e10) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e10);
        }
    }
}
