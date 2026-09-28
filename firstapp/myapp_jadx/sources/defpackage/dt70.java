package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class dt70 implements zig0 {
    public static final zig0 d = did.a.d("noop");
    public static final boolean e;
    public final cjg0 a;
    public final oso b;
    public volatile boolean c;

    static {
        boolean z;
        try {
            int i = l2h.a;
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        e = z;
    }

    public dt70(cjg0 cjg0Var, oso osoVar, ll1 ll1Var) {
        this.a = cjg0Var;
        this.b = osoVar;
        this.c = ll1Var.a();
    }

    @Override // defpackage.zig0
    public qqa0 a(String str) {
        if (!this.c) {
            return d.a(str);
        }
        if (str == null || str.trim().isEmpty()) {
            str = "<unspecified span name>";
        }
        if (this.a.h != null) {
            return d.a(str);
        }
        boolean z = e;
        oso osoVar = this.b;
        cjg0 cjg0Var = this.a;
        if (z) {
            cjg0Var.getClass();
            return new j3h(str, osoVar, cjg0Var, ara0.a);
        }
        cjg0Var.getClass();
        return new ct70(str, osoVar, cjg0Var, ara0.a);
    }
}
