package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class kam {
    public static final kam a;
    public static final kam b;
    public static final /* synthetic */ kam[] c;

    static {
        kam kamVar = new kam("RIGHT", 0);
        a = kamVar;
        kam kamVar2 = new kam("LEFT", 1);
        b = kamVar2;
        c = new kam[]{kamVar, kamVar2};
    }

    public kam() {
        throw null;
    }

    public static kam valueOf(String str) {
        return (kam) Enum.valueOf(kam.class, str);
    }

    public static kam[] values() {
        return (kam[]) c.clone();
    }
}
