package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class byg0 {
    public static cyg0 a(cyg0 cyg0Var, String[] strArr, Map<String, cyg0> map) {
        int i = 0;
        if (cyg0Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                cyg0 cyg0Var2 = new cyg0();
                int length = strArr.length;
                while (i < length) {
                    cyg0Var2.a(map.get(strArr[i]));
                    i++;
                }
                return cyg0Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                cyg0Var.a(map.get(strArr[0]));
                return cyg0Var;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    cyg0Var.a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return cyg0Var;
    }
}
