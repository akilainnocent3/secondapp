package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ne implements tse {
    public final /* synthetic */ fe a;

    public ne(fe feVar) {
        this.a = feVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        Unit unit;
        le leVar = this.a.a;
        if (leVar != null) {
            leVar.c();
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
