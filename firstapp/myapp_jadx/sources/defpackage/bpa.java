package defpackage;

import android.os.Bundle;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;

/* JADX INFO: loaded from: classes4.dex */
public final class bpa {
    public static final p80 d = p80.d();
    public static volatile bpa e;
    public final RemoteConfigManager a = RemoteConfigManager.getInstance();
    public icn b = new icn();
    public final tce c = tce.b();

    public static synchronized bpa e() {
        try {
            if (e == null) {
                e = new bpa();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public static boolean l(long j) {
        return j >= 0;
    }

    public static boolean m(String str) {
        if (!str.trim().isEmpty()) {
            for (String str2 : str.split(";")) {
                if (str2.trim().equals("22.0.1")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean n(long j) {
        return j >= 0;
    }

    public static boolean p(double d2) {
        return 0.0d <= d2 && d2 <= 1.0d;
    }

    public final k2z<Boolean> a(bjb0 bjb0Var) {
        tce tceVar = this.c;
        String strQ = bjb0Var.Q();
        if (strQ == null) {
            tceVar.getClass();
            tce.c.a("Key is null when getting boolean value on device cache.");
            return new k2z<>();
        }
        if (tceVar.a == null) {
            tceVar.c(tce.a());
            if (tceVar.a == null) {
                return new k2z<>();
            }
        }
        if (!tceVar.a.contains(strQ)) {
            return new k2z<>();
        }
        try {
            return new k2z<>(Boolean.valueOf(tceVar.a.getBoolean(strQ, false)));
        } catch (ClassCastException e2) {
            tce.c.b("Key %s from sharedPreferences has type other than long: %s", strQ, e2.getMessage());
            return new k2z<>();
        }
    }

    public final k2z<Double> b(bjb0 bjb0Var) {
        tce tceVar = this.c;
        String strQ = bjb0Var.Q();
        if (strQ == null) {
            tceVar.getClass();
            tce.c.a("Key is null when getting double value on device cache.");
            return new k2z<>();
        }
        if (tceVar.a == null) {
            tceVar.c(tce.a());
            if (tceVar.a == null) {
                return new k2z<>();
            }
        }
        if (!tceVar.a.contains(strQ)) {
            return new k2z<>();
        }
        try {
            try {
                return new k2z<>(Double.valueOf(Double.longBitsToDouble(tceVar.a.getLong(strQ, 0L))));
            } catch (ClassCastException e2) {
                tce.c.b("Key %s from sharedPreferences has type other than double: %s", strQ, e2.getMessage());
                return new k2z<>();
            }
        } catch (ClassCastException unused) {
            return new k2z<>(Double.valueOf(Float.valueOf(tceVar.a.getFloat(strQ, 0.0f)).doubleValue()));
        }
    }

    public final k2z<Long> c(bjb0 bjb0Var) {
        tce tceVar = this.c;
        String strQ = bjb0Var.Q();
        if (strQ == null) {
            tceVar.getClass();
            tce.c.a("Key is null when getting long value on device cache.");
            return new k2z<>();
        }
        if (tceVar.a == null) {
            tceVar.c(tce.a());
            if (tceVar.a == null) {
                return new k2z<>();
            }
        }
        if (!tceVar.a.contains(strQ)) {
            return new k2z<>();
        }
        try {
            return new k2z<>(Long.valueOf(tceVar.a.getLong(strQ, 0L)));
        } catch (ClassCastException e2) {
            tce.c.b("Key %s from sharedPreferences has type other than long: %s", strQ, e2.getMessage());
            return new k2z<>();
        }
    }

    public final k2z<String> d(bjb0 bjb0Var) {
        tce tceVar = this.c;
        String strQ = bjb0Var.Q();
        if (strQ == null) {
            tceVar.getClass();
            tce.c.a("Key is null when getting String value on device cache.");
            return new k2z<>();
        }
        if (tceVar.a == null) {
            tceVar.c(tce.a());
            if (tceVar.a == null) {
                return new k2z<>();
            }
        }
        if (!tceVar.a.contains(strQ)) {
            return new k2z<>();
        }
        try {
            return new k2z<>(tceVar.a.getString(strQ, ""));
        } catch (ClassCastException e2) {
            tce.c.b("Key %s from sharedPreferences has type other than String: %s", strQ, e2.getMessage());
            return new k2z<>();
        }
    }

    public final boolean f() {
        lpa lpaVarH0 = lpa.h0();
        k2z<Boolean> k2zVarH = h(lpaVarH0);
        if (k2zVarH.b()) {
            return k2zVarH.a().booleanValue();
        }
        k2z<Boolean> k2zVar = this.a.getBoolean("fpr_experiment_app_start_ttid");
        if (k2zVar.b()) {
            this.c.g("com.google.firebase.perf.ExperimentTTID", k2zVar.a().booleanValue());
            return k2zVar.a().booleanValue();
        }
        k2z<Boolean> k2zVarA = a(lpaVarH0);
        if (k2zVarA.b()) {
            return k2zVarA.a().booleanValue();
        }
        return false;
    }

    public final Boolean g() {
        jpa jpaVar;
        kpa kpaVar;
        synchronized (jpa.class) {
            jpaVar = jpa.b;
            if (jpaVar == null) {
                jpaVar = new jpa();
                jpa.b = jpaVar;
            }
        }
        k2z<Boolean> k2zVarH = h(jpaVar);
        if ((k2zVarH.b() ? k2zVarH.a() : Boolean.FALSE).booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (kpa.class) {
            kpaVar = kpa.b;
            if (kpaVar == null) {
                kpaVar = new kpa();
                kpa.b = kpaVar;
            }
        }
        k2z<Boolean> k2zVarA = a(kpaVar);
        if (k2zVarA.b()) {
            return k2zVarA.a();
        }
        k2z<Boolean> k2zVarH2 = h(kpaVar);
        if (k2zVarH2.b()) {
            return k2zVarH2.a();
        }
        return null;
    }

    public final k2z<Boolean> h(bjb0 bjb0Var) {
        Bundle bundle = this.b.a;
        String strR = bjb0Var.R();
        if (strR == null || !bundle.containsKey(strR)) {
            return new k2z<>();
        }
        try {
            Boolean bool = (Boolean) bundle.get(strR);
            return bool == null ? new k2z<>() : new k2z<>(bool);
        } catch (ClassCastException e2) {
            icn.b.b("Metadata key %s contains type other than boolean: %s", strR, e2.getMessage());
            return new k2z<>();
        }
    }

    public final k2z<Double> i(bjb0 bjb0Var) {
        Bundle bundle = this.b.a;
        String strR = bjb0Var.R();
        if (strR == null || !bundle.containsKey(strR)) {
            return new k2z<>();
        }
        Object obj = bundle.get(strR);
        if (obj == null) {
            return new k2z<>();
        }
        if (obj instanceof Float) {
            return new k2z<>(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new k2z<>((Double) obj);
        }
        icn.b.b("Metadata key %s contains type other than double: %s", strR);
        return new k2z<>();
    }

    public final k2z<Long> j(bjb0 bjb0Var) {
        k2z k2zVar;
        Bundle bundle = this.b.a;
        String strR = bjb0Var.R();
        if (strR == null || !bundle.containsKey(strR)) {
            k2zVar = new k2z();
        } else {
            try {
                Integer num = (Integer) bundle.get(strR);
                k2zVar = num == null ? new k2z() : new k2z(num);
            } catch (ClassCastException e2) {
                icn.b.b("Metadata key %s contains type other than int: %s", strR, e2.getMessage());
                k2zVar = new k2z();
            }
        }
        return k2zVar.b() ? new k2z<>(Long.valueOf(((Integer) k2zVar.a()).intValue())) : new k2z<>();
    }

    public final long k() {
        rpa rpaVar;
        synchronized (rpa.class) {
            rpaVar = rpa.b;
            if (rpaVar == null) {
                rpaVar = new rpa();
                rpa.b = rpaVar;
            }
        }
        k2z<Long> k2zVar = this.a.getLong("fpr_rl_time_limit_sec");
        if (k2zVar.b() && k2zVar.a().longValue() > 0) {
            this.c.e(k2zVar.a().longValue(), "com.google.firebase.perf.TimeLimitSec");
            return k2zVar.a().longValue();
        }
        k2z<Long> k2zVarC = c(rpaVar);
        if (!k2zVarC.b() || k2zVarC.a().longValue() <= 0) {
            return 600L;
        }
        return k2zVarC.a().longValue();
    }

    public final boolean o() {
        tpa tpaVar;
        boolean zBooleanValue;
        spa spaVar;
        boolean zM;
        Boolean boolG = g();
        if (boolG == null || boolG.booleanValue()) {
            synchronized (tpa.class) {
                tpaVar = tpa.b;
                if (tpaVar == null) {
                    tpaVar = new tpa();
                    tpa.b = tpaVar;
                }
            }
            k2z<Boolean> k2zVarA = a(tpaVar);
            k2z<Boolean> k2zVar = this.a.getBoolean("fpr_enabled");
            if (k2zVar.b()) {
                if (this.a.isLastFetchFailed()) {
                    zBooleanValue = false;
                } else {
                    Boolean boolA = k2zVar.a();
                    if (!k2zVarA.b() || k2zVarA.a() != boolA) {
                        this.c.g(oLsIjJCWb.pCxOvVTwVsn, boolA.booleanValue());
                    }
                    zBooleanValue = boolA.booleanValue();
                }
            } else if (k2zVarA.b()) {
                zBooleanValue = k2zVarA.a().booleanValue();
            } else {
                zBooleanValue = true;
            }
            if (zBooleanValue) {
                synchronized (spa.class) {
                    spaVar = spa.b;
                    if (spaVar == null) {
                        spaVar = new spa();
                        spa.b = spaVar;
                    }
                }
                k2z<String> k2zVarD = d(spaVar);
                k2z<String> string = this.a.getString("fpr_disabled_android_versions");
                if (string.b()) {
                    String strA = string.a();
                    if (!k2zVarD.b() || !k2zVarD.a().equals(strA)) {
                        this.c.f("com.google.firebase.perf.SdkDisabledVersions", strA);
                    }
                    zM = m(strA);
                } else if (k2zVarD.b()) {
                    zM = m(k2zVarD.a());
                } else {
                    zM = m("");
                }
                if (!zM) {
                    return true;
                }
            }
        }
        return false;
    }
}
