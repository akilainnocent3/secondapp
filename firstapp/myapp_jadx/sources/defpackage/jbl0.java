package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class jbl0 {
    public static final jbl0 c = new jbl0(100);
    public final EnumMap a;
    public final int b;

    public jbl0(int i) {
        EnumMap enumMap = new EnumMap(hbl0.class);
        this.a = enumMap;
        hbl0 hbl0Var = hbl0.AD_STORAGE;
        dbl0 dbl0Var = dbl0.UNINITIALIZED;
        enumMap.put(hbl0Var, dbl0Var);
        enumMap.put(hbl0.ANALYTICS_STORAGE, dbl0Var);
        this.b = i;
    }

    public static String a(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static jbl0 b(int i, Bundle bundle) {
        if (bundle == null) {
            return new jbl0(i);
        }
        EnumMap enumMap = new EnumMap(hbl0.class);
        for (hbl0 hbl0Var : fbl0.STORAGE.a) {
            enumMap.put(hbl0Var, d(bundle.getString(hbl0Var.a)));
        }
        return new jbl0(enumMap, i);
    }

    public static jbl0 c(int i, String str) {
        EnumMap enumMap = new EnumMap(hbl0.class);
        hbl0[] hbl0VarArr = fbl0.STORAGE.a;
        for (int i2 = 0; i2 < hbl0VarArr.length; i2++) {
            String str2 = str == null ? "" : str;
            hbl0 hbl0Var = hbl0VarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(hbl0Var, e(str2.charAt(i3)));
            } else {
                enumMap.put(hbl0Var, dbl0.UNINITIALIZED);
            }
        }
        return new jbl0(enumMap, i);
    }

    public static dbl0 d(String str) {
        dbl0 dbl0Var = dbl0.UNINITIALIZED;
        if (str == null) {
            return dbl0Var;
        }
        if (str.equals("granted")) {
            return dbl0.GRANTED;
        }
        return str.equals("denied") ? dbl0.DENIED : dbl0Var;
    }

    public static dbl0 e(char c2) {
        if (c2 == '+') {
            return dbl0.POLICY;
        }
        if (c2 != '0') {
            return c2 != '1' ? dbl0.UNINITIALIZED : dbl0.GRANTED;
        }
        return dbl0.DENIED;
    }

    public static char h(dbl0 dbl0Var) {
        if (dbl0Var == null) {
            return '-';
        }
        int iOrdinal = dbl0Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jbl0) {
            jbl0 jbl0Var = (jbl0) obj;
            for (hbl0 hbl0Var : fbl0.STORAGE.a) {
                if (this.a.get(hbl0Var) == jbl0Var.a.get(hbl0Var)) {
                }
            }
            if (this.b == jbl0Var.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public final String f() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (hbl0 hbl0Var : fbl0.STORAGE.a) {
            dbl0 dbl0Var = (dbl0) this.a.get(hbl0Var);
            char c2 = '-';
            if (dbl0Var != null && (iOrdinal = dbl0Var.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c2 = '1';
                } else if (iOrdinal == 2) {
                    c2 = '0';
                } else if (iOrdinal == 3) {
                    c2 = '1';
                }
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (hbl0 hbl0Var : fbl0.STORAGE.a) {
            sb.append(h((dbl0) this.a.get(hbl0Var)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int iHashCode = this.b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((dbl0) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(hbl0 hbl0Var) {
        return ((dbl0) this.a.get(hbl0Var)) != dbl0.DENIED;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public final jbl0 j(jbl0 jbl0Var) {
        EnumMap enumMap = new EnumMap(hbl0.class);
        for (hbl0 hbl0Var : fbl0.STORAGE.a) {
            dbl0 dbl0Var = (dbl0) this.a.get(hbl0Var);
            dbl0 dbl0Var2 = (dbl0) jbl0Var.a.get(hbl0Var);
            if (dbl0Var == null) {
                dbl0Var = dbl0Var2;
            } else if (dbl0Var2 != null) {
                dbl0 dbl0Var3 = dbl0.UNINITIALIZED;
                if (dbl0Var == dbl0Var3) {
                    dbl0Var = dbl0Var2;
                } else if (dbl0Var2 != dbl0Var3) {
                    dbl0 dbl0Var4 = dbl0.POLICY;
                    if (dbl0Var == dbl0Var4) {
                        dbl0Var = dbl0Var2;
                    } else if (dbl0Var2 != dbl0Var4) {
                        dbl0 dbl0Var5 = dbl0.DENIED;
                        dbl0Var = (dbl0Var == dbl0Var5 || dbl0Var2 == dbl0Var5) ? dbl0Var5 : dbl0.GRANTED;
                    }
                }
            }
            if (dbl0Var != null) {
                enumMap.put(hbl0Var, dbl0Var);
            }
        }
        return new jbl0(enumMap, 100);
    }

    public final jbl0 k(jbl0 jbl0Var) {
        EnumMap enumMap = new EnumMap(hbl0.class);
        for (hbl0 hbl0Var : fbl0.STORAGE.a) {
            dbl0 dbl0Var = (dbl0) this.a.get(hbl0Var);
            if (dbl0Var == dbl0.UNINITIALIZED) {
                dbl0Var = (dbl0) jbl0Var.a.get(hbl0Var);
            }
            if (dbl0Var != null) {
                enumMap.put(hbl0Var, dbl0Var);
            }
        }
        return new jbl0(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (hbl0 hbl0Var : fbl0.STORAGE.a) {
            sb.append(",");
            sb.append(hbl0Var.a);
            sb.append("=");
            dbl0 dbl0Var = (dbl0) this.a.get(hbl0Var);
            if (dbl0Var == null) {
                dbl0Var = dbl0.UNINITIALIZED;
            }
            sb.append(dbl0Var);
        }
        return sb.toString();
    }

    public jbl0(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(hbl0.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
