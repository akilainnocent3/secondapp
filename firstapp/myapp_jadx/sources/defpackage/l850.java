package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class l850 {
    public static final l850 a;
    public static final l850 b;
    public static final /* synthetic */ l850[] c;

    static {
        l850 l850Var = new l850("Restart", 0);
        a = l850Var;
        l850 l850Var2 = new l850("Reverse", 1);
        b = l850Var2;
        c = new l850[]{l850Var, l850Var2};
    }

    public l850() {
        throw null;
    }

    public static l850 valueOf(String str) {
        return (l850) Enum.valueOf(l850.class, str);
    }

    public static l850[] values() {
        return (l850[]) c.clone();
    }
}
