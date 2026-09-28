package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class wfl0 implements cnl0 {
    public final qfl0 a;

    public wfl0(qfl0 qfl0Var) {
        Charset charset = kil0.a;
        this.a = qfl0Var;
        qfl0Var.a = this;
    }

    public final void a(int i, Object obj, ill0 ill0Var) throws sfl0 {
        qfl0 qfl0Var = this.a;
        qfl0Var.g(i, 3);
        ill0Var.c((lkl0) obj, qfl0Var.a);
        qfl0Var.g(i, 4);
    }
}
