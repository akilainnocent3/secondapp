package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class hqe {
    public static final hqe a;
    public static final hqe b;
    public static final hqe c;
    public static final /* synthetic */ hqe[] d;

    static {
        hqe hqeVar = new hqe("Up", 0);
        a = hqeVar;
        hqe hqeVar2 = new hqe("Down", 1);
        b = hqeVar2;
        hqe hqeVar3 = new hqe("Flat", 2);
        c = hqeVar3;
        d = new hqe[]{hqeVar, hqeVar2, hqeVar3};
    }

    public hqe() {
        throw null;
    }

    public static hqe valueOf(String str) {
        return (hqe) Enum.valueOf(hqe.class, str);
    }

    public static hqe[] values() {
        return (hqe[]) d.clone();
    }
}
