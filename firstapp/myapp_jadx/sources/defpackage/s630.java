package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class s630 {
    public static final s630 a;
    public static final s630 b;
    public static final /* synthetic */ s630[] c;

    static {
        s630 s630Var = new s630("PROTO2", 0);
        a = s630Var;
        s630 s630Var2 = new s630("PROTO3", 1);
        b = s630Var2;
        c = new s630[]{s630Var, s630Var2};
    }

    public s630() {
        throw null;
    }

    public static s630 valueOf(String str) {
        return (s630) Enum.valueOf(s630.class, str);
    }

    public static s630[] values() {
        return (s630[]) c.clone();
    }
}
