package defpackage;

import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class xoi0 implements klf0 {
    public static final List<String> a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final HashSet e;
    public static final xoi0 f;

    static {
        Logger.getLogger(xoi0.class.getName());
        a = Collections.unmodifiableList(Arrays.asList("traceparent", "tracestate"));
        b = 36;
        c = 53;
        d = 55;
        f = new xoi0();
        e = new HashSet();
        for (int i = 0; i < 255; i++) {
            String hexString = Long.toHexString(i);
            if (hexString.length() < 2) {
                hexString = "0".concat(hexString);
            }
            e.add(hexString);
        }
    }

    @Override // defpackage.klf0
    public final <C> void a(m0b m0bVar, C c2, llf0<C> llf0Var) {
        if (m0bVar == null || llf0Var == null) {
            return;
        }
        ui1 ui1VarB = oqa0.i(m0bVar).b();
        if (ui1VarB.f()) {
            int i = d;
            char[] cArrA = pcf0.a(i);
            cArrA[0] = CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS.charAt(0);
            cArrA[1] = CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS.charAt(1);
            cArrA[2] = '-';
            String strC = ui1VarB.c();
            strC.getChars(0, strC.length(), cArrA, 3);
            int i2 = b;
            cArrA[i2 - 1] = '-';
            String strA = ui1VarB.a();
            strA.getChars(0, strA.length(), cArrA, i2);
            int i3 = c;
            cArrA[i3 - 1] = '-';
            String str = ui1VarB.b().a;
            cArrA[i3] = str.charAt(0);
            cArrA[i3 + 1] = str.charAt(1);
            llf0Var.a(c2, "traceparent", new String(cArrA, 0, i));
            hg1 hg1VarD = ui1VarB.d();
            if (hg1VarD.a().isEmpty()) {
                return;
            }
            llf0Var.a(c2, "tracestate", woi0.a(hg1VarD));
        }
    }

    public final String toString() {
        return "W3CTraceContextPropagator";
    }
}
