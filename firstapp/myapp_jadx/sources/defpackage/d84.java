package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class d84 {
    public final long a;
    public final long b;

    public d84(vu60 vu60Var) {
        vu60Var.getClass();
        Object objB = vu60Var.b("bio_auth_verified_date");
        if (objB == null) {
            ib5.a("Required value was null.");
            throw null;
        }
        long jLongValue = ((Long) objB).longValue();
        Object objB2 = vu60Var.b("bio_auth_settings_entry_point");
        if (objB2 == null) {
            ib5.a("Required value was null.");
            throw null;
        }
        long jLongValue2 = ((Long) objB2).longValue();
        this.a = jLongValue;
        this.b = jLongValue2;
    }
}
