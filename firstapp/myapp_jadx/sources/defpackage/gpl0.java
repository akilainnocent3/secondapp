package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class gpl0 implements fpl0 {
    public static final adl0 a;
    public static final adl0 b;
    public static final adl0 c;

    static {
        fdl0 fdl0Var = new fdl0(wcl0.a(), true, true);
        fdl0Var.b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = fdl0Var.b("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = fdl0Var.b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = fdl0Var.b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // defpackage.fpl0
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.fpl0
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.fpl0
    public final boolean zzd() {
        return ((Boolean) c.b()).booleanValue();
    }
}
