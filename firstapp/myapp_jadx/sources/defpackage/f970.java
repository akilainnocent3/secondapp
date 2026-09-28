package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class f970 {
    public static final f970 a;
    public static final f970 b;
    public static final f970 c;
    public static final f970 d;
    public static final /* synthetic */ f970[] e;

    static {
        f970 f970Var = new f970("DEFAULT_COLLAPSED", 0);
        a = f970Var;
        f970 f970Var2 = new f970("DEFAULT_EXPANDED", 1);
        b = f970Var2;
        f970 f970Var3 = new f970("USER_COLLAPSED", 2);
        c = f970Var3;
        f970 f970Var4 = new f970("USER_EXPANDED", 3);
        d = f970Var4;
        e = new f970[]{f970Var, f970Var2, f970Var3, f970Var4};
    }

    public f970() {
        throw null;
    }

    public static f970 valueOf(String str) {
        return (f970) Enum.valueOf(f970.class, str);
    }

    public static f970[] values() {
        return (f970[]) e.clone();
    }
}
