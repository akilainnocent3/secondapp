package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class vlx {
    public static final kyo a;
    public static final kyo b;
    public static final kyo c;
    public static final kyo d;

    static {
        g21 g21Var = g21.a;
        kyo.a(g21Var, "network.local.address");
        g21 g21Var2 = g21.c;
        kyo.a(g21Var2, "network.local.port");
        a = kyo.a(g21Var, "network.peer.address");
        b = kyo.a(g21Var2, "network.peer.port");
        c = kyo.a(g21Var, "network.protocol.name");
        d = kyo.a(g21Var, "network.protocol.version");
        kyo.a(g21Var, "network.transport");
        kyo.a(g21Var, "network.type");
    }
}
