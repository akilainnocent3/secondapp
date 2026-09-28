package defpackage;

import android.os.Build;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.otlp.core.AppMeta;
import com.sportygames.otlp.core.DeviceMeta;
import com.sportygames.otlp.core.EnvSnapshot;
import com.sportygames.otlp.core.LogBody;
import com.sportygames.otlp.core.UserMeta;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class rob0 implements hym {
    public final j1z a;
    public final eal b;
    public final mpe0 c;

    public rob0(j1z j1zVar) {
        j1zVar.getClass();
        this.a = j1zVar;
        this.b = new eal();
        this.c = hwr.b(new li2(this, 2));
    }

    @Override // defpackage.hym
    public final void b(String str, Map map) {
        map.getClass();
        c(str, map, true);
    }

    @Override // defpackage.hym
    public final void c(String str, Map map, boolean z) {
        map.getClass();
        ogt ogtVar = (ogt) this.c.getValue();
        if (ogtVar == null) {
            return;
        }
        EnvSnapshot envSnapshotSnapshot = this.a.snapshot();
        long jCurrentTimeMillis = System.currentTimeMillis();
        xnu xnuVar = new xnu();
        xnuVar.put("type", AnalyticsEvent.BI_TRACKING_TYPE_BI_ANALYTICS);
        xnuVar.put("name", str);
        if (!map.isEmpty()) {
            xnuVar.put(AnalyticsParam.KEY_BI_CUSTOM_METRICS, map);
        }
        xnu xnuVarC = xnuVar.c();
        String str2 = z ? "log" : AnalyticsEvent.BI_TRACKING_KIND_EVENT;
        SimpleDateFormat simpleDateFormat = dft.a;
        String userId = envSnapshotSnapshot.getUserId();
        String countryCode = envSnapshotSnapshot.getCountryCode();
        String deviceId = envSnapshotSnapshot.getDeviceId();
        String appVersion = envSnapshotSnapshot.getAppVersion();
        String environment = envSnapshotSnapshot.getEnvironment();
        countryCode.getClass();
        deviceId.getClass();
        appVersion.getClass();
        environment.getClass();
        AppMeta appMeta = new AppMeta("SportyBet Android", appVersion, countryCode, "android", environment);
        String str3 = Build.MODEL;
        str3.getClass();
        String str4 = Build.MANUFACTURER;
        str4.getClass();
        DeviceMeta deviceMeta = new DeviceMeta(deviceId, str3, str4);
        String str5 = dft.a.format(new Date(jCurrentTimeMillis));
        str5.getClass();
        String strJ = this.b.j(new LogBody(str2, str5, appMeta, deviceMeta, (userId == null || StringsKt.U(userId)) ? null : new UserMeta(userId, null, 2, null), xnuVarC, null));
        xw0 xw0Var = new xw0();
        g21 g21Var = g21.a;
        xw0Var.b(kyo.a(g21Var, "kind"), str2);
        xw0Var.b(kyo.a(g21Var, "event.type"), AnalyticsEvent.BI_TRACKING_TYPE_BI_ANALYTICS);
        xw0Var.b(kyo.a(g21Var, "service.country"), envSnapshotSnapshot.getCountryCode());
        m21 m21VarA = xw0Var.a();
        try {
            qft qftVarA = ogtVar.a();
            if (qftVarA != null) {
                qftVarA.i(jCurrentTimeMillis);
                qftVarA.b(m21VarA);
                qftVarA.g(strJ);
                qftVarA.h();
                qftVarA.c();
            }
        } catch (Exception unused) {
        }
    }
}
