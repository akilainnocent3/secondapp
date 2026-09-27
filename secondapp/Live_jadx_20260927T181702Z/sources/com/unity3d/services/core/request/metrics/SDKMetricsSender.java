package com.unity3d.services.core.request.metrics;

import fr.n1;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface SDKMetricsSender {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultImpls {
        public static void sendEvent(@l SDKMetricsSender sDKMetricsSender, @l String event) {
            m0.p(event, "event");
            sendEvent$default(sDKMetricsSender, event, null, null, 4, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void sendEvent$default(SDKMetricsSender sDKMetricsSender, String str, String str2, Map map, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                map = n1.z();
            }
            sDKMetricsSender.sendEvent(str, str2, map);
        }
    }

    @m
    String getMetricEndPoint();

    void sendEvent(@l String str);

    void sendEvent(@l String str, @m String str2, @l Map<String, String> map);

    void sendMetric(@l Metric metric);

    void sendMetricWithInitState(@l Metric metric);

    void sendMetrics(@l List<Metric> list);
}
