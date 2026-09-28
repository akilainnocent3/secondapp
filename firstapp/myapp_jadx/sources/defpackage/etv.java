package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class etv {
    public static final etv a;
    public static final etv b;
    public static final /* synthetic */ etv[] c;

    static {
        etv etvVar = new etv("Task", 0);
        a = etvVar;
        etv etvVar2 = new etv("Mission", 1);
        b = etvVar2;
        c = new etv[]{etvVar, etvVar2};
    }

    public etv() {
        throw null;
    }

    public static etv valueOf(String str) {
        return (etv) Enum.valueOf(etv.class, str);
    }

    public static etv[] values() {
        return (etv[]) c.clone();
    }
}
