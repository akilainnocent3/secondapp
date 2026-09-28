package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class dqa0 implements nbn {
    public final blh a;
    public final nbn.a b;
    public final Object c = new Object();
    public boolean d;
    public final cc5 e;

    public dqa0(cc5 cc5Var, blh blhVar, nbn.a aVar) {
        this.a = blhVar;
        this.b = aVar;
        this.e = cc5Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            this.d = true;
            cc5 cc5Var = this.e;
            if (cc5Var != null) {
                try {
                    cc5Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.nbn
    public final blh getFileSystem() {
        return this.a;
    }

    @Override // defpackage.nbn
    public final nbn.a p() {
        return this.b;
    }

    @Override // defpackage.nbn
    public final cc5 source() {
        cc5 cc5Var;
        synchronized (this.c) {
            try {
                if (this.d) {
                    throw new IllegalStateException("closed");
                }
                cc5Var = this.e;
                if (cc5Var == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cc5Var;
    }

    @Override // defpackage.nbn
    public final cxz u1() {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }
}
