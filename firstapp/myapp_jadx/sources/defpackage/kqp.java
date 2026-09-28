package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class kqp {
    public static final kqp a;
    public static final kqp b;
    public static final kqp c;
    public static final /* synthetic */ kqp[] d;

    static {
        kqp kqpVar = new kqp("Singleton", 0);
        a = kqpVar;
        kqp kqpVar2 = new kqp("Factory", 1);
        b = kqpVar2;
        kqp kqpVar3 = new kqp("Scoped", 2);
        c = kqpVar3;
        d = new kqp[]{kqpVar, kqpVar2, kqpVar3};
    }

    public kqp() {
        throw null;
    }

    public static kqp valueOf(String str) {
        return (kqp) Enum.valueOf(kqp.class, str);
    }

    public static kqp[] values() {
        return (kqp[]) d.clone();
    }
}
