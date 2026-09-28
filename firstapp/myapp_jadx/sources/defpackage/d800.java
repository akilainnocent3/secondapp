package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d800 {
    public static final d800 a;
    public static final d800 b;
    public static final d800 c;
    public static final /* synthetic */ d800[] d;

    static {
        d800 d800Var = new d800("RECOMMENDED", 0);
        a = d800Var;
        d800 d800Var2 = new d800("POPULAR", 1);
        b = d800Var2;
        d800 d800Var3 = new d800("RELIABLE", 2);
        c = d800Var3;
        d = new d800[]{d800Var, d800Var2, d800Var3};
    }

    public d800() {
        throw null;
    }

    public static d800 valueOf(String str) {
        return (d800) Enum.valueOf(d800.class, str);
    }

    public static d800[] values() {
        return (d800[]) d.clone();
    }
}
