package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bqc {
    public static final bqc a;
    public static final bqc b;
    public static final bqc c;
    public static final bqc d;
    public static final /* synthetic */ bqc[] e;

    static {
        bqc bqcVar = new bqc("MEMORY_CACHE", 0);
        a = bqcVar;
        bqc bqcVar2 = new bqc("MEMORY", 1);
        b = bqcVar2;
        bqc bqcVar3 = new bqc("DISK", 2);
        c = bqcVar3;
        bqc bqcVar4 = new bqc("NETWORK", 3);
        d = bqcVar4;
        e = new bqc[]{bqcVar, bqcVar2, bqcVar3, bqcVar4};
    }

    public bqc() {
        throw null;
    }

    public static bqc valueOf(String str) {
        return (bqc) Enum.valueOf(bqc.class, str);
    }

    public static bqc[] values() {
        return (bqc[]) e.clone();
    }
}
