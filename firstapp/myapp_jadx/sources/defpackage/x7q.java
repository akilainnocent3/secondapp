package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class x7q {
    public static final x7q a;
    public static final x7q b;
    public static final /* synthetic */ x7q[] c;

    static {
        x7q x7qVar = new x7q("LastMinute", 0);
        a = x7qVar;
        x7q x7qVar2 = new x7q("HighestOdds", 1);
        b = x7qVar2;
        c = new x7q[]{x7qVar, x7qVar2};
    }

    public x7q() {
        throw null;
    }

    public static x7q valueOf(String str) {
        return (x7q) Enum.valueOf(x7q.class, str);
    }

    public static x7q[] values() {
        return (x7q[]) c.clone();
    }
}
