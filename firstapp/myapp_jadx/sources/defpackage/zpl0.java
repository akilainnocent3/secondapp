package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zpl0 implements ypl0 {
    public static final adl0 a;

    static {
        fdl0 fdl0Var = new fdl0(wcl0.a(), true, true);
        fdl0Var.b("measurement.gbraid_campaign.gbraid.client", true);
        a = fdl0Var.b("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // defpackage.ypl0
    public final boolean zza() {
        return ((Boolean) a.b()).booleanValue();
    }
}
