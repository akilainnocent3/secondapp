package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class dkh implements nbn {
    public final cxz a;
    public final blh b;
    public final String c;
    public final AutoCloseable d;
    public final Object e = new Object();
    public boolean f;
    public y740 i;

    public dkh(cxz cxzVar, blh blhVar, String str, AutoCloseable autoCloseable) {
        this.a = cxzVar;
        this.b = blhVar;
        this.c = str;
        this.d = autoCloseable;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        AutoCloseable autoCloseable;
        synchronized (this.e) {
            this.f = true;
            y740 y740Var = this.i;
            if (y740Var != null) {
                try {
                    y740Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                autoCloseable = this.d;
                if (autoCloseable != null) {
                    try {
                        zx90.a(autoCloseable);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
                Unit unit = Unit.a;
            } else {
                autoCloseable = this.d;
                if (autoCloseable != null) {
                    zx90.a(autoCloseable);
                }
                Unit unit2 = Unit.a;
            }
            throw th;
        }
    }

    @Override // defpackage.nbn
    public final blh getFileSystem() {
        return this.b;
    }

    @Override // defpackage.nbn
    public final nbn.a p() {
        return null;
    }

    @Override // defpackage.nbn
    public final cc5 source() {
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            y740 y740Var = this.i;
            if (y740Var != null) {
                return y740Var;
            }
            y740 y740VarB = z7b.b(this.b.source(this.a));
            this.i = y740VarB;
            return y740VarB;
        }
    }

    @Override // defpackage.nbn
    public final cxz u1() {
        cxz cxzVar;
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            cxzVar = this.a;
        }
        return cxzVar;
    }
}
