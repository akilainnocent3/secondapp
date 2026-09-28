package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class upj implements ktm {
    public final pym a;
    public final b5 b;
    public mpj c;
    public Long d;
    public final ArrayList e;

    public upj(b5 b5Var, pym pymVar) {
        pymVar.getClass();
        b5Var.getClass();
        this.a = pymVar;
        this.b = b5Var;
        this.e = new ArrayList();
    }

    @Override // defpackage.ktm
    public final void b() {
        this.c = null;
        this.e.clear();
    }

    @Override // defpackage.ktm
    public final tpj d() {
        return new tpj(this.a.d(), this);
    }

    @Override // defpackage.ktm
    public final Long e() {
        return this.d;
    }

    @Override // defpackage.ktm
    public final void f(long j, List<String> list, mpj mpjVar) {
        list.getClass();
        this.c = mpjVar;
        this.d = Long.valueOf(j);
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.addAll(list);
    }

    @Override // defpackage.ktm
    public final ArrayList g() {
        return this.e;
    }

    @Override // defpackage.ktm
    public final mpj h() {
        return this.c;
    }
}
