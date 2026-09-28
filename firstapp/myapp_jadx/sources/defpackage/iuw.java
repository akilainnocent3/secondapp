package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class iuw {
    public static final iuw a;
    public static final /* synthetic */ iuw[] b;

    static {
        iuw iuwVar = new iuw("Default", 0);
        a = iuwVar;
        b = new iuw[]{iuwVar, new iuw("UserInput", 1), new iuw("PreventUserInput", 2)};
    }

    public iuw() {
        throw null;
    }

    public static iuw valueOf(String str) {
        return (iuw) Enum.valueOf(iuw.class, str);
    }

    public static iuw[] values() {
        return (iuw[]) b.clone();
    }
}
