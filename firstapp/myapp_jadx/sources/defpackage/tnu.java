package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class tnu<I, O> extends ee<I> {
    public final fe<I> a;
    public final ytw b;

    public tnu(fe feVar, ytw ytwVar) {
        this.a = feVar;
        this.b = ytwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ee
    public final vd<I, O> a() {
        return (vd) this.b.getValue();
    }

    @Override // defpackage.ee
    public final void b(Object obj) {
        Unit unit;
        le leVar = this.a.a;
        if (leVar != null) {
            leVar.b(obj);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit != null) {
            return;
        }
        ib5.a("Launcher has not been initialized");
    }
}
