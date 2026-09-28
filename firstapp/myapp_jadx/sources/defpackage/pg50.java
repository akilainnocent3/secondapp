package defpackage;

import java.util.Objects;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class pg50 {
    public static final Logger a = Logger.getLogger(pg50.class.getName());
    public static final gk1 b;
    public static final pg50 c;

    static {
        g21 g21Var = g21.a;
        kyo kyoVarA = kyo.a(g21Var, "service.name");
        kyo kyoVarA2 = kyo.a(g21Var, "telemetry.sdk.language");
        kyo kyoVarA3 = kyo.a(g21Var, "telemetry.sdk.name");
        kyo kyoVarA4 = kyo.a(g21Var, "telemetry.sdk.version");
        b = a(vw0.d, null);
        gk1 gk1VarA = a(m21.c(kyoVarA, "unknown_service:java"), null);
        xw0 xw0Var = new xw0();
        xw0Var.b(kyoVarA3, "opentelemetry");
        xw0Var.b(kyoVarA2, "java");
        xw0Var.b(kyoVarA4, "1.58.0");
        c = gk1VarA.d(a(xw0Var.a(), null));
    }

    public static gk1 a(m21 m21Var, String str) {
        Objects.requireNonNull(m21Var, "attributes");
        m21Var.forEach(new mg50());
        return new gk1(m21Var, str);
    }

    public abstract m21 b();

    public abstract String c();

    public final pg50 d(gk1 gk1Var) {
        String str = gk1Var.d;
        if (gk1Var == b) {
            return this;
        }
        xw0 xw0Var = new xw0();
        gk1 gk1Var2 = (gk1) this;
        xw0Var.c(gk1Var2.e);
        xw0Var.c(gk1Var.e);
        String str2 = gk1Var2.d;
        if (str == null) {
            return a(xw0Var.a(), str2);
        }
        if (str2 == null) {
            return a(xw0Var.a(), str);
        }
        if (str.equals(str2)) {
            return a(xw0Var.a(), str2);
        }
        a.info("Attempting to merge Resources with different schemaUrls. The resulting Resource will have no schemaUrl assigned. Schema 1: " + str2 + " Schema 2: " + str);
        return a(xw0Var.a(), null);
    }

    public final sg50 e() {
        sg50 sg50Var = new sg50();
        sg50Var.a.c(b());
        if (c() != null) {
            sg50Var.b = c();
        }
        return sg50Var;
    }
}
