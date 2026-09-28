package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class y2i implements pya<bee0> {
    public static final y2i a;
    public static final /* synthetic */ y2i[] b;

    static {
        y2i y2iVar = new y2i("INSTANCE", 0);
        a = y2iVar;
        b = new y2i[]{y2iVar};
    }

    public y2i() {
        throw null;
    }

    public static y2i valueOf(String str) {
        return (y2i) Enum.valueOf(y2i.class, str);
    }

    public static y2i[] values() {
        return (y2i[]) b.clone();
    }

    @Override // defpackage.pya
    public final void accept(bee0 bee0Var) {
        bee0Var.request(Long.MAX_VALUE);
    }
}
