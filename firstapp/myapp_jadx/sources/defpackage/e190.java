package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e190 {
    public static final e190 a;
    public static final e190 b;
    public static final e190 c;
    public static final e190 d;
    public static final e190 e;
    public static final /* synthetic */ e190[] f;

    static {
        e190 e190Var = new e190("USER_NOTE", 0);
        a = e190Var;
        e190 e190Var2 = new e190("SINGLE_BET_BUILDER", 1);
        b = e190Var2;
        e190 e190Var3 = new e190("DEFAULT_BET_SHARE", 2);
        c = e190Var3;
        e190 e190Var4 = new e190("DESCRIPTION_AND_HASHTAG", 3);
        d = e190Var4;
        e190 e190Var5 = new e190("LINK_ONLY", 4);
        e = e190Var5;
        f = new e190[]{e190Var, e190Var2, e190Var3, e190Var4, e190Var5};
    }

    public e190() {
        throw null;
    }

    public static e190 valueOf(String str) {
        return (e190) Enum.valueOf(e190.class, str);
    }

    public static e190[] values() {
        return (e190[]) f.clone();
    }
}
