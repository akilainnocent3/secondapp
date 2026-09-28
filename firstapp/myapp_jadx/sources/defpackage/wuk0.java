package defpackage;

import android.os.Bundle;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes4.dex */
public final class wuk0 {
    public static final tcn a = tcn.m("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    public static final c150 b;
    public static final c150 c;
    public static final c150 d;
    public static final c150 e;
    public static final c150 f;

    static {
        pcn.b bVar = pcn.b;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        mby.a(7, objArr);
        b = pcn.i(7, objArr);
        Object[] objArr2 = {StompClient.DEFAULT_ACK, "app", "am"};
        mby.a(3, objArr2);
        c = pcn.i(3, objArr2);
        d = pcn.o("_r", "_dbg");
        pcn.a aVar = new pcn.a();
        aVar.d(obl0.a);
        aVar.d(obl0.b);
        e = aVar.g();
        f = pcn.o("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str) {
        return !c.contains(str);
    }

    public static boolean b(String str, Bundle bundle) {
        if (!b.contains(str)) {
            if (bundle == null) {
                return true;
            }
            c150 c150Var = d;
            int i = c150Var.d;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) c150Var.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!e.contains(str2)) {
            c150 c150Var = f;
            int i = c150Var.d;
            int i2 = 0;
            while (i2 < i) {
                boolean zMatches = str2.matches((String) c150Var.get(i2));
                i2++;
                if (zMatches) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (a(str) && bundle != null) {
            c150 c150Var = d;
            int i = c150Var.d;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) c150Var.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode == 3142703 && str.equals("fiam")) {
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
        }
        return false;
    }
}
