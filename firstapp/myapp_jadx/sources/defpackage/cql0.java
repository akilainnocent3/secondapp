package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class cql0 implements bql0 {
    public static final adl0 a;

    static {
        fdl0 fdl0Var = new fdl0(wcl0.a(), true, true);
        fdl0Var.b("measurement.gmscore_feature_tracking", true);
        a = fdl0Var.b("measurement.gmscore_client_telemetry", false);
    }

    @Override // defpackage.bql0
    public final boolean zza() {
        return ((Boolean) a.b()).booleanValue();
    }
}
