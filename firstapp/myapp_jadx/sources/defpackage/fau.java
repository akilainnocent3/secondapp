package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class fau {
    public static final fau a;
    public static final fau b;
    public static final fau c;
    public static final fau d;
    public static final /* synthetic */ fau[] e;

    static {
        fau fauVar = new fau("NoRewardNoTicket", 0);
        a = fauVar;
        fau fauVar2 = new fau("NoRewardHasTicket", 1);
        b = fauVar2;
        fau fauVar3 = new fau("HasRewardNoTicket", 2);
        c = fauVar3;
        fau fauVar4 = new fau("HasRewardHasTicket", 3);
        d = fauVar4;
        e = new fau[]{fauVar, fauVar2, fauVar3, fauVar4};
    }

    public fau() {
        throw null;
    }

    public static fau valueOf(String str) {
        return (fau) Enum.valueOf(fau.class, str);
    }

    public static fau[] values() {
        return (fau[]) e.clone();
    }
}
