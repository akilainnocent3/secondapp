package defpackage;

import androidx.compose.runtime.m;
import com.sportygames.newcms.CMSRes;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class h5h {
    public final b5 a;
    public final t4h b;
    public final ytw<Boolean> c;
    public final ytw<Integer> d;
    public final ytw<Boolean> e;
    public String f;
    public String g;
    public String h;
    public String i;

    public h5h(b5 b5Var, t4h t4hVar) {
        b5Var.getClass();
        t4hVar.getClass();
        this.a = b5Var;
        this.b = t4hVar;
        Boolean bool = Boolean.FALSE;
        this.c = m.b(bool);
        this.d = m.b(-1);
        this.e = m.b(bool);
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        TreeMap treeMap = new TreeMap();
        treeMap.put(1000L, "K");
        treeMap.put(1000000L, "M");
        treeMap.put(1000000000L, "G");
        treeMap.put(1000000000000L, "T");
        treeMap.put(1000000000000000L, "P");
        treeMap.put(1000000000000000000L, "E");
    }

    public static Map a(int i, float f) {
        Float fValueOf = Float.valueOf(0.02f);
        Float fValueOf2 = Float.valueOf(0.0175f);
        Float fValueOf3 = Float.valueOf(0.021f);
        Float fValueOf4 = Float.valueOf(0.016f);
        Float fValueOf5 = Float.valueOf(0.015f);
        return ((float) i) / f > 2.0f ? kpu.f(new Pair("errorText", fValueOf5), new Pair("availableText", fValueOf4), new Pair("currency", fValueOf3), new Pair("giftAmount", Float.valueOf(0.045f)), new Pair("offOrLeftText", Float.valueOf(0.032f)), new Pair("fbgText", Float.valueOf(0.025f)), new Pair("expiryText", fValueOf2), new Pair("stakeText", fValueOf5), new Pair("metaDataText", fValueOf), new Pair("placeholder", fValueOf3)) : kpu.f(new Pair("errorText", Float.valueOf(0.014f)), new Pair("availableText", fValueOf4), new Pair("currency", Float.valueOf(0.024f)), new Pair("giftAmount", Float.valueOf(0.05f)), new Pair("offOrLeftText", Float.valueOf(0.03f)), new Pair("fbgText", Float.valueOf(0.028f)), new Pair("expiryText", fValueOf2), new Pair("stakeText", Float.valueOf(0.019f)), new Pair("metaDataText", fValueOf), new Pair("placeholder", Float.valueOf(0.022f)));
    }

    public static CMSRes d(String str) {
        str.getClass();
        try {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("brl")) {
                return r4h.s.r;
            }
            if (lowerCase.equals("zar")) {
                return r4h.s.q;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final String b(Object obj) {
        double dDoubleValue;
        if (obj instanceof String) {
            Double dH = b.h((String) obj);
            if (dH != null) {
                dDoubleValue = dH.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
        } else if (obj instanceof Number) {
            dDoubleValue = ((Number) obj).doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        if (dDoubleValue == 0.0d) {
            return "";
        }
        return String.format(this.a.getLocale(), "%,.2f", Arrays.copyOf(new Object[]{new BigDecimal(dDoubleValue).setScale(2, RoundingMode.HALF_EVEN)}, 1));
    }

    public final String c(CMSRes cMSRes, String str, String... strArr) {
        Object bVar;
        cMSRes.getClass();
        str.getClass();
        String strB = ((com.sportygames.newcms.b) this.b.b.getValue()).b(cMSRes, str);
        try {
            zi50.a aVar = zi50.b;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            bVar = String.format(strB, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            bVar = ay0.G(strArr, " ", null, null, null, 62);
        }
        return (String) bVar;
    }

    public final void e(boolean z) {
        ((x5a0) this.c).setValue(Boolean.valueOf(z));
    }

    public final void f(int i) {
        ((x5a0) this.d).setValue(Integer.valueOf(i));
    }

    public final void g(boolean z) {
        ((x5a0) this.e).setValue(Boolean.valueOf(z));
    }
}
