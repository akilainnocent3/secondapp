package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class sev {
    public static final sev a;
    public static final sev b;
    public static final /* synthetic */ sev[] c;

    static {
        sev sevVar = new sev("BET_ERROR", 0);
        a = sevVar;
        sev sevVar2 = new sev("LOYALTY_MISSION", 1);
        sev sevVar3 = new sev("FEEDBACK", 2);
        b = sevVar3;
        c = new sev[]{sevVar, sevVar2, sevVar3};
    }

    public sev() {
        throw null;
    }

    public static sev valueOf(String str) {
        return (sev) Enum.valueOf(sev.class, str);
    }

    public static sev[] values() {
        return (sev[]) c.clone();
    }
}
