package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class umt {
    public static final umt a;
    public static final /* synthetic */ umt[] b;

    static {
        umt umtVar = new umt("Immediately", 0);
        a = umtVar;
        b = new umt[]{umtVar, new umt("OnIterationFinish", 1)};
    }

    public umt() {
        throw null;
    }

    public static umt valueOf(String str) {
        return (umt) Enum.valueOf(umt.class, str);
    }

    public static umt[] values() {
        return (umt[]) b.clone();
    }
}
