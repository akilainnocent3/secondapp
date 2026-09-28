package defpackage;

import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Ltgb0;", "", "Lcom/sporty/android/core/model/cashout/CashoutMetricsPayload;", EventKeys.PAYLOAD, "", "a", "(Lcom/sporty/android/core/model/cashout/CashoutMetricsPayload;Lv1b;)Ljava/lang/Object;", "common-network"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface tgb0 {
    @flz("/event/metrics")
    @gil({"Content-Type: application/json"})
    Object a(@jh4 CashoutMetricsPayload cashoutMetricsPayload, v1b<? super Unit> v1bVar);
}
