package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class jrl0 implements irl0 {
    public static final adl0 a;

    static {
        fdl0 fdl0Var = new fdl0(wcl0.a(), true, true);
        a = fdl0Var.b("measurement.client.sessions.enable_fix_background_engagement", false);
        fdl0Var.b("measurement.client.sessions.enable_pause_engagement_in_background", true);
        fdl0Var.a(0L, "measurement.id.client.sessions.enable_fix_background_engagement");
    }

    @Override // defpackage.irl0
    public final boolean zza() {
        return ((Boolean) a.b()).booleanValue();
    }
}
