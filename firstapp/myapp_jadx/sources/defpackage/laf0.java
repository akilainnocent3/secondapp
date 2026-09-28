package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class laf0 implements zpc {
    public final zpc a;
    public final xpc b;
    public boolean c;
    public long d;

    public laf0(zpc zpcVar, xpc xpcVar) {
        this.a = zpcVar;
        this.b = xpcVar;
    }

    @Override // defpackage.zpc
    public final long a(gqc gqcVar) {
        long jA = this.a.a(gqcVar);
        this.d = jA;
        if (jA == 0) {
            return 0L;
        }
        if (gqcVar.g == -1 && jA != -1) {
            gqcVar = gqcVar.b(0L, jA);
        }
        this.c = true;
        this.b.a(gqcVar);
        return this.d;
    }

    @Override // defpackage.zpc
    public final void close() {
        xpc xpcVar = this.b;
        try {
            this.a.close();
        } finally {
            if (this.c) {
                this.c = false;
                xpcVar.close();
            }
        }
    }

    @Override // defpackage.zpc
    public final Map<String, List<String>> d() {
        return this.a.d();
    }

    @Override // defpackage.zpc
    public final void g(mrg0 mrg0Var) {
        mrg0Var.getClass();
        this.a.g(mrg0Var);
    }

    @Override // defpackage.zpc
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.tpc
    public final int read(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        int i3 = this.a.read(bArr, i, i2);
        if (i3 > 0) {
            this.b.write(bArr, i, i3);
            long j = this.d;
            if (j != -1) {
                this.d = j - ((long) i3);
            }
        }
        return i3;
    }
}
