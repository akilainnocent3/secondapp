package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class jqu {
    public static final jqu a;
    public static final jqu b;
    public static final /* synthetic */ jqu[] c;

    static {
        jqu jquVar = new jqu("OVER_UNDER_EARLY_GOALS", 0);
        a = jquVar;
        jqu jquVar2 = new jqu("DC_ONE_UP", 1);
        b = jquVar2;
        c = new jqu[]{jquVar, jquVar2};
    }

    public jqu() {
        throw null;
    }

    public static jqu valueOf(String str) {
        return (jqu) Enum.valueOf(jqu.class, str);
    }

    public static jqu[] values() {
        return (jqu[]) c.clone();
    }
}
