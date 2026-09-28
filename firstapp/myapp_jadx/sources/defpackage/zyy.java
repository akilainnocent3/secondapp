package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class zyy {
    public static final zyy a;
    public static final zyy b;
    public static final zyy c;
    public static final zyy d;
    public static final /* synthetic */ zyy[] e;

    static {
        zyy zyyVar = new zyy("INIT", 0);
        a = zyyVar;
        zyy zyyVar2 = new zyy("PREV", 1);
        b = zyyVar2;
        zyy zyyVar3 = new zyy("CURRENT", 2);
        c = zyyVar3;
        zyy zyyVar4 = new zyy("NEXT", 3);
        d = zyyVar4;
        e = new zyy[]{zyyVar, zyyVar2, zyyVar3, zyyVar4};
    }

    public zyy() {
        throw null;
    }

    public static zyy valueOf(String str) {
        return (zyy) Enum.valueOf(zyy.class, str);
    }

    public static zyy[] values() {
        return (zyy[]) e.clone();
    }
}
