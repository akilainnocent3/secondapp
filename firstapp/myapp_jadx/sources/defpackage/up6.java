package defpackage;

import com.appsflyer.internal.x;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class up6 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                CashoutMetricsPayload.Metric metric = (CashoutMetricsPayload.Metric) obj;
                metric.getClass();
                String betId = metric.getKeyValueMap().getBetId();
                long startTime = metric.getKeyValueMap().getStartTime();
                Long endTime = metric.getKeyValueMap().getEndTime();
                String type = metric.getKeyValueMap().getType();
                String metricsInfo = metric.getKeyValueMap().getMetricsInfo();
                StringBuilder sbA = x.a(startTime, "CashoutMetric(betId=", betId, ", startTime=");
                sbA.append(", endTime=");
                sbA.append(endTime);
                sbA.append(", type=");
                sbA.append(type);
                return pr0.a(sbA, ", metricsInfo=", metricsInfo, ")");
            default:
                w5f0 w5f0Var = (w5f0) obj;
                w5f0Var.getClass();
                return w5f0Var.b + ":" + w5f0Var.a;
        }
    }
}
