package defpackage;

import defpackage.jsw;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zr<T extends jsw> {
    public final kze a;
    public final ujt b;

    public zr(sug sugVar, boolean z) {
        if (z) {
            this.a = sugVar.b();
            this.b = null;
        } else {
            this.a = null;
            this.b = sugVar.a();
        }
    }

    public void a(double d) {
        throw new UnsupportedOperationException("This aggregator does not support double values.");
    }

    public void b(long j) {
        throw new UnsupportedOperationException("This aggregator does not support long values.");
    }

    public void c(long j, m21 m21Var, m0b m0bVar) {
        ujt ujtVar = this.b;
        if (ujtVar == null) {
            zkh.a("This aggregator does not support long values.");
        } else {
            ujtVar.a(j, m21Var, m0bVar);
            b(j);
        }
    }
}
