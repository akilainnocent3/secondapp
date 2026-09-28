package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pbp implements k4h {
    public final k4h a;

    public pbp(int i) {
        if ((i & 1) != 0) {
            this.a = new zv90(65496, 2, "image/jpeg");
        } else {
            this.a = new sbp();
        }
    }

    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) {
        return this.a.a(l4hVar, k620Var);
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) {
        return this.a.b(l4hVar);
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        this.a.c(j, j2);
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.a.l(m4hVar);
    }

    @Override // defpackage.k4h
    public final void release() {
        this.a.release();
    }
}
