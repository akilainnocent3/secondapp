package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class y {
    public static final y a;
    public static final y b;
    public static final y c;
    public static final y d;
    public static final y e;
    public static final /* synthetic */ y[] f;

    static {
        y yVar = new y("POCKET_ROCKET", 0);
        a = yVar;
        y yVar2 = new y("TEST_BUTTON_COLOR", 1);
        b = yVar2;
        y yVar3 = new y("TEST_BUTTON_COLOR2", 2);
        c = yVar3;
        y yVar4 = new y("TEST_BUTTON_COLOR4", 3);
        d = yVar4;
        y yVar5 = new y("SH_RAIN_V2", 4);
        e = yVar5;
        f = new y[]{yVar, yVar2, yVar3, yVar4, yVar5};
    }

    public y() {
        throw null;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f.clone();
    }
}
