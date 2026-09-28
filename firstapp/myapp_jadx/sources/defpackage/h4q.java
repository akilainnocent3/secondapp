package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h4q {
    public static final h4q a;
    public static final h4q b;
    public static final h4q c;
    public static final h4q d;
    public static final /* synthetic */ h4q[] e;

    static {
        h4q h4qVar = new h4q("BeforeEntrance", 0);
        a = h4qVar;
        h4q h4qVar2 = new h4q("Entering", 1);
        b = h4qVar2;
        h4q h4qVar3 = new h4q("Settled", 2);
        c = h4qVar3;
        h4q h4qVar4 = new h4q("Leaving", 3);
        d = h4qVar4;
        e = new h4q[]{h4qVar, h4qVar2, h4qVar3, h4qVar4};
    }

    public h4q() {
        throw null;
    }

    public static h4q valueOf(String str) {
        return (h4q) Enum.valueOf(h4q.class, str);
    }

    public static h4q[] values() {
        return (h4q[]) e.clone();
    }
}
