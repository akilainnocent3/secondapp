package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class dp4 implements otm, qym {
    public final b390 a = d390.b(0, 0, null, 7);

    @Override // defpackage.qym
    public final Object a(ep4 ep4Var, x1b x1bVar) {
        Object objEmit = this.a.emit(ep4Var, x1bVar);
        return objEmit == y5b.a ? objEmit : Unit.a;
    }

    @Override // defpackage.otm
    public final b390 invoke() {
        return this.a;
    }
}
