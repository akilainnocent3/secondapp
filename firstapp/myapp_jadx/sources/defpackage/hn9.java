package defpackage;

import com.sporty.android.core.model.config.tax.TaxConfig;
import java.io.EOFException;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class hn9 {
    public static final op8 a = new op8(1548540872, new en9(), false);
    public static final op8 b = new op8(-201938520, new fn9(), false);
    public static final op8 c = new op8(42451319, new gn9(), false);

    @fae
    public static BigDecimal a(List list) {
        BigDecimal bigDecimalMin = BigDecimal.ZERO;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BigDecimal bigDecimalA = ((dt90) it.next()).a();
            bigDecimalMin = bigDecimalMin.compareTo(BigDecimal.ZERO) > 0 ? bigDecimalMin.min(bigDecimalA) : bigDecimalA;
        }
        bigDecimalMin.getClass();
        return bigDecimalMin;
    }

    @fae
    public static BigDecimal b(BigDecimal bigDecimal, List list) {
        BigDecimal bigDecimalMin = BigDecimal.ZERO;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dt90 dt90Var = (dt90) it.next();
            BigDecimal bigDecimalG = b.g(dt90Var.b());
            if (bigDecimalG != null) {
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                if (bigDecimalG.compareTo(bigDecimal2) > 0) {
                    BigDecimal bigDecimalMultiply = bigDecimalG.multiply(dt90Var.a());
                    bigDecimalMin = bigDecimalMin.compareTo(bigDecimal2) > 0 ? bigDecimalMin.min(bigDecimalMultiply) : bigDecimalMultiply;
                }
            }
        }
        BigDecimal bigDecimalMin2 = bigDecimalMin.min(bigDecimal);
        bigDecimalMin2.getClass();
        return bigDecimalMin2;
    }

    @fae
    public static BigDecimal c(List list) {
        BigDecimal bigDecimalMin = BigDecimal.ZERO;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BigDecimal bigDecimalG = b.g(((dt90) it.next()).b());
            if (bigDecimalG != null) {
                BigDecimal bigDecimal = BigDecimal.ZERO;
                if (bigDecimalG.compareTo(bigDecimal) > 0) {
                    bigDecimalMin = bigDecimalMin.compareTo(bigDecimal) > 0 ? bigDecimalMin.min(bigDecimalG) : bigDecimalG;
                }
            }
        }
        bigDecimalMin.getClass();
        return bigDecimalMin;
    }

    public static BigDecimal d(TaxConfig taxConfig, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        taxConfig.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        if (bigDecimal3.compareTo(bigDecimal4) == 0) {
            bigDecimal = bigDecimal2;
        }
        return taxConfig.getTax(bigDecimal3, bigDecimal);
    }

    public static BigDecimal e(BigDecimal bigDecimal, m780 m780Var) {
        String str;
        BigDecimal bigDecimalG;
        bigDecimal.getClass();
        if (m780Var != null && (str = m780Var.a) != null && (bigDecimalG = b.g(str)) != null) {
            BigDecimal bigDecimalSubtract = bigDecimal.compareTo(bigDecimalG) == 1 ? bigDecimal.subtract(bigDecimalG) : BigDecimal.ZERO;
            if (bigDecimalSubtract != null) {
                return bigDecimalSubtract;
            }
        }
        return bigDecimal;
    }

    @fae
    public static BigDecimal f(List list) {
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bigDecimalAdd = bigDecimalAdd.add(((dt90) it.next()).a());
        }
        bigDecimalAdd.getClass();
        return bigDecimalAdd;
    }

    @fae
    public static BigDecimal g(BigDecimal bigDecimal, List list) {
        bigDecimal.getClass();
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dt90 dt90Var = (dt90) it.next();
            BigDecimal bigDecimalG = b.g(dt90Var.b());
            if (bigDecimalG != null && bigDecimalG.compareTo(BigDecimal.ZERO) > 0) {
                bigDecimalAdd = bigDecimalAdd.add(bigDecimalG.multiply(dt90Var.a()));
            }
        }
        BigDecimal bigDecimalMin = bigDecimalAdd.min(bigDecimal);
        bigDecimalMin.getClass();
        return bigDecimalMin;
    }

    @fae
    public static BigDecimal h(List list) {
        list.getClass();
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BigDecimal bigDecimalG = b.g(((dt90) it.next()).b());
            if (bigDecimalG != null && bigDecimalG.compareTo(BigDecimal.ZERO) > 0) {
                bigDecimalAdd = bigDecimalAdd.add(bigDecimalG);
            }
        }
        bigDecimalAdd.getClass();
        return bigDecimalAdd;
    }

    public static BigDecimal i(TaxConfig taxConfig, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        taxConfig.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        return taxConfig.getTax(bigDecimal2, bigDecimal);
    }

    public static final boolean j(lb5 lb5Var) {
        lb5Var.getClass();
        try {
            lb5 lb5Var2 = new lb5();
            long j = lb5Var.b;
            long j2 = 64;
            if (j <= 64) {
                j2 = j;
            }
            lb5Var.l(0L, lb5Var2, j2);
            for (int i = 0; i < 16 && !lb5Var2.N0(); i++) {
                int iZ = lb5Var2.Z();
                if (Character.isISOControl(iZ) && !Character.isWhitespace(iZ)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
        }
    }
}
