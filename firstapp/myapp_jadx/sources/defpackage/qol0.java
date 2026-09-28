package defpackage;

import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes4.dex */
public final class qol0 implements ool0 {
    public static final adl0 a;
    public static final adl0 b;

    @Override // defpackage.ool0
    public final boolean zza() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.ool0
    public final boolean zzb() {
        return ((Boolean) b.b()).booleanValue();
    }

    static {
        fdl0 fdl0Var = new fdl0(wcl0.a(), true, true);
        fdl0Var.b("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        fdl0Var.b("measurement.set_default_event_parameters_with_backfill.service", true);
        fdl0Var.a(0L, "measurement.id.set_default_event_parameters.fix_service_request_ordering");
        a = fdl0Var.b("measurement.set_default_event_parameters.fix_app_update_logging", true);
        b = fdl0Var.b(Chyeyik.VedTKdPVDtyX, false);
        fdl0Var.b("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
