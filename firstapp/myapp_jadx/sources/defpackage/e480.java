package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e480 {
    public static final e480 a;
    public static final e480 b;
    public static final /* synthetic */ e480[] c;

    static {
        e480 e480Var = new e480("Popup", 0);
        a = e480Var;
        e480 e480Var2 = new e480("Notification", 1);
        b = e480Var2;
        c = new e480[]{e480Var, e480Var2};
    }

    public static e480 valueOf(String str) {
        return (e480) Enum.valueOf(e480.class, str);
    }

    public static e480[] values() {
        return (e480[]) c.clone();
    }
}
