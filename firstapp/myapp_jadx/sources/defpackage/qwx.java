package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class qwx implements eqa0 {
    public static final qwx a;
    public static final /* synthetic */ qwx[] b;

    static {
        qwx qwxVar = new qwx("INSTANCE", 0);
        a = qwxVar;
        b = new qwx[]{qwxVar};
    }

    public qwx() {
        throw null;
    }

    public static qwx valueOf(String str) {
        return (qwx) Enum.valueOf(qwx.class, str);
    }

    public static qwx[] values() {
        return (qwx[]) b.clone();
    }

    @Override // defpackage.eqa0
    public final String a() {
        boolean z = a0d.a;
        return "\tat unknown source\n\t\tTo enable better debugging, run your JVM with -Dotel.experimental.sdk.metrics.debug=true";
    }
}
