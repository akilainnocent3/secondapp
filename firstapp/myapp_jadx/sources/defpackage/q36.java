package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q36 implements o16.a {
    public final StringBuilder a = new StringBuilder();
    public final Object b;
    public int c;
    public final qw5 d;
    public final HashMap e;
    public int f;

    public static class a {
        public n26.a a = null;
        public final od80 b;
        public final qx5.c c;
        public final qx5.b d;

        public a(od80 od80Var, qx5.c cVar, qx5.b bVar) {
            this.b = od80Var;
            this.c = cVar;
            this.d = bVar;
        }
    }

    public q36(qw5 qw5Var) {
        Object obj = new Object();
        this.b = obj;
        this.e = new HashMap();
        this.c = 1;
        synchronized (obj) {
            this.d = qw5Var;
            this.f = this.c;
        }
    }

    public static void d(qx5 qx5Var, n26.a aVar) {
        if (sig0.b()) {
            sig0.c(aVar.ordinal(), "CX:State[" + qx5Var + "]");
        }
    }

    @Override // o16.a
    public final void a(int i, int i2) {
        synchronized (this.b) {
            boolean z = true;
            this.c = i2 == 2 ? 2 : 1;
            boolean z2 = i != 2 && i2 == 2;
            if (i != 2 || i2 == 2) {
                z = false;
            }
            if (z2 || z) {
                c();
            }
        }
    }

    public final a b(String str) {
        HashMap map = this.e;
        for (qz5 qz5Var : map.keySet()) {
            if (str.equals(((m26) qz5Var.a()).d())) {
                return (a) map.get(qz5Var);
            }
        }
        return null;
    }

    public final void c() {
        boolean zF = pgt.f("CameraStateRegistry");
        StringBuilder sb = this.a;
        if (zF) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.e.entrySet()) {
            if (pgt.f("CameraStateRegistry")) {
                sb.append(String.format(Locale.US, "%-45s%-22s\n", ((qz5) entry.getKey()).toString(), ((a) entry.getValue()).a != null ? ((a) entry.getValue()).a.toString() : "UNKNOWN"));
            }
            n26.a aVar = ((a) entry.getValue()).a;
            if (aVar != null && aVar.a) {
                i++;
            }
        }
        if (pgt.f("CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb.append(n36.a("Open count: ", i, this.c, " (Max allowed: ", ")"));
            pgt.a("CameraStateRegistry", sb.toString());
        }
        this.f = Math.max(this.c - i, 0);
    }

    public final boolean e(qx5 qx5Var) {
        boolean z;
        synchronized (this.b) {
            try {
                a aVar = (a) this.e.get(qx5Var);
                km20.f(aVar, "Camera must first be registered with registerCamera()");
                z = true;
                if (pgt.f("CameraStateRegistry")) {
                    this.a.setLength(0);
                    StringBuilder sb = this.a;
                    Locale locale = Locale.US;
                    int i = this.f;
                    n26.a aVar2 = aVar.a;
                    boolean z2 = aVar2 != null && aVar2.a;
                    sb.append("tryOpenCamera(" + qx5Var + ") [Available Cameras: " + i + ", Already Open: " + z2 + " (Previous state: " + aVar.a + ")]");
                }
                if (this.f > 0) {
                    n26.a aVar3 = n26.a.OPENING;
                    aVar.a = aVar3;
                    d(qx5Var, aVar3);
                } else {
                    n26.a aVar4 = aVar.a;
                    if (aVar4 != null && aVar4.a) {
                        n26.a aVar5 = n26.a.OPENING;
                        aVar.a = aVar5;
                        d(qx5Var, aVar5);
                    } else {
                        z = false;
                    }
                }
                if (pgt.f("CameraStateRegistry")) {
                    StringBuilder sb2 = this.a;
                    Locale locale2 = Locale.US;
                    sb2.append(" --> ".concat(z ? "SUCCESS" : "FAIL"));
                    pgt.a("CameraStateRegistry", this.a.toString());
                }
                if (z) {
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean f(String str, String str2) {
        synchronized (this.b) {
            try {
                boolean z = true;
                if (this.d.b() != 2) {
                    return true;
                }
                a aVarB = b(str);
                n26.a aVar = aVarB != null ? aVarB.a : null;
                a aVarB2 = str2 != null ? b(str2) : null;
                n26.a aVar2 = aVarB2 != null ? aVarB2.a : null;
                n26.a aVar3 = n26.a.OPEN;
                boolean z2 = aVar3.equals(aVar) || n26.a.CONFIGURED.equals(aVar);
                boolean z3 = aVar3.equals(aVar2) || n26.a.CONFIGURED.equals(aVar2);
                if (!z2 || !z3) {
                    z = false;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
