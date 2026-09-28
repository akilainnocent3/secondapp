package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class es70 implements ogt {
    public static final ogt f = ((rgt) mf9.a(wdd.a, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).d("noop");
    public static final boolean g;
    public final sgt a;
    public final oso b;
    public volatile boolean c;
    public volatile int d;
    public volatile boolean e;

    static {
        boolean z;
        try {
            g2h.a aVar = g2h.a;
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        g = z;
    }

    public es70(sgt sgtVar, oso osoVar, nj1 nj1Var) {
        this.a = sgtVar;
        this.b = osoVar;
        this.c = nj1Var.b();
        this.d = nj1Var.a();
        this.e = nj1Var.c();
    }

    @Override // defpackage.ogt
    public qft a() {
        if (!this.c) {
            return f.a();
        }
        boolean z = g;
        sgt sgtVar = this.a;
        oso osoVar = this.b;
        return z ? new z2h(sgtVar, osoVar, this) : new ds70(sgtVar, osoVar, this);
    }
}
