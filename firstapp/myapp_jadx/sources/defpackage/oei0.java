package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class oei0 implements n26 {
    public final n26 a;
    public final uei0 b;
    public final vei0 c;
    public final pei0 d;

    public oei0(n26 n26Var, pei0 pei0Var, e8e0 e8e0Var) {
        this.a = n26Var;
        this.d = pei0Var;
        this.b = new uei0(n26Var.e(), e8e0Var);
        this.c = new vei0(n26Var.h());
    }

    @Override // defpackage.n26
    public final tcy<n26.a> b() {
        return this.a.b();
    }

    @Override // pnh0.b
    public final void d(pnh0 pnh0Var) {
        kpf0.a();
        this.d.d(pnh0Var);
    }

    @Override // defpackage.n26
    public final m16 e() {
        return this.b;
    }

    @Override // defpackage.n26
    public final m26 h() {
        return this.c;
    }

    @Override // pnh0.b
    public final void j(pnh0 pnh0Var) {
        kpf0.a();
        this.d.j(pnh0Var);
    }

    @Override // pnh0.b
    public final void k(pnh0 pnh0Var) {
        kpf0.a();
        this.d.k(pnh0Var);
    }

    @Override // defpackage.n26
    public final void l(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.n26
    public final void m(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.n26
    public final boolean o() {
        return false;
    }

    @Override // pnh0.b
    public final void q(pnh0 pnh0Var) {
        kpf0.a();
        this.d.q(pnh0Var);
    }

    @Override // defpackage.n26
    public final qis<Void> release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
