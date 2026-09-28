package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class z2h extends ds70 implements s2h {
    public d2h i;

    @Override // defpackage.ds70, defpackage.qft
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ s2h d(e21 e21Var, Object obj) {
        o(e21Var, obj);
        return this;
    }

    @Override // defpackage.ds70
    public final p340 e(m0b m0bVar, long j) {
        sgt sgtVar = this.a;
        sgtVar.getClass();
        kj1 kj1Var = kj1.c;
        return new i3h(sgtVar.b, this.d, this.e, j, oqa0.i(m0bVar).b(), this.f, this.g, this.i);
    }

    @Override // defpackage.ds70, defpackage.qft
    public final s2h g(String str) {
        super.g(str);
        return this;
    }

    @Override // defpackage.ds70, defpackage.qft
    public final s2h h() {
        this.f = 10;
        return this;
    }

    @Override // defpackage.ds70, defpackage.qft
    public final s2h i(long j) {
        super.i(j);
        return this;
    }

    @Override // defpackage.ds70
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ ds70 d(e21 e21Var, Object obj) {
        o(e21Var, obj);
        return this;
    }

    @Override // defpackage.ds70
    public final ds70 k(dvh0 dvh0Var) {
        this.g = dvh0Var;
        return this;
    }

    @Override // defpackage.ds70
    /* JADX INFO: renamed from: l */
    public final ds70 g(String str) {
        super.g(str);
        return this;
    }

    @Override // defpackage.ds70
    /* JADX INFO: renamed from: m */
    public final ds70 h() {
        this.f = 10;
        return this;
    }

    @Override // defpackage.ds70
    /* JADX INFO: renamed from: n */
    public final ds70 i(long j) {
        super.i(j);
        return this;
    }

    public final void o(e21 e21Var, Object obj) {
        if (e21Var == null || e21Var.getKey().isEmpty() || obj == null) {
            return;
        }
        syo syoVarE = syo.e(e21Var);
        if (syoVarE.b.isEmpty()) {
            return;
        }
        d2h d2hVar = this.i;
        if (d2hVar == null) {
            kj1 kj1Var = this.b;
            d2h d2hVar2 = new d2h(kj1Var.b(), kj1Var.a());
            this.i = d2hVar2;
            d2hVar = d2hVar2;
        }
        d2hVar.put(syoVarE, obj);
    }

    @Override // defpackage.ds70, defpackage.qft
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ qft d(e21 e21Var, Object obj) {
        o(e21Var, obj);
        return this;
    }

    @Override // defpackage.ds70, defpackage.qft
    public final qft g(String str) {
        super.g(str);
        return this;
    }

    @Override // defpackage.ds70, defpackage.qft
    public final qft i(long j) {
        super.i(j);
        return this;
    }

    @Override // defpackage.ds70, defpackage.qft
    public final qft h() {
        this.f = 10;
        return this;
    }
}
