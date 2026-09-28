package defpackage;

import androidx.navigation.fragment.a;
import androidx.navigation.fragment.b;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class z2f {
    public static final void b(ghx ghxVar) {
        wkx wkxVar = ghxVar.i;
        wkxVar.getClass();
        b bVar = new b((a) wkxVar.b(wkx.a.a(a.class)), "notification_settings_match_alert_route", jq40.a(huu.class));
        bVar.e = "Notification Settings Match Alert";
        ghxVar.m.add(bVar.a());
    }

    public static void c(yfx yfxVar) {
        zix zixVarA = bjx.a(new r8a(1, new kkx()));
        yfxVar.getClass();
        yfx.i(yfxVar, "notification_settings_match_alert_route", zixVarA, 4);
    }

    public static final qcn a(int i, BigDecimal bigDecimal) {
        bigDecimal.getClass();
        int iIntValue = bigDecimal.intValue();
        if (i > 0 && iIntValue > 0) {
            ngs ngsVar = new ngs(i);
            int i2 = iIntValue;
            for (int i3 = 0; i3 < i; i3++) {
                ngsVar.add(i2 + LhMGMAwwhzjwfz.PjKRcAArJbDSKQ);
                i2 *= iIntValue;
            }
            return a4h.b(kotlin.collections.a.a(ngsVar));
        }
        return n1a0.c;
    }
}
