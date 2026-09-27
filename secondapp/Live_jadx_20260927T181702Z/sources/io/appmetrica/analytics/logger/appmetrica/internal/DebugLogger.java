package io.appmetrica.analytics.logger.appmetrica.internal;

import io.appmetrica.analytics.logger.common.BaseDebugLogger;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class DebugLogger extends BaseDebugLogger {

    @l
    public static final DebugLogger INSTANCE = new DebugLogger();

    private DebugLogger() {
        super("AppMetricaDebug");
    }

    public final void dumpJson(@l String str, @l JSONObject jSONObject) {
        String string;
        try {
            string = jSONObject.toString(2);
        } catch (Throwable unused) {
            string = "Exception during dumping JSONObject";
        }
        info(str, string, new Object[0]);
    }
}
