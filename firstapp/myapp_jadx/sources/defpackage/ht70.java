package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ht70 {
    public static final vw0 e;
    public static final vw0 f;
    public static final vw0 g;
    public static final vw0 h;
    public static final vw0 i;
    public static final vw0 j;
    public static final vw0 k;
    public static final vw0 l;
    public static final vw0 m;
    public static final vw0 n;
    public static final vw0 o;
    public final Object a = new Object();
    public fpv b;
    public volatile sjt c;
    public volatile tkt d;

    static {
        kyo kyoVar = la80.e;
        kyo kyoVar2 = la80.f;
        e = m21.b(kyoVar, "none", kyoVar2, "DROP");
        f = m21.b(kyoVar, "none", kyoVar2, "RECORD_ONLY");
        g = m21.b(kyoVar, "none", kyoVar2, "RECORD_AND_SAMPLE");
        h = m21.b(kyoVar, "remote", kyoVar2, "DROP");
        i = m21.b(kyoVar, "remote", kyoVar2, "RECORD_ONLY");
        j = m21.b(kyoVar, "remote", kyoVar2, "RECORD_AND_SAMPLE");
        k = m21.b(kyoVar, "local", kyoVar2, "DROP");
        l = m21.b(kyoVar, "local", kyoVar2, "RECORD_ONLY");
        m = m21.b(kyoVar, "local", kyoVar2, "RECORD_AND_SAMPLE");
        n = m21.c(kyoVar2, "RECORD_ONLY");
        o = m21.c(kyoVar2, "RECORD_AND_SAMPLE");
    }

    public ht70(ks70 ks70Var) {
    }

    public final tkt a() {
        tkt tktVarBuild;
        tkt tktVar = this.d;
        if (tktVar != null) {
            return tktVar;
        }
        synchronized (this.a) {
            try {
                tktVarBuild = this.d;
                if (tktVarBuild == null) {
                    fpv fpvVarD = this.b;
                    if (fpvVarD == null) {
                        fpvVarD = ied.a.d("io.opentelemetry.sdk.trace");
                        this.b = fpvVarD;
                    }
                    tktVarBuild = fpvVarD.a("otel.sdk.span.live").b("{span}").a("The number of created spans with recording=true for which the end operation has not been called yet.").build();
                    this.d = tktVarBuild;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tktVarBuild;
    }

    public final sjt b() {
        sjt sjtVarBuild;
        sjt sjtVar = this.c;
        if (sjtVar != null) {
            return sjtVar;
        }
        synchronized (this.a) {
            try {
                sjtVarBuild = this.c;
                if (sjtVarBuild == null) {
                    fpv fpvVarD = this.b;
                    if (fpvVarD == null) {
                        fpvVarD = ied.a.d("io.opentelemetry.sdk.trace");
                        this.b = fpvVarD;
                    }
                    sjtVarBuild = fpvVarD.b("otel.sdk.span.started").b("{span}").a("The number of created spans.").build();
                    this.c = sjtVarBuild;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sjtVarBuild;
    }
}
