package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class uo70 extends f4f0 {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable a(int i, nsz nszVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(nszVar.q()));
        }
        if (i == 1) {
            return Boolean.valueOf(nszVar.w() == 1);
        }
        if (i == 2) {
            return c(nszVar);
        }
        if (i != 3) {
            if (i == 8) {
                return b(nszVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(nszVar.q()));
                nszVar.J(2);
                return date;
            }
            int iA = nszVar.A();
            ArrayList arrayList = new ArrayList(iA);
            for (int i2 = 0; i2 < iA; i2++) {
                Serializable serializableA = a(nszVar.w(), nszVar);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strC = c(nszVar);
            int iW = nszVar.w();
            if (iW == 9) {
                return map;
            }
            Serializable serializableA2 = a(iW, nszVar);
            if (serializableA2 != null) {
                map.put(strC, serializableA2);
            }
        }
    }

    public static HashMap<String, Object> b(nsz nszVar) {
        int iA = nszVar.A();
        HashMap<String, Object> map = new HashMap<>(iA);
        for (int i = 0; i < iA; i++) {
            String strC = c(nszVar);
            Serializable serializableA = a(nszVar.w(), nszVar);
            if (serializableA != null) {
                map.put(strC, serializableA);
            }
        }
        return map;
    }

    public static String c(nsz nszVar) {
        int iC = nszVar.C();
        int i = nszVar.b;
        nszVar.J(iC);
        return new String(nszVar.a, i, iC);
    }
}
