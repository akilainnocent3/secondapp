package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lvg {
    public static final lvg a;
    public static final lvg b;
    public static final lvg c;
    public static final lvg d;
    public static final /* synthetic */ lvg[] e;

    static {
        lvg lvgVar = new lvg("REPLACE", 0);
        a = lvgVar;
        lvg lvgVar2 = new lvg("KEEP", 1);
        b = lvgVar2;
        lvg lvgVar3 = new lvg("APPEND", 2);
        c = lvgVar3;
        lvg lvgVar4 = new lvg("APPEND_OR_REPLACE", 3);
        d = lvgVar4;
        e = new lvg[]{lvgVar, lvgVar2, lvgVar3, lvgVar4};
    }

    public lvg() {
        throw null;
    }

    public static lvg valueOf(String str) {
        return (lvg) Enum.valueOf(lvg.class, str);
    }

    public static lvg[] values() {
        return (lvg[]) e.clone();
    }
}
