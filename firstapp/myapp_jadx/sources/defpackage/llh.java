package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class llh {
    public static final llh a;
    public static final llh b;
    public static final llh c;
    public static final llh d;
    public static final llh e;
    public static final /* synthetic */ llh[] f;

    static {
        llh llhVar = new llh("Classpath", 0);
        a = llhVar;
        llh llhVar2 = new llh("Internal", 1);
        b = llhVar2;
        llh llhVar3 = new llh("External", 2);
        c = llhVar3;
        llh llhVar4 = new llh("Absolute", 3);
        d = llhVar4;
        llh llhVar5 = new llh("Local", 4);
        e = llhVar5;
        f = new llh[]{llhVar, llhVar2, llhVar3, llhVar4, llhVar5};
    }

    public llh() {
        throw null;
    }

    public static llh valueOf(String str) {
        return (llh) Enum.valueOf(llh.class, str);
    }

    public static llh[] values() {
        return (llh[]) f.clone();
    }
}
