package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f07 {
    public static final f07 a;
    public static final f07 b;
    public static final f07 c;
    public static final f07 d;
    public static final /* synthetic */ f07[] e;

    static {
        f07 f07Var = new f07("All", 0);
        a = f07Var;
        f07 f07Var2 = new f07("Ongoing", 1);
        b = f07Var2;
        f07 f07Var3 = new f07("Available", 2);
        c = f07Var3;
        f07 f07Var4 = new f07("Completed", 3);
        d = f07Var4;
        e = new f07[]{f07Var, f07Var2, f07Var3, f07Var4};
    }

    public f07() {
        throw null;
    }

    public static f07 valueOf(String str) {
        return (f07) Enum.valueOf(f07.class, str);
    }

    public static f07[] values() {
        return (f07[]) e.clone();
    }
}
