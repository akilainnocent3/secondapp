package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class r840 {
    public static final r840 a;
    public static final /* synthetic */ r840[] b;

    /* JADX INFO: Fake field, exist only in values array */
    r840 EF0;

    static {
        r840 r840Var = new r840("ALL", 0);
        r840 r840Var2 = new r840("FOOTBALL", 1);
        r840 r840Var3 = new r840("BASKETBALL", 2);
        r840 r840Var4 = new r840("TENNIS", 3);
        r840 r840Var5 = new r840("RUGBY", 4);
        r840 r840Var6 = new r840("CRICKET", 5);
        r840 r840Var7 = new r840("HANDBALL", 6);
        r840 r840Var8 = new r840("VOLLEYBALL", 7);
        r840 r840Var9 = new r840("ICEHOCKEY", 8);
        r840 r840Var10 = new r840("DARTS", 9);
        r840 r840Var11 = new r840("BEACHVOLLEYBALL", 10);
        r840 r840Var12 = new r840("VFOOTBALL", 11);
        r840 r840Var13 = new r840("UNKNOWN", 12);
        a = r840Var13;
        b = new r840[]{r840Var, r840Var2, r840Var3, r840Var4, r840Var5, r840Var6, r840Var7, r840Var8, r840Var9, r840Var10, r840Var11, r840Var12, r840Var13};
    }

    public r840() {
        throw null;
    }

    public static r840 valueOf(String str) {
        return (r840) Enum.valueOf(r840.class, str);
    }

    public static r840[] values() {
        return (r840[]) b.clone();
    }
}
