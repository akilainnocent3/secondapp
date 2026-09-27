package ef;

import af.l;
import androidx.annotation.Nullable;
import eh.t0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f80859e = "onMetaData";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f80860f = "duration";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f80861g = "keyframes";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f80862h = "filepositions";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f80863i = "times";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f80864j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f80865k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f80866l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f80867m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f80868n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f80869o = 9;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f80870p = 10;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f80871q = 11;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f80872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f80873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f80874d;

    public d() {
        super(new l());
        this.f80872b = -9223372036854775807L;
        this.f80873c = new long[0];
        this.f80874d = new long[0];
    }

    public static Boolean h(t0 t0Var) {
        return Boolean.valueOf(t0Var.L() == 1);
    }

    @Nullable
    public static Object i(t0 t0Var, int i10) {
        if (i10 == 0) {
            return k(t0Var);
        }
        if (i10 == 1) {
            return h(t0Var);
        }
        if (i10 == 2) {
            return o(t0Var);
        }
        if (i10 == 3) {
            return m(t0Var);
        }
        if (i10 == 8) {
            return l(t0Var);
        }
        if (i10 == 10) {
            return n(t0Var);
        }
        if (i10 != 11) {
            return null;
        }
        return j(t0Var);
    }

    public static Date j(t0 t0Var) {
        Date date = new Date((long) k(t0Var).doubleValue());
        t0Var.Z(2);
        return date;
    }

    public static Double k(t0 t0Var) {
        return Double.valueOf(Double.longBitsToDouble(t0Var.E()));
    }

    public static HashMap<String, Object> l(t0 t0Var) {
        int iP = t0Var.P();
        HashMap<String, Object> map = new HashMap<>(iP);
        for (int i10 = 0; i10 < iP; i10++) {
            String strO = o(t0Var);
            Object objI = i(t0Var, p(t0Var));
            if (objI != null) {
                map.put(strO, objI);
            }
        }
        return map;
    }

    public static HashMap<String, Object> m(t0 t0Var) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strO = o(t0Var);
            int iP = p(t0Var);
            if (iP == 9) {
                return map;
            }
            Object objI = i(t0Var, iP);
            if (objI != null) {
                map.put(strO, objI);
            }
        }
    }

    public static ArrayList<Object> n(t0 t0Var) {
        int iP = t0Var.P();
        ArrayList<Object> arrayList = new ArrayList<>(iP);
        for (int i10 = 0; i10 < iP; i10++) {
            Object objI = i(t0Var, p(t0Var));
            if (objI != null) {
                arrayList.add(objI);
            }
        }
        return arrayList;
    }

    public static String o(t0 t0Var) {
        int iR = t0Var.R();
        int iF = t0Var.f();
        t0Var.Z(iR);
        return new String(t0Var.e(), iF, iR);
    }

    public static int p(t0 t0Var) {
        return t0Var.L();
    }

    @Override // ef.e
    public boolean b(t0 t0Var) {
        return true;
    }

    @Override // ef.e
    public boolean c(t0 t0Var, long j10) {
        if (p(t0Var) != 2 || !"onMetaData".equals(o(t0Var)) || t0Var.a() == 0 || p(t0Var) != 8) {
            return false;
        }
        HashMap<String, Object> mapL = l(t0Var);
        Object obj = mapL.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f80872b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapL.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f80873c = new long[size];
                this.f80874d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f80873c = new long[0];
                        this.f80874d = new long[0];
                        break;
                    }
                    this.f80873c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f80874d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long e() {
        return this.f80872b;
    }

    public long[] f() {
        return this.f80874d;
    }

    public long[] g() {
        return this.f80873c;
    }

    @Override // ef.e
    public void d() {
    }
}
