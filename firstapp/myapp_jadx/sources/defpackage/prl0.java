package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class prl0 implements orl0 {
    public static final adl0 a;

    static {
        fdl0 fdl0Var = new fdl0(wcl0.a(), true, true);
        a = fdl0Var.b("measurement.tcf.consent_fix", true);
        fdl0Var.b("measurement.tcf.client", true);
        fdl0Var.b("measurement.tcf.empty_pref_fix", true);
    }

    @Override // defpackage.orl0
    public final boolean zza() {
        return ((Boolean) a.b()).booleanValue();
    }
}
