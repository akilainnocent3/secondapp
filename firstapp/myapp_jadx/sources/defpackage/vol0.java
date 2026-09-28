package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vol0 implements tol0 {
    public static final adl0 a;
    public static final adl0 b;

    static {
        fdl0 fdl0Var = new fdl0(wcl0.a(), true, true);
        a = fdl0Var.b("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        b = fdl0Var.b("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // defpackage.tol0
    public final boolean zza() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.tol0
    public final boolean zzb() {
        return ((Boolean) b.b()).booleanValue();
    }
}
