package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class jql0 implements iql0 {
    public static final adl0 a;
    public static final ycl0 b;
    public static final cdl0 c;
    public static final ycl0 d;
    public static final ycl0 e;
    public static final ddl0 f;

    static {
        fdl0 fdl0Var = new fdl0(wcl0.a(), true, true);
        a = fdl0Var.b("measurement.test.boolean_flag", false);
        b = fdl0Var.a(-1L, "measurement.test.cached_long_flag");
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = pdl0.f;
        c = new cdl0(fdl0Var, "measurement.test.double_flag", dValueOf);
        d = fdl0Var.a(-2L, "measurement.test.int_flag");
        e = fdl0Var.a(-1L, "measurement.test.long_flag");
        f = fdl0Var.c("measurement.test.string_flag", "---");
    }

    @Override // defpackage.iql0
    public final boolean zza() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.iql0
    public final long zzb() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.iql0
    public final double zzc() {
        return ((Double) c.b()).doubleValue();
    }

    @Override // defpackage.iql0
    public final long zzd() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.iql0
    public final long zze() {
        return ((Long) e.b()).longValue();
    }

    @Override // defpackage.iql0
    public final String zzf() {
        return (String) f.b();
    }
}
