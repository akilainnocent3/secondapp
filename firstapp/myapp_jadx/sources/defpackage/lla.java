package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportygames.crash.remote.models.DetailResponse;
import java.util.List;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class lla {
    public static final void a(DetailResponse detailResponse, ytw<Double> ytwVar, ytw<String> ytwVar2, ytw<String> ytwVar3, boolean z) {
        double d;
        detailResponse.getClass();
        ytwVar.getClass();
        ytwVar2.getClass();
        ytwVar3.getClass();
        if (ytwVar.getValue().doubleValue() == 0.0d || ytwVar.getValue().doubleValue() < detailResponse.getMinAmount()) {
            ytwVar.setValue(Double.valueOf(detailResponse.getMinAmount()));
        }
        if (ytwVar.getValue().doubleValue() > detailResponse.getMaxAmount()) {
            ytwVar.setValue(Double.valueOf(detailResponse.getMaxAmount()));
        }
        if (z) {
            try {
                List listSplit$default = StringsKt__StringsKt.split$default(ytwVar2.getValue(), new String[]{"x"}, false, 0, 6, null);
                if (c.l((String) listSplit$default.get(0), "0", true)) {
                    ytwVar3.setValue("1.01");
                    ytwVar2.setValue(((Object) ytwVar3.getValue()) + "x");
                }
                if (Double.parseDouble((String) listSplit$default.get(0)) < 1.01d) {
                    ytwVar3.setValue("1.01");
                    ytwVar2.setValue(((Object) ytwVar3.getValue()) + "x");
                }
            } catch (Exception unused) {
            }
            try {
                d = Double.parseDouble(ytwVar3.getValue());
            } catch (Exception unused2) {
                d = 5.0d;
            }
            if (ytwVar.getValue().doubleValue() * d > detailResponse.getMaxPayoutAmount()) {
                TreeMap treeMap = pw.a;
                ytwVar3.setValue(pw.n(detailResponse.getMaxPayoutAmount() / ytwVar.getValue().doubleValue()));
                ytwVar2.setValue(((Object) ytwVar3.getValue()) + "x");
            }
        }
    }

    public static final float b(float f, a aVar) {
        return ((mmd) aVar.O(kna.h)).v1(f);
    }

    public static final String c(int i, String str) {
        str.getClass();
        kpu.f(new Pair(1, "1"), new Pair(2, "2"), new Pair(3, "3"), new Pair(4, "4"), new Pair(5, "5"), new Pair(6, "6"), new Pair(7, "7"), new Pair(8, "8"), new Pair(9, "9"), new Pair(0, "0"), new Pair(10, "."), new Pair(11, CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS), new Pair(12, "back"), new Pair(13, "clear"), new Pair(14, "done"));
        if (i >= 0 && i < 10) {
            return hce0.a(i, str);
        }
        if (i == 10) {
            return str.concat(".");
        }
        if (i == 11) {
            return str.concat(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
        }
        if (i == 12) {
            return wae0.E(str);
        }
        if (i == 13) {
            return "";
        }
        return (i == 14 || i == 15) ? str : "";
    }
}
