package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class uqa0 {
    public static final uqa0 b;
    public static final uqa0 c;
    public static final uqa0 d;
    public static final uqa0 e;
    public static final uqa0 f;
    public static final uqa0 g;
    public static final uqa0 h;
    public static final uqa0 i;
    public static final uqa0 j;
    public static final uqa0 k;
    public static final uqa0 l;
    public final nbd a;

    static {
        nbd nbdVar = new nbd("opentelemetry-traces-span-key-kind-server");
        nbd nbdVar2 = new nbd("opentelemetry-traces-span-key-kind-client");
        nbd nbdVar3 = new nbd("opentelemetry-traces-span-key-kind-consumer");
        nbd nbdVar4 = new nbd("opentelemetry-traces-span-key-kind-producer");
        nbd nbdVar5 = new nbd("opentelemetry-traces-span-key-http-server");
        nbd nbdVar6 = new nbd("opentelemetry-traces-span-key-rpc-server");
        nbd nbdVar7 = new nbd("opentelemetry-traces-span-key-http-client");
        nbd nbdVar8 = new nbd("opentelemetry-traces-span-key-rpc-client");
        nbd nbdVar9 = new nbd("opentelemetry-traces-span-key-db-client");
        nbd nbdVar10 = new nbd("opentelemetry-traces-span-key-producer");
        nbd nbdVar11 = new nbd("opentelemetry-traces-span-key-consumer-receive");
        b = new uqa0(nbdVar);
        c = new uqa0(nbdVar2);
        d = new uqa0(nbdVar3);
        e = new uqa0(nbdVar4);
        f = new uqa0(nbdVar5);
        g = new uqa0(nbdVar6);
        h = new uqa0(nbdVar7);
        i = new uqa0(nbdVar8);
        j = new uqa0(nbdVar9);
        k = new uqa0(nbdVar10);
        l = new uqa0(nbdVar11);
    }

    public uqa0(nbd nbdVar) {
        this.a = nbdVar;
    }

    public final String toString() {
        return this.a.a;
    }
}
