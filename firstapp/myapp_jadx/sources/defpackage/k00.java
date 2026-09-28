package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k00 {
    public static final k00 a;
    public static final k00 b;
    public static final k00 c;
    public static final k00 d;
    public static final /* synthetic */ k00[] e;
    public static final /* synthetic */ uag f;

    static {
        k00 k00Var = new k00("FirebaseAnalytics", 0);
        a = k00Var;
        k00 k00Var2 = new k00("AppsFlyer", 1);
        b = k00Var2;
        k00 k00Var3 = new k00("FullStory", 2);
        c = k00Var3;
        k00 k00Var4 = new k00("SportyTracking", 3);
        d = k00Var4;
        k00[] k00VarArr = {k00Var, k00Var2, k00Var3, k00Var4};
        e = k00VarArr;
        f = new uag(k00VarArr);
    }

    public k00() {
        throw null;
    }

    public static k00 valueOf(String str) {
        return (k00) Enum.valueOf(k00.class, str);
    }

    public static k00[] values() {
        return (k00[]) e.clone();
    }
}
