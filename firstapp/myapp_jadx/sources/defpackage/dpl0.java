package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class dpl0 implements cpl0 {
    public static final adl0 a;
    public static final adl0 b;

    static {
        fdl0 fdl0Var = new fdl0(wcl0.a(), true, true);
        fdl0Var.b("measurement.collection.event_safelist", true);
        a = fdl0Var.b("measurement.service.store_null_safelist", true);
        b = fdl0Var.b("measurement.service.store_safelist", true);
    }

    @Override // defpackage.cpl0
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.cpl0
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }
}
