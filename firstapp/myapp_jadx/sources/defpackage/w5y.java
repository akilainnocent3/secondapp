package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class w5y {
    public static final w5y a;
    public static final w5y b;
    public static final w5y c;
    public static final w5y d;
    public static final /* synthetic */ w5y[] e;

    static {
        w5y w5yVar = new w5y("Normal", 0);
        a = w5yVar;
        w5y w5yVar2 = new w5y("Selected", 1);
        b = w5yVar2;
        w5y w5yVar3 = new w5y("WinLine", 2);
        c = w5yVar3;
        w5y w5yVar4 = new w5y("HighChanceToWin", 3);
        d = w5yVar4;
        e = new w5y[]{w5yVar, w5yVar2, w5yVar3, w5yVar4};
    }

    public w5y() {
        throw null;
    }

    public static w5y valueOf(String str) {
        return (w5y) Enum.valueOf(w5y.class, str);
    }

    public static w5y[] values() {
        return (w5y[]) e.clone();
    }
}
