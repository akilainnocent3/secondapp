package defpackage;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cmt implements Function0 {
    public final /* synthetic */ hsq a;
    public final /* synthetic */ twd0 b;

    public /* synthetic */ cmt(hsq hsqVar, ytw ytwVar) {
        this.a = hsqVar;
        this.b = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jLongValue = this.a.l - ((Number) this.b.getValue()).longValue();
        if (jLongValue < 0) {
            jLongValue = 0;
        }
        if (jLongValue >= 10800000) {
            return o4q.b.a;
        }
        return new o4q.a(jLongValue < RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS, String.format(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue / 3600000), Long.valueOf((jLongValue / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) % 60), Long.valueOf((jLongValue / 1000) % 60)}, 3)));
    }
}
