package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class vei0 extends bui {
    public final String b;
    public int c;

    public vei0(m26 m26Var) {
        super(m26Var);
        this.b = "virtual-" + m26Var.d() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.bui, defpackage.l26
    public final int c() {
        return o(0);
    }

    @Override // defpackage.bui, defpackage.m26
    public final String d() {
        return this.b;
    }

    @Override // defpackage.bui, defpackage.l26
    public final int o(int i) {
        return lsg0.j(this.a.o(i) - this.c);
    }
}
