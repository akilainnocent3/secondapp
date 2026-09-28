package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class fql0 implements eql0 {
    public static final adl0 a;

    static {
        fdl0 fdl0Var = new fdl0(wcl0.a(), true, true);
        fdl0Var.b("measurement.sdk.collection.enable_extend_user_property_size", true);
        a = fdl0Var.b("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        fdl0Var.a(0L, "measurement.id.sdk.collection.last_deep_link_referrer2");
    }

    @Override // defpackage.eql0
    public final boolean zza() {
        return ((Boolean) a.b()).booleanValue();
    }
}
