package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cqc {
    public static final cqc a;
    public static final cqc b;
    public static final cqc c;
    public static final cqc d;
    public static final cqc e;
    public static final /* synthetic */ cqc[] f;

    static {
        cqc cqcVar = new cqc("LOCAL", 0);
        a = cqcVar;
        cqc cqcVar2 = new cqc("REMOTE", 1);
        b = cqcVar2;
        cqc cqcVar3 = new cqc("DATA_DISK_CACHE", 2);
        c = cqcVar3;
        cqc cqcVar4 = new cqc("RESOURCE_DISK_CACHE", 3);
        d = cqcVar4;
        cqc cqcVar5 = new cqc("MEMORY_CACHE", 4);
        e = cqcVar5;
        f = new cqc[]{cqcVar, cqcVar2, cqcVar3, cqcVar4, cqcVar5};
    }

    public cqc() {
        throw null;
    }

    public static cqc valueOf(String str) {
        return (cqc) Enum.valueOf(cqc.class, str);
    }

    public static cqc[] values() {
        return (cqc[]) f.clone();
    }
}
