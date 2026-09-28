package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rqe {
    public static final rqe a;
    public static final rqe b;
    public static final rqe c;
    public static final /* synthetic */ rqe[] d;

    static {
        rqe rqeVar = new rqe("Vertical", 0);
        a = rqeVar;
        rqe rqeVar2 = new rqe("Horizontal", 1);
        b = rqeVar2;
        rqe rqeVar3 = new rqe("Both", 2);
        c = rqeVar3;
        d = new rqe[]{rqeVar, rqeVar2, rqeVar3};
    }

    public rqe() {
        throw null;
    }

    public static rqe valueOf(String str) {
        return (rqe) Enum.valueOf(rqe.class, str);
    }

    public static rqe[] values() {
        return (rqe[]) d.clone();
    }
}
