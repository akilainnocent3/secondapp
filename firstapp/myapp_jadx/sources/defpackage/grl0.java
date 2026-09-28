package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class grl0 implements frl0 {
    public static final adl0 a;

    static {
        fdl0 fdl0Var = new fdl0(wcl0.a(), true, true);
        a = fdl0Var.b("measurement.session_stitching_token_enabled", false);
        fdl0Var.b("measurement.link_sst_to_sid", true);
    }

    @Override // defpackage.frl0
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }
}
