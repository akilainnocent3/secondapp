package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class uil implements k4h {
    public final nsz a = new nsz(4);
    public final zv90 b = new zv90(-1, -1, "image/heif");

    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) {
        return this.b.a(l4hVar, k620Var);
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) throws EOFException, InterruptedIOException {
        jcd jcdVar = (jcd) l4hVar;
        jcdVar.n(4, false);
        nsz nszVar = this.a;
        nszVar.F(4);
        jcdVar.c(nszVar.a, 0, 4, false);
        if (nszVar.y() == 1718909296) {
            nszVar.F(4);
            jcdVar.c(nszVar.a, 0, 4, false);
            if (nszVar.y() == 1751476579) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        this.b.c(j, j2);
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.b.l(m4hVar);
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
