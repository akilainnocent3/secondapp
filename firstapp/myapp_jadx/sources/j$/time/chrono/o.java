package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements j {
    public static final o AH;
    public static final /* synthetic */ o[] a;

    static {
        o oVar = new o("AH", 0);
        AH = oVar;
        a = new o[]{oVar};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) a.clone();
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.ERA ? j$.time.temporal.q.f(1L, 1L) : super.l(nVar);
    }
}
