package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class nmd0 implements xtm, kzm {
    public final b390 a = d390.b(0, 0, null, 7);

    @Override // defpackage.kzm
    public final Object a(mmd0 mmd0Var, x1b x1bVar) {
        Object objEmit = this.a.emit(mmd0Var, x1bVar);
        return objEmit == y5b.a ? objEmit : Unit.a;
    }

    @Override // defpackage.xtm
    public final b390 invoke() {
        return this.a;
    }
}
