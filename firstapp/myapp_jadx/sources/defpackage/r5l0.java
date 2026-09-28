package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r5l0 {
    public static void a(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static void b(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        f9h0.a(str, " operation requires at least ", i, " parameters found ", list.size());
    }

    public static void c(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        f9h0.a(str, " operation requires at most ", i, " parameters found ", arrayList.size());
    }

    public static boolean d(ipk0 ipk0Var) {
        if (ipk0Var == null) {
            return false;
        }
        Double dZzd = ipk0Var.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    public static ktk0 e(String str) {
        ktk0 ktk0Var;
        if (str == null || str.isEmpty()) {
            ktk0Var = null;
        } else {
            ktk0Var = (ktk0) ktk0.A0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (ktk0Var != null) {
            return ktk0Var;
        }
        hb5.a(inm.a("Unsupported commandId ", str));
        return null;
    }

    public static boolean f(ipk0 ipk0Var, ipk0 ipk0Var2) {
        if (!ipk0Var.getClass().equals(ipk0Var2.getClass())) {
            return false;
        }
        if ((ipk0Var instanceof bqk0) || (ipk0Var instanceof apk0)) {
            return true;
        }
        if (ipk0Var instanceof eok0) {
            if (Double.isNaN(ipk0Var.zzd().doubleValue()) || Double.isNaN(ipk0Var2.zzd().doubleValue())) {
                return false;
            }
            return ipk0Var.zzd().equals(ipk0Var2.zzd());
        }
        if (ipk0Var instanceof ypk0) {
            return ipk0Var.zzc().equals(ipk0Var2.zzc());
        }
        if (ipk0Var instanceof unk0) {
            return ipk0Var.zze().equals(ipk0Var2.zze());
        }
        return ipk0Var == ipk0Var2;
    }

    public static int g(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static double h(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    public static Object i(ipk0 ipk0Var) {
        if (ipk0.p.equals(ipk0Var)) {
            return null;
        }
        if (ipk0.o.equals(ipk0Var)) {
            return "";
        }
        if (ipk0Var instanceof vok0) {
            return j((vok0) ipk0Var);
        }
        if (!(ipk0Var instanceof pnk0)) {
            return !ipk0Var.zzd().isNaN() ? ipk0Var.zzd() : ipk0Var.zzc();
        }
        ArrayList arrayList = new ArrayList();
        pnk0 pnk0Var = (pnk0) ipk0Var;
        int i = 0;
        while (i < pnk0Var.j()) {
            if (i >= pnk0Var.j()) {
                ibh0.a(t7l.b(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
                return null;
            }
            int i2 = i + 1;
            Object objI = i(pnk0Var.k(i));
            if (objI != null) {
                arrayList.add(objI);
            }
            i = i2;
        }
        return arrayList;
    }

    public static HashMap j(vok0 vok0Var) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(vok0Var.a.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Object objI = i(vok0Var.b(str));
            if (objI != null) {
                map.put(str, objI);
            }
        }
        return map;
    }

    public static void k(g3l0 g3l0Var) {
        int iG = g(g3l0Var.g("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iG <= 1000000) {
            g3l0Var.e("runtime.counter", new eok0(Double.valueOf(iG)));
        } else {
            ib5.a("Instructions allowed exceeded");
        }
    }
}
