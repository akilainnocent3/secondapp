package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class lol0 implements jol0 {
    public static final ycl0 a;

    static {
        fdl0 fdl0Var = new fdl0(wcl0.a(), true, true);
        fdl0Var.b("measurement.client.3p_consent_state_v1", true);
        a = fdl0Var.a(203600L, "measurement.service.storage_consent_support_version");
    }

    @Override // defpackage.jol0
    public final long zza() {
        return ((Long) a.b()).longValue();
    }
}
