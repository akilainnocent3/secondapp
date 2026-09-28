package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class qsw implements psw {
    public final b390 a = d390.b(0, 16, pb5.b, 1);

    @Override // defpackage.psw
    public final Object a(xxo xxoVar, v1b<? super Unit> v1bVar) {
        Object objEmit = this.a.emit(xxoVar, v1bVar);
        return objEmit == y5b.a ? objEmit : Unit.a;
    }

    @Override // defpackage.psw
    public final b390 b() {
        return this.a;
    }

    @Override // defpackage.psw
    public final boolean c(xxo xxoVar) {
        return this.a.a(xxoVar);
    }
}
