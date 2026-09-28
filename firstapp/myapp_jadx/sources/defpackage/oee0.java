package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class oee0 extends h5d implements jee0 {
    public jee0 d;
    public long e;

    @Override // defpackage.jee0
    public final int a(long j) {
        jee0 jee0Var = this.d;
        jee0Var.getClass();
        return jee0Var.a(j - this.e);
    }

    @Override // defpackage.jee0
    public final List<j4c> b(long j) {
        jee0 jee0Var = this.d;
        jee0Var.getClass();
        return jee0Var.b(j - this.e);
    }

    @Override // defpackage.jee0
    public final long c(int i) {
        jee0 jee0Var = this.d;
        jee0Var.getClass();
        return jee0Var.c(i) + this.e;
    }

    @Override // defpackage.jee0
    public final int d() {
        jee0 jee0Var = this.d;
        jee0Var.getClass();
        return jee0Var.d();
    }

    @Override // defpackage.h5d
    public final void j() {
        super.j();
        this.d = null;
    }
}
