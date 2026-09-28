package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class xi5 {
    public static final a a;
    public static final xi5 b;
    public static final xi5 c;
    public static final xi5 d;
    public static final xi5 e;
    public static final /* synthetic */ xi5[] f;
    public static final /* synthetic */ uag i;

    public static final class a {
    }

    static {
        xi5 xi5Var = new xi5("NON_GP", 0);
        b = xi5Var;
        xi5 xi5Var2 = new xi5("GOOGLE_PLAY", 1);
        c = xi5Var2;
        xi5 xi5Var3 = new xi5("HUAWEI", 2);
        d = xi5Var3;
        xi5 xi5Var4 = new xi5("PALM_STORE", 3);
        e = xi5Var4;
        xi5[] xi5VarArr = {xi5Var, xi5Var2, xi5Var3, xi5Var4};
        f = xi5VarArr;
        i = new uag(xi5VarArr);
        a = new a();
    }

    public xi5() {
        throw null;
    }

    public static xi5 valueOf(String str) {
        return (xi5) Enum.valueOf(xi5.class, str);
    }

    public static xi5[] values() {
        return (xi5[]) f.clone();
    }
}
