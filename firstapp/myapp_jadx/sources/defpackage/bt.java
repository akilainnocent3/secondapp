package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class bt {
    public static final bt a;
    public static final bt b;
    public static final bt c;
    public static final /* synthetic */ bt[] d;

    static {
        bt btVar = new bt("INFO", 0);
        a = btVar;
        bt btVar2 = new bt("ALERT", 1);
        b = btVar2;
        bt btVar3 = new bt("ERROR", 2);
        c = btVar3;
        d = new bt[]{btVar, btVar2, btVar3};
    }

    public bt() {
        throw null;
    }

    public static bt valueOf(String str) {
        return (bt) Enum.valueOf(bt.class, str);
    }

    public static bt[] values() {
        return (bt[]) d.clone();
    }
}
