package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class k18 {
    public static final Map<Double, Integer> a = kpu.f(new Pair(Double.valueOf(1.19d), Integer.valueOf(R.color.sh_chip1)), new Pair(Double.valueOf(1.79d), Integer.valueOf(R.color.sh_chip2)), new Pair(Double.valueOf(3.59d), Integer.valueOf(R.color.sh_chip3)), new Pair(Double.valueOf(7.19d), Integer.valueOf(R.color.sh_chip4)), new Pair(Double.valueOf(14.39d), Integer.valueOf(R.color.sh_chip5)), new Pair(Double.valueOf(28.79d), Integer.valueOf(R.color.sh_chip6)), new Pair(Double.valueOf(28.81d), Integer.valueOf(R.color.sh_chip7)));

    public static int a(double d) {
        Double dValueOf = Double.valueOf(1.19d);
        Map<Double, Integer> map = a;
        map.get(dValueOf);
        int iIntValue = R.color.sh_chip7;
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = 0.0d;
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            if (entry.getKey().doubleValue() >= d) {
                if (entry.getKey().doubleValue() <= d) {
                    return entry.getValue().intValue();
                }
                if (dDoubleValue2 == 0.0d) {
                    dDoubleValue2 = entry.getKey().doubleValue();
                    iIntValue = entry.getValue().intValue();
                } else if (entry.getKey().doubleValue() < dDoubleValue2) {
                    dDoubleValue2 = entry.getKey().doubleValue();
                    iIntValue = entry.getValue().intValue();
                }
            } else if (dDoubleValue == 0.0d) {
                dDoubleValue = entry.getKey().doubleValue();
            } else if (entry.getKey().doubleValue() > dDoubleValue) {
                dDoubleValue = entry.getKey().doubleValue();
            }
        }
        return iIntValue;
    }
}
