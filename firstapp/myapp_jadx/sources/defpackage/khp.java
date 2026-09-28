package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class khp {
    public static final khp a;
    public static final khp b;
    public static final khp c;
    public static final khp d;
    public static final khp e;
    public static final khp f;
    public static final /* synthetic */ khp[] i;

    static {
        khp khpVar = new khp("UNLOADED", 0);
        a = khpVar;
        khp khpVar2 = new khp("IDLE", 1);
        b = khpVar2;
        khp khpVar3 = new khp("FIRED", 2);
        c = khpVar3;
        khp khpVar4 = new khp("COLLIDED", 3);
        d = khpVar4;
        khp khpVar5 = new khp("LOW_BALANCE", 4);
        e = khpVar5;
        khp khpVar6 = new khp("FBG_BALANCE", 5);
        f = khpVar6;
        i = new khp[]{khpVar, khpVar2, khpVar3, khpVar4, khpVar5, khpVar6};
    }

    public khp() {
        throw null;
    }

    public static khp valueOf(String str) {
        return (khp) Enum.valueOf(khp.class, str);
    }

    public static khp[] values() {
        return (khp[]) i.clone();
    }
}
