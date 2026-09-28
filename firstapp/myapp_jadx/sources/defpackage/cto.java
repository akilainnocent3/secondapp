package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class cto {
    public static final cto a;
    public static final cto b;
    public static final cto c;
    public static final cto d;
    public static final cto e;
    public static final cto f;
    public static final cto i;
    public static final cto v;
    public static final /* synthetic */ cto[] w;

    static {
        cto ctoVar = new cto("HTTP_CLIENT", 0);
        a = ctoVar;
        cto ctoVar2 = new cto("HTTP_SERVER", 1);
        b = ctoVar2;
        cto ctoVar3 = new cto("DB_CLIENT", 2);
        c = ctoVar3;
        cto ctoVar4 = new cto("RPC_CLIENT", 3);
        d = ctoVar4;
        cto ctoVar5 = new cto("RPC_SERVER", 4);
        e = ctoVar5;
        cto ctoVar6 = new cto("MESSAGING_PRODUCER", 5);
        f = ctoVar6;
        cto ctoVar7 = new cto("MESSAGING_CONSUMER_RECEIVE", 6);
        i = ctoVar7;
        cto ctoVar8 = new cto("MESSAGING_CONSUMER_PROCESS", 7);
        v = ctoVar8;
        w = new cto[]{ctoVar, ctoVar2, ctoVar3, ctoVar4, ctoVar5, ctoVar6, ctoVar7, ctoVar8};
    }

    public cto() {
        throw null;
    }

    public static cto valueOf(String str) {
        return (cto) Enum.valueOf(cto.class, str);
    }

    public static cto[] values() {
        return (cto[]) w.clone();
    }
}
