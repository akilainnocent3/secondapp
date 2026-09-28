package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p880 {
    public static final p880 a;
    public static final p880 b;
    public static final p880 c;
    public static final /* synthetic */ p880[] d;

    static {
        p880 p880Var = new p880("Left", 0);
        a = p880Var;
        p880 p880Var2 = new p880("Middle", 1);
        b = p880Var2;
        p880 p880Var3 = new p880("Right", 2);
        c = p880Var3;
        d = new p880[]{p880Var, p880Var2, p880Var3};
    }

    public p880() {
        throw null;
    }

    public static p880 valueOf(String str) {
        return (p880) Enum.valueOf(p880.class, str);
    }

    public static p880[] values() {
        return (p880[]) d.clone();
    }
}
