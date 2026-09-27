package vj;

import android.os.Bundle;
import cj.k7;
import cj.v6;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k7 f141213a = k7.H("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.c.f52057g, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v6 f141214b = v6.H("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v6 f141215c = v6.C("auto", "app", "am");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v6 f141216d = v6.B("_r", "_dbg");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v6 f141217e = new v6.a().b(zzjo.zza).b(zzjo.zzb).e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v6 f141218f = v6.B("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f141219g = 0;

    public static boolean a(String str) {
        return !f141215c.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(String str, Bundle bundle) {
        if (f141214b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        v6 v6Var = f141216d;
        int size = v6Var.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) v6Var.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !f141213a.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if (com.google.firebase.messaging.b.f.f52297q.equals(str2)) {
            return str.equals("fcm") || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (f141217e.contains(str2)) {
            return false;
        }
        v6 v6Var = f141218f;
        int size = v6Var.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zMatches = str2.matches((String) v6Var.get(i10));
            i10++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(String str, String str2, Bundle bundle) {
        if (!com.google.firebase.messaging.b.f.f52292l.equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        v6 v6Var = f141216d;
        int size = v6Var.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) v6Var.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            } else if (str.equals("fdl")) {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
        } else if (str.equals("fcm")) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }
}
