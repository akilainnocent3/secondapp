package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class pql0 implements oql0 {
    public static final adl0 a;

    static {
        fdl0 fdl0Var = new fdl0(wcl0.a(), true, true);
        a = fdl0Var.b("measurement.add_first_launch_logging_timestamp.service", false);
        fdl0Var.a(0L, "measurement.id.add_first_launch_logging_timestamp.service");
    }

    @Override // defpackage.oql0
    public final boolean zza() {
        return ((Boolean) a.b()).booleanValue();
    }
}
