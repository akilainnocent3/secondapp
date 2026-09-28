package defpackage;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public final class gw50 {
    public static gw50 b;
    public static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public RootTelemetryConfiguration a;

    public static synchronized gw50 a() {
        gw50 gw50Var;
        gw50Var = b;
        if (gw50Var == null) {
            gw50Var = new gw50();
            b = gw50Var;
        }
        return gw50Var;
    }
}
