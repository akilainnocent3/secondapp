package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b120 {
    public static final b120 a;
    public static final b120 b;
    public static final b120 c;
    public static final b120 d;
    public static final /* synthetic */ b120[] e;

    static {
        b120 b120Var = new b120("TopStart", 0);
        a = b120Var;
        b120 b120Var2 = new b120("TopEnd", 1);
        b = b120Var2;
        b120 b120Var3 = new b120("BottomStart", 2);
        c = b120Var3;
        b120 b120Var4 = new b120("BottomEnd", 3);
        d = b120Var4;
        e = new b120[]{b120Var, b120Var2, b120Var3, b120Var4};
    }

    public b120() {
        throw null;
    }

    public static b120 valueOf(String str) {
        return (b120) Enum.valueOf(b120.class, str);
    }

    public static b120[] values() {
        return (b120[]) e.clone();
    }

    public final boolean a() {
        return this == c || this == d;
    }

    public final boolean b() {
        return this == a || this == b;
    }
}
