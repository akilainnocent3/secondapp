package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class mql0 implements lql0 {
    public static final adl0 a;
    public static final adl0 b;
    public static final adl0 c;
    public static final adl0 d;
    public static final adl0 e;
    public static final adl0 f;
    public static final adl0 g;
    public static final adl0 h;

    static {
        fdl0 fdl0Var = new fdl0(wcl0.a(), true, true);
        fdl0Var.b("measurement.rb.attribution.ad_campaign_info", true);
        fdl0Var.b("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        a = fdl0Var.b("measurement.rb.attribution.client2", true);
        b = fdl0Var.b("measurement.rb.attribution.followup1.service", false);
        fdl0Var.b("measurement.rb.attribution.client.get_trigger_uris_async", true);
        c = fdl0Var.b("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        fdl0Var.b("measurement.rb.attribution.index_out_of_bounds_fix", true);
        d = fdl0Var.b("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        e = fdl0Var.b("measurement.rb.attribution.retry_disposition", false);
        f = fdl0Var.b("measurement.rb.attribution.service", true);
        g = fdl0Var.b("measurement.rb.attribution.enable_trigger_redaction", true);
        h = fdl0Var.b("measurement.rb.attribution.uuid_generation", true);
        fdl0Var.a(0L, "measurement.id.rb.attribution.retry_disposition");
        fdl0Var.b("measurement.rb.attribution.improved_retry", true);
    }

    @Override // defpackage.lql0
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.lql0
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.lql0
    public final boolean zzd() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.lql0
    public final boolean zze() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.lql0
    public final boolean zzf() {
        return ((Boolean) e.b()).booleanValue();
    }

    @Override // defpackage.lql0
    public final boolean zzg() {
        return ((Boolean) f.b()).booleanValue();
    }

    @Override // defpackage.lql0
    public final boolean zzh() {
        return ((Boolean) g.b()).booleanValue();
    }

    @Override // defpackage.lql0
    public final boolean zzi() {
        return ((Boolean) h.b()).booleanValue();
    }
}
